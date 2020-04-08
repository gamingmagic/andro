package org.apache.http.conn.ssl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import javax.naming.InvalidNameException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.DomainType;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.conn.util.PublicSuffixMatcher;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
public final class DefaultHostnameVerifier implements HostnameVerifier {
    private final Log log;
    private final PublicSuffixMatcher publicSuffixMatcher;

    enum HostNameType {
        IPv4(7),
        IPv6(7),
        DNS(2);
        
        final int subjectType;

        private HostNameType(int i) {
            this.subjectType = i;
        }
    }

    public DefaultHostnameVerifier(PublicSuffixMatcher publicSuffixMatcher2) {
        this.log = LogFactory.getLog(getClass());
        this.publicSuffixMatcher = publicSuffixMatcher2;
    }

    public DefaultHostnameVerifier() {
        this(null);
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e) {
            if (this.log.isDebugEnabled()) {
                this.log.debug(e.getMessage(), e);
            }
            return false;
        }
    }

    public final void verify(String str, X509Certificate x509Certificate) {
        HostNameType determineHostFormat = determineHostFormat(str);
        List subjectAltNames = getSubjectAltNames(x509Certificate);
        if (subjectAltNames == null || subjectAltNames.isEmpty()) {
            String extractCN = extractCN(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
            if (extractCN == null) {
                throw new SSLException("Certificate subject for <" + str + "> doesn't contain a common name and does not have alternative names");
            }
            matchCN(str, extractCN, this.publicSuffixMatcher);
            return;
        }
        switch (determineHostFormat) {
            case IPv4:
                matchIPAddress(str, subjectAltNames);
                return;
            case IPv6:
                matchIPv6Address(str, subjectAltNames);
                return;
            default:
                matchDNSName(str, subjectAltNames, this.publicSuffixMatcher);
                return;
        }
    }

    static void matchIPAddress(String str, List<SubjectName> list) {
        int i = 0;
        while (i < list.size()) {
            SubjectName subjectName = (SubjectName) list.get(i);
            if (subjectName.getType() != 7 || !str.equals(subjectName.getValue())) {
                i++;
            } else {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    static void matchIPv6Address(String str, List<SubjectName> list) {
        String normaliseAddress = normaliseAddress(str);
        int i = 0;
        while (i < list.size()) {
            SubjectName subjectName = (SubjectName) list.get(i);
            if (subjectName.getType() != 7 || !normaliseAddress.equals(normaliseAddress(subjectName.getValue()))) {
                i++;
            } else {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    static void matchDNSName(String str, List<SubjectName> list, PublicSuffixMatcher publicSuffixMatcher2) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < list.size()) {
            SubjectName subjectName = (SubjectName) list.get(i);
            if (subjectName.getType() != 2 || !matchIdentityStrict(lowerCase, subjectName.getValue().toLowerCase(Locale.ROOT), publicSuffixMatcher2)) {
                i++;
            } else {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    static void matchCN(String str, String str2, PublicSuffixMatcher publicSuffixMatcher2) {
        if (!matchIdentityStrict(str.toLowerCase(Locale.ROOT), str2.toLowerCase(Locale.ROOT), publicSuffixMatcher2)) {
            throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
        }
    }

    static boolean matchDomainRoot(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        return str.endsWith(str2) && (str.length() == str2.length() || str.charAt((str.length() - str2.length()) + -1) == '.');
    }

    private static boolean matchIdentity(String str, String str2, PublicSuffixMatcher publicSuffixMatcher2, boolean z) {
        if (publicSuffixMatcher2 != null && str.contains(".") && !matchDomainRoot(str, publicSuffixMatcher2.getDomainRoot(str2, DomainType.ICANN))) {
            return false;
        }
        int indexOf = str2.indexOf(42);
        if (indexOf == -1) {
            return str.equalsIgnoreCase(str2);
        }
        String substring = str2.substring(0, indexOf);
        String substring2 = str2.substring(indexOf + 1);
        if (!substring.isEmpty() && !str.startsWith(substring)) {
            return false;
        }
        if (!substring2.isEmpty() && !str.endsWith(substring2)) {
            return false;
        }
        if (!z || !str.substring(substring.length(), str.length() - substring2.length()).contains(".")) {
            return true;
        }
        return false;
    }

    static boolean matchIdentity(String str, String str2, PublicSuffixMatcher publicSuffixMatcher2) {
        return matchIdentity(str, str2, publicSuffixMatcher2, false);
    }

    static boolean matchIdentity(String str, String str2) {
        return matchIdentity(str, str2, null, false);
    }

    static boolean matchIdentityStrict(String str, String str2, PublicSuffixMatcher publicSuffixMatcher2) {
        return matchIdentity(str, str2, publicSuffixMatcher2, true);
    }

    static boolean matchIdentityStrict(String str, String str2) {
        return matchIdentity(str, str2, null, true);
    }

    static String extractCN(String str) {
        if (str == null) {
            return null;
        }
        try {
            List rdns = new LdapName(str).getRdns();
            for (int size = rdns.size() - 1; size >= 0; size--) {
                Attribute attribute = ((Rdn) rdns.get(size)).toAttributes().get("cn");
                if (attribute != null) {
                    try {
                        Object obj = attribute.get();
                        if (obj != null) {
                            return obj.toString();
                        }
                    } catch (NoSuchElementException unused) {
                        continue;
                    } catch (NamingException unused2) {
                        continue;
                    }
                }
            }
            return null;
        } catch (InvalidNameException unused3) {
            throw new SSLException(str + " is not a valid X500 distinguished name");
        }
    }

    static HostNameType determineHostFormat(String str) {
        if (InetAddressUtils.isIPv4Address(str)) {
            return HostNameType.IPv4;
        }
        String str2 = str;
        if (str.startsWith("[") && str2.endsWith("]")) {
            str2 = str.substring(1, str.length() - 1);
        }
        if (InetAddressUtils.isIPv6Address(str2)) {
            return HostNameType.IPv6;
        }
        return HostNameType.DNS;
    }

    static List<SubjectName> getSubjectAltNames(X509Certificate x509Certificate) {
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List list : subjectAlternativeNames) {
                Integer num = list.size() >= 2 ? (Integer) list.get(0) : null;
                if (num != null && (num.intValue() == 2 || num.intValue() == 7)) {
                    Object obj = list.get(1);
                    if (obj instanceof String) {
                        arrayList.add(new SubjectName((String) obj, num.intValue()));
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    static String normaliseAddress(String str) {
        if (str == null) {
            return str;
        }
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
            return str;
        }
    }
}

package org.apache.http.conn.util;

import java.net.IDN;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
public final class PublicSuffixMatcher {
    private final Map<String, DomainType> exceptions;
    private final Map<String, DomainType> rules;

    public PublicSuffixMatcher(Collection<String> collection, Collection<String> collection2) {
        this(DomainType.UNKNOWN, collection, collection2);
    }

    public PublicSuffixMatcher(DomainType domainType, Collection<String> collection, Collection<String> collection2) {
        Args.notNull(domainType, "Domain type");
        Args.notNull(collection, "Domain suffix rules");
        this.rules = new ConcurrentHashMap(collection.size());
        for (String put : collection) {
            this.rules.put(put, domainType);
        }
        this.exceptions = new ConcurrentHashMap();
        if (collection2 != null) {
            for (String put2 : collection2) {
                this.exceptions.put(put2, domainType);
            }
        }
    }

    public PublicSuffixMatcher(Collection<PublicSuffixList> collection) {
        Args.notNull(collection, "Domain suffix lists");
        this.rules = new ConcurrentHashMap();
        this.exceptions = new ConcurrentHashMap();
        for (PublicSuffixList publicSuffixList : collection) {
            DomainType type = publicSuffixList.getType();
            for (String put : publicSuffixList.getRules()) {
                this.rules.put(put, type);
            }
            List<String> exceptions2 = publicSuffixList.getExceptions();
            if (exceptions2 != null) {
                for (String put2 : exceptions2) {
                    this.exceptions.put(put2, type);
                }
            }
        }
    }

    private static boolean hasEntry(Map<String, DomainType> map, String str, DomainType domainType) {
        if (map == null) {
            return false;
        }
        DomainType domainType2 = (DomainType) map.get(str);
        if (domainType2 == null) {
            return false;
        }
        return domainType == null || domainType2.equals(domainType);
    }

    private boolean hasRule(String str, DomainType domainType) {
        return hasEntry(this.rules, str, domainType);
    }

    private boolean hasException(String str, DomainType domainType) {
        return hasEntry(this.exceptions, str, domainType);
    }

    public final String getDomainRoot(String str) {
        return getDomainRoot(str, null);
    }

    public final String getDomainRoot(String str, DomainType domainType) {
        if (str == null) {
            return null;
        }
        if (str.startsWith(".")) {
            return null;
        }
        String str2 = null;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        while (lowerCase != null) {
            if (!hasException(IDN.toUnicode(lowerCase), domainType)) {
                if (hasRule(IDN.toUnicode(lowerCase), domainType)) {
                    break;
                }
                int indexOf = lowerCase.indexOf(46);
                String substring = indexOf != -1 ? lowerCase.substring(indexOf + 1) : null;
                if (substring != null && hasRule("*." + IDN.toUnicode(substring), domainType)) {
                    break;
                }
                if (indexOf != -1) {
                    str2 = lowerCase;
                }
                lowerCase = substring;
            } else {
                return lowerCase;
            }
        }
        return str2;
    }

    public final boolean matches(String str) {
        return matches(str, null);
    }

    public final boolean matches(String str, DomainType domainType) {
        if (str == null) {
            return false;
        }
        return getDomainRoot(str.startsWith(".") ? str.substring(1) : str, domainType) == null;
    }
}

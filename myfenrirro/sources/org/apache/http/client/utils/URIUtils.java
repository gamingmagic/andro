package org.apache.http.client.utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

public class URIUtils {
    @Deprecated
    public static URI createURI(String str, String str2, int i, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(':');
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return new URI(sb.toString());
    }

    public static URI rewriteURI(URI uri, HttpHost httpHost, boolean z) {
        Args.notNull(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        URIBuilder uRIBuilder = new URIBuilder(uri);
        if (httpHost != null) {
            uRIBuilder.setScheme(httpHost.getSchemeName());
            uRIBuilder.setHost(httpHost.getHostName());
            uRIBuilder.setPort(httpHost.getPort());
        } else {
            uRIBuilder.setScheme(null);
            uRIBuilder.setHost(null);
            uRIBuilder.setPort(-1);
        }
        if (z) {
            uRIBuilder.setFragment(null);
        }
        if (TextUtils.isEmpty(uRIBuilder.getPath())) {
            uRIBuilder.setPath("/");
        }
        return uRIBuilder.build();
    }

    public static URI rewriteURI(URI uri, HttpHost httpHost) {
        return rewriteURI(uri, httpHost, false);
    }

    public static URI rewriteURI(URI uri) {
        Args.notNull(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        URIBuilder uRIBuilder = new URIBuilder(uri);
        URIBuilder uRIBuilder2 = uRIBuilder;
        if (uRIBuilder.getUserInfo() != null) {
            uRIBuilder2.setUserInfo(null);
        }
        if (TextUtils.isEmpty(uRIBuilder2.getPath())) {
            uRIBuilder2.setPath("/");
        }
        if (uRIBuilder2.getHost() != null) {
            uRIBuilder2.setHost(uRIBuilder2.getHost().toLowerCase(Locale.ROOT));
        }
        uRIBuilder2.setFragment(null);
        return uRIBuilder2.build();
    }

    public static URI rewriteURIForRoute(URI uri, RouteInfo routeInfo) {
        if (uri == null) {
            return null;
        }
        if (routeInfo.getProxyHost() == null || routeInfo.isTunnelled()) {
            if (uri.isAbsolute()) {
                return rewriteURI(uri, null, true);
            }
            return rewriteURI(uri);
        } else if (!uri.isAbsolute()) {
            return rewriteURI(uri, routeInfo.getTargetHost(), true);
        } else {
            return rewriteURI(uri);
        }
    }

    public static URI resolve(URI uri, String str) {
        return resolve(uri, URI.create(str));
    }

    public static URI resolve(URI uri, URI uri2) {
        URI uri3;
        Args.notNull(uri, "Base URI");
        Args.notNull(uri2, "Reference URI");
        String aSCIIString = uri2.toASCIIString();
        if (aSCIIString.startsWith("?")) {
            String aSCIIString2 = uri.toASCIIString();
            int indexOf = aSCIIString2.indexOf(63);
            return URI.create((indexOf >= 0 ? aSCIIString2.substring(0, indexOf) : aSCIIString2) + aSCIIString);
        }
        if (aSCIIString.isEmpty()) {
            String aSCIIString3 = uri.resolve(URI.create("#")).toASCIIString();
            uri3 = URI.create(aSCIIString3.substring(0, aSCIIString3.indexOf(35)));
        } else {
            uri3 = uri.resolve(uri2);
        }
        try {
            return normalizeSyntax(uri3);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    static URI normalizeSyntax(URI uri) {
        if (uri.isOpaque() || uri.getAuthority() == null) {
            return uri;
        }
        Args.check(uri.isAbsolute(), "Base URI must be absolute");
        URIBuilder uRIBuilder = new URIBuilder(uri);
        URIBuilder uRIBuilder2 = uRIBuilder;
        String path = uRIBuilder.getPath();
        if (path != null && !path.equals("/")) {
            String[] split = path.split("/");
            Stack stack = new Stack();
            for (String str : split) {
                if (!str.isEmpty() && !".".equals(str)) {
                    if (!"..".equals(str)) {
                        stack.push(str);
                    } else if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = stack.iterator();
            while (it.hasNext()) {
                sb.append('/').append((String) it.next());
            }
            if (path.lastIndexOf(47) == path.length() - 1) {
                sb.append('/');
            }
            uRIBuilder2.setPath(sb.toString());
        }
        if (uRIBuilder2.getScheme() != null) {
            uRIBuilder2.setScheme(uRIBuilder2.getScheme().toLowerCase(Locale.ROOT));
        }
        if (uRIBuilder2.getHost() != null) {
            uRIBuilder2.setHost(uRIBuilder2.getHost().toLowerCase(Locale.ROOT));
        }
        return uRIBuilder2.build();
    }

    public static HttpHost extractHost(URI uri) {
        if (uri == null) {
            return null;
        }
        HttpHost httpHost = null;
        if (uri.isAbsolute()) {
            int port = uri.getPort();
            String host = uri.getHost();
            if (host == null) {
                host = uri.getAuthority();
                if (host != null) {
                    int indexOf = host.indexOf(64);
                    if (indexOf >= 0) {
                        if (host.length() > indexOf + 1) {
                            host = host.substring(indexOf + 1);
                        } else {
                            host = null;
                        }
                    }
                    if (host != null) {
                        int indexOf2 = host.indexOf(58);
                        if (indexOf2 >= 0) {
                            int i = indexOf2 + 1;
                            int i2 = 0;
                            int i3 = i;
                            while (i3 < host.length() && Character.isDigit(host.charAt(i3))) {
                                i2++;
                                i3++;
                            }
                            if (i2 > 0) {
                                try {
                                    port = Integer.parseInt(host.substring(i, i + i2));
                                } catch (NumberFormatException unused) {
                                }
                            }
                            host = host.substring(0, indexOf2);
                        }
                    }
                }
            }
            String scheme = uri.getScheme();
            if (!TextUtils.isBlank(host)) {
                try {
                    httpHost = new HttpHost(host, port, scheme);
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        return httpHost;
    }

    public static URI resolve(URI uri, HttpHost httpHost, List<URI> list) {
        URIBuilder uRIBuilder;
        Args.notNull(uri, "Request URI");
        if (list == null || list.isEmpty()) {
            uRIBuilder = new URIBuilder(uri);
        } else {
            uRIBuilder = new URIBuilder((URI) list.get(list.size() - 1));
            String fragment = uRIBuilder.getFragment();
            int size = list.size() - 1;
            while (fragment == null && size >= 0) {
                fragment = ((URI) list.get(size)).getFragment();
                size--;
            }
            uRIBuilder.setFragment(fragment);
        }
        if (uRIBuilder.getFragment() == null) {
            uRIBuilder.setFragment(uri.getFragment());
        }
        if (httpHost != null && !uRIBuilder.isAbsolute()) {
            uRIBuilder.setScheme(httpHost.getSchemeName());
            uRIBuilder.setHost(httpHost.getHostName());
            uRIBuilder.setPort(httpHost.getPort());
        }
        return uRIBuilder.build();
    }

    private URIUtils() {
    }
}

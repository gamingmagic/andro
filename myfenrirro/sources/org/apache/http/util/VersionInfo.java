package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

public class VersionInfo {
    public static final String PROPERTY_MODULE = "info.module";
    public static final String PROPERTY_RELEASE = "info.release";
    public static final String PROPERTY_TIMESTAMP = "info.timestamp";
    public static final String UNAVAILABLE = "UNAVAILABLE";
    public static final String VERSION_PROPERTY_FILE = "version.properties";
    private final String infoClassloader;
    private final String infoModule;
    private final String infoPackage;
    private final String infoRelease;
    private final String infoTimestamp;

    protected VersionInfo(String str, String str2, String str3, String str4, String str5) {
        Args.notNull(str, "Package identifier");
        this.infoPackage = str;
        this.infoModule = str2 != null ? str2 : UNAVAILABLE;
        this.infoRelease = str3 != null ? str3 : UNAVAILABLE;
        this.infoTimestamp = str4 != null ? str4 : UNAVAILABLE;
        this.infoClassloader = str5 != null ? str5 : UNAVAILABLE;
    }

    public final String getPackage() {
        return this.infoPackage;
    }

    public final String getModule() {
        return this.infoModule;
    }

    public final String getRelease() {
        return this.infoRelease;
    }

    public final String getTimestamp() {
        return this.infoTimestamp;
    }

    public final String getClassloader() {
        return this.infoClassloader;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.infoPackage.length() + 20 + this.infoModule.length() + this.infoRelease.length() + this.infoTimestamp.length() + this.infoClassloader.length());
        sb.append("VersionInfo(").append(this.infoPackage).append(':').append(this.infoModule);
        if (!UNAVAILABLE.equals(this.infoRelease)) {
            sb.append(':').append(this.infoRelease);
        }
        if (!UNAVAILABLE.equals(this.infoTimestamp)) {
            sb.append(':').append(this.infoTimestamp);
        }
        sb.append(')');
        if (!UNAVAILABLE.equals(this.infoClassloader)) {
            sb.append('@').append(this.infoClassloader);
        }
        return sb.toString();
    }

    public static VersionInfo[] loadVersionInfo(String[] strArr, ClassLoader classLoader) {
        Args.notNull(strArr, "Package identifier array");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String loadVersionInfo : strArr) {
            VersionInfo loadVersionInfo2 = loadVersionInfo(loadVersionInfo, classLoader);
            if (loadVersionInfo2 != null) {
                arrayList.add(loadVersionInfo2);
            }
        }
        return (VersionInfo[]) arrayList.toArray(new VersionInfo[arrayList.size()]);
    }

    public static VersionInfo loadVersionInfo(String str, ClassLoader classLoader) {
        InputStream resourceAsStream;
        Args.notNull(str, "Package identifier");
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        Properties properties = null;
        try {
            resourceAsStream = classLoader.getResourceAsStream(str.replace('.', '/') + "/version.properties");
            if (resourceAsStream != null) {
                Properties properties2 = new Properties();
                properties2.load(resourceAsStream);
                properties = properties2;
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            resourceAsStream.close();
            throw th;
        }
        if (properties != null) {
            return fromMap(str, properties, classLoader);
        }
        return null;
    }

    protected static VersionInfo fromMap(String str, Map<?, ?> map, ClassLoader classLoader) {
        Args.notNull(str, "Package identifier");
        String str2 = null;
        String str3 = null;
        String str4 = null;
        if (map != null) {
            str2 = (String) map.get(PROPERTY_MODULE);
            if (str2 != null && str2.length() <= 0) {
                str2 = null;
            }
            str3 = (String) map.get(PROPERTY_RELEASE);
            if (str3 != null && (str3.length() <= 0 || str3.equals("${pom.version}"))) {
                str3 = null;
            }
            str4 = (String) map.get(PROPERTY_TIMESTAMP);
            if (str4 != null && (str4.length() <= 0 || str4.equals("${mvn.timestamp}"))) {
                str4 = null;
            }
        }
        String str5 = null;
        if (classLoader != null) {
            str5 = classLoader.toString();
        }
        return new VersionInfo(str, str2, str3, str4, str5);
    }

    public static String getUserAgent(String str, String str2, Class<?> cls) {
        VersionInfo loadVersionInfo = loadVersionInfo(str2, cls.getClassLoader());
        return String.format("%s/%s (Java/%s)", new Object[]{str, loadVersionInfo != null ? loadVersionInfo.getRelease() : UNAVAILABLE, System.getProperty("java.version")});
    }
}

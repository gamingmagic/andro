package org.apache.commons.logging.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;

public class SimpleLog implements Serializable, Log {
    protected static final String DEFAULT_DATE_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss:SSS zzz";
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_DEBUG = 2;
    public static final int LOG_LEVEL_ERROR = 5;
    public static final int LOG_LEVEL_FATAL = 6;
    public static final int LOG_LEVEL_INFO = 3;
    public static final int LOG_LEVEL_OFF = 7;
    public static final int LOG_LEVEL_TRACE = 1;
    public static final int LOG_LEVEL_WARN = 4;
    static Class class$java$lang$Thread = null;
    static Class class$org$apache$commons$logging$impl$SimpleLog = null;
    protected static DateFormat dateFormatter = null;
    protected static String dateTimeFormat = null;
    protected static boolean showDateTime = false;
    protected static boolean showLogName = false;
    protected static boolean showShortName = false;
    protected static final Properties simpleLogProps = new Properties();
    protected static final String systemPrefix = "org.apache.commons.logging.simplelog.";
    protected int currentLogLevel;
    protected String logName = null;
    private String shortLogName = null;

    static ClassLoader access$000() {
        return getContextClassLoader();
    }

    static {
        showLogName = false;
        showShortName = true;
        showDateTime = false;
        dateTimeFormat = DEFAULT_DATE_TIME_FORMAT;
        dateFormatter = null;
        InputStream resourceAsStream = getResourceAsStream("simplelog.properties");
        if (resourceAsStream != null) {
            try {
                simpleLogProps.load(resourceAsStream);
                resourceAsStream.close();
            } catch (IOException unused) {
            }
        }
        showLogName = getBooleanProperty("org.apache.commons.logging.simplelog.showlogname", showLogName);
        showShortName = getBooleanProperty("org.apache.commons.logging.simplelog.showShortLogname", showShortName);
        boolean booleanProperty = getBooleanProperty("org.apache.commons.logging.simplelog.showdatetime", showDateTime);
        showDateTime = booleanProperty;
        if (booleanProperty) {
            dateTimeFormat = getStringProperty("org.apache.commons.logging.simplelog.dateTimeFormat", dateTimeFormat);
            try {
                dateFormatter = new SimpleDateFormat(dateTimeFormat);
            } catch (IllegalArgumentException unused2) {
                dateTimeFormat = DEFAULT_DATE_TIME_FORMAT;
                dateFormatter = new SimpleDateFormat(dateTimeFormat);
            }
        }
    }

    private static String getStringProperty(String str) {
        String str2 = null;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
        }
        return str2 == null ? simpleLogProps.getProperty(str) : str2;
    }

    private static String getStringProperty(String str, String str2) {
        String stringProperty = getStringProperty(str);
        return stringProperty == null ? str2 : stringProperty;
    }

    private static boolean getBooleanProperty(String str, boolean z) {
        String stringProperty = getStringProperty(str);
        return stringProperty == null ? z : "true".equalsIgnoreCase(stringProperty);
    }

    public SimpleLog(String str) {
        this.logName = str;
        setLevel(3);
        String stringProperty = getStringProperty(new StringBuffer("org.apache.commons.logging.simplelog.log.").append(this.logName).toString());
        int lastIndexOf = String.valueOf(str).lastIndexOf(".");
        while (stringProperty == null && lastIndexOf >= 0) {
            str = str.substring(0, lastIndexOf);
            stringProperty = getStringProperty(new StringBuffer("org.apache.commons.logging.simplelog.log.").append(str).toString());
            lastIndexOf = String.valueOf(str).lastIndexOf(".");
        }
        if (stringProperty == null) {
            stringProperty = getStringProperty("org.apache.commons.logging.simplelog.defaultlog");
        }
        if ("all".equalsIgnoreCase(stringProperty)) {
            setLevel(0);
        } else if ("trace".equalsIgnoreCase(stringProperty)) {
            setLevel(1);
        } else if ("debug".equalsIgnoreCase(stringProperty)) {
            setLevel(2);
        } else if ("info".equalsIgnoreCase(stringProperty)) {
            setLevel(3);
        } else if ("warn".equalsIgnoreCase(stringProperty)) {
            setLevel(4);
        } else if ("error".equalsIgnoreCase(stringProperty)) {
            setLevel(5);
        } else if ("fatal".equalsIgnoreCase(stringProperty)) {
            setLevel(6);
        } else {
            if ("off".equalsIgnoreCase(stringProperty)) {
                setLevel(7);
            }
        }
    }

    public void setLevel(int i) {
        this.currentLogLevel = i;
    }

    public int getLevel() {
        return this.currentLogLevel;
    }

    /* access modifiers changed from: protected */
    public void log(int i, Object obj, Throwable th) {
        String format;
        StringBuffer stringBuffer = new StringBuffer();
        if (showDateTime) {
            Date date = new Date();
            synchronized (dateFormatter) {
                format = dateFormatter.format(date);
            }
            stringBuffer.append(format);
            stringBuffer.append(" ");
        }
        switch (i) {
            case 1:
                stringBuffer.append("[TRACE] ");
                break;
            case 2:
                stringBuffer.append("[DEBUG] ");
                break;
            case 3:
                stringBuffer.append("[INFO] ");
                break;
            case 4:
                stringBuffer.append("[WARN] ");
                break;
            case 5:
                stringBuffer.append("[ERROR] ");
                break;
            case 6:
                stringBuffer.append("[FATAL] ");
                break;
        }
        if (showShortName) {
            if (this.shortLogName == null) {
                this.shortLogName = this.logName.substring(this.logName.lastIndexOf(".") + 1);
                this.shortLogName = this.shortLogName.substring(this.shortLogName.lastIndexOf("/") + 1);
            }
            stringBuffer.append(String.valueOf(this.shortLogName)).append(" - ");
        } else if (showLogName) {
            stringBuffer.append(String.valueOf(this.logName)).append(" - ");
        }
        stringBuffer.append(String.valueOf(obj));
        if (th != null) {
            stringBuffer.append(" <");
            stringBuffer.append(th.toString());
            stringBuffer.append(">");
            StringWriter stringWriter = new StringWriter(1024);
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.close();
            stringBuffer.append(stringWriter.toString());
        }
        write(stringBuffer);
    }

    /* access modifiers changed from: protected */
    public void write(StringBuffer stringBuffer) {
    }

    /* access modifiers changed from: protected */
    public boolean isLevelEnabled(int i) {
        return i >= this.currentLogLevel;
    }

    public final void debug(Object obj) {
        if (isLevelEnabled(2)) {
            log(2, obj, null);
        }
    }

    public final void debug(Object obj, Throwable th) {
        if (isLevelEnabled(2)) {
            log(2, obj, th);
        }
    }

    public final void trace(Object obj) {
        if (isLevelEnabled(1)) {
            log(1, obj, null);
        }
    }

    public final void trace(Object obj, Throwable th) {
        if (isLevelEnabled(1)) {
            log(1, obj, th);
        }
    }

    public final void info(Object obj) {
        if (isLevelEnabled(3)) {
            log(3, obj, null);
        }
    }

    public final void info(Object obj, Throwable th) {
        if (isLevelEnabled(3)) {
            log(3, obj, th);
        }
    }

    public final void warn(Object obj) {
        if (isLevelEnabled(4)) {
            log(4, obj, null);
        }
    }

    public final void warn(Object obj, Throwable th) {
        if (isLevelEnabled(4)) {
            log(4, obj, th);
        }
    }

    public final void error(Object obj) {
        if (isLevelEnabled(5)) {
            log(5, obj, null);
        }
    }

    public final void error(Object obj, Throwable th) {
        if (isLevelEnabled(5)) {
            log(5, obj, th);
        }
    }

    public final void fatal(Object obj) {
        if (isLevelEnabled(6)) {
            log(6, obj, null);
        }
    }

    public final void fatal(Object obj, Throwable th) {
        if (isLevelEnabled(6)) {
            log(6, obj, th);
        }
    }

    public final boolean isDebugEnabled() {
        return isLevelEnabled(2);
    }

    public final boolean isErrorEnabled() {
        return isLevelEnabled(5);
    }

    public final boolean isFatalEnabled() {
        return isLevelEnabled(6);
    }

    public final boolean isInfoEnabled() {
        return isLevelEnabled(3);
    }

    public final boolean isTraceEnabled() {
        return isLevelEnabled(1);
    }

    public final boolean isWarnEnabled() {
        return isLevelEnabled(4);
    }

    private static ClassLoader getContextClassLoader() {
        Class cls;
        Class cls2;
        ClassLoader classLoader = null;
        try {
            if (class$java$lang$Thread == null) {
                cls2 = class$("java.lang.Thread");
                class$java$lang$Thread = cls2;
            } else {
                cls2 = class$java$lang$Thread;
            }
            classLoader = (ClassLoader) cls2.getMethod("getContextClassLoader", null).invoke(Thread.currentThread(), null);
        } catch (IllegalAccessException unused) {
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SecurityException)) {
                throw new LogConfigurationException("Unexpected InvocationTargetException", e.getTargetException());
            }
        } catch (NoSuchMethodException unused2) {
        }
        if (classLoader != null) {
            return classLoader;
        }
        if (class$org$apache$commons$logging$impl$SimpleLog == null) {
            cls = class$("org.apache.commons.logging.impl.SimpleLog");
            class$org$apache$commons$logging$impl$SimpleLog = cls;
        } else {
            cls = class$org$apache$commons$logging$impl$SimpleLog;
        }
        return cls.getClassLoader();
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static InputStream getResourceAsStream(String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction(str) {
            private final String val$name;

            {
                this.val$name = r1;
            }

            public Object run() {
                ClassLoader access$000 = SimpleLog.access$000();
                if (access$000 != null) {
                    return access$000.getResourceAsStream(this.val$name);
                }
                return ClassLoader.getSystemResourceAsStream(this.val$name);
            }
        });
    }
}

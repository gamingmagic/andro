package org.apache.commons.logging;

import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.apache.commons.logging.impl.LogFactoryImpl;
import org.apache.commons.logging.impl.NoOpLog;

public class LogSource {
    protected static boolean jdk14IsAvailable;
    protected static boolean log4jIsAvailable;
    protected static Constructor logImplctor = null;
    protected static Hashtable logs = new Hashtable();

    static {
        log4jIsAvailable = false;
        jdk14IsAvailable = false;
        try {
            if (null != Class.forName("org.apache.log4j.Logger")) {
                log4jIsAvailable = true;
            } else {
                log4jIsAvailable = false;
            }
        } catch (Throwable unused) {
            log4jIsAvailable = false;
        }
        try {
            if (null == Class.forName("java.util.logging.Logger") || null == Class.forName("org.apache.commons.logging.impl.Jdk14Logger")) {
                jdk14IsAvailable = false;
            } else {
                jdk14IsAvailable = true;
            }
        } catch (Throwable unused2) {
            jdk14IsAvailable = false;
        }
        String str = null;
        try {
            String property = System.getProperty("org.apache.commons.logging.log");
            str = property;
            if (property == null) {
                str = System.getProperty(LogFactoryImpl.LOG_PROPERTY);
            }
        } catch (Throwable unused3) {
        }
        if (str != null) {
            try {
                setLogImplementation(str);
            } catch (Throwable unused4) {
            }
        } else {
            try {
                if (log4jIsAvailable) {
                    setLogImplementation("org.apache.commons.logging.impl.Log4JLogger");
                } else if (jdk14IsAvailable) {
                    setLogImplementation("org.apache.commons.logging.impl.Jdk14Logger");
                } else {
                    setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
                }
            } catch (Throwable unused5) {
            }
        }
    }

    private LogSource() {
    }

    public static void setLogImplementation(String str) {
        try {
            logImplctor = Class.forName(str).getConstructor(new Class[]{"".getClass()});
        } catch (Throwable unused) {
            logImplctor = null;
        }
    }

    public static void setLogImplementation(Class cls) {
        logImplctor = cls.getConstructor(new Class[]{"".getClass()});
    }

    public static Log getInstance(String str) {
        Log log = (Log) logs.get(str);
        if (log != null) {
            return log;
        }
        Log makeNewLogInstance = makeNewLogInstance(str);
        logs.put(str, makeNewLogInstance);
        return makeNewLogInstance;
    }

    public static Log getInstance(Class cls) {
        return getInstance(cls.getName());
    }

    public static Log makeNewLogInstance(String str) {
        Log log;
        try {
            log = (Log) logImplctor.newInstance(new Object[]{str});
        } catch (Throwable unused) {
            log = null;
        }
        if (log == null) {
            return new NoOpLog(str);
        }
        return log;
    }

    public static String[] getLogNames() {
        return (String[]) logs.keySet().toArray(new String[logs.size()]);
    }
}

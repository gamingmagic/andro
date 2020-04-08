package org.apache.commons.logging;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import org.apache.http.message.TokenParser;

public abstract class LogFactory {
    public static final String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";
    public static final String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";
    public static final String FACTORY_PROPERTIES = "commons-logging.properties";
    public static final String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";
    public static final String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";
    public static final String PRIORITY_KEY = "priority";
    protected static final String SERVICE_ID = "META-INF/services/org.apache.commons.logging.LogFactory";
    public static final String TCCL_KEY = "use_tccl";
    private static final String WEAK_HASHTABLE_CLASSNAME = "org.apache.commons.logging.impl.WeakHashtable";
    static Class class$java$lang$Thread = null;
    static Class class$org$apache$commons$logging$LogFactory = null;
    private static String diagnosticPrefix = null;
    private static PrintStream diagnosticsStream = null;
    protected static Hashtable factories = null;
    protected static LogFactory nullClassLoaderFactory = null;
    private static ClassLoader thisClassLoader = null;

    public abstract Object getAttribute(String str);

    public abstract String[] getAttributeNames();

    public abstract Log getInstance(Class cls);

    public abstract Log getInstance(String str);

    public abstract void release();

    public abstract void removeAttribute(String str);

    public abstract void setAttribute(String str, Object obj);

    static void access$000(String str) {
        logDiagnostic(str);
    }

    static {
        Class cls;
        Class cls2;
        factories = null;
        if (class$org$apache$commons$logging$LogFactory == null) {
            cls = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = cls;
        } else {
            cls = class$org$apache$commons$logging$LogFactory;
        }
        thisClassLoader = getClassLoader(cls);
        initDiagnostics();
        if (class$org$apache$commons$logging$LogFactory == null) {
            cls2 = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = cls2;
        } else {
            cls2 = class$org$apache$commons$logging$LogFactory;
        }
        logClassLoaderEnvironment(cls2);
        factories = createFactoryStore();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("BOOTSTRAP COMPLETED");
        }
    }

    private static final Hashtable createFactoryStore() {
        String str;
        Hashtable hashtable = null;
        try {
            str = getSystemProperty(HASHTABLE_IMPLEMENTATION_PROPERTY, null);
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = WEAK_HASHTABLE_CLASSNAME;
        }
        try {
            hashtable = (Hashtable) Class.forName(str).newInstance();
        } catch (Throwable unused2) {
            if (!WEAK_HASHTABLE_CLASSNAME.equals(str) && isDiagnosticsEnabled()) {
                logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
            }
        }
        if (hashtable == null) {
            return new Hashtable();
        }
        return hashtable;
    }

    private static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:49|50|51|52|53|(3:57|(1:59)|60)|61) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x010e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.apache.commons.logging.LogFactory getFactory() {
        /*
            java.lang.ClassLoader r2 = getContextClassLoaderInternal()
            if (r2 != 0) goto L_0x0011
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "Context classloader is null."
            logDiagnostic(r0)
        L_0x0011:
            org.apache.commons.logging.LogFactory r3 = getCachedFactory(r2)
            if (r3 == 0) goto L_0x0018
            return r3
        L_0x0018:
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "[LOOKUP] LogFactory implementation requested for the first time for context classloader "
            r0.<init>(r1)
            java.lang.String r1 = objectId(r2)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            logDiagnostic(r0)
            java.lang.String r0 = "[LOOKUP] "
            logHierarchy(r0, r2)
        L_0x0039:
            java.lang.String r0 = "commons-logging.properties"
            java.util.Properties r4 = getConfigurationFile(r2, r0)
            r5 = r2
            if (r4 == 0) goto L_0x0056
            java.lang.String r0 = "use_tccl"
            java.lang.String r6 = r4.getProperty(r0)
            if (r6 == 0) goto L_0x0056
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0056
            java.lang.ClassLoader r5 = thisClassLoader
        L_0x0056:
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            logDiagnostic(r0)
        L_0x0061:
            java.lang.String r0 = "org.apache.commons.logging.LogFactory"
            r1 = 0
            java.lang.String r6 = getSystemProperty(r0, r1)     // Catch:{ SecurityException -> 0x009c, RuntimeException -> 0x00c4 }
            if (r6 == 0) goto L_0x008f
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x009c, RuntimeException -> 0x00c4 }
            if (r0 == 0) goto L_0x0088
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x009c, RuntimeException -> 0x00c4 }
            java.lang.String r1 = "[LOOKUP] Creating an instance of LogFactory class '"
            r0.<init>(r1)     // Catch:{ SecurityException -> 0x009c, RuntimeException -> 0x00c4 }
            java.lang.StringBuffer r0 = r0.append(r6)     // Catch:{ SecurityException -> 0x009c, RuntimeException -> 0x00c4 }
            java.lang.String r1 = "' as specified by system property org.apache.commons.logging.LogFactory"
            java.lang.StringBuffer r0 = r0.append(r1)     // Catch:{ SecurityException -> 0x009c, RuntimeException -> 0x00c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ SecurityException -> 0x009c, RuntimeException -> 0x00c4 }
            logDiagnostic(r0)     // Catch:{ SecurityException -> 0x009c, RuntimeException -> 0x00c4 }
        L_0x0088:
            org.apache.commons.logging.LogFactory r0 = newFactory(r6, r5, r2)     // Catch:{ SecurityException -> 0x009c, RuntimeException -> 0x00c4 }
            r3 = r0
            goto L_0x00ec
        L_0x008f:
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ SecurityException -> 0x009c, RuntimeException -> 0x00c4 }
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = "[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined."
            logDiagnostic(r0)     // Catch:{ SecurityException -> 0x009c, RuntimeException -> 0x00c4 }
        L_0x009a:
            goto L_0x00ec
        L_0x009c:
            r6 = move-exception
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x00c3
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: ["
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            java.lang.String r1 = trim(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = "]. Trying alternative implementations..."
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            logDiagnostic(r0)
        L_0x00c3:
            goto L_0x00ec
        L_0x00c4:
            r6 = move-exception
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x00eb
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: ["
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            java.lang.String r1 = trim(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = "] as specified by a system property."
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            logDiagnostic(r0)
        L_0x00eb:
            throw r6
        L_0x00ec:
            if (r3 != 0) goto L_0x0180
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = "[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            logDiagnostic(r0)
        L_0x00f9:
            java.lang.String r0 = "META-INF/services/org.apache.commons.logging.LogFactory"
            java.io.InputStream r6 = getResourceAsStream(r2, r0)     // Catch:{ Exception -> 0x0159 }
            if (r6 == 0) goto L_0x014d
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x010e }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x010e }
            java.lang.String r1 = "UTF-8"
            r0.<init>(r6, r1)     // Catch:{ UnsupportedEncodingException -> 0x010e }
            r7.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x010e }
            goto L_0x0118
        L_0x010e:
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0159 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0159 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0159 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0159 }
        L_0x0118:
            java.lang.String r8 = r7.readLine()     // Catch:{ Exception -> 0x0159 }
            r7.close()     // Catch:{ Exception -> 0x0159 }
            if (r8 == 0) goto L_0x014c
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r8)     // Catch:{ Exception -> 0x0159 }
            if (r0 != 0) goto L_0x014c
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x0159 }
            if (r0 == 0) goto L_0x0147
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x0159 }
            java.lang.String r1 = "[LOOKUP]  Creating an instance of LogFactory class "
            r0.<init>(r1)     // Catch:{ Exception -> 0x0159 }
            java.lang.StringBuffer r0 = r0.append(r8)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r1 = " as specified by file 'META-INF/services/org.apache.commons.logging.LogFactory' which was present in the path of the context classloader."
            java.lang.StringBuffer r0 = r0.append(r1)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0159 }
            logDiagnostic(r0)     // Catch:{ Exception -> 0x0159 }
        L_0x0147:
            org.apache.commons.logging.LogFactory r0 = newFactory(r8, r5, r2)     // Catch:{ Exception -> 0x0159 }
            r3 = r0
        L_0x014c:
            goto L_0x0180
        L_0x014d:
            boolean r0 = isDiagnosticsEnabled()     // Catch:{ Exception -> 0x0159 }
            if (r0 == 0) goto L_0x0158
            java.lang.String r0 = "[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found."
            logDiagnostic(r0)     // Catch:{ Exception -> 0x0159 }
        L_0x0158:
            goto L_0x0180
        L_0x0159:
            r6 = move-exception
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x0180
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: ["
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            java.lang.String r1 = trim(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = "]. Trying alternative implementations..."
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            logDiagnostic(r0)
        L_0x0180:
            if (r3 != 0) goto L_0x01d1
            if (r4 == 0) goto L_0x01c6
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x018f
            java.lang.String r0 = "[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use..."
            logDiagnostic(r0)
        L_0x018f:
            java.lang.String r0 = "org.apache.commons.logging.LogFactory"
            java.lang.String r6 = r4.getProperty(r0)
            if (r6 == 0) goto L_0x01ba
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x01b5
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "[LOOKUP] Properties file specifies LogFactory subclass '"
            r0.<init>(r1)
            java.lang.StringBuffer r0 = r0.append(r6)
            java.lang.String r1 = "'"
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            logDiagnostic(r0)
        L_0x01b5:
            org.apache.commons.logging.LogFactory r3 = newFactory(r6, r5, r2)
            goto L_0x01d1
        L_0x01ba:
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x01c5
            java.lang.String r0 = "[LOOKUP] Properties file has no entry specifying LogFactory subclass."
            logDiagnostic(r0)
        L_0x01c5:
            goto L_0x01d1
        L_0x01c6:
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x01d1
            java.lang.String r0 = "[LOOKUP] No properties file available to determine LogFactory subclass from.."
            logDiagnostic(r0)
        L_0x01d1:
            if (r3 != 0) goto L_0x01e6
            boolean r0 = isDiagnosticsEnabled()
            if (r0 == 0) goto L_0x01de
            java.lang.String r0 = "[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader)."
            logDiagnostic(r0)
        L_0x01de:
            java.lang.String r0 = "org.apache.commons.logging.impl.LogFactoryImpl"
            java.lang.ClassLoader r1 = thisClassLoader
            org.apache.commons.logging.LogFactory r3 = newFactory(r0, r1, r2)
        L_0x01e6:
            if (r3 == 0) goto L_0x0206
            cacheFactory(r2, r3)
            if (r4 == 0) goto L_0x0206
            java.util.Enumeration r6 = r4.propertyNames()
        L_0x01f1:
            boolean r0 = r6.hasMoreElements()
            if (r0 == 0) goto L_0x0206
            java.lang.Object r0 = r6.nextElement()
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            java.lang.String r8 = r4.getProperty(r7)
            r3.setAttribute(r7, r8)
            goto L_0x01f1
        L_0x0206:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.getFactory():org.apache.commons.logging.LogFactory");
    }

    public static Log getLog(Class cls) {
        return getFactory().getInstance(cls);
    }

    public static Log getLog(String str) {
        return getFactory().getInstance(str);
    }

    public static void release(ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            logDiagnostic(new StringBuffer("Releasing factory for classloader ").append(objectId(classLoader)).toString());
        }
        synchronized (factories) {
            if (classLoader != null) {
                LogFactory logFactory = (LogFactory) factories.get(classLoader);
                if (logFactory != null) {
                    logFactory.release();
                    factories.remove(classLoader);
                }
            } else if (nullClassLoaderFactory != null) {
                nullClassLoaderFactory.release();
                nullClassLoaderFactory = null;
            }
        }
    }

    public static void releaseAll() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Releasing factory for all classloaders.");
        }
        synchronized (factories) {
            Enumeration elements = factories.elements();
            while (elements.hasMoreElements()) {
                ((LogFactory) elements.nextElement()).release();
            }
            factories.clear();
            if (nullClassLoaderFactory != null) {
                nullClassLoaderFactory.release();
                nullClassLoaderFactory = null;
            }
        }
    }

    public static ClassLoader getClassLoader(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("Unable to get classloader for class '").append(cls).append("' due to security restrictions - ").append(e.getMessage()).toString());
            }
            throw e;
        }
    }

    public static ClassLoader getContextClassLoader() {
        return directGetContextClassLoader();
    }

    private static ClassLoader getContextClassLoaderInternal() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    public static ClassLoader directGetContextClassLoader() {
        Class cls;
        Class cls2;
        boolean z = false;
        try {
            if (class$java$lang$Thread == null) {
                cls2 = class$("java.lang.Thread");
                class$java$lang$Thread = cls2;
            } else {
                cls2 = class$java$lang$Thread;
            }
            return (ClassLoader) cls2.getMethod("getContextClassLoader", null).invoke(Thread.currentThread(), null);
        } catch (IllegalAccessException e) {
            throw new LogConfigurationException("Unexpected IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getTargetException() instanceof SecurityException) {
                return z;
            }
            throw new LogConfigurationException("Unexpected InvocationTargetException", e2.getTargetException());
        } catch (NoSuchMethodException unused) {
            if (class$org$apache$commons$logging$LogFactory == null) {
                cls = class$(FACTORY_PROPERTY);
                class$org$apache$commons$logging$LogFactory = cls;
            } else {
                cls = class$org$apache$commons$logging$LogFactory;
            }
            return getClassLoader(cls);
        }
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static LogFactory getCachedFactory(ClassLoader classLoader) {
        if (classLoader == null) {
            return nullClassLoaderFactory;
        }
        return (LogFactory) factories.get(classLoader);
    }

    private static void cacheFactory(ClassLoader classLoader, LogFactory logFactory) {
        if (logFactory != null) {
            if (classLoader == null) {
                nullClassLoaderFactory = logFactory;
                return;
            }
            factories.put(classLoader, logFactory);
        }
    }

    protected static LogFactory newFactory(String str, ClassLoader classLoader, ClassLoader classLoader2) {
        Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction(str, classLoader) {
            private final ClassLoader val$classLoader;
            private final String val$factoryClass;

            {
                this.val$factoryClass = r1;
                this.val$classLoader = r2;
            }

            public Object run() {
                return LogFactory.createFactory(this.val$factoryClass, this.val$classLoader);
            }
        });
        if (doPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) doPrivileged;
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("An error occurred while loading the factory class:").append(logConfigurationException.getMessage()).toString());
            }
            throw logConfigurationException;
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic(new StringBuffer("Created object ").append(objectId(doPrivileged)).append(" to manage classloader ").append(objectId(classLoader2)).toString());
        }
        return (LogFactory) doPrivileged;
    }

    protected static LogFactory newFactory(String str, ClassLoader classLoader) {
        return newFactory(str, classLoader, null);
    }

    protected static Object createFactory(String str, ClassLoader classLoader) {
        Class cls;
        Class cls2;
        String str2;
        Class cls3;
        Class cls4;
        if (classLoader != null) {
            try {
                Class loadClass = classLoader.loadClass(str);
                if (class$org$apache$commons$logging$LogFactory == null) {
                    cls3 = class$(FACTORY_PROPERTY);
                    class$org$apache$commons$logging$LogFactory = cls3;
                } else {
                    cls3 = class$org$apache$commons$logging$LogFactory;
                }
                if (cls3.isAssignableFrom(loadClass)) {
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(new StringBuffer("Loaded class ").append(loadClass.getName()).append(" from classloader ").append(objectId(classLoader)).toString());
                    }
                } else if (isDiagnosticsEnabled()) {
                    StringBuffer append = new StringBuffer("Factory class ").append(loadClass.getName()).append(" loaded from classloader ").append(objectId(loadClass.getClassLoader())).append(" does not extend '");
                    if (class$org$apache$commons$logging$LogFactory == null) {
                        cls4 = class$(FACTORY_PROPERTY);
                        class$org$apache$commons$logging$LogFactory = cls4;
                    } else {
                        cls4 = class$org$apache$commons$logging$LogFactory;
                    }
                    logDiagnostic(append.append(cls4.getName()).append("' as loaded by this classloader.").toString());
                    logHierarchy("[BAD CL TREE] ", classLoader);
                }
                return (LogFactory) loadClass.newInstance();
            } catch (ClassNotFoundException e) {
                if (classLoader == thisClassLoader) {
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(new StringBuffer("Unable to locate any class called '").append(str).append("' via classloader ").append(objectId(classLoader)).toString());
                    }
                    throw e;
                }
            } catch (NoClassDefFoundError e2) {
                if (classLoader == thisClassLoader) {
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(new StringBuffer("Class '").append(str).append("' cannot be loaded via classloader ").append(objectId(classLoader)).append(" - it depends on some other class that cannot be found.").toString());
                    }
                    throw e2;
                }
            } catch (ClassCastException unused) {
                if (classLoader == thisClassLoader) {
                    boolean implementsLogFactory = implementsLogFactory(null);
                    StringBuffer append2 = new StringBuffer("The application has specified that a custom LogFactory implementation should be used but Class '").append(str).append("' cannot be converted to '");
                    if (class$org$apache$commons$logging$LogFactory == null) {
                        cls2 = class$(FACTORY_PROPERTY);
                        class$org$apache$commons$logging$LogFactory = cls2;
                    } else {
                        cls2 = class$org$apache$commons$logging$LogFactory;
                    }
                    String stringBuffer = append2.append(cls2.getName()).append("'. ").toString();
                    if (implementsLogFactory) {
                        str2 = new StringBuffer().append(stringBuffer).append("The conflict is caused by the presence of multiple LogFactory classes in incompatible classloaders. Background can be found in http://commons.apache.org/logging/tech.html. If you have not explicitly specified a custom LogFactory then it is likely that the container has set one without your knowledge. In this case, consider using the commons-logging-adapters.jar file or specifying the standard LogFactory from the command line. ").toString();
                    } else {
                        str2 = new StringBuffer().append(stringBuffer).append("Please check the custom implementation. ").toString();
                    }
                    String stringBuffer2 = new StringBuffer().append(str2).append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.").toString();
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(stringBuffer2);
                    }
                    throw new ClassCastException(stringBuffer2);
                }
            } catch (Exception e3) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("Unable to create LogFactory instance.");
                }
                if (0 != 0) {
                    if (class$org$apache$commons$logging$LogFactory == null) {
                        cls = class$(FACTORY_PROPERTY);
                        class$org$apache$commons$logging$LogFactory = cls;
                    } else {
                        cls = class$org$apache$commons$logging$LogFactory;
                    }
                    if (!cls.isAssignableFrom(null)) {
                        return new LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e3);
                    }
                }
                return new LogConfigurationException((Throwable) e3);
            }
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic(new StringBuffer("Unable to load factory class via classloader ").append(objectId(classLoader)).append(" - trying the classloader associated with this LogFactory.").toString());
        }
        Class cls5 = Class.forName(str);
        Class cls6 = cls5;
        return (LogFactory) cls5.newInstance();
    }

    private static boolean implementsLogFactory(Class cls) {
        boolean z = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    logDiagnostic("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    logHierarchy("[CUSTOM LOG FACTORY] ", classLoader);
                    boolean isAssignableFrom = Class.forName(FACTORY_PROPERTY, false, classLoader).isAssignableFrom(cls);
                    z = isAssignableFrom;
                    if (isAssignableFrom) {
                        logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] ").append(cls.getName()).append(" implements LogFactory but was loaded by an incompatible classloader.").toString());
                    } else {
                        logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] ").append(cls.getName()).append(" does not implement LogFactory.").toString());
                    }
                }
            } catch (SecurityException e) {
                logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ").append(e.getMessage()).toString());
            } catch (LinkageError e2) {
                logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ").append(e2.getMessage()).toString());
            } catch (ClassNotFoundException unused) {
                logDiagnostic("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            }
        }
        return z;
    }

    private static InputStream getResourceAsStream(ClassLoader classLoader, String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction(classLoader, str) {
            private final ClassLoader val$loader;
            private final String val$name;

            {
                this.val$loader = r1;
                this.val$name = r2;
            }

            public Object run() {
                if (this.val$loader != null) {
                    return this.val$loader.getResourceAsStream(this.val$name);
                }
                return ClassLoader.getSystemResourceAsStream(this.val$name);
            }
        });
    }

    private static Enumeration getResources(ClassLoader classLoader, String str) {
        return (Enumeration) AccessController.doPrivileged(new PrivilegedAction(classLoader, str) {
            private final ClassLoader val$loader;
            private final String val$name;

            {
                this.val$loader = r1;
                this.val$name = r2;
            }

            public Object run() {
                try {
                    if (this.val$loader != null) {
                        return this.val$loader.getResources(this.val$name);
                    }
                    return ClassLoader.getSystemResources(this.val$name);
                } catch (IOException e) {
                    if (LogFactory.isDiagnosticsEnabled()) {
                        LogFactory.access$000(new StringBuffer("Exception while trying to find configuration file ").append(this.val$name).append(":").append(e.getMessage()).toString());
                    }
                    return null;
                } catch (NoSuchMethodError unused) {
                    return null;
                }
            }
        });
    }

    private static Properties getProperties(URL url) {
        return (Properties) AccessController.doPrivileged(new PrivilegedAction(url) {
            private final URL val$url;

            {
                this.val$url = r1;
            }

            public Object run() {
                try {
                    InputStream openStream = this.val$url.openStream();
                    if (openStream != null) {
                        Properties properties = new Properties();
                        properties.load(openStream);
                        openStream.close();
                        return properties;
                    }
                } catch (IOException unused) {
                    if (LogFactory.isDiagnosticsEnabled()) {
                        LogFactory.access$000(new StringBuffer("Unable to read URL ").append(this.val$url).toString());
                    }
                }
                return null;
            }
        });
    }

    private static final Properties getConfigurationFile(ClassLoader classLoader, String str) {
        Properties properties = null;
        double d = 0.0d;
        URL url = null;
        try {
            Enumeration resources = getResources(classLoader, str);
            if (resources == null) {
                return null;
            }
            while (resources.hasMoreElements()) {
                URL url2 = (URL) resources.nextElement();
                Properties properties2 = getProperties(url2);
                if (properties2 != null) {
                    if (properties == null) {
                        url = url2;
                        properties = properties2;
                        String property = properties2.getProperty(PRIORITY_KEY);
                        d = 0.0d;
                        if (property != null) {
                            d = Double.parseDouble(property);
                        }
                        if (isDiagnosticsEnabled()) {
                            logDiagnostic(new StringBuffer("[LOOKUP] Properties file found at '").append(url2).append("' with priority ").append(d).toString());
                        }
                    } else {
                        String property2 = properties2.getProperty(PRIORITY_KEY);
                        double d2 = 0.0d;
                        if (property2 != null) {
                            d2 = Double.parseDouble(property2);
                        }
                        if (d2 > d) {
                            if (isDiagnosticsEnabled()) {
                                logDiagnostic(new StringBuffer("[LOOKUP] Properties file at '").append(url2).append("' with priority ").append(d2).append(" overrides file at '").append(url).append("' with priority ").append(d).toString());
                            }
                            url = url2;
                            properties = properties2;
                            d = d2;
                        } else if (isDiagnosticsEnabled()) {
                            logDiagnostic(new StringBuffer("[LOOKUP] Properties file at '").append(url2).append("' with priority ").append(d2).append(" does not override file at '").append(url).append("' with priority ").append(d).toString());
                        }
                    }
                }
            }
            if (isDiagnosticsEnabled()) {
                if (properties == null) {
                    logDiagnostic(new StringBuffer("[LOOKUP] No properties file of name '").append(str).append("' found.").toString());
                } else {
                    logDiagnostic(new StringBuffer("[LOOKUP] Properties file of name '").append(str).append("' found at '").append(url).append(TokenParser.DQUOTE).toString());
                }
            }
            return properties;
        } catch (SecurityException unused) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("SecurityException thrown while trying to find/read config files.");
            }
        }
    }

    private static String getSystemProperty(String str, String str2) {
        return (String) AccessController.doPrivileged(new PrivilegedAction(str, str2) {
            private final String val$def;
            private final String val$key;

            {
                this.val$key = r1;
                this.val$def = r2;
            }

            public Object run() {
                return System.getProperty(this.val$key, this.val$def);
            }
        });
    }

    private static void initDiagnostics() {
        String str;
        try {
            String systemProperty = getSystemProperty(DIAGNOSTICS_DEST_PROPERTY, null);
            if (systemProperty != null) {
                if (systemProperty.equals("STDOUT")) {
                    diagnosticsStream = System.out;
                } else if (systemProperty.equals("STDERR")) {
                    diagnosticsStream = System.err;
                } else {
                    try {
                        diagnosticsStream = new PrintStream(new FileOutputStream(systemProperty, true));
                    } catch (IOException unused) {
                        return;
                    }
                }
                try {
                    ClassLoader classLoader = thisClassLoader;
                    if (thisClassLoader == null) {
                        str = "BOOTLOADER";
                    } else {
                        str = objectId(classLoader);
                    }
                } catch (SecurityException unused2) {
                    str = "UNKNOWN";
                }
                diagnosticPrefix = new StringBuffer("[LogFactory from ").append(str).append("] ").toString();
            }
        } catch (SecurityException unused3) {
        }
    }

    public static boolean isDiagnosticsEnabled() {
        return diagnosticsStream != null;
    }

    private static final void logDiagnostic(String str) {
        if (diagnosticsStream != null) {
            diagnosticsStream.print(diagnosticPrefix);
            diagnosticsStream.flush();
        }
    }

    public static final void logRawDiagnostic(String str) {
        if (diagnosticsStream != null) {
            diagnosticsStream.flush();
        }
    }

    private static void logClassLoaderEnvironment(Class cls) {
        if (isDiagnosticsEnabled()) {
            try {
                logDiagnostic(new StringBuffer("[ENV] Extension directories (java.ext.dir): ").append(System.getProperty("java.ext.dir")).toString());
                logDiagnostic(new StringBuffer("[ENV] Application classpath (java.class.path): ").append(System.getProperty("java.class.path")).toString());
            } catch (SecurityException unused) {
                logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader classLoader = getClassLoader(cls);
                logDiagnostic(new StringBuffer("[ENV] Class ").append(name).append(" was loaded via classloader ").append(objectId(classLoader)).toString());
                logHierarchy(new StringBuffer("[ENV] Ancestry of classloader which loaded ").append(name).append(" is ").toString(), classLoader);
            } catch (SecurityException unused2) {
                logDiagnostic(new StringBuffer("[ENV] Security forbids determining the classloader for ").append(name).toString());
            }
        }
    }

    private static void logHierarchy(String str, ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            if (classLoader != null) {
                logDiagnostic(new StringBuffer().append(str).append(objectId(classLoader)).append(" == '").append(classLoader.toString()).append("'").toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer = new StringBuffer(new StringBuffer().append(str).append("ClassLoader tree:").toString());
                    do {
                        stringBuffer.append(objectId(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer.append("BOOT");
                    logDiagnostic(stringBuffer.toString());
                }
            } catch (SecurityException unused2) {
                logDiagnostic(new StringBuffer().append(str).append("Security forbids determining the system classloader.").toString());
            }
        }
    }

    public static String objectId(Object obj) {
        if (obj == null) {
            return "null";
        }
        return new StringBuffer().append(obj.getClass().getName()).append("@").append(System.identityHashCode(obj)).toString();
    }
}

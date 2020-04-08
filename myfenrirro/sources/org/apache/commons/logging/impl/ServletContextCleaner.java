package org.apache.commons.logging.impl;

import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.commons.logging.LogFactory;

public class ServletContextCleaner implements ServletContextListener {
    static Class class$java$lang$ClassLoader;
    private Class[] RELEASE_SIGNATURE;

    public ServletContextCleaner() {
        Class cls;
        Class[] clsArr = new Class[1];
        if (class$java$lang$ClassLoader == null) {
            cls = class$("java.lang.ClassLoader");
            class$java$lang$ClassLoader = cls;
        } else {
            cls = class$java$lang$ClassLoader;
        }
        clsArr[0] = cls;
        this.RELEASE_SIGNATURE = clsArr;
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Object[] objArr = {contextClassLoader};
        ClassLoader classLoader = contextClassLoader;
        while (classLoader != null) {
            try {
                Class loadClass = classLoader.loadClass(LogFactory.FACTORY_PROPERTY);
                loadClass.getMethod("release", this.RELEASE_SIGNATURE).invoke(null, objArr);
                classLoader = loadClass.getClassLoader().getParent();
            } catch (ClassNotFoundException unused) {
                classLoader = null;
            } catch (NoSuchMethodException unused2) {
                classLoader = null;
            } catch (IllegalAccessException unused3) {
                classLoader = null;
            } catch (InvocationTargetException unused4) {
                classLoader = null;
            }
        }
        LogFactory.release(contextClassLoader);
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
    }
}

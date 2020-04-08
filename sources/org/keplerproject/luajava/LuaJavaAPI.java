package org.keplerproject.luajava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class LuaJavaAPI {
    private LuaJavaAPI() {
    }

    public static int objectIndex(int i, Object obj, String str) {
        Class cls;
        Object obj2;
        LuaState existingState = LuaStateFactory.getExistingState(i);
        LuaState luaState = existingState;
        synchronized (existingState) {
            int top = luaState.getTop();
            Object[] objArr = new Object[(top - 1)];
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
            }
            Method[] methods = cls.getMethods();
            Method method = null;
            int i2 = 0;
            while (true) {
                if (i2 >= methods.length) {
                    break;
                }
                if (methods[i2].getName().equals(str)) {
                    Class[] parameterTypes = methods[i2].getParameterTypes();
                    if (parameterTypes.length == top - 1) {
                        boolean z = true;
                        int i3 = 0;
                        while (i3 < parameterTypes.length) {
                            try {
                                objArr[i3] = compareTypes(luaState, parameterTypes[i3], i3 + 2);
                                i3++;
                            } catch (Exception unused) {
                                z = false;
                            }
                        }
                        if (z) {
                            method = methods[i2];
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
            }
            if (method == null) {
                throw new LuaException("Invalid method call. No such method.");
            }
            try {
                if (Modifier.isPublic(method.getModifiers())) {
                    method.setAccessible(true);
                }
                if (obj instanceof Class) {
                    obj2 = method.invoke(null, objArr);
                } else {
                    obj2 = method.invoke(obj, objArr);
                }
                if (obj2 == null) {
                    return 0;
                }
                luaState.pushObjectValue(obj2);
                return 1;
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
    }

    public static int classIndex(int i, Class cls, String str) {
        synchronized (LuaStateFactory.getExistingState(i)) {
            if (checkField(i, cls, str) != 0) {
                return 1;
            }
            if (checkMethod(i, cls, str) != 0) {
                return 2;
            }
            return 0;
        }
    }

    public static int javaNewInstance(int i, String str) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        LuaState luaState = existingState;
        synchronized (existingState) {
            try {
                luaState.pushJavaObject(getObjInstance(luaState, Class.forName(str)));
            } catch (ClassNotFoundException e) {
                throw new LuaException((Exception) e);
            }
        }
        return 1;
    }

    public static int javaNew(int i, Class cls) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        LuaState luaState = existingState;
        synchronized (existingState) {
            luaState.pushJavaObject(getObjInstance(luaState, cls));
        }
        return 1;
    }

    public static int javaLoadLib(int i, String str, String str2) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        LuaState luaState = existingState;
        synchronized (existingState) {
            try {
                Object invoke = Class.forName(str).getMethod(str2, new Class[]{LuaState.class}).invoke(null, new Object[]{luaState});
                if (invoke == null || !(invoke instanceof Integer)) {
                    return 0;
                }
                int intValue = ((Integer) invoke).intValue();
                return intValue;
            } catch (Exception e) {
                throw new LuaException("Error on calling method. Library could not be loaded. " + e.getMessage());
            } catch (ClassNotFoundException e2) {
                throw new LuaException((Exception) e2);
            }
        }
    }

    private static Object getObjInstance(LuaState luaState, Class cls) {
        LuaState luaState2 = luaState;
        synchronized (luaState) {
            int top = luaState.getTop();
            Object[] objArr = new Object[(top - 1)];
            Constructor[] constructors = cls.getConstructors();
            Constructor constructor = null;
            int i = 0;
            while (true) {
                if (i >= constructors.length) {
                    break;
                }
                Class[] parameterTypes = constructors[i].getParameterTypes();
                if (parameterTypes.length == top - 1) {
                    boolean z = true;
                    int i2 = 0;
                    while (i2 < parameterTypes.length) {
                        try {
                            objArr[i2] = compareTypes(luaState, parameterTypes[i2], i2 + 2);
                            i2++;
                        } catch (Exception unused) {
                            z = false;
                        }
                    }
                    if (z) {
                        constructor = constructors[i];
                        break;
                    }
                }
                i++;
            }
            if (constructor == null) {
                throw new LuaException("Invalid method call. No such method.");
            }
            try {
                Object newInstance = constructor.newInstance(objArr);
                if (newInstance == null) {
                    throw new LuaException("Couldn't instantiate java Object");
                }
                return newInstance;
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|21|22|23) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0027, code lost:
        return 0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int checkField(int r3, java.lang.Object r4, java.lang.String r5) {
        /*
            org.keplerproject.luajava.LuaState r1 = org.keplerproject.luajava.LuaStateFactory.getExistingState(r3)
            r3 = r1
            monitor-enter(r1)
            boolean r0 = r4 instanceof java.lang.Class     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            r0 = r4
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x0033 }
            r2 = r0
            goto L_0x0013
        L_0x000f:
            java.lang.Class r2 = r4.getClass()     // Catch:{ all -> 0x0033 }
        L_0x0013:
            java.lang.reflect.Field r5 = r2.getField(r5)     // Catch:{ Exception -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            r0 = 0
            return r0
        L_0x001b:
            if (r5 != 0) goto L_0x0020
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            r0 = 0
            return r0
        L_0x0020:
            java.lang.Object r5 = r5.get(r4)     // Catch:{ Exception -> 0x0025 }
            goto L_0x0028
        L_0x0025:
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            r0 = 0
            return r0
        L_0x0028:
            if (r4 != 0) goto L_0x002d
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            r0 = 0
            return r0
        L_0x002d:
            r3.pushObjectValue(r5)     // Catch:{ all -> 0x0033 }
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            r0 = 1
            return r0
        L_0x0033:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.keplerproject.luajava.LuaJavaAPI.checkField(int, java.lang.Object, java.lang.String):int");
    }

    public static int checkMethod(int i, Object obj, String str) {
        Class cls;
        synchronized (LuaStateFactory.getExistingState(i)) {
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
            }
            Method[] methods = cls.getMethods();
            for (Method name : methods) {
                if (name.getName().equals(str)) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public static int createProxyObject(int i, String str) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        LuaState luaState = existingState;
        synchronized (existingState) {
            try {
                if (!luaState.isTable(2)) {
                    throw new LuaException("Parameter is not a table. Can't create proxy.");
                }
                luaState.pushJavaObject(luaState.getLuaObject(2).createProxy(str));
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
        return 1;
    }

    private static Object compareTypes(LuaState luaState, Class cls, int i) {
        boolean z = true;
        Object obj = null;
        if (luaState.isBoolean(i)) {
            if (cls.isPrimitive()) {
                if (cls != Boolean.TYPE) {
                    z = false;
                }
            } else if (!cls.isAssignableFrom(Boolean.class)) {
                z = false;
            }
            obj = new Boolean(luaState.toBoolean(i));
        } else if (luaState.type(i) == LuaState.LUA_TSTRING.intValue()) {
            if (!cls.isAssignableFrom(String.class)) {
                z = false;
            } else {
                obj = luaState.toString(i);
            }
        } else if (luaState.isFunction(i)) {
            if (!cls.isAssignableFrom(LuaObject.class)) {
                z = false;
            } else {
                obj = luaState.getLuaObject(i);
            }
        } else if (luaState.isTable(i)) {
            if (!cls.isAssignableFrom(LuaObject.class)) {
                z = false;
            } else {
                obj = luaState.getLuaObject(i);
            }
        } else if (luaState.type(i) == LuaState.LUA_TNUMBER.intValue()) {
            obj = LuaState.convertLuaNumber(new Double(luaState.toNumber(i)), cls);
            if (obj == null) {
                z = false;
            }
        } else if (luaState.isUserdata(i)) {
            if (luaState.isObject(i)) {
                Object objectFromUserdata = luaState.getObjectFromUserdata(i);
                if (!cls.isAssignableFrom(objectFromUserdata.getClass())) {
                    z = false;
                } else {
                    obj = objectFromUserdata;
                }
            } else if (!cls.isAssignableFrom(LuaObject.class)) {
                z = false;
            } else {
                obj = luaState.getLuaObject(i);
            }
        } else if (luaState.isNil(i)) {
            obj = null;
        } else {
            throw new LuaException("Invalid Parameters.");
        }
        if (z) {
            return obj;
        }
        throw new LuaException("Invalid Parameter.");
    }
}

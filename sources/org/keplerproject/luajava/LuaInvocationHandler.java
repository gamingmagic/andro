package org.keplerproject.luajava;

import java.lang.reflect.InvocationHandler;

public class LuaInvocationHandler implements InvocationHandler {
    private LuaObject obj;

    public LuaInvocationHandler(LuaObject luaObject) {
        this.obj = luaObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r4, java.lang.reflect.Method r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            org.keplerproject.luajava.LuaObject r0 = r3.obj
            org.keplerproject.luajava.LuaState r4 = r0.f9037L
            monitor-enter(r4)
            java.lang.String r2 = r5.getName()     // Catch:{ all -> 0x0049 }
            org.keplerproject.luajava.LuaObject r0 = r3.obj     // Catch:{ all -> 0x0049 }
            org.keplerproject.luajava.LuaObject r2 = r0.getField(r2)     // Catch:{ all -> 0x0049 }
            boolean r0 = r2.isNil()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0018
            monitor-exit(r4)     // Catch:{ all -> 0x0049 }
            r0 = 0
            return r0
        L_0x0018:
            java.lang.Class r5 = r5.getReturnType()     // Catch:{ all -> 0x0049 }
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x002c
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x0049 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0032
        L_0x002c:
            r0 = 0
            r2.call(r6, r0)     // Catch:{ all -> 0x0049 }
            r6 = 0
            goto L_0x0047
        L_0x0032:
            r0 = 1
            java.lang.Object[] r0 = r2.call(r6, r0)     // Catch:{ all -> 0x0049 }
            r1 = 0
            r6 = r0[r1]     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0047
            boolean r0 = r6 instanceof java.lang.Double     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0047
            r0 = r6
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ all -> 0x0049 }
            java.lang.Number r6 = org.keplerproject.luajava.LuaState.convertLuaNumber(r0, r5)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r4)     // Catch:{ all -> 0x0049 }
            return r6
        L_0x0049:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0049 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.keplerproject.luajava.LuaInvocationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}

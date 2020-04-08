package org.keplerproject.luajava;

import java.lang.reflect.Proxy;
import java.util.StringTokenizer;

public class LuaObject {

    /* renamed from: L */
    protected LuaState f9037L;
    protected Integer ref;

    protected LuaObject(LuaState luaState, String str) {
        LuaState luaState2 = luaState;
        synchronized (luaState) {
            this.f9037L = luaState;
            luaState.getGlobal(str);
            registerValue(-1);
            luaState.pop(1);
        }
    }

    protected LuaObject(LuaObject luaObject, String str) {
        synchronized (luaObject.getLuaState()) {
            this.f9037L = luaObject.getLuaState();
            if (luaObject.isTable() || luaObject.isUserdata()) {
                luaObject.push();
                this.f9037L.pushString(str);
                this.f9037L.getTable(-2);
                this.f9037L.remove(-2);
                registerValue(-1);
                this.f9037L.pop(1);
            } else {
                throw new LuaException("Object parent should be a table or userdata .");
            }
        }
    }

    protected LuaObject(LuaObject luaObject, Number number) {
        synchronized (luaObject.getLuaState()) {
            this.f9037L = luaObject.getLuaState();
            if (luaObject.isTable() || luaObject.isUserdata()) {
                luaObject.push();
                this.f9037L.pushNumber(number.doubleValue());
                this.f9037L.getTable(-2);
                this.f9037L.remove(-2);
                registerValue(-1);
                this.f9037L.pop(1);
            } else {
                throw new LuaException("Object parent should be a table or userdata .");
            }
        }
    }

    protected LuaObject(LuaObject luaObject, LuaObject luaObject2) {
        if (luaObject.getLuaState() != luaObject2.getLuaState()) {
            throw new LuaException("LuaStates must be the same!");
        }
        synchronized (luaObject.getLuaState()) {
            if (luaObject.isTable() || luaObject.isUserdata()) {
                this.f9037L = luaObject.getLuaState();
                luaObject.push();
                luaObject2.push();
                this.f9037L.getTable(-2);
                this.f9037L.remove(-2);
                registerValue(-1);
                this.f9037L.pop(1);
            } else {
                throw new LuaException("Object parent should be a table or userdata .");
            }
        }
    }

    protected LuaObject(LuaState luaState, int i) {
        LuaState luaState2 = luaState;
        synchronized (luaState) {
            this.f9037L = luaState;
            registerValue(i);
        }
    }

    public LuaState getLuaState() {
        return this.f9037L;
    }

    private void registerValue(int i) {
        synchronized (this.f9037L) {
            this.f9037L.pushValue(i);
            this.ref = new Integer(this.f9037L.Lref(LuaState.LUA_REGISTRYINDEX.intValue()));
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            synchronized (this.f9037L) {
                if (this.f9037L.getCPtrPeer() != 0) {
                    this.f9037L.LunRef(LuaState.LUA_REGISTRYINDEX.intValue(), this.ref.intValue());
                }
            }
        } catch (Exception unused) {
            new StringBuilder("Unable to release object ").append(this.ref);
        }
    }

    public void push() {
        this.f9037L.rawGetI(LuaState.LUA_REGISTRYINDEX.intValue(), this.ref.intValue());
    }

    public boolean isNil() {
        boolean isNil;
        synchronized (this.f9037L) {
            push();
            isNil = this.f9037L.isNil(-1);
            this.f9037L.pop(1);
        }
        return isNil;
    }

    public boolean isBoolean() {
        boolean isBoolean;
        synchronized (this.f9037L) {
            push();
            isBoolean = this.f9037L.isBoolean(-1);
            this.f9037L.pop(1);
        }
        return isBoolean;
    }

    public boolean isNumber() {
        boolean isNumber;
        synchronized (this.f9037L) {
            push();
            isNumber = this.f9037L.isNumber(-1);
            this.f9037L.pop(1);
        }
        return isNumber;
    }

    public boolean isString() {
        boolean isString;
        synchronized (this.f9037L) {
            push();
            isString = this.f9037L.isString(-1);
            this.f9037L.pop(1);
        }
        return isString;
    }

    public boolean isFunction() {
        boolean isFunction;
        synchronized (this.f9037L) {
            push();
            isFunction = this.f9037L.isFunction(-1);
            this.f9037L.pop(1);
        }
        return isFunction;
    }

    public boolean isJavaObject() {
        boolean isObject;
        synchronized (this.f9037L) {
            push();
            isObject = this.f9037L.isObject(-1);
            this.f9037L.pop(1);
        }
        return isObject;
    }

    public boolean isJavaFunction() {
        boolean isJavaFunction;
        synchronized (this.f9037L) {
            push();
            isJavaFunction = this.f9037L.isJavaFunction(-1);
            this.f9037L.pop(1);
        }
        return isJavaFunction;
    }

    public boolean isTable() {
        boolean isTable;
        synchronized (this.f9037L) {
            push();
            isTable = this.f9037L.isTable(-1);
            this.f9037L.pop(1);
        }
        return isTable;
    }

    public boolean isUserdata() {
        boolean isUserdata;
        synchronized (this.f9037L) {
            push();
            isUserdata = this.f9037L.isUserdata(-1);
            this.f9037L.pop(1);
        }
        return isUserdata;
    }

    public int type() {
        int type;
        synchronized (this.f9037L) {
            push();
            type = this.f9037L.type(-1);
            this.f9037L.pop(1);
        }
        return type;
    }

    public boolean getBoolean() {
        boolean z;
        synchronized (this.f9037L) {
            push();
            z = this.f9037L.toBoolean(-1);
            this.f9037L.pop(1);
        }
        return z;
    }

    public double getNumber() {
        double number;
        synchronized (this.f9037L) {
            push();
            number = this.f9037L.toNumber(-1);
            this.f9037L.pop(1);
        }
        return number;
    }

    public String getString() {
        String luaState;
        synchronized (this.f9037L) {
            push();
            luaState = this.f9037L.toString(-1);
            this.f9037L.pop(1);
        }
        return luaState;
    }

    public Object getObject() {
        Object objectFromUserdata;
        synchronized (this.f9037L) {
            push();
            objectFromUserdata = this.f9037L.getObjectFromUserdata(-1);
            this.f9037L.pop(1);
        }
        return objectFromUserdata;
    }

    public LuaObject getField(String str) {
        return this.f9037L.getLuaObject(this, str);
    }

    public Object[] call(Object[] objArr, int i) {
        int i2;
        Object[] objArr2;
        String str;
        String str2;
        synchronized (this.f9037L) {
            if (isFunction() || isTable() || isUserdata()) {
                int top = this.f9037L.getTop();
                push();
                if (objArr != null) {
                    for (Object pushObjectValue : objArr) {
                        this.f9037L.pushObjectValue(pushObjectValue);
                    }
                } else {
                    i2 = 0;
                }
                int pcall = this.f9037L.pcall(i2, i, 0);
                if (pcall != 0) {
                    if (this.f9037L.isString(-1)) {
                        str = this.f9037L.toString(-1);
                        this.f9037L.pop(1);
                    } else {
                        str = "";
                    }
                    if (pcall == LuaState.LUA_ERRRUN.intValue()) {
                        str2 = "Runtime error. " + str;
                    } else if (pcall == LuaState.LUA_ERRMEM.intValue()) {
                        str2 = "Memory allocation error. " + str;
                    } else if (pcall == LuaState.LUA_ERRERR.intValue()) {
                        str2 = "Error while running the error handler function. " + str;
                    } else {
                        str2 = "Lua Error code " + pcall + ". " + str;
                    }
                    throw new LuaException(str2);
                }
                if (i == LuaState.LUA_MULTRET.intValue()) {
                    i = this.f9037L.getTop() - top;
                }
                if (this.f9037L.getTop() - top < i) {
                    throw new LuaException("Invalid Number of Results .");
                }
                objArr2 = new Object[i];
                for (int i3 = i; i3 > 0; i3--) {
                    objArr2[i3 - 1] = this.f9037L.toJavaObject(-1);
                    this.f9037L.pop(1);
                }
            } else {
                throw new LuaException("Invalid object. Not a function, table or userdata .");
            }
        }
        return objArr2;
    }

    public Object call(Object[] objArr) {
        return call(objArr, 1)[0];
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:69|70|71|72) */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0076, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0074 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r3 = this;
            org.keplerproject.luajava.LuaState r2 = r3.f9037L
            monitor-enter(r2)
            boolean r0 = r3.isNil()     // Catch:{ LuaException -> 0x0074 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "nil"
            return r0
        L_0x000d:
            boolean r0 = r3.isBoolean()     // Catch:{ LuaException -> 0x0074 }
            if (r0 == 0) goto L_0x001d
            boolean r0 = r3.getBoolean()     // Catch:{ LuaException -> 0x0074 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ LuaException -> 0x0074 }
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            return r0
        L_0x001d:
            boolean r0 = r3.isNumber()     // Catch:{ LuaException -> 0x0074 }
            if (r0 == 0) goto L_0x002d
            double r0 = r3.getNumber()     // Catch:{ LuaException -> 0x0074 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ LuaException -> 0x0074 }
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            return r0
        L_0x002d:
            boolean r0 = r3.isString()     // Catch:{ LuaException -> 0x0074 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.getString()     // Catch:{ LuaException -> 0x0074 }
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            return r0
        L_0x0039:
            boolean r0 = r3.isFunction()     // Catch:{ LuaException -> 0x0074 }
            if (r0 == 0) goto L_0x0043
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "Lua Function"
            return r0
        L_0x0043:
            boolean r0 = r3.isJavaObject()     // Catch:{ LuaException -> 0x0074 }
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r3.getObject()     // Catch:{ LuaException -> 0x0074 }
            java.lang.String r0 = r0.toString()     // Catch:{ LuaException -> 0x0074 }
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            return r0
        L_0x0053:
            boolean r0 = r3.isUserdata()     // Catch:{ LuaException -> 0x0074 }
            if (r0 == 0) goto L_0x005d
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "Userdata"
            return r0
        L_0x005d:
            boolean r0 = r3.isTable()     // Catch:{ LuaException -> 0x0074 }
            if (r0 == 0) goto L_0x0067
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "Lua Table"
            return r0
        L_0x0067:
            boolean r0 = r3.isJavaFunction()     // Catch:{ LuaException -> 0x0074 }
            if (r0 == 0) goto L_0x0071
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "Java Function"
            return r0
        L_0x0071:
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            r0 = 0
            return r0
        L_0x0074:
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            r0 = 0
            return r0
        L_0x0077:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.keplerproject.luajava.LuaObject.toString():java.lang.String");
    }

    public Object createProxy(String str) {
        Object newProxyInstance;
        synchronized (this.f9037L) {
            if (!isTable()) {
                throw new LuaException("Invalid Object. Must be Table.");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            StringTokenizer stringTokenizer2 = stringTokenizer;
            Class[] clsArr = new Class[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer2.hasMoreTokens()) {
                clsArr[i] = Class.forName(stringTokenizer2.nextToken());
                i++;
            }
            newProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), clsArr, new LuaInvocationHandler(this));
        }
        return newProxyInstance;
    }
}

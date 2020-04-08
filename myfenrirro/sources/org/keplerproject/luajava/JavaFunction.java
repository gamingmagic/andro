package org.keplerproject.luajava;

public abstract class JavaFunction {

    /* renamed from: L */
    protected LuaState f9036L;

    public abstract int execute();

    public JavaFunction(LuaState luaState) {
        this.f9036L = luaState;
    }

    public LuaObject getParam(int i) {
        return this.f9036L.getLuaObject(i);
    }

    public void register(String str) {
        synchronized (this.f9036L) {
            this.f9036L.pushJavaFunction(this);
            this.f9036L.setGlobal(str);
        }
    }
}

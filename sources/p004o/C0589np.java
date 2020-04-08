package p004o;

import org.keplerproject.luajava.LuaState;

/* renamed from: o.np */
final class C0589np extends Exception {
    C0589np(LuaState luaState) {
        super("Failed to parse LUA file: " + luaState.toString(-1));
        C0591nr.m672(luaState);
    }
}

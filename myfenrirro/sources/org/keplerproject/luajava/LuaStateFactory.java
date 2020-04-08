package org.keplerproject.luajava;

import java.util.ArrayList;
import java.util.List;

public final class LuaStateFactory {
    private static final List states = new ArrayList();

    public static native void chdir(String str);

    static {
    }

    private LuaStateFactory() {
    }

    public static synchronized LuaState newLuaState() {
        LuaState luaState;
        synchronized (LuaStateFactory.class) {
            int nextStateIndex = getNextStateIndex();
            luaState = new LuaState(nextStateIndex);
            states.add(nextStateIndex, luaState);
        }
        return luaState;
    }

    public static synchronized LuaState getExistingState(int i) {
        LuaState luaState;
        synchronized (LuaStateFactory.class) {
            luaState = (LuaState) states.get(i);
        }
        return luaState;
    }

    public static synchronized int insertLuaState(LuaState luaState) {
        synchronized (LuaStateFactory.class) {
            for (int i = 0; i < states.size(); i++) {
                LuaState luaState2 = (LuaState) states.get(i);
                if (luaState2 != null && luaState2.getCPtrPeer() == luaState.getCPtrPeer()) {
                    return i;
                }
            }
            int nextStateIndex = getNextStateIndex();
            states.set(nextStateIndex, luaState);
            return nextStateIndex;
        }
    }

    public static synchronized void removeLuaState(int i) {
        synchronized (LuaStateFactory.class) {
            states.add(i, null);
        }
    }

    private static synchronized int getNextStateIndex() {
        int i;
        synchronized (LuaStateFactory.class) {
            i = 0;
            while (i < states.size() && states.get(i) != null) {
                i++;
            }
        }
        return i;
    }
}

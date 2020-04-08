package p004o;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.keplerproject.luajava.LuaState;
import p004o.C0627oy.C0628if;

/* renamed from: o.nr */
final class C0591nr {
    C0591nr() {
    }

    /* renamed from: 鷭 */
    public static final void m672(LuaState luaState) {
        int top = luaState.getTop();
        for (int i = -1; i > (-top) - 1; i--) {
            luaState.typeName(luaState.type(i));
            int i2 = i;
            LuaState luaState2 = luaState;
            int type = luaState.type(i2);
            if (type == LuaState.LUA_TNUMBER.intValue()) {
                luaState2.toInteger(i2);
            } else if (type == LuaState.LUA_TBOOLEAN.intValue()) {
                luaState2.toBoolean(i2);
            } else if (type == LuaState.LUA_TSTRING.intValue()) {
                C0622ot.m741(luaState2.toStringByteArray(i2), C0618op.LATIN);
            } else {
                luaState2.typeName(type);
            }
        }
    }

    /* renamed from: 鷭 */
    public static final synchronized String m671(LuaState luaState, C0618op opVar) {
        String str;
        synchronized (C0591nr.class) {
            str = null;
            if (luaState.isString(-1)) {
                str = C0622ot.m741(luaState.toStringByteArray(-1), opVar);
            } else if (luaState.isTable(-1)) {
                luaState.pushNil();
                while (luaState.next(-2) != 0) {
                    luaState.toInteger(-2);
                    if (!luaState.isString(-1)) {
                        throw new C0588no(luaState.typeName(luaState.type(-1)) + " " + luaState.toString(-1) + " is not string");
                    }
                    byte[] stringByteArray = luaState.toStringByteArray(-1);
                    if (str == null) {
                        str = C0622ot.m741(stringByteArray, opVar);
                    } else {
                        str = new StringBuilder(String.valueOf(str)).append("\n").append(C0622ot.m741(stringByteArray, opVar)).toString();
                    }
                    luaState.pop(1);
                }
            } else {
                str = null;
            }
        }
        return str;
    }

    /* renamed from: 鷭 */
    public static final synchronized String m670(LuaState luaState, String str, C0618op opVar) {
        String r3;
        synchronized (C0591nr.class) {
            luaState.pushString(str);
            luaState.getTable(-2);
            r3 = m671(luaState, opVar);
            luaState.pop(1);
        }
        return r3;
    }

    /* renamed from: 鷭 */
    public static final synchronized int m669(LuaState luaState, String str) {
        int i;
        synchronized (C0591nr.class) {
            luaState.pushString(str);
            luaState.getTable(-2);
            if (luaState.isNumber(-1)) {
                i = luaState.toInteger(-1);
            } else {
                i = 0;
            }
            luaState.pop(1);
        }
        return i;
    }

    /* renamed from: 櫯 */
    private static final synchronized void m667(LuaState luaState, byte[] bArr) {
        synchronized (C0591nr.class) {
            if (luaState.LdoByteArray(C1014.f6147.getFilesDir() + "/tmp.lub", bArr) != 0) {
                throw new C0589np(luaState);
            }
        }
    }

    /* renamed from: 鷭 */
    public static final synchronized void m673(LuaState luaState, byte[] bArr) {
        synchronized (C0591nr.class) {
            if (!C1014.f6140.f4527 && C0627oy.m765(Arrays.copyOf(bArr, 4))) {
                try {
                    byte[] bArr2 = bArr;
                    C0627oy oyVar = new C0627oy();
                    ByteBuffer wrap = ByteBuffer.wrap(bArr2);
                    ByteBuffer byteBuffer = wrap;
                    byte[] bArr3 = new byte[4];
                    wrap.get(bArr3);
                    byte[] bArr4 = bArr3;
                    if (!C0627oy.m765(bArr3)) {
                        new StringBuilder("Invalid Signature=").append(bArr4);
                        bArr = null;
                    } else {
                        byte b = byteBuffer.get();
                        if (byteBuffer.get() == 1) {
                            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                        } else {
                            byteBuffer.order(ByteOrder.BIG_ENDIAN);
                        }
                        byteBuffer.get();
                        byteBuffer.get();
                        byteBuffer.get();
                        byte b2 = byteBuffer.get();
                        byte b3 = byteBuffer.get();
                        byte b4 = byteBuffer.get();
                        byte b5 = byteBuffer.get();
                        byteBuffer.get();
                        C0618op opVar = C0618op.LATIN;
                        byte[] bArr5 = new byte[8];
                        byteBuffer.get(bArr5);
                        C0622ot.m741(bArr5, opVar);
                        oyVar.f4108 = b5 & 255;
                        oyVar.f4107 = b4 & 255;
                        oyVar.f4104 = oyVar.f4108 + oyVar.f4107;
                        oyVar.f4102 = b3 & 255;
                        oyVar.f4098 = b2 & 255;
                        oyVar.f4099 = oyVar.f4098;
                        oyVar.f4100 = oyVar.f4099 + oyVar.f4108;
                        oyVar.f4101 = oyVar.f4099;
                        oyVar.f4105 = oyVar.f4100 + oyVar.f4107;
                        oyVar.f4106 = (1 << oyVar.f4104) - 1;
                        oyVar.f4103 = oyVar.f4106 >> 1;
                        if (b != 80) {
                            throw new RuntimeException("Only supporting v5.0, sorry :(");
                        }
                        bArr = new C0628if(byteBuffer, null).mo4044();
                    }
                } catch (RuntimeException e) {
                    throw new C0822tr("Failed to parse LUA file: " + e.getMessage());
                }
            }
            m667(luaState, bArr);
        }
    }

    /* renamed from: 櫯 */
    public static int[] m668(LuaState luaState) {
        if (!luaState.isTable(-1)) {
            String str = "read_integer_array: incorrect variable in stack, should be array\n";
            Log.e("AndRO", str);
            throw new C0588no(str);
        }
        int LgetN = luaState.LgetN(-1);
        int[] iArr = new int[LgetN];
        for (int i = 0; i < LgetN; i++) {
            luaState.pushInteger(i + 1);
            luaState.getTable(-2);
            iArr[i] = luaState.toInteger(-1);
            luaState.pop(1);
        }
        return iArr;
    }
}

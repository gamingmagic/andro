package p004o;

import java.util.ArrayList;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* renamed from: o.gl */
public final class C0373gl {

    /* renamed from: 櫯 */
    private static /* synthetic */ int[] f1023;

    /* renamed from: 鷭 */
    ArrayList<C0374if> f1024 = new ArrayList<>();

    /* renamed from: o.gl$if */
    class C0374if {

        /* renamed from: Ą */
        C0375 f1025;

        /* renamed from: ą */
        String f1026;

        /* renamed from: Ć */
        String f1027;

        /* renamed from: ć */
        int f1028;

        /* renamed from: ȃ */
        int f1029;

        /* renamed from: ˮ͈ */
        int f1030;

        /* renamed from: 櫯 */
        int f1032;

        /* renamed from: 鷭 */
        String f1033;

        C0374if() {
        }
    }

    /* renamed from: o.gl$櫯 */
    enum C0375 {
        NONE,
        BMP,
        SPRITE,
        SIGNBOARD
    }

    /* renamed from: o.gl$鷭 */
    enum C0376 {
        MAPNAME,
        CELLX,
        CELLY,
        HEIGHT,
        ICONID,
        FILEPATH,
        CONTENTS,
        CHARCOLOR
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m378() {
        /*
            int[] r0 = f1023
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.gl$鷭[] r0 = p004o.C0373gl.C0376.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.gl$鷭 r0 = p004o.C0373gl.C0376.CELLX     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.gl$鷭 r0 = p004o.C0373gl.C0376.CELLY     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.gl$鷭 r0 = p004o.C0373gl.C0376.CHARCOLOR     // Catch:{ NoSuchFieldError -> 0x002b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002b }
        L_0x002b:
            o.gl$鷭 r0 = p004o.C0373gl.C0376.CONTENTS     // Catch:{ NoSuchFieldError -> 0x0035 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            o.gl$鷭 r0 = p004o.C0373gl.C0376.FILEPATH     // Catch:{ NoSuchFieldError -> 0x003f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003f }
        L_0x003f:
            o.gl$鷭 r0 = p004o.C0373gl.C0376.HEIGHT     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            o.gl$鷭 r0 = p004o.C0373gl.C0376.ICONID     // Catch:{ NoSuchFieldError -> 0x0053 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            o.gl$鷭 r0 = p004o.C0373gl.C0376.MAPNAME     // Catch:{ NoSuchFieldError -> 0x005d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            f1023 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0373gl.m378():int[]");
    }

    C0373gl() {
    }

    C0373gl(byte[] bArr) {
        if (bArr.length > 0) {
            LuaState newLuaState = LuaStateFactory.newLuaState();
            try {
                C0591nr.m673(newLuaState, bArr);
                newLuaState.getGlobal("SignBoardList");
                if (!newLuaState.isTable(-1)) {
                    throw new IllegalArgumentException("SignBoardList is not a table");
                }
                newLuaState.pushNil();
                while (newLuaState.next(-2) != 0) {
                    C0374if ifVar = new C0374if();
                    if (!newLuaState.isTable(-1)) {
                        throw new IllegalArgumentException("SignBoardList entry is not a table");
                    }
                    newLuaState.pushNil();
                    int i = 0;
                    while (newLuaState.next(-2) != 0) {
                        if (i >= C0376.values().length) {
                            throw new IllegalArgumentException("SignBoardList entry contains unexpected fields count: >= " + C0376.values().length);
                        }
                        int i2 = i;
                        i++;
                        switch (m378()[C0376.values()[i2].ordinal()]) {
                            case 1:
                                ifVar.f1033 = C0591nr.m671(newLuaState, C0618op.LATIN);
                                break;
                            case 2:
                                ifVar.f1032 = newLuaState.toInteger(-1);
                                break;
                            case 3:
                                ifVar.f1030 = newLuaState.toInteger(-1);
                                break;
                            case 4:
                                ifVar.f1029 = newLuaState.toInteger(-1);
                                break;
                            case 5:
                                int integer = newLuaState.toInteger(-1);
                                if (integer >= 0 && integer < C0375.values().length) {
                                    ifVar.f1025 = C0375.values()[integer];
                                    break;
                                }
                            case 6:
                                ifVar.f1026 = C0591nr.m671(newLuaState, C0618op.KOREAN);
                                break;
                            case 7:
                                ifVar.f1027 = C0591nr.m671(newLuaState, C0618op.LOCAL);
                                break;
                            case 8:
                                String r5 = C0591nr.m671(newLuaState, C0618op.LATIN);
                                if (r5.startsWith("#0x")) {
                                    r5 = r5.substring(3);
                                }
                                ifVar.f1028 = (int) Long.parseLong(r5, 16);
                                break;
                        }
                        newLuaState.pop(1);
                    }
                    this.f1024.add(ifVar);
                    newLuaState.pop(1);
                }
                newLuaState.pop(1);
            } catch (C0589np e) {
                C0592ns.m674("c_signboardlist_db:" + e.toString());
            } catch (IllegalArgumentException e2) {
                C0592ns.m674("c_signboardlist_db:" + e2.toString());
            } finally {
                newLuaState.close();
            }
        }
    }
}

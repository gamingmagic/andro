package p004o;

import android.util.Log;
import com.libroserver.apk.R;
import java.util.HashMap;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* renamed from: o.lp */
final class C0532lp {

    /* renamed from: 鷭 */
    HashMap<Integer, C0533> f1675 = new HashMap<>();

    /* renamed from: o.lp$鷭 */
    class C0533 {

        /* renamed from: ˮ͈ */
        C1688 f1677;

        /* renamed from: 櫯 */
        String f1678;

        /* renamed from: 鷭 */
        String f1679;

        private C0533() {
        }

        /* synthetic */ C0533(C0532lp lpVar, C0533 r2) {
            this();
        }
    }

    /* renamed from: 鷭 */
    private void m590(C0248cl clVar) {
        byte[] bArr;
        LuaState newLuaState = LuaStateFactory.newLuaState();
        if (!C1014.f6140.f4531) {
            bArr = (byte[]) clVar.mo3613("data\\lua files\\datainfo\\weapontable.lub", false);
        } else {
            bArr = C1014.f6147.mo3388((int) R.raw.weapontable);
        }
        try {
            C0591nr.m673(newLuaState, bArr);
            newLuaState.getGlobal("WeaponNameTable");
            newLuaState.pushNil();
            while (newLuaState.next(-2) != 0) {
                int integer = newLuaState.toInteger(-2);
                C0533 r4 = new C0533(this, null);
                r4.f1679 = C0591nr.m671(newLuaState, C0618op.KOREAN);
                this.f1675.put(Integer.valueOf(integer), r4);
                newLuaState.pop(1);
            }
            newLuaState.pop(1);
            newLuaState.getGlobal("WeaponHitWaveNameTable");
            newLuaState.pushNil();
            while (newLuaState.next(-2) != 0) {
                int integer2 = newLuaState.toInteger(-2);
                C0533 r42 = (C0533) this.f1675.get(Integer.valueOf(integer2));
                if (r42 == null) {
                    String str = "No sprite for weapon type " + integer2;
                    Log.e("AndRO", str);
                    throw new C0588no(str);
                }
                r42.f1678 = C0591nr.m671(newLuaState, C0618op.KOREAN);
                if (integer2 >= 0 && integer2 < C1688.values().length) {
                    r42.f1677 = C1688.values()[integer2];
                }
                newLuaState.pop(1);
            }
            newLuaState.pop(1);
            newLuaState.getGlobal("Expansion_Weapon_IDs");
            if (!newLuaState.isNil(-1)) {
                newLuaState.pushNil();
                while (newLuaState.next(-2) != 0) {
                    int integer3 = newLuaState.toInteger(-2);
                    int integer4 = newLuaState.toInteger(-1);
                    if (integer4 < 0 || integer4 >= C1688.values().length) {
                        String str2 = "Invalid weapontype " + integer4 + " for weapon view " + integer3;
                        Log.e("AndRO", str2);
                        throw new C0588no(str2);
                    }
                    C0533 r5 = (C0533) this.f1675.get(Integer.valueOf(integer3));
                    if (r5 == null) {
                        String str3 = "No entry for weapon view " + integer3;
                        Log.e("AndRO", str3);
                        throw new C0588no(str3);
                    }
                    r5.f1677 = C1688.values()[integer4];
                    newLuaState.pop(1);
                }
            }
            newLuaState.close();
        } catch (C0589np e) {
            throw new C0590nq("npcidentity.lua", e.getMessage());
        }
    }

    public C0532lp(C0248cl clVar) {
        m590(clVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final String mo3973(C1688 r3) {
        if (r3 == null) {
            return null;
        }
        C0533 r32 = (C0533) this.f1675.get(Integer.valueOf(r3.ordinal()));
        if (r32 == null) {
            return null;
        }
        return r32.f1678;
    }
}

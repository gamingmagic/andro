package p004o;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: o.sv */
public class C0757sv {

    /* renamed from: ȃ */
    public HashMap<Integer, C0838ud> f4651;

    @Deprecated
    public C0757sv(C0838ud[] udVarArr, boolean z) {
        this.f4651 = new HashMap<>();
        if (z) {
            ByteBuffer allocate = ByteBuffer.allocate(32768);
            C0838ud[] udVarArr2 = udVarArr;
            int length = udVarArr.length;
            for (int i = 0; i < length; i++) {
                C0838ud udVar = udVarArr2[i];
                if (C0762sz.class.isAssignableFrom(udVar.getClass())) {
                    allocate.position(0);
                    ((C0762sz) udVar).mo4096(allocate);
                }
            }
        }
        C0838ud[] udVarArr3 = udVarArr;
        int length2 = udVarArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            C0838ud udVar2 = udVarArr3[i2];
            this.f4651.put(Integer.valueOf(C0622ot.m731(udVar2.mo4090())), udVar2);
        }
    }

    public C0757sv(C0838ud[] udVarArr) {
        this(udVarArr, false);
    }

    /* renamed from: 鷭 */
    public void mo3531(C0652pd pdVar, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: 鷭 */
    public void mo3530(C0652pd pdVar) {
        throw new UnsupportedOperationException();
    }
}

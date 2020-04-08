package p004o;

import android.util.Log;

/* renamed from: o.gm */
final class C0377gm implements Cloneable {

    /* renamed from: Ą */
    int f1048;

    /* renamed from: ą */
    boolean f1049;

    /* renamed from: ȃ */
    int f1050;

    /* renamed from: ˮ͈ */
    int f1051;

    /* renamed from: 櫯 */
    int f1052;

    /* renamed from: 鷭 */
    int f1053;

    C0377gm() {
    }

    C0377gm(int i, int i2, int i3, int i4, int i5, boolean z) {
        mo3751(i, i2, i3, i4, i5, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3751(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.f1053 = i;
        this.f1052 = i2;
        this.f1051 = i3;
        this.f1050 = i4;
        this.f1048 = i5;
        this.f1049 = z;
    }

    C0377gm(C0936xi xiVar) {
        this.f1053 = xiVar.f5621;
        this.f1052 = xiVar.f5620;
        this.f1051 = xiVar.f5618;
        this.f1050 = xiVar.f5614;
        this.f1048 = xiVar.f5615;
        this.f1049 = xiVar.f5617 != 0;
    }

    C0377gm(C0210be beVar) {
        this.f1053 = beVar.f481;
        this.f1052 = beVar.f480;
        this.f1051 = beVar.f478;
        this.f1050 = beVar.f474;
        this.f1048 = beVar.f475;
        this.f1049 = beVar.f477 != 0;
    }

    C0377gm(C0211bf bfVar) {
        this.f1053 = bfVar.f488;
        this.f1052 = bfVar.f487;
        this.f1051 = bfVar.f486;
        this.f1050 = bfVar.f485;
        this.f1048 = bfVar.f482;
        this.f1049 = bfVar.f484 != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0377gm mo3750() {
        try {
            return (C0377gm) clone();
        } catch (CloneNotSupportedException e) {
            Log.e("AndRO", e.toString());
            RuntimeException runtimeException = new RuntimeException(e.toString());
            runtimeException.setStackTrace(e.getStackTrace());
            throw runtimeException;
        }
    }
}

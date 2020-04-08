package p004o;

import android.support.p000v4.internal.view.SupportMenu;

/* renamed from: o.zh */
public final class C0995zh extends C0992zf {

    /* renamed from: ȃ */
    private int f5981;

    /* renamed from: ˮ͈ */
    private int f5982;

    /* renamed from: 櫯 */
    private int f5983;

    /* renamed from: 鷭 */
    private int f5984;

    public C0995zh(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: 鷭 */
    public final void mo4217(C0995zh zhVar) {
        C0995zh zhVar2 = new C0995zh(this.f5971);
        int r4 = zhVar.mo4202();
        this.f5981 = r4;
        if (this.f5971 != null) {
            C0947xs.m1642(this.f5971, this.f5972 + 8, r4);
        }
        if (this.f5971 != null) {
            this.f5981 = C0947xs.m1640(this.f5971, this.f5972 + 8);
        }
        zhVar2.mo4193(this.f5981);
        C0995zh zhVar3 = zhVar2;
        if (zhVar2.f5971 != null) {
            zhVar3.f5982 = C0947xs.m1640(zhVar3.f5971, zhVar3.f5972 + 4);
        }
        int i = zhVar3.f5982;
        this.f5982 = i;
        if (this.f5971 != null) {
            C0947xs.m1642(this.f5971, this.f5972 + 4, i);
        }
        int r42 = mo4202();
        C0995zh zhVar4 = zhVar2;
        zhVar2.f5982 = r42;
        if (zhVar4.f5971 != null) {
            C0947xs.m1642(zhVar4.f5971, zhVar4.f5972 + 4, r42);
        }
        if (this.f5971 != null) {
            this.f5982 = C0947xs.m1640(this.f5971, this.f5972 + 4);
        }
        zhVar2.mo4193(this.f5982);
        int r43 = mo4202();
        C0995zh zhVar5 = zhVar2;
        zhVar2.f5981 = r43;
        if (zhVar5.f5971 != null) {
            C0947xs.m1642(zhVar5.f5971, zhVar5.f5972 + 8, r43);
        }
    }

    /* renamed from: 鷭 */
    public final void mo4215() {
        C0995zh zhVar = new C0995zh(this.f5971);
        if (this.f5971 != null) {
            this.f5981 = C0947xs.m1640(this.f5971, this.f5972 + 8);
        }
        zhVar.mo4193(this.f5981);
        if (this.f5971 != null) {
            this.f5982 = C0947xs.m1640(this.f5971, this.f5972 + 4);
        }
        int i = this.f5982;
        C0995zh zhVar2 = zhVar;
        zhVar.f5982 = i;
        if (zhVar2.f5971 != null) {
            C0947xs.m1642(zhVar2.f5971, zhVar2.f5972 + 4, i);
        }
        if (this.f5971 != null) {
            this.f5982 = C0947xs.m1640(this.f5971, this.f5972 + 4);
        }
        zhVar.mo4193(this.f5982);
        if (this.f5971 != null) {
            this.f5981 = C0947xs.m1640(this.f5971, this.f5972 + 8);
        }
        int i2 = this.f5981;
        C0995zh zhVar3 = zhVar;
        zhVar.f5981 = i2;
        if (zhVar3.f5971 != null) {
            C0947xs.m1642(zhVar3.f5971, zhVar3.f5972 + 8, i2);
        }
    }

    /* renamed from: 櫯 */
    public final int mo4213() {
        if (this.f5971 != null) {
            this.f5982 = C0947xs.m1640(this.f5971, this.f5972 + 4);
        }
        return this.f5982;
    }

    /* renamed from: 櫯 */
    public final void mo4214(C0995zh zhVar) {
        int r3 = zhVar.mo4202();
        this.f5982 = r3;
        if (this.f5971 != null) {
            C0947xs.m1642(this.f5971, this.f5972 + 4, r3);
        }
    }

    /* renamed from: ȃ */
    public final int mo4211() {
        if (this.f5971 != null) {
            byte[] bArr = this.f5971;
            int i = this.f5972 + 2;
            this.f5983 = ((short) (((short) (((short) ((bArr[i + 1] & 255) + 0)) << 8)) + (bArr[i] & 255))) & 65535;
        }
        return this.f5983;
    }

    /* renamed from: 鷭 */
    public final void mo4216(int i) {
        this.f5983 = 65535 & i;
        if (this.f5971 != null) {
            byte[] bArr = this.f5971;
            int i2 = this.f5972 + 2;
            short s = (short) i;
            byte[] bArr2 = bArr;
            bArr[i2 + 1] = (byte) (s >>> 8);
            bArr2[i2] = (byte) (s & 255);
        }
    }

    /* renamed from: ˮ͈ */
    public final void mo4212(C0995zh zhVar) {
        int r3 = zhVar.mo4202();
        this.f5981 = r3;
        if (this.f5971 != null) {
            C0947xs.m1642(this.f5971, this.f5972 + 8, r3);
        }
    }

    /* renamed from: Ą */
    public final int mo4209() {
        if (this.f5971 != null) {
            byte[] bArr = this.f5971;
            int i = this.f5972;
            this.f5984 = ((short) (((short) (((short) ((bArr[i + 1] & 255) + 0)) << 8)) + (bArr[i] & 255))) & 65535;
        }
        return this.f5984;
    }

    /* renamed from: ą */
    public final void mo4210() {
        this.f5984 = SupportMenu.USER_MASK;
        if (this.f5971 != null) {
            byte[] bArr = this.f5971;
            int i = this.f5972;
            bArr[i + 1] = -1;
            bArr[i] = -1;
        }
    }
}

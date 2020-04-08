package p004o;

/* renamed from: o.zm */
public class C1000zm {

    /* renamed from: ܕ */
    static final /* synthetic */ boolean f5992 = (!C1000zm.class.desiredAssertionStatus());

    /* renamed from: 鷭 */
    public static final int f5993 = Math.max(C0991ze.f5958, 12);

    /* renamed from: Ą */
    int f5994;

    /* renamed from: ą */
    int f5995;

    /* renamed from: Ć */
    int f5996;

    /* renamed from: ć */
    int f5997;

    /* renamed from: ċ */
    int f5998;

    /* renamed from: đ */
    private C0996zi f5999 = null;

    /* renamed from: Ē */
    private C0995zh f6000 = null;

    /* renamed from: ē */
    private C0995zh f6001 = null;

    /* renamed from: ȃ */
    int[] f6002 = new int[128];

    /* renamed from: Ȋ */
    int f6003;

    /* renamed from: ˮ͈ */
    int[] f6004 = new int[38];

    /* renamed from: ˮ͍ */
    final C0996zi[] f6005 = new C0996zi[38];

    /* renamed from: 䒧 */
    byte[] f6006;

    /* renamed from: 岱 */
    int f6007;

    /* renamed from: 庸 */
    private int f6008;

    /* renamed from: 櫯 */
    int f6009 = 0;

    /* renamed from: 纫 */
    int f6010;

    /* renamed from: 躆 */
    int f6011;

    /* renamed from: 띥 */
    private C0995zh f6012 = null;

    static {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4244(int i, int i2) {
        C0996zi ziVar = this.f5999;
        ziVar.mo4193(i);
        ziVar.mo4220(this.f6005[i2].mo4219());
        this.f6005[i2].mo4221(ziVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final int mo4242(int i) {
        int r2 = this.f6005[i].mo4219();
        C0996zi ziVar = this.f5999;
        ziVar.mo4193(r2);
        this.f6005[i].mo4220(ziVar.mo4219());
        return r2;
    }

    /* renamed from: 櫯 */
    static int m1773(int i) {
        return f5993 * i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4245(int i, int i2, int i3) {
        int i4 = this.f6004[i2] - this.f6004[i3];
        int i5 = i + (f5993 * this.f6004[i3]);
        int[] iArr = this.f6004;
        int i6 = this.f6002[i4 - 1];
        if (iArr[i6] != i4) {
            int i7 = i6 - 1;
            mo4244(i5, i7);
            int i8 = this.f6004[i7];
            i5 += f5993 * i8;
            i4 -= i8;
        }
        mo4244(i5, this.f6002[i4 - 1]);
    }

    /* renamed from: 鷭 */
    public final void mo4243() {
        if (this.f6009 != 0) {
            this.f6009 = 0;
            this.f6006 = null;
            this.f5995 = 1;
            this.f5999 = null;
            this.f6000 = null;
            this.f6001 = null;
            this.f6012 = null;
        }
    }

    /* renamed from: ˮ͈ */
    public final boolean mo4239(int i) {
        int i2 = i << 20;
        if (this.f6009 == i2) {
            return true;
        }
        mo4243();
        int i3 = ((i2 / 12) * f5993) + f5993;
        int i4 = i3 + 1 + 152;
        this.f6008 = i4;
        int i5 = i4 + 12;
        this.f6006 = new byte[i5];
        this.f5995 = 1;
        this.f5998 = (this.f5995 + i3) - f5993;
        this.f6009 = i2;
        this.f6011 = this.f5995 + i3;
        if (f5992 || i5 - this.f6008 == 12) {
            int i6 = 0;
            int i7 = this.f6011;
            while (i6 < this.f6005.length) {
                this.f6005[i6] = new C0996zi(this.f6006);
                this.f6005[i6].mo4193(i7);
                i6++;
                i7 += 4;
            }
            this.f5999 = new C0996zi(this.f6006);
            this.f6000 = new C0995zh(this.f6006);
            this.f6001 = new C0995zh(this.f6006);
            this.f6012 = new C0995zh(this.f6006);
            return true;
        }
        throw new AssertionError(new StringBuilder(String.valueOf(i5)).append(" ").append(this.f6008).append(" 12").toString());
    }

    /* renamed from: Ą */
    private int m1772(int i) {
        if (this.f5994 == 0) {
            this.f5994 = 255;
            C0995zh zhVar = this.f6000;
            zhVar.mo4193(this.f6008);
            C0995zh zhVar2 = this.f6001;
            C0995zh zhVar3 = this.f6012;
            if (this.f5996 != this.f5997) {
                this.f6006[this.f5996] = 0;
            }
            zhVar.mo4212(zhVar);
            zhVar.mo4214(zhVar);
            for (int i2 = 0; i2 < 38; i2++) {
                while (this.f6005[i2].mo4219() != 0) {
                    zhVar2.mo4193(mo4242(i2));
                    zhVar2.mo4217(zhVar);
                    zhVar2.mo4210();
                    zhVar2.mo4216(this.f6004[i2]);
                }
            }
            zhVar2.mo4193(zhVar.mo4213());
            while (zhVar2.mo4202() != zhVar.mo4202()) {
                zhVar3.mo4193(zhVar2.mo4202() + (f5993 * zhVar2.mo4211()));
                while (zhVar3.mo4209() == 65535 && zhVar2.mo4211() + zhVar3.mo4211() < 65536) {
                    zhVar3.mo4215();
                    zhVar2.mo4216(zhVar2.mo4211() + zhVar3.mo4211());
                    zhVar3.mo4193(zhVar2.mo4202() + (f5993 * zhVar2.mo4211()));
                }
                zhVar2.mo4193(zhVar2.mo4213());
            }
            zhVar2.mo4193(zhVar.mo4213());
            while (zhVar2.mo4202() != zhVar.mo4202()) {
                zhVar2.mo4215();
                int r8 = zhVar2.mo4211();
                while (r8 > 128) {
                    mo4244(zhVar2.mo4202(), 37);
                    r8 -= 128;
                    zhVar2.mo4193(zhVar2.mo4202() + (f5993 * 128));
                }
                int[] iArr = this.f6004;
                int i3 = this.f6002[r8 - 1];
                if (iArr[i3] != r8) {
                    i3--;
                    int i4 = r8 - this.f6004[i3];
                    mo4244(zhVar2.mo4202() + (f5993 * (r8 - i4)), i4 - 1);
                }
                mo4244(zhVar2.mo4202(), i3);
                zhVar2.mo4193(zhVar.mo4213());
            }
            if (this.f6005[i].mo4219() != 0) {
                return mo4242(i);
            }
        }
        int i5 = i;
        do {
            i5++;
            if (i5 == 38) {
                this.f5994--;
                int i6 = f5993 * this.f6004[i];
                int i7 = this.f6004[i] * 12;
                if (this.f6010 - this.f6007 <= i7) {
                    return 0;
                }
                this.f6010 -= i7;
                this.f6003 -= i6;
                return this.f6003;
            }
        } while (this.f6005[i5].mo4219() == 0);
        int r4 = mo4242(i5);
        mo4245(r4, i5, i);
        return r4;
    }

    /* renamed from: ȃ */
    public final int mo4238(int i) {
        int i2 = this.f6002[i - 1];
        if (this.f6005[i2].mo4219() != 0) {
            return mo4242(i2);
        }
        int i3 = this.f5996;
        this.f5996 += f5993 * this.f6004[i2];
        if (this.f5996 <= this.f5997) {
            return i3;
        }
        this.f5996 -= f5993 * this.f6004[i2];
        return m1772(i2);
    }

    /* renamed from: 櫯 */
    public final int mo4240() {
        if (this.f5997 != this.f5996) {
            int i = this.f5997 - f5993;
            this.f5997 = i;
            return i;
        } else if (this.f6005[0].mo4219() != 0) {
            return mo4242(0);
        } else {
            return m1772(0);
        }
    }

    /* renamed from: 櫯 */
    public final int mo4241(int i, int i2) {
        int i3 = this.f6002[i2 - 1];
        if (i3 == this.f6002[(i2 - 1) + 1]) {
            return i;
        }
        int r4 = mo4238(i2 + 1);
        if (r4 != 0) {
            byte[] bArr = this.f6006;
            System.arraycopy(bArr, i, bArr, r4, f5993 * i2);
            mo4244(i, i3);
        }
        return r4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubAllocator[");
        sb.append("\n  subAllocatorSize=");
        sb.append(this.f6009);
        sb.append("\n  glueCount=");
        sb.append(this.f5994);
        sb.append("\n  heapStart=");
        sb.append(this.f5995);
        sb.append("\n  loUnit=");
        sb.append(this.f5996);
        sb.append("\n  hiUnit=");
        sb.append(this.f5997);
        sb.append("\n  pText=");
        sb.append(this.f6007);
        sb.append("\n  unitsStart=");
        sb.append(this.f6003);
        sb.append("\n]");
        return sb.toString();
    }
}

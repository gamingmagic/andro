package p004o;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import p004o.C0942xo.C0943;

/* renamed from: o.yo */
public final class C0974yo {

    /* renamed from: Ą */
    public C0961yb f5782;

    /* renamed from: ą */
    public boolean f5783;

    /* renamed from: Ć */
    public boolean f5784;

    /* renamed from: ć */
    public boolean f5785;

    /* renamed from: ċ */
    public long f5786;

    /* renamed from: đ */
    public long f5787;

    /* renamed from: Ē */
    public int f5788;

    /* renamed from: ē */
    public int f5789;

    /* renamed from: ȃ */
    public OutputStream f5790;

    /* renamed from: Ȋ */
    public long f5791;

    /* renamed from: ˮ͈ */
    public boolean f5792;

    /* renamed from: ˮ͍ */
    public long f5793;

    /* renamed from: ܕ */
    public long f5794;

    /* renamed from: 㥳 */
    private InputStream f5795;

    /* renamed from: 䒧 */
    public long f5796;

    /* renamed from: 岱 */
    public long f5797;

    /* renamed from: 庸 */
    public long f5798;

    /* renamed from: 櫯 */
    public boolean f5799;

    /* renamed from: 纫 */
    public long f5800;

    /* renamed from: 躆 */
    public long f5801;

    /* renamed from: 鷭 */
    public long f5802;

    /* renamed from: 띥 */
    private final C0937xj f5803;

    public C0974yo(C0937xj xjVar) {
        this.f5803 = xjVar;
    }

    /* renamed from: 鷭 */
    public final void mo4167(C0961yb ybVar) {
        long r6 = ybVar.mo4143() + ((long) ybVar.mo4146());
        this.f5802 = ybVar.f5719;
        long j = r6;
        this.f5795 = new C0949xu(this.f5803.f5636, j, this.f5802 + j);
        this.f5782 = ybVar;
        this.f5786 = 0;
        this.f5791 = 0;
        this.f5787 = -1;
    }

    /* renamed from: 鷭 */
    public final int mo4166(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (((long) i2) > this.f5802) {
                i3 = (int) this.f5802;
            } else {
                i3 = i2;
            }
            i4 = this.f5795.read(bArr, i, i3);
            if (i4 >= 0) {
                if (this.f5782.mo4158()) {
                    this.f5787 = (long) C0941xn.m1633((int) this.f5787, bArr, i, i4);
                }
                this.f5786 += (long) i4;
                i5 += i4;
                i += i4;
                i2 -= i4;
                this.f5802 -= (long) i4;
                C0937xj xjVar = this.f5803;
                int i6 = i4;
                if (i6 > 0) {
                    xjVar.f5632 += (long) i6;
                    if (xjVar.f5634 != null) {
                        xjVar.f5634.mo4116(xjVar.f5632, xjVar.f5628);
                    }
                }
                if (this.f5802 != 0 || !this.f5782.mo4158()) {
                    break;
                }
                C0944xp r7 = this.f5803.f5633.mo4133(this.f5803, this.f5803.f5630);
                if (r7 == null) {
                    this.f5785 = true;
                    return -1;
                }
                C0961yb ybVar = this.f5782;
                if (ybVar.f5715 < 20 || ybVar.f5710 == -1 || this.f5787 == ((long) (ybVar.f5710 ^ -1))) {
                    C0938xk xkVar = this.f5803.f5634;
                    if (xkVar != null) {
                        xkVar.mo4117(r7);
                        return -1;
                    }
                    this.f5803.mo4130(r7);
                    C0961yb r8 = this.f5803.mo4129();
                    if (r8 == null) {
                        return -1;
                    }
                    mo4167(r8);
                } else {
                    throw new C0942xo(C0943.crcError);
                }
            } else {
                throw new EOFException();
            }
        }
        if (i4 != -1) {
            i4 = i5;
        }
        return i4;
    }

    /* renamed from: 櫯 */
    public final void mo4165(byte[] bArr, int i, int i2) {
        if (!this.f5799) {
            this.f5790.write(bArr, i, i2);
        }
        this.f5800 += (long) i2;
        if (!this.f5792) {
            if (this.f5803.f5625.f5736) {
                byte[] bArr2 = bArr;
                short s = (short) ((int) this.f5798);
                for (int i3 = 0; i3 < Math.min(bArr2.length, i2); i3++) {
                    short s2 = (short) (((short) (((short) (bArr2[i3] & 255)) + s)) & -1);
                    s = (short) (((s2 << 1) | (s2 >>> 15)) & -1);
                }
                this.f5798 = (long) s;
                return;
            }
            this.f5798 = (long) C0941xn.m1633((int) this.f5798, bArr, i, i2);
        }
    }
}

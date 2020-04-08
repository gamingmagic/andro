package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.zd */
public final class C0990zd {

    /* renamed from: 㥳 */
    private static int[] f5923 = {15581, 7999, 22975, 18675, 25761, 23228, 26162, 24657};

    /* renamed from: Ą */
    int f5924;

    /* renamed from: ą */
    int f5925;

    /* renamed from: Ć */
    int f5926;

    /* renamed from: ć */
    int f5927;

    /* renamed from: ċ */
    int[] f5928 = new int[256];

    /* renamed from: đ */
    public C1000zm f5929 = new C1000zm();

    /* renamed from: Ē */
    private C0991ze f5930 = null;

    /* renamed from: ē */
    private C0991ze f5931 = null;

    /* renamed from: Ė */
    private final C0998zk f5932 = new C0998zk(null);

    /* renamed from: ė */
    private final C0998zk f5933 = new C0998zk(null);

    /* renamed from: Ę */
    private final C0998zk f5934 = new C0998zk(null);

    /* renamed from: ę */
    private final C0998zk f5935 = new C0998zk(null);

    /* renamed from: ȃ */
    int f5936;

    /* renamed from: Ȋ */
    int[] f5937 = new int[256];

    /* renamed from: Ƞ */
    private final int[] f5938 = new int[64];

    /* renamed from: ˮ͈ */
    C0998zk f5939;

    /* renamed from: ˮ͍ */
    int[] f5940 = new int[256];

    /* renamed from: ܕ */
    int[][] f5941 = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{128, 64}));

    /* renamed from: ঽ্ */
    private final C0991ze f5942 = new C0991ze(null);

    /* renamed from: 㱽 */
    private final C0991ze f5943 = new C0991ze(null);

    /* renamed from: 㵼 */
    private final C0991ze f5944 = new C0991ze(null);

    /* renamed from: 䒧 */
    int f5945;

    /* renamed from: 囃 */
    private final C0999zl f5946 = new C0999zl();

    /* renamed from: 岱 */
    int[] f5947 = new int[256];

    /* renamed from: 庸 */
    C0993zg f5948 = new C0993zg();

    /* renamed from: 廂 */
    private final C0999zl f5949 = new C0999zl();

    /* renamed from: 廅 */
    private final C0991ze f5950 = new C0991ze(null);

    /* renamed from: 櫯 */
    C0997zj f5951;

    /* renamed from: 纫 */
    int f5952;

    /* renamed from: 躆 */
    int f5953;

    /* renamed from: 鷭 */
    C0997zj[][] f5954 = ((C0997zj[][]) Array.newInstance(C0997zj.class, new int[]{25, 16}));

    /* renamed from: 띥 */
    private int f5955;

    static {
    }

    /* renamed from: 櫯 */
    private void m1721() {
        Arrays.fill(this.f5940, 0);
        C1000zm zmVar = this.f5929;
        Arrays.fill(zmVar.f6006, zmVar.f6011, zmVar.f6011 + (zmVar.f6005.length * 4), 0);
        zmVar.f6007 = zmVar.f5995;
        int i = ((zmVar.f6009 / 8) / 12) * 7 * 12;
        int i2 = (i / 12) * C1000zm.f5993;
        int i3 = zmVar.f6009 - i;
        int i4 = ((i3 / 12) * C1000zm.f5993) + (i3 % 12);
        zmVar.f5997 = zmVar.f5995 + zmVar.f6009;
        int i5 = zmVar.f5995 + i4;
        zmVar.f6003 = i5;
        zmVar.f5996 = i5;
        zmVar.f6010 = zmVar.f5995 + i3;
        zmVar.f5997 = zmVar.f5996 + i2;
        int i6 = 0;
        int i7 = 1;
        while (i6 < 4) {
            zmVar.f6004[i6] = i7 & 255;
            i6++;
            i7++;
        }
        int i8 = i7 + 1;
        while (i6 < 8) {
            zmVar.f6004[i6] = i8 & 255;
            i6++;
            i8 += 2;
        }
        int i9 = i8 + 1;
        while (i6 < 12) {
            zmVar.f6004[i6] = i9 & 255;
            i6++;
            i9 += 3;
        }
        int i10 = i9 + 1;
        while (i6 < 38) {
            zmVar.f6004[i6] = i10 & 255;
            i6++;
            i10 += 4;
        }
        zmVar.f5994 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 128; i12++) {
            i11 += zmVar.f6004[i11] < i12 + 1 ? 1 : 0;
            zmVar.f6002[i12] = i11 & 255;
        }
        this.f5927 = (-(this.f5955 < 12 ? this.f5955 : 12)) - 1;
        int r5 = this.f5929.mo4240();
        this.f5930.mo4193(r5);
        this.f5931.mo4193(r5);
        this.f5930.mo4196(0);
        this.f5925 = this.f5955;
        this.f5930.mo4200(256);
        this.f5930.f5967.mo4187(this.f5930.mo4198() + 1);
        int r52 = this.f5929.mo4238(128);
        this.f5939.mo4193(r52);
        this.f5930.f5967.mo4181a_(r52);
        C0998zk zkVar = new C0998zk(this.f5929.f6006);
        int r53 = this.f5930.f5967.mo4183();
        this.f5926 = this.f5927;
        this.f5945 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            zkVar.mo4193((i13 * 6) + r53);
            zkVar.mo4234(i13);
            zkVar.mo4231(1);
            zkVar.mo4226(0);
        }
        for (int i14 = 0; i14 < 128; i14++) {
            for (int i15 = 0; i15 < 8; i15++) {
                for (int i16 = 0; i16 < 64; i16 += 8) {
                    this.f5941[i14][i15 + i16] = 16384 - (f5923[i15] / (i14 + 2));
                }
            }
        }
        for (int i17 = 0; i17 < 25; i17++) {
            for (int i18 = 0; i18 < 16; i18++) {
                C0997zj zjVar = this.f5954[i17][i18];
                int i19 = (i17 * 5) + 10;
                zjVar.f5987 = 3;
                zjVar.f5988 = (i19 << zjVar.f5987) & SupportMenu.USER_MASK;
                zjVar.f5986 = 4;
            }
        }
    }

    /* renamed from: 鷭 */
    private void m1723(int i) {
        this.f5952 = 1;
        this.f5955 = i;
        m1721();
        this.f5937[0] = 0;
        this.f5937[1] = 2;
        for (int i2 = 0; i2 < 9; i2++) {
            this.f5937[i2 + 2] = 4;
        }
        for (int i3 = 0; i3 < 245; i3++) {
            this.f5937[i3 + 11] = 6;
        }
        int i4 = 0;
        while (i4 < 3) {
            this.f5947[i4] = i4;
            i4++;
        }
        int i5 = 3;
        int i6 = 1;
        int i7 = 1;
        while (i4 < 256) {
            this.f5947[i4] = i5;
            i6--;
            if (i6 == 0) {
                i7++;
                i6 = i7;
                i5++;
            }
            i4++;
        }
        for (int i8 = 0; i8 < 64; i8++) {
            this.f5928[i8] = 0;
        }
        for (int i9 = 0; i9 < 192; i9++) {
            this.f5928[i9 + 64] = 8;
        }
        this.f5951.f5987 = 7;
    }

    /* renamed from: 鷭 */
    public final boolean mo4191(C0975yp ypVar) {
        int r3 = ypVar.mo4168() & 255;
        boolean z = (r3 & 32) != 0;
        int i = 0;
        if (z) {
            i = ypVar.mo4168();
        } else if (this.f5929.f6009 == 0) {
            return false;
        }
        if ((r3 & 64) != 0) {
            ypVar.f5810 = ypVar.mo4168();
        }
        this.f5948.mo4207(ypVar);
        if (z) {
            int i2 = (r3 & 31) + 1;
            if (i2 > 16) {
                i2 = ((i2 - 16) * 3) + 16;
            }
            if (i2 == 1) {
                this.f5929.mo4243();
                return false;
            }
            this.f5929.mo4239(i + 1);
            this.f5930 = new C0991ze(this.f5929.f6006);
            this.f5931 = new C0991ze(this.f5929.f6006);
            this.f5939 = new C0998zk(this.f5929.f6006);
            this.f5951 = new C0997zj();
            for (int i3 = 0; i3 < 25; i3++) {
                for (int i4 = 0; i4 < 16; i4++) {
                    this.f5954[i3][i4] = new C0997zj();
                }
            }
            m1723(i2);
        }
        return this.f5930.mo4202() != 0;
    }

    /* renamed from: 鷭 */
    public final int mo4190() {
        if (this.f5930.mo4202() <= this.f5929.f6007 || this.f5930.mo4202() > this.f5929.f5998) {
            return -1;
        }
        if (this.f5930.mo4198() == 1) {
            this.f5930.mo4201(this);
        } else if (this.f5930.f5967.mo4183() <= this.f5929.f6007 || this.f5930.f5967.mo4183() > this.f5929.f5998) {
            return -1;
        } else {
            if (!this.f5930.mo4194(this)) {
                return -1;
            }
        }
        this.f5948.mo4205();
        while (this.f5939.mo4202() == 0) {
            this.f5948.mo4204();
            do {
                this.f5925++;
                this.f5930.mo4193(this.f5930.mo4195());
                if (this.f5930.mo4202() <= this.f5929.f6007 || this.f5930.mo4202() > this.f5929.f5998) {
                    return -1;
                }
            } while (this.f5930.mo4198() == this.f5936);
            if (!this.f5930.mo4197(this)) {
                return -1;
            }
            this.f5948.mo4205();
        }
        int r2 = this.f5939.mo4232();
        if (this.f5925 != 0 || this.f5939.mo4228() <= this.f5929.f6007) {
            m1720();
            if (this.f5952 == 0) {
                this.f5952 = 1;
                Arrays.fill(this.f5940, 0);
            }
        } else {
            int r3 = this.f5939.mo4228();
            this.f5930.mo4193(r3);
            this.f5931.mo4193(r3);
        }
        this.f5948.mo4204();
        return r2;
    }

    /* renamed from: 鷭 */
    private int m1722(boolean z, C0998zk zkVar) {
        C0999zl zlVar = this.f5946;
        C0998zk r4 = this.f5932.mo4233(this.f5929.f6006);
        C0991ze r5 = this.f5942.mo4199(this.f5929.f6006);
        r5.mo4193(this.f5930.mo4202());
        C0991ze r6 = this.f5950.mo4199(this.f5929.f6006);
        r6.mo4193(this.f5939.mo4228());
        C0998zk r7 = this.f5933.mo4233(this.f5929.f6006);
        int i = 0;
        boolean z2 = false;
        if (!z) {
            i = 0 + 1;
            this.f5938[0] = this.f5939.mo4202();
            if (r5.mo4195() == 0) {
                z2 = true;
            }
        }
        if (!z2) {
            boolean z3 = false;
            if (zkVar.mo4202() != 0) {
                r7.mo4193(zkVar.mo4202());
                r5.mo4193(r5.mo4195());
                z3 = true;
            }
            while (true) {
                if (!z3) {
                    r5.mo4193(r5.mo4195());
                    if (r5.mo4198() != 1) {
                        r7.mo4193(r5.f5967.mo4183());
                        if (r7.mo4232() != this.f5939.mo4232()) {
                            do {
                                r7.mo4227();
                            } while (r7.mo4232() != this.f5939.mo4232());
                        }
                    } else {
                        r7.mo4193(r5.f5962.mo4202());
                    }
                }
                z3 = false;
                if (r7.mo4228() == r6.mo4202()) {
                    int i2 = i;
                    i++;
                    this.f5938[i2] = r7.mo4202();
                    if (r5.mo4195() == 0) {
                        break;
                    }
                } else {
                    r5.mo4193(r7.mo4228());
                    break;
                }
            }
        }
        if (i == 0) {
            return r5.mo4202();
        }
        zlVar.f5991 = this.f5929.f6006[r6.mo4202()] & 255;
        zlVar.f5989 = r6.mo4202() + 1;
        if (r5.mo4198() == 1) {
            zlVar.f5990 = r5.f5962.mo4230() & 255;
        } else if (r5.mo4202() <= this.f5929.f6007) {
            return 0;
        } else {
            r7.mo4193(r5.f5967.mo4183());
            if (r7.mo4232() != zlVar.f5991) {
                do {
                    r7.mo4227();
                } while (r7.mo4232() != zlVar.f5991);
            }
            int r13 = r7.mo4230() - 1;
            int r14 = (r5.f5967.mo4185() - r5.mo4198()) - r13;
            int i3 = r13 * 2 <= r14 ? r13 * 5 > r14 ? 1 : 0 : (((r13 * 2) + (r14 * 3)) - 1) / (r14 * 2);
            zlVar.f5990 = (i3 + 1) & 255;
        }
        do {
            i--;
            r4.mo4193(this.f5938[i]);
            C0999zl zlVar2 = zlVar;
            C0998zk zkVar2 = r4;
            C0991ze zeVar = r5;
            byte[] bArr = this.f5929.f6006;
            C0991ze zeVar2 = r5;
            if (r5.f5959 == null) {
                zeVar2.f5959 = new C0991ze(null);
            }
            C0991ze r9 = zeVar2.f5959.mo4199(bArr);
            r9.mo4193(this.f5929.mo4240());
            if (r9 != null) {
                r9.mo4200(1);
                C0998zk zkVar3 = r9.f5962;
                C0999zl zlVar3 = zlVar2;
                zkVar3.mo4234(zlVar3.f5991);
                zkVar3.mo4231(zlVar3.f5990);
                zkVar3.mo4226(zlVar3.f5989);
                r9.mo4196(zeVar.mo4202());
                zkVar2.mo4226(r9.mo4202());
            }
            r5.mo4193(r9.mo4202());
            if (r5.mo4202() == 0) {
                return 0;
            }
        } while (i != 0);
        return r5.mo4202();
    }

    /* renamed from: ˮ͈ */
    private void m1720() {
        int i;
        C0999zl zlVar = this.f5949;
        C0999zl zlVar2 = zlVar;
        C0998zk zkVar = this.f5939;
        zlVar.f5990 = zkVar.mo4230() & 255;
        zlVar.f5989 = zkVar.mo4228();
        zlVar.f5991 = zkVar.mo4232() & 255;
        C0998zk r5 = this.f5934.mo4233(this.f5929.f6006);
        C0998zk r6 = this.f5935.mo4233(this.f5929.f6006);
        C0991ze r7 = this.f5944.mo4199(this.f5929.f6006);
        C0991ze r8 = this.f5943.mo4199(this.f5929.f6006);
        r7.mo4193(this.f5930.mo4195());
        if (zlVar2.f5990 < 31 && r7.mo4202() != 0) {
            if (r7.mo4198() != 1) {
                r5.mo4193(r7.f5967.mo4183());
                if (r5.mo4232() != zlVar2.f5991) {
                    do {
                        r5.mo4227();
                    } while (r5.mo4232() != zlVar2.f5991);
                    r6.mo4193(r5.mo4202() - 6);
                    if (r5.mo4230() >= r6.mo4230()) {
                        C0998zk.m1760(r5, r6);
                        r5.mo4225();
                    }
                }
                if (r5.mo4230() < 115) {
                    r5.mo4229(2);
                    r7.f5967.mo4184(2);
                }
            } else {
                r5.mo4193(r7.f5962.mo4202());
                if (r5.mo4230() < 32) {
                    r5.mo4229(1);
                }
            }
        }
        if (this.f5925 == 0) {
            this.f5939.mo4226(m1722(true, r5));
            this.f5930.mo4193(this.f5939.mo4228());
            this.f5931.mo4193(this.f5939.mo4228());
            if (this.f5930.mo4202() == 0) {
                m1721();
                this.f5952 = 0;
                return;
            }
            return;
        }
        this.f5929.f6006[this.f5929.f6007] = (byte) zlVar2.f5991;
        this.f5929.f6007++;
        r8.mo4193(this.f5929.f6007);
        if (this.f5929.f6007 >= this.f5929.f6010) {
            m1721();
            this.f5952 = 0;
            return;
        }
        if (zlVar2.f5989 != 0) {
            if (zlVar2.f5989 <= this.f5929.f6007) {
                zlVar2.f5989 = m1722(false, r5);
                if (zlVar2.f5989 == 0) {
                    m1721();
                    this.f5952 = 0;
                    return;
                }
            }
            int i2 = this.f5925 - 1;
            this.f5925 = i2;
            if (i2 == 0) {
                r8.mo4193(zlVar2.f5989);
                if (this.f5931.mo4202() != this.f5930.mo4202()) {
                    this.f5929.f6007--;
                }
            }
        } else {
            this.f5939.mo4226(r8.mo4202());
            zlVar2.f5989 = this.f5930.mo4202();
        }
        int r9 = this.f5930.mo4198();
        int r12 = (this.f5930.f5967.mo4185() - r9) - (zlVar2.f5990 - 1);
        r7.mo4193(this.f5931.mo4202());
        while (r7.mo4202() != this.f5930.mo4202()) {
            int r62 = r7.mo4198();
            if (r62 != 1) {
                if ((r62 & 1) == 0) {
                    r7.f5967.mo4181a_(this.f5929.mo4241(r7.f5967.mo4183(), r62 >>> 1));
                    if (r7.f5967.mo4183() == 0) {
                        m1721();
                        this.f5952 = 0;
                        return;
                    }
                }
                r7.f5967.mo4184((r62 * 2 < r9 ? 1 : 0) + (((r62 * 4 <= r9 ? 1 : 0) & (r7.f5967.mo4185() <= r62 * 8 ? 1 : 0)) * 2));
            } else {
                r5.mo4193(this.f5929.mo4238(1));
                if (r5.mo4202() == 0) {
                    m1721();
                    this.f5952 = 0;
                    return;
                }
                r5.mo4235(r7.f5962);
                r7.f5967.mo4188(r5);
                if (r5.mo4230() < 30) {
                    r5.mo4229(r5.mo4230());
                } else {
                    r5.mo4231(FTPReply.SERVICE_NOT_READY);
                }
                r7.f5967.mo4187(r5.mo4230() + this.f5924 + (r9 > 3 ? 1 : 0));
            }
            int r10 = zlVar2.f5990 * 2 * (r7.f5967.mo4185() + 6);
            int r11 = r12 + r7.f5967.mo4185();
            if (r10 < r11 * 6) {
                i = (r10 > r11 ? 1 : 0) + 1 + (r10 >= r11 * 4 ? 1 : 0);
                r7.f5967.mo4184(3);
            } else {
                i = (r10 >= r11 * 9 ? 1 : 0) + 4 + (r10 >= r11 * 12 ? 1 : 0) + (r10 >= r11 * 15 ? 1 : 0);
                r7.f5967.mo4184(i);
            }
            r5.mo4193(r7.f5967.mo4183() + (r62 * 6));
            r5.mo4226(r8.mo4202());
            r5.mo4234(zlVar2.f5991);
            r5.mo4231(i);
            r7.mo4200(r62 + 1);
            r7.mo4193(r7.mo4195());
        }
        int i3 = zlVar2.f5989;
        this.f5931.mo4193(i3);
        this.f5930.mo4193(i3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ModelPPM[");
        sb.append("\n  numMasked=");
        sb.append(this.f5936);
        sb.append("\n  initEsc=");
        sb.append(this.f5924);
        sb.append("\n  orderFall=");
        sb.append(this.f5925);
        sb.append("\n  maxOrder=");
        sb.append(this.f5955);
        sb.append("\n  runLength=");
        sb.append(this.f5926);
        sb.append("\n  initRL=");
        sb.append(this.f5927);
        sb.append("\n  escCount=");
        sb.append(this.f5952);
        sb.append("\n  prevSuccess=");
        sb.append(this.f5945);
        sb.append("\n  foundState=");
        sb.append(this.f5939);
        sb.append("\n  coder=");
        sb.append(this.f5948);
        sb.append("\n  subAlloc=");
        sb.append(this.f5929);
        sb.append("\n]");
        return sb.toString();
    }
}

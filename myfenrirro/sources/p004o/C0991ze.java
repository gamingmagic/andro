package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import p004o.C0993zg.C0994;

/* renamed from: o.ze */
public final class C0991ze extends C0992zf {

    /* renamed from: ȃ */
    public static final int[] f5956 = {25, 14, 9, 7, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 2};

    /* renamed from: ˮ͍ */
    private static final int f5957 = Math.max(6, 6);

    /* renamed from: 鷭 */
    public static final int f5958 = ((f5957 + 2) + 4);

    /* renamed from: Ą */
    C0991ze f5959 = null;

    /* renamed from: ċ */
    private final C0998zk f5960 = new C0998zk(null);

    /* renamed from: Ȋ */
    private int f5961;

    /* renamed from: ˮ͈ */
    final C0998zk f5962;

    /* renamed from: ܕ */
    private final C0998zk f5963 = new C0998zk(null);

    /* renamed from: 䒧 */
    private final C0998zk f5964 = new C0998zk(null);

    /* renamed from: 岱 */
    private int f5965;

    /* renamed from: 庸 */
    private final int[] f5966 = new int[256];

    /* renamed from: 櫯 */
    final C0989zc f5967;

    /* renamed from: 纫 */
    private final C0998zk f5968 = new C0998zk(null);

    /* renamed from: 躆 */
    private final C0998zk f5969 = new C0998zk(null);

    static {
    }

    public C0991ze(byte[] bArr) {
        super(bArr);
        this.f5962 = new C0998zk(bArr);
        this.f5967 = new C0989zc(bArr);
    }

    /* renamed from: 鷭 */
    public final C0991ze mo4199(byte[] bArr) {
        this.f5971 = bArr;
        this.f5972 = 0;
        this.f5962.mo4233(bArr);
        this.f5967.mo4186(bArr);
        return this;
    }

    /* renamed from: 鷭 */
    public final int mo4198() {
        if (this.f5971 != null) {
            byte[] bArr = this.f5971;
            int i = this.f5972;
            this.f5965 = ((short) (((short) (((short) ((bArr[i + 1] & 255) + 0)) << 8)) + (bArr[i] & 255))) & 65535;
        }
        return this.f5965;
    }

    /* renamed from: 鷭 */
    public final void mo4200(int i) {
        this.f5965 = 65535 & i;
        if (this.f5971 != null) {
            byte[] bArr = this.f5971;
            int i2 = this.f5972;
            short s = (short) i;
            byte[] bArr2 = bArr;
            bArr[i2 + 1] = (byte) (s >>> 8);
            bArr2[i2] = (byte) (s & 255);
        }
    }

    /* renamed from: 櫯 */
    public final int mo4195() {
        if (this.f5971 != null) {
            this.f5961 = C0947xs.m1640(this.f5971, this.f5972 + 8);
        }
        return this.f5961;
    }

    /* renamed from: 櫯 */
    public final void mo4196(int i) {
        this.f5961 = i;
        if (this.f5971 != null) {
            C0947xs.m1642(this.f5971, this.f5972 + 8, i);
        }
    }

    /* renamed from: ˮ͈ */
    public final void mo4193(int i) {
        super.mo4193(i);
        this.f5962.mo4193(i + 2);
        this.f5967.mo4193(i + 2);
    }

    /* renamed from: 櫯 */
    private C0991ze m1728(byte[] bArr) {
        if (this.f5959 == null) {
            this.f5959 = new C0991ze(null);
        }
        C0991ze zeVar = this.f5959;
        byte[] bArr2 = bArr;
        C0991ze zeVar2 = zeVar;
        zeVar.f5971 = bArr2;
        zeVar2.f5972 = 0;
        zeVar2.f5962.mo4233(bArr2);
        zeVar2.f5967.mo4186(bArr2);
        return zeVar2;
    }

    /* renamed from: ȃ */
    private void m1726(C0990zd zdVar) {
        int i;
        int r3 = mo4198();
        int r4 = mo4198() - 1;
        C0998zk zkVar = new C0998zk(zdVar.f5929.f6006);
        C0998zk zkVar2 = new C0998zk(zdVar.f5929.f6006);
        C0998zk zkVar3 = new C0998zk(zdVar.f5929.f6006);
        zkVar2.mo4193(zdVar.f5939.mo4202());
        while (zkVar2.mo4202() != this.f5967.mo4183()) {
            zkVar3.mo4193(zkVar2.mo4202() - 6);
            C0998zk.m1760(zkVar2, zkVar3);
            zkVar2.mo4225();
        }
        zkVar3.mo4193(this.f5967.mo4183());
        zkVar3.mo4229(4);
        this.f5967.mo4184(4);
        int r6 = this.f5967.mo4185() - zkVar2.mo4230();
        int i2 = zdVar.f5925 != 0 ? 1 : 0;
        zkVar2.mo4231((zkVar2.mo4230() + i2) >>> 1);
        this.f5967.mo4187(zkVar2.mo4230());
        do {
            zkVar2.mo4227();
            r6 -= zkVar2.mo4230();
            zkVar2.mo4231((zkVar2.mo4230() + i2) >>> 1);
            this.f5967.mo4184(zkVar2.mo4230());
            zkVar3.mo4193(zkVar2.mo4202() - 6);
            if (zkVar2.mo4230() > zkVar3.mo4230()) {
                zkVar.mo4193(zkVar2.mo4202());
                C0999zl zlVar = new C0999zl();
                C0999zl zlVar2 = zlVar;
                C0998zk zkVar4 = zkVar;
                zlVar.f5990 = zkVar4.mo4230() & 255;
                zlVar.f5989 = zkVar4.mo4228();
                zlVar.f5991 = zkVar4.mo4232() & 255;
                C0998zk zkVar5 = new C0998zk(zdVar.f5929.f6006);
                C0998zk zkVar6 = new C0998zk(zdVar.f5929.f6006);
                do {
                    zkVar5.mo4193(zkVar.mo4202() - 6);
                    zkVar.mo4235(zkVar5);
                    zkVar.mo4225();
                    zkVar6.mo4193(zkVar.mo4202() - 6);
                    if (zkVar.mo4202() == this.f5967.mo4183()) {
                        break;
                    }
                } while (zlVar2.f5990 > zkVar6.mo4230());
                C0999zl zlVar3 = zlVar2;
                C0998zk zkVar7 = zkVar;
                zkVar.mo4234(zlVar3.f5991);
                zkVar7.mo4231(zlVar3.f5990);
                zkVar7.mo4226(zlVar3.f5989);
            }
            r4--;
        } while (r4 != 0);
        if (zkVar2.mo4230() == 0) {
            do {
                r4++;
                zkVar2.mo4225();
            } while (zkVar2.mo4230() == 0);
            r6 += r4;
            mo4200(mo4198() - r4);
            if (mo4198() == 1) {
                C0999zl zlVar4 = new C0999zl();
                zkVar3.mo4193(this.f5967.mo4183());
                C0998zk zkVar8 = zkVar3;
                C0999zl zlVar5 = zlVar4;
                zlVar4.f5990 = zkVar8.mo4230() & 255;
                zlVar5.f5989 = zkVar8.mo4228();
                zlVar5.f5991 = zkVar8.mo4232() & 255;
                do {
                    zlVar4.f5990 = (zlVar4.f5990 - (zlVar4.f5990 >>> 1)) & 255;
                    r6 >>>= 1;
                } while (r6 > 1);
                C1000zm zmVar = zdVar.f5929;
                zmVar.mo4244(this.f5967.mo4183(), zmVar.f6002[((r3 + 1) >>> 1) - 1]);
                C0998zk zkVar9 = this.f5962;
                C0999zl zlVar6 = zlVar4;
                zkVar9.mo4234(zlVar6.f5991);
                zkVar9.mo4231(zlVar6.f5990);
                zkVar9.mo4226(zlVar6.f5989);
                zdVar.f5939.mo4193(this.f5962.mo4202());
                return;
            }
        }
        this.f5967.mo4184(r6 - (r6 >>> 1));
        int i3 = (r3 + 1) >>> 1;
        int r11 = (mo4198() + 1) >>> 1;
        if (i3 != r11) {
            C0989zc zcVar = this.f5967;
            C1000zm zmVar2 = zdVar.f5929;
            int r42 = this.f5967.mo4183();
            int i4 = r11;
            int i5 = zmVar2.f6002[i3 - 1];
            int i6 = zmVar2.f6002[i4 - 1];
            if (i5 == i6) {
                i = r42;
            } else if (zmVar2.f6005[i6].mo4219() != 0) {
                int r7 = zmVar2.mo4242(i6);
                byte[] bArr = zmVar2.f6006;
                System.arraycopy(bArr, r42, bArr, r7, C1000zm.m1773(i4));
                zmVar2.mo4244(r42, i5);
                i = r7;
            } else {
                zmVar2.mo4245(r42, i5, i6);
                i = r42;
            }
            zcVar.mo4181a_(i);
        }
        zdVar.f5939.mo4193(this.f5967.mo4183());
    }

    /* renamed from: 鷭 */
    private int m1730(C0990zd zdVar, C0998zk zkVar) {
        C0991ze r0 = m1728(zdVar.f5929.f6006);
        C0991ze zeVar = r0;
        if (this.f5971 != null) {
            this.f5961 = C0947xs.m1640(this.f5971, this.f5972 + 8);
        }
        int i = this.f5961;
        C0991ze zeVar2 = r0;
        super.mo4193(i);
        zeVar2.f5962.mo4193(i + 2);
        zeVar2.f5967.mo4193(i + 2);
        return zdVar.f5945 + 0 + zdVar.f5937[zeVar.mo4198() - 1] + zdVar.f5953 + (zdVar.f5928[zkVar.mo4232()] * 2) + ((zdVar.f5926 >>> 26) & 32);
    }

    /* renamed from: 鷭 */
    public final void mo4201(C0990zd zdVar) {
        C0998zk r5 = this.f5960.mo4233(zdVar.f5929.f6006);
        r5.mo4193(this.f5962.mo4202());
        zdVar.f5953 = zdVar.f5928[zdVar.f5939.mo4232()] & 255;
        int r6 = r5.mo4230() - 1;
        int r7 = m1730(zdVar, r5);
        int i = zdVar.f5941[r6][r7];
        C0993zg zgVar = zdVar.f5948;
        zgVar.f5975 >>>= 14;
        if ((((zgVar.f5976 - zgVar.f5977) / zgVar.f5975) & 4294967295L) < ((long) i)) {
            zdVar.f5939.mo4193(r5.mo4202());
            r5.mo4229(r5.mo4230() < 128 ? 1 : 0);
            zdVar.f5948.f5974.f5980 = 0;
            zdVar.f5948.f5974.f5979 = ((long) i) & 4294967295L;
            zdVar.f5941[r6][r7] = ((i + 128) - ((i + 32) >>> 7)) & SupportMenu.USER_MASK;
            zdVar.f5945 = 1;
            zdVar.f5926++;
            return;
        }
        zdVar.f5948.f5974.f5980 = ((long) i) & 4294967295L;
        int i2 = (i - ((i + 32) >>> 7)) & SupportMenu.USER_MASK;
        zdVar.f5941[r6][r7] = i2;
        zdVar.f5948.f5974.f5979 = 16384;
        zdVar.f5924 = f5956[i2 >>> 10];
        zdVar.f5936 = 1;
        zdVar.f5940[r5.mo4232()] = zdVar.f5952;
        zdVar.f5945 = 0;
        zdVar.f5939.mo4193(0);
    }

    /* renamed from: 鷭 */
    private void m1731(C0990zd zdVar, int i) {
        zdVar.f5939.mo4193(i);
        zdVar.f5939.mo4229(4);
        this.f5967.mo4184(4);
        C0998zk r2 = this.f5964.mo4233(zdVar.f5929.f6006);
        C0998zk r3 = this.f5969.mo4233(zdVar.f5929.f6006);
        r2.mo4193(i);
        r3.mo4193(i - 6);
        if (r2.mo4230() > r3.mo4230()) {
            C0998zk.m1760(r2, r3);
            zdVar.f5939.mo4193(r3.mo4202());
            if (r3.mo4230() > 124) {
                m1726(zdVar);
            }
        }
    }

    /* renamed from: 櫯 */
    public final boolean mo4197(C0990zd zdVar) {
        int r5 = mo4198() - zdVar.f5936;
        C0997zj r8 = m1727(zdVar, r5);
        C0993zg zgVar = zdVar.f5948;
        C0998zk r10 = this.f5960.mo4233(zdVar.f5929.f6006);
        C0998zk r11 = this.f5968.mo4233(zdVar.f5929.f6006);
        r10.mo4193(this.f5967.mo4183() - 6);
        int i = 0;
        int i2 = 0;
        while (true) {
            r10.mo4227();
            if (zdVar.f5940[r10.mo4232()] != zdVar.f5952) {
                i2 += r10.mo4230();
                int i3 = i;
                i++;
                this.f5966[i3] = r10.mo4202();
                r5--;
                if (r5 == 0) {
                    break;
                }
            }
        }
        C0994 r0 = zgVar.f5974;
        r0.f5978 = (r0.f5978 + ((long) i2)) & 4294967295L;
        long r02 = (long) zgVar.mo4206();
        long j = r02;
        if (r02 >= zgVar.f5974.f5978) {
            return false;
        }
        int i4 = 0;
        r10.mo4193(this.f5966[0]);
        if (j < ((long) i2)) {
            int i5 = 0;
            while (true) {
                i5 += r10.mo4230();
                if (((long) i5) > j) {
                    break;
                }
                i4++;
                r10.mo4193(this.f5966[i4]);
            }
            zgVar.f5974.f5979 = ((long) i5) & 4294967295L;
            zgVar.f5974.f5980 = ((long) (i5 - r10.mo4230())) & 4294967295L;
            r8.mo4223();
            m1729(zdVar, r10.mo4202());
        } else {
            zgVar.f5974.f5980 = ((long) i2) & 4294967295L;
            zgVar.f5974.f5979 = zgVar.f5974.f5978 & 4294967295L;
            int r52 = mo4198() - zdVar.f5936;
            int i6 = 0 - 1;
            do {
                i6++;
                r11.mo4193(this.f5966[i6]);
                zdVar.f5940[r11.mo4232()] = zdVar.f5952;
                r52--;
            } while (r52 != 0);
            r8.f5988 = (r8.f5988 + ((int) zgVar.f5974.f5978)) & SupportMenu.USER_MASK;
            zdVar.f5936 = mo4198();
        }
        return true;
    }

    /* renamed from: 櫯 */
    private void m1729(C0990zd zdVar, int i) {
        C0998zk r2 = this.f5963.mo4233(zdVar.f5929.f6006);
        r2.mo4193(i);
        zdVar.f5939.mo4193(i);
        zdVar.f5939.mo4229(4);
        this.f5967.mo4184(4);
        if (r2.mo4230() > 124) {
            m1726(zdVar);
        }
        zdVar.f5952 = (zdVar.f5952 + 1) & 255;
        zdVar.f5926 = zdVar.f5927;
    }

    /* renamed from: ˮ͈ */
    private C0997zj m1727(C0990zd zdVar, int i) {
        int r5 = mo4198();
        if (r5 != 256) {
            C0991ze r0 = m1728(zdVar.f5929.f6006);
            C0991ze zeVar = r0;
            if (this.f5971 != null) {
                this.f5961 = C0947xs.m1640(this.f5971, this.f5972 + 8);
            }
            int i2 = this.f5961;
            C0991ze zeVar2 = r0;
            super.mo4193(i2);
            zeVar2.f5962.mo4193(i2 + 2);
            zeVar2.f5967.mo4193(i2 + 2);
            C0997zj zjVar = zdVar.f5954[zdVar.f5947[i - 1]][(i < zeVar.mo4198() - r5 ? 1 : 0) + 0 + ((this.f5967.mo4185() < r5 * 11 ? 1 : 0) * 2) + ((zdVar.f5936 > i ? 1 : 0) * 4) + zdVar.f5953];
            C0994 r02 = zdVar.f5948.f5974;
            C0997zj zjVar2 = zjVar;
            int i3 = zjVar.f5988 >>> zjVar2.f5987;
            zjVar2.f5988 -= i3;
            r02.f5978 = ((long) ((i3 == 0 ? 1 : 0) + i3)) & 4294967295L;
            return zjVar;
        }
        C0997zj zjVar3 = zdVar.f5951;
        zdVar.f5948.f5974.f5978 = 1;
        return zjVar3;
    }

    /* renamed from: ˮ͈ */
    public final boolean mo4194(C0990zd zdVar) {
        C0993zg zgVar = zdVar.f5948;
        zgVar.f5974.f5978 = ((long) this.f5967.mo4185()) & 4294967295L;
        C0998zk zkVar = new C0998zk(zdVar.f5929.f6006);
        zkVar.mo4193(this.f5967.mo4183());
        long r0 = (long) zgVar.mo4206();
        long j = r0;
        if (r0 >= zgVar.f5974.f5978) {
            return false;
        }
        int r8 = zkVar.mo4230();
        if (j < ((long) r8)) {
            zgVar.f5974.f5979 = ((long) r8) & 4294967295L;
            zdVar.f5945 = (((long) (r8 * 2)) > zgVar.f5974.f5978 ? 1 : 0) & 255;
            zdVar.f5926 += zdVar.f5945;
            int i = r8 + 4;
            zdVar.f5939.mo4193(zkVar.mo4202());
            zdVar.f5939.mo4231(i);
            this.f5967.mo4184(4);
            if (i > 124) {
                m1726(zdVar);
            }
            zgVar.f5974.f5980 = 0;
            return true;
        } else if (zdVar.f5939.mo4202() == 0) {
            return false;
        } else {
            zdVar.f5945 = 0;
            int r11 = mo4198();
            int i2 = r11 - 1;
            do {
                r8 += zkVar.mo4227().mo4230();
                if (((long) r8) > j) {
                    zgVar.f5974.f5980 = ((long) (r8 - zkVar.mo4230())) & 4294967295L;
                    zgVar.f5974.f5979 = ((long) r8) & 4294967295L;
                    m1731(zdVar, zkVar.mo4202());
                    return true;
                }
                i2--;
            } while (i2 != 0);
            zdVar.f5953 = zdVar.f5928[zdVar.f5939.mo4232()] & 255;
            zgVar.f5974.f5980 = ((long) r8) & 4294967295L;
            zdVar.f5940[zkVar.mo4232()] = zdVar.f5952;
            zdVar.f5936 = r11;
            int i3 = r11 - 1;
            zdVar.f5939.mo4193(0);
            do {
                zdVar.f5940[zkVar.mo4225().mo4232()] = zdVar.f5952;
                i3--;
            } while (i3 != 0);
            zgVar.f5974.f5979 = zgVar.f5974.f5978 & 4294967295L;
            return true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PPMContext[");
        sb.append("\n  pos=");
        sb.append(this.f5972);
        sb.append("\n  size=");
        sb.append(f5958);
        sb.append("\n  numStats=");
        sb.append(mo4198());
        sb.append("\n  Suffix=");
        if (this.f5971 != null) {
            this.f5961 = C0947xs.m1640(this.f5971, this.f5972 + 8);
        }
        sb.append(this.f5961);
        sb.append("\n  freqData=");
        sb.append(this.f5967);
        sb.append("\n  oneState=");
        sb.append(this.f5962);
        sb.append("\n]");
        return sb.toString();
    }
}

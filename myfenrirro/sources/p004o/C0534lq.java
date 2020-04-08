package p004o;

import android.graphics.Point;
import android.opengl.Matrix;
import com.roworkshop.andro.c_point;

/* renamed from: o.lq */
public final class C0534lq {

    /* renamed from: Ą */
    C0412hn f1680 = new C0412hn();

    /* renamed from: ą */
    C1341 f1681 = new C1341();

    /* renamed from: Ć */
    C1341 f1682 = new C1341();

    /* renamed from: ć */
    C1341 f1683;

    /* renamed from: ċ */
    long f1684;

    /* renamed from: đ */
    private C0526lj[] f1685 = new C0526lj[this.f1694];

    /* renamed from: Ē */
    private Runnable f1686 = new C0535lr(this);

    /* renamed from: ȃ */
    C1615 f1687 = new C1615();

    /* renamed from: Ȋ */
    public boolean f1688;

    /* renamed from: ˮ͈ */
    C1735 f1689 = new C1735();

    /* renamed from: ˮ͍ */
    Point f1690 = new Point();

    /* renamed from: ܕ */
    private C1341 f1691 = new C1341();

    /* renamed from: 䒧 */
    private C1341 f1692 = new C1341();

    /* renamed from: 岱 */
    public C0548mb f1693;

    /* renamed from: 庸 */
    private int f1694 = 2;

    /* renamed from: 櫯 */
    public C1558 f1695;

    /* renamed from: 纫 */
    C1337 f1696 = null;

    /* renamed from: 躆 */
    private C1341 f1697 = new C1341();

    /* renamed from: 鷭 */
    C1812 f1698;

    C0534lq() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0540lv mo3978(int i) {
        C0548mb mbVar = (C0548mb) this.f1680.f1189.get(Integer.valueOf(i));
        if (mbVar == null) {
            return null;
        }
        return C0540lv.class.isAssignableFrom(mbVar.getClass()) ? mbVar : null;
    }

    /* renamed from: 鷭 */
    static C0525li m593(C0526lj ljVar) {
        float[] fArr = {ljVar.f1652, ljVar.f1651, ljVar.f1650, 1.0f};
        float[] fArr2 = new float[4];
        Matrix.multiplyMV(fArr2, 0, C1014.f6142.f1682.f6874, 0, fArr, 0);
        for (int i = 0; i < 3; i++) {
            fArr2[i] = fArr2[i] / fArr2[3];
        }
        return new C0525li(fArr2[0], fArr2[1]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final C0525li mo3974(C0526lj ljVar) {
        C0525li r4 = m593(ljVar);
        if (r4 == null) {
            return null;
        }
        C0525li liVar = r4;
        r4.f1649 += 1.0f;
        liVar.f1648 += 1.0f;
        r4.f1649 /= 2.0f;
        r4.f1648 /= 2.0f;
        r4.f1649 *= (float) this.f1690.x;
        r4.f1648 *= (float) this.f1690.y;
        return r4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0526lj mo3977(int i, int i2, int i3, int i4) {
        C0526lj ljVar = new C0526lj();
        C0438ik ikVar = this.f1695.f7338;
        ljVar.f1652 = (-(((((float) (((i * 100) + i3) + 50)) / 100.0f) / 2.0f) - ((float) (ikVar.f1296 / 2)))) * ikVar.f1303;
        C0438ik ikVar2 = this.f1695.f7338;
        ljVar.f1650 = (((((float) (((i2 * 100) + i4) + 50)) / 100.0f) / 2.0f) - ((float) (ikVar2.f1297 / 2))) * ikVar2.f1303;
        ljVar.f1651 = this.f1695.mo4389(ljVar.f1652, ljVar.f1650);
        return ljVar;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 195 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if ((r9.f8646 & 16384) <= 0) goto L_0x0099;
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p004o.C1413[] m596(long r14) {
        /*
            r13 = this;
            o.hn r0 = r13.f1680
            o.in r4 = r0.f1198
            monitor-enter(r4)
            o.hn r0 = r13.f1680     // Catch:{ all -> 0x024d }
            java.util.HashMap<java.lang.Integer, o.mb> r0 = r0.f1189     // Catch:{ all -> 0x024d }
            int r5 = r0.size()     // Catch:{ all -> 0x024d }
            o.hn r0 = r13.f1680     // Catch:{ all -> 0x024d }
            o.bd r0 = r0.f1190     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x0015
            int r5 = r5 + 1
        L_0x0015:
            if (r5 != 0) goto L_0x001a
            monitor-exit(r4)     // Catch:{ all -> 0x024d }
            r0 = 0
            return r0
        L_0x001a:
            o.㙜[] r5 = new p004o.C1413[r5]     // Catch:{ all -> 0x024d }
            r6 = 0
            o.hn r0 = r13.f1680     // Catch:{ all -> 0x024d }
            o.bd r0 = r0.f1190     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x0054
            o.hn r0 = r13.f1680     // Catch:{ all -> 0x024d }
            o.bd r7 = r0.f1190     // Catch:{ all -> 0x024d }
            o.㙜 r0 = new o.㙜     // Catch:{ all -> 0x024d }
            r0.<init>()     // Catch:{ all -> 0x024d }
            r1 = 0
            r5[r1] = r0     // Catch:{ all -> 0x024d }
            r0 = 0
            r0 = r5[r0]     // Catch:{ all -> 0x024d }
            r0.f6988 = r7     // Catch:{ all -> 0x024d }
            r0 = 0
            r0 = r5[r0]     // Catch:{ all -> 0x024d }
            o.on r1 = r7.f8948     // Catch:{ all -> 0x024d }
            r0.f6979 = r1     // Catch:{ all -> 0x024d }
            int r8 = r7.mo3559(r14)     // Catch:{ all -> 0x024d }
            if (r8 >= 0) goto L_0x0042
            r8 = 0
        L_0x0042:
            r0 = 0
            r0 = r5[r0]     // Catch:{ all -> 0x024d }
            o.hl$鷭$鷭 r1 = r7.mo3997(r8)     // Catch:{ all -> 0x024d }
            r0.f6977 = r1     // Catch:{ all -> 0x024d }
            r0 = 0
            r0 = r5[r0]     // Catch:{ all -> 0x024d }
            o.ತ r1 = r7.f8953     // Catch:{ all -> 0x024d }
            r0.f6969 = r1     // Catch:{ all -> 0x024d }
            int r6 = r6 + 1
        L_0x0054:
            o.hn r0 = r13.f1680     // Catch:{ all -> 0x024d }
            java.util.HashMap<java.lang.Integer, o.mb> r0 = r0.f1189     // Catch:{ all -> 0x024d }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x024d }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x024d }
            goto L_0x0233
        L_0x0062:
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x024d }
            o.mb r0 = (p004o.C0548mb) r0     // Catch:{ all -> 0x024d }
            r7 = r0
            if (r7 == 0) goto L_0x0233
            o.le r11 = r7.f1769     // Catch:{ all -> 0x024d }
            java.lang.Class<o.둆> r9 = p004o.C1919.class
            java.lang.Class r0 = r11.getClass()     // Catch:{ all -> 0x024d }
            boolean r0 = r9.isAssignableFrom(r0)     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x007b
            r0 = r11
            goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            o.둆 r0 = (p004o.C1919) r0     // Catch:{ all -> 0x024d }
            r9 = r0
            if (r9 == 0) goto L_0x0099
            int r0 = r9.f8646     // Catch:{ all -> 0x024d }
            r0 = r0 & 64
            if (r0 > 0) goto L_0x0233
            int r0 = r9.f8646     // Catch:{ all -> 0x024d }
            r0 = r0 & 2
            if (r0 > 0) goto L_0x0233
            int r0 = r9.f8646     // Catch:{ all -> 0x024d }
            r0 = r0 & 4
            if (r0 > 0) goto L_0x0233
            int r0 = r9.f8646     // Catch:{ all -> 0x024d }
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 > 0) goto L_0x0233
        L_0x0099:
            o.hn r0 = r13.f1680     // Catch:{ all -> 0x024d }
            o.羇 r1 = r13.f1689     // Catch:{ all -> 0x024d }
            float r1 = r1.f7999     // Catch:{ all -> 0x024d }
            o.le r11 = r7.f1769     // Catch:{ all -> 0x024d }
            java.lang.Class<o.둆> r9 = p004o.C1919.class
            java.lang.Class r2 = r11.getClass()     // Catch:{ all -> 0x024d }
            boolean r2 = r9.isAssignableFrom(r2)     // Catch:{ all -> 0x024d }
            if (r2 == 0) goto L_0x00af
            r2 = r11
            goto L_0x00b0
        L_0x00af:
            r2 = 0
        L_0x00b0:
            if (r2 == 0) goto L_0x00b4
            r2 = 1
            goto L_0x00b5
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            if (r2 == 0) goto L_0x00be
            o.le r2 = r7.f1769     // Catch:{ all -> 0x024d }
            o.둆 r2 = (p004o.C1919) r2     // Catch:{ all -> 0x024d }
            byte r2 = r2.f8639     // Catch:{ all -> 0x024d }
            goto L_0x00bf
        L_0x00be:
            r2 = 0
        L_0x00bf:
            o.mp r0 = r0.mo3789(r1, r2)     // Catch:{ all -> 0x024d }
            r7.f1776 = r0     // Catch:{ all -> 0x024d }
            int r9 = r7.mo3559(r14)     // Catch:{ all -> 0x024d }
            if (r9 >= 0) goto L_0x00cc
            r9 = 0
        L_0x00cc:
            o.hl$鷭$鷭 r9 = r7.mo3997(r9)     // Catch:{ all -> 0x024d }
            o.lj r0 = new o.lj     // Catch:{ all -> 0x024d }
            o.lj r1 = r7.f1707     // Catch:{ all -> 0x024d }
            r0.<init>(r1)     // Catch:{ all -> 0x024d }
            o.lj r1 = new o.lj     // Catch:{ all -> 0x024d }
            o.羇 r2 = r13.f1689     // Catch:{ all -> 0x024d }
            float[] r2 = r2.f7993     // Catch:{ all -> 0x024d }
            r1.<init>(r2)     // Catch:{ all -> 0x024d }
            o.lj r0 = r0.mo3961(r1)     // Catch:{ all -> 0x024d }
            float r10 = r0.mo3962()     // Catch:{ all -> 0x024d }
            java.lang.Class<o.lv> r11 = p004o.C0540lv.class
            r12 = r7
            java.lang.Class r0 = r12.getClass()     // Catch:{ all -> 0x024d }
            boolean r0 = r11.isAssignableFrom(r0)     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x00f7
            r0 = r12
            goto L_0x00f8
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            o.lv r0 = (p004o.C0540lv) r0     // Catch:{ all -> 0x024d }
            r11 = r0
            if (r11 == 0) goto L_0x0132
            o.mf r0 = r11.f1729     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x0132
            o.mf r0 = r11.f1729     // Catch:{ all -> 0x024d }
            o.hn r1 = r13.f1680     // Catch:{ all -> 0x024d }
            o.羇 r2 = r13.f1689     // Catch:{ all -> 0x024d }
            float r2 = r2.f7999     // Catch:{ all -> 0x024d }
            o.mf r3 = r11.f1729     // Catch:{ all -> 0x024d }
            byte r3 = r3.f1783     // Catch:{ all -> 0x024d }
            o.mp r1 = r1.mo3789(r2, r3)     // Catch:{ all -> 0x024d }
            r0.f1784 = r1     // Catch:{ all -> 0x024d }
            o.mf r0 = r11.f1729     // Catch:{ all -> 0x024d }
            int r0 = r0.f8950     // Catch:{ all -> 0x024d }
            o.mf r1 = r11.f1729     // Catch:{ all -> 0x024d }
            o.mp r1 = r1.f1784     // Catch:{ all -> 0x024d }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x024d }
            if (r0 == r1) goto L_0x0132
            o.mf r0 = r11.f1729     // Catch:{ all -> 0x024d }
            o.mf r1 = r11.f1729     // Catch:{ all -> 0x024d }
            o.mp r1 = r1.f1784     // Catch:{ all -> 0x024d }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x024d }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024d }
            r0.mo4634(r1, r2)     // Catch:{ all -> 0x024d }
        L_0x0132:
            o.㙜 r0 = new o.㙜     // Catch:{ all -> 0x024d }
            r0.<init>()     // Catch:{ all -> 0x024d }
            r5[r6] = r0     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            r0.f6977 = r9     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            r0.f6970 = r10     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            r0.f6988 = r7     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.ತ r12 = r7.f8953     // Catch:{ all -> 0x024d }
            o.ತ r1 = new o.ತ     // Catch:{ all -> 0x024d }
            float[] r2 = r12.f6874     // Catch:{ all -> 0x024d }
            r3 = 16
            float[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch:{ all -> 0x024d }
            r1.<init>(r2)     // Catch:{ all -> 0x024d }
            r0.f6969 = r1     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            boolean r1 = r7.f1774     // Catch:{ all -> 0x024d }
            r0.f6985 = r1     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.on r1 = r7.f8948     // Catch:{ all -> 0x024d }
            r0.f6979 = r1     // Catch:{ all -> 0x024d }
            if (r11 == 0) goto L_0x0206
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.cc r1 = r11.f1731     // Catch:{ all -> 0x024d }
            r0.f6971 = r1     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.cc r1 = r11.f1726     // Catch:{ all -> 0x024d }
            r0.f6972 = r1     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.cc r1 = r11.f1734     // Catch:{ all -> 0x024d }
            r0.f6980 = r1     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.cc r1 = r11.f1727     // Catch:{ all -> 0x024d }
            r0.f6978 = r1     // Catch:{ all -> 0x024d }
            o.hn r0 = r13.f1680     // Catch:{ all -> 0x024d }
            o.ly r0 = r0.f1195     // Catch:{ all -> 0x024d }
            if (r11 != r0) goto L_0x018e
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.hn r1 = r13.f1680     // Catch:{ all -> 0x024d }
            o.ly r1 = r1.f1195     // Catch:{ all -> 0x024d }
            o.ly$鷭 r1 = r1.f1742     // Catch:{ all -> 0x024d }
            r0.f6983 = r1     // Catch:{ all -> 0x024d }
        L_0x018e:
            o.mf r0 = r11.f1729     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x01ca
            o.lj r0 = new o.lj     // Catch:{ all -> 0x024d }
            o.mf r1 = r11.f1729     // Catch:{ all -> 0x024d }
            o.lj r1 = r1.f1707     // Catch:{ all -> 0x024d }
            r0.<init>(r1)     // Catch:{ all -> 0x024d }
            o.lj r1 = new o.lj     // Catch:{ all -> 0x024d }
            o.羇 r2 = r13.f1689     // Catch:{ all -> 0x024d }
            float[] r2 = r2.f7993     // Catch:{ all -> 0x024d }
            r1.<init>(r2)     // Catch:{ all -> 0x024d }
            o.lj r0 = r0.mo3961(r1)     // Catch:{ all -> 0x024d }
            float r10 = r0.mo3962()     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.mf r1 = r11.f1729     // Catch:{ all -> 0x024d }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024d }
            int r2 = r1.mo3559(r2)     // Catch:{ all -> 0x024d }
            o.hl$鷭$鷭 r1 = r1.mo3997(r2)     // Catch:{ all -> 0x024d }
            r0.f6981 = r1     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.mf r1 = r11.f1729     // Catch:{ all -> 0x024d }
            o.ತ r1 = r1.f8953     // Catch:{ all -> 0x024d }
            r0.f6984 = r1     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            r0.f6974 = r10     // Catch:{ all -> 0x024d }
        L_0x01ca:
            o.形 r0 = r11.f1735     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x01e8
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.形 r1 = r11.f1735     // Catch:{ all -> 0x024d }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024d }
            int r2 = r1.mo3559(r2)     // Catch:{ all -> 0x024d }
            o.hl$鷭$鷭 r1 = r1.mo3997(r2)     // Catch:{ all -> 0x024d }
            r0.f6973 = r1     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.形 r1 = r11.f1735     // Catch:{ all -> 0x024d }
            o.ತ r1 = r1.f8953     // Catch:{ all -> 0x024d }
            r0.f6986 = r1     // Catch:{ all -> 0x024d }
        L_0x01e8:
            o.岧 r0 = r11.f1733     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x0206
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.岧 r1 = r11.f1733     // Catch:{ all -> 0x024d }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024d }
            int r2 = r1.mo3559(r2)     // Catch:{ all -> 0x024d }
            o.hl$鷭$鷭 r1 = r1.mo3997(r2)     // Catch:{ all -> 0x024d }
            r0.f6982 = r1     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.岧 r1 = r11.f1733     // Catch:{ all -> 0x024d }
            o.ತ r1 = r1.f8953     // Catch:{ all -> 0x024d }
            r0.f6987 = r1     // Catch:{ all -> 0x024d }
        L_0x0206:
            o.ij r0 = r7.f1777     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x0231
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.ij r1 = r7.f1777     // Catch:{ all -> 0x024d }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024d }
            int r2 = r1.mo3559(r2)     // Catch:{ all -> 0x024d }
            o.hl$鷭$鷭 r1 = r1.mo3997(r2)     // Catch:{ all -> 0x024d }
            r0.f6976 = r1     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            o.ij r1 = r7.f1777     // Catch:{ all -> 0x024d }
            o.ತ r1 = r1.f8953     // Catch:{ all -> 0x024d }
            r0.f6989 = r1     // Catch:{ all -> 0x024d }
            r0 = r5[r6]     // Catch:{ all -> 0x024d }
            boolean r1 = r13.f1688     // Catch:{ all -> 0x024d }
            if (r1 == 0) goto L_0x022d
            o.on r1 = p004o.C0437ij.f1294     // Catch:{ all -> 0x024d }
            goto L_0x022f
        L_0x022d:
            o.on r1 = p004o.C0437ij.f1295     // Catch:{ all -> 0x024d }
        L_0x022f:
            r0.f6975 = r1     // Catch:{ all -> 0x024d }
        L_0x0231:
            int r6 = r6 + 1
        L_0x0233:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x024d }
            if (r0 != 0) goto L_0x0062
            int r0 = r5.length     // Catch:{ all -> 0x024d }
            if (r0 == r6) goto L_0x0243
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r6)     // Catch:{ all -> 0x024d }
            o.㙜[] r0 = (p004o.C1413[]) r0     // Catch:{ all -> 0x024d }
            r5 = r0
        L_0x0243:
            o.ls r0 = new o.ls     // Catch:{ all -> 0x024d }
            r0.<init>(r13)     // Catch:{ all -> 0x024d }
            java.util.Arrays.sort(r5, r0)     // Catch:{ all -> 0x024d }
            monitor-exit(r4)     // Catch:{ all -> 0x024d }
            return r5
        L_0x024d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x024d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0534lq.m596(long):o.㙜[]");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 115 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p004o.C0548mb m594(android.graphics.Point r5) {
        /*
            r4 = this;
            o.hn r0 = r4.f1680
            java.util.HashMap<java.lang.Integer, o.mb> r0 = r0.f1189
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
            goto L_0x002b
        L_0x000d:
            java.lang.Object r0 = r3.next()
            o.mb r0 = (p004o.C0548mb) r0
            r2 = r0
            boolean r0 = r2.mo4015()
            if (r0 == 0) goto L_0x002b
            o.le r0 = r2.f1769
            int r0 = r0.f1634
            int r1 = r5.x
            if (r0 != r1) goto L_0x002b
            o.le r0 = r2.f1769
            int r0 = r0.f1631
            int r1 = r5.y
            if (r0 != r1) goto L_0x002b
            return r2
        L_0x002b:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x000d
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0534lq.m594(android.graphics.Point):o.mb");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3980(float f, float f2, boolean z) {
        if (this.f1682 != null) {
            float f3 = ((f - ((float) (this.f1690.x / 2))) / ((float) this.f1690.x)) * 2.0f;
            float f4 = ((f2 - ((float) (this.f1690.y / 2))) / ((float) this.f1690.y)) * -2.0f;
            float[] fArr = new float[16];
            if (!Matrix.invertM(fArr, 0, this.f1682.f6874, 0)) {
                C0592ns.m674("Matrix can't be inverted");
                return;
            }
            float[] fArr2 = {f3, f4, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            Matrix.multiplyMV(fArr3, 0, new C1341(fArr).f6874, 0, fArr2, 0);
            C0526lj ljVar = new C0526lj(fArr3[0] / fArr3[3], fArr3[1] / fArr3[3], fArr3[2] / fArr3[3]);
            fArr2[2] = 0.1f;
            Matrix.multiplyMV(fArr3, 0, new C1341(fArr).f6874, 0, fArr2, 0);
            C0526lj r12 = new C0526lj(new C0526lj(fArr3[0] / fArr3[3], fArr3[1] / fArr3[3], fArr3[2] / fArr3[3])).mo3961(ljVar);
            r12.mo3960();
            C0526lj ljVar2 = r12;
            r12.f1652 *= 1.0f;
            ljVar2.f1651 *= 1.0f;
            ljVar2.f1650 *= 1.0f;
            int i = (int) (C0595nv.f2862 / 1.0f);
            if (this.f1685 == null || this.f1685.length != i) {
                this.f1685 = new C0526lj[i];
            }
            for (int i2 = 0; i2 < this.f1685.length; i2++) {
                C0526lj[] ljVarArr = this.f1685;
                C0526lj ljVar3 = new C0526lj(r12);
                float f5 = (float) i2;
                ljVar3.f1652 *= f5;
                ljVar3.f1651 *= f5;
                ljVar3.f1650 *= f5;
                ljVarArr[i2] = ljVar3.mo3963(ljVar);
            }
            C0525li liVar = new C0525li();
            if (this.f1695 != null && this.f1695.f7338 != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.f1685.length) {
                        break;
                    }
                    C0526lj ljVar4 = this.f1685[i3];
                    C0438ik ikVar = this.f1695.f7338;
                    liVar.f1649 = (((float) (ikVar.f1296 / 2)) - (ljVar4.f1652 / ikVar.f1303)) * 2.0f;
                    C0438ik ikVar2 = this.f1695.f7338;
                    liVar.f1648 = (((float) (ikVar2.f1297 / 2)) + (ljVar4.f1650 / ikVar2.f1303)) * 2.0f;
                    if (this.f1695.mo4389(ljVar4.f1652, ljVar4.f1650) < ljVar4.f1651) {
                        i3++;
                    } else if (i3 > 0) {
                        C0526lj ljVar5 = this.f1685[i3 - 1];
                        C0438ik ikVar3 = this.f1695.f7338;
                        liVar.f1649 = (((float) (ikVar3.f1296 / 2)) - (ljVar5.f1652 / ikVar3.f1303)) * 2.0f;
                        C0438ik ikVar4 = this.f1695.f7338;
                        liVar.f1648 = (((float) (ikVar4.f1297 / 2)) + (ljVar5.f1650 / ikVar4.f1303)) * 2.0f;
                    }
                }
                if (i3 != this.f1685.length) {
                    Point point = new Point((int) liVar.f1649, (int) liVar.f1648);
                    if (C1014.f6137 != null && C1014.f6137.f1636 != null && this.f1680.f1195 != null) {
                        c_point c_point = new c_point(point);
                        C0548mb r8 = m594(point);
                        if (r8 == null && !z) {
                            for (int i4 = point.x - 1; i4 <= point.x + 1; i4++) {
                                for (int i5 = point.y - 1; i5 <= point.y + 1; i5++) {
                                    if (i4 != point.x || i5 != point.y) {
                                        c_point.set(i4, i5);
                                        r8 = m594((Point) c_point);
                                        if (r8 != null && (r8 != this.f1680.f1195 || C1014.f6147.f51.f1457 != null)) {
                                            break;
                                        }
                                        r8 = null;
                                    }
                                }
                                if (r8 != null) {
                                    break;
                                }
                            }
                        }
                        if (this.f1680.f1195.f1742 != null) {
                            C1014.f6144.mo3652((C0839ue) new C1622());
                            this.f1680.f1195.f1742 = null;
                        }
                        if (C1014.f6147.f51.f1457 != null) {
                            if ((C1014.f6147.f51.f1457.f1052 & 2) != 0) {
                                if (!this.f1680.f1195.mo4010(0, point.x, point.y, C1014.f6147.f51.f1457.f1048, C1014.f6147.f51.f1457.f1053, C1014.f6147.f51.f1457.f1051)) {
                                    if (C1014.f6147.f51.f1435.f1122 != C0397.SKILL_HOMUN || C1014.f6137.f1636.f6524 == null) {
                                        C1014.f6144.mo3652((C0839ue) new C1084(C1014.f6147.f51.f1457.f1053, C1014.f6147.f51.f1457.f1051, point.x, point.y));
                                    } else {
                                        C1014.f6137.f1636.f6524.f6560 = C0568mv.SKILL_AREA_CMD;
                                        C1014.f6137.f1636.f6524.f6555 = point.x;
                                        C1014.f6137.f1636.f6524.f6556 = point.y;
                                        C2045 r0 = C1014.f6158.f674.f620;
                                        C0587nn nnVar = C0587nn.HOM;
                                        C0521lf lfVar = C1014.f6137;
                                        r0.mo4635(nnVar);
                                        C1014.f6137.f1636.f6524.f6560 = C0568mv.NONE_CMD;
                                    }
                                }
                                C1014.f6147.f51.mo3859();
                                return;
                            }
                        }
                        if (r8 == null || (r8.f1772 == C0561mo.DEAD && (C1014.f6147.f51.f1457 == null || C1014.f6147.f51.f1457.f1053 != 54))) {
                            if (this.f1688) {
                                m592();
                            }
                            if (C1014.f6147.f51.f1449 || C1014.f6147.f51.f1440) {
                                if (!C1014.f6147.f51.f1449 || C1014.f6137.f1636.f6524 == null) {
                                    if (C1014.f6147.f51.f1440 && C1014.f6137.f1636.f6538 != null) {
                                        if (!this.f1695.f7349.mo4390(this.f1695, point)) {
                                            this.f1695.f7349.f7359 = false;
                                            return;
                                        }
                                        m595(C1014.f6137.f1636.f6538);
                                        C1014.f6137.f1636.f6538.f6560 = C0568mv.MOVE_CMD;
                                        C2045 r02 = C1014.f6158.f674.f620;
                                        C0587nn nnVar2 = C0587nn.MER;
                                        C0521lf lfVar2 = C1014.f6137;
                                        r02.mo4635(nnVar2);
                                    }
                                } else if (!this.f1695.f7349.mo4390(this.f1695, point)) {
                                    this.f1695.f7349.f7359 = false;
                                } else {
                                    m595(C1014.f6137.f1636.f6524);
                                    C1014.f6137.f1636.f6524.f6560 = C0568mv.MOVE_CMD;
                                    C2045 r03 = C1014.f6158.f674.f620;
                                    C0587nn nnVar3 = C0587nn.HOM;
                                    C0521lf lfVar3 = C1014.f6137;
                                    r03.mo4635(nnVar3);
                                }
                            } else if (C1014.f6137.f1636.f458) {
                                this.f1680.f1195.mo4008(new c_point(point));
                            } else if (!this.f1695.f7349.mo4390(this.f1695, point)) {
                                this.f1695.f7349.f7359 = false;
                            } else {
                                C1014.f6144.mo3652((C0839ue) new C1093((short) this.f1695.f7349.f7361.x, (short) this.f1695.f7349.f7361.y));
                            }
                        } else {
                            this.f1680.f1195.mo4009(r8, (C1924) null);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: 鷭 */
    private void m595(C1302if ifVar) {
        ifVar.f6555 = this.f1695.f7349.f7361.x;
        ifVar.f6556 = this.f1695.f7349.f7361.y;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 292 */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x040f, code lost:
        if (r12.f1769.f1632.y != r12.f1771.y) goto L_0x0411;
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3979() {
        /*
            r24 = this;
            long r13 = java.lang.System.currentTimeMillis()
            r0 = r24
            o.嫶 r0 = r0.f1695
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            r0 = r24
            o.ஊ r0 = r0.f1696
            if (r0 == 0) goto L_0x001b
            r0 = r24
            o.ஊ r11 = r0.f1696
            r0 = 0
            r1 = r24
            r1.f1696 = r0
            goto L_0x0020
        L_0x001b:
            o.ஊ r11 = new o.ஊ
            r11.<init>()
        L_0x0020:
            r0 = r24
            o.嫶 r0 = r0.f1695
            r11.f6869 = r0
            r0 = r24
            o.hn r0 = r0.f1680
            o.in r0 = r0.f1198
            r11.f6868 = r0
            r0 = r24
            o.騛 r0 = r0.f1698
            o.na r0 = r0.f8351
            o.na r1 = p004o.C0574na.NONE
            if (r0 != r1) goto L_0x003f
            r0 = r24
            o.騛 r0 = r0.f1698
            r0.f8355 = r11
            return
        L_0x003f:
            r0 = r24
            o.騛 r0 = r0.f1698
            o.na r0 = r0.f8351
            o.na r1 = p004o.C0574na.PREPARING
            if (r0 != r1) goto L_0x004a
            return
        L_0x004a:
            r12 = r24
            r0 = r24
            long r0 = r0.f1684
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            r12.f1684 = r13
            goto L_0x006f
        L_0x0059:
            long r0 = r12.f1684
            long r0 = r13 - r0
            long r2 = p004o.C0595nv.f2873
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x006f
            o.cp r0 = p004o.C1014.f6158
            o.lt r1 = new o.lt
            r1.<init>(r12)
            r0.mo3387(r1)
            r12.f1684 = r13
        L_0x006f:
            r0 = r24
            o.hn r0 = r0.f1680
            java.util.HashMap<java.lang.Integer, o.mb> r0 = r0.f1189
            java.util.Collection r0 = r0.values()
            java.util.Iterator r15 = r0.iterator()
            goto L_0x008a
        L_0x007e:
            java.lang.Object r0 = r15.next()
            o.mb r0 = (p004o.C0548mb) r0
            r12 = r0
            if (r12 == 0) goto L_0x008a
            r12.mo3992(r13)
        L_0x008a:
            boolean r0 = r15.hasNext()
            if (r0 != 0) goto L_0x007e
            r0 = r24
            o.hn r0 = r0.f1680
            o.ly r0 = r0.f1195
            if (r0 == 0) goto L_0x009f
            r0 = r24
            o.羇 r0 = r0.f1689
            r0.mo4472()
        L_0x009f:
            r12 = r24
            r0 = 4
            o.ತ[] r0 = new p004o.C1341[r0]
            o.羇 r1 = r12.f1689
            float r2 = r1.f7998
            r17 = r2
            r16 = 0
            r15 = 0
            o.ತ r18 = new o.ತ
            r1 = r18
            r1.<init>()
            r1 = r18
            float[] r1 = r1.f6874
            r2 = 0
            android.opengl.Matrix.setIdentityM(r1, r2)
            r1 = r18
            float[] r1 = r1.f6874
            r2 = 0
            r3 = r16
            r4 = r17
            android.opengl.Matrix.translateM(r1, r2, r15, r3, r4)
            r1 = 0
            r0[r1] = r18
            r1 = -1085730853(0xffffffffbf490fdb, float:-0.7853982)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r4 = 0
            o.ತ r1 = p004o.C1341.m2060(r1, r2, r3, r4)
            r2 = 1
            r0[r2] = r1
            o.羇 r1 = r12.f1689
            float r1 = r1.f7999
            r2 = 1127481344(0x43340000, float:180.0)
            float r1 = r1 / r2
            r2 = 1078530011(0x40490fdb, float:3.1415927)
            float r1 = r1 * r2
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            o.ತ r1 = p004o.C1341.m2060(r1, r2, r3, r4)
            r2 = 2
            r0[r2] = r1
            o.羇 r1 = r12.f1689
            float[] r1 = r1.f7989
            r2 = 0
            r1 = r1[r2]
            float r15 = -r1
            o.羇 r1 = r12.f1689
            float[] r1 = r1.f7989
            r2 = 1
            r1 = r1[r2]
            float r2 = -r1
            r16 = r2
            o.羇 r1 = r12.f1689
            float[] r1 = r1.f7989
            r2 = 2
            r1 = r1[r2]
            float r2 = -r1
            r17 = r2
            o.ತ r18 = new o.ತ
            r1 = r18
            r1.<init>()
            r1 = r18
            float[] r1 = r1.f6874
            r2 = 0
            android.opengl.Matrix.setIdentityM(r1, r2)
            r1 = r18
            float[] r1 = r1.f6874
            r2 = 0
            r3 = r16
            r4 = r17
            android.opengl.Matrix.translateM(r1, r2, r15, r3, r4)
            r1 = 3
            r0[r1] = r18
            o.ತ r0 = p004o.C1341.m2062(r0)
            r1 = r24
            r1.f1692 = r0
            o.ತ r0 = r12.f1697
            float[] r0 = r0.f6874
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            android.opengl.Matrix.setLookAtM(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 3
            o.ತ[] r0 = new p004o.C1341[r0]
            o.ತ r1 = r12.f1681
            r2 = 0
            r0[r2] = r1
            o.ತ r1 = r12.f1697
            r2 = 1
            r0[r2] = r1
            o.ತ r1 = r12.f1692
            r2 = 2
            r0[r2] = r1
            o.ತ r0 = p004o.C1341.m2062(r0)
            r12.f1682 = r0
            r0 = 2
            o.ತ[] r0 = new p004o.C1341[r0]
            o.羇 r1 = r12.f1689
            float r1 = r1.f7999
            float r1 = -r1
            r2 = 1127481344(0x43340000, float:180.0)
            float r1 = r1 / r2
            r2 = 1078530011(0x40490fdb, float:3.1415927)
            float r1 = r1 * r2
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            o.ತ r1 = p004o.C1341.m2060(r1, r2, r3, r4)
            r2 = 0
            r0[r2] = r1
            r1 = 1061752795(0x3f490fdb, float:0.7853982)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r4 = 0
            o.ತ r1 = p004o.C1341.m2060(r1, r2, r3, r4)
            r2 = 1
            r0[r2] = r1
            o.ತ r0 = p004o.C1341.m2062(r0)
            r12.f1691 = r0
            o.羇 r0 = r12.f1689
            float[] r0 = r0.f7993
            o.ತ r1 = r12.f1682
            float[] r2 = r1.f6874
            r1 = 4
            float[] r4 = new float[r1]
            o.羇 r1 = r12.f1689
            float[] r1 = r1.f7989
            r3 = 0
            r1 = r1[r3]
            r3 = 0
            r4[r3] = r1
            o.羇 r1 = r12.f1689
            float[] r1 = r1.f7989
            r3 = 1
            r1 = r1[r3]
            r3 = 1
            r4[r3] = r1
            o.羇 r1 = r12.f1689
            float[] r1 = r1.f7989
            r3 = 2
            r1 = r1[r3]
            r3 = 2
            r4[r3] = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 3
            r4[r3] = r1
            r1 = 0
            r3 = 0
            r5 = 0
            android.opengl.Matrix.multiplyMV(r0, r1, r2, r3, r4, r5)
            r0 = r24
            o.羇 r0 = r0.f1689
            boolean r0 = r0.f7994
            if (r0 != 0) goto L_0x01ce
            r0 = r24
            o.羇 r0 = r0.f1689
            boolean r0 = r0.f7997
            if (r0 == 0) goto L_0x03b5
        L_0x01ce:
            r12 = r24
            o.榊 r0 = p004o.C1014.f6136
            if (r0 == 0) goto L_0x01da
            o.嫶 r0 = r12.f1695
            o.툀[] r0 = r0.f7344
            if (r0 != 0) goto L_0x01dc
        L_0x01da:
            goto L_0x02d6
        L_0x01dc:
            o.嫶 r0 = r12.f1695
            o.툀[] r0 = r0.f7344
            int r0 = r0.length
            o.툀[] r1 = new p004o.C2038[r0]
            r18 = r1
            o.揟 r0 = r12.f1687
            o.툀[] r1 = r0.f7532
            r19 = r1
            r15 = 0
            if (r19 == 0) goto L_0x01f4
            r0 = r19
            int r0 = r0.length
            r16 = r0
            goto L_0x01f6
        L_0x01f4:
            r16 = 0
        L_0x01f6:
            o.hn r0 = r12.f1680
            o.ly r0 = r0.f1195
            if (r0 == 0) goto L_0x02ca
            o.hn r0 = r12.f1680
            o.ly r0 = r0.f1195
            o.lj r0 = r0.f1707
            if (r0 == 0) goto L_0x02ca
            o.嫶 r0 = r12.f1695
            o.툀[] r1 = r0.f7344
            r22 = r1
            r0 = r22
            int r0 = r0.length
            r21 = r0
            r20 = 0
            goto L_0x02c4
        L_0x0213:
            r17 = r22[r20]
            o.hn r0 = r12.f1680
            o.ly r0 = r0.f1195
            o.lj r1 = r0.f1707
            r23 = r1
            r0 = r23
            float r0 = r0.f1652
            r1 = r17
            o.橙 r1 = r1.f8929
            float[] r1 = r1.f7606
            r2 = 0
            r1 = r1[r2]
            r2 = r17
            float r2 = r2.f8932
            float r1 = r1 - r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02c2
            r0 = r23
            float r0 = r0.f1652
            r1 = r17
            o.橙 r1 = r1.f8929
            float[] r1 = r1.f7606
            r2 = 0
            r1 = r1[r2]
            r2 = r17
            float r2 = r2.f8932
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02c2
            r0 = r23
            float r0 = r0.f1651
            r1 = r17
            o.橙 r1 = r1.f8929
            float[] r1 = r1.f7606
            r2 = 1
            r1 = r1[r2]
            r2 = r17
            float r2 = r2.f8932
            float r1 = r1 - r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02c2
            r0 = r23
            float r0 = r0.f1651
            r1 = r17
            o.橙 r1 = r1.f8929
            float[] r1 = r1.f7606
            r2 = 1
            r1 = r1[r2]
            r2 = r17
            float r2 = r2.f8932
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02c2
            r0 = r23
            float r0 = r0.f1650
            r1 = r17
            o.橙 r1 = r1.f8929
            float[] r1 = r1.f7606
            r2 = 2
            r1 = r1[r2]
            r2 = r17
            float r2 = r2.f8932
            float r1 = r1 - r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02c2
            r0 = r23
            float r0 = r0.f1650
            r1 = r17
            o.橙 r1 = r1.f8929
            float[] r1 = r1.f7606
            r2 = 2
            r1 = r1[r2]
            r2 = r17
            float r2 = r2.f8932
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02c2
            r0 = r15
            int r15 = r15 + 1
            r18[r0] = r17
            r23 = 0
            goto L_0x02b1
        L_0x02a9:
            r0 = r19[r23]
            r1 = r17
            if (r0 == r1) goto L_0x02b7
            int r23 = r23 + 1
        L_0x02b1:
            r0 = r23
            r1 = r16
            if (r0 < r1) goto L_0x02a9
        L_0x02b7:
            r0 = r23
            r1 = r16
            if (r0 != r1) goto L_0x02c2
            r0 = r17
            r0.mo4629()
        L_0x02c2:
            int r20 = r20 + 1
        L_0x02c4:
            r0 = r20
            r1 = r21
            if (r0 < r1) goto L_0x0213
        L_0x02ca:
            o.揟 r0 = r12.f1687
            r1 = r18
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r15)
            o.툀[] r1 = (p004o.C2038[]) r1
            r0.f7532 = r1
        L_0x02d6:
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r12 = r0.f51
            o.gk[] r0 = r12.f1453
            if (r0 == 0) goto L_0x03b5
            o.gk[] r0 = r12.f1453
            r16 = r0
            r0 = r16
            int r15 = r0.length
            r19 = 0
            goto L_0x03b1
        L_0x02e9:
            r17 = r16[r19]
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.煯 r0 = r0.f53
            if (r0 == 0) goto L_0x03af
            o.lq r0 = p004o.C1014.f6142
            r1 = r17
            o.gl$if r1 = r1.f1019
            int r1 = r1.f1032
            r2 = r17
            o.gl$if r2 = r2.f1019
            int r2 = r2.f1030
            r3 = 0
            r4 = 0
            o.lj r20 = r0.mo3977(r1, r2, r3, r4)
            o.lq r0 = p004o.C1014.f6142
            r1 = r20
            o.li r21 = r0.mo3974(r1)
            r0 = r21
            float r0 = r0.f1649
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x033d
            r0 = r21
            float r0 = r0.f1649
            o.lq r1 = p004o.C1014.f6142
            android.graphics.Point r1 = r1.f1690
            int r1 = r1.x
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x033d
            r0 = r21
            float r0 = r0.f1648
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x033d
            r0 = r21
            float r0 = r0.f1648
            o.lq r1 = p004o.C1014.f6142
            android.graphics.Point r1 = r1.f1690
            int r1 = r1.y
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0348
        L_0x033d:
            r0 = r17
            android.widget.RelativeLayout r0 = r0.f1022
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x03af
        L_0x0348:
            r0 = r17
            android.widget.RelativeLayout r0 = r0.f1022
            r1 = 0
            r0.setVisibility(r1)
            r0 = r21
            float r0 = r0.f1648
            r1 = r17
            o.gl$if r1 = r1.f1019
            int r1 = r1.f1029
            float r1 = (float) r1
            float r0 = r0 + r1
            r1 = r21
            r1.f1648 = r0
            com.roworkshop.andro.c_point r22 = new com.roworkshop.andro.c_point
            r0 = r21
            float r0 = r0.f1649
            int r0 = (int) r0
            com.roworkshop.andro.c_activity r1 = p004o.C1014.f6147
            o.煯 r1 = r1.f53
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r2 = r21
            float r2 = r2.f1648
            com.roworkshop.andro.c_activity r3 = p004o.C1014.f6147
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r12 = r3.getDisplayMetrics()
            int r3 = r12.densityDpi
            float r3 = (float) r3
            r4 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 / r4
            r4 = 1110704128(0x42340000, float:45.0)
            float r3 = r3 * r4
            float r2 = r2 + r3
            float r1 = r1 - r2
            int r1 = (int) r1
            r2 = r22
            r2.<init>(r0, r1)
            r0 = r22
            int r0 = r0.y
            r1 = r17
            com.roworkshop.andro.c_point r1 = r1.f1018
            int r1 = r1.y
            int r1 = r1 / 2
            int r0 = r0 - r1
            r1 = r22
            r1.y = r0
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            r0 = r17
            android.widget.RelativeLayout r0 = r0.f1022
            r1 = r17
            com.roworkshop.andro.c_point r1 = r1.f1018
            r2 = r22
            p004o.C0453ix.m487(r0, r2, r1)
        L_0x03af:
            int r19 = r19 + 1
        L_0x03b1:
            r0 = r19
            if (r0 < r15) goto L_0x02e9
        L_0x03b5:
            r0 = r24
            o.hn r0 = r0.f1680
            java.util.HashMap<java.lang.Integer, o.mb> r0 = r0.f1189
            java.util.Collection r0 = r0.values()
            java.util.Iterator r15 = r0.iterator()
            goto L_0x0432
        L_0x03c5:
            java.lang.Object r0 = r15.next()
            o.mb r0 = (p004o.C0548mb) r0
            r12 = r0
            if (r12 == 0) goto L_0x0432
            r0 = r24
            o.羇 r0 = r0.f1689
            boolean r0 = r0.f7994
            if (r0 != 0) goto L_0x03e1
            r0 = r24
            o.羇 r0 = r0.f1689
            boolean r0 = r0.f7997
            if (r0 != 0) goto L_0x03e1
            r18 = 0
            goto L_0x03e3
        L_0x03e1:
            r18 = 1
        L_0x03e3:
            if (r18 != 0) goto L_0x0411
            o.le r0 = r12.f1769
            int r0 = r0.f1634
            android.graphics.Point r1 = r12.f1770
            int r1 = r1.x
            if (r0 != r1) goto L_0x0411
            o.le r0 = r12.f1769
            int r0 = r0.f1631
            android.graphics.Point r1 = r12.f1770
            int r1 = r1.y
            if (r0 != r1) goto L_0x0411
            o.le r0 = r12.f1769
            com.roworkshop.andro.c_point r0 = r0.f1632
            int r0 = r0.x
            android.graphics.Point r1 = r12.f1771
            int r1 = r1.x
            if (r0 != r1) goto L_0x0411
            o.le r0 = r12.f1769
            com.roworkshop.andro.c_point r0 = r0.f1632
            int r0 = r0.y
            android.graphics.Point r1 = r12.f1771
            int r1 = r1.y
            if (r0 == r1) goto L_0x0432
        L_0x0411:
            r12.mo3985()
            android.graphics.Point r0 = r12.f1770
            o.le r1 = r12.f1769
            int r1 = r1.f1634
            o.le r2 = r12.f1769
            int r2 = r2.f1631
            r0.set(r1, r2)
            android.graphics.Point r0 = r12.f1771
            o.le r1 = r12.f1769
            com.roworkshop.andro.c_point r1 = r1.f1632
            int r1 = r1.x
            o.le r2 = r12.f1769
            com.roworkshop.andro.c_point r2 = r2.f1632
            int r2 = r2.y
            r0.set(r1, r2)
        L_0x0432:
            boolean r0 = r15.hasNext()
            if (r0 != 0) goto L_0x03c5
            r0 = r24
            o.hn r0 = r0.f1680
            java.util.LinkedList<o.柫> r0 = r0.f1187
            java.util.Iterator r12 = r0.iterator()
            goto L_0x0452
        L_0x0443:
            java.lang.Object r0 = r12.next()
            o.柫 r0 = (p004o.C1632) r0
            boolean r0 = r0.mo4422(r13)
            if (r0 == 0) goto L_0x0452
            r12.remove()
        L_0x0452:
            boolean r0 = r12.hasNext()
            if (r0 != 0) goto L_0x0443
            r0 = r24
            o.hn r0 = r0.f1680
            o.bd r0 = r0.f1190
            if (r0 == 0) goto L_0x0488
            r0 = r24
            o.hn r0 = r0.f1680
            o.bd r12 = r0.f1190
            o.bd$鷭 r0 = r12.f466
            o.bd$鷭 r1 = p004o.C0208bd.C0209.SUCCESS
            if (r0 == r1) goto L_0x0472
            o.bd$鷭 r0 = r12.f466
            o.bd$鷭 r1 = p004o.C0208bd.C0209.FAIL
            if (r0 != r1) goto L_0x047e
        L_0x0472:
            long r0 = r12.f467
            long r0 = r13 - r0
            r2 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x047e
            r0 = 1
            goto L_0x047f
        L_0x047e:
            r0 = 0
        L_0x047f:
            if (r0 == 0) goto L_0x0488
            r0 = r24
            o.hn r0 = r0.f1680
            r1 = 0
            r0.f1190 = r1
        L_0x0488:
            r12 = r24
            o.榊 r0 = p004o.C1014.f6136
            if (r0 == 0) goto L_0x0494
            o.揟 r0 = r12.f1687
            o.툀[] r0 = r0.f7532
            if (r0 != 0) goto L_0x0495
        L_0x0494:
            goto L_0x04c1
        L_0x0495:
            o.揟 r0 = r12.f1687
            o.툀[] r1 = r0.f7532
            r20 = r1
            r0 = r20
            int r0 = r0.length
            r17 = r0
            r16 = 0
            goto L_0x04bb
        L_0x04a3:
            r15 = r20[r16]
            long r0 = r15.f8930
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x04b9
            long r0 = r15.f8931
            long r2 = r15.f8930
            long r0 = r0 + r2
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x04b9
            r15.mo4629()
        L_0x04b9:
            int r16 = r16 + 1
        L_0x04bb:
            r0 = r16
            r1 = r17
            if (r0 < r1) goto L_0x04a3
        L_0x04c1:
            r12 = r24
            r0 = r24
            o.hn r0 = r0.f1680
            java.util.HashMap<java.lang.Integer, o.mb> r0 = r0.f1189
            int r0 = r0.size()
            int[] r1 = new int[r0]
            r16 = r1
            r17 = 0
            o.hn r0 = r12.f1680
            java.util.HashMap<java.lang.Integer, o.mb> r0 = r0.f1189
            java.util.Collection r0 = r0.values()
            java.util.Iterator r21 = r0.iterator()
            goto L_0x051b
        L_0x04e0:
            r0 = r21
            java.lang.Object r0 = r0.next()
            o.mb r0 = (p004o.C0548mb) r0
            r20 = r0
            r0 = r20
            o.mo r0 = r0.f1772
            o.mo r1 = p004o.C0561mo.DEAD
            if (r0 != r1) goto L_0x051b
            r0 = r20
            boolean r0 = r0.mo4630(r13)
            if (r0 == 0) goto L_0x051b
            r0 = r20
            o.on r0 = r0.f8948
            float r0 = r0.f3009
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x051b
            r0 = r20
            o.le r0 = r0.f1769
            o.nn r0 = r0.f1629
            o.nn r1 = p004o.C0587nn.PC
            if (r0 == r1) goto L_0x051b
            r0 = r17
            int r17 = r17 + 1
            r1 = r20
            o.le r1 = r1.f1769
            int r1 = r1.f1630
            r16[r0] = r1
        L_0x051b:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x04e0
            r20 = 0
            goto L_0x052f
        L_0x0526:
            o.Ą r0 = p004o.C1014.f6161
            r0 = r16[r20]
            p004o.C1014.m1839(r0)
            int r20 = r20 + 1
        L_0x052f:
            r0 = r20
            r1 = r17
            if (r0 < r1) goto L_0x0526
            r0 = r24
            o.羇 r12 = r0.f1689
            float[] r0 = r12.f7989
            r1 = 0
            r0 = r0[r1]
            float[] r1 = r12.f7990
            r2 = 0
            r1 = r1[r2]
            float r18 = r0 - r1
            float[] r0 = r12.f7989
            r1 = 1
            r0 = r0[r1]
            float[] r1 = r12.f7990
            r2 = 1
            r1 = r1[r2]
            float r19 = r0 - r1
            float[] r0 = r12.f7989
            r1 = 2
            r0 = r0[r1]
            float[] r1 = r12.f7990
            r2 = 2
            r1 = r1[r2]
            float r15 = r0 - r1
            float r0 = r12.f7992
            float r1 = r12.f7999
            float r16 = r0 - r1
            float r0 = r18 * r18
            float r1 = r19 * r19
            float r0 = r0 + r1
            float r1 = r15 * r15
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0584
            r0 = r16
            float r0 = java.lang.Math.abs(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0584
            r0 = 0
            goto L_0x0585
        L_0x0584:
            r0 = 1
        L_0x0585:
            if (r0 != 0) goto L_0x058f
            r0 = r24
            o.羇 r0 = r0.f1689
            boolean r0 = r0.f7997
            if (r0 == 0) goto L_0x05db
        L_0x058f:
            r0 = r24
            o.揟 r0 = r0.f1687
            r1 = r24
            o.嫶 r1 = r1.f1695
            o.ik r1 = r1.f7338
            r2 = r24
            o.嫶 r2 = r2.f1695
            o.ln r2 = r2.f7339
            r3 = r24
            o.嫶 r3 = r3.f1695
            o.쭅[] r3 = r3.f7341
            r4 = r24
            o.羇 r4 = r4.f1689
            r5 = r24
            android.graphics.Point r5 = r5.f1690
            int r5 = r5.x
            r5 = r24
            android.graphics.Point r5 = r5.f1690
            int r5 = r5.y
            r0.mo4413(r1, r2, r3, r4)
            r0 = r24
            o.羇 r0 = r0.f1689
            r1 = r24
            o.羇 r1 = r1.f1689
            float[] r1 = r1.f7989
            r2 = r24
            o.羇 r2 = r2.f1689
            float[] r2 = r2.f7989
            int r2 = r2.length
            float[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.f7990 = r1
            r0 = r24
            o.羇 r0 = r0.f1689
            r1 = r24
            o.羇 r1 = r1.f1689
            float r1 = r1.f7999
            r0.f7992 = r1
        L_0x05db:
            r0 = r24
            o.羇 r0 = r0.f1689
            r1 = 0
            r0.f7994 = r1
            r0 = r24
            o.羇 r0 = r0.f1689
            r1 = 0
            r0.f7997 = r1
            r0 = r24
            o.㙜[] r15 = r0.m596(r13)
            r0 = r24
            o.揟 r0 = r0.f1687
            o.揟 r0 = r0.clone()
            r11.f6867 = r0
            o.揟 r0 = r11.f6867
            o.揟$if r0 = r0.f7535
            if (r0 != 0) goto L_0x0627
            o.揟 r0 = r11.f6867
            o.揟$if r1 = new o.揟$if
            o.揟 r2 = r11.f6867
            r1.<init>()
            r0.f7535 = r1
            o.揟 r0 = r11.f6867
            o.揟$if r0 = r0.f7535
            r1 = r24
            o.嫶 r1 = r1.f1695
            o.ik r1 = r1.f7338
            o.od[] r1 = r1.f1304
            r0.f7538 = r1
            o.揟 r0 = r11.f6867
            o.揟$if r0 = r0.f7535
            r1 = r24
            o.嫶 r1 = r1.f1695
            o.ik r1 = r1.f7338
            o.od[] r1 = r1.f1304
            int r1 = r1.length
            r0.f7537 = r1
        L_0x0627:
            o.揟 r0 = r11.f6867
            o.揟$if r0 = r0.f7534
            if (r0 != 0) goto L_0x0655
            o.揟 r0 = r11.f6867
            o.揟$if r1 = new o.揟$if
            o.揟 r2 = r11.f6867
            r1.<init>()
            r0.f7534 = r1
            o.揟 r0 = r11.f6867
            o.揟$if r0 = r0.f7534
            r1 = r24
            o.嫶 r1 = r1.f1695
            o.ln r1 = r1.f7339
            o.od[] r1 = r1.f1665
            r0.f7538 = r1
            o.揟 r0 = r11.f6867
            o.揟$if r0 = r0.f7534
            r1 = r24
            o.嫶 r1 = r1.f1695
            o.ln r1 = r1.f7339
            o.od[] r1 = r1.f1665
            int r1 = r1.length
            r0.f7537 = r1
        L_0x0655:
            o.揟 r0 = r11.f6867
            o.揟$鷭 r0 = r0.f7533
            if (r0 != 0) goto L_0x067f
            o.揟 r0 = r11.f6867
            o.揟$鷭 r1 = new o.揟$鷭
            o.揟 r2 = r11.f6867
            r1.<init>()
            r0.f7533 = r1
            o.揟 r0 = r11.f6867
            o.揟$鷭 r0 = r0.f7533
            r1 = r24
            o.嫶 r1 = r1.f1695
            o.쭅[] r1 = r1.f7341
            r0.f7541 = r1
            o.揟 r0 = r11.f6867
            o.揟$鷭 r0 = r0.f7533
            r1 = r24
            o.嫶 r1 = r1.f1695
            o.쭅[] r1 = r1.f7341
            int r1 = r1.length
            r0.f7540 = r1
        L_0x067f:
            r11.f6866 = r15
            r0 = r24
            o.hn r0 = r0.f1680
            java.util.LinkedList<o.柫> r0 = r0.f1187
            java.lang.Object r0 = r0.clone()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r11.f6863 = r0
            r0 = r24
            o.ತ r12 = r0.f1682
            o.ತ r0 = new o.ತ
            float[] r1 = r12.f6874
            r2 = 16
            float[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.<init>(r1)
            r11.f6864 = r0
            r0 = r24
            o.ತ r12 = r0.f1691
            o.ತ r0 = new o.ತ
            float[] r1 = r12.f6874
            r2 = 16
            float[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.<init>(r1)
            r11.f6865 = r0
            r0 = r24
            o.騛 r0 = r0.f1698
            r0.f8355 = r11
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            if (r0 == 0) goto L_0x0703
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            o.ձ$if r0 = r0.f6524
            if (r0 == 0) goto L_0x06e2
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            o.ձ$if r0 = r0.f6524
            o.ձ$鷭 r0 = r0.f6567
            int r0 = r0.f6599
            if (r0 <= 0) goto L_0x06e2
            o.cp r0 = p004o.C1014.f6158
            o.ck r0 = r0.f674
            o.휺 r0 = r0.f620
            o.nn r1 = p004o.C0587nn.HOM
            o.lf r2 = p004o.C1014.f6137
            r0.mo4635(r1)
        L_0x06e2:
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            o.ձ$if r0 = r0.f6538
            if (r0 == 0) goto L_0x0703
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            o.ձ$if r0 = r0.f6538
            o.ձ$鷭 r0 = r0.f6567
            int r0 = r0.f6599
            if (r0 <= 0) goto L_0x0703
            o.cp r0 = p004o.C1014.f6158
            o.ck r0 = r0.f674
            o.휺 r0 = r0.f620
            o.nn r1 = p004o.C0587nn.MER
            o.lf r2 = p004o.C1014.f6137
            r0.mo4635(r1)
        L_0x0703:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0534lq.mo3979():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3981(C0548mb mbVar, boolean z) {
        if (mbVar.mo4015()) {
            this.f1688 = z;
            if (this.f1693 != mbVar) {
                if (this.f1693 != null) {
                    mo3976(this.f1693, false);
                }
                this.f1693 = mbVar;
                C0548mb mbVar2 = this.f1693;
                if (mbVar2.f1777 == null) {
                    mbVar2.f1777 = new C0437ij(mbVar2);
                }
            }
            C1014.f6147.f51.mo3864();
            C0520le leVar = mbVar.f1769;
            if ((C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null) != null) {
                C0520le leVar2 = mbVar.f1769;
                C1919 r0 = C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null;
                C1919 r6 = r0;
                if (r0.f8650 == C1920if.UNRESOLVED) {
                    r6.f8650 = C1920if.RESOLVING;
                    C1014.f6144.mo3652((C0839ue) new C1134(r6.f1630));
                } else if (r6.f8650 == C1920if.RESOLVED) {
                    C0548mb mbVar3 = mbVar;
                    if (mbVar.f1775 != null) {
                        mbVar3.f1775.mo4495(mbVar3);
                    } else {
                        mbVar3.f1775 = new C1752(mbVar3);
                    }
                }
            } else {
                C0548mb mbVar4 = mbVar;
                if (mbVar.f1775 != null) {
                    mbVar4.f1775.mo4495(mbVar4);
                    return;
                }
                mbVar4.f1775 = new C1752(mbVar4);
            }
        }
    }

    /* renamed from: 櫯 */
    public final void mo3976(C0548mb mbVar, boolean z) {
        if (this.f1693 == mbVar) {
            this.f1693.mo4016();
            this.f1693.f1777 = null;
            this.f1693 = null;
            C1014.f6137.f1636.f8649 = null;
            C1014.f6147.f51.mo3864();
            if (z) {
                mo3975();
            }
        }
    }

    /* renamed from: ˮ͈ */
    private C0548mb m592() {
        if (this.f1693 != null) {
            C0548mb mbVar = this.f1693;
            mo3976(mbVar, true);
            return mbVar;
        }
        mo3975();
        return null;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 132 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        if ((p004o.C0540lv.class.isAssignableFrom(r8.getClass()) ? r8 : null).f1732.f8660 == false) goto L_0x0071;
     */
    /* renamed from: 櫯 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3975() {
        /*
            r13 = this;
            com.roworkshop.andro.c_point r8 = new com.roworkshop.andro.c_point
            o.嫶 r0 = r13.f1695
            o.tc r0 = r0.f7342
            int r0 = r0.f4721
            int r0 = r0 * 100
            o.嫶 r1 = r13.f1695
            o.tc r1 = r1.f7342
            int r1 = r1.f4719
            int r1 = r1 * 100
            r8.<init>(r0, r1)
            int r0 = r8.x
            double r9 = (double) r0
            int r0 = r8.y
            double r11 = (double) r0
            double r0 = r9 * r9
            double r2 = r11 * r11
            double r0 = r0 + r2
            double r0 = java.lang.Math.sqrt(r0)
            int r4 = (int) r0
            r5 = 0
            o.hn r0 = r13.f1680
            java.util.HashMap<java.lang.Integer, o.mb> r0 = r0.f1189
            java.util.Collection r0 = r0.values()
            java.util.Iterator r7 = r0.iterator()
            goto L_0x00d6
        L_0x0034:
            java.lang.Object r0 = r7.next()
            o.mb r0 = (p004o.C0548mb) r0
            r6 = r0
            o.hn r0 = r13.f1680
            o.ly r0 = r0.f1195
            if (r6 == r0) goto L_0x00d6
            o.le r9 = r6.f1769
            java.lang.Class<o.둆> r10 = p004o.C1919.class
            java.lang.Class r0 = r9.getClass()
            boolean r0 = r10.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x0051
            r0 = r9
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 == 0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 == 0) goto L_0x0071
            java.lang.Class<o.lv> r9 = p004o.C0540lv.class
            r8 = r6
            java.lang.Class r0 = r8.getClass()
            boolean r0 = r9.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x0068
            r0 = r8
            goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            o.lv r0 = (p004o.C0540lv) r0
            o.둆 r0 = r0.f1732
            boolean r0 = r0.f8660
            if (r0 != 0) goto L_0x00d6
        L_0x0071:
            boolean r0 = r6.mo4015()
            if (r0 == 0) goto L_0x00d6
            o.le r0 = r6.f1769
            o.nn r0 = r0.f1629
            o.nn r1 = p004o.C0587nn.MOB
            if (r0 == r1) goto L_0x00d6
            com.roworkshop.andro.c_point r8 = new com.roworkshop.andro.c_point
            o.le r0 = r6.f1769
            int r0 = r0.f1634
            int r0 = r0 * 100
            o.le r1 = r6.f1769
            com.roworkshop.andro.c_point r1 = r1.f1632
            int r1 = r1.x
            int r0 = r0 + r1
            o.lf r1 = p004o.C1014.f6137
            o.ձ r1 = r1.f1636
            int r1 = r1.f1634
            int r1 = r1 * 100
            int r0 = r0 - r1
            o.lf r1 = p004o.C1014.f6137
            o.ձ r1 = r1.f1636
            com.roworkshop.andro.c_point r1 = r1.f1632
            int r1 = r1.x
            int r0 = r0 - r1
            o.le r1 = r6.f1769
            int r1 = r1.f1631
            int r1 = r1 * 100
            o.le r2 = r6.f1769
            com.roworkshop.andro.c_point r2 = r2.f1632
            int r2 = r2.y
            int r1 = r1 + r2
            o.lf r2 = p004o.C1014.f6137
            o.ձ r2 = r2.f1636
            int r2 = r2.f1631
            int r2 = r2 * 100
            int r1 = r1 - r2
            o.lf r2 = p004o.C1014.f6137
            o.ձ r2 = r2.f1636
            com.roworkshop.andro.c_point r2 = r2.f1632
            int r2 = r2.y
            int r1 = r1 - r2
            r8.<init>(r0, r1)
            int r0 = r8.x
            double r9 = (double) r0
            int r0 = r8.y
            double r11 = (double) r0
            double r0 = r9 * r9
            double r2 = r11 * r11
            double r0 = r0 + r2
            double r0 = java.lang.Math.sqrt(r0)
            int r8 = (int) r0
            if (r8 >= r4) goto L_0x00d6
            r4 = r8
            r5 = r6
        L_0x00d6:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0034
            if (r5 == 0) goto L_0x00e2
            r0 = 0
            r13.mo3981(r5, r0)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0534lq.mo3975():void");
    }
}

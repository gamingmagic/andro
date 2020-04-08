package p004o;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.ˮ̄ */
final class C1204 extends C0762sz {

    /* renamed from: Ą */
    int f6306 = 0;

    /* renamed from: ą */
    int f6307 = 0;

    /* renamed from: Ć */
    int f6308 = 994;

    /* renamed from: ć */
    int f6309 = 996;

    /* renamed from: ċ */
    int f6310 = 998;

    /* renamed from: ȃ */
    int f6311 = 3;

    /* renamed from: Ȋ */
    int f6312 = 1000;

    /* renamed from: ˮ͈ */
    int[] f6313 = new int[3];

    /* renamed from: ˮ͍ */
    int f6314 = 995;

    /* renamed from: 䒧 */
    boolean f6315 = false;

    /* renamed from: 岱 */
    int f6316 = 997;

    /* renamed from: 櫯 */
    ArrayList<C1992> f6317 = new ArrayList<>();

    /* renamed from: 纫 */
    int f6318 = 999;

    /* renamed from: 鷭 */
    C1205[] f6319;

    /* renamed from: o.ˮ̄$鷭 */
    class C1205 {

        /* renamed from: 櫯 */
        int[] f6321;

        /* renamed from: 鷭 */
        int f6322;

        C1205(ByteBuffer byteBuffer) {
            this.f6321 = new int[C1204.this.f6311];
            this.f6322 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
            for (int i = 0; i < this.f6321.length; i++) {
                this.f6321[i] = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
            }
        }
    }

    C1204() {
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 136 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r4.f8848 == r6.f6316) goto L_0x004c;
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4271(int r7, boolean r8) {
        /*
            r6 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6528
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
            goto L_0x0053
        L_0x0015:
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            o.쎥 r0 = (p004o.C1992) r0
            r4 = r0
            if (r4 == 0) goto L_0x0053
            int r0 = r6.f6306
            int r1 = r6.f6311
            if (r0 >= r1) goto L_0x0053
            int r0 = r4.f8848
            int r1 = r6.f6312
            if (r0 == r1) goto L_0x004c
            boolean r0 = r6.f6315
            if (r0 != 0) goto L_0x0053
            int r0 = r4.f8848
            int r1 = r6.f6308
            if (r0 == r1) goto L_0x004c
            int r0 = r4.f8848
            int r1 = r6.f6309
            if (r0 == r1) goto L_0x004c
            int r0 = r4.f8848
            int r1 = r6.f6314
            if (r0 == r1) goto L_0x004c
            int r0 = r4.f8848
            int r1 = r6.f6316
            if (r0 != r1) goto L_0x0053
        L_0x004c:
            if (r8 != 0) goto L_0x0053
            if (r4 == 0) goto L_0x0053
            r3.add(r4)
        L_0x0053:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x0015
            r4 = 0
            goto L_0x0065
        L_0x005b:
            o.ˮ̄$鷭[] r0 = r6.f6319
            r0 = r0[r4]
            int r0 = r0.f6322
            if (r0 == r7) goto L_0x006a
            int r4 = r4 + 1
        L_0x0065:
            o.ˮ̄$鷭[] r0 = r6.f6319
            int r0 = r0.length
            if (r4 < r0) goto L_0x005b
        L_0x006a:
            o.ˮ̄$鷭[] r0 = r6.f6319
            int r0 = r0.length
            if (r4 != r0) goto L_0x0070
            return
        L_0x0070:
            o.ˮ̄$鷭[] r0 = r6.f6319
            r5 = r0[r4]
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r0 = r0.f51
            o.ڇ r7 = r0.f1389
            r0 = r3
            o.郗 r1 = new o.郗
            r1.<init>(r6, r5, r8)
            r3 = r1
            r8 = r0
            r7.f6613 = r3
            android.widget.ListView r0 = r7.f6616
            o.ܯܶ r1 = new o.ܯܶ
            r2 = 0
            r1.<init>(r2, r8)
            r0.setAdapter(r1)
            r7.mo3537h_()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1204.mo4271(int, boolean):void");
    }

    /* renamed from: 鷭 */
    static void m1959(int[] iArr, ArrayList<C1992> arrayList) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != 0) {
                C1992 r4 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(iArr[i]));
                if (r4 == null) {
                    r4 = (C1992) arrayList.get(i);
                    r4.f8846++;
                    C1014.f6137.f1636.f6528.put(Integer.valueOf(iArr[i]), (C1992) arrayList.get(i));
                } else {
                    r4.f8846++;
                }
                C1842 r0 = C1014.f6147.f51.f1445;
                C1472 r5 = r4.f8839;
                C1842 r42 = r0;
                if (r0.f1626.getParent() != null) {
                    r42.mo4533(C0572mz.m662(r5));
                }
            }
        }
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 397;
        this.f6319 = new C1205[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f6319[i3] = new C1205(byteBuffer);
        }
        if (!z) {
            if (i == 0) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r6 = C1014.f6160.mo3796((int) FTPReply.CANNOT_OPEN_DATA_CONNECTION);
                r0.mo4490(r6 == null ? "MSG425" : r6, 16711680);
                return;
            }
            C1992[] r7 = new C1992[i];
            for (int i4 = 0; i4 < i; i4++) {
                r7[i4] = new C1992(this.f6319[i4].f6322);
            }
            this.f6306 = 0;
            C1528 r4 = C1014.f6147.f51.f1388;
            C1992[] r5 = r7;
            r4.f7283 = new C1608(this);
            r4.f7284.setAdapter(new C1323((int[]) null, r5));
            r4.mo3537h_();
        }
    }
}

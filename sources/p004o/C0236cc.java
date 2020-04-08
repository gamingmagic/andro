package p004o;

import android.graphics.Point;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: o.cc */
class C0236cc extends C0245ci {

    /* renamed from: 鷭 */
    static final float f553 = ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 1.0f);

    /* renamed from: Ą */
    int f554;

    /* renamed from: ą */
    int f555;

    /* renamed from: Ć */
    int f556;

    /* renamed from: ć */
    C0442if[] f557 = new C0442if[3];

    /* renamed from: ȃ */
    Point f558 = new Point();

    /* renamed from: ˮ͈ */
    Point f559 = new Point();

    /* renamed from: 櫯 */
    C0548mb f560;

    static {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3592(int i, int i2) {
        if (i > i2) {
            i = i2;
        }
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(144).order(ByteOrder.nativeOrder()).asFloatBuffer();
        float f = ((float) i) / ((float) i2);
        C0525li liVar = new C0525li(((float) this.f558.x) / 2.0f, ((float) this.f558.y) / 2.0f);
        C0525li liVar2 = new C0525li(liVar.f1649 - f553, liVar.f1648 - f553);
        float f2 = f * (((float) this.f558.x) - (f553 * 2.0f));
        asFloatBuffer.put(new float[]{-liVar.f1649, -liVar.f1648, (float) this.f557[0].f1327, -liVar.f1649, liVar.f1648, (float) this.f557[0].f1327, liVar.f1649, -liVar.f1648, (float) this.f557[0].f1327, liVar.f1649, liVar.f1648, (float) this.f557[0].f1327, -liVar2.f1649, -liVar2.f1648, (float) this.f557[1].f1327, -liVar2.f1649, liVar2.f1648, (float) this.f557[1].f1327, liVar2.f1649, -liVar2.f1648, (float) this.f557[1].f1327, liVar2.f1648, liVar2.f1648, (float) this.f557[1].f1327, -liVar2.f1649, -liVar2.f1648, (float) this.f557[2].f1327, -liVar2.f1649, liVar2.f1648, (float) this.f557[2].f1327, (-liVar2.f1649) + f2, -liVar2.f1648, (float) this.f557[2].f1327, (-liVar2.f1649) + f2, liVar2.f1648, (float) this.f557[2].f1327});
        asFloatBuffer.position(0);
        this.f590 = asFloatBuffer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0236cc(p004o.C0540lv r13, int r14, int r15, com.roworkshop.andro.c_point r16, com.roworkshop.andro.c_point r17, int r18, int r19, int r20) {
        /*
            r12 = this;
            r12.<init>()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r12.f559 = r0
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r12.f558 = r0
            r0 = 3
            o.in$if[] r0 = new p004o.C0441in.C0442if[r0]
            r12.f557 = r0
            r12.f560 = r13
            android.graphics.Point r0 = r12.f558
            r1 = r16
            int r1 = r1.x
            r2 = r16
            int r2 = r2.y
            r0.set(r1, r2)
            android.graphics.Point r0 = r12.f559
            r1 = r17
            int r1 = r1.x
            r2 = r17
            int r2 = r2.y
            r0.set(r1, r2)
            r0 = r18
            r12.f554 = r0
            r0 = r19
            r12.f555 = r0
            r0 = r20
            r12.f556 = r0
            r0 = 192(0xc0, float:2.69E-43)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()
            r12.f592 = r0
            r0 = 36
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            java.nio.ShortBuffer r0 = r0.asShortBuffer()
            r12.f589 = r0
            int r0 = r12.f554
            java.lang.String r13 = java.lang.String.valueOf(r0)
            int r0 = r12.f556
            java.lang.String r16 = java.lang.String.valueOf(r0)
            int r0 = r12.f555
            java.lang.String r17 = java.lang.String.valueOf(r0)
            o.lq r0 = p004o.C1014.f6142
            o.hn r0 = r0.f1680
            o.in r0 = r0.f1198
            r10 = r13
            java.util.HashMap<java.lang.String, o.in$if> r0 = r0.f1316
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L_0x0089
            r0 = 1
            goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            if (r0 == 0) goto L_0x00b9
            o.lq r0 = p004o.C1014.f6142
            o.hn r0 = r0.f1680
            o.in r0 = r0.f1198
            r10 = r16
            java.util.HashMap<java.lang.String, o.in$if> r0 = r0.f1316
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L_0x009e
            r0 = 1
            goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            if (r0 == 0) goto L_0x00b9
            o.lq r0 = p004o.C1014.f6142
            o.hn r0 = r0.f1680
            o.in r0 = r0.f1198
            r10 = r17
            java.util.HashMap<java.lang.String, o.in$if> r0 = r0.f1316
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L_0x00b3
            r0 = 1
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            if (r0 == 0) goto L_0x00b9
            r18 = 0
            goto L_0x00bb
        L_0x00b9:
            r18 = 1
        L_0x00bb:
            r0 = 64
            int[] r0 = new int[r0]
            r19 = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r20 = r0
            int r0 = r12.f554
            r1 = 0
            r20[r1] = r0
            o.in$if[] r0 = r12.f557
            o.lq r1 = p004o.C1014.f6142
            o.hn r1 = r1.f1680
            o.in r9 = r1.f1198
            r11 = r13
            r13 = r20
            r10 = r19
            r2 = r10
            r3 = r13
            r6 = r11
            int r8 = r9.f1308
            r1 = r9
            r4 = 8
            r5 = 8
            r7 = 0
            o.in$if r1 = r1.mo3837(r2, r3, r4, r5, r6, r7, r8)
            r2 = 0
            r0[r2] = r1
            java.nio.FloatBuffer r0 = r12.f592
            o.in$if[] r1 = r12.f557
            r2 = 0
            r1 = r1[r2]
            float[] r1 = r1.mo3839()
            r0.put(r1)
            int r0 = r12.f556
            r1 = 0
            r20[r1] = r0
            o.in$if[] r0 = r12.f557
            o.lq r1 = p004o.C1014.f6142
            o.hn r1 = r1.f1680
            o.in r9 = r1.f1198
            r11 = r16
            r13 = r20
            r10 = r19
            r2 = r10
            r3 = r13
            r6 = r11
            int r8 = r9.f1308
            r1 = r9
            r4 = 8
            r5 = 8
            r7 = 0
            o.in$if r1 = r1.mo3837(r2, r3, r4, r5, r6, r7, r8)
            r2 = 1
            r0[r2] = r1
            java.nio.FloatBuffer r0 = r12.f592
            o.in$if[] r1 = r12.f557
            r2 = 1
            r1 = r1[r2]
            float[] r1 = r1.mo3839()
            r0.put(r1)
            int r0 = r12.f555
            r1 = 0
            r20[r1] = r0
            o.in$if[] r0 = r12.f557
            o.lq r1 = p004o.C1014.f6142
            o.hn r1 = r1.f1680
            o.in r9 = r1.f1198
            r11 = r17
            r13 = r20
            r10 = r19
            r2 = r10
            r3 = r13
            r6 = r11
            int r8 = r9.f1308
            r1 = r9
            r4 = 8
            r5 = 8
            r7 = 0
            o.in$if r1 = r1.mo3837(r2, r3, r4, r5, r6, r7, r8)
            r2 = 2
            r0[r2] = r1
            java.nio.FloatBuffer r0 = r12.f592
            o.in$if[] r1 = r12.f557
            r2 = 2
            r1 = r1[r2]
            float[] r1 = r1.mo3839()
            r0.put(r1)
            if (r18 == 0) goto L_0x0176
            o.lq r0 = p004o.C1014.f6142
            o.騛 r13 = r0.f1698
            o.cd r10 = new o.cd
            r10.<init>(r12)
            r9 = r13
            monitor-enter(r13)
            java.util.Queue<java.lang.Runnable> r0 = r9.f8360     // Catch:{ all -> 0x0173 }
            r0.add(r10)     // Catch:{ all -> 0x0173 }
            monitor-exit(r13)     // Catch:{ all -> 0x0173 }
            goto L_0x0176
        L_0x0173:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0173 }
            throw r0
        L_0x0176:
            r12.mo3592(r14, r15)
            java.nio.FloatBuffer r0 = r12.f592
            r1 = 0
            r0.position(r1)
            java.nio.ShortBuffer r0 = r12.f589
            r1 = 18
            short[] r1 = new short[r1]
            r2 = 1
            r3 = 1
            r1[r3] = r2
            r2 = 2
            r3 = 2
            r1[r3] = r2
            r2 = 2
            r3 = 3
            r1[r3] = r2
            r2 = 1
            r3 = 4
            r1[r3] = r2
            r2 = 3
            r3 = 5
            r1[r3] = r2
            r2 = 4
            r3 = 6
            r1[r3] = r2
            r2 = 5
            r3 = 7
            r1[r3] = r2
            r2 = 6
            r3 = 8
            r1[r3] = r2
            r2 = 6
            r3 = 9
            r1[r3] = r2
            r2 = 5
            r3 = 10
            r1[r3] = r2
            r2 = 7
            r3 = 11
            r1[r3] = r2
            r2 = 8
            r3 = 12
            r1[r3] = r2
            r2 = 9
            r3 = 13
            r1[r3] = r2
            r2 = 10
            r3 = 14
            r1[r3] = r2
            r2 = 10
            r3 = 15
            r1[r3] = r2
            r2 = 9
            r3 = 16
            r1[r3] = r2
            r2 = 11
            r3 = 17
            r1[r3] = r2
            r0.put(r1)
            java.nio.ShortBuffer r0 = r12.f589
            r1 = 0
            r0.position(r1)
            java.nio.FloatBuffer r10 = r12.f590
            java.nio.FloatBuffer r13 = r12.f592
            java.nio.ShortBuffer r14 = r12.f589
            r9 = r12
            r16 = r14
            r15 = r13
            r14 = r10
            r13 = r12
            r12.f590 = r14
            r13.f592 = r15
            r0 = r16
            r13.f589 = r0
            o.on r13 = r9.f586
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.f3008 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.f3007 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.f3006 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.f3009 = r0
            r9.mo3591()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0236cc.<init>(o.lv, int, int, com.roworkshop.andro.c_point, com.roworkshop.andro.c_point, int, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo3591() {
        C0525li r6 = C1014.f6142.mo3974(this.f560.f1707);
        if (r6 == null) {
            this.f591 = null;
            return;
        }
        r6.f1649 += (float) this.f559.x;
        r6.f1648 += (float) this.f559.y;
        C0525li liVar = this.f587;
        C0525li liVar2 = r6;
        C0525li liVar3 = liVar;
        liVar.f1649 = liVar2.f1649;
        liVar3.f1648 = liVar2.f1648;
        super.mo3591();
        if (C1014.f6142.f1683 != null) {
            C1341 r0 = C1014.f6142.f1683;
            C1341 r7 = this.f591;
            float[] fArr = r0.f6874;
            float[] fArr2 = new float[16];
            Matrix.multiplyMM(fArr2, 0, fArr, 0, r7.f6874, 0);
            C1341 r62 = new C1341();
            r62.f6874 = fArr2;
            this.f591 = r62;
        }
    }
}

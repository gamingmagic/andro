package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.殊 */
final class C1658 extends C0762sz {
    C1658() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2250;
        byteBuffer.getShort();
        short s = byteBuffer.getShort();
        C0244ch[] chVarArr = new C0244ch[i];
        for (int i3 = 0; i3 < i; i3++) {
            chVarArr[i3] = new C0244ch(byteBuffer);
        }
        if (!z) {
            m2327(s, chVarArr);
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 115 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m2327(int r4, p004o.C0244ch[] r5) {
        /*
            o.缟 r0 = p004o.C1014.f6152
            o.ғ r0 = r0.f7978
            java.util.LinkedList<o.ғ$鷭> r0 = r0.f6454
            java.util.Iterator r2 = r0.iterator()
            goto L_0x0018
        L_0x000b:
            java.lang.Object r0 = r2.next()
            o.ғ$鷭 r0 = (p004o.C1288.C1289) r0
            int r0 = r0.f6460
            if (r0 != r4) goto L_0x0018
            r2.remove()
        L_0x0018:
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L_0x000b
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r0 = r0.f51
            o.東 r0 = r0.f1391
            r1 = 0
            r0.f7558 = r1
            r2 = 0
            goto L_0x004b
        L_0x0029:
            o.ғ$鷭 r3 = new o.ғ$鷭
            o.缟 r0 = p004o.C1014.f6152
            o.ғ r0 = r0.f7978
            r3.<init>()
            r3.f6460 = r4
            r0 = r5[r2]
            int r0 = r0.f585
            r3.f6459 = r0
            r0 = r5[r2]
            int r0 = r0.f584
            r3.f6458 = r0
            o.缟 r0 = p004o.C1014.f6152
            o.ғ r0 = r0.f7978
            java.util.LinkedList<o.ғ$鷭> r0 = r0.f6454
            r0.add(r3)
            int r2 = r2 + 1
        L_0x004b:
            int r0 = r5.length
            if (r2 < r0) goto L_0x0029
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r0 = r0.f51
            o.東 r0 = r0.f1391
            r0.mo4418g_()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1658.m2327(int, o.ch[]):void");
    }
}

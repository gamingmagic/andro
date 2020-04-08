package p004o;

import android.app.AlertDialog.Builder;
import com.roworkshop.andro.c_activity;
import java.util.LinkedList;
import p004o.C1782.C1784;
import p004o.C1782.C1785;
import p004o.C1782.C1786;

/* renamed from: o.df */
public final class C0271df {

    /* renamed from: ˮ͍ */
    private static final byte[] f720 = {25, -53, 107, -13, -3, -14, 2, -9, 1, -14, 5, -13, -7, 60, -59, -18, -4};

    /* renamed from: 岱 */
    private static int f721 = 193;

    /* renamed from: Ą */
    LinkedList<C1530> f722 = new LinkedList<>();

    /* renamed from: ą */
    C1786 f723 = new C0273dh(this);

    /* renamed from: Ć */
    C1785 f724 = new C0274di(this);

    /* renamed from: ć */
    private C1784 f725 = new C0272dg(this);

    /* renamed from: ȃ */
    C1530 f726;

    /* renamed from: ˮ͈ */
    boolean f727;

    /* renamed from: 櫯 */
    public C1782 f728;

    /* renamed from: 鷭 */
    C0280do f729 = new C0280do("c_resource_network_thread");

    static {
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m296(int r6, int r7, int r8) {
        /*
            byte[] r5 = f720
            int r8 = r8 * 3
            int r8 = r8 + 114
            r4 = -1
            int r7 = r7 * 2
            int r7 = 3 - r7
            java.lang.String r0 = new java.lang.String
            int r6 = r6 * 4
            int r6 = 14 - r6
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            if (r5 != 0) goto L_0x001d
            r2 = r7
            r3 = r6
        L_0x0019:
            int r3 = -r3
            int r2 = r2 + r3
            int r8 = r2 + -6
        L_0x001d:
            int r4 = r4 + 1
            byte r2 = (byte) r8
            r1[r4] = r2
            int r7 = r7 + 1
            if (r4 != r6) goto L_0x002b
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        L_0x002b:
            r2 = r8
            byte r3 = r5[r7]
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0271df.m296(int, int, int):java.lang.String");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 127 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m295() {
        /*
            r6 = this;
            o.ip r2 = new o.ip
            java.lang.String r0 = "Ping thread"
            r2.<init>(r0)
            r0 = 1
            boolean[] r3 = new boolean[r0]
            o.pc$鷭 r0 = p004o.C1014.f6140
            java.util.ArrayList<java.lang.String> r0 = r0.f4497
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0016
            r0 = 0
            return r0
        L_0x0016:
            o.pc$鷭 r0 = p004o.C1014.f6140
            java.util.ArrayList<java.lang.String> r0 = r0.f4497
            int r0 = r0.size()
            int[] r4 = new int[r0]
            o.dj r0 = new o.dj
            r0.<init>(r6, r4, r3)
            r2.mo3387(r0)
            goto L_0x002f
        L_0x0029:
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x002f }
        L_0x002f:
            r0 = 0
            boolean r0 = r3[r0]
            if (r0 == 0) goto L_0x0029
            java.lang.Thread r0 = r2.f1341
            r0.interrupt()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = -1
            r5 = 0
            goto L_0x004d
        L_0x003f:
            r0 = r4[r5]
            r1 = -2
            if (r0 == r1) goto L_0x004b
            r0 = r4[r5]
            if (r2 <= r0) goto L_0x004b
            r2 = r4[r5]
            r3 = r5
        L_0x004b:
            int r5 = r5 + 1
        L_0x004d:
            int r0 = r4.length
            if (r5 < r0) goto L_0x003f
            r0 = -1
            if (r3 != r0) goto L_0x005e
            o.pc$鷭 r0 = p004o.C1014.f6140
            java.util.ArrayList<java.lang.String> r0 = r0.f4497
            int r0 = r0.size()
            int r0 = r0 + -1
            return r0
        L_0x005e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0271df.m295():int");
    }

    C0271df() {
        String str;
        int i;
        int r10 = m295();
        if (C1014.f6140.f4497.size() > 0) {
            str = (String) C1014.f6140.f4497.get(r10);
            i = ((Integer) C1014.f6140.f4519.get(r10)).intValue();
        } else {
            int i2 = f720[8] - 1;
            str = m296(i2, i2, i2);
            i = 4121;
        }
        C0280do doVar = this.f729;
        C0585nl nlVar = C0585nl.RESOURCE;
        c_activity c_activity = C1014.f6147;
        C0276dk dkVar = new C0276dk(this);
        C0277dl dlVar = new C0277dl(this);
        C0278dm dmVar = new C0278dm(this);
        doVar.mo3387(new C1976(doVar, str, i, nlVar, c_activity, dkVar, dlVar, dmVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3639(C1530 r8) {
        if (this.f727) {
            throw new RuntimeException("Purchase processing in already progress. Can't process multiple purchases at once.");
        } else if (!this.f729.mo3654()) {
            new Builder(C1014.f6147).setMessage("Failed to verify purchase: not connected to Billing Server. The purchase will be verified later.").show();
        } else {
            C0453ix ixVar = C1014.f6147.f51;
            String str = "Verifying purchase...";
            if (ixVar.f1370 != null) {
                C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
            }
            C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
            this.f727 = true;
            this.f726 = r8;
            this.f729.mo3652((C0839ue) new C0874vh(r8.f7292, r8.f7293));
        }
    }
}

package p004o;

import p004o.C0643pc.C0650.C0651;

/* renamed from: o.tk */
public abstract class C0811tk {

    /* renamed from: 櫯 */
    C0813tl f4986;

    /* renamed from: 鷭 */
    String f4987;

    /* renamed from: o.tk$鷭 */
    class C0812 extends C0658ph {

        /* renamed from: 鷭 */
        String f4989;

        C0812(String str) {
            this.f4989 = str;
        }

        /* renamed from: 鷭 */
        public final void mo3626(long j, long j2) {
            if (j2 < 1) {
                C0811tk.this.f4986.mo3957(this.f4989 + "\n[" + C0622ot.m736(j) + " bytes] Downloading...");
            } else {
                C0811tk.this.f4986.mo3957(this.f4989 + "\n" + ((100 * j) / j2) + "% [" + C0622ot.m736(j) + "/" + C0622ot.m736(j2) + "] Downloading...");
            }
        }
    }

    /* renamed from: 鷭 */
    public abstract boolean mo4114(C0651 r1);

    protected C0811tk(String str, C0524lh lhVar) {
        this.f4987 = str;
        this.f4986 = lhVar;
    }
}

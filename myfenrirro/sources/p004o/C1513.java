package p004o;

import android.support.p000v4.internal.view.SupportMenu;

/* renamed from: o.䵆 */
final class C1513 extends C0894vz implements C0838ud {
    C1513() {
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        m2209(this.f5202, this.f5201, this.f5200 == 0);
    }

    /* renamed from: 鷭 */
    static void m2209(short s, int i, boolean z) {
        if (!z) {
            C1014.f6147.f51.f1427.mo4490("Failed to equip item", 16711680);
            return;
        }
        int i2 = s - 2;
        C1992 r9 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(i2));
        r9.f8836 = i;
        C1842 r8 = C1014.f6147.f51.f1445;
        C1472 r4 = r9.f8839;
        if (r8.f1626.getParent() != null) {
            r8.mo4533(C0572mz.m662(r4));
        }
        C1014.f6142.f1680.f1195.mo4018();
        C1246[] r82 = C1246.m2000(r9.f8836);
        if (r82 != null) {
            C1246[] r6 = r82;
            int length = r82.length;
            for (int i3 = 0; i3 < length; i3++) {
                C1014.f6147.f51.f1420.mo4589(r6[i3], r9, i2);
            }
            C1014.f6147.f51.mo3861(r9.f8848);
            C1746 r0 = C1014.f6147.f51.f1427;
            StringBuilder append = new StringBuilder(String.valueOf(r9.mo4611())).append(" ");
            C0252cp cpVar = C1014.f6158;
            String r5 = C1014.f6160.mo3796(171);
            r0.mo4490(append.append(r5 == null ? "MSG171" : r5).toString(), (int) SupportMenu.USER_MASK);
        }
    }
}

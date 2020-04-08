package p004o;

/* renamed from: o.ꎈ */
final class C1878 extends C0930xd implements C0838ud {
    C1878() {
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        m2549(this.f5603, this.f5601 == 0);
    }

    /* renamed from: 鷭 */
    static void m2549(short s, boolean z) {
        int i = s - 2;
        if (!z) {
            C1014.f6147.f51.f1427.mo4490("Failed to unequip item", 16711680);
        } else if (C1014.f6137.f1636 != null) {
            C1992 r7 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(i));
            if (r7 != null) {
                C1246[] r8 = C1246.m2000(r7.f8836);
                r7.f8836 = 0;
                C1842 r4 = C1014.f6147.f51.f1445;
                C1472 r5 = r7.f8839;
                if (r4.f1626.getParent() != null) {
                    r4.mo4533(C0572mz.m662(r5));
                }
                if (r8 != null) {
                    C1246[] r6 = r8;
                    int length = r8.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        C1014.f6147.f51.f1420.mo4589(r6[i2], null, 0);
                    }
                    C1014.f6147.f51.mo3861(r7.f8848);
                    C1746 r0 = C1014.f6147.f51.f1427;
                    StringBuilder append = new StringBuilder(String.valueOf(r7.mo4611())).append(" ");
                    C0252cp cpVar = C1014.f6158;
                    String r62 = C1014.f6160.mo3796(172);
                    r0.mo4490(append.append(r62 == null ? "MSG172" : r62).toString(), 16711680);
                }
            }
        }
    }
}

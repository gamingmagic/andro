package p004o;

/* renamed from: o.䔦 */
final class C1484 extends C0904wg implements C0838ud {
    C1484() {
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        C1919 r0;
        Object obj;
        if (C1014.f6137.f1636.f6538 == null) {
            C1014.f6137.f1636.f6538 = new C1302if();
        }
        if (C1014.f6137.f1636.f6538.f6567 == null) {
            C1014.f6137.f1636.f6538.f6567 = new C1305();
        }
        C1302if ifVar = C1014.f6137.f1636.f6538;
        C1305 r7 = C1014.f6137.f1636.f6538.f6567;
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(this.f5273);
        if (leVar == null) {
            r0 = null;
        } else {
            r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
        }
        if (r0 != null) {
            ifVar.f6573 = this.f5263;
            ifVar.f6564 = this.f5255;
            ifVar.f6562 = this.f5256;
            ifVar.f6550 = this.f5257;
            ifVar.f6551 = this.f5258;
            ifVar.f6552 = this.f5265;
            ifVar.f6553 = this.f5269;
            ifVar.f6565 = (short) (200 - (this.f5264 / 10));
            ifVar.f6568 = (long) this.f5260;
            ifVar.f6575 = this.f5262;
            ifVar.f6566 = this.f5274;
            ifVar.f6570 = this.f5267;
            r7.f6596 = C0622ot.m741(this.f5259, C0618op.LOCAL);
            r7.f6590 = C0587nn.MER;
            r7.f6589 = this.f5261;
            r7.f6599 = this.f5268;
            r7.f6597 = this.f5272;
            r7.f6594 = this.f5266;
            r7.f6592 = this.f5270;
            r7.f6595 = this.f5273;
            r7.f6593 = this.f5271;
            C0520le leVar2 = (C0520le) C1014.f6137.f1637.get(r7.f6595);
            if (leVar2 == null) {
                obj = null;
            } else {
                obj = C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null;
            }
            C1014.f6147.f51.f1455.mo4358();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= C1014.f6147.f51.f1429.size()) {
                    break;
                } else if (((C0500kn) C1014.f6147.f51.f1429.get(i)).f1566 == C0501.MERC) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z && !C1014.f6137.f1636.f6538.f6567.f6591) {
                C0453ix ixVar = C1014.f6147.f51;
                C0501 r1 = C0501.MERC;
                Object obj2 = obj;
                int i2 = (C1598.class.isAssignableFrom(obj2.getClass()) ? obj2 : null).f1633;
                Object obj3 = obj;
                short s = (C1598.class.isAssignableFrom(obj3.getClass()) ? obj3 : null).f7512;
                Object obj4 = obj;
                ixVar.mo3876(r1, i2, -1, s, (C1598.class.isAssignableFrom(obj4.getClass()) ? obj4 : null).f7507);
            }
            if (C1014.f6137.f1636.f6538.f6567.f6599 <= 0) {
                C1014.f6147.f51.mo3879(C0501.MERC, -1);
            }
        }
    }
}

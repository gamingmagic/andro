package p004o;

/* renamed from: o.tc */
public final class C0772tc {

    /* renamed from: Ą */
    public int f4719;

    /* renamed from: ą */
    public C0774[] f4720;

    /* renamed from: ȃ */
    public int f4721;

    /* renamed from: ˮ͈ */
    public byte f4722;

    /* renamed from: 櫯 */
    public byte f4723;

    /* renamed from: 鷭 */
    public byte[] f4724 = new byte[4];

    /* renamed from: o.tc$if */
    public abstract class C0773if {

        /* renamed from: Ć */
        public byte f4725;

        public C0773if() {
        }

        /* renamed from: 鷭 */
        public final boolean mo4105() {
            return this.f4725 == 0 || this.f4725 == 2 || this.f4725 == 3 || this.f4725 == 4 || this.f4725 == 6;
        }
    }

    /* renamed from: o.tc$櫯 */
    public class C0774 extends C0773if {

        /* renamed from: ȃ */
        public short f4728;

        /* renamed from: ˮ͈ */
        public short f4729;

        /* renamed from: 櫯 */
        public short f4730;

        /* renamed from: 鷭 */
        public short f4731;

        public C0774() {
            super();
        }

        /* renamed from: 櫯 */
        public final C0775 mo4106() {
            C0775 r2 = new C0775();
            r2.f4737 = ((float) this.f4731) / 100.0f;
            r2.f4736 = ((float) this.f4730) / 100.0f;
            r2.f4735 = ((float) this.f4729) / 100.0f;
            r2.f4734 = ((float) this.f4728) / 100.0f;
            r2.f4725 = this.f4725;
            return r2;
        }
    }

    /* renamed from: o.tc$鷭 */
    public class C0775 extends C0773if {

        /* renamed from: Ą */
        public byte[] f4732 = new byte[3];

        /* renamed from: ȃ */
        public float f4734;

        /* renamed from: ˮ͈ */
        public float f4735;

        /* renamed from: 櫯 */
        public float f4736;

        /* renamed from: 鷭 */
        public float f4737;

        public C0775() {
            super();
        }
    }

    /* renamed from: 鷭 */
    public final C0774 mo4103(int i) {
        if (this.f4721 <= 0 || this.f4719 <= 0) {
            return null;
        }
        if (i < 0 || i >= this.f4720.length) {
            return null;
        }
        if (this.f4720[i] == null) {
            return null;
        }
        return this.f4720[i];
    }

    /* renamed from: 鷭 */
    public final boolean mo4104(int i, int i2, int i3) {
        if (this.f4721 <= 0 || this.f4719 <= 0) {
            throw new RuntimeException("GAT file not loaded (bad width/height)");
        } else if (i < 0 || i >= this.f4721 || i2 < 0 || i2 >= this.f4719) {
            return false;
        } else {
            C0774 r3 = mo4103((this.f4721 * i2) + i);
            if (r3 == null) {
                return false;
            }
            if (i3 > 0 && !r3.mo4105()) {
                return false;
            }
            if (i3 != 0 || !r3.mo4105()) {
                return true;
            }
            return false;
        }
    }
}

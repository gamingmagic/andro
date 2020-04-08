package p004o;

/* renamed from: o.yl */
public enum C0971yl {
    EA_HEAD(256),
    UO_HEAD(257),
    MAC_HEAD(258),
    BEEA_HEAD(259),
    NTACL_HEAD(260),
    STREAM_HEAD(261);
    

    /* renamed from: Ć */
    short f5764;

    private C0971yl(short s) {
        this.f5764 = s;
    }

    /* renamed from: 鷭 */
    public static C0971yl m1675(short s) {
        if (EA_HEAD.f5764 == s) {
            return EA_HEAD;
        }
        if (UO_HEAD.f5764 == s) {
            return UO_HEAD;
        }
        if (MAC_HEAD.f5764 == s) {
            return MAC_HEAD;
        }
        if (BEEA_HEAD.f5764 == s) {
            return BEEA_HEAD;
        }
        if (NTACL_HEAD.f5764 == s) {
            return NTACL_HEAD;
        }
        if (STREAM_HEAD.f5764 == s) {
            return STREAM_HEAD;
        }
        return null;
    }
}

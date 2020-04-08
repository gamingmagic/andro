package p004o;

/* renamed from: o.yn */
public enum C0973yn {
    MainHeader(115),
    MarkHeader(114),
    FileHeader(116),
    CommHeader(117),
    AvHeader(118),
    SubHeader(119),
    ProtectHeader(120),
    SignHeader(121),
    NewSubHeader(122),
    EndArcHeader(123);
    

    /* renamed from: Ȋ */
    byte f5781;

    /* renamed from: 鷭 */
    public static C0973yn m1677(byte b) {
        if (MarkHeader.f5781 == b) {
            return MarkHeader;
        }
        if (MainHeader.f5781 == b) {
            return MainHeader;
        }
        if (FileHeader.f5781 == b) {
            return FileHeader;
        }
        if (EndArcHeader.f5781 == b) {
            return EndArcHeader;
        }
        if (NewSubHeader.f5781 == b) {
            return NewSubHeader;
        }
        if (SubHeader.f5781 == b) {
            return SubHeader;
        }
        if (SignHeader.f5781 == b) {
            return SignHeader;
        }
        if (ProtectHeader.f5781 == b) {
            return ProtectHeader;
        }
        if (MarkHeader.f5781 == b) {
            return MarkHeader;
        }
        if (MainHeader.f5781 == b) {
            return MainHeader;
        }
        if (FileHeader.f5781 == b) {
            return FileHeader;
        }
        if (EndArcHeader.f5781 == b) {
            return EndArcHeader;
        }
        if (CommHeader.f5781 == b) {
            return CommHeader;
        }
        if (AvHeader.f5781 == b) {
            return AvHeader;
        }
        return null;
    }

    private C0973yn(byte b) {
        this.f5781 = b;
    }
}

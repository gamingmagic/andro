package p004o;

/* renamed from: o.yd */
public enum C0963yd {
    msdos(0),
    os2(1),
    win32(2),
    unix(3),
    macos(4),
    beos(5);
    

    /* renamed from: Ć */
    private byte f5728;

    /* renamed from: 鷭 */
    public static C0963yd m1667(byte b) {
        if (msdos.f5728 == b) {
            return msdos;
        }
        if (os2.f5728 == b) {
            return os2;
        }
        if (win32.f5728 == b) {
            return win32;
        }
        if (unix.f5728 == b) {
            return unix;
        }
        if (macos.f5728 == b) {
            return macos;
        }
        if (beos.f5728 == b) {
            return beos;
        }
        return null;
    }

    private C0963yd(byte b) {
        this.f5728 = b;
    }
}

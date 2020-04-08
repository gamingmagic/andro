package p004o;

/* renamed from: o.䧲 */
final class C1501 {

    /* renamed from: 鷭 */
    C0248cl f7199;

    C1501(C0248cl clVar) {
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Reading msg_db...";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        this.f7199 = clVar;
        String str2 = "data\\msgstringtable.txt";
        byte[] bArr = (byte[]) clVar.mo3613(str2, false);
        String r8 = C0622ot.m738(bArr);
        if (C1014.f6160.mo3799(str2, bArr.length, 0, r8) == -1) {
            C1014.f6160.mo3809(C0622ot.m751(C0622ot.m741(bArr, C0618op.LOCAL), false, "#"));
            C1014.f6160.mo3800(true, -1, str2, bArr.length, 0, r8);
        }
    }
}

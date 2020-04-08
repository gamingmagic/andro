package p004o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* renamed from: o.ye */
public final class C0964ye extends C0970yk {

    /* renamed from: ċ */
    private int f5729;

    /* renamed from: Ȋ */
    private int f5730;

    /* renamed from: 岱 */
    private Log f5731 = LogFactory.getLog(getClass());

    public C0964ye(C0970yk ykVar, byte[] bArr) {
        super(ykVar);
        this.f5730 = C0947xs.m1640(bArr, 0);
        this.f5729 = C0947xs.m1640(bArr, 4);
    }

    /* renamed from: 岱 */
    public final void mo4150() {
        super.mo4150();
        this.f5731.info("filetype: " + this.f5730);
        this.f5731.info("creator :" + this.f5729);
    }
}

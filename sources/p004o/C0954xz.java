package p004o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* renamed from: o.xz */
public final class C0954xz extends C0970yk {

    /* renamed from: ċ */
    private byte f5673;

    /* renamed from: Ȋ */
    private int f5674;

    /* renamed from: 䒧 */
    private int f5675;

    /* renamed from: 岱 */
    private Log f5676 = LogFactory.getLog(getClass());

    /* renamed from: 纫 */
    private byte f5677;

    public C0954xz(C0970yk ykVar, byte[] bArr) {
        super(ykVar);
        this.f5674 = C0947xs.m1640(bArr, 0);
        this.f5673 = (byte) (this.f5673 | (bArr[4] & 255));
        this.f5677 = (byte) (this.f5677 | (bArr[5] & 255));
        this.f5675 = C0947xs.m1640(bArr, 6);
    }

    /* renamed from: 岱 */
    public final void mo4150() {
        super.mo4150();
        this.f5676.info("unpSize: " + this.f5674);
        this.f5676.info("unpVersion: " + this.f5673);
        this.f5676.info("method: " + this.f5677);
        this.f5676.info("EACRC:" + this.f5675);
    }
}

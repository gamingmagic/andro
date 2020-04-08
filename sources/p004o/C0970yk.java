package p004o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* renamed from: o.yk */
public class C0970yk extends C0952xx {

    /* renamed from: Ȋ */
    private byte f5754;

    /* renamed from: ˮ͍ */
    public short f5755;

    /* renamed from: 岱 */
    private Log f5756 = LogFactory.getLog(getClass());

    public C0970yk(C0970yk ykVar) {
        super(ykVar);
        this.f5755 = C0971yl.m1675(ykVar.f5755).f5764;
        this.f5754 = ykVar.f5754;
    }

    public C0970yk(C0952xx xxVar, byte[] bArr) {
        super(xxVar);
        byte[] bArr2 = bArr;
        this.f5755 = (short) (((short) (((short) ((bArr2[1] & 255) + 0)) << 8)) + (bArr2[0] & 255));
        this.f5754 = (byte) (this.f5754 | (bArr[2] & 255));
    }

    /* renamed from: 岱 */
    public void mo4150() {
        super.mo4150();
        this.f5756.info("subtype: " + C0971yl.m1675(this.f5755));
        this.f5756.info("level: " + this.f5754);
    }
}

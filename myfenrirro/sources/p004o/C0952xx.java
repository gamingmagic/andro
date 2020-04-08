package p004o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* renamed from: o.xx */
public class C0952xx extends C0951xw {

    /* renamed from: Ć */
    public long f5666;

    /* renamed from: ć */
    long f5667;

    /* renamed from: ˮ͍ */
    private Log f5668 = LogFactory.getLog(C0952xx.class.getName());

    public C0952xx() {
    }

    public C0952xx(C0952xx xxVar) {
        super((C0951xw) xxVar);
        this.f5667 = xxVar.f5666;
        this.f5666 = this.f5667;
        this.f5664 = xxVar.mo4143();
    }

    public C0952xx(C0951xw xwVar, byte[] bArr) {
        super(xwVar);
        this.f5667 = C0947xs.m1641(bArr);
        this.f5666 = this.f5667;
    }

    /* renamed from: 岱 */
    public void mo4150() {
        super.mo4150();
        this.f5668.info("DataSize: " + this.f5666 + " packSize: " + this.f5667);
    }
}

package p004o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* renamed from: o.yf */
public class C0965yf extends C0951xw {

    /* renamed from: Ć */
    private Log f5732 = LogFactory.getLog(C0965yf.class.getName());

    /* renamed from: ć */
    private short f5733;

    /* renamed from: ˮ͍ */
    private int f5734;

    /* renamed from: 岱 */
    private byte f5735;

    public C0965yf(C0951xw xwVar, byte[] bArr) {
        super(xwVar);
        byte[] bArr2 = bArr;
        this.f5733 = (short) (((short) (((short) ((bArr2[1] & 255) + 0)) << 8)) + (bArr2[0] & 255));
        this.f5734 = C0947xs.m1640(bArr, 2);
        if (mo4148()) {
            this.f5735 = (byte) (this.f5735 | (bArr[6] & 255));
        }
    }

    /* renamed from: Ȋ */
    public final boolean mo4162() {
        return (this.f5660 & 128) != 0;
    }

    /* renamed from: 岱 */
    public final void mo4150() {
        super.mo4150();
        StringBuilder sb = new StringBuilder();
        sb.append("posav: " + this.f5734);
        sb.append("\nhighposav: " + this.f5733);
        sb.append("\nhasencversion: " + mo4148() + (mo4148() ? Byte.valueOf(this.f5735) : ""));
        sb.append("\nhasarchcmt: " + ((this.f5660 & 2) != 0));
        sb.append("\nisEncrypted: " + ((this.f5660 & 128) != 0));
        sb.append("\nisMultivolume: " + ((this.f5660 & 1) != 0));
        sb.append("\nisFirstvolume: " + ((this.f5660 & 256) != 0));
        sb.append("\nisSolid: " + ((this.f5660 & 8) != 0));
        sb.append("\nisLocked: " + ((this.f5660 & 4) != 0));
        sb.append("\nisProtected: " + ((this.f5660 & 64) != 0));
        sb.append("\nisAV: " + ((this.f5660 & 32) != 0));
        this.f5732.info(sb.toString());
    }

    /* renamed from: ċ */
    public final boolean mo4161() {
        return (this.f5660 & 16) != 0;
    }
}

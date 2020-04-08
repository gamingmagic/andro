package p004o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* renamed from: o.yg */
public class C0966yg extends C0951xw {

    /* renamed from: Ć */
    public boolean f5736 = false;

    /* renamed from: ć */
    private Log f5737 = LogFactory.getLog(C0966yg.class.getName());

    public C0966yg(C0951xw xwVar) {
        super(xwVar);
    }

    /* renamed from: Ȋ */
    public final boolean mo4163() {
        byte[] bArr = new byte[7];
        byte[] bArr2 = bArr;
        short s = this.f5663;
        bArr[1] = (byte) (s >>> 8);
        bArr[0] = (byte) (s & 255);
        bArr2[2] = this.f5662;
        short s2 = this.f5660;
        byte[] bArr3 = bArr2;
        bArr2[4] = (byte) (s2 >>> 8);
        bArr3[3] = (byte) (s2 & 255);
        short s3 = this.f5661;
        byte[] bArr4 = bArr2;
        bArr2[6] = (byte) (s3 >>> 8);
        bArr4[5] = (byte) (s3 & 255);
        if (bArr2[0] != 82) {
            return false;
        }
        if (bArr2[1] == 69 && bArr2[2] == 126 && bArr2[3] == 94) {
            this.f5736 = true;
            return true;
        } else if (bArr2[1] != 97 || bArr2[2] != 114 || bArr2[3] != 33 || bArr2[4] != 26 || bArr2[5] != 7 || bArr2[6] != 0) {
            return false;
        } else {
            this.f5736 = false;
            return true;
        }
    }

    /* renamed from: 岱 */
    public final void mo4150() {
        super.mo4150();
        Log log = this.f5737;
        StringBuilder sb = new StringBuilder("valid: ");
        boolean z = mo4145() != 24914 ? false : mo4149() != C0973yn.MarkHeader ? false : mo4144() != 6689 ? false : mo4146() == 7;
        log.info(sb.append(z).toString());
    }
}

package p004o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* renamed from: o.ym */
public class C0972ym extends C0970yk {

    /* renamed from: ċ */
    private int f5765;

    /* renamed from: Ȋ */
    private int f5766;

    /* renamed from: 䒧 */
    private String f5767;

    /* renamed from: 岱 */
    private Log f5768 = LogFactory.getLog(C0972ym.class);

    /* renamed from: 纫 */
    private String f5769;

    public C0972ym(C0970yk ykVar, byte[] bArr) {
        super(ykVar);
        byte[] bArr2 = bArr;
        this.f5766 = ((short) (((short) (((short) ((bArr2[1] & 255) + 0)) << 8)) + (bArr2[0] & 255))) & 65535;
        byte[] bArr3 = bArr;
        this.f5765 = ((short) (((short) (((short) ((bArr3[3] & 255) + 0)) << 8)) + (bArr3[2] & 255))) & 65535;
        if (this.f5766 + 4 < bArr.length) {
            byte[] bArr4 = new byte[this.f5766];
            System.arraycopy(bArr, 4, bArr4, 0, this.f5766);
            this.f5769 = new String(bArr4);
        }
        int i = this.f5766 + 4;
        if (this.f5765 + i < bArr.length) {
            byte[] bArr5 = new byte[this.f5765];
            System.arraycopy(bArr, i, bArr5, 0, this.f5765);
            this.f5767 = new String(bArr5);
        }
    }

    /* renamed from: 岱 */
    public final void mo4150() {
        super.mo4150();
        this.f5768.info("ownerNameSize: " + this.f5766);
        this.f5768.info("owner: " + this.f5769);
        this.f5768.info("groupNameSize: " + this.f5765);
        this.f5768.info("group: " + this.f5767);
    }
}

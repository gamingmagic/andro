package p004o;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* renamed from: o.yb */
public class C0961yb extends C0952xx {

    /* renamed from: ċ */
    public final byte[] f5701;

    /* renamed from: đ */
    private long f5702;

    /* renamed from: Ē */
    private final C0963yd f5703;

    /* renamed from: ē */
    private final int f5704;

    /* renamed from: Ė */
    private int f5705;

    /* renamed from: ė */
    private byte[] f5706;

    /* renamed from: Ę */
    private final byte[] f5707 = new byte[8];

    /* renamed from: ę */
    private Date f5708;

    /* renamed from: Ȋ */
    public byte f5709;

    /* renamed from: ˮ͍ */
    public final int f5710;

    /* renamed from: ܕ */
    public long f5711;

    /* renamed from: 㥳 */
    private int f5712;

    /* renamed from: 䒧 */
    public String f5713;

    /* renamed from: 囃 */
    private int f5714 = -1;

    /* renamed from: 岱 */
    public byte f5715;

    /* renamed from: 庸 */
    private final Log f5716 = LogFactory.getLog(C0961yb.class.getName());

    /* renamed from: 廂 */
    private int f5717;

    /* renamed from: 纫 */
    public String f5718;

    /* renamed from: 躆 */
    public long f5719;

    /* renamed from: 띥 */
    private short f5720;

    public C0961yb(C0952xx xxVar, byte[] bArr) {
        super(xxVar);
        this.f5702 = C0947xs.m1641(bArr);
        int i = 0 + 4;
        this.f5703 = C0963yd.m1667(bArr[4]);
        int i2 = i + 1;
        this.f5710 = C0947xs.m1640(bArr, 5);
        int i3 = i2 + 4;
        this.f5704 = C0947xs.m1640(bArr, 9);
        int i4 = i3 + 4;
        this.f5715 = (byte) (this.f5715 | (bArr[13] & 255));
        int i5 = i4 + 1;
        this.f5709 = (byte) (this.f5709 | (bArr[14] & 255));
        int i6 = i5 + 1;
        byte[] bArr2 = bArr;
        this.f5720 = (short) (((short) (((short) ((bArr2[16] & 255) + 0)) << 8)) + (bArr2[15] & 255));
        int i7 = i6 + 2;
        this.f5717 = C0947xs.m1640(bArr, 17);
        int i8 = i7 + 4;
        if ((this.f5660 & 256) != 0) {
            this.f5712 = C0947xs.m1640(bArr, 21);
            int i9 = i8 + 4;
            this.f5705 = C0947xs.m1640(bArr, 25);
            i8 = i9 + 4;
        } else {
            this.f5712 = 0;
            this.f5705 = 0;
            if (this.f5702 == -1) {
                this.f5702 = -1;
                this.f5705 = Integer.MAX_VALUE;
            }
        }
        this.f5719 |= (long) this.f5712;
        this.f5719 <<= 32;
        this.f5719 |= this.f5667;
        this.f5711 |= (long) this.f5705;
        this.f5711 <<= 32;
        this.f5711 += this.f5702;
        this.f5720 = this.f5720 > 4096 ? 4096 : this.f5720;
        this.f5701 = new byte[this.f5720];
        for (int i10 = 0; i10 < this.f5720; i10++) {
            this.f5701[i10] = bArr[i8];
            i8++;
        }
        if (C0973yn.FileHeader.f5781 == this.f5662) {
            if ((this.f5660 & 512) != 0) {
                int i11 = 0;
                this.f5718 = "";
                this.f5713 = "";
                while (i11 < this.f5701.length && this.f5701[i11] != 0) {
                    i11++;
                }
                byte[] bArr3 = new byte[i11];
                System.arraycopy(this.f5701, 0, bArr3, 0, bArr3.length);
                this.f5718 = new String(bArr3);
                if (i11 != this.f5720) {
                    this.f5713 = C0962yc.m1666(this.f5701, i11 + 1);
                }
            } else {
                this.f5718 = new String(this.f5701);
                this.f5713 = "";
            }
        }
        if (C0973yn.NewSubHeader.f5781 == this.f5662) {
            int i12 = (this.f5661 - 32) - this.f5720;
            if ((this.f5660 & 1024) != 0) {
                i12 -= 8;
            }
            if (i12 > 0) {
                this.f5706 = new byte[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    this.f5706[i13] = bArr[i8];
                    i8++;
                }
            }
            if (Arrays.equals(C0967yh.f5739.f5746, this.f5701)) {
                this.f5714 = this.f5706[8] + (this.f5706[9] << 8) + (this.f5706[10] << 16) + (this.f5706[11] << 24);
            }
        }
        if ((this.f5660 & 1024) != 0) {
            for (int i14 = 0; i14 < 8; i14++) {
                this.f5707[i14] = bArr[i8];
                i8++;
            }
        }
        int i15 = this.f5704;
        Calendar instance = Calendar.getInstance();
        instance.set(5, 1);
        instance.set(1, (i15 >>> 25) + 1980);
        instance.set(2, ((i15 >>> 21) & 15) - 1);
        instance.set(5, (i15 >>> 16) & 31);
        instance.set(11, (i15 >>> 11) & 31);
        instance.set(12, (i15 >>> 5) & 63);
        instance.set(13, (i15 & 31) * 2);
        instance.set(14, 0);
        this.f5708 = instance.getTime();
    }

    /* renamed from: 岱 */
    public final void mo4150() {
        super.mo4150();
        StringBuilder sb = new StringBuilder();
        sb.append("unpSize: " + this.f5702);
        sb.append("\nHostOS: " + this.f5703.name());
        sb.append("\nMDate: " + this.f5708);
        sb.append("\nFileName: " + this.f5718);
        sb.append("\nunpMethod: " + Integer.toHexString(this.f5709));
        sb.append("\nunpVersion: " + Integer.toHexString(this.f5715));
        sb.append("\nfullpackedsize: " + this.f5719);
        sb.append("\nfullunpackedsize: " + this.f5711);
        sb.append("\nisEncrypted: " + ((this.f5660 & 4) != 0));
        sb.append("\nisfileHeader: " + (C0973yn.FileHeader.f5781 == this.f5662));
        sb.append("\nisSolid: " + ((this.f5660 & 16) != 0));
        sb.append("\nisSplitafter: " + ((this.f5660 & 2) != 0));
        sb.append("\nisSplitBefore:" + ((this.f5660 & 1) != 0));
        sb.append("\nunpSize: " + this.f5702);
        sb.append("\ndataSize: " + this.f5666);
        sb.append("\nisUnicode: " + ((this.f5660 & 512) != 0));
        sb.append("\nhasVolumeNumber: " + mo4151());
        sb.append("\nhasArchiveDataCRC: " + mo4153());
        sb.append("\nhasSalt: " + ((this.f5660 & 1024) != 0));
        sb.append("\nhasEncryptVersions: " + mo4148());
        sb.append("\nisSubBlock: " + mo4147());
        this.f5716.info(sb.toString());
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: Ȋ */
    public final boolean mo4158() {
        return (this.f5660 & 2) != 0;
    }

    /* renamed from: ċ */
    public final boolean mo4157() {
        return (this.f5660 & 16) != 0;
    }

    /* renamed from: 纫 */
    public final boolean mo4160() {
        return (this.f5660 & 512) != 0;
    }

    /* renamed from: 䒧 */
    public final boolean mo4159() {
        return (this.f5660 & 224) == 224;
    }
}

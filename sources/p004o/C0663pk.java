package p004o;

import android.support.p000v4.media.TransportMediator;
import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.http.HttpStatus;

/* renamed from: o.pk */
public abstract class C0663pk {

    /* renamed from: Ą */
    public int f4611;

    /* renamed from: ą */
    private C0664if f4612;

    /* renamed from: Ć */
    private C0664if f4613;

    /* renamed from: ć */
    private final int[] f4614 = {100, 631, 688, 477, 506, 636, 2085, FTPReply.FILE_STATUS_OK, 50066};

    /* renamed from: ȃ */
    public int f4615;

    /* renamed from: ˮ͈ */
    public int f4616;

    /* renamed from: 櫯 */
    public int f4617;

    /* renamed from: 鷭 */
    public C0664if f4618;

    /* renamed from: o.pk$if */
    public class C0664if {

        /* renamed from: ȃ */
        protected long[] f4620;

        /* renamed from: ˮ͈ */
        protected long f4621;

        /* renamed from: 櫯 */
        protected long f4622;

        /* renamed from: 鷭 */
        protected long f4623;

        /* synthetic */ C0664if(C0663pk pkVar, long j, C0664if ifVar) {
            this(j);
        }

        private C0664if(long j) {
            this.f4620 = new long[256];
            for (long j2 = 0; j2 < 256; j2++) {
                j = C0663pk.this.mo4078(this, j, j2) & 4294967295L;
            }
            this.f4623 = (j % 20) & 255;
            this.f4622 = (j % 30) & 255;
            this.f4621 = (j % 50) & 255;
        }
    }

    /* renamed from: o.pk$鷭 */
    public enum C0665 {
        MESSAGE,
        MESSAGE_EXIT,
        INVALID_INIT_ACK,
        BANNED,
        OLD_LICENSE_VERSION
    }

    /* access modifiers changed from: protected */
    /* renamed from: ˮ͈ */
    public abstract long mo4074();

    /* access modifiers changed from: protected */
    /* renamed from: 櫯 */
    public abstract long mo4075();

    /* renamed from: 鷭 */
    public abstract int mo4076();

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public abstract long mo4078(C0664if ifVar, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public abstract void mo4080(byte[] bArr, int i, int i2, C0664if ifVar);

    protected C0663pk(C0682qa qaVar) {
        this.f4618 = new C0664if(this, (long) C0622ot.m731(qaVar.f4637), null);
        this.f4612 = new C0664if(this, (long) C0622ot.m731(qaVar.f4636), null);
        this.f4613 = new C0664if(this, (long) C0622ot.m731(qaVar.f4635), null);
        this.f4617 = qaVar.f4634;
        this.f4616 = qaVar.f4631;
        this.f4615 = qaVar.f4632;
        this.f4611 = qaVar.f4633;
    }

    /* renamed from: 鷭 */
    public final void mo4081(byte[] bArr, int i, C0664if ifVar) {
        for (int i2 = 0; i2 < i; i2++) {
            mo4080(bArr, i2 + 0, i, ifVar);
        }
    }

    /* renamed from: 鷭 */
    public final int mo4077(byte[] bArr, int i, int i2) {
        long r5 = mo4075();
        for (int i3 = 0; i3 < i2; i3++) {
            r5 = (((mo4074() * r5) & 4294967295L) + ((long) (bArr[i3 + i] & 255))) & 4294967295L;
        }
        return (int) r5;
    }

    /* renamed from: 鷭 */
    public final void mo4079(ByteBuffer byteBuffer, C0837uc ucVar, int i, boolean z) {
        int i2;
        C0664if ifVar = null;
        if (i == 33413) {
            ifVar = this.f4613;
        } else if (z) {
            if (i != this.f4616 && i != this.f4617 && i != this.f4615 && i != this.f4611) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.f4614.length) {
                        break;
                    } else if (i == this.f4614[i3]) {
                        ifVar = this.f4612;
                        break;
                    } else {
                        i3++;
                    }
                }
            } else {
                ifVar = this.f4612;
            }
        }
        int position = byteBuffer.position();
        if (z) {
            if (ifVar != null) {
                i2 = ucVar.mo4050();
                switch (i) {
                    case 100:
                    case 477:
                    case 506:
                    case 631:
                    case 636:
                    case 688:
                        if (i2 >= 0) {
                            byteBuffer.position(position + 4);
                            i2 -= 2;
                            break;
                        } else {
                            byteBuffer.position(position + 2);
                            i2 = byteBuffer.getShort() - 4;
                            break;
                        }
                    default:
                        if (i2 != -1) {
                            byteBuffer.position(position + 2);
                            break;
                        } else {
                            byteBuffer.position(position + 2);
                            i2 = byteBuffer.getShort() - 4;
                            break;
                        }
                }
            } else {
                return;
            }
        } else {
            ifVar = this.f4618;
            switch (i) {
                case TransportMediator.KEYCODE_MEDIA_PAUSE /*127*/:
                case HttpStatus.SC_NOT_ACCEPTABLE /*406*/:
                case 1087:
                case 2435:
                    byteBuffer.position(position + 2);
                    i2 = 4;
                    break;
                case 151:
                case 2039:
                case 2041:
                case 2134:
                case 2135:
                case 2324:
                case 2325:
                case 2523:
                case 2525:
                case 2557:
                case 2559:
                    byteBuffer.position(position + 2);
                    i2 = byteBuffer.getShort() - 4;
                    break;
                case 553:
                    byteBuffer.position(position + 6);
                    i2 = 8;
                    break;
                default:
                    return;
            }
        }
        byte[] array = byteBuffer.array();
        int position2 = byteBuffer.position();
        C0664if ifVar2 = ifVar;
        int i4 = i2;
        for (int i5 = 0; i5 < i4; i5++) {
            mo4080(array, i5 + position2, i4, ifVar2);
        }
        byteBuffer.position(position);
    }
}

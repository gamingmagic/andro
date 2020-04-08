package p004o;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.libroserver.apk.R;
import java.nio.ByteBuffer;
import p004o.C0643pc.aux;

/* renamed from: o.뱷 */
final class C1972 extends C0762sz {
    C1972() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2093;
        int position = byteBuffer.position();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get(new byte[20]);
        int position2 = byteBuffer.position();
        C0599nz[] nzVarArr = new C0599nz[i];
        for (int i3 = 0; i3 < nzVarArr.length; i3++) {
            nzVarArr[i3] = new C0599nz(byteBuffer);
        }
        if (!z) {
            m2639(nzVarArr, i2 - (position2 - position));
        }
    }

    /* renamed from: 鷭 */
    static void m2639(C0599nz[] nzVarArr, int i) {
        C1014.f6144.f7008 = true;
        ByteBuffer allocate = ByteBuffer.allocate(500);
        new C0599nz(allocate);
        if (allocate.position() * nzVarArr.length != i) {
            StringBuilder sb = new StringBuilder("Character size mismatch. Total client size: ");
            ByteBuffer allocate2 = ByteBuffer.allocate(500);
            new C0599nz(allocate2);
            StringBuilder append = sb.append(allocate2.position()).append("*").append(nzVarArr.length).append("=");
            ByteBuffer allocate3 = ByteBuffer.allocate(500);
            new C0599nz(allocate3);
            C0592ns.m674(append.append(allocate3.position() * nzVarArr.length).append("; Server: ").append(i).toString());
            int length = nzVarArr.length / 2;
            ByteBuffer allocate4 = ByteBuffer.allocate(500);
            new C0599nz(allocate4);
            int position = allocate4.position() / 2;
            ByteBuffer allocate5 = ByteBuffer.allocate(500);
            new C0599nz(allocate5);
            int position2 = allocate5.position();
            int i2 = -1;
            for (int length2 = nzVarArr.length - length; length2 <= nzVarArr.length + length; length2++) {
                if (length2 > 0) {
                    int i3 = -1;
                    int i4 = 1;
                    while (true) {
                        if (i4 >= position) {
                            break;
                        }
                        int i5 = position2 + i4;
                        if (i5 * length2 == i) {
                            i3 = i5;
                            break;
                        }
                        int i6 = position2 - i4;
                        if (i6 * length2 == i) {
                            i3 = i6;
                            break;
                        }
                        i4++;
                    }
                    if (i3 != -1) {
                        if (i2 == -1) {
                            i2 = i3;
                        }
                        C0592ns.m674("Possible server character size: " + i3);
                    }
                }
            }
            if (i2 == -1) {
                StringBuilder sb2 = new StringBuilder("Character size mismatch. Client: ");
                ByteBuffer allocate6 = ByteBuffer.allocate(500);
                new C0599nz(allocate6);
                String sb3 = sb2.append(allocate6.position()).append(", Server: unknown, ServerIP=").append(C1014.f6140.f4480).toString();
                Log.e("AndRO", sb3);
                throw new C0588no(sb3);
            }
            StringBuilder sb4 = new StringBuilder("Character size mismatch. Client: ");
            ByteBuffer allocate7 = ByteBuffer.allocate(500);
            new C0599nz(allocate7);
            String sb5 = sb4.append(allocate7.position()).append(", Server: possibly ").append(i2).append("; ServerIP=").append(C1014.f6140.f4480).toString();
            Log.e("AndRO", sb5);
            throw new C0588no(sb5);
        }
        C1904 r8 = C1014.f6147.f51.f1452;
        View findViewById = ((ViewGroup) C1014.f6147.findViewById(16908290)).findViewById(R.id.relativeLayout1);
        if (!(findViewById != null && findViewById == r8.f8557)) {
            C1014.f6147.f51.f1452.mo3537h_();
            C0564mr mrVar = C0595nv.f2879;
            if ((mrVar == C0564mr.MOTR || mrVar == C0564mr.all) && (C1014.f6140.f4443 == aux.MOTR || C1014.f6140.f4443 == aux.MOTR_home)) {
                String iSO3Country = C1014.f6147.getResources().getConfiguration().locale.getISO3Country();
                if (!iSO3Country.equals("RUS") && !iSO3Country.equals("UKR") && !iSO3Country.equals("BLR")) {
                    C1014.f6144.mo3652((C0839ue) new C1022());
                }
            }
        }
        C1014.f6158.mo3387((Runnable) new C1914(C1014.f6147.f51.f1452, nzVarArr));
    }
}

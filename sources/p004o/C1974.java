package p004o;

import android.app.AlertDialog.Builder;
import java.nio.ByteBuffer;

/* renamed from: o.뺧 */
final class C1974 extends C0762sz {
    C1974() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        Object obj;
        this.f4671 = 110;
        byte b = byteBuffer.get();
        if (!z) {
            switch (b) {
                case 0:
                    C0252cp cpVar = C1014.f6158;
                    String r4 = C1014.f6160.mo3796(11);
                    obj = r4 == null ? "MSG11" : r4;
                    break;
                case 1:
                    C0252cp cpVar2 = C1014.f6158;
                    String r42 = C1014.f6160.mo3796(299);
                    obj = r42 == null ? "MSG299" : r42;
                    break;
                case 2:
                    C0252cp cpVar3 = C1014.f6158;
                    String r43 = C1014.f6160.mo3796(1273);
                    obj = r43 == null ? "MSG1273" : r43;
                    break;
                case 3:
                    C0252cp cpVar4 = C1014.f6158;
                    String r44 = C1014.f6160.mo3796(1356);
                    obj = r44 == null ? "MSG1356" : r44;
                    break;
                default:
                    C0252cp cpVar5 = C1014.f6158;
                    String r45 = C1014.f6160.mo3796(12);
                    obj = r45 == null ? "MSG12" : r45;
                    break;
            }
            C1014.f6147.mo3387((Runnable) new C0473jm(C1014.f6147.f51));
            Builder builder = new Builder(C1014.f6147);
            builder.setMessage(new StringBuilder(String.valueOf(obj)).append(" (error#").append(b).append(")").toString());
            builder.show();
        }
    }
}

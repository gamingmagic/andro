package p004o;

import java.nio.ByteBuffer;
import org.apache.http.protocol.HTTP;

/* renamed from: o.悎 */
final class C1586 extends C0762sz {
    C1586() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 182;
        byteBuffer.getInt();
        if (!z) {
            C0360g gVar = C1014.f6147.f51.f1432;
            gVar.f993.setText(HTTP.CONN_CLOSE);
            gVar.f993.setVisibility(0);
            gVar.f993.setOnClickListener(gVar.f990);
        }
    }
}

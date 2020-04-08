package p004o;

import java.nio.ByteBuffer;
import org.apache.http.message.TokenParser;

/* renamed from: o.ˮ̗ */
final class C1216 extends C0762sz {
    C1216() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2022;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (!z) {
            C1746 r0 = C1014.f6147.f51.f1427;
            C0381gq gqVar = (C0381gq) C1014.f6158.f674.f609.f1055.get(Integer.valueOf(s));
            StringBuilder append = new StringBuilder("[").append(gqVar != null ? gqVar.f1071 : "Unknown Skill").append(']').append(TokenParser.f9030SP);
            C0252cp cpVar = C1014.f6158;
            int i4 = i3 + 1;
            String r7 = C1014.f6160.mo3796(i4);
            r0.mo4490(append.append(r7 == null ? "MSG" + i4 : r7).toString(), 13487615);
        }
    }
}

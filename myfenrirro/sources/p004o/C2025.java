package p004o;

import java.nio.ByteBuffer;
import java.text.NumberFormat;

/* renamed from: o.췷 */
final class C2025 extends C0762sz {
    C2025() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 236;
        byte b = byteBuffer.get();
        if (!z) {
            C0448is isVar = C1014.f6147.f51.f1384;
            boolean z2 = b > 0;
            C0448is isVar2 = isVar;
            if (z2) {
                isVar2.f1350.setEnabled(false);
            } else {
                isVar2.f1355.setEnabled(false);
                isVar2.f1352.setEnabled(false);
                isVar2.f1352.setText(new StringBuilder(String.valueOf(NumberFormat.getInstance().format((long) isVar2.f1358))).append(" Z").toString());
            }
            isVar2.f1351.setEnabled(isVar2.f1355.isEnabled() || (!isVar2.f1355.isEnabled() && !isVar2.f1350.isEnabled()));
            if (isVar2.f1355.isEnabled() || isVar2.f1350.isEnabled()) {
                isVar2.f1351.setText("Ok");
            } else {
                isVar2.f1351.setText("Trade");
            }
        }
    }
}

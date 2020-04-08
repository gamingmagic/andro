package p004o;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: o.ˮ͞ */
final class C1256 extends C0762sz {

    /* renamed from: o.ˮ͞$鷭 */
    class C1257 {

        /* renamed from: ȃ */
        short f6416;

        /* renamed from: ˮ͈ */
        short f6417;

        /* renamed from: 櫯 */
        int f6418;

        /* renamed from: 鷭 */
        int f6419;

        C1257(ByteBuffer byteBuffer) {
            this.f6419 = byteBuffer.getInt();
            this.f6418 = byteBuffer.getInt();
            this.f6417 = byteBuffer.getShort();
            this.f6416 = byteBuffer.getShort();
        }
    }

    C1256() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2302;
        C1257[] r19 = new C1257[i];
        for (int i3 = 0; i3 < i; i3++) {
            r19[i3] = new C1257(byteBuffer);
        }
        if (!z) {
            boolean z2 = false;
            Iterator it = C1014.f6152.f7979.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                entry.getKey();
                C0240[] r10 = ((C0238ce) entry.getValue()).f562;
                int length = r10.length;
                for (int i4 = 0; i4 < length; i4++) {
                    C0240 r16 = r10[i4];
                    C1257[] r14 = r19;
                    int length2 = r19.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        C1257 r11 = r14[i5];
                        if (r11.f6419 == r16.f575) {
                            r16.f574 = r11.f6418;
                            r16.f573 = r11.f6416;
                            r16.f572 = r11.f6417;
                            z2 = true;
                        }
                    }
                }
            }
            if (!z2 && r19.length > 0) {
                C0238ce ceVar = (C0238ce) C1014.f6152.f7979.get(Integer.valueOf(r19[0].f6419));
                if (ceVar != null) {
                    for (int i6 = 0; i6 < r19.length; i6++) {
                        C1257 r18 = r19[i6];
                        if (ceVar.f562[i6] == null) {
                            ceVar.f562[i6] = new C0240(0, r18.f6418, r18.f6416, r18.f6417, null);
                        } else {
                            ceVar.f562[i6].f574 = r18.f6418;
                            ceVar.f562[i6].f573 = r18.f6416;
                            ceVar.f562[i6].f572 = r18.f6417;
                        }
                    }
                } else {
                    return;
                }
            }
            C1014.f6147.f51.f1392.mo3594();
        }
    }
}

package p004o;

import com.roworkshop.p003ro.natives;
import java.nio.ByteBuffer;

/* renamed from: o.ঽ্ */
class C1325 extends C0328ew {
    C1325() {
        C1357 r4 = C1014.f6144.f7003;
        if (r4.f2995) {
            r4.f2991 = ByteBuffer.allocate(16);
        } else {
            r4.f2991 = null;
        }
        this.f4671 = -28639;
        this.f4538.putInt(C1014.f6144.f7003.f2994);
        byte[] bArr = new byte[32];
        if (C1014.f6144.f7003.f2990 != null) {
            natives.procpacketsend(C1014.f6144.f7003.f2990, C1014.f6144.f7003.f2990.length, C1014.f6144.f7003.f2993, bArr, 0);
        }
        this.f4538.put(bArr);
    }
}

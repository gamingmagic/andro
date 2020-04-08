package p004o;

import android.opengl.GLES20;
import com.roworkshop.andro.c_activity;
import java.nio.IntBuffer;

/* renamed from: o.閣 */
public class C1796 implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ Runnable f8323;

    /* renamed from: 櫯 */
    private final /* synthetic */ long f8324;

    /* renamed from: 鷭 */
    final /* synthetic */ c_activity f8325;

    public C1796(c_activity c_activity, long j, Runnable runnable) {
        this.f8325 = c_activity;
        this.f8324 = j;
        this.f8323 = runnable;
    }

    public final void run() {
        IntBuffer wrap = IntBuffer.wrap(new int[2]);
        GLES20.glGetIntegerv(3379, wrap);
        C0441in.f1306 = wrap.get(0);
        C1014.f6160.mo3805("GL_MAX_TEXTURE_SIZE", 0, String.valueOf(C0441in.f1306));
        this.f8325.mo3387((Runnable) new C1526(this, this.f8324, this.f8323));
    }
}

package p004o;

import android.opengl.GLSurfaceView.Renderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: o.il */
final class C0439il implements Renderer {

    /* renamed from: 鷭 */
    Runnable f1305;

    C0439il(C1796 r1) {
        this.f1305 = r1;
    }

    public final void onDrawFrame(GL10 gl10) {
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f1305.run();
    }
}

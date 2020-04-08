package p004o;

import android.opengl.GLSurfaceView;

/* renamed from: o.im */
public final class C0440im extends GLSurfaceView {
    public C0440im(C1796 r8) {
        super(C1014.f6147);
        setEGLContextClientVersion(2);
        super.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setRenderer(new C0439il(r8));
    }
}

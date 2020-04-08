package android.support.p000v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p000v4.graphics.drawable.DrawableWrapperDonut.DrawableWrapperState;

/* renamed from: android.support.v4.graphics.drawable.DrawableWrapperHoneycomb */
class DrawableWrapperHoneycomb extends DrawableWrapperDonut {

    /* renamed from: android.support.v4.graphics.drawable.DrawableWrapperHoneycomb$DrawableWrapperStateHoneycomb */
    static class DrawableWrapperStateHoneycomb extends DrawableWrapperState {
        DrawableWrapperStateHoneycomb(DrawableWrapperState drawableWrapperState, Resources resources) {
            super(drawableWrapperState, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new DrawableWrapperHoneycomb(this, resources);
        }
    }

    DrawableWrapperHoneycomb(Drawable drawable) {
        super(drawable);
    }

    DrawableWrapperHoneycomb(DrawableWrapperState drawableWrapperState, Resources resources) {
        super(drawableWrapperState, resources);
    }

    public void jumpToCurrentState() {
        this.mDrawable.jumpToCurrentState();
    }

    /* access modifiers changed from: 0000 */
    public DrawableWrapperState mutateConstantState() {
        return new DrawableWrapperStateHoneycomb(this.mState, null);
    }
}

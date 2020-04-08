package android.support.p000v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.p000v4.graphics.drawable.DrawableWrapperDonut.DrawableWrapperState;

/* renamed from: android.support.v4.graphics.drawable.DrawableWrapperEclair */
class DrawableWrapperEclair extends DrawableWrapperDonut {

    /* renamed from: android.support.v4.graphics.drawable.DrawableWrapperEclair$DrawableWrapperStateEclair */
    static class DrawableWrapperStateEclair extends DrawableWrapperState {
        DrawableWrapperStateEclair(DrawableWrapperState drawableWrapperState, Resources resources) {
            super(drawableWrapperState, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new DrawableWrapperEclair(this, resources);
        }
    }

    DrawableWrapperEclair(Drawable drawable) {
        super(drawable);
    }

    DrawableWrapperEclair(DrawableWrapperState drawableWrapperState, Resources resources) {
        super(drawableWrapperState, resources);
    }

    /* access modifiers changed from: 0000 */
    public DrawableWrapperState mutateConstantState() {
        return new DrawableWrapperStateEclair(this.mState, null);
    }

    /* access modifiers changed from: protected */
    public Drawable newDrawableFromState(ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }
}

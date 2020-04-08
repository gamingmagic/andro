package com.roworkshop.andro;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import p004o.C1321;

public class JoystickView extends View {

    /* renamed from: Ą */
    private Paint f9;

    /* renamed from: ą */
    private int f10;

    /* renamed from: Ć */
    private int f11;

    /* renamed from: ć */
    private C1321 f12;

    /* renamed from: ȃ */
    private Paint f13;

    /* renamed from: ˮ͈ */
    public int f14;

    /* renamed from: ˮ͍ */
    private int f15;

    /* renamed from: 櫯 */
    public double f16;

    /* renamed from: 鷭 */
    public double f17;

    public JoystickView(Context context) {
        super(context);
        m17();
    }

    public JoystickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17();
    }

    public JoystickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17();
    }

    /* renamed from: 鷭 */
    private void m17() {
        setFocusable(true);
        this.f13 = new Paint(1);
        this.f13.setColor(-7829368);
        this.f13.setStrokeWidth(1.0f);
        this.f13.setStyle(Style.FILL_AND_STROKE);
        this.f9 = new Paint(1);
        this.f9.setColor(-12303292);
        this.f9.setStrokeWidth(1.0f);
        this.f9.setStyle(Style.FILL_AND_STROKE);
        this.f10 = 10;
        this.f15 = 10;
    }

    public void setOnJostickMovedListener(C1321 r1) {
        this.f12 = r1;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 0) {
            size = 200;
        }
        int i3 = size;
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode2 == 0) {
            size2 = 200;
        }
        int min = Math.min(i3, size2);
        this.f11 = (int) (((double) min) * 0.25d);
        this.f14 = this.f11;
        setMeasuredDimension(min, min);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.drawCircle((float) (((int) this.f17) + (getMeasuredWidth() / 2)), (float) (((int) this.f16) + (getMeasuredHeight() / 2)), (float) this.f11, this.f9);
        canvas.save();
    }
}

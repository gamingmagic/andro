package p004o;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.net.Uri;
import android.support.p000v4.internal.view.SupportMenu;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;
import net.hockeyapp.android.PaintActivity;

@SuppressLint({"ViewConstructor"})
/* renamed from: o.adh */
public final class adh extends ImageView {

    /* renamed from: Ą */
    private float f362;

    /* renamed from: ȃ */
    private float f363;

    /* renamed from: ˮ͈ */
    private Paint f364 = new Paint();

    /* renamed from: 櫯 */
    private Path f365 = new Path();

    /* renamed from: 鷭 */
    public Stack<Path> f366 = new Stack<>();

    /* renamed from: 鷭 */
    static /* synthetic */ Bitmap m174(ContentResolver contentResolver, Uri uri, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
        options.inSampleSize = m173(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
    }

    /* renamed from: 鷭 */
    public static int m172(ContentResolver contentResolver, Uri uri) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeStream(contentResolver.openInputStream(uri), null, options);
            return ((float) options.outWidth) / ((float) options.outHeight) > 1.0f ? 0 : 1;
        } catch (IOException e) {
            String str = "Unable to determine necessary screen orientation.";
            IOException iOException = e;
            String str2 = "HockeyApp";
            if (acr.f312 <= 6) {
                Log.e(str2, str, iOException);
            }
            return 1;
        }
    }

    /* renamed from: 鷭 */
    private static int m173(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public adh(PaintActivity paintActivity, Uri uri, int i, int i2) {
        super(paintActivity);
        this.f364.setAntiAlias(true);
        this.f364.setDither(true);
        this.f364.setColor(SupportMenu.CATEGORY_MASK);
        this.f364.setStyle(Style.STROKE);
        this.f364.setStrokeJoin(Join.ROUND);
        this.f364.setStrokeCap(Cap.ROUND);
        this.f364.setStrokeWidth(12.0f);
        new adi(this).execute(new Object[]{paintActivity, uri, Integer.valueOf(i), Integer.valueOf(i2)});
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.f366.iterator();
        while (it.hasNext()) {
            canvas.drawPath((Path) it.next(), this.f364);
        }
        canvas.drawPath(this.f365, this.f364);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (motionEvent.getAction()) {
            case 0:
                this.f365.reset();
                this.f365.moveTo(x, y);
                this.f363 = x;
                this.f362 = y;
                invalidate();
                break;
            case 1:
                this.f365.lineTo(this.f363, this.f362);
                this.f366.push(this.f365);
                this.f365 = new Path();
                invalidate();
                break;
            case 2:
                float abs = Math.abs(x - this.f363);
                float abs2 = Math.abs(y - this.f362);
                if (abs >= 4.0f || abs2 >= 4.0f) {
                    this.f365.quadTo(this.f363, this.f362, (this.f363 + x) / 2.0f, (this.f362 + y) / 2.0f);
                    this.f363 = x;
                    this.f362 = y;
                }
                invalidate();
                break;
        }
        return true;
    }
}

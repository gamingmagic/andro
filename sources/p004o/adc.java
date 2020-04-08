package p004o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p000v4.view.GravityCompat;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import net.hockeyapp.android.FeedbackActivity;
import net.hockeyapp.android.views.AttachmentListView;
import p004o.aay.C0165;
import p004o.aay.C0167;

@SuppressLint({"ViewConstructor"})
/* renamed from: o.adc */
public final class adc extends FrameLayout {

    /* renamed from: Ą */
    public int f343;

    /* renamed from: ą */
    public int f344;

    /* renamed from: Ć */
    public int f345;

    /* renamed from: ć */
    public int f346;

    /* renamed from: ċ */
    private final String f347;

    /* renamed from: ȃ */
    public int f348;

    /* renamed from: Ȋ */
    private final abt f349;

    /* renamed from: ˮ͈ */
    public TextView f350;

    /* renamed from: ˮ͍ */
    public int f351;
    /* access modifiers changed from: private */

    /* renamed from: 岱 */
    public final Context f352;

    /* renamed from: 櫯 */
    public final Uri f353;

    /* renamed from: 纫 */
    private ImageView f354;

    /* renamed from: 鷭 */
    final ViewGroup f355;

    public adc(FeedbackActivity feedbackActivity, ViewGroup viewGroup, Uri uri, boolean z) {
        super(feedbackActivity);
        this.f352 = feedbackActivity;
        this.f355 = viewGroup;
        this.f349 = null;
        this.f353 = uri;
        this.f347 = uri.getLastPathSegment();
        m167(20);
        m168((Context) feedbackActivity, true);
        this.f350.setText(this.f347);
        new add(this).execute(new Void[0]);
    }

    public adc(Context context, AttachmentListView attachmentListView, abt abt, boolean z) {
        super(context);
        this.f352 = context;
        this.f355 = attachmentListView;
        this.f349 = abt;
        abt abt2 = abt;
        this.f353 = Uri.fromFile(new File(C1012zy.m1808(), abt2.f211 + abt2.f212));
        this.f347 = abt.f210;
        m167(30);
        m168(context, false);
        this.f351 = 0;
        this.f350.setText(C0165.hockeyapp_feedback_attachment_loading);
        m171(false);
    }

    public final void setImage(Bitmap bitmap, int i) {
        this.f350.setText(this.f347);
        this.f351 = i;
        if (bitmap == null) {
            m171(true);
        } else {
            m169(bitmap, true);
        }
    }

    /* renamed from: 鷭 */
    private void m167(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f346 = Math.round(TypedValue.applyDimension(1, 10.0f, displayMetrics));
        int round = Math.round(TypedValue.applyDimension(1, (float) i, displayMetrics));
        int i2 = displayMetrics.widthPixels;
        int i3 = (i2 - (round * 2)) - (this.f346 * 2);
        int i4 = (i2 - (round * 2)) - this.f346;
        this.f348 = i3 / 3;
        this.f344 = i4 / 2;
        this.f343 = this.f348 * 2;
        this.f345 = this.f344;
    }

    /* renamed from: 鷭 */
    private void m168(Context context, boolean z) {
        setLayoutParams(new LayoutParams(-2, -2, 80));
        setPadding(0, this.f346, 0, 0);
        this.f354 = new ImageView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LayoutParams(-1, -2, 80));
        linearLayout.setGravity(GravityCompat.START);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.parseColor("#80262626"));
        this.f350 = new TextView(context);
        this.f350.setLayoutParams(new LayoutParams(-1, -2, 17));
        this.f350.setGravity(17);
        this.f350.setTextColor(context.getResources().getColor(C0167.hockeyapp_text_white));
        this.f350.setSingleLine();
        this.f350.setEllipsize(TruncateAt.MIDDLE);
        if (z) {
            ImageButton imageButton = new ImageButton(context);
            ImageButton imageButton2 = imageButton;
            imageButton.setLayoutParams(new LayoutParams(-1, -2, 80));
            imageButton2.setAdjustViewBounds(true);
            imageButton2.setImageDrawable(m166("ic_menu_delete"));
            imageButton2.setBackgroundResource(0);
            imageButton2.setOnClickListener(new ade(this));
            linearLayout.addView(imageButton2);
        }
        linearLayout.addView(this.f350);
        addView(this.f354);
        addView(linearLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: 鷭 */
    public void m169(Bitmap bitmap, boolean z) {
        int i = this.f351 == 1 ? this.f344 : this.f348;
        int i2 = this.f351 == 1 ? this.f345 : this.f343;
        this.f350.setMaxWidth(i);
        this.f350.setMinWidth(i);
        this.f354.setLayoutParams(new LayoutParams(-2, -2));
        this.f354.setAdjustViewBounds(true);
        this.f354.setMinimumWidth(i);
        this.f354.setMaxWidth(i);
        this.f354.setMaxHeight(i2);
        this.f354.setScaleType(ScaleType.CENTER_INSIDE);
        this.f354.setImageBitmap(bitmap);
        this.f354.setOnClickListener(new adf(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: 鷭 */
    public void m171(boolean z) {
        this.f350.setMaxWidth(this.f348);
        this.f350.setMinWidth(this.f348);
        this.f354.setLayoutParams(new LayoutParams(-2, -2));
        this.f354.setAdjustViewBounds(false);
        this.f354.setBackgroundColor(Color.parseColor("#eeeeee"));
        this.f354.setMinimumHeight((int) (((float) this.f348) * 1.2f));
        this.f354.setMinimumWidth(this.f348);
        this.f354.setScaleType(ScaleType.FIT_CENTER);
        this.f354.setImageDrawable(m166("ic_menu_attachment"));
        this.f354.setOnClickListener(new adg(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: 鷭 */
    public Bitmap m164() {
        try {
            this.f351 = act.m123(this.f352, this.f353);
            int i = this.f351 == 1 ? this.f344 : this.f348;
            int i2 = this.f351 == 1 ? this.f345 : this.f343;
            Context context = this.f352;
            int i3 = i2;
            int i4 = i;
            Uri uri = this.f353;
            Context context2 = context;
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(context2.getContentResolver().openInputStream(uri), null, options);
            options.inSampleSize = act.m124(options, i4, i3);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(context2.getContentResolver().openInputStream(uri), null, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: 鷭 */
    private Drawable m166(String str) {
        if (VERSION.SDK_INT >= 21) {
            return getResources().getDrawable(getResources().getIdentifier(str, "drawable", "android"), this.f352.getTheme());
        }
        return getResources().getDrawable(getResources().getIdentifier(str, "drawable", "android"));
    }
}

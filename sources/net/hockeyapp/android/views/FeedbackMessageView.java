package net.hockeyapp.android.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p004o.aay.C0164if;
import p004o.aay.C0166;
import p004o.aay.C0167;
import p004o.abt;
import p004o.abv;
import p004o.aby;
import p004o.aby.C0169if;
import p004o.aby.C0171;
import p004o.adc;

public class FeedbackMessageView extends LinearLayout {
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: 櫯 */
    private static final SimpleDateFormat f101 = new SimpleDateFormat("d MMM h:mm a");
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: 鷭 */
    private static final SimpleDateFormat f102 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    /* renamed from: Ą */
    private TextView f103 = ((TextView) findViewById(C0164if.label_text));

    /* renamed from: ą */
    private AttachmentListView f104 = ((AttachmentListView) findViewById(C0164if.list_attachments));

    /* renamed from: Ć */
    private abv f105;

    /* renamed from: ć */
    private final Context f106;

    /* renamed from: ȃ */
    private TextView f107 = ((TextView) findViewById(C0164if.label_date));

    /* renamed from: ˮ͈ */
    private TextView f108 = ((TextView) findViewById(C0164if.label_author));

    static {
    }

    public FeedbackMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f106 = context;
        LayoutInflater.from(context).inflate(C0166.hockeyapp_view_feedback_message, this);
    }

    public void setFeedbackMessage(abv abv) {
        this.f105 = abv;
        try {
            this.f107.setText(f101.format(f102.parse(this.f105.f215)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.f108.setText(this.f105.f218);
        this.f103.setText(this.f105.f225);
        this.f104.removeAllViews();
        for (abt abt : this.f105.f223) {
            adc adc = new adc(this.f106, this.f104, abt, false);
            aby aby = C0171.f247;
            abt abt2 = abt;
            aby aby2 = aby;
            aby.f237.add(new C0169if(abt2, adc, null));
            aby2.mo3465();
            this.f104.addView(adc);
        }
    }

    public void setIndex(int i) {
        if (i % 2 == 0) {
            setBackgroundColor(getResources().getColor(C0167.hockeyapp_background_light));
            this.f108.setTextColor(getResources().getColor(C0167.hockeyapp_text_white));
            this.f107.setTextColor(getResources().getColor(C0167.hockeyapp_text_white));
        } else {
            setBackgroundColor(getResources().getColor(C0167.hockeyapp_background_white));
            this.f108.setTextColor(getResources().getColor(C0167.hockeyapp_text_light));
            this.f107.setTextColor(getResources().getColor(C0167.hockeyapp_text_light));
        }
        this.f103.setTextColor(getResources().getColor(C0167.hockeyapp_text_black));
    }
}

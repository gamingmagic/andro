package p004o;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import net.hockeyapp.android.FeedbackActivity;
import p004o.aay.C0165;

/* renamed from: o.aan */
public class aan implements Runnable {

    /* renamed from: 櫯 */
    final /* synthetic */ FeedbackActivity f132;

    /* renamed from: 鷭 */
    final /* synthetic */ abw f133;

    public aan(FeedbackActivity feedbackActivity, abw abw) {
        this.f132 = feedbackActivity;
        this.f133 = abw;
    }

    public final void run() {
        this.f132.mo3403(true);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("d MMM h:mm a");
        if (this.f133 != null && this.f133.f229 != null && this.f133.f229.f202 != null && this.f133.f229.f202.size() > 0) {
            this.f132.f70 = this.f133.f229.f202;
            Collections.reverse(this.f132.f70);
            try {
                Date parse = simpleDateFormat.parse(((abv) this.f132.f70.get(0)).f215);
                this.f132.f61.setText(String.format(this.f132.getString(C0165.hockeyapp_feedback_last_updated_text) + " %s", new Object[]{simpleDateFormat2.format(parse)}));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (this.f132.f69 == null) {
                this.f132.f69 = new abm(this.f132.f73, this.f132.f70);
            } else {
                abm r6 = this.f132.f69;
                if (r6.f178 != null) {
                    r6.f178.clear();
                }
                Iterator it = this.f132.f70.iterator();
                while (it.hasNext()) {
                    abv abv = (abv) it.next();
                    abm r62 = this.f132.f69;
                    if (!(abv == null || r62.f178 == null)) {
                        r62.f178.add(abv);
                    }
                }
                this.f132.f69.notifyDataSetChanged();
            }
            this.f132.f85.setAdapter(this.f132.f69);
        }
    }
}

package p004o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import net.hockeyapp.android.views.FeedbackMessageView;

/* renamed from: o.abm */
public final class abm extends BaseAdapter {

    /* renamed from: 櫯 */
    private Context f177;

    /* renamed from: 鷭 */
    public ArrayList<abv> f178;

    public abm(Context context, ArrayList<abv> arrayList) {
        this.f177 = context;
        this.f178 = arrayList;
    }

    public final int getCount() {
        return this.f178.size();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        FeedbackMessageView feedbackMessageView;
        abv abv = (abv) this.f178.get(i);
        if (view == null) {
            feedbackMessageView = new FeedbackMessageView(this.f177, null);
        } else {
            feedbackMessageView = (FeedbackMessageView) view;
        }
        if (abv != null) {
            feedbackMessageView.setFeedbackMessage(abv);
        }
        feedbackMessageView.setIndex(i);
        return feedbackMessageView;
    }

    public final Object getItem(int i) {
        return this.f178.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }
}

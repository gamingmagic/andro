package p004o;

import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.libroserver.apk.R;
import java.util.LinkedList;
import java.util.List;

/* renamed from: o.gg */
final class C0367gg extends BaseAdapter {

    /* renamed from: 鷭 */
    List<C0368> f1003 = new LinkedList();

    /* renamed from: o.gg$鷭 */
    class C0368 {

        /* renamed from: Ą */
        Button f1004;

        /* renamed from: ą */
        Button f1005;

        /* renamed from: Ć */
        String f1006;

        /* renamed from: ć */
        TextWatcher f1007 = new C0369gh(this);

        /* renamed from: ȃ */
        Button f1008;

        /* renamed from: ˮ͈ */
        Button f1010;

        /* renamed from: ˮ͍ */
        OnClickListener f1011 = new C0370gi(this);

        /* renamed from: 岱 */
        OnClickListener f1012 = new C0371gj(this);

        /* renamed from: 櫯 */
        EditText f1013;

        /* renamed from: 鷭 */
        RelativeLayout f1014;

        C0368(String str) {
            this.f1006 = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final String mo3744() {
            String str;
            if (this.f1013 != null) {
                str = this.f1013.getText().toString();
            } else {
                str = this.f1006;
            }
            if (str == null || str.length() <= 0) {
                return null;
            }
            return str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 櫯 */
        public final int mo3743() {
            for (int i = 0; i < C0367gg.this.f1003.size(); i++) {
                if (C0367gg.this.f1003.get(i) == this) {
                    return i;
                }
            }
            return -1;
        }
    }

    C0367gg() {
        int i = 0;
        while (true) {
            String r3 = C1014.f6160.mo3802("shortcuts", i);
            if (r3 != null) {
                this.f1003.add(new C0368(r3));
                i++;
            } else {
                return;
            }
        }
    }

    public final int getCount() {
        return this.f1003.size();
    }

    public final Object getItem(int i) {
        return this.f1003.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0368 r5 = (C0368) this.f1003.get(i);
        r5.f1014 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.shortcuts_item, null);
        r5.f1013 = (EditText) r5.f1014.findViewById(R.id.editText1);
        r5.f1010 = (Button) r5.f1014.findViewById(R.id.button1);
        r5.f1008 = (Button) r5.f1014.findViewById(R.id.button2);
        r5.f1004 = (Button) r5.f1014.findViewById(R.id.button3);
        r5.f1005 = (Button) r5.f1014.findViewById(R.id.button4);
        if (!r5.f1013.getText().toString().equals(r5.f1006)) {
            r5.f1013.setText(r5.f1006);
        }
        r5.f1013.addTextChangedListener(r5.f1007);
        r5.f1010.setOnClickListener(r5.f1011);
        r5.f1008.setOnClickListener(r5.f1012);
        if (r5.mo3743() == 0) {
            r5.f1004.setEnabled(false);
        } else if (r5.mo3743() == C0367gg.this.f1003.size() - 1) {
            r5.f1005.setEnabled(false);
        }
        return ((C0368) this.f1003.get(i)).f1014;
    }
}

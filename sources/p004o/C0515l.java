package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.libroserver.apk.R;
import java.text.NumberFormat;
import java.util.LinkedList;

/* renamed from: o.l */
final class C0515l extends BaseAdapter {

    /* renamed from: 鷭 */
    LinkedList<C0546m> f1619 = new LinkedList<>();

    C0515l(LinkedList<C0546m> linkedList, boolean z) {
        for (int i = 0; i < linkedList.size(); i++) {
            C0546m mVar = (C0546m) linkedList.get(i);
            if (C1014.f6147.f51.f1385.f1655) {
                if (mVar != null) {
                    this.f1619.add(i, new C0546m(mVar.f1762.f1595, mVar.f1762.f1598, mVar.f1751, z));
                } else {
                    this.f1619.add(i, new C0546m(null, 0, 0, z));
                }
            } else if (mVar != null) {
                this.f1619.add(i, new C0546m(mVar.f1762.f1595, mVar.f1762.f1598, mVar.f1751, mVar.f1752, z));
            } else {
                this.f1619.add(i, new C0546m(null, 0, 0, 0, z));
            }
        }
    }

    public final int getCount() {
        return this.f1619.size();
    }

    public final Object getItem(int i) {
        return this.f1619.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((C0546m) this.f1619.get(i)).f1762.f1598;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0546m mVar = (C0546m) this.f1619.get(i);
        mVar.f1761 = C1014.f6147.f51.f1385.f1655;
        mVar.f1765 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.open_autobuy_item, null);
        mVar.f1758 = (Button) mVar.f1765.findViewById(R.id.button1);
        mVar.f1756 = (Button) mVar.f1765.findViewById(R.id.button2);
        mVar.f1758.setOnClickListener(mVar.f1755);
        mVar.f1762.mo3937((RelativeLayout) mVar.f1765.findViewById(R.id.include1));
        if (!mVar.f1761) {
            mVar.f1762.f1590.setVisibility(4);
            mVar.f1756.setOnClickListener(mVar.f1763);
        } else {
            mVar.f1756.setVisibility(4);
        }
        if (mVar.f1762.f1595 == null) {
            if (!mVar.f1761) {
                mVar.f1756.setVisibility(4);
            }
            mVar.f1758.setVisibility(4);
        } else {
            if (!mVar.f1761) {
                mVar.f1756.setVisibility(0);
                C0546m mVar2 = mVar;
                mVar.f1752 = mVar.f1752;
                if (mVar2.f1756 != null) {
                    mVar2.f1756.setText(NumberFormat.getInstance().format((long) mVar2.f1752));
                }
            }
            mVar.f1758.setVisibility(0);
            mVar.mo4012(mVar.f1751);
        }
        mVar.f1762.f1593.setOnClickListener(mVar.f1757);
        mVar.f1765.setEnabled(!mVar.f1759);
        mVar.f1758.setEnabled(!mVar.f1759);
        if (!mVar.f1761) {
            mVar.f1756.setEnabled(!mVar.f1759);
        }
        return mVar.f1765;
    }
}

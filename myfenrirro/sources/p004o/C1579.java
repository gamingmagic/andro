package p004o;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

/* renamed from: o.役 */
class C1579 implements OnKeyListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1746 f7492;

    C1579(C1746 r1) {
        this.f7492 = r1;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 66 && keyEvent.getAction() == 1) {
            C1746 r5 = this.f7492;
            String editable = r5.f8027.getText().toString();
            String editable2 = r5.f8028.getText().toString();
            if (!(C1014.f6137 == null || C1014.f6137.f1636 == null || C1014.f6137.f1636.f8657 == null)) {
                String trim = C1014.f6137.f1636.f8657.trim();
                r5.f8028.setText(null);
                if (C1014.f6137.f1636 != null && editable2.length() > 0) {
                    if (r5.f8030.size() == 0 || !editable2.equals(r5.f8030.getLast())) {
                        r5.f8030.addLast(editable2);
                        if (r5.f8030.size() > 10) {
                            r5.f8030.removeFirst();
                        }
                        r5.f8032 = r5.f8030.size();
                    }
                    C1014 r0 = C1014.f6161;
                    if (!C1014.m1834(editable2) && C1014.f6144 != null) {
                        if (editable2.startsWith(C0595nv.f2865)) {
                            editable2 = editable2.substring(1);
                            editable = C1746.f8026;
                        } else if (editable2.startsWith(C0595nv.f2866)) {
                            editable2 = editable2.substring(1);
                            editable = C1746.f8025;
                        }
                        if (editable.equals(C1746.f8026)) {
                            C1014.f6144.mo3652((C0839ue) new C1364(trim, editable2));
                        } else if (editable.equals(C1746.f8025)) {
                            C1014.f6144.mo3652((C0839ue) new C1043(trim, editable2));
                        } else if (editable.length() > 0) {
                            C1014.f6144.mo3652((C0839ue) new C1208(r5.f8027.getText().toString().trim(), editable2));
                        } else {
                            C1014.f6144.mo3652((C0839ue) new C1667(trim, editable2));
                        }
                    }
                }
            }
            return true;
        } else if (i == 19 && keyEvent.getAction() == 1) {
            this.f7492.f8032--;
            C1746.m2407(this.f7492);
            return true;
        } else if (i != 20 || keyEvent.getAction() != 0) {
            return false;
        } else {
            this.f7492.f8032++;
            C1746.m2407(this.f7492);
            return true;
        }
    }
}

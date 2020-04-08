package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.roworkshop.andro.c_activity;
import java.util.LinkedList;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.ll */
class C0528ll implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0527lk f1661;

    C0528ll(C0527lk lkVar) {
        this.f1661 = lkVar;
    }

    public final void onClick(View view) {
        C0527lk lkVar = this.f1661;
        String editable = lkVar.f1659.getText().toString();
        if (editable == null || editable.length() < 4) {
            c_activity c_activity = C1014.f6147;
            C0252cp cpVar = C1014.f6158;
            String r5 = C1014.f6160.mo3796((int) FTPReply.CLOSING_DATA_CONNECTION);
            Toast.makeText(c_activity, r5 == null ? "MSG226" : r5, 1).show();
        } else if (lkVar.f1655) {
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < lkVar.f1657.getCount(); i++) {
                C0546m mVar = (C0546m) lkVar.f1657.getItemAtPosition(i);
                if (mVar.f1762.f1595 != null) {
                    if (mVar.f1751 <= 0) {
                        c_activity c_activity2 = C1014.f6147;
                        C0252cp cpVar2 = C1014.f6158;
                        String r52 = C1014.f6160.mo3796(1726);
                        Toast.makeText(c_activity2, String.format(r52 == null ? "MSG1726" : r52, new Object[]{mVar.f1762.f1595.mo4611()}), 1).show();
                        return;
                    }
                    linkedList.add(mVar);
                }
            }
            if (linkedList.size() <= 0) {
                Toast.makeText(C1014.f6147, "Please specify at least one item for sell", 1).show();
                return;
            }
            C1053[] r7 = new C1053[linkedList.size()];
            for (int i2 = 0; i2 < r7.length; i2++) {
                C0546m mVar2 = (C0546m) linkedList.get(i2);
                r7[i2] = new C1053(mVar2.f1762.f1598, mVar2.f1762.f1595.f8846, mVar2.f1751);
            }
            C1014.f6144.mo3652((C0839ue) new C1052(editable, true, r7));
        } else {
            try {
                int parseInt = Integer.parseInt(lkVar.f1658.getText().toString());
                if (parseInt == 0) {
                    c_activity c_activity3 = C1014.f6147;
                    C0252cp cpVar3 = C1014.f6158;
                    String r53 = C1014.f6160.mo3796(1731);
                    Toast.makeText(c_activity3, r53 == null ? "MSG1731" : r53, 0).show();
                } else if (parseInt > C1014.f6137.f1636.f6542) {
                    c_activity c_activity4 = C1014.f6147;
                    C0252cp cpVar4 = C1014.f6158;
                    String r54 = C1014.f6160.mo3796(1732);
                    Toast.makeText(c_activity4, r54 == null ? "MSG1732" : r54, 0).show();
                } else {
                    LinkedList linkedList2 = new LinkedList();
                    for (int i3 = 0; i3 < lkVar.f1657.getCount(); i3++) {
                        C0546m mVar3 = (C0546m) lkVar.f1657.getItemAtPosition(i3);
                        if (mVar3.f1762.f1595 != null) {
                            linkedList2.add(mVar3);
                        }
                    }
                    C1064[] r8 = new C1064[linkedList2.size()];
                    if (r8.length <= 0) {
                        c_activity c_activity5 = C1014.f6147;
                        C0252cp cpVar5 = C1014.f6158;
                        String r55 = C1014.f6160.mo3796(1725);
                        Toast.makeText(c_activity5, r55 == null ? "MSG1725" : r55, 0).show();
                        return;
                    }
                    int i4 = 0;
                    while (i4 < r8.length) {
                        C0546m mVar4 = (C0546m) linkedList2.get(i4);
                        if (mVar4.f1752 == 0) {
                            c_activity c_activity6 = C1014.f6147;
                            C0252cp cpVar6 = C1014.f6158;
                            String r56 = C1014.f6160.mo3796(1728);
                            Toast.makeText(c_activity6, String.format(r56 == null ? "MSG1728" : r56, new Object[]{mVar4.f1762.f1595.mo4611()}), 0).show();
                            return;
                        } else if (mVar4.f1752 > 9998) {
                            c_activity c_activity7 = C1014.f6147;
                            C0252cp cpVar7 = C1014.f6158;
                            String r57 = C1014.f6160.mo3796(1729);
                            Toast.makeText(c_activity7, String.format(r57 == null ? "MSG1729" : r57, new Object[]{mVar4.f1762.f1595.mo4611()}), 0).show();
                            return;
                        } else if (mVar4.f1751 == 0) {
                            c_activity c_activity8 = C1014.f6147;
                            C0252cp cpVar8 = C1014.f6158;
                            String r58 = C1014.f6160.mo3796(1726);
                            Toast.makeText(c_activity8, String.format(r58 == null ? "MSG1726" : r58, new Object[]{mVar4.f1762.f1595.mo4611()}), 0).show();
                            return;
                        } else if (mVar4.f1751 > 99989999) {
                            c_activity c_activity9 = C1014.f6147;
                            C0252cp cpVar9 = C1014.f6158;
                            String r59 = C1014.f6160.mo3796(1727);
                            Toast.makeText(c_activity9, String.format(r59 == null ? "MSG1727" : r59, new Object[]{mVar4.f1762.f1595.mo4611()}), 0).show();
                            return;
                        } else {
                            r8[i4] = new C1064((short) mVar4.f1762.f1595.f8848, (short) mVar4.f1752, mVar4.f1751);
                            i4++;
                        }
                    }
                    C1014.f6144.mo3652((C0839ue) new C1366(parseInt, 1, editable, r8));
                }
            } catch (NumberFormatException unused) {
                c_activity c_activity10 = C1014.f6147;
                C0252cp cpVar10 = C1014.f6158;
                String r510 = C1014.f6160.mo3796(603);
                Toast.makeText(c_activity10, r510 == null ? "MSG603" : r510, 0).show();
            }
        }
    }
}

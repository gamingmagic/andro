package p004o;

import android.app.AlertDialog.Builder;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import java.util.Arrays;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.fy */
public final class C0357fy extends C0519ld {

    /* renamed from: Ą */
    TextView f961 = ((TextView) this.f1626.findViewById(R.id.textView1));

    /* renamed from: ą */
    TextView f962 = ((TextView) this.f1626.findViewById(R.id.textView3));

    /* renamed from: Ć */
    TextView f963 = ((TextView) this.f1626.findViewById(R.id.textView2));

    /* renamed from: ć */
    TextView f964 = ((TextView) this.f1626.findViewById(R.id.textView4));

    /* renamed from: ċ */
    int f965;

    /* renamed from: đ */
    OnItemClickListener f966 = new C0362gb(this);

    /* renamed from: Ē */
    OnClickListener f967 = new C0363gc(this);

    /* renamed from: ē */
    OnItemLongClickListener f968 = new C0364gd(this);

    /* renamed from: ȃ */
    Button f969 = ((Button) this.f1626.findViewById(R.id.button1));

    /* renamed from: Ȋ */
    int f970;

    /* renamed from: ˮ͈ */
    ListView f971 = ((ListView) this.f1626.findViewById(R.id.listview_selected));

    /* renamed from: ˮ͍ */
    CheckBox f972 = ((CheckBox) this.f1626.findViewById(R.id.checkBox1));

    /* renamed from: ܕ */
    OnClickListener f973 = new C0359fz(this);

    /* renamed from: 䒧 */
    int f974 = 0;

    /* renamed from: 岱 */
    int f975;

    /* renamed from: 庸 */
    OnItemClickListener f976 = new C0361ga(this);

    /* renamed from: 櫯 */
    ListView f977 = ((ListView) this.f1626.findViewById(R.id.listview_all));

    /* renamed from: 纫 */
    int f978;

    /* renamed from: 躆 */
    public C0358 f979;

    /* renamed from: 鷭 */
    C1695 f980;

    /* renamed from: o.fy$鷭 */
    public enum C0358 {
        NPCSHOP_BUYFROMNPC,
        NPCSHOP_SELLTONPC,
        VENDING,
        CASHSHOP,
        CHANGE_MATERIAL,
        AUTOBUY
    }

    C0357fy(LayoutInflater layoutInflater) {
        super(R.layout.npcshop);
        this.f977.setOnItemClickListener(this.f976);
        this.f977.setOnItemLongClickListener(this.f968);
        this.f971.setOnItemClickListener(this.f966);
        this.f971.setOnItemLongClickListener(this.f968);
        this.f969.setOnClickListener(this.f967);
        this.f980 = new C1695(null, true, "1", this.f973);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo3726() {
        C0354fv[] fvVarArr;
        if (this.f1626.getParent() != null) {
            C0353fu fuVar = (C0353fu) this.f977.getAdapter();
            if (fuVar != null) {
                for (C0354fv fvVar : fuVar.f942) {
                    if (fvVar.f944 != null) {
                        fvVar.mo3723(fvVar.f944);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3731(C1867[] r12) {
        C0354fv[] fvVarArr = new C0354fv[r12.length];
        this.f979 = C0358.CASHSHOP;
        for (int i = 0; i < r12.length; i++) {
            C1867 r9 = r12[i];
            C1992 r10 = new C1992(r9.f8453, -1, true);
            r10.f8839 = C1472.values()[r9.f8454];
            fvVarArr[i] = new C0354fv(C1014.f6147, r10, 0, r9.f8456, r9.f8455, this.f979);
        }
        TextView textView = this.f963;
        C0252cp cpVar = C1014.f6158;
        String r8 = C1014.f6160.mo3796(187);
        textView.setText(r8 == null ? "MSG187" : r8);
        TextView textView2 = this.f964;
        C0252cp cpVar2 = C1014.f6158;
        String r82 = C1014.f6160.mo3796((int) FTPReply.ENTERING_EPSV_MODE);
        textView2.setText(r82 == null ? "MSG229" : r82);
        mo3730(C1014.f6147, fvVarArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3729(int i, int i2, C1738[] r21) {
        this.f965 = i;
        this.f978 = i2;
        c_activity c_activity = (c_activity) this.f1626.getContext();
        C0354fv[] fvVarArr = new C0354fv[r21.length];
        this.f979 = C0358.VENDING;
        for (int i3 = 0; i3 < r21.length; i3++) {
            C1738 r16 = r21[i3];
            C1992 r0 = new C1992(r16.f8002, r16.f8012, r16.f8005, C1472.values()[r16.f8007], r16.f8004 != 0, r16.f8003 != 0, false, 0, 0, r16.f8006 == -1 ? 0 : r16.f8006, r16.f8010, 0, 0, r16.f8011);
            fvVarArr[i3] = new C0354fv(c_activity, r0, r16.f8009, r16.f8013, r16.f8013, this.f979);
        }
        TextView textView = this.f963;
        C0252cp cpVar = C1014.f6158;
        String r15 = C1014.f6160.mo3796(228);
        textView.setText(r15 == null ? "MSG228" : r15);
        TextView textView2 = this.f964;
        C0252cp cpVar2 = C1014.f6158;
        String r152 = C1014.f6160.mo3796((int) FTPReply.ENTERING_EPSV_MODE);
        textView2.setText(r152 == null ? "MSG229" : r152);
        mo3730(c_activity, fvVarArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ć */
    public final void mo3727() {
        if (this.f979 == C0358.CASHSHOP) {
            this.f961.setText(new StringBuilder(String.valueOf(C0622ot.m736((long) this.f974))).append(" CP").toString());
            String sb = new StringBuilder(String.valueOf(C0622ot.m736((long) C1014.f6152.f7978.f6456))).append(" CP").toString();
            if (C1014.f6152.f7978.f6455 > 0) {
                sb = new StringBuilder(String.valueOf(sb)).append(" + ").append(C0622ot.m736((long) C1014.f6152.f7978.f6455)).append(" KP").toString();
            }
            this.f962.setText(sb);
        } else if (this.f979 == C0358.CHANGE_MATERIAL) {
            this.f961.setVisibility(4);
            this.f969.setText("Ok");
        } else {
            this.f961.setText(new StringBuilder(String.valueOf(C0622ot.m736((long) this.f974))).append(" Z").toString());
            this.f962.setText(new StringBuilder(String.valueOf(C0622ot.m736((long) (C1014.f6137.f1636.f6542 - this.f974)))).append(" Z").toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3730(c_activity c_activity, C0354fv[] fvVarArr) {
        this.f974 = 0;
        this.f977.setAdapter(new C0353fu(c_activity, fvVarArr));
        this.f971.setAdapter(null);
        mo3727();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3728(int i, int i2) {
        C0354fv[] fvVarArr;
        c_activity c_activity = (c_activity) this.f1626.getContext();
        C0353fu fuVar = (C0353fu) this.f971.getAdapter();
        C0354fv fvVar = ((C0353fu) this.f977.getAdapter()).f942[i];
        if (fvVar.f947.f8846 != 0) {
            if (fvVar.f947.f8846 > 0 && i2 > fvVar.f947.f8846) {
                i2 = fvVar.f947.f8846;
            }
            if (this.f979 == C0358.NPCSHOP_BUYFROMNPC || this.f979 == C0358.VENDING) {
                if (i2 <= 0) {
                    i2 = 1;
                }
                if ((C1014.f6137.f1636.f6542 - this.f974) - (fvVar.f949 * i2) < 0) {
                    Builder builder = new Builder(c_activity);
                    C0252cp cpVar = C1014.f6158;
                    String r17 = C1014.f6160.mo3796(56);
                    builder.setMessage(r17 == null ? "MSG56" : r17).show();
                    return;
                }
            } else if (this.f979 == C0358.NPCSHOP_SELLTONPC || this.f979 == C0358.CHANGE_MATERIAL) {
                if (i2 <= 0) {
                    i2 = fvVar.f947.f8846;
                }
            } else if (this.f979 == C0358.CASHSHOP) {
                if (i2 <= 0) {
                    i2 = 1;
                }
                if ((C1014.f6152.f7978.f6456 - this.f974) - (fvVar.f949 * i2) < 0) {
                    Builder builder2 = new Builder(c_activity);
                    C0252cp cpVar2 = C1014.f6158;
                    String r172 = C1014.f6160.mo3796(1255);
                    builder2.setMessage(r172 == null ? "MSG1255" : r172).show();
                    return;
                }
            } else {
                throw new C0588no();
            }
            if (fvVar.f947.f8846 > 0) {
                fvVar.f947.f8846 -= i2;
                fvVar.mo3723(fvVar.f944);
            }
            this.f974 += fvVar.f949 * i2;
            mo3727();
            if (fuVar == null || fuVar.f942 == null) {
                fvVarArr = new C0354fv[0];
            } else {
                fvVarArr = fuVar.f942;
            }
            boolean z = false;
            if (fvVar.f947.mo4608()) {
                C0354fv[] fvVarArr2 = fvVarArr;
                int length = fvVarArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    C0354fv fvVar2 = fvVarArr2[i3];
                    if (fvVar2.f947.mo4616(fvVar.f947)) {
                        fvVar2.f947.f8846 += i2;
                        fvVar2.mo3723(fvVar2.f944);
                        z = true;
                        break;
                    }
                    i3++;
                }
            }
            if (!z) {
                C0354fv[] fvVarArr3 = (C0354fv[]) Arrays.copyOf(fvVarArr, fvVarArr.length + 1);
                C1992 r11 = fvVar.f947.mo4612();
                r11.f8846 = i2;
                fvVarArr3[fvVarArr3.length - 1] = new C0354fv(c_activity, r11, fvVar.f953, fvVar.f952, fvVar.f949, this.f979);
                this.f971.setAdapter(new C0353fu(c_activity, fvVarArr3));
            }
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        layoutParams.addRule(13);
        layoutParams.addRule(10);
        layoutParams.addRule(8, R.id.imageview_chat);
        this.f1626.setLayoutParams(layoutParams);
    }

    /* renamed from: Ą */
    public final void mo3544() {
        C1014.f6147.f51.f1432.mo3538();
    }
}

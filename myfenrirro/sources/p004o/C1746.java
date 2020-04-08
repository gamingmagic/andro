package p004o;

import android.graphics.Color;
import android.support.p000v4.internal.view.SupportMenu;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View.OnKeyListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllegalFormatConversionException;
import java.util.LinkedList;
import org.apache.http.message.TokenParser;

/* renamed from: o.蝱 */
final class C1746 extends C0499km {

    /* renamed from: ˮ͈ */
    static String f8025;

    /* renamed from: 櫯 */
    static String f8026;

    /* renamed from: Ą */
    AutoCompleteTextView f8027;

    /* renamed from: ą */
    EditText f8028;

    /* renamed from: Ć */
    TextView f8029;

    /* renamed from: ć */
    LinkedList<String> f8030 = new LinkedList<>();

    /* renamed from: ȃ */
    String[] f8031 = new String[0];

    /* renamed from: ˮ͍ */
    int f8032 = -1;

    /* renamed from: 岱 */
    OnKeyListener f8033 = new C1579(this);

    /* renamed from: 鷭 */
    long f8034;

    C1746() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final boolean mo3539() {
        return this.f8028.getVisibility() == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h_ */
    public final void mo3537h_() {
        if (!(this.f8028.getVisibility() == 0)) {
            C1014.f6147.f51.f1434.push(this);
            if (this.f8029.getVisibility() == 4) {
                this.f8034 = System.currentTimeMillis();
                this.f8029.setVisibility(0);
            }
            this.f8028.setVisibility(0);
            this.f8027.setVisibility(0);
            c_activity c_activity = C1014.f6147;
            ((ImageView) C1014.f6147.findViewById(R.id.imageview_chat)).setImageBitmap(C1014.f6147.f51.f1393[1]);
            this.f8028.requestFocus();
            C1014.f6147.f51.f1412.bringChildToFront(this.f8028);
            C1014.f6147.f51.f1412.bringChildToFront(this.f8027);
            LayoutParams layoutParams = (LayoutParams) this.f8029.getLayoutParams();
            layoutParams.addRule(2, R.id.edittext_dst);
            this.f8029.setLayoutParams(layoutParams);
            m2405();
            c_activity c_activity2 = C1014.f6147;
            C1293 r5 = new C1293(this);
            if (c_activity2.f56 != null) {
                c_activity2.f56.postDelayed(new C1348(c_activity2, r5), 500);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3538() {
        if (this.f8028.getVisibility() == 0) {
            C1014.f6147.f51.f1434.remove(this);
            LayoutParams layoutParams = (LayoutParams) this.f8029.getLayoutParams();
            layoutParams.addRule(2, R.id.imageview_chat);
            this.f8029.setLayoutParams(layoutParams);
            this.f8028.setVisibility(4);
            this.f8027.setVisibility(4);
            c_activity c_activity = C1014.f6147;
            ((ImageView) C1014.f6147.findViewById(R.id.imageview_chat)).setImageBitmap(C1014.f6147.f51.f1393[0]);
            this.f8029.setMaxLines(5);
            this.f8029.setMovementMethod(null);
            this.f8029.setBackgroundColor(0);
        }
    }

    /* renamed from: ą */
    private void m2405() {
        this.f8029.setMaxLines(15);
        this.f8029.setMovementMethod(new LinkMovementMethod());
        this.f8029.setBackgroundColor(1342177280);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ȃ */
    public final void mo4487() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(C1014.f6147, 17367050, this.f8031);
        AutoCompleteTextView autoCompleteTextView = this.f8027;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setAdapter(arrayAdapter);
        }
    }

    /* renamed from: 鷭 */
    static /* synthetic */ void m2407(C1746 r3) {
        if (r3.f8032 < 0) {
            r3.f8032 = 0;
        } else if (r3.f8032 >= r3.f8030.size()) {
            r3.f8032 = r3.f8030.size();
        } else {
            r3.f8028.setText((CharSequence) r3.f8030.get(r3.f8032));
            r3.f8028.selectAll();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4489(String str) {
        String trim = str.trim();
        int i = 0;
        while (i < this.f8031.length && !this.f8031[i].equals(trim)) {
            i++;
        }
        if (i >= this.f8031.length) {
            String[] strArr = new String[(this.f8031.length + 1)];
            System.arraycopy(this.f8031, 0, strArr, 0, this.f8031.length);
            this.f8031 = strArr;
            this.f8031[this.f8031.length - 1] = trim;
            mo4487();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ą */
    public final void mo4486() {
        int i = 0;
        String[] strArr = new String[this.f8031.length];
        for (int i2 = 0; i2 < this.f8031.length; i2++) {
            if (!this.f8031[i2].equals(f8026) && !this.f8031[i2].equals(f8025)) {
                int i3 = i;
                i++;
                strArr[i3] = this.f8031[i2];
            }
        }
        this.f8031 = (String[]) Arrays.copyOf(strArr, i);
        f8026 = "Party (" + C0595nv.f2865 + "text)";
        f8025 = "Guild (" + C0595nv.f2866 + "text)";
        mo4489(f8026);
        mo4489(f8025);
    }

    /* renamed from: 鷭 */
    static SpannableString m2406(String str, int i, boolean z) {
        String str2;
        String replace = str.replace(9, TokenParser.f9030SP).replace(TokenParser.f9027CR, TokenParser.f9030SP).replace(10, TokenParser.f9030SP);
        if (z) {
            replace = new StringBuilder(String.valueOf(replace)).append("\n").toString();
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            int indexOf = str2.indexOf("<ITEML>");
            if (indexOf == -1) {
                break;
            }
            int indexOf2 = str2.indexOf("</ITEML>", indexOf + 1);
            C1992 r6 = C1992.m2658(str2.substring(indexOf + 7, indexOf2));
            int i2 = indexOf2 + 8;
            if (r6 != null) {
                String str3 = "<" + r6.mo4611() + ">";
                str2 = str2.substring(0, indexOf) + str3 + str2.substring(i2, str2.length());
                C1327 r8 = new C1327();
                r8.f6633 = indexOf;
                r8.f6632 = str3.length() + indexOf;
                r8.f6631 = r6;
                arrayList.add(r8);
            } else {
                str2 = str2.substring(0, indexOf) + str2.substring(i2, str2.length());
            }
        }
        SpannableString spannableString = new SpannableString(str2);
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C1327 r7 = (C1327) arrayList.get(i4);
            if (i3 + 1 < r7.f6633 - 1) {
                spannableString.setSpan(new ForegroundColorSpan(Color.rgb((16711680 & i) >> 16, (65280 & i) >> 8, i & 255)), i3, r7.f6633, 33);
            }
            i3 = r7.f6632;
            spannableString.setSpan(new C1800(r7), r7.f6633, r7.f6632, 33);
        }
        spannableString.setSpan(new ForegroundColorSpan(Color.rgb((16711680 & i) >> 16, (65280 & i) >> 8, i & 255)), i3, spannableString.length(), 33);
        return spannableString;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4490(String str, int i) {
        if (this.f8029 != null) {
            this.f8029.append(m2406(str, 16777215 & i, true));
            this.f8034 = System.currentTimeMillis();
            if (this.f8029.getVisibility() == 4) {
                this.f8029.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4488(int i, int i2) {
        C0252cp cpVar = C1014.f6158;
        String r5 = C1014.f6160.mo3796(2579);
        String str = r5 == null ? "MSG2579" : r5;
        int indexOf = str.indexOf("%s");
        int indexOf2 = str.indexOf("%d");
        if (indexOf != -1 && indexOf2 != -1) {
            if (indexOf < indexOf2) {
                try {
                    Object[] objArr = new Object[2];
                    C1701 r7 = C1014.f6158.f674.f608.mo4465(i);
                    objArr[0] = r7 == null ? null : r7.mo4462(true);
                    objArr[1] = Integer.valueOf(i2);
                    str = String.format(str, objArr);
                } catch (IllegalFormatConversionException e) {
                    C0592ns.m674("display_petfood_success_msg: " + e.toString());
                }
            } else {
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(i2);
                C1701 r72 = C1014.f6158.f674.f608.mo4465(i);
                objArr2[1] = r72 == null ? null : r72.mo4462(true);
                str = String.format(str, objArr2);
            }
            mo4490(str, (int) SupportMenu.USER_MASK);
        }
    }
}

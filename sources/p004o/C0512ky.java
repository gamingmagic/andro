package p004o;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.ky */
final class C0512ky {

    /* renamed from: 䒧 */
    private static /* synthetic */ int[] f1587;

    /* renamed from: Ą */
    ImageView f1588;

    /* renamed from: ą */
    TextView f1589;

    /* renamed from: Ć */
    TextView f1590;

    /* renamed from: ć */
    TextView f1591;

    /* renamed from: ċ */
    OnClickListener f1592 = new C0514kz(this);

    /* renamed from: ȃ */
    RelativeLayout f1593;

    /* renamed from: Ȋ */
    C1695 f1594;

    /* renamed from: ˮ͈ */
    C1992 f1595;

    /* renamed from: ˮ͍ */
    C0513[] f1596;

    /* renamed from: 岱 */
    C0513 f1597;

    /* renamed from: 櫯 */
    int f1598;

    /* renamed from: 纫 */
    private View.OnClickListener f1599 = new C0516la(this);

    /* renamed from: 鷭 */
    Bitmap f1600;

    /* renamed from: o.ky$鷭 */
    enum C0513 {
        EQUIP("Equip"),
        USE("Use"),
        INSERTCARD("Insert into..."),
        DROP("Drop"),
        VIEW("View description"),
        HOTKEY("Hotkey"),
        FROM_INVENTORY_TO_STORAGE("Move to storage"),
        FROM_INVENTORY_TO_TRADE("Trade"),
        FROM_INVENTORY_TO_CART("Move to cart"),
        FROM_CART_TO_INVENTORY("Move to inventory"),
        FROM_CART_TO_STORAGE("Move to storage"),
        FROM_STORAGE_TO_INVENTORY("Move to inventory"),
        FROM_STORAGE_TO_CART("Move to cart"),
        ADD_TO_VENDING_LIST("Add to vending list"),
        ADD_TO_AUTOBUY_LIST("Add to buying store list");
        

        /* renamed from: ܕ */
        String f1617;

        private C0513(String str) {
            this.f1617 = str;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(33:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0036 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0061 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0082 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x008c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0096 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0022 */
    /* renamed from: 櫯 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m542() {
        /*
            int[] r0 = f1587
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.ky$鷭[] r0 = p004o.C0512ky.C0513.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.ky$鷭 r0 = p004o.C0512ky.C0513.ADD_TO_AUTOBUY_LIST     // Catch:{ NoSuchFieldError -> 0x0017 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
            r1 = 15
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
        L_0x0017:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.ADD_TO_VENDING_LIST     // Catch:{ NoSuchFieldError -> 0x0022 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
            r1 = 14
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0022 }
        L_0x0022:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.DROP     // Catch:{ NoSuchFieldError -> 0x002c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002c }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002c }
        L_0x002c:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.EQUIP     // Catch:{ NoSuchFieldError -> 0x0036 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0036 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0036 }
        L_0x0036:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.FROM_CART_TO_INVENTORY     // Catch:{ NoSuchFieldError -> 0x0041 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0041 }
        L_0x0041:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.FROM_CART_TO_STORAGE     // Catch:{ NoSuchFieldError -> 0x004c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004c }
        L_0x004c:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.FROM_INVENTORY_TO_CART     // Catch:{ NoSuchFieldError -> 0x0057 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0057 }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0057 }
        L_0x0057:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.FROM_INVENTORY_TO_STORAGE     // Catch:{ NoSuchFieldError -> 0x0061 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0061 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0061 }
        L_0x0061:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.FROM_INVENTORY_TO_TRADE     // Catch:{ NoSuchFieldError -> 0x006c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006c }
        L_0x006c:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.FROM_STORAGE_TO_CART     // Catch:{ NoSuchFieldError -> 0x0077 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
            r1 = 13
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0077 }
        L_0x0077:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.FROM_STORAGE_TO_INVENTORY     // Catch:{ NoSuchFieldError -> 0x0082 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
            r1 = 12
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0082 }
        L_0x0082:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.HOTKEY     // Catch:{ NoSuchFieldError -> 0x008c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x008c }
        L_0x008c:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.INSERTCARD     // Catch:{ NoSuchFieldError -> 0x0096 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0096 }
        L_0x0096:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.USE     // Catch:{ NoSuchFieldError -> 0x00a0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00a0 }
        L_0x00a0:
            o.ky$鷭 r0 = p004o.C0512ky.C0513.VIEW     // Catch:{ NoSuchFieldError -> 0x00aa }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00aa }
        L_0x00aa:
            f1587 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0512ky.m542():int[]");
    }

    C0512ky(C1992 r5, int i) {
        this.f1595 = r5 != null ? r5.mo4612() : null;
        this.f1598 = i;
        if (this.f1595 != null) {
            String r52 = C1014.f6158.f674.mo3608(r5.f8848, r5.f8837, false);
            Bitmap bitmap = (Bitmap) C1014.f6147.f51.f1425.get(r52);
            if (bitmap != null) {
                this.f1600 = bitmap;
            } else {
                this.f1600 = C1014.f6147.f51.f1450;
                C1014.f6158.mo3387((Runnable) new C0517lb(this, r52));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final RelativeLayout mo3937(RelativeLayout relativeLayout) {
        this.f1593 = relativeLayout;
        this.f1589 = (TextView) this.f1593.findViewById(R.id.text_view_name);
        this.f1590 = (TextView) this.f1593.findViewById(R.id.text_view_amount);
        this.f1591 = (TextView) this.f1593.findViewById(R.id.text_view_price);
        this.f1591.setVisibility(4);
        this.f1588 = (ImageView) this.f1593.findViewById(R.id.image_view);
        m543();
        return this.f1593;
    }

    /* renamed from: 鷭 */
    private void m543() {
        if (this.f1595 != null) {
            this.f1588.setImageBitmap(this.f1600);
            this.f1589.setText(this.f1595.mo4615(C1014.f6158.f674.f608));
            this.f1589.setTextColor(this.f1595.mo4610());
            this.f1590.setText(String.valueOf(this.f1595.f8846));
            return;
        }
        this.f1588.setImageBitmap(null);
        this.f1589.setText(null);
        this.f1590.setText(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3939(C0513[] r7) {
        this.f1596 = r7;
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle(this.f1595.mo4615(C1014.f6158.f674.f608));
        builder.setIcon(new BitmapDrawable(C1014.f6147.getResources(), this.f1600));
        String[] strArr = new String[r7.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = r7[i].f1617;
        }
        builder.setItems(strArr, this.f1592);
        builder.show();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3938(C0513 r7, int i) {
        this.f1597 = r7;
        switch (m542()[r7.ordinal()]) {
            case 1:
                C1014.f6144.mo3652((C0839ue) new C1879((short) this.f1598, this.f1595.mo4613()));
                return;
            case 2:
                C1014.f6144.mo3652((C0839ue) new C1090((short) this.f1598));
                return;
            case 3:
                C1014.f6137.f1636.f6513 = this.f1598;
                C1014.f6144.mo3652((C0839ue) new C1089(this.f1598));
                return;
            case 4:
                if (i < 0) {
                    m544(r7);
                    return;
                } else {
                    C1014.f6144.mo3652((C0839ue) new C1450((short) this.f1598, (short) i));
                    return;
                }
            case 5:
                C1014.f6147.f51.f1380.mo4599(this.f1595);
                C1014.f6147.f51.f1380.mo3537h_();
                return;
            case 6:
                if (!C1014.f6147.f51.mo3879(C0501.ITEM, this.f1595.f8848)) {
                    C1014.f6147.f51.mo3876(C0501.ITEM, this.f1595.f8848, this.f1595.f8846, 0, 0);
                    return;
                }
                return;
            case 7:
                if (this.f1595.f8846 == 1) {
                    i = this.f1595.f8846;
                }
                if (i < 0) {
                    m544(r7);
                    return;
                } else {
                    C1014.f6144.mo3652((C0839ue) new C1683(this.f1598, i));
                    return;
                }
            case 8:
                if (this.f1595.f8846 == 1) {
                    i = this.f1595.f8846;
                }
                if (i < 0) {
                    m544(r7);
                    return;
                } else {
                    C1014.f6144.mo3652((C0839ue) new C1792(this.f1598, i));
                    return;
                }
            case 9:
                if (this.f1595.f8846 == 1) {
                    i = this.f1595.f8846;
                }
                if (i < 0) {
                    m544(r7);
                    return;
                } else {
                    C1014.f6144.mo3652((C0839ue) new C1034(this.f1598, i));
                    return;
                }
            case 10:
                if (this.f1595.f8846 == 1) {
                    i = this.f1595.f8846;
                }
                if (i < 0) {
                    m544(r7);
                    return;
                } else {
                    C1014.f6144.mo3652((C0839ue) new C1512(this.f1598, i));
                    return;
                }
            case 11:
                if (this.f1595.f8846 == 1) {
                    i = this.f1595.f8846;
                }
                if (i < 0) {
                    m544(r7);
                    return;
                } else {
                    C1014.f6144.mo3652((C0839ue) new C1700(this.f1598, i));
                    return;
                }
            case 12:
                if (this.f1595.f8846 == 1) {
                    i = this.f1595.f8846;
                }
                if (i < 0) {
                    m544(r7);
                    return;
                } else {
                    C1014.f6144.mo3652((C0839ue) new C1316(this.f1598, i));
                    return;
                }
            case 13:
                if (this.f1595.f8846 == 1) {
                    i = this.f1595.f8846;
                }
                if (i < 0) {
                    m544(r7);
                    return;
                } else {
                    C1014.f6144.mo3652((C0839ue) new C1087(this.f1598, i));
                    return;
                }
            case 14:
                if (this.f1595.f8846 == 1) {
                    i = this.f1595.f8846;
                }
                if (i < 0) {
                    m544(r7);
                    return;
                } else {
                    C1014.f6147.f51.f1385.mo3969(this, i, -1);
                    return;
                }
            case 15:
                C1014.f6147.f51.f1385.mo3969(this, -1, -1);
                return;
            default:
                throw new UnsupportedOperationException(r7 + " not supported");
        }
    }

    /* renamed from: 鷭 */
    private void m544(C0513 r6) {
        this.f1597 = r6;
        if (this.f1594 == null) {
            this.f1594 = new C1695(null, true, null, this.f1599);
        }
        C1695 r0 = this.f1594;
        r0.f7751.setText(new StringBuilder(String.valueOf(this.f1595.mo4615(C1014.f6158.f674.f608))).append(" : select amount").toString());
        this.f1594.f7748 = String.valueOf(this.f1595.f8846);
        this.f1594.mo3537h_();
    }
}

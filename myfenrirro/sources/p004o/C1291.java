package p004o;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import android.widget.Toast;
import com.libroserver.apk.R;
import java.util.Arrays;

/* renamed from: o.ҧ */
class C1291 extends C0186aj {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f6465;

    /* renamed from: Ą */
    OnItemLongClickListener f6466;

    /* renamed from: ȃ */
    OnItemClickListener f6467;

    /* renamed from: ˮ͈ */
    GridView f6468;

    /* renamed from: 櫯 */
    C0572mz f6469;

    /* JADX WARNING: Can't wrap try/catch for region: R(10:3|4|5|6|7|8|9|(2:10|11)|12|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|7|8|9|10|11|12|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] mo4548() {
        /*
            int[] r0 = f6465
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.mz[] r0 = p004o.C0572mz.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.mz r0 = p004o.C0572mz.CART     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.mz r0 = p004o.C0572mz.EQUIP     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.mz r0 = p004o.C0572mz.ETC     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.mz r0 = p004o.C0572mz.USABLE     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            f6465 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1291.mo4548():int[]");
    }

    @Deprecated
    C1291(int i, C0572mz mzVar) {
        super(i);
        this.f6467 = new C1802(this);
        this.f6466 = new C1915(this);
        this.f6469 = mzVar;
        this.f6468 = (GridView) this.f385.findViewById(R.id.gridView1);
        this.f6468.setAdapter(new C1516(this.f6469));
        this.f6468.setOnItemClickListener(this.f6467);
        this.f6468.setOnItemLongClickListener(this.f6466);
    }

    C1291(C0572mz mzVar) {
        this(R.layout.inventory_pager_item, mzVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public void mo4280(int i) {
        C0512ky kyVar = (C0512ky) this.f6468.getAdapter().getItem(i);
        if (C1014.f6147.f51.f1421.f1626.getParent() != null) {
            kyVar.mo3938(C0513.FROM_INVENTORY_TO_STORAGE, -1);
            return;
        }
        if (!(C1014.f6147.f51.f1385.f1626.getParent() != null)) {
            switch (mo4548()[this.f6469.ordinal()]) {
                case 1:
                    if (kyVar.f1595.f8839 == C1472.CARD) {
                        kyVar.mo3938(C0513.INSERTCARD, -1);
                        return;
                    } else {
                        kyVar.mo3938(C0513.USE, -1);
                        return;
                    }
                case 2:
                    kyVar.mo3938(C0513.EQUIP, -1);
                    return;
                default:
                    mo4279(i);
                    return;
            }
        } else if (C1014.f6147.f51.f1385.f1655) {
            Toast.makeText(C1014.f6147, "Can add to vending list only from Cart", 1).show();
        } else {
            C1014.f6147.f51.f1385.mo3969(kyVar, -1, -1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public void mo4279(int i) {
        C0512ky kyVar = (C0512ky) this.f6468.getAdapter().getItem(i);
        C0513[] r2 = new C0513[C0513.values().length];
        int i2 = 0;
        switch (mo4548()[this.f6469.ordinal()]) {
            case 1:
                if (kyVar.f1595.f8839 != C1472.CARD) {
                    i2 = 0 + 1;
                    r2[0] = C0513.USE;
                    break;
                } else {
                    i2 = 0 + 1;
                    r2[0] = C0513.INSERTCARD;
                    break;
                }
            case 2:
                i2 = 0 + 1;
                r2[0] = C0513.EQUIP;
                break;
        }
        if (this.f6469 == C0572mz.USABLE || this.f6469 == C0572mz.EQUIP) {
            int i3 = i2;
            i2++;
            r2[i3] = C0513.HOTKEY;
        }
        if ((C1014.f6147.f51.f1385.f1626.getParent() != null) && this.f6469 == C0572mz.CART) {
            int i4 = i2;
            i2++;
            r2[i4] = C0513.ADD_TO_VENDING_LIST;
        }
        if ((C1014.f6147.f51.f1385.f1626.getParent() != null) && this.f6469 != C0572mz.CART && !C1014.f6147.f51.f1385.f1655) {
            int i5 = i2;
            i2++;
            r2[i5] = C0513.ADD_TO_AUTOBUY_LIST;
        }
        C1301 r4 = C1014.f6137.f1636;
        if (r4.f8640.containsKey(C0586nm.ON_PUSH_CART) || (r4.f8646 & 1928) > 0) {
            if (this.f6469 == C0572mz.CART) {
                int i6 = i2;
                i2++;
                r2[i6] = C0513.FROM_CART_TO_INVENTORY;
            } else {
                int i7 = i2;
                i2++;
                r2[i7] = C0513.FROM_INVENTORY_TO_CART;
            }
        }
        if (C1014.f6147.f51.f1421.f1626.getParent() != null) {
            int i8 = i2;
            i2++;
            r2[i8] = C0513.FROM_INVENTORY_TO_STORAGE;
        }
        if (C1014.f6147.f51.f1384.f1626.getParent() != null) {
            int i9 = i2;
            i2++;
            r2[i9] = C0513.FROM_INVENTORY_TO_TRADE;
        }
        int i10 = i2;
        int i11 = i2 + 1;
        r2[i10] = C0513.DROP;
        int i12 = i11;
        int i13 = i11 + 1;
        r2[i12] = C0513.VIEW;
        kyVar.mo3939((C0513[]) Arrays.copyOf(r2, i13));
    }
}

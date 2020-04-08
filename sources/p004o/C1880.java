package p004o;

import android.widget.TextView;
import com.libroserver.apk.R;
import java.util.Arrays;

/* renamed from: o.갠 */
final class C1880 extends C1291 {

    /* renamed from: 鷭 */
    TextView f8487 = ((TextView) this.f385.findViewById(R.id.textView1));

    C1880() {
        super(R.layout.inventory_pager_cart, C0572mz.CART);
        mo4548();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4548() {
        this.f8487.setText("Num: " + C1014.f6137.f1636.f6498.size() + " / " + C1014.f6137.f1636.f6499 + " Weight: " + (C1014.f6137.f1636.f6500 / 10) + "/" + (C1014.f6137.f1636.f6515 / 10));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4280(int i) {
        C0512ky kyVar = (C0512ky) this.f6468.getAdapter().getItem(i);
        if (C1014.f6147.f51.f1385.f1626.getParent() != null) {
            kyVar.mo3938(C0513.ADD_TO_VENDING_LIST, -1);
            return;
        }
        if (C1014.f6147.f51.f1421.f1626.getParent() != null) {
            kyVar.mo3938(C0513.FROM_CART_TO_STORAGE, -1);
        } else {
            kyVar.mo3938(C0513.FROM_CART_TO_INVENTORY, -1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4279(int i) {
        C0512ky kyVar = (C0512ky) this.f6468.getAdapter().getItem(i);
        C0513[] r2 = new C0513[C0513.values().length];
        int i2 = 0;
        if (C1014.f6147.f51.f1385.f1626.getParent() != null) {
            i2 = 0 + 1;
            r2[0] = C0513.ADD_TO_VENDING_LIST;
        }
        int i3 = i2;
        int i4 = i2 + 1;
        r2[i3] = C0513.FROM_CART_TO_INVENTORY;
        if (C1014.f6147.f51.f1421.f1626.getParent() != null) {
            int i5 = i4;
            i4++;
            r2[i5] = C0513.FROM_CART_TO_STORAGE;
        }
        int i6 = i4;
        int i7 = i4 + 1;
        r2[i6] = C0513.VIEW;
        kyVar.mo3939((C0513[]) Arrays.copyOf(r2, i7));
    }
}

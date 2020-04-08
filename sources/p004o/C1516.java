package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import com.libroserver.apk.R;

/* renamed from: o.些 */
final class C1516 extends BaseAdapter {

    /* renamed from: 櫯 */
    C0512ky[] f7266 = new C0512ky[0];

    /* renamed from: 鷭 */
    C0572mz f7267 = C0572mz.USABLE;

    /* JADX WARNING: CFG modification limit reached, blocks count: 126 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C1516(p004o.C0572mz r11) {
        /*
            r10 = this;
            r10.<init>()
            o.mz r0 = p004o.C0572mz.USABLE
            r10.f7267 = r0
            r0 = 0
            o.ky[] r0 = new p004o.C0512ky[r0]
            r10.f7266 = r0
            r10.f7267 = r11
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "Requested inventory adapter init while not ingame"
            p004o.C0592ns.m674(r0)
            return
        L_0x001a:
            o.mz r0 = p004o.C0572mz.CART
            if (r11 == r0) goto L_0x0079
            r5 = 0
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6528
            int r0 = r0.size()
            o.ky[] r6 = new p004o.C0512ky[r0]
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6528
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r8 = r0.iterator()
            goto L_0x006a
        L_0x003a:
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r7 = r0
            java.lang.Object r0 = r7.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r9 = r0.intValue()
            java.lang.Object r0 = r7.getValue()
            o.쎥 r0 = (p004o.C1992) r0
            r7 = r0
            if (r7 == 0) goto L_0x006a
            int r0 = r7.f8836
            if (r0 > 0) goto L_0x006a
            o.䒧 r0 = r7.f8839
            o.mz r0 = p004o.C0572mz.m662(r0)
            if (r0 != r11) goto L_0x006a
            r0 = r5
            int r5 = r5 + 1
            o.ky r1 = new o.ky
            r1.<init>(r7, r9)
            r6[r0] = r1
        L_0x006a:
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L_0x003a
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r6, r5)
            o.ky[] r0 = (p004o.C0512ky[]) r0
            r10.f7266 = r0
            return
        L_0x0079:
            r5 = 0
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6498
            int r0 = r0.size()
            o.ky[] r0 = new p004o.C0512ky[r0]
            r10.f7266 = r0
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6498
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
            goto L_0x00ba
        L_0x0097:
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r6 = r0
            o.ky[] r0 = r10.f7266
            r1 = r5
            int r5 = r5 + 1
            o.ky r2 = new o.ky
            java.lang.Object r3 = r6.getValue()
            o.쎥 r3 = (p004o.C1992) r3
            java.lang.Object r4 = r6.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.<init>(r3, r4)
            r0[r1] = r2
        L_0x00ba:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0097
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1516.<init>(o.mz):void");
    }

    public final int getCount() {
        return this.f7266.length;
    }

    public final Object getItem(int i) {
        return this.f7266[i];
    }

    public final long getItemId(int i) {
        return (long) this.f7266[i].f1595.f8848;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.f7266[i].mo3937((RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.inventory_item, null));
    }
}

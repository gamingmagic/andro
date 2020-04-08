package p004o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import com.libroserver.apk.R;

/* renamed from: o.id */
final class C0431id extends BaseAdapter {

    /* renamed from: 櫯 */
    C0512ky[] f1272;

    /* renamed from: 鷭 */
    C0572mz f1273 = C0572mz.USABLE;

    /* JADX WARNING: CFG modification limit reached, blocks count: 113 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0431id(p004o.C0572mz r9) {
        /*
            r8 = this;
            r8.<init>()
            o.mz r0 = p004o.C0572mz.USABLE
            r8.f1273 = r0
            r8.f1273 = r9
            r3 = 0
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6501
            int r0 = r0.size()
            o.ky[] r4 = new p004o.C0512ky[r0]
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6501
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r6 = r0.iterator()
            goto L_0x0051
        L_0x0025:
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r5 = r0
            java.lang.Object r0 = r5.getValue()
            o.쎥 r0 = (p004o.C1992) r0
            r7 = r0
            if (r7 == 0) goto L_0x0051
            o.䒧 r0 = r7.f8839
            o.mz r0 = p004o.C0572mz.m662(r0)
            if (r0 != r9) goto L_0x0051
            r0 = r3
            int r3 = r3 + 1
            o.ky r1 = new o.ky
            java.lang.Object r2 = r5.getKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.<init>(r7, r2)
            r4[r0] = r1
        L_0x0051:
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L_0x0025
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r3)
            o.ky[] r0 = (p004o.C0512ky[]) r0
            r8.f1272 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0431id.<init>(o.mz):void");
    }

    public final int getCount() {
        return this.f1272.length;
    }

    public final Object getItem(int i) {
        return this.f1272[i];
    }

    public final long getItemId(int i) {
        return (long) this.f1272[i].f1595.f8848;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.f1272[i].mo3937((RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.inventory_item, null));
    }
}

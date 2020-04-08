package p004o;

import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;

/* renamed from: o.hc */
final class C0396hc extends C0519ld {

    /* renamed from: Ą */
    OnClickListener f1120 = new C0399he(this);

    /* renamed from: ȃ */
    OnItemClickListener f1121 = new C0398hd(this);

    /* renamed from: ˮ͈ */
    C0397 f1122;

    /* renamed from: 櫯 */
    TextView f1123 = ((TextView) this.f1626.findViewById(R.id.textView1));

    /* renamed from: 鷭 */
    ListView f1124 = ((ListView) this.f1626.findViewById(R.id.listView1));

    /* renamed from: o.hc$鷭 */
    enum C0397 {
        SKILL_MERC,
        SKILL_HOMUN,
        SKILL_ME,
        AUTOSPELL,
        SKILLSELECTREQUEST
    }

    C0396hc(LayoutInflater layoutInflater) {
        super(R.layout.skills);
        this.f1124.setOnItemClickListener(this.f1121);
        this.f1124.setSelector(R.color.White);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3767(int i) {
        if (this.f1122 == C0397.SKILL_HOMUN || this.f1122 == C0397.SKILL_ME || this.f1122 == C0397.SKILL_MERC) {
            C1014.f6147.f51.f1374.f1087 = ((C0400hf) this.f1124.getAdapter()).f1135[i].f2974;
            C1014.f6147.f51.f1374.mo3537h_();
        } else if (this.f1122 == C0397.AUTOSPELL) {
            C1014.f6144.mo3652((C0839ue) new C1081(((C0400hf) this.f1124.getAdapter()).f1135[i].f2974.f1053));
            C1014.f6147.f51.f1435.mo3538();
        } else {
            if (this.f1122 == C0397.SKILLSELECTREQUEST) {
                C1014.f6144.mo3652((C0839ue) new C1083((short) ((C0400hf) this.f1124.getAdapter()).f1135[i].f2974.f1053));
                C1014.f6147.f51.f1435.mo3538();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 160 */
    /* renamed from: Ć */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo3766() {
        /*
            r10 = this;
            monitor-enter(r10)
            android.view.View r0 = r10.f1626     // Catch:{ all -> 0x018d }
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x000b
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0010
            monitor-exit(r10)     // Catch:{ all -> 0x018d }
            return
        L_0x0010:
            r3 = 0
            o.hc$鷭 r0 = r10.f1122     // Catch:{ all -> 0x018d }
            o.hc$鷭 r1 = p004o.C0396hc.C0397.SKILL_HOMUN     // Catch:{ all -> 0x018d }
            if (r0 != r1) goto L_0x0043
            o.lf r0 = p004o.C1014.f6137     // Catch:{ all -> 0x018d }
            o.ձ r0 = r0.f1636     // Catch:{ all -> 0x018d }
            o.ձ$if r0 = r0.f6524     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x0043
            android.widget.TextView r0 = r10.f1123     // Catch:{ all -> 0x018d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018d }
            java.lang.String r2 = "Skill Point : "
            r1.<init>(r2)     // Catch:{ all -> 0x018d }
            o.lf r2 = p004o.C1014.f6137     // Catch:{ all -> 0x018d }
            o.ձ r2 = r2.f1636     // Catch:{ all -> 0x018d }
            o.ձ$if r2 = r2.f6524     // Catch:{ all -> 0x018d }
            short r2 = r2.f6574     // Catch:{ all -> 0x018d }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x018d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x018d }
            r0.setText(r1)     // Catch:{ all -> 0x018d }
            o.lf r0 = p004o.C1014.f6137     // Catch:{ all -> 0x018d }
            o.ձ r0 = r0.f1636     // Catch:{ all -> 0x018d }
            o.ձ$if r0 = r0.f6524     // Catch:{ all -> 0x018d }
            o.ձ$ˮ͈ r3 = r0.f6572     // Catch:{ all -> 0x018d }
        L_0x0043:
            o.hc$鷭 r0 = r10.f1122     // Catch:{ all -> 0x018d }
            o.hc$鷭 r1 = p004o.C0396hc.C0397.SKILL_MERC     // Catch:{ all -> 0x018d }
            if (r0 != r1) goto L_0x0076
            o.lf r0 = p004o.C1014.f6137     // Catch:{ all -> 0x018d }
            o.ձ r0 = r0.f1636     // Catch:{ all -> 0x018d }
            o.ձ$if r0 = r0.f6538     // Catch:{ all -> 0x018d }
            if (r0 == 0) goto L_0x0076
            android.widget.TextView r0 = r10.f1123     // Catch:{ all -> 0x018d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018d }
            java.lang.String r2 = "Skill Point : "
            r1.<init>(r2)     // Catch:{ all -> 0x018d }
            o.lf r2 = p004o.C1014.f6137     // Catch:{ all -> 0x018d }
            o.ձ r2 = r2.f1636     // Catch:{ all -> 0x018d }
            o.ձ$if r2 = r2.f6538     // Catch:{ all -> 0x018d }
            short r2 = r2.f6574     // Catch:{ all -> 0x018d }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x018d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x018d }
            r0.setText(r1)     // Catch:{ all -> 0x018d }
            o.lf r0 = p004o.C1014.f6137     // Catch:{ all -> 0x018d }
            o.ձ r0 = r0.f1636     // Catch:{ all -> 0x018d }
            o.ձ$if r0 = r0.f6538     // Catch:{ all -> 0x018d }
            o.ձ$ˮ͈ r3 = r0.f6572     // Catch:{ all -> 0x018d }
            goto L_0x009c
        L_0x0076:
            o.hc$鷭 r0 = r10.f1122     // Catch:{ all -> 0x018d }
            o.hc$鷭 r1 = p004o.C0396hc.C0397.SKILL_ME     // Catch:{ all -> 0x018d }
            if (r0 != r1) goto L_0x009c
            android.widget.TextView r0 = r10.f1123     // Catch:{ all -> 0x018d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018d }
            java.lang.String r2 = "Skill Point : "
            r1.<init>(r2)     // Catch:{ all -> 0x018d }
            o.lf r2 = p004o.C1014.f6137     // Catch:{ all -> 0x018d }
            o.ձ r2 = r2.f1636     // Catch:{ all -> 0x018d }
            int r2 = r2.f6527     // Catch:{ all -> 0x018d }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x018d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x018d }
            r0.setText(r1)     // Catch:{ all -> 0x018d }
            o.lf r0 = p004o.C1014.f6137     // Catch:{ all -> 0x018d }
            o.ձ r0 = r0.f1636     // Catch:{ all -> 0x018d }
            o.ձ$ˮ͈ r3 = r0.f6548     // Catch:{ all -> 0x018d }
        L_0x009c:
            if (r3 != 0) goto L_0x00a0
            monitor-exit(r10)     // Catch:{ all -> 0x018d }
            return
        L_0x00a0:
            r4 = 0
            java.util.TreeMap<java.lang.Integer, o.gm> r0 = r3.f6579     // Catch:{ all -> 0x018d }
            int r0 = r0.size()     // Catch:{ all -> 0x018d }
            o.oe[] r5 = new p004o.C0605oe[r0]     // Catch:{ all -> 0x018d }
            java.util.TreeMap<java.lang.Integer, o.gm> r0 = r3.f6579     // Catch:{ all -> 0x018d }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x018d }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x018d }
            goto L_0x0172
        L_0x00b5:
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x018d }
            o.gm r0 = (p004o.C0377gm) r0     // Catch:{ all -> 0x018d }
            r6 = r0
            o.hc$鷭 r0 = r10.f1122     // Catch:{ all -> 0x018d }
            o.hc$鷭 r1 = p004o.C0396hc.C0397.SKILL_ME     // Catch:{ all -> 0x018d }
            if (r0 != r1) goto L_0x00f8
            o.lf r0 = p004o.C1014.f6137     // Catch:{ all -> 0x018d }
            o.ձ r0 = r0.f1636     // Catch:{ all -> 0x018d }
            int r1 = r6.f1053     // Catch:{ all -> 0x018d }
            boolean r8 = r0.mo4292(r1)     // Catch:{ all -> 0x018d }
            int r0 = r6.f1051     // Catch:{ all -> 0x018d }
            if (r0 != 0) goto L_0x00d2
            if (r8 == 0) goto L_0x0172
        L_0x00d2:
            o.oe r9 = new o.oe     // Catch:{ all -> 0x018d }
            r9.<init>()     // Catch:{ all -> 0x018d }
            r9.f2974 = r6     // Catch:{ all -> 0x018d }
            o.cp r0 = p004o.C1014.f6158     // Catch:{ all -> 0x018d }
            o.ck r0 = r0.f674     // Catch:{ all -> 0x018d }
            o.gn r0 = r0.f609     // Catch:{ all -> 0x018d }
            int r1 = r6.f1053     // Catch:{ all -> 0x018d }
            o.gq r0 = r0.mo3752(r1)     // Catch:{ all -> 0x018d }
            r9.f2973 = r0     // Catch:{ all -> 0x018d }
            o.lf r0 = p004o.C1014.f6137     // Catch:{ all -> 0x018d }
            o.ձ r0 = r0.f1636     // Catch:{ all -> 0x018d }
            int r0 = r0.f6527     // Catch:{ all -> 0x018d }
            if (r0 <= 0) goto L_0x00f1
            r9.f2972 = r8     // Catch:{ all -> 0x018d }
        L_0x00f1:
            r0 = r4
            int r4 = r4 + 1
            r5[r0] = r9     // Catch:{ all -> 0x018d }
            goto L_0x0172
        L_0x00f8:
            o.hc$鷭 r0 = r10.f1122     // Catch:{ all -> 0x018d }
            o.hc$鷭 r1 = p004o.C0396hc.C0397.SKILL_HOMUN     // Catch:{ all -> 0x018d }
            if (r0 != r1) goto L_0x0136
            o.oe r9 = new o.oe     // Catch:{ all -> 0x018d }
            r9.<init>()     // Catch:{ all -> 0x018d }
            r9.f2974 = r6     // Catch:{ all -> 0x018d }
            o.cp r0 = p004o.C1014.f6158     // Catch:{ all -> 0x018d }
            o.ck r0 = r0.f674     // Catch:{ all -> 0x018d }
            o.gn r0 = r0.f609     // Catch:{ all -> 0x018d }
            int r1 = r6.f1053     // Catch:{ all -> 0x018d }
            o.gq r0 = r0.mo3752(r1)     // Catch:{ all -> 0x018d }
            r9.f2973 = r0     // Catch:{ all -> 0x018d }
            o.lf r0 = p004o.C1014.f6137     // Catch:{ all -> 0x018d }
            o.ձ r0 = r0.f1636     // Catch:{ all -> 0x018d }
            o.ձ$if r0 = r0.f6524     // Catch:{ all -> 0x018d }
            short r0 = r0.f6574     // Catch:{ all -> 0x018d }
            if (r0 <= 0) goto L_0x012f
            int r8 = r6.f1053     // Catch:{ all -> 0x018d }
            java.util.TreeMap<java.lang.Integer, o.gm> r0 = r3.f6579     // Catch:{ all -> 0x018d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x018d }
            o.gm r0 = (p004o.C0377gm) r0     // Catch:{ all -> 0x018d }
            boolean r0 = r0.f1049     // Catch:{ all -> 0x018d }
            r9.f2972 = r0     // Catch:{ all -> 0x018d }
        L_0x012f:
            r0 = r4
            int r4 = r4 + 1
            r5[r0] = r9     // Catch:{ all -> 0x018d }
            goto L_0x0172
        L_0x0136:
            o.hc$鷭 r0 = r10.f1122     // Catch:{ all -> 0x018d }
            o.hc$鷭 r1 = p004o.C0396hc.C0397.SKILL_MERC     // Catch:{ all -> 0x018d }
            if (r0 != r1) goto L_0x0172
            o.oe r9 = new o.oe     // Catch:{ all -> 0x018d }
            r9.<init>()     // Catch:{ all -> 0x018d }
            r9.f2974 = r6     // Catch:{ all -> 0x018d }
            o.cp r0 = p004o.C1014.f6158     // Catch:{ all -> 0x018d }
            o.ck r0 = r0.f674     // Catch:{ all -> 0x018d }
            o.gn r0 = r0.f609     // Catch:{ all -> 0x018d }
            int r1 = r6.f1053     // Catch:{ all -> 0x018d }
            o.gq r0 = r0.mo3752(r1)     // Catch:{ all -> 0x018d }
            r9.f2973 = r0     // Catch:{ all -> 0x018d }
            o.lf r0 = p004o.C1014.f6137     // Catch:{ all -> 0x018d }
            o.ձ r0 = r0.f1636     // Catch:{ all -> 0x018d }
            o.ձ$if r0 = r0.f6538     // Catch:{ all -> 0x018d }
            short r0 = r0.f6574     // Catch:{ all -> 0x018d }
            if (r0 <= 0) goto L_0x016d
            int r8 = r6.f1053     // Catch:{ all -> 0x018d }
            java.util.TreeMap<java.lang.Integer, o.gm> r0 = r3.f6579     // Catch:{ all -> 0x018d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x018d }
            o.gm r0 = (p004o.C0377gm) r0     // Catch:{ all -> 0x018d }
            boolean r0 = r0.f1049     // Catch:{ all -> 0x018d }
            r9.f2972 = r0     // Catch:{ all -> 0x018d }
        L_0x016d:
            r0 = r4
            int r4 = r4 + 1
            r5[r0] = r9     // Catch:{ all -> 0x018d }
        L_0x0172:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x018d }
            if (r0 != 0) goto L_0x00b5
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r4)     // Catch:{ all -> 0x018d }
            o.oe[] r0 = (p004o.C0605oe[]) r0     // Catch:{ all -> 0x018d }
            r5 = r0
            android.widget.ListView r0 = r10.f1124     // Catch:{ all -> 0x018d }
            o.hf r1 = new o.hf     // Catch:{ all -> 0x018d }
            android.view.View$OnClickListener r2 = r10.f1120     // Catch:{ all -> 0x018d }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x018d }
            r0.setAdapter(r1)     // Catch:{ all -> 0x018d }
            monitor-exit(r10)     // Catch:{ all -> 0x018d }
            return
        L_0x018d:
            r3 = move-exception
            monitor-exit(r10)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0396hc.mo3766():void");
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        mo3766();
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_skills)).setImageBitmap(C1014.f6147.f51.f1395[1]);
    }

    /* renamed from: Ą */
    public final void mo3544() {
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_skills)).setImageBitmap(C1014.f6147.f51.f1395[0]);
    }
}

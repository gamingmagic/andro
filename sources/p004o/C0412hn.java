package p004o;

import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: o.hn */
final class C0412hn {

    /* renamed from: Ą */
    HashMap<Integer, C1720> f1182 = new HashMap<>();

    /* renamed from: ą */
    HashMap<Integer, C1720> f1183 = new HashMap<>();

    /* renamed from: Ć */
    C0405hk f1184;

    /* renamed from: ć */
    C0405hk f1185;

    /* renamed from: ċ */
    C0408hl f1186;

    /* renamed from: ȃ */
    LinkedList<C1632> f1187 = new LinkedList<>();

    /* renamed from: Ȋ */
    C0408hl f1188;

    /* renamed from: ˮ͈ */
    HashMap<Integer, C0548mb> f1189 = new HashMap<>();

    /* renamed from: ˮ͍ */
    C0208bd f1190;

    /* renamed from: ܕ */
    C0408hl f1191;

    /* renamed from: 䒧 */
    C0408hl f1192;

    /* renamed from: 岱 */
    C0408hl f1193;

    /* renamed from: 庸 */
    C0562mp[] f1194 = {C0562mp.NUM2, C0562mp.NUM1, C0562mp.NUM4, C0562mp.NUM7, C0562mp.NUM8, C0562mp.NUM9, C0562mp.NUM6, C0562mp.NUM3};

    /* renamed from: 櫯 */
    C0543ly f1195;

    /* renamed from: 纫 */
    C0408hl f1196;

    /* renamed from: 躆 */
    C0408hl f1197;

    /* renamed from: 鷭 */
    C0441in f1198 = new C0441in();

    /* renamed from: o.hn$鷭 */
    public enum C0413 {
        NUM8,
        NUM7,
        NUM4,
        NUM1,
        NUM2,
        NUM3,
        NUM6,
        NUM9
    }

    C0412hn() {
        String str = "data\\texture\\" + C1014.f6158.f674.f623.f7904.f7928 + "\\map\\map_arrow.bmp";
        C1621 r10 = C0596nw.m683(str, (byte[]) C1014.f6158.f677.mo3613(str, false));
        C0441in inVar = this.f1198;
        int[] iArr = r10.f7548;
        int[] iArr2 = r10.f7547;
        int i = r10.f7546.x;
        String str2 = str;
        int i2 = i;
        inVar.mo3837(iArr, iArr2, i2, r10.f7546.y, str2, null, inVar.f1308);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3790(int i) {
        C0548mb mbVar = (C0548mb) this.f1189.get(Integer.valueOf(i));
        if (mbVar != null) {
            if (C1014.f6137.f1636 != null && ((C1014.f6137.f1636.f6524 != null && C1014.f6137.f1636.f6524.f6567.f6595 == i) || (C1014.f6137.f1636.f6538 != null && C1014.f6137.f1636.f6538.f6567.f6595 == i))) {
                C0520le leVar = mbVar.f1769;
                if (!(C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null).f8660) {
                    if (mbVar.f1769.f1629 == C0587nn.HOM) {
                        C1014.f6137.f1636.f6524.f6567.f6591 = true;
                        C1014.f6147.f51.f1449 = false;
                        C1014.f6137.f1636.f6524 = null;
                    }
                    if (mbVar.f1769.f1629 == C0587nn.MER) {
                        C1014.f6137.f1636.f6538.f6567.f6591 = true;
                        C1014.f6147.f51.f1440 = false;
                        C1014.f6137.f1636.f6538 = null;
                    }
                }
            }
            mbVar.mo3990();
            this.f1189.remove(Integer.valueOf(i));
            C1014.f6142.mo3976(mbVar, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0562mp mo3789(float f, byte b) {
        float f2 = (23.0f + f) - ((float) ((4 - b) * 45));
        while (f2 < 0.0f) {
            f2 += 360.0f;
        }
        while (f2 > 360.0f) {
            f2 -= 360.0f;
        }
        return this.f1194[((int) f2) / 45];
    }
}

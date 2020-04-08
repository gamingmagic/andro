package p004o;

import android.app.AlertDialog.Builder;
import android.os.Handler;
import java.util.ArrayList;
import p004o.C1782.C1786;

/* renamed from: o.Ī */
final class C1031 extends C0858uu implements C0838ud {

    /* renamed from: ȃ */
    private static /* synthetic */ int[] f6195;

    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|6|7|8|9|10|11|12|13|(2:14|15)|16|18) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ą */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1856() {
        /*
            int[] r0 = f6195
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.uu$鷭[] r0 = p004o.C0858uu.C0859.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.uu$鷭 r0 = p004o.C0858uu.C0859.FAIL_ALREADYACTIVATED     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.uu$鷭 r0 = p004o.C0858uu.C0859.FAIL_MALFORMED_DATA     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.uu$鷭 r0 = p004o.C0858uu.C0859.FAIL_NO_SUCH_PRODUCT     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.uu$鷭 r0 = p004o.C0858uu.C0859.FAIL_OTHER     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.uu$鷭 r0 = p004o.C0858uu.C0859.FAIL_RAGNAROK_SERVER_OFFLINE     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            o.uu$鷭 r0 = p004o.C0858uu.C0859.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0048 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            f6195 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1031.m1856():int[]");
    }

    public C1031() {
        super(null);
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        switch (m1856()[this.f5100.ordinal()]) {
            case 1:
            case 2:
            case 5:
                C0271df dfVar = C1014.f6149;
                if (!dfVar.f727) {
                    throw new RuntimeException("Purchase verification is not in progress, unexpected consume request");
                }
                C1782 r8 = dfVar.f728;
                C1530 r0 = dfVar.f726;
                C1786 r9 = dfVar.f723;
                C1530 r7 = r0;
                r8.mo4508("consume");
                ArrayList arrayList = new ArrayList();
                arrayList.add(r7);
                C1782 r72 = r8;
                ArrayList arrayList2 = arrayList;
                Handler handler = new Handler();
                r72.mo4507("consume");
                new Thread(new C1509(r72, arrayList2, r9, handler, null)).start();
                return;
            default:
                C0592ns.m674("Purchase verification error: " + this.f5100.f5108);
                C0271df dfVar2 = C1014.f6149;
                String str = this.f5100.f5108;
                C1014.f6147.mo3387((Runnable) new C0473jm(C1014.f6147.f51));
                if (str == null) {
                    new Builder(C1014.f6147).setMessage("Purchase verification failed.").show();
                } else {
                    new Builder(C1014.f6147).setMessage(str).show();
                }
                dfVar2.f726 = null;
                dfVar2.f727 = false;
                return;
        }
    }
}

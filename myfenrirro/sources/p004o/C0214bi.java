package p004o;

import android.graphics.Point;
import android.util.Log;
import java.util.HashMap;
import p004o.C0643pc.C0645;
import p004o.C0643pc.aux;

/* renamed from: o.bi */
final class C0214bi extends C0445ip {
    C0214bi() {
        super("c_proc_thread");
    }

    /* renamed from: 鷭 */
    static void m203(boolean[] zArr) {
        while (!zArr[0]) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Log.e("AndRO", e.toString());
                RuntimeException runtimeException = new RuntimeException(e.toString());
                runtimeException.setStackTrace(e.getStackTrace());
                throw runtimeException;
            }
        }
    }

    /* renamed from: 櫯 */
    private static void m201(boolean[] zArr) {
        m203(zArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3564(C0599nz nzVar, String str, short s, short s2) {
        C1301 r12;
        C1014.f6144.mo4336(true);
        C1014.f6141.f6185 = str;
        boolean[] zArr = new boolean[1];
        if (C1014.f6142 == null) {
            C1014.f6158.mo3387((Runnable) new C0215bj(this, zArr));
            m203(zArr);
        }
        C0543ly lyVar = C1014.f6142.f1680.f1195;
        if (lyVar != null) {
            C1301 r9 = lyVar.f1741;
            Point point = new Point(s, s2);
            int i = point.x;
            int i2 = point.y;
            r9.f1634 = i;
            r9.f1631 = i2;
            r9.f1632.x = 0;
            r9.f1632.y = 0;
            lyVar.f1741.mo4580(false);
            lyVar.f1741.f458 = false;
        }
        zArr[0] = false;
        C1014.f6147.mo3387((Runnable) new C0223br(this, zArr));
        m201(zArr);
        String str2 = null;
        if (C1014.f6142.f1695 == null || !C1014.f6142.f1695.f7353.equals(str)) {
            str2 = C1014.f6142.f1695 == null ? null : C1014.f6142.f1695.f7353;
            m202(str);
            if (lyVar != null) {
                zArr[0] = false;
                C1014.f6158.mo3387((Runnable) new C0224bs(this, lyVar, zArr));
                m201(zArr);
            }
        }
        if (lyVar == null) {
            r12 = new C1301(nzVar, C1014.f6161.f6162, s, s2);
        } else {
            r12 = lyVar.f1741;
        }
        C0521lf lfVar = C1014.f6137;
        C1301 r8 = r12;
        C1301 r92 = r8;
        lfVar.f1637.put(r92.f1630, r92);
        lfVar.f1636 = r8;
        if (lyVar == null) {
            C2042 r7 = C0548mb.m645(r12);
            lyVar = (C0543ly) (C0543ly.class.isAssignableFrom(r7.getClass()) ? r7 : null);
        }
        C1014.f6142.f1680.f1189.put(Integer.valueOf(C1014.f6161.f6162), lyVar);
        C1014.f6142.f1680.f1195 = lyVar;
        C1014.f6147.mo3387((Runnable) new C0225bt(this));
        if (C1014.f6142.f1695.f7347 != null) {
            C1014.f6142.f1695.f7347.mo4481();
            C1014.f6142.f1695.f7347.f8016.mo4339(new Point(lyVar.f1741.f1634, lyVar.f1741.f1631));
        }
        C1014.f6142.f1689.mo4472();
        if (!C1014.f6142.f1695.f7353.equals(str2)) {
            C1014.f6142.f1689.mo4471();
        }
        C1014.f6144.mo3652((C0839ue) new C1046());
        C1014.f6144.mo4336(false);
        if (C1014.f6140.f4443 == aux.iRO_Renewal) {
            C1014.f6144.mo3652((C0839ue) new C0883vp());
        }
    }

    /* renamed from: 鷭 */
    private void m202(String str) {
        boolean[] zArr = new boolean[1];
        C1014.f6147.mo3387((Runnable) new C0226bu(this));
        C0453ix ixVar = C1014.f6147.f51;
        String str2 = "Loading map";
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str2));
        if (C1014.f6140.f4447 == C0645.AEGIS) {
            C1014.f6144.f7008 = false;
        }
        if (!(C1014.f6142.f1698 == null || C1014.f6142.f1698.f8355 == null)) {
            C1014.f6142.f1698.f8355 = null;
        }
        mo3563();
        C1014.f6142.f1698 = null;
        zArr[0] = false;
        C1014.f6147.mo3387((Runnable) new C0228bw(this, zArr));
        m203(zArr);
        zArr[0] = false;
        C1014.f6158.mo3387((Runnable) new C0229bx(this, zArr));
        m203(zArr);
        C0252cp cpVar = C1014.f6158;
        String r10 = C1619.m2295(str);
        String sb = new StringBuilder(String.valueOf(C0595nv.f2877 ? "AI/USER_AI/" : "AI/")).append("AI.lua").toString();
        String sb2 = new StringBuilder(String.valueOf(C0595nv.f2877 ? "AI/USER_AI/" : "AI/")).append("Const.lua").toString();
        String sb3 = new StringBuilder(String.valueOf(C0595nv.f2877 ? "AI/USER_AI/" : "AI/")).append("Util.lua").toString();
        zArr[0] = false;
        C1014.f6158.mo3387((Runnable) new C0231bz(this, str, r10, sb, sb2, sb3, zArr));
        m201(zArr);
        C1014.f6136.mo4427(C0595nv.f2869 + "/" + r10);
        zArr[0] = false;
        C1014.f6147.mo3387((Runnable) new C0233ca(this, zArr));
        m201(zArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3563() {
        boolean[] zArr = new boolean[1];
        if (C1014.f6142 != null && C1014.f6142.f1695 != null) {
            C1014 r0 = C1014.f6161;
            if (C1014.m1831()) {
                C1014.f6147.mo3387((Runnable) new C0217bl(this, zArr));
                m203(zArr);
            }
            C1641 r3 = C1014.f6136;
            if (r3.f7601.isPlaying()) {
                r3.f7601.pause();
                r3.f7600 = true;
            }
            C1014.f6136.mo4426();
            zArr[0] = false;
            C1812 r5 = C1014.f6142.f1698;
            C0218bm bmVar = new C0218bm(this, zArr);
            C1812 r32 = r5;
            synchronized (r5) {
                r32.f8360.add(bmVar);
            }
            m203(zArr);
            C0252cp.f650 = new HashMap<>();
            C0252cp.f651 = new HashMap<>();
            zArr[0] = false;
            C1014.f6158.mo3387((Runnable) new C0219bn(this, zArr));
            m201(zArr);
            zArr[0] = false;
            C1014.f6147.mo3387((Runnable) new C0220bo(this, zArr));
            m201(zArr);
        }
    }
}

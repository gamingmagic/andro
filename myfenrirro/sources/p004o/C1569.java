package p004o;

import com.roworkshop.andro.c_activity;

/* renamed from: o.庚 */
public class C1569 implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ c_activity f7369;

    public C1569(c_activity c_activity) {
        this.f7369 = c_activity;
    }

    public final void run() {
        C0280do doVar = this.f7369.f54;
        if (doVar != null) {
            if (doVar.f744 != null) {
                if (doVar.f7007 != null) {
                    C0280do doVar2 = doVar;
                    if (doVar.f7007 != null) {
                        doVar2.f7007.f7024 = true;
                    }
                    doVar.mo3387((Runnable) new C1449(this, doVar));
                }
                C1014.f6161.f6167 = doVar.f744;
                C1014.f6161.mo4256(true);
            } else if (System.currentTimeMillis() - this.f7369.f55 > 20000) {
                throw new C0822tr("Failed to connect to master-server (timed out).", false);
            } else if (doVar.f743 == C0281.NOTFOUND || doVar.f743 == C0281.CORRUPTED) {
                throw new C0822tr("System error 1 while connecting to master-server. Please report this.", false);
            } else {
                c_activity c_activity = this.f7369;
                if (c_activity.f56 != null) {
                    c_activity.f56.postDelayed(new C1348(c_activity, this), 100);
                }
            }
        }
    }
}

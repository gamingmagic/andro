package p004o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import p004o.C0653pe.C0654if;
import p004o.C0653pe.C0655;

/* renamed from: o.cl */
public final class C0248cl extends C0653pe {

    /* renamed from: 鷭 */
    static final String[][] f627 = {new String[]{".bmp", "BM"}, new String[]{".gat", "GRAT"}, new String[]{".gnd", "GRGN"}, new String[]{".rsw", "GRSW"}, new String[]{".act", "AC"}, new String[]{".spr", "SP"}, new String[]{".rsm", "GRSM"}, new String[]{".str", "STRM"}};

    /* renamed from: Ą */
    private String f628;

    /* renamed from: ȃ */
    private boolean f629;

    /* renamed from: ˮ͈ */
    private C1455 f630;

    static {
    }

    /* renamed from: 鷭 */
    private static boolean m252(String str, byte[] bArr) {
        String[][] strArr;
        if (bArr.length == 0 && !str.endsWith(".txt") && !str.endsWith(".lub") && !str.endsWith(".lua")) {
            return false;
        }
        for (String[] strArr2 : f627) {
            if (str.endsWith(strArr2[0]) && (bArr.length < strArr2[1].length() || !C0622ot.m739(bArr, strArr2[1].length(), C0618op.LATIN).equals(strArr2[1]))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: 鷭 */
    private byte[] m254(String str, byte[] bArr, C0785te teVar) {
        if (str.startsWith("data") || str.startsWith("BGM")) {
            try {
                byte[] r4 = m253(this.f628, str, true, C0654if.OVERWRITE, null);
                if (r4 == null) {
                    throw new C0825tu(null, str, "Downloaded file didn't appear on file system");
                } else if (!m252(str, r4)) {
                    throw new C0825tu(null, str, "Failed to repair file: remote file is not valid too. Srclen=" + bArr.length + " grfname=" + (teVar != null ? teVar.f4793.getAbsolutePath() : "none"));
                } else {
                    if (teVar != null) {
                        if (teVar.f4793.getName().equals("ddata.grf")) {
                            C0592ns.m674("Found invalid resource file: " + str + ". Successfully repaired.");
                            this.f630.mo4321(teVar.f4792);
                        } else {
                            throw new C0825tu(null, str, "Local resource is invalid and located inside standard GRF. Can't repair. Try deleting client directory " + this.f628 + "\nsrclen=" + bArr.length + "\nnewlen=" + r4.length + "\ngrfname=" + (teVar != null ? teVar.f4793.getAbsolutePath() : "none"));
                        }
                    }
                    return r4;
                }
            } catch (C0825tu e) {
                throw new C0825tu(e, str, "Local resource corrupted, remote resource not found");
            }
        } else {
            throw new C0822tr(new StringBuilder(String.valueOf(str)).append(" size=").append(bArr.length).append(" is corrupted. Try deleting client directory ").append(this.f628).toString(), true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final Object mo3613(String str, boolean z) {
        Object obj = null;
        if (!(C1014.f6158 == null || C1014.f6158.f1341 == null || Thread.currentThread().getId() == C1014.f6158.f1341.getId())) {
            C0592ns.m674("Attempt to read " + str + " from non-resource thread! All resources should be read only from resource thread.");
            Thread.dumpStack();
        }
        if (str.startsWith("data\\")) {
            str = str.toLowerCase();
        }
        if (str.startsWith("data\\lua files")) {
            if (C1014.f6140.f4527) {
                str = str.replace("data\\lua files", "data\\luafiles514\\lua files");
            }
            if (C1014.f6140.f4514 && str.endsWith(".lub")) {
                try {
                    return mo3613(str.substring(0, str.length() - 4) + ".lua", z);
                } catch (C0825tu unused) {
                }
            }
        }
        if (this.f629) {
            if (z) {
                C0655 r4 = C0653pe.m798(this.f628, str, true);
                obj = r4 == null ? null : r4.f4547;
            } else {
                obj = m793(this.f628, str, true);
            }
        }
        C0785te teVar = null;
        if (obj == null) {
            teVar = this.f630.mo4322(str);
            if (teVar == null) {
                obj = m796(this.f628, str, z, (C0813tl) C0524lh.m567());
            } else if (!z) {
                obj = m794(teVar);
            } else {
                obj = m797(teVar);
            }
        }
        if (!z && !m252(str, (byte[]) obj)) {
            obj = m254(str, (byte[]) obj, teVar);
        }
        return obj;
    }

    /* renamed from: 鷭 */
    static final byte[] m253(String str, String str2, boolean z, C0654if ifVar, C0658ph phVar) {
        long j;
        File file = new File(str, str2);
        if (ifVar != C0654if.SKIP || !file.exists()) {
            String replace = str2.replace("\\", "/");
            if (C1014.f6149.f729.mo3654() || C1014.f6140.f4468 != null) {
                if (ifVar == C0654if.RESUME) {
                    j = new File(str, new StringBuilder(String.valueOf(replace)).append(".tmp").toString()).length();
                } else {
                    j = 0;
                }
                return C1014.f6149.f729.mo3655(replace, j, z, phVar);
            }
            long currentTimeMillis = System.currentTimeMillis() + 120000;
            while (System.currentTimeMillis() < currentTimeMillis && !C1014.f6149.f729.mo3654()) {
                try {
                    synchronized (Thread.currentThread()) {
                        Thread.currentThread().wait();
                    }
                } catch (InterruptedException unused) {
                }
            }
            throw new C0822tr("Failed to download resource: not connected to resource server", true);
        } else if (!z) {
            return null;
        } else {
            try {
                return C0622ot.m720(file.getAbsolutePath());
            } catch (FileNotFoundException e) {
                throw new C0588no((Exception) e);
            } catch (IOException e2) {
                throw new C0588no((Exception) e2);
            }
        }
    }

    C0248cl(C0453ix ixVar, C0415hp hpVar, String str, ArrayList<String> arrayList, boolean z) {
        this.f628 = str;
        this.f629 = z;
        String str2 = "Repacking resources";
        C0453ix ixVar2 = ixVar;
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar2));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar2, str2));
        m799(this.f628, "ddata", "ddata.grf", (C0813tl) C0524lh.m567());
        String[] strArr = new String[(arrayList.size() + 1)];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        strArr[strArr.length - 1] = "ddata.grf";
        String str3 = "Initializing file system";
        C0453ix ixVar3 = ixVar;
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar3));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar3, str3));
        this.f630 = new C1374(hpVar, strArr);
        String str4 = "Starting resource caching";
        C0453ix ixVar4 = ixVar;
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar4));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar4, str4));
        String[] r7 = this.f630.mo4324();
        for (int i2 = 0; i2 < r7.length; i2++) {
            String str5 = r7[i2];
            int i3 = i2;
            int length = r7.length;
            C0249cm cmVar = new C0249cm(this, true, ixVar, str5, i3, length);
            C0250cn cnVar = new C0250cn(this, true, ixVar, str5, i3, length);
            String str6 = "Reading " + str5;
            C0453ix ixVar5 = ixVar;
            if (ixVar.f1369 != null) {
                C1014.f6147.mo3387((Runnable) new C0473jm(ixVar5));
            }
            C1014.f6147.mo3387((Runnable) new C0469ji(ixVar5, str6, null, 0, -1));
            try {
                this.f630.mo4323(str5, C0835ua.m1537(new File(str, str5), cmVar), cnVar);
            } catch (FileNotFoundException unused) {
                this.f630.mo4323(str5, null, cnVar);
            }
        }
        String str7 = "Preparing GRF cache";
        C0453ix ixVar6 = ixVar;
        if (ixVar.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar6));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar6, str7));
        this.f630.mo4320();
        C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
    }
}

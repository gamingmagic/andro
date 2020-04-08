package p004o;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.zip.InflaterOutputStream;
import org.apache.commons.net.tftp.TFTP;

/* renamed from: o.do */
public final class C0280do extends C1428 {

    /* renamed from: ģ */
    static HashSet<String> f740 = new HashSet<>();

    /* renamed from: Ħ */
    private static final byte[] f741 = {55, -28, -66, -21, -5, 7, 8, -5, -2, 15, -1, 12, -5, 69, -70, 15, 5};

    /* renamed from: ħ */
    private static int f742 = 166;

    /* renamed from: Ē */
    C0281 f743 = C0281.FREE;

    /* renamed from: ē */
    byte[] f744;

    /* renamed from: Ė */
    String f745;

    /* renamed from: ė */
    boolean f746;

    /* renamed from: Ę */
    Thread f747;

    /* renamed from: ę */
    FileOutputStream f748;

    /* renamed from: ġ */
    long f749 = 0;

    /* renamed from: Ƞ */
    long f750 = 0;

    /* renamed from: ܨ */
    C1026 f751;

    /* renamed from: ঽ্ */
    OutputStream f752;

    /* renamed from: 㥳 */
    boolean f753;

    /* renamed from: 㱽 */
    C0658ph f754;

    /* renamed from: 㵼 */
    long f755;

    /* renamed from: 囃 */
    OutputStream f756;

    /* renamed from: 廂 */
    ByteArrayOutputStream f757;

    /* renamed from: 廅 */
    long f758;

    /* renamed from: 띥 */
    boolean f759;

    /* renamed from: o.do$鷭 */
    enum C0281 {
        FREE,
        REQUESTED,
        DOWNLOADING,
        NOTFOUND,
        CORRUPTED
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m301(int r6, int r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r4 = f741
            int r7 = r7 * 2
            int r7 = 14 - r7
            int r6 = r6 * 3
            int r6 = r6 + 99
            java.lang.String r0 = new java.lang.String
            r5 = 0
            byte[] r1 = new byte[r7]
            if (r4 != 0) goto L_0x001d
            r2 = r8
            r3 = r7
        L_0x0017:
            int r3 = -r3
            int r8 = r8 + 1
            int r2 = r2 + r3
            int r6 = r2 + 4
        L_0x001d:
            byte r2 = (byte) r6
            r1[r5] = r2
            int r5 = r5 + 1
            if (r5 != r7) goto L_0x0029
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        L_0x0029:
            r2 = r6
            byte r3 = r4[r8]
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0280do.m301(int, int, int):java.lang.String");
    }

    /* renamed from: ȃ */
    public final /* bridge */ /* synthetic */ void mo3649() {
        super.mo3649();
    }

    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo3387(Runnable runnable) {
        super.mo3387(runnable);
    }

    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo3652(C0839ue ueVar) {
        super.mo3652(ueVar);
    }

    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ boolean mo3654() {
        return super.mo3654();
    }

    C0280do(String str) {
        super(str, 400000, 0, 400000, TFTP.DEFAULT_TIMEOUT);
        C0178ae aeVar = new C0178ae();
        this.f7015 = aeVar;
        this.f7018.f4658 = aeVar;
    }

    static {
    }

    /* JADX INFO: used method not loaded: o.tr.<init>(java.lang.String):null, types can be incorrect */
    /* JADX INFO: used method not loaded: o.tr.<init>(java.lang.String, boolean):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:59|60|(3:99|62|63)(3:64|(1:69)(1:68)|(3:96|71|72)(2:73|(4:77|(1:79)(1:80)|81|82)(2:83|(3:97|85|(2:91|92)(2:93|94)))))) */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015f, code lost:
        if (super.mo3654() == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0175, code lost:
        throw new p004o.C0822tr("Disconnected while downloading " + r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0176, code lost:
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0183, code lost:
        if ((r12.f758 + 60000) >= java.lang.System.currentTimeMillis()) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0193, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0195, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0196, code lost:
        if (r0 != false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ad, code lost:
        throw new p004o.C0822tr("Timeout while downloading " + r13, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b2, code lost:
        if (r12.f743 == p004o.C0280do.C0281.f762) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ba, code lost:
        r11 = r12.f743;
        r12.f743 = p004o.C0280do.C0281.f765;
        f740.add(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c9, code lost:
        if (r11 == p004o.C0280do.C0281.f762) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cb, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01cd, code lost:
        r1 = "Resource data is corrupted";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d3, code lost:
        throw new p004o.C0825tu(null, r13, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01df, code lost:
        if (r16 != false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e3, code lost:
        return r12.f744;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e5, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015b */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo3655(java.lang.String r13, long r14, boolean r16, p004o.C0658ph r17) {
        /*
            r12 = this;
            java.util.HashSet<java.lang.String> r0 = f740
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L_0x0010
            o.tu r0 = new o.tu
            r1 = 0
            r2 = 0
            r0.<init>(r1, r13, r2)
            throw r0
        L_0x0010:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = r12.f1341
            if (r0 != r1) goto L_0x0020
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Cannot download resource from the resource-server download thread. Use another thread."
            r0.<init>(r1)
            throw r0
        L_0x0020:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r12.f747 = r0
            java.lang.Thread r9 = r12.f747
            monitor-enter(r9)
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = r0.f4468     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x0132
            r10 = r13
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = r0.f4469     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x0077
            o.hp r0 = p004o.C1014.f6160     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = "\\"
            java.lang.String r2 = "/"
            java.lang.String r11 = r10.replace(r1, r2)     // Catch:{ all -> 0x01dc }
            android.database.sqlite.SQLiteDatabase r0 = r0.f1210     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = "remote_filelist"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x01dc }
            java.lang.String r3 = "filename"
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x01dc }
            java.lang.String r3 = "filename=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x01dc }
            r5 = 0
            r4[r5] = r11     // Catch:{ all -> 0x01dc }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01dc }
            r11 = 0
            boolean r0 = r10.moveToFirst()     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x0068
            r0 = 0
            java.lang.String r11 = r10.getString(r0)     // Catch:{ all -> 0x01dc }
        L_0x0068:
            r10.close()     // Catch:{ all -> 0x01dc }
            r10 = r11
            if (r11 != 0) goto L_0x0077
            o.tu r0 = new o.tu     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = "Resource not exists on file server"
            r2 = 0
            r0.<init>(r2, r13, r1)     // Catch:{ all -> 0x01dc }
            throw r0     // Catch:{ all -> 0x01dc }
        L_0x0077:
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ all -> 0x01dc }
            boolean r0 = r0.f4491     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x008a
            o.op r0 = p004o.C0618op.UTF8     // Catch:{ all -> 0x01dc }
            r1 = 1
            byte[] r0 = p004o.C0622ot.m750(r13, r0, r1)     // Catch:{ all -> 0x01dc }
            o.op r1 = p004o.C0618op.LATIN     // Catch:{ all -> 0x01dc }
            java.lang.String r10 = p004o.C0622ot.m741(r0, r1)     // Catch:{ all -> 0x01dc }
        L_0x008a:
            java.lang.String r11 = r13.toLowerCase()     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = "\\"
            java.lang.String r1 = "/"
            java.lang.String r0 = r11.replace(r0, r1)     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = "data/"
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x00ad
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = "ddata/"
            r0.<init>(r1)     // Catch:{ all -> 0x01dc }
            java.lang.StringBuilder r0 = r0.append(r13)     // Catch:{ all -> 0x01dc }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x01dc }
        L_0x00ad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dc }
            o.pc$鷭 r1 = p004o.C1014.f6140     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = r1.f4468     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x01dc }
            r0.<init>(r1)     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x01dc }
            java.lang.StringBuilder r0 = r0.append(r10)     // Catch:{ all -> 0x01dc }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x01dc }
            r0 = r10
            java.io.File r1 = new java.io.File     // Catch:{ tu -> 0x0116 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ tu -> 0x0116 }
            java.lang.String r3 = p004o.C0595nv.f2869     // Catch:{ tu -> 0x0116 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ tu -> 0x0116 }
            r2.<init>(r3)     // Catch:{ tu -> 0x0116 }
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ tu -> 0x0116 }
            java.lang.StringBuilder r2 = r2.append(r13)     // Catch:{ tu -> 0x0116 }
            java.lang.String r2 = r2.toString()     // Catch:{ tu -> 0x0116 }
            r1.<init>(r2)     // Catch:{ tu -> 0x0116 }
            r2 = r16
            java.lang.String r3 = ".jpg"
            boolean r3 = r11.endsWith(r3)     // Catch:{ tu -> 0x0116 }
            if (r3 != 0) goto L_0x010b
            java.lang.String r3 = ".png"
            boolean r3 = r11.endsWith(r3)     // Catch:{ tu -> 0x0116 }
            if (r3 != 0) goto L_0x010b
            java.lang.String r3 = ".mp3"
            boolean r3 = r11.endsWith(r3)     // Catch:{ tu -> 0x0116 }
            if (r3 != 0) goto L_0x010b
            java.lang.String r3 = ".grf"
            boolean r3 = r11.endsWith(r3)     // Catch:{ tu -> 0x0116 }
            if (r3 != 0) goto L_0x010b
            r3 = 1
            goto L_0x010c
        L_0x010b:
            r3 = 0
        L_0x010c:
            o.pe$if r4 = p004o.C0653pe.C0654if.OVERWRITE     // Catch:{ tu -> 0x0116 }
            r5 = r17
            byte[] r0 = p004o.C0829ty.m1528(r0, r1, r2, r3, r4, r5)     // Catch:{ tu -> 0x0116 }
            monitor-exit(r9)     // Catch:{ all -> 0x01dc }
            return r0
        L_0x0116:
            r11 = move-exception
            o.mr r0 = p004o.C0595nv.f2879     // Catch:{ all -> 0x01dc }
            o.mr r1 = p004o.C0564mr.localclient     // Catch:{ all -> 0x01dc }
            if (r0 != r1) goto L_0x0132
            o.tu r0 = new o.tu     // Catch:{ all -> 0x01dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dc }
            java.lang.String r2 = "Failed to download resource from file server, URL="
            r1.<init>(r2)     // Catch:{ all -> 0x01dc }
            java.lang.StringBuilder r1 = r1.append(r10)     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01dc }
            r0.<init>(r11, r13, r1)     // Catch:{ all -> 0x01dc }
            throw r0     // Catch:{ all -> 0x01dc }
        L_0x0132:
            o.mr r0 = p004o.C0595nv.f2879     // Catch:{ all -> 0x01dc }
            o.mr r1 = p004o.C0564mr.localclient     // Catch:{ all -> 0x01dc }
            if (r0 != r1) goto L_0x0141
            o.tu r0 = new o.tu     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = "Resource not found locally. Remote download is not supported."
            r2 = 0
            r0.<init>(r2, r13, r1)     // Catch:{ all -> 0x01dc }
            throw r0     // Catch:{ all -> 0x01dc }
        L_0x0141:
            r0 = r17
            r12.f754 = r0     // Catch:{ all -> 0x01dc }
            r0 = r12
            r1 = r13
            r2 = r14
            r5 = r16
            r4 = 1
            r0.mo3651(r1, r2, r4, r5)     // Catch:{ all -> 0x01dc }
        L_0x014e:
            java.lang.Thread r0 = r12.f747     // Catch:{ InterruptedException -> 0x015b }
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.wait(r1)     // Catch:{ InterruptedException -> 0x015b }
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x015b }
            r0.<init>()     // Catch:{ InterruptedException -> 0x015b }
            throw r0     // Catch:{ InterruptedException -> 0x015b }
        L_0x015b:
            boolean r0 = super.mo3654()     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x0176
            o.tr r0 = new o.tr     // Catch:{ all -> 0x01dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dc }
            java.lang.String r2 = "Disconnected while downloading "
            r1.<init>(r2)     // Catch:{ all -> 0x01dc }
            java.lang.StringBuilder r1 = r1.append(r13)     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01dc }
            r0.<init>(r1)     // Catch:{ all -> 0x01dc }
            throw r0     // Catch:{ all -> 0x01dc }
        L_0x0176:
            r10 = r12
            long r0 = r12.f758     // Catch:{ all -> 0x01dc }
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 + r2
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01dc }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0195
            long r0 = r10.f755     // Catch:{ all -> 0x01dc }
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 + r2
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01dc }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0195
            r0 = 1
            goto L_0x0196
        L_0x0195:
            r0 = 0
        L_0x0196:
            if (r0 == 0) goto L_0x01ae
            o.tr r0 = new o.tr     // Catch:{ all -> 0x01dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dc }
            java.lang.String r2 = "Timeout while downloading "
            r1.<init>(r2)     // Catch:{ all -> 0x01dc }
            java.lang.StringBuilder r1 = r1.append(r13)     // Catch:{ all -> 0x01dc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01dc }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x01dc }
            throw r0     // Catch:{ all -> 0x01dc }
        L_0x01ae:
            o.do$鷭 r0 = r12.f743     // Catch:{ all -> 0x01dc }
            o.do$鷭 r1 = p004o.C0280do.C0281.NOTFOUND     // Catch:{ all -> 0x01dc }
            if (r0 == r1) goto L_0x01ba
            o.do$鷭 r0 = r12.f743     // Catch:{ all -> 0x01dc }
            o.do$鷭 r1 = p004o.C0280do.C0281.CORRUPTED     // Catch:{ all -> 0x01dc }
            if (r0 != r1) goto L_0x01d4
        L_0x01ba:
            o.do$鷭 r11 = r12.f743     // Catch:{ all -> 0x01dc }
            o.do$鷭 r0 = p004o.C0280do.C0281.FREE     // Catch:{ all -> 0x01dc }
            r12.f743 = r0     // Catch:{ all -> 0x01dc }
            java.util.HashSet<java.lang.String> r0 = f740     // Catch:{ all -> 0x01dc }
            r0.add(r13)     // Catch:{ all -> 0x01dc }
            o.tu r0 = new o.tu     // Catch:{ all -> 0x01dc }
            o.do$鷭 r1 = p004o.C0280do.C0281.NOTFOUND     // Catch:{ all -> 0x01dc }
            if (r11 != r1) goto L_0x01cd
            r1 = 0
            goto L_0x01cf
        L_0x01cd:
            java.lang.String r1 = "Resource data is corrupted"
        L_0x01cf:
            r2 = 0
            r0.<init>(r2, r13, r1)     // Catch:{ all -> 0x01dc }
            throw r0     // Catch:{ all -> 0x01dc }
        L_0x01d4:
            o.do$鷭 r0 = r12.f743     // Catch:{ all -> 0x01dc }
            o.do$鷭 r1 = p004o.C0280do.C0281.FREE     // Catch:{ all -> 0x01dc }
            if (r0 != r1) goto L_0x014e
            monitor-exit(r9)     // Catch:{ all -> 0x01dc }
            goto L_0x01df
        L_0x01dc:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01dc }
            throw r0
        L_0x01df:
            if (r16 == 0) goto L_0x01e4
            byte[] r0 = r12.f744
            return r0
        L_0x01e4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0280do.mo3655(java.lang.String, long, boolean, o.ph):byte[]");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3651(String str, long j, boolean z, boolean z2) {
        this.f755 = System.currentTimeMillis();
        this.f743 = C0281.REQUESTED;
        this.f753 = z2;
        this.f759 = z;
        if (z2 || z) {
            super.mo3652((C0839ue) new C0869vc(str, j));
            return;
        }
        throw new IllegalArgumentException("Downloading resource destination unspecified");
    }

    /* renamed from: ć */
    private void m300() {
        C0592ns.m674("Async during resource downloading :( Discarding previous resource: " + this.f745);
        if (this.f756 != null) {
            try {
                this.f756.flush();
            } catch (IOException unused) {
            }
            this.f756.close();
        }
        if (this.f748 != null) {
            this.f748.close();
        }
        if (this.f752 != null) {
            try {
                this.f752.flush();
            } catch (IOException unused2) {
            }
            this.f752.close();
        }
        if (this.f757 != null) {
            this.f757.close();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ą */
    public final void mo3647() {
        try {
            if (this.f743 != C0281.REQUESTED) {
                m300();
            }
            this.f743 = C0281.NOTFOUND;
            this.f745 = null;
            if (this.f747 != null) {
                Thread thread = this.f747;
                Thread thread2 = thread;
                synchronized (thread) {
                    this.f747 = null;
                    thread2.notify();
                }
            }
        } catch (IOException e) {
            throw new C0588no((Exception) e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3650(String str, long j, long j2, boolean z) {
        String str2;
        try {
            if (this.f743 != C0281.REQUESTED) {
                m300();
            }
            this.f745 = str;
            this.f749 = j;
            this.f750 = j2;
            this.f746 = false;
            int i = f741[10] + 1;
            if (this.f745.equals(m301(i, i, i))) {
                this.f759 = false;
                this.f753 = true;
            }
            if (this.f753) {
                if (j2 != 0) {
                    throw new C0588no("Resume is not supported for in-memory transfers.");
                }
                this.f757 = new ByteArrayOutputStream((int) j);
            }
            if (this.f759) {
                if (this.f745.toLowerCase().replace("\\", "/").startsWith("data/")) {
                    str2 = C0595nv.f2869 + "/ddata/" + this.f745 + ".tmp";
                } else {
                    str2 = C0595nv.f2869 + "/" + this.f745 + ".tmp";
                }
                C0622ot.m719(str2);
                if (new File(C0595nv.f2869).getFreeSpace() < j - j2) {
                    throw new C0822tr("Can't download " + str + ": no device space left, file system is full.", false);
                }
                File file = new File(str2);
                if (this.f750 == 0 || file.length() == j2) {
                    this.f748 = new FileOutputStream(file, j2 != 0);
                } else {
                    throw new C0588no("Unexpected file length. Filename=" + str + " size=" + j + " resume_point=" + j2);
                }
            }
            if (z) {
                if (this.f759) {
                    this.f756 = new InflaterOutputStream(this.f748);
                }
                if (this.f753) {
                    this.f752 = new InflaterOutputStream(this.f757);
                }
            } else {
                if (this.f759) {
                    this.f756 = this.f748;
                }
                if (this.f753) {
                    this.f752 = this.f757;
                }
            }
            this.f758 = System.currentTimeMillis();
            this.f743 = C0281.DOWNLOADING;
            if (this.f754 != null) {
                this.f754.mo3626(0, j);
            }
        } catch (FileNotFoundException e) {
            throw new C0588no((Exception) e);
        } catch (IOException e2) {
            throw new C0588no((Exception) e2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3653(byte[] bArr) {
        try {
            if (this.f743 != C0281.DOWNLOADING) {
                m300();
            }
            if (this.f759) {
                this.f756.write(bArr);
            }
            if (this.f753) {
                this.f752.write(bArr);
            }
        } catch (IOException unused) {
            this.f746 = true;
        }
        this.f758 = System.currentTimeMillis();
        this.f750 += (long) bArr.length;
        if (this.f754 != null) {
            this.f754.mo3626(this.f750, this.f749);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0024 A[Catch:{ IOException -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002d A[Catch:{ IOException -> 0x0116 }] */
    /* renamed from: ą */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3648() {
        /*
            r7 = this;
            o.do$鷭 r0 = r7.f743     // Catch:{ IOException -> 0x0116 }
            o.do$鷭 r1 = p004o.C0280do.C0281.DOWNLOADING     // Catch:{ IOException -> 0x0116 }
            if (r0 == r1) goto L_0x0009
            r7.m300()     // Catch:{ IOException -> 0x0116 }
        L_0x0009:
            boolean r0 = r7.f746     // Catch:{ IOException -> 0x0116 }
            if (r0 == 0) goto L_0x0037
            boolean r0 = r7.f759     // Catch:{ ZipException -> 0x0020 }
            if (r0 == 0) goto L_0x0016
            java.io.OutputStream r0 = r7.f756     // Catch:{ ZipException -> 0x0020 }
            r0.close()     // Catch:{ ZipException -> 0x0020 }
        L_0x0016:
            boolean r0 = r7.f753     // Catch:{ ZipException -> 0x0020 }
            if (r0 == 0) goto L_0x0020
            java.io.OutputStream r0 = r7.f752     // Catch:{ ZipException -> 0x0020 }
            r0.close()     // Catch:{ ZipException -> 0x0020 }
        L_0x0020:
            boolean r0 = r7.f759     // Catch:{ IOException -> 0x0116 }
            if (r0 == 0) goto L_0x0029
            java.io.FileOutputStream r0 = r7.f748     // Catch:{ IOException -> 0x0116 }
            r0.close()     // Catch:{ IOException -> 0x0116 }
        L_0x0029:
            boolean r0 = r7.f753     // Catch:{ IOException -> 0x0116 }
            if (r0 == 0) goto L_0x0032
            java.io.ByteArrayOutputStream r0 = r7.f757     // Catch:{ IOException -> 0x0116 }
            r0.close()     // Catch:{ IOException -> 0x0116 }
        L_0x0032:
            o.do$鷭 r0 = p004o.C0280do.C0281.CORRUPTED     // Catch:{ IOException -> 0x0116 }
            r7.f743 = r0     // Catch:{ IOException -> 0x0116 }
            return
        L_0x0037:
            boolean r0 = r7.f753     // Catch:{ IOException -> 0x0116 }
            if (r0 == 0) goto L_0x0043
            java.io.ByteArrayOutputStream r0 = r7.f757     // Catch:{ IOException -> 0x0116 }
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x0116 }
            r7.f744 = r0     // Catch:{ IOException -> 0x0116 }
        L_0x0043:
            boolean r0 = r7.f759     // Catch:{ IOException -> 0x0116 }
            if (r0 == 0) goto L_0x0051
            java.io.OutputStream r0 = r7.f756     // Catch:{ IOException -> 0x0116 }
            r0.close()     // Catch:{ IOException -> 0x0116 }
            java.io.FileOutputStream r0 = r7.f748     // Catch:{ IOException -> 0x0116 }
            r0.close()     // Catch:{ IOException -> 0x0116 }
        L_0x0051:
            boolean r0 = r7.f753     // Catch:{ IOException -> 0x0116 }
            if (r0 == 0) goto L_0x005f
            java.io.OutputStream r0 = r7.f752     // Catch:{ IOException -> 0x0116 }
            r0.close()     // Catch:{ IOException -> 0x0116 }
            java.io.ByteArrayOutputStream r0 = r7.f757     // Catch:{ IOException -> 0x0116 }
            r0.close()     // Catch:{ IOException -> 0x0116 }
        L_0x005f:
            boolean r0 = r7.f759     // Catch:{ IOException -> 0x0116 }
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = r7.f745     // Catch:{ IOException -> 0x0116 }
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = "\\"
            java.lang.String r2 = "/"
            java.lang.String r0 = r0.replace(r1, r2)     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = "data/"
            boolean r0 = r0.startsWith(r1)     // Catch:{ IOException -> 0x0116 }
            if (r0 == 0) goto L_0x0095
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = p004o.C0595nv.f2869     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0116 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = "/ddata/"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = r7.f745     // Catch:{ IOException -> 0x0116 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x0116 }
            java.lang.String r5 = r0.toString()     // Catch:{ IOException -> 0x0116 }
            goto L_0x00b0
        L_0x0095:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = p004o.C0595nv.f2869     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0116 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = r7.f745     // Catch:{ IOException -> 0x0116 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x0116 }
            java.lang.String r5 = r0.toString()     // Catch:{ IOException -> 0x0116 }
        L_0x00b0:
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0116 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0116 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = ".tmp"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x0116 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0116 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0116 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0116 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0116 }
            r5 = r0
            r0.delete()     // Catch:{ IOException -> 0x0116 }
            boolean r0 = r6.renameTo(r5)     // Catch:{ IOException -> 0x0116 }
            if (r0 != 0) goto L_0x00ee
            o.no r0 = new o.no     // Catch:{ IOException -> 0x0116 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0116 }
            java.lang.String r2 = "Failed to rename/move temp file after download: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x0116 }
            java.lang.String r2 = r7.f745     // Catch:{ IOException -> 0x0116 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x0116 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0116 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0116 }
            throw r0     // Catch:{ IOException -> 0x0116 }
        L_0x00ee:
            o.do$鷭 r0 = p004o.C0280do.C0281.FREE     // Catch:{ IOException -> 0x0116 }
            r7.f743 = r0     // Catch:{ IOException -> 0x0116 }
            r0 = 0
            r7.f745 = r0     // Catch:{ IOException -> 0x0116 }
            java.lang.Thread r0 = r7.f747     // Catch:{ IOException -> 0x0116 }
            if (r0 == 0) goto L_0x0108
            java.lang.Thread r6 = r7.f747     // Catch:{ IOException -> 0x0116 }
            r5 = r6
            monitor-enter(r6)     // Catch:{ IOException -> 0x0116 }
            r0 = 0
            r7.f747 = r0     // Catch:{ all -> 0x0105 }
            r5.notify()     // Catch:{ all -> 0x0105 }
            monitor-exit(r6)     // Catch:{ all -> 0x0105 }
            goto L_0x0108
        L_0x0105:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0105 }
            throw r0     // Catch:{ IOException -> 0x0116 }
        L_0x0108:
            o.ph r0 = r7.f754     // Catch:{ IOException -> 0x0116 }
            if (r0 == 0) goto L_0x011d
            o.ph r0 = r7.f754     // Catch:{ IOException -> 0x0116 }
            long r1 = r7.f749     // Catch:{ IOException -> 0x0116 }
            long r3 = r7.f749     // Catch:{ IOException -> 0x0116 }
            r0.mo3626(r1, r3)     // Catch:{ IOException -> 0x0116 }
            return
        L_0x0116:
            r5 = move-exception
            o.no r0 = new o.no
            r0.<init>(r5)
            throw r0
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0280do.mo3648():void");
    }
}

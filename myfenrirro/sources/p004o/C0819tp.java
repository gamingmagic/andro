package p004o;

/* renamed from: o.tp */
public final class C0819tp extends C0811tk {

    /* renamed from: o.tp$鷭 */
    class C0820 {

        /* renamed from: Ą */
        int f5002;

        /* renamed from: ą */
        int f5003;

        /* renamed from: ȃ */
        byte f5005;

        /* renamed from: ˮ͈ */
        int f5006;

        /* renamed from: 櫯 */
        byte[] f5007;

        /* renamed from: 鷭 */
        String f5008;

        C0820(C0614ol olVar, short s) {
            if (s == 48) {
                this.f5007 = olVar.mo4040(C0622ot.m730(olVar.mo4032()));
                this.f5005 = olVar.mo4032();
                if (this.f5005 == 0) {
                    this.f5006 = olVar.mo4034();
                    this.f5002 = olVar.mo4034();
                    this.f5003 = olVar.mo4034();
                }
            } else if (s == 33) {
                this.f5002 = olVar.mo4034();
                this.f5003 = olVar.mo4034();
                this.f5007 = olVar.mo4040((int) olVar.mo4032());
                this.f5005 = 0;
                this.f5006 = (int) olVar.f2999;
            }
            this.f5008 = C0622ot.m741(this.f5007, C0618op.KOREAN);
            if (this.f5005 == 0) {
                C0624ov.m756();
            } else {
                C0624ov.m756();
            }
        }
    }

    public C0819tp(String str, C0524lh lhVar) {
        super(str, lhVar);
    }

    /* JADX WARNING: type inference failed for: r26v1 */
    /* JADX WARNING: type inference failed for: r0v133 */
    /* JADX WARNING: type inference failed for: r0v140, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v143, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r0v144, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r0v149, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r0v296, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r0v297, types: [java.io.FileOutputStream] */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        p004o.C0624ov.m756();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0166, code lost:
        r18 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        p004o.C0624ov.m756();
        p004o.C0624ov.m759("Failed to extract local client version, defaulting to 0. " + r18.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x014d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0056 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v296, types: [java.io.ByteArrayOutputStream]
      assigns: [java.io.ByteArrayOutputStream, java.io.FileOutputStream]
      uses: [java.io.ByteArrayOutputStream, ?[OBJECT, ARRAY], java.io.FileOutputStream]
      mth insns count: 931
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01f1 A[Catch:{ tu -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0206 A[Catch:{ tu -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x007f A[Catch:{ tu -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x00ab A[Catch:{ tu -> 0x020a }] */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4114(p004o.C0643pc.C0650.C0651 r29) {
        /*
            r28 = this;
            r0 = r28
            o.tl r0 = r0.f4986
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Checking client updates at "
            r1.<init>(r2)
            r2 = r29
            java.lang.String r2 = r2.f4536
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo3957(r1)
            p004o.C0624ov.m756()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r29
            java.lang.String r1 = r1.f4532
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = ".andro.txt"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r6 = r0.toString()
            r7 = 0
            p004o.C0624ov.m756()     // Catch:{ tu -> 0x0056 }
            r0 = r28
            java.lang.String r0 = r0.f4987     // Catch:{ tu -> 0x0056 }
            r1 = r28
            o.tl r1 = r1.f4986     // Catch:{ tu -> 0x0056 }
            r2 = 0
            java.lang.Object r0 = p004o.C0653pe.m796(r0, r6, r2, r1)     // Catch:{ tu -> 0x0056 }
            byte[] r0 = (byte[]) r0     // Catch:{ tu -> 0x0056 }
            o.op r1 = p004o.C0618op.LATIN     // Catch:{ tu -> 0x0056 }
            java.lang.String r0 = p004o.C0622ot.m741(r0, r1)     // Catch:{ tu -> 0x0056 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ tu -> 0x0056 }
            p004o.C0624ov.m756()     // Catch:{ tu -> 0x0056 }
            goto L_0x020e
        L_0x0056:
            p004o.C0624ov.m756()     // Catch:{ tu -> 0x020a }
            r0 = r28
            java.lang.String r0 = r0.f4987     // Catch:{ tu -> 0x020a }
            r1 = r29
            java.lang.String r1 = r1.f4532     // Catch:{ tu -> 0x020a }
            r2 = r28
            o.tl r2 = r2.f4986     // Catch:{ tu -> 0x020a }
            r3 = 0
            java.lang.Object r0 = p004o.C0653pe.m796(r0, r1, r3, r2)     // Catch:{ tu -> 0x020a }
            byte[] r0 = (byte[]) r0     // Catch:{ tu -> 0x020a }
            r10 = r0
            java.lang.String r11 = "SQLite format 3"
            int r0 = r11.length()     // Catch:{ tu -> 0x020a }
            o.op r1 = p004o.C0618op.LATIN     // Catch:{ tu -> 0x020a }
            java.lang.String r0 = p004o.C0622ot.m739(r10, r0, r1)     // Catch:{ tu -> 0x020a }
            boolean r0 = r0.equals(r11)     // Catch:{ tu -> 0x020a }
            if (r0 == 0) goto L_0x00ab
            p004o.C0624ov.m756()     // Catch:{ tu -> 0x020a }
            r0 = r28
            o.tl r0 = r0.f4986     // Catch:{ tu -> 0x020a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ tu -> 0x020a }
            r2 = r28
            java.lang.String r2 = r2.f4987     // Catch:{ tu -> 0x020a }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ tu -> 0x020a }
            r1.<init>(r2)     // Catch:{ tu -> 0x020a }
            java.lang.String r2 = java.io.File.separator     // Catch:{ tu -> 0x020a }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ tu -> 0x020a }
            r2 = r29
            java.lang.String r2 = r2.f4532     // Catch:{ tu -> 0x020a }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ tu -> 0x020a }
            java.lang.String r1 = r1.toString()     // Catch:{ tu -> 0x020a }
            int r8 = r0.mo3955(r1)     // Catch:{ tu -> 0x020a }
            goto L_0x01ef
        L_0x00ab:
            p004o.C0624ov.m756()     // Catch:{ tu -> 0x020a }
            java.nio.ByteBuffer r27 = java.nio.ByteBuffer.wrap(r10)     // Catch:{ tu -> 0x020a }
            r12 = r27
            r0 = 3
            byte[] r0 = new byte[r0]     // Catch:{ tu -> 0x020a }
            r19 = r0
            r0 = r27
            r1 = r19
            r0.get(r1)     // Catch:{ tu -> 0x020a }
            r13 = r19
            r0 = 0
            byte r0 = r19[r0]     // Catch:{ tu -> 0x020a }
            r1 = 31
            if (r0 != r1) goto L_0x00d7
            r0 = 1
            byte r0 = r13[r0]     // Catch:{ tu -> 0x020a }
            r1 = -117(0xffffffffffffff8b, float:NaN)
            if (r0 != r1) goto L_0x00d7
            r0 = 2
            byte r0 = r13[r0]     // Catch:{ tu -> 0x020a }
            r1 = 8
            if (r0 == r1) goto L_0x00df
        L_0x00d7:
            o.tr r0 = new o.tr     // Catch:{ tu -> 0x020a }
            java.lang.String r1 = "Invalid client version format (1)"
            r0.<init>(r1)     // Catch:{ tu -> 0x020a }
            throw r0     // Catch:{ tu -> 0x020a }
        L_0x00df:
            r12.get()     // Catch:{ tu -> 0x020a }
            r27 = r12
            r0 = 6
            byte[] r0 = new byte[r0]     // Catch:{ tu -> 0x020a }
            r19 = r0
            r0 = r27
            r1 = r19
            r0.get(r1)     // Catch:{ tu -> 0x020a }
            int r0 = r10.length     // Catch:{ tu -> 0x020a }
            int r1 = r12.position()     // Catch:{ tu -> 0x020a }
            int r18 = r0 - r1
            r27 = r12
            r0 = r18
            byte[] r0 = new byte[r0]     // Catch:{ tu -> 0x020a }
            r19 = r0
            r0 = r27
            r1 = r19
            r0.get(r1)     // Catch:{ tu -> 0x020a }
            r15 = r19
            r0 = 2
            byte[] r0 = new byte[r0]     // Catch:{ tu -> 0x020a }
            r16 = r0
            r16 = {120, -100} // fill-array     // Catch:{ tu -> 0x020a }
            r0 = 0
            byte r0 = r15[r0]     // Catch:{ tu -> 0x020a }
            r1 = 0
            byte r1 = r16[r1]     // Catch:{ tu -> 0x020a }
            if (r0 == r1) goto L_0x0126
            r0 = 1
            byte r0 = r15[r0]     // Catch:{ tu -> 0x020a }
            r1 = 1
            byte r1 = r16[r1]     // Catch:{ tu -> 0x020a }
            if (r0 == r1) goto L_0x0126
            r0 = r16
            byte[] r15 = p004o.C0619oq.m711(r0, r15)     // Catch:{ tu -> 0x020a }
        L_0x0126:
            java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream     // Catch:{ tu -> 0x020a }
            r10.<init>(r15)     // Catch:{ tu -> 0x020a }
            java.util.zip.InflaterInputStream r19 = new java.util.zip.InflaterInputStream     // Catch:{ tu -> 0x020a }
            r0 = r19
            r0.<init>(r10)     // Catch:{ tu -> 0x020a }
            java.io.ByteArrayOutputStream r20 = new java.io.ByteArrayOutputStream     // Catch:{ tu -> 0x020a }
            r0 = r20
            r1 = 23
            r0.<init>(r1)     // Catch:{ tu -> 0x020a }
            r17 = 0
            goto L_0x0143
        L_0x013e:
            r0 = r20
            r0.write(r11)     // Catch:{ IOException -> 0x014d }
        L_0x0143:
            r0 = r19
            int r11 = r0.read()     // Catch:{ IOException -> 0x014d }
            r0 = -1
            if (r11 != r0) goto L_0x013e
            goto L_0x0150
        L_0x014d:
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x0166 }
        L_0x0150:
            r0 = r20
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x0166 }
            r17 = r0
            r0 = r20
            r0.close()     // Catch:{ IOException -> 0x0166 }
            r0 = r19
            r0.close()     // Catch:{ IOException -> 0x0166 }
            r10.close()     // Catch:{ IOException -> 0x0166 }
            goto L_0x0182
        L_0x0166:
            r18 = move-exception
            p004o.C0624ov.m756()     // Catch:{ tu -> 0x020a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ tu -> 0x020a }
            java.lang.String r1 = "Failed to extract local client version, defaulting to 0. "
            r0.<init>(r1)     // Catch:{ tu -> 0x020a }
            r1 = r18
            java.lang.String r1 = r1.toString()     // Catch:{ tu -> 0x020a }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ tu -> 0x020a }
            java.lang.String r0 = r0.toString()     // Catch:{ tu -> 0x020a }
            p004o.C0624ov.m759(r0)     // Catch:{ tu -> 0x020a }
        L_0x0182:
            r8 = 0
            java.lang.String r0 = "patch_id"
            o.op r1 = p004o.C0618op.LATIN     // Catch:{ tu -> 0x020a }
            r2 = 0
            byte[] r18 = p004o.C0622ot.m750(r0, r1, r2)     // Catch:{ tu -> 0x020a }
            if (r17 == 0) goto L_0x019f
            r0 = r17
            int r0 = r0.length     // Catch:{ tu -> 0x020a }
            r1 = r18
            int r1 = r1.length     // Catch:{ tu -> 0x020a }
            int r1 = r1 + 4
            if (r0 >= r1) goto L_0x019f
            java.lang.String r0 = "extracted zip block is too small"
            p004o.C0624ov.m759(r0)     // Catch:{ tu -> 0x020a }
            goto L_0x01ef
        L_0x019f:
            if (r17 == 0) goto L_0x01ef
            p004o.C0624ov.m756()     // Catch:{ tu -> 0x020a }
            r19 = -1
            r21 = 0
            goto L_0x01c9
        L_0x01a9:
            r22 = 0
            goto L_0x01b6
        L_0x01ac:
            int r0 = r21 + r22
            byte r0 = r17[r0]     // Catch:{ tu -> 0x020a }
            byte r1 = r18[r22]     // Catch:{ tu -> 0x020a }
            if (r0 != r1) goto L_0x01bd
            int r22 = r22 + 1
        L_0x01b6:
            r0 = r18
            int r0 = r0.length     // Catch:{ tu -> 0x020a }
            r1 = r22
            if (r1 < r0) goto L_0x01ac
        L_0x01bd:
            r0 = r18
            int r0 = r0.length     // Catch:{ tu -> 0x020a }
            r1 = r22
            if (r1 != r0) goto L_0x01c7
            r19 = r21
            goto L_0x01d4
        L_0x01c7:
            int r21 = r21 + 1
        L_0x01c9:
            r0 = r17
            int r0 = r0.length     // Catch:{ tu -> 0x020a }
            r1 = r18
            int r1 = r1.length     // Catch:{ tu -> 0x020a }
            int r0 = r0 - r1
            r1 = r21
            if (r1 < r0) goto L_0x01a9
        L_0x01d4:
            if (r19 >= 0) goto L_0x01da
            p004o.C0624ov.m756()     // Catch:{ tu -> 0x020a }
            goto L_0x01ef
        L_0x01da:
            r0 = r17
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ tu -> 0x020a }
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ tu -> 0x020a }
            java.nio.ByteBuffer r0 = r0.order(r1)     // Catch:{ tu -> 0x020a }
            r1 = r18
            int r1 = r1.length     // Catch:{ tu -> 0x020a }
            int r1 = r19 + r1
            int r8 = r0.getInt(r1)     // Catch:{ tu -> 0x020a }
        L_0x01ef:
            if (r8 >= 0) goto L_0x0206
            o.tv r0 = new o.tv     // Catch:{ tu -> 0x020a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ tu -> 0x020a }
            java.lang.String r2 = "Bad local client version "
            r1.<init>(r2)     // Catch:{ tu -> 0x020a }
            java.lang.StringBuilder r1 = r1.append(r8)     // Catch:{ tu -> 0x020a }
            java.lang.String r1 = r1.toString()     // Catch:{ tu -> 0x020a }
            r0.<init>(r1)     // Catch:{ tu -> 0x020a }
            throw r0     // Catch:{ tu -> 0x020a }
        L_0x0206:
            p004o.C0624ov.m756()     // Catch:{ tu -> 0x020a }
            goto L_0x020e
        L_0x020a:
            p004o.C0624ov.m756()
            r8 = 0
        L_0x020e:
            p004o.C0624ov.m756()
            r0 = r29
            java.lang.String r0 = r0.f4536
            r1 = r29
            java.lang.String r1 = r1.f4536
            r2 = 47
            int r1 = r1.lastIndexOf(r2)
            int r1 = r1 + 1
            java.lang.String r9 = r0.substring(r1)
            r0 = r29
            java.lang.String r0 = r0.f4536     // Catch:{ tu -> 0x0259 }
            java.io.File r1 = new java.io.File     // Catch:{ tu -> 0x0259 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ tu -> 0x0259 }
            r3 = r28
            java.lang.String r3 = r3.f4987     // Catch:{ tu -> 0x0259 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ tu -> 0x0259 }
            r2.<init>(r3)     // Catch:{ tu -> 0x0259 }
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ tu -> 0x0259 }
            java.lang.StringBuilder r2 = r2.append(r9)     // Catch:{ tu -> 0x0259 }
            java.lang.String r2 = r2.toString()     // Catch:{ tu -> 0x0259 }
            r1.<init>(r2)     // Catch:{ tu -> 0x0259 }
            o.pe$if r4 = p004o.C0653pe.C0654if.OVERWRITE     // Catch:{ tu -> 0x0259 }
            r2 = 1
            r3 = 1
            r5 = 0
            byte[] r0 = p004o.C0829ty.m1528(r0, r1, r2, r3, r4, r5)     // Catch:{ tu -> 0x0259 }
            o.op r1 = p004o.C0618op.LATIN     // Catch:{ tu -> 0x0259 }
            java.lang.String r10 = p004o.C0622ot.m741(r0, r1)     // Catch:{ tu -> 0x0259 }
            goto L_0x0260
        L_0x0259:
            r11 = move-exception
            o.tr r0 = new o.tr
            r0.<init>(r11)
            throw r0
        L_0x0260:
            r11 = 0
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.String r0 = "\n"
            java.lang.String[] r13 = r10.split(r0)     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            r11 = 0
            goto L_0x02be
        L_0x026f:
            r10 = r13[r11]     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            java.lang.String r0 = "//"
            int r14 = r10.indexOf(r0)     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            if (r14 < 0) goto L_0x027e
            r0 = 0
            java.lang.String r10 = r10.substring(r0, r14)     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
        L_0x027e:
            java.lang.String r0 = r10.trim()     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            java.lang.String r1 = "\r"
            java.lang.String r2 = ""
            java.lang.String r10 = r0.replace(r1, r2)     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            int r0 = r10.length()     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            if (r0 <= 0) goto L_0x02bc
            p004o.C0624ov.m756()     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            java.util.Scanner r15 = new java.util.Scanner     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            r15.<init>(r10)     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            int r16 = r15.nextInt()     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            java.lang.String r0 = "[ \t]"
            r15.skip(r0)     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            java.lang.String r10 = r15.next()     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            r15.close()     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            r0 = r16
            int r7 = java.lang.Math.max(r7, r0)     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            r0 = r16
            if (r8 >= r0) goto L_0x02b9
            java.lang.String r0 = r10.trim()     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            r12.add(r0)     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
        L_0x02b9:
            p004o.C0624ov.m756()     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
        L_0x02bc:
            int r11 = r11 + 1
        L_0x02be:
            int r0 = r13.length     // Catch:{ InputMismatchException -> 0x02c2, NoSuchElementException -> 0x02da }
            if (r11 < r0) goto L_0x026f
            goto L_0x02f2
        L_0x02c2:
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Patch list error 1 at line "
            r1.<init>(r2)
            int r2 = r11 + 1
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            r0.<init>(r1, r2)
            throw r0
        L_0x02da:
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Patch list error 2 at line "
            r1.<init>(r2)
            int r2 = r11 + 1
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            r0.<init>(r1, r2)
            throw r0
        L_0x02f2:
            p004o.C0624ov.m756()
            r0 = r28
            o.tl r0 = r0.f4986
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Checking client updates at "
            r1.<init>(r2)
            r2 = r29
            java.lang.String r2 = r2.f4536
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo3957(r1)
            r13 = 0
            goto L_0x0398
        L_0x0312:
            java.lang.Object r0 = r12.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            p004o.C0624ov.m756()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r29
            java.lang.String r1 = r1.f4535
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r14 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Processing update files\n["
            r0.<init>(r1)
            int r1 = r13 + 1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r12.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "] "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r15 = r0.toString()
            r0 = r28
            o.tl r0 = r0.f4986
            r0.mo3957(r15)
            r0 = r14
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r28
            java.lang.String r3 = r3.f4987
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            o.pe$if r4 = p004o.C0653pe.C0654if.SKIP
            o.tk$鷭 r5 = new o.tk$鷭
            r2 = r28
            r5.<init>(r15)
            r2 = 0
            r3 = 0
            p004o.C0829ty.m1528(r0, r1, r2, r3, r4, r5)
            int r13 = r13 + 1
        L_0x0398:
            int r0 = r12.size()
            if (r13 < r0) goto L_0x0312
            p004o.C0624ov.m756()
            r0 = 500000(0x7a120, float:7.00649E-40)
            byte[] r13 = new byte[r0]
            r10 = 0
            r14 = 0
            goto L_0x0975
        L_0x03aa:
            java.lang.Object r0 = r12.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            r15 = r0
            p004o.C0624ov.m756()
            r0 = r28
            o.tl r0 = r0.f4986
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Processing update files\n["
            r1.<init>(r2)
            int r2 = r14 + 1
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r12.size()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "] "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r15)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo3957(r1)
            r0 = r28
            java.lang.String r0 = r0.f4987
            r1 = 0
            o.pe$鷭 r18 = p004o.C0653pe.m798(r0, r15, r1)
            if (r18 != 0) goto L_0x03f8
            r16 = 0
            goto L_0x03fe
        L_0x03f8:
            r0 = r18
            o.ol r0 = r0.f4547
            r16 = r0
        L_0x03fe:
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            r0 = r16
            r1 = 24
            byte[] r19 = r0.mo4040(r1)     // Catch:{ IOException -> 0x093d }
            o.op r0 = p004o.C0618op.LATIN     // Catch:{ IOException -> 0x093d }
            r1 = r19
            java.lang.String r0 = p004o.C0622ot.m741(r1, r0)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = "ASSF (C) 2007 Aeomin DEV"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x093d }
            if (r0 == 0) goto L_0x07e1
            r0 = r16
            byte r20 = r0.mo4032()     // Catch:{ IOException -> 0x093d }
            r0 = r16
            int r11 = r0.mo4034()     // Catch:{ IOException -> 0x093d }
            r0 = r16
            short r22 = r0.mo4033()     // Catch:{ IOException -> 0x093d }
            r23 = 0
            r0 = r22
            r1 = 33
            if (r0 == r1) goto L_0x045e
            r0 = r22
            r1 = 48
            if (r0 == r1) goto L_0x045e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = "Unexpected .thor file version "
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            r1 = r22
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r17 = r0.toString()     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = "THOR: "
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            r1 = r17
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x093d }
            p004o.C0624ov.m759(r0)     // Catch:{ IOException -> 0x093d }
        L_0x045e:
            r0 = r16
            byte r17 = r0.mo4032()     // Catch:{ IOException -> 0x093d }
            r0 = r16
            r1 = r17
            byte[] r18 = r0.mo4040(r1)     // Catch:{ IOException -> 0x093d }
            r0 = r22
            r1 = 48
            if (r0 != r1) goto L_0x054e
            r0 = r16
            int r19 = r0.mo4034()     // Catch:{ IOException -> 0x093d }
            r0 = r16
            int r21 = r0.mo4034()     // Catch:{ IOException -> 0x093d }
            if (r17 <= 0) goto L_0x04ac
            o.op r0 = p004o.C0618op.LOCAL     // Catch:{ IOException -> 0x093d }
            r1 = r18
            java.lang.String r23 = p004o.C0622ot.m741(r1, r0)     // Catch:{ IOException -> 0x093d }
            r0 = r23
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = ".grf"
            boolean r0 = r0.endsWith(r1)     // Catch:{ IOException -> 0x093d }
            if (r0 != 0) goto L_0x04b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            r1 = r23
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x093d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = ".grf"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r23 = r0.toString()     // Catch:{ IOException -> 0x093d }
            goto L_0x04b2
        L_0x04ac:
            r0 = r29
            java.lang.String r0 = r0.f4534     // Catch:{ IOException -> 0x093d }
            r23 = r0
        L_0x04b2:
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            r0 = r16
            long r0 = r0.f2999     // Catch:{ IOException -> 0x093d }
            int r0 = (int) r0     // Catch:{ IOException -> 0x093d }
            int r0 = r21 - r0
            r1 = r16
            r1.mo4035(r0)     // Catch:{ IOException -> 0x093d }
            r0 = r16
            r1 = r19
            byte[] r24 = r0.mo4040(r1)     // Catch:{ IOException -> 0x093d }
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            java.io.ByteArrayInputStream r25 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x093d }
            r0 = r25
            r1 = r24
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            java.util.zip.InflaterInputStream r19 = new java.util.zip.InflaterInputStream     // Catch:{ IOException -> 0x093d }
            r0 = r19
            r1 = r25
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            java.io.ByteArrayOutputStream r21 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x093d }
            r0 = r21
            r0.<init>()     // Catch:{ IOException -> 0x093d }
            goto L_0x04ee
        L_0x04e6:
            r0 = r21
            r1 = 0
            r2 = r18
            r0.write(r13, r1, r2)     // Catch:{ IOException -> 0x093d }
        L_0x04ee:
            int r0 = r13.length     // Catch:{ IOException -> 0x093d }
            r1 = r19
            r2 = 0
            int r18 = r1.read(r13, r2, r0)     // Catch:{ IOException -> 0x093d }
            r0 = r18
            r1 = -1
            if (r0 != r1) goto L_0x04e6
            r0 = r19
            r0.close()     // Catch:{ IOException -> 0x093d }
            r0 = r25
            r0.close()     // Catch:{ IOException -> 0x093d }
            r27 = r16
            r0 = r16
            java.io.InputStream r0 = r0.f3001     // Catch:{ IOException -> 0x093d }
            r0.close()     // Catch:{ IOException -> 0x093d }
            r0 = 0
            r1 = r27
            r1.f3001 = r0     // Catch:{ IOException -> 0x093d }
            r0 = r21
            byte[] r26 = r0.toByteArray()     // Catch:{ IOException -> 0x093d }
            r0 = r21
            r0.close()     // Catch:{ IOException -> 0x093d }
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            o.tp$鷭[] r0 = new p004o.C0819tp.C0820[r11]     // Catch:{ IOException -> 0x093d }
            r17 = r0
            java.io.ByteArrayInputStream r25 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x093d }
            r0 = r25
            r1 = r26
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            o.ol r0 = new o.ol     // Catch:{ IOException -> 0x093d }
            r1 = r25
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            r16 = r0
            r21 = 0
            goto L_0x0549
        L_0x053a:
            o.tp$鷭 r0 = new o.tp$鷭     // Catch:{ IOException -> 0x093d }
            r1 = r28
            r2 = r16
            r3 = r22
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x093d }
            r17[r21] = r0     // Catch:{ IOException -> 0x093d }
            int r21 = r21 + 1
        L_0x0549:
            r0 = r21
            if (r0 < r11) goto L_0x053a
            goto L_0x0569
        L_0x054e:
            r0 = r16
            r0.mo4032()     // Catch:{ IOException -> 0x093d }
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            r0 = 1
            o.tp$鷭[] r0 = new p004o.C0819tp.C0820[r0]     // Catch:{ IOException -> 0x093d }
            r17 = r0
            o.tp$鷭 r0 = new o.tp$鷭     // Catch:{ IOException -> 0x093d }
            r1 = r28
            r2 = r16
            r3 = r22
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x093d }
            r1 = 0
            r17[r1] = r0     // Catch:{ IOException -> 0x093d }
        L_0x0569:
            r27 = r16
            r0 = r16
            java.io.InputStream r0 = r0.f3001     // Catch:{ IOException -> 0x093d }
            r0.close()     // Catch:{ IOException -> 0x093d }
            r0 = 0
            r1 = r27
            r1.f3001 = r0     // Catch:{ IOException -> 0x093d }
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            r24 = 0
            goto L_0x07db
        L_0x057e:
            r25 = r17[r24]     // Catch:{ IOException -> 0x093d }
            r0 = r28
            o.tl r0 = r0.f4986     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "Processing update files\n["
            r1.<init>(r2)     // Catch:{ IOException -> 0x093d }
            int r2 = r14 + 1
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            int r2 = r12.size()     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "] ["
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            int r2 = r24 + 1
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r11)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "] "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r15)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x093d }
            r0.mo3957(r1)     // Catch:{ IOException -> 0x093d }
            r0 = r20
            r1 = 1
            if (r0 != r1) goto L_0x0628
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            if (r10 == 0) goto L_0x05de
            r0 = r23
            boolean r0 = r0.equals(r10)     // Catch:{ IOException -> 0x093d }
            if (r0 != 0) goto L_0x0628
        L_0x05de:
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            if (r10 == 0) goto L_0x05e8
            o.st r0 = p004o.C0653pe.f4541     // Catch:{ IOException -> 0x093d }
            r0.mo4088()     // Catch:{ IOException -> 0x093d }
        L_0x05e8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            r1 = r28
            java.lang.String r1 = r1.f4987     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x093d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x093d }
            r1 = r23
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r26 = r0.toString()     // Catch:{ IOException -> 0x093d }
            o.st r0 = p004o.C0653pe.f4541     // Catch:{ IOException -> 0x093d }
            r1 = r26
            boolean r0 = r0.mo4084(r1)     // Catch:{ IOException -> 0x093d }
            if (r0 != 0) goto L_0x0626
            o.tr r0 = new o.tr     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "Failed to open GRF: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x093d }
            r2 = r26
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x093d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            throw r0     // Catch:{ IOException -> 0x093d }
        L_0x0626:
            r10 = r23
        L_0x0628:
            r0 = r25
            byte r0 = r0.f5005     // Catch:{ IOException -> 0x093d }
            if (r0 != 0) goto L_0x077a
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            r0 = r28
            java.lang.String r0 = r0.f4987     // Catch:{ IOException -> 0x093d }
            r27 = r0
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x093d }
            r1 = r27
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            long r0 = r0.getFreeSpace()     // Catch:{ IOException -> 0x093d }
            r2 = r25
            int r2 = r2.f5003     // Catch:{ IOException -> 0x093d }
            r3 = 1000000(0xf4240, float:1.401298E-39)
            int r2 = r2 + r3
            long r2 = (long) r2     // Catch:{ IOException -> 0x093d }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x066a
            o.tr r0 = new o.tr     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "Can't merge "
            r1.<init>(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r15)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = ": no device space left."
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x093d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            throw r0     // Catch:{ IOException -> 0x093d }
        L_0x066a:
            r0 = r28
            java.lang.String r0 = r0.f4987     // Catch:{ IOException -> 0x093d }
            r1 = 0
            o.pe$鷭 r18 = p004o.C0653pe.m798(r0, r15, r1)     // Catch:{ IOException -> 0x093d }
            if (r18 != 0) goto L_0x0677
            r0 = 0
            goto L_0x067b
        L_0x0677:
            r0 = r18
            o.ol r0 = r0.f4547     // Catch:{ IOException -> 0x093d }
        L_0x067b:
            r16 = r0
            r1 = r25
            int r1 = r1.f5006     // Catch:{ IOException -> 0x093d }
            r0.mo4035(r1)     // Catch:{ IOException -> 0x093d }
            java.util.zip.InflaterInputStream r19 = new java.util.zip.InflaterInputStream     // Catch:{ IOException -> 0x093d }
            r0 = r16
            java.io.InputStream r0 = r0.f3001     // Catch:{ IOException -> 0x093d }
            r1 = r19
            r1.<init>(r0)     // Catch:{ IOException -> 0x093d }
            if (r20 != 0) goto L_0x06ca
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            r1 = r28
            java.lang.String r1 = r1.f4987     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x093d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = java.io.File.separator     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x093d }
            r1 = r25
            java.lang.String r1 = r1.f5008     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "\\"
            java.lang.String r3 = java.io.File.separator     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r21 = r0.toString()     // Catch:{ IOException -> 0x093d }
            r0 = r21
            p004o.C0622ot.m719(r0)     // Catch:{ IOException -> 0x093d }
            java.io.FileOutputStream r26 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x093d }
            r0 = r26
            r1 = r21
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            goto L_0x06d4
        L_0x06ca:
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            java.io.ByteArrayOutputStream r26 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x093d }
            r0 = r26
            r0.<init>()     // Catch:{ IOException -> 0x093d }
        L_0x06d4:
            r21 = 0
            goto L_0x06e1
        L_0x06d7:
            r0 = r26
            r1 = 0
            r2 = r18
            r0.write(r13, r1, r2)     // Catch:{ IOException -> 0x093d }
            int r21 = r21 + r18
        L_0x06e1:
            int r0 = r13.length     // Catch:{ IOException -> 0x093d }
            r1 = r25
            int r1 = r1.f5003     // Catch:{ IOException -> 0x093d }
            int r1 = r1 - r21
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ IOException -> 0x093d }
            r1 = r19
            r2 = 0
            int r18 = r1.read(r13, r2, r0)     // Catch:{ IOException -> 0x093d }
            r0 = r18
            r1 = -1
            if (r0 == r1) goto L_0x0700
            r0 = r25
            int r0 = r0.f5003     // Catch:{ IOException -> 0x093d }
            r1 = r21
            if (r1 < r0) goto L_0x06d7
        L_0x0700:
            r0 = r19
            r0.close()     // Catch:{ IOException -> 0x093d }
            r27 = r16
            r0 = r16
            java.io.InputStream r0 = r0.f3001     // Catch:{ IOException -> 0x093d }
            r0.close()     // Catch:{ IOException -> 0x093d }
            r0 = 0
            r1 = r27
            r1.f3001 = r0     // Catch:{ IOException -> 0x093d }
            if (r20 != 0) goto L_0x071c
            r0 = r26
            r0.close()     // Catch:{ IOException -> 0x093d }
            goto L_0x07d9
        L_0x071c:
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            r0 = r26
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch:{ IOException -> 0x093d }
            r21 = r0
            r0 = r21
            byte[] r18 = r0.toByteArray()     // Catch:{ IOException -> 0x093d }
            r0 = r21
            r0.close()     // Catch:{ IOException -> 0x093d }
            o.st r0 = p004o.C0653pe.f4541     // Catch:{ IOException -> 0x093d }
            r1 = r25
            byte[] r1 = r1.f5007     // Catch:{ IOException -> 0x093d }
            r2 = r18
            int r0 = r0.mo4087(r1, r2)     // Catch:{ IOException -> 0x093d }
            if (r0 != 0) goto L_0x07d9
            o.tv r0 = new o.tv     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "Failed to append entry to GRF\n   ressize="
            r1.<init>(r2)     // Catch:{ IOException -> 0x093d }
            r2 = r18
            int r2 = r2.length     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "\n res="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            r2 = r25
            java.lang.String r2 = r2.f5008     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "\n thor="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r15)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "\n grf="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            r2 = r23
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x093d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            throw r0     // Catch:{ IOException -> 0x093d }
        L_0x077a:
            if (r20 != 0) goto L_0x07cd
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            java.io.File r26 = new java.io.File     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            r1 = r28
            java.lang.String r1 = r1.f4987     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x093d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = java.io.File.separator     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x093d }
            r1 = r25
            java.lang.String r1 = r1.f5008     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "\\"
            java.lang.String r3 = java.io.File.separator     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x093d }
            r1 = r26
            r1.<init>(r0)     // Catch:{ IOException -> 0x093d }
            if (r10 == 0) goto L_0x07c4
            r0 = r25
            java.lang.String r0 = r0.f5008     // Catch:{ IOException -> 0x093d }
            r1 = r23
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x093d }
            if (r0 == 0) goto L_0x07c4
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            o.st r0 = p004o.C0653pe.f4541     // Catch:{ IOException -> 0x093d }
            r0.mo4088()     // Catch:{ IOException -> 0x093d }
            r10 = 0
        L_0x07c4:
            r0 = r26
            r0.delete()     // Catch:{ IOException -> 0x093d }
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            goto L_0x07d9
        L_0x07cd:
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            o.st r0 = p004o.C0653pe.f4541     // Catch:{ IOException -> 0x093d }
            r1 = r25
            byte[] r1 = r1.f5007     // Catch:{ IOException -> 0x093d }
            r0.mo4086(r1)     // Catch:{ IOException -> 0x093d }
        L_0x07d9:
            int r24 = r24 + 1
        L_0x07db:
            r0 = r24
            if (r0 < r11) goto L_0x057e
            goto L_0x0973
        L_0x07e1:
            o.op r0 = p004o.C0618op.LATIN     // Catch:{ IOException -> 0x093d }
            r1 = r19
            java.lang.String r0 = p004o.C0622ot.m741(r1, r0)     // Catch:{ IOException -> 0x093d }
            r1 = 0
            r2 = 15
            java.lang.String r0 = r0.substring(r1, r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = "Master of Magic"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x093d }
            if (r0 == 0) goto L_0x0927
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x093d }
            r27 = r16
            r0 = r16
            java.io.InputStream r0 = r0.f3001     // Catch:{ IOException -> 0x093d }
            r0.close()     // Catch:{ IOException -> 0x093d }
            r0 = 0
            r1 = r27
            r1.f3001 = r0     // Catch:{ IOException -> 0x093d }
            java.io.File r20 = new java.io.File     // Catch:{ IOException -> 0x093d }
            r0 = r28
            java.lang.String r0 = r0.f4987     // Catch:{ IOException -> 0x093d }
            r1 = r20
            r1.<init>(r0, r15)     // Catch:{ IOException -> 0x093d }
            r0 = r20
            r1 = 0
            o.te[] r11 = p004o.C0835ua.m1537(r0, r1)     // Catch:{ IOException -> 0x093d }
            r17 = 5000000(0x4c4b40, float:7.006492E-39)
            r22 = r11
            int r0 = r11.length     // Catch:{ IOException -> 0x093d }
            r21 = r0
            r19 = 0
            goto L_0x0830
        L_0x0826:
            r18 = r22[r19]     // Catch:{ IOException -> 0x093d }
            r0 = r18
            int r0 = r0.f4797     // Catch:{ IOException -> 0x093d }
            int r17 = r17 + r0
            int r19 = r19 + 1
        L_0x0830:
            r0 = r19
            r1 = r21
            if (r0 < r1) goto L_0x0826
            r0 = r28
            java.lang.String r0 = r0.f4987     // Catch:{ IOException -> 0x093d }
            r27 = r0
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x093d }
            r1 = r27
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            long r0 = r0.getFreeSpace()     // Catch:{ IOException -> 0x093d }
            r2 = r17
            long r2 = (long) r2     // Catch:{ IOException -> 0x093d }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x086a
            o.tr r0 = new o.tr     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "Can't merge "
            r1.<init>(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r15)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = ": no device space left."
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x093d }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x093d }
            throw r0     // Catch:{ IOException -> 0x093d }
        L_0x086a:
            r18 = 0
            goto L_0x0920
        L_0x086e:
            r19 = r11[r18]     // Catch:{ IOException -> 0x093d }
            r0 = r19
            java.lang.String r0 = r0.f4792     // Catch:{ IOException -> 0x093d }
            r21 = r0
            p004o.C0624ov.m757()     // Catch:{ IOException -> 0x093d }
            r0 = r28
            o.tl r0 = r0.f4986     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "[2/2] Applying update files\n["
            r1.<init>(r2)     // Catch:{ IOException -> 0x093d }
            int r2 = r14 + 1
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            int r2 = r12.size()     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "] "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r15)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "\n["
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            int r2 = r18 + 1
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            int r2 = r11.length     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "] "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            r2 = r19
            java.lang.String r2 = r2.f4792     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x093d }
            r0.mo3957(r1)     // Catch:{ IOException -> 0x093d }
            r0 = r20
            r1 = r19
            r1.f4793 = r0     // Catch:{ IOException -> 0x093d }
            r0 = r19
            byte[] r22 = p004o.C0653pe.m794(r0)     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            r1 = r28
            java.lang.String r1 = r1.f4987     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x093d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = "\\"
            java.lang.String r2 = "/"
            r3 = r21
            java.lang.String r1 = r3.replace(r1, r2)     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x093d }
            java.lang.String r23 = r0.toString()     // Catch:{ IOException -> 0x093d }
            r0 = r23
            p004o.C0622ot.m719(r0)     // Catch:{ IOException -> 0x093d }
            java.io.FileOutputStream r17 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x091a }
            r0 = r17
            r1 = r23
            r0.<init>(r1)     // Catch:{ IOException -> 0x091a }
            r0 = r17
            r1 = r22
            r0.write(r1)     // Catch:{ IOException -> 0x091a }
            r0 = r17
            r0.close()     // Catch:{ IOException -> 0x091a }
            goto L_0x091e
        L_0x091a:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException -> 0x093d }
        L_0x091e:
            int r18 = r18 + 1
        L_0x0920:
            int r0 = r11.length     // Catch:{ IOException -> 0x093d }
            r1 = r18
            if (r1 < r0) goto L_0x086e
            goto L_0x0973
        L_0x0927:
            o.tr r0 = new o.tr     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x093d }
            java.lang.String r2 = "Invalid Thor file magic: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x093d }
            java.lang.StringBuilder r1 = r1.append(r15)     // Catch:{ IOException -> 0x093d }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x093d }
            r2 = 1
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x093d }
            throw r0     // Catch:{ IOException -> 0x093d }
        L_0x093d:
            r10 = move-exception
            r0 = r16
            long r0 = r0.f2999
            r19 = r0
            r27 = r16
            r0 = r16
            java.io.InputStream r0 = r0.f3001     // Catch:{ IOException -> 0x0953 }
            r0.close()     // Catch:{ IOException -> 0x0953 }
            r0 = 0
            r1 = r27
            r1.f3001 = r0     // Catch:{ IOException -> 0x0953 }
        L_0x0953:
            java.io.File r11 = new java.io.File
            r0 = r28
            java.lang.String r0 = r0.f4987
            r11.<init>(r0, r15)
            o.tq r0 = new o.tq
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to parse Thor file at position "
            r1.<init>(r2)
            r2 = r19
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r10, r1, r11)
            throw r0
        L_0x0973:
            int r14 = r14 + 1
        L_0x0975:
            int r0 = r12.size()
            if (r14 < r0) goto L_0x03aa
            o.st r0 = p004o.C0653pe.f4541
            r0.mo4088()
            p004o.C0624ov.m756()
            java.io.File r0 = new java.io.File
            r1 = r28
            java.lang.String r1 = r1.f4987
            r0.<init>(r1)
            java.io.File[] r19 = r0.listFiles()
            r0 = r19
            int r10 = r0.length
            r16 = 0
            goto L_0x09bf
        L_0x0996:
            r15 = r19[r16]
            java.lang.String r0 = r15.getName()
            java.lang.String r1 = ".thor"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L_0x09ba
            java.lang.String r0 = r15.getName()
            java.lang.String r1 = ".grf"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x09bd
            long r0 = r15.length()
            r2 = 1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x09bd
        L_0x09ba:
            r15.delete()
        L_0x09bd:
            int r16 = r16 + 1
        L_0x09bf:
            r0 = r16
            if (r0 < r10) goto L_0x0996
            java.io.File r0 = new java.io.File
            r1 = r28
            java.lang.String r1 = r1.f4987
            r0.<init>(r1, r9)
            r0.delete()
            if (r7 <= 0) goto L_0x09fe
            if (r8 == r7) goto L_0x09fe
            p004o.C0624ov.m756()
            java.io.FileOutputStream r15 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x09f7 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x09f7 }
            r1 = r28
            java.lang.String r1 = r1.f4987     // Catch:{ IOException -> 0x09f7 }
            r0.<init>(r1, r6)     // Catch:{ IOException -> 0x09f7 }
            r1 = 0
            r15.<init>(r0, r1)     // Catch:{ IOException -> 0x09f7 }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x09f7 }
            o.op r1 = p004o.C0618op.LATIN     // Catch:{ IOException -> 0x09f7 }
            r2 = 0
            byte[] r0 = p004o.C0622ot.m750(r0, r1, r2)     // Catch:{ IOException -> 0x09f7 }
            r15.write(r0)     // Catch:{ IOException -> 0x09f7 }
            r15.close()     // Catch:{ IOException -> 0x09f7 }
            goto L_0x0a01
        L_0x09f7:
            r15 = move-exception
            o.tr r0 = new o.tr
            r0.<init>(r15)
            throw r0
        L_0x09fe:
            p004o.C0624ov.m756()
        L_0x0a01:
            p004o.C0624ov.m756()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0819tp.mo4114(o.pc$鷭$鷭):boolean");
    }
}

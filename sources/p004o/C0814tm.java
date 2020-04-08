package p004o;

/* renamed from: o.tm */
public final class C0814tm extends C0811tk {

    /* renamed from: o.tm$if */
    enum C0815if {
        FLD,
        GRF,
        FLD_DELETE,
        GRF_DELETE,
        RAR;

        /* renamed from: 鷭 */
        static C0815if m1518(String str, String str2) {
            boolean endsWith = str2.endsWith("*");
            String upperCase = str.toUpperCase();
            if (upperCase.equals("FLD")) {
                if (str2.toLowerCase().endsWith(".rar")) {
                    return RAR;
                }
                return endsWith ? FLD_DELETE : FLD;
            } else if (upperCase.equals("GRF")) {
                return endsWith ? GRF_DELETE : GRF;
            } else {
                return null;
            }
        }
    }

    /* renamed from: o.tm$鷭 */
    class C0816 {

        /* renamed from: ˮ͈ */
        String f4997;

        /* renamed from: 櫯 */
        C0815if f4998;

        /* renamed from: 鷭 */
        int f4999;

        C0816(int i, String str, String str2) {
            this.f4999 = i;
            this.f4998 = C0815if.m1518(str, str2);
            if (this.f4998 == null) {
                throw new C0822tr("Unknown operation type: " + str + " " + str2);
            }
            this.f4997 = str2;
            if (this.f4997.endsWith("*")) {
                this.f4997 = this.f4997.substring(0, this.f4997.length() - 1);
            }
            new StringBuilder("Operation: id=").append(this.f4999).append(" type=").append(this.f4998).append(" fn=").append(this.f4997);
            C0624ov.m756();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final String mo4115() {
            return "id=" + this.f4999 + " type=" + this.f4998 + " fn=" + this.f4997;
        }
    }

    public C0814tm(String str, C0524lh lhVar) {
        super(str, lhVar);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 300 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4114(p004o.C0643pc.C0650.C0651 r24) {
        /*
            r23 = this;
            r0 = r23
            o.tl r0 = r0.f4986
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Checking client updates at "
            r1.<init>(r2)
            r2 = r24
            java.lang.String r2 = r2.f4536
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo3957(r1)
            r0 = r24
            java.lang.String r0 = r0.f4536
            r1 = r24
            java.lang.String r1 = r1.f4536
            r2 = 47
            int r1 = r1.lastIndexOf(r2)
            int r1 = r1 + 1
            java.lang.String r6 = r0.substring(r1)
            r0 = r24
            java.lang.String r0 = r0.f4536
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r23
            java.lang.String r3 = r3.f4987
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            o.pe$if r4 = p004o.C0653pe.C0654if.OVERWRITE
            r2 = 1
            r3 = 1
            r5 = 0
            byte[] r0 = p004o.C0829ty.m1528(r0, r1, r2, r3, r4, r5)
            o.op r1 = p004o.C0618op.KOREAN
            java.lang.String r0 = p004o.C0622ot.m741(r0, r1)
            java.lang.String r1 = "\n"
            r2 = 1
            java.lang.String[] r7 = p004o.C0622ot.m751(r0, r2, r1)
            p004o.C0624ov.m756()
            r6 = 0
            r0 = r23
            java.lang.String r0 = r0.f4987     // Catch:{ tu -> 0x008b }
            r1 = r24
            java.lang.String r1 = r1.f4532     // Catch:{ tu -> 0x008b }
            r2 = r23
            o.tl r2 = r2.f4986     // Catch:{ tu -> 0x008b }
            r3 = 0
            java.lang.Object r0 = p004o.C0653pe.m796(r0, r1, r3, r2)     // Catch:{ tu -> 0x008b }
            byte[] r0 = (byte[]) r0     // Catch:{ tu -> 0x008b }
            o.op r1 = p004o.C0618op.LATIN     // Catch:{ tu -> 0x008b }
            java.lang.String r0 = p004o.C0622ot.m741(r0, r1)     // Catch:{ tu -> 0x008b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ tu -> 0x008b }
            r6 = r0
            goto L_0x008e
        L_0x008b:
            p004o.C0624ov.m756()
        L_0x008e:
            p004o.C0624ov.m756()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = r6
            r12 = r7
            int r11 = r7.length
            r10 = 0
            goto L_0x00fc
        L_0x009c:
            r7 = r12[r10]
            java.lang.String r0 = "//"
            int r13 = r7.indexOf(r0)
            if (r13 < 0) goto L_0x00ab
            r0 = 0
            java.lang.String r7 = r7.substring(r0, r13)
        L_0x00ab:
            java.lang.String r0 = r7.trim()
            java.lang.String r1 = "\r"
            java.lang.String r2 = ""
            java.lang.String r7 = r0.replace(r1, r2)
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x00fa
            java.util.Scanner r0 = new java.util.Scanner     // Catch:{ Throwable -> 0x00f2 }
            r0.<init>(r7)     // Catch:{ Throwable -> 0x00f2 }
            r7 = r0
            int r14 = r0.nextInt()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "[ \t]"
            r7.skip(r0)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "[A-Z]*"
            java.lang.String r15 = r7.next(r0)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r16 = r7.next()     // Catch:{ Throwable -> 0x00f2 }
            r7.close()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r15 = r15.trim()     // Catch:{ Throwable -> 0x00f2 }
            r0 = r16
            java.lang.String r16 = r0.trim()     // Catch:{ Throwable -> 0x00f2 }
            if (r6 >= r14) goto L_0x00fa
            o.tm$鷭 r0 = new o.tm$鷭     // Catch:{ Throwable -> 0x00f2 }
            r1 = r23
            r2 = r16
            r0.<init>(r14, r15, r2)     // Catch:{ Throwable -> 0x00f2 }
            r8.add(r0)     // Catch:{ Throwable -> 0x00f2 }
            goto L_0x00fa
        L_0x00f2:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            p004o.C0624ov.m759(r0)
        L_0x00fa:
            int r10 = r10 + 1
        L_0x00fc:
            if (r10 < r11) goto L_0x009c
            int r0 = r8.size()
            if (r0 != 0) goto L_0x0109
            p004o.C0624ov.m756()
            r0 = 0
            return r0
        L_0x0109:
            java.util.Iterator r10 = r8.iterator()
            goto L_0x0160
        L_0x010f:
            java.lang.Object r0 = r10.next()
            o.tm$鷭 r0 = (p004o.C0814tm.C0816) r0
            r7 = r0
            java.util.Iterator r12 = r8.iterator()
            goto L_0x0154
        L_0x011b:
            java.lang.Object r0 = r12.next()
            o.tm$鷭 r0 = (p004o.C0814tm.C0816) r0
            r11 = r0
            if (r7 == r11) goto L_0x0154
            int r0 = r7.f4999
            int r1 = r11.f4999
            if (r0 != r1) goto L_0x0154
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Duplicate file operation found: op1=["
            r0.<init>(r1)
            java.lang.String r1 = r7.mo4115()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "] op2=["
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r11.mo4115()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            p004o.C0624ov.m759(r0)
        L_0x0154:
            boolean r0 = r12.hasNext()
            if (r0 != 0) goto L_0x011b
            int r0 = r7.f4999
            int r9 = java.lang.Math.max(r9, r0)
        L_0x0160:
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L_0x010f
            r8.size()
            p004o.C0624ov.m756()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "neoncube-tmp/"
            r0.<init>(r1)
            o.tm$if r1 = p004o.C0814tm.C0815if.GRF
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r10 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "neoncube-tmp/"
            r0.<init>(r1)
            o.tm$if r1 = p004o.C0814tm.C0815if.FLD
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r11 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r10)
            r0.<init>(r1)
            java.lang.String r1 = "/unpack"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r13 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r11)
            r0.<init>(r1)
            java.lang.String r1 = "/unpack"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r7 = r0.toString()
            r14 = 0
            goto L_0x07bf
        L_0x01bf:
            java.lang.Object r0 = r8.get(r14)
            o.tm$鷭 r0 = (p004o.C0814tm.C0816) r0
            r15 = r0
            r15.mo4115()
            p004o.C0624ov.m756()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Processing update files\n["
            r0.<init>(r1)
            int r1 = r14 + 1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r8.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "] "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r15.f4997
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r16 = r0.toString()
            r0 = r23
            o.tl r0 = r0.f4986
            r1 = r16
            r0.mo3957(r1)
            o.tk$鷭 r6 = new o.tk$鷭
            r0 = r23
            r1 = r16
            r6.<init>(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r24
            java.lang.String r1 = r1.f4535
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r15.f4997
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r11 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "neoncube-tmp/"
            r0.<init>(r1)
            o.tm$if r1 = r15.f4998
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r12 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r12)
            r0.<init>(r1)
            java.lang.String r1 = "/unpack"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r17 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r12)
            r0.<init>(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r15.f4997
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r12 = r0.toString()
            o.tn r0 = new o.tn
            r1 = r23
            r2 = r16
            r0.<init>(r1, r2)
            r16 = r0
            o.tm$if r0 = r15.f4998
            o.tm$if r1 = p004o.C0814tm.C0815if.RAR
            if (r0 != r1) goto L_0x056f
            p004o.C0624ov.m756()
            java.io.File r18 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r23
            java.lang.String r1 = r1.f4987
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r0 = r0.toString()
            r1 = r18
            r1.<init>(r0)
            r0 = r11
            r1 = r18
            o.pe$if r4 = p004o.C0653pe.C0654if.OVERWRITE
            r5 = r6
            r2 = 0
            r3 = 0
            p004o.C0829ty.m1528(r0, r1, r2, r3, r4, r5)
            p004o.C0624ov.m756()
            o.xj r6 = new o.xj     // Catch:{ IOException -> 0x02b6, xo -> 0x02cd }
            r0 = r18
            r1 = r16
            r6.<init>(r0, r1)     // Catch:{ IOException -> 0x02b6, xo -> 0x02cd }
            goto L_0x0557
        L_0x02b6:
            r11 = move-exception
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to open archive: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r1 = r1.toString()
            r2 = 1
            r0.<init>(r11, r1, r2)
            throw r0
        L_0x02cd:
            r11 = move-exception
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to open archive: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r1 = r1.toString()
            r2 = 1
            r0.<init>(r11, r1, r2)
            throw r0
        L_0x02e4:
            boolean r0 = r11.mo4160()     // Catch:{ IOException -> 0x0561 }
            if (r0 == 0) goto L_0x02ef
            java.lang.String r0 = r11.f5713     // Catch:{ IOException -> 0x0561 }
            r16 = r0
            goto L_0x0303
        L_0x02ef:
            byte[] r0 = r11.f5701     // Catch:{ IOException -> 0x0561 }
            o.op r1 = p004o.C0618op.KOREAN     // Catch:{ IOException -> 0x0561 }
            java.lang.String r16 = p004o.C0622ot.m741(r0, r1)     // Catch:{ IOException -> 0x0561 }
            r0 = r16
            int r0 = r0.length()     // Catch:{ IOException -> 0x0561 }
            if (r0 > 0) goto L_0x0303
            java.lang.String r0 = r11.f5718     // Catch:{ IOException -> 0x0561 }
            r16 = r0
        L_0x0303:
            r0 = r16
            java.lang.String r16 = r0.trim()     // Catch:{ IOException -> 0x0561 }
            r0 = r23
            o.tl r0 = r0.f4986     // Catch:{ IOException -> 0x0561 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0561 }
            java.lang.String r2 = "Processing update files\n["
            r1.<init>(r2)     // Catch:{ IOException -> 0x0561 }
            int r2 = r14 + 1
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x0561 }
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x0561 }
            int r2 = r8.size()     // Catch:{ IOException -> 0x0561 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x0561 }
            java.lang.String r2 = "] "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x0561 }
            java.lang.String r2 = r15.f4997     // Catch:{ IOException -> 0x0561 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x0561 }
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x0561 }
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x0561 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0561 }
            r0.mo3957(r1)     // Catch:{ IOException -> 0x0561 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0561 }
            r1 = r23
            java.lang.String r1 = r1.f4987     // Catch:{ IOException -> 0x0561 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0561 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0561 }
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x0561 }
            r1 = r16
            r2 = 92
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ IOException -> 0x0561 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x0561 }
            java.lang.String r19 = r0.toString()     // Catch:{ IOException -> 0x0561 }
            java.io.File r20 = new java.io.File     // Catch:{ IOException -> 0x0561 }
            r0 = r20
            r1 = r19
            r0.<init>(r1)     // Catch:{ IOException -> 0x0561 }
            r0 = r20
            r0.getAbsolutePath()     // Catch:{ IOException -> 0x0561 }
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x0561 }
            r0 = r19
            p004o.C0622ot.m719(r0)     // Catch:{ IOException -> 0x0561 }
            r0 = r24
            java.lang.String r0 = r0.f4534     // Catch:{ IOException -> 0x0561 }
            r1 = r16
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0561 }
            if (r0 == 0) goto L_0x03b4
            p004o.C0624ov.m756()     // Catch:{ IOException -> 0x0561 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0561 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0561 }
            r2 = r23
            java.lang.String r2 = r2.f4987     // Catch:{ IOException -> 0x0561 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0561 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0561 }
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x0561 }
            java.lang.StringBuilder r1 = r1.append(r10)     // Catch:{ IOException -> 0x0561 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0561 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0561 }
            p004o.C0623ou.m753(r0)     // Catch:{ IOException -> 0x0561 }
        L_0x03b4:
            boolean r0 = r11.mo4159()     // Catch:{ IOException -> 0x0561 }
            if (r0 != 0) goto L_0x0557
            java.io.FileOutputStream r16 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
            r0 = r16
            r1 = r20
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
            r18 = r16
            r17 = r6
            java.util.List<o.xw> r0 = r6.f5629     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
            boolean r0 = r0.contains(r11)     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
            if (r0 != 0) goto L_0x03d7
            o.xo r0 = new o.xo     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
            o.xo$鷭 r1 = p004o.C0942xo.C0943.headerNotInArchive     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
            throw r0     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
        L_0x03d7:
            r0 = r17
            r17 = r11
            r11 = r0
            o.yo r0 = r0.f5631     // Catch:{ Exception -> 0x04f9 }
            r19 = r18
            r18 = r0
            r1 = r19
            r0.f5790 = r1     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r2 = r18
            r2.f5802 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r1 = r18
            r1.f5799 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r1 = r18
            r1.f5792 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r1 = r18
            r1.f5783 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r1 = r18
            r1.f5784 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r1 = r18
            r1.f5785 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r1 = r18
            r1.f5788 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r1 = r18
            r1.f5789 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r2 = r18
            r2.f5793 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r2 = r18
            r2.f5800 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r2 = r18
            r2.f5786 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r2 = r18
            r2.f5791 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r2 = r18
            r2.f5797 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = -1
            r2 = r18
            r2.f5787 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = -1
            r2 = r18
            r2.f5798 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = -1
            r2 = r18
            r2.f5794 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r1 = r18
            r1.f5782 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r2 = r18
            r2.f5801 = r0     // Catch:{ Exception -> 0x04f9 }
            r0 = 0
            r2 = r18
            r2.f5796 = r0     // Catch:{ Exception -> 0x04f9 }
            o.yo r0 = r11.f5631     // Catch:{ Exception -> 0x04f9 }
            r1 = r17
            r0.mo4167(r1)     // Catch:{ Exception -> 0x04f9 }
            o.yo r0 = r11.f5631     // Catch:{ Exception -> 0x04f9 }
            o.yg r1 = r11.f5625     // Catch:{ Exception -> 0x04f9 }
            boolean r1 = r1.f5736     // Catch:{ Exception -> 0x04f9 }
            if (r1 == 0) goto L_0x0461
            r1 = 0
            goto L_0x0462
        L_0x0461:
            r1 = -1
        L_0x0462:
            long r1 = (long) r1     // Catch:{ Exception -> 0x04f9 }
            r0.f5798 = r1     // Catch:{ Exception -> 0x04f9 }
            o.yp r0 = r11.f5627     // Catch:{ Exception -> 0x04f9 }
            if (r0 != 0) goto L_0x0472
            o.yp r0 = new o.yp     // Catch:{ Exception -> 0x04f9 }
            o.yo r1 = r11.f5631     // Catch:{ Exception -> 0x04f9 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04f9 }
            r11.f5627 = r0     // Catch:{ Exception -> 0x04f9 }
        L_0x0472:
            r0 = r17
            boolean r0 = r0.mo4157()     // Catch:{ Exception -> 0x04f9 }
            if (r0 != 0) goto L_0x047f
            o.yp r0 = r11.f5627     // Catch:{ Exception -> 0x04f9 }
            r0.mo4169()     // Catch:{ Exception -> 0x04f9 }
        L_0x047f:
            o.yp r0 = r11.f5627     // Catch:{ Exception -> 0x04f9 }
            r1 = r17
            long r1 = r1.f5711     // Catch:{ Exception -> 0x04f9 }
            r0.mo4171(r1)     // Catch:{ Exception -> 0x04f9 }
            o.yp r0 = r11.f5627     // Catch:{ Exception -> 0x04cb }
            r1 = r17
            byte r1 = r1.f5715     // Catch:{ Exception -> 0x04cb }
            r2 = r17
            boolean r2 = r2.mo4157()     // Catch:{ Exception -> 0x04cb }
            r0.mo4170(r1, r2)     // Catch:{ Exception -> 0x04cb }
            o.yo r0 = r11.f5631     // Catch:{ Exception -> 0x04cb }
            o.yb r1 = r0.f5782     // Catch:{ Exception -> 0x04cb }
            r17 = r1
            r0 = r17
            boolean r0 = r0.mo4158()     // Catch:{ Exception -> 0x04cb }
            if (r0 == 0) goto L_0x04ae
            o.yo r0 = r11.f5631     // Catch:{ Exception -> 0x04cb }
            long r0 = r0.f5787     // Catch:{ Exception -> 0x04cb }
            r2 = -1
            long r21 = r0 ^ r2
            goto L_0x04b6
        L_0x04ae:
            o.yo r0 = r11.f5631     // Catch:{ Exception -> 0x04cb }
            long r0 = r0.f5798     // Catch:{ Exception -> 0x04cb }
            r2 = -1
            long r21 = r0 ^ r2
        L_0x04b6:
            r0 = r17
            int r0 = r0.f5710     // Catch:{ Exception -> 0x04cb }
            r17 = r0
            r0 = r17
            long r0 = (long) r0     // Catch:{ Exception -> 0x04cb }
            int r0 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x04f8
            o.xo r0 = new o.xo     // Catch:{ Exception -> 0x04cb }
            o.xo$鷭 r1 = p004o.C0942xo.C0943.crcError     // Catch:{ Exception -> 0x04cb }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04cb }
            throw r0     // Catch:{ Exception -> 0x04cb }
        L_0x04cb:
            r21 = move-exception
            o.yp r0 = r11.f5627     // Catch:{ Exception -> 0x04f9 }
            r18 = r0
            r0 = r18
            o.zd r0 = r0.f5815     // Catch:{ Exception -> 0x04f9 }
            if (r0 == 0) goto L_0x04e5
            r0 = r18
            o.zd r0 = r0.f5815     // Catch:{ Exception -> 0x04f9 }
            o.zm r1 = r0.f5929     // Catch:{ Exception -> 0x04f9 }
            r24 = r1
            if (r24 == 0) goto L_0x04e5
            r0 = r24
            r0.mo4243()     // Catch:{ Exception -> 0x04f9 }
        L_0x04e5:
            r0 = r21
            boolean r0 = r0 instanceof p004o.C0942xo     // Catch:{ Exception -> 0x04f9 }
            if (r0 == 0) goto L_0x04f0
            r0 = r21
            o.xo r0 = (p004o.C0942xo) r0     // Catch:{ Exception -> 0x04f9 }
            throw r0     // Catch:{ Exception -> 0x04f9 }
        L_0x04f0:
            o.xo r0 = new o.xo     // Catch:{ Exception -> 0x04f9 }
            r1 = r21
            r0.<init>(r1)     // Catch:{ Exception -> 0x04f9 }
            throw r0     // Catch:{ Exception -> 0x04f9 }
        L_0x04f8:
            goto L_0x050d
        L_0x04f9:
            r24 = move-exception
            r0 = r24
            boolean r0 = r0 instanceof p004o.C0942xo     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
            if (r0 == 0) goto L_0x0505
            r0 = r24
            o.xo r0 = (p004o.C0942xo) r0     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
            throw r0     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
        L_0x0505:
            o.xo r0 = new o.xo     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
            r1 = r24
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
            throw r0     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
        L_0x050d:
            r0 = r16
            r0.close()     // Catch:{ FileNotFoundException -> 0x0513, xo -> 0x051f, IOException -> 0x054b }
            goto L_0x0557
        L_0x0513:
            r16 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0561 }
            o.tr r0 = new o.tr     // Catch:{ IOException -> 0x0561 }
            r1 = r16
            r0.<init>(r1)     // Catch:{ IOException -> 0x0561 }
            throw r0     // Catch:{ IOException -> 0x0561 }
        L_0x051f:
            r16 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0561 }
            o.tr r0 = new o.tr     // Catch:{ IOException -> 0x0561 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0561 }
            java.lang.String r2 = "Failed to extract archive: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x0561 }
            java.lang.StringBuilder r1 = r1.append(r12)     // Catch:{ IOException -> 0x0561 }
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x0561 }
            r2 = r16
            java.lang.String r2 = r2.getMessage()     // Catch:{ IOException -> 0x0561 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x0561 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0561 }
            r2 = r16
            r3 = 1
            r0.<init>(r2, r1, r3)     // Catch:{ IOException -> 0x0561 }
            throw r0     // Catch:{ IOException -> 0x0561 }
        L_0x054b:
            r16 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0561 }
            o.tr r0 = new o.tr     // Catch:{ IOException -> 0x0561 }
            r1 = r16
            r0.<init>(r1)     // Catch:{ IOException -> 0x0561 }
            throw r0     // Catch:{ IOException -> 0x0561 }
        L_0x0557:
            o.yb r11 = r6.mo4129()     // Catch:{ IOException -> 0x0561 }
            if (r11 != 0) goto L_0x02e4
            r6.close()     // Catch:{ IOException -> 0x0561 }
            goto L_0x056a
        L_0x0561:
            r16 = move-exception
            o.tr r0 = new o.tr
            r1 = r16
            r0.<init>(r1)
            throw r0
        L_0x056a:
            p004o.C0624ov.m756()
            goto L_0x07bd
        L_0x056f:
            o.tm$if r0 = r15.f4998
            o.tm$if r1 = p004o.C0814tm.C0815if.FLD
            if (r0 == r1) goto L_0x057b
            o.tm$if r0 = r15.f4998
            o.tm$if r1 = p004o.C0814tm.C0815if.GRF
            if (r0 != r1) goto L_0x0715
        L_0x057b:
            p004o.C0624ov.m756()
            r0 = r11
            java.io.File r1 = new java.io.File     // Catch:{ tu -> 0x05b0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ tu -> 0x05b0 }
            r3 = r23
            java.lang.String r3 = r3.f4987     // Catch:{ tu -> 0x05b0 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ tu -> 0x05b0 }
            r2.<init>(r3)     // Catch:{ tu -> 0x05b0 }
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ tu -> 0x05b0 }
            java.lang.StringBuilder r2 = r2.append(r12)     // Catch:{ tu -> 0x05b0 }
            java.lang.String r2 = r2.toString()     // Catch:{ tu -> 0x05b0 }
            r1.<init>(r2)     // Catch:{ tu -> 0x05b0 }
            o.tm$if r2 = r15.f4998     // Catch:{ tu -> 0x05b0 }
            o.tm$if r3 = p004o.C0814tm.C0815if.GRF     // Catch:{ tu -> 0x05b0 }
            if (r2 != r3) goto L_0x05a7
            r3 = 1
            goto L_0x05a8
        L_0x05a7:
            r3 = 0
        L_0x05a8:
            o.pe$if r4 = p004o.C0653pe.C0654if.SKIP     // Catch:{ tu -> 0x05b0 }
            r5 = r6
            r2 = 0
            p004o.C0829ty.m1528(r0, r1, r2, r3, r4, r5)     // Catch:{ tu -> 0x05b0 }
            goto L_0x05c9
        L_0x05b0:
            r18 = move-exception
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Remote file not found: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            r2 = r18
            r3 = 0
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x05c9:
            p004o.C0624ov.m756()
            java.io.File r0 = new java.io.File     // Catch:{ FileNotFoundException -> 0x05db }
            r1 = r23
            java.lang.String r1 = r1.f4987     // Catch:{ FileNotFoundException -> 0x05db }
            r0.<init>(r1, r12)     // Catch:{ FileNotFoundException -> 0x05db }
            r1 = 0
            o.te[] r18 = p004o.C0835ua.m1537(r0, r1)     // Catch:{ FileNotFoundException -> 0x05db }
            goto L_0x05e2
        L_0x05db:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            throw r0
        L_0x05e2:
            r6 = 5000000(0x4c4b40, float:7.006492E-39)
            r20 = r18
            r0 = r18
            int r0 = r0.length
            r19 = r0
            r16 = 0
            goto L_0x05f6
        L_0x05ef:
            r11 = r20[r16]
            int r0 = r11.f4797
            int r6 = r6 + r0
            int r16 = r16 + 1
        L_0x05f6:
            r0 = r16
            r1 = r19
            if (r0 < r1) goto L_0x05ef
            r0 = r23
            java.lang.String r11 = r0.f4987
            java.io.File r0 = new java.io.File
            r0.<init>(r11)
            long r0 = r0.getFreeSpace()
            long r2 = (long) r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x062a
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't merge "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = ": no device space left."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            r0.<init>(r1, r2)
            throw r0
        L_0x062a:
            r11 = 0
            goto L_0x070e
        L_0x062d:
            r16 = r18[r11]
            r0 = r23
            o.tl r0 = r0.f4986
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Processing update files\n["
            r1.<init>(r2)
            int r2 = r14 + 1
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r8.size()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "] "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r15.f4997
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n["
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r11 + 1
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r18
            int r2 = r2.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "] "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r16
            java.lang.String r2 = r2.f4792
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo3957(r1)
            r0 = r16
            byte[] r19 = p004o.C0653pe.m794(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r23
            java.lang.String r1 = r1.f4987
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r17
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r16
            java.lang.String r1 = r1.f4792
            r2 = 92
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r20 = r0.toString()
            r0 = r20
            p004o.C0622ot.m719(r0)
            java.io.FileOutputStream r16 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x06dc, IOException -> 0x06f1 }
            r0 = r16
            r1 = r20
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x06dc, IOException -> 0x06f1 }
            r0 = r16
            r1 = r19
            r0.write(r1)     // Catch:{ FileNotFoundException -> 0x06dc, IOException -> 0x06f1 }
            r0 = r16
            r0.close()     // Catch:{ FileNotFoundException -> 0x06dc, IOException -> 0x06f1 }
            goto L_0x070c
        L_0x06dc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to create file: "
            r0.<init>(r1)
            r1 = r20
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            p004o.C0624ov.m759(r0)
            goto L_0x070c
        L_0x06f1:
            r24 = move-exception
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to write file: "
            r1.<init>(r2)
            r2 = r20
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r24
            r3 = 1
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x070c:
            int r11 = r11 + 1
        L_0x070e:
            r0 = r18
            int r0 = r0.length
            if (r11 < r0) goto L_0x062d
            goto L_0x07bd
        L_0x0715:
            o.tm$if r0 = r15.f4998
            o.tm$if r1 = p004o.C0814tm.C0815if.FLD_DELETE
            if (r0 == r1) goto L_0x0721
            o.tm$if r0 = r15.f4998
            o.tm$if r1 = p004o.C0814tm.C0815if.GRF_DELETE
            if (r0 != r1) goto L_0x07bd
        L_0x0721:
            o.tm$if r0 = r15.f4998
            o.tm$if r1 = p004o.C0814tm.C0815if.FLD_DELETE
            if (r0 != r1) goto L_0x072c
            r18 = r7
            java.lang.String r6 = "datadir.grf"
            goto L_0x073f
        L_0x072c:
            o.tm$if r0 = r15.f4998
            o.tm$if r1 = p004o.C0814tm.C0815if.GRF_DELETE
            if (r0 != r1) goto L_0x0739
            r18 = r13
            r0 = r24
            java.lang.String r6 = r0.f4534
            goto L_0x073f
        L_0x0739:
            o.tv r0 = new o.tv
            r0.<init>()
            throw r0
        L_0x073f:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r23
            java.lang.String r2 = r2.f4987
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r18
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r15.f4997
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0.delete()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r23
            java.lang.String r1 = r1.f4987
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r16 = r0.toString()
            o.st r0 = p004o.C0653pe.f4541
            boolean r0 = r0.mo4084(r6)
            if (r0 != 0) goto L_0x07aa
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to open GRF: "
            r1.<init>(r2)
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x07aa:
            o.st r0 = p004o.C0653pe.f4541
            java.lang.String r1 = r15.f4997
            o.op r2 = p004o.C0618op.KOREAN
            r3 = 1
            byte[] r1 = p004o.C0622ot.m750(r1, r2, r3)
            r0.mo4086(r1)
            o.st r0 = p004o.C0653pe.f4541
            r0.mo4088()
        L_0x07bd:
            int r14 = r14 + 1
        L_0x07bf:
            int r0 = r8.size()
            if (r14 < r0) goto L_0x01bf
            p004o.C0624ov.m756()
            r0 = r23
            java.lang.String r0 = r0.f4987
            java.lang.String r1 = "datadir.grf"
            r2 = r23
            o.tl r2 = r2.f4986
            p004o.C0653pe.m799(r0, r7, r1, r2)
            r0 = r23
            java.lang.String r0 = r0.f4987
            r1 = r24
            java.lang.String r1 = r1.f4534
            r2 = r23
            o.tl r2 = r2.f4986
            p004o.C0653pe.m799(r0, r13, r1, r2)
            p004o.C0624ov.m756()
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r23
            java.lang.String r2 = r2.f4987
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r2 = "/neoncube-tmp"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            p004o.C0623ou.m753(r0)
            p004o.C0624ov.m756()
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x082e }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x082e }
            r1 = r23
            java.lang.String r1 = r1.f4987     // Catch:{ IOException -> 0x082e }
            r2 = r24
            java.lang.String r2 = r2.f4532     // Catch:{ IOException -> 0x082e }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x082e }
            r1 = 0
            r14.<init>(r0, r1)     // Catch:{ IOException -> 0x082e }
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ IOException -> 0x082e }
            o.op r1 = p004o.C0618op.LATIN     // Catch:{ IOException -> 0x082e }
            r2 = 0
            byte[] r0 = p004o.C0622ot.m750(r0, r1, r2)     // Catch:{ IOException -> 0x082e }
            r14.write(r0)     // Catch:{ IOException -> 0x082e }
            r14.close()     // Catch:{ IOException -> 0x082e }
            goto L_0x0835
        L_0x082e:
            r14 = move-exception
            o.tr r0 = new o.tr
            r0.<init>(r14)
            throw r0
        L_0x0835:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0814tm.mo4114(o.pc$鷭$鷭):boolean");
    }
}

package p004o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpStatus;

/* renamed from: o.to */
public final class C0818to extends C0811tk {
    public C0818to(String str, C0524lh lhVar) {
        super(str, lhVar);
    }

    /* renamed from: 鷭 */
    private void m1522(String str) {
        C0624ov.m757();
        try {
            byte[] bArr = new byte[1];
            File file = new File(this.f4987 + "/" + str);
            if (file.exists()) {
                C0614ol olVar = new C0614ol(new GZIPInputStream(new FileInputStream(file)));
                while (true) {
                    switch (olVar.mo4032()) {
                        case 100:
                            olVar.mo4037(bArr);
                            byte[] bArr2 = new byte[C0622ot.m730(bArr[0])];
                            olVar.mo4037(bArr2);
                            String r4 = C0622ot.m741(bArr2, C0618op.KOREAN);
                            C0624ov.m757();
                            new File(this.f4987 + "/" + r4).mkdirs();
                            continue;
                        case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
                            C0614ol olVar2 = olVar;
                            olVar.f3001.close();
                            olVar2.f3001 = null;
                            return;
                        case HttpStatus.SC_PROCESSING /*102*/:
                            olVar.mo4037(bArr);
                            byte[] bArr3 = new byte[C0622ot.m730(bArr[0])];
                            olVar.mo4037(bArr3);
                            byte[] bArr4 = new byte[4];
                            olVar.mo4037(bArr4);
                            int i = ByteBuffer.wrap(bArr4).order(ByteOrder.LITTLE_ENDIAN).getInt();
                            if (new File(this.f4987).getFreeSpace() >= ((long) i)) {
                                String replace = C0622ot.m741(bArr3, C0618op.KOREAN).toLowerCase().replace("\\", "/");
                                C0624ov.m757();
                                C0622ot.m719(this.f4987 + "/" + replace);
                                FileOutputStream fileOutputStream = new FileOutputStream(this.f4987 + "/" + replace);
                                int i2 = 0;
                                byte[] bArr5 = new byte[32000];
                                while (i2 < i) {
                                    int min = Math.min(bArr5.length, i - i2);
                                    olVar.mo4036(bArr5, min);
                                    fileOutputStream.write(bArr5, 0, min);
                                    i2 += min;
                                }
                                fileOutputStream.close();
                                break;
                            } else {
                                throw new C0822tr("Can't unpack " + str + ": no device space left.", true);
                            }
                    }
                }
            } else {
                throw new C0822tr(new StringBuilder(String.valueOf(str)).append(" not exists, can't extract RGZ").toString());
            }
        } catch (FileNotFoundException e) {
            throw new C0822tr((Exception) e);
        } catch (IOException e2) {
            throw new C0822tr((Exception) e2);
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r11v1, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r14v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r13v10, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r0v111 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r0v116, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r0v120, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r0v121, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r0v125, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: type inference failed for: r11v17 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: type inference failed for: r11v19 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v5
      assigns: []
      uses: []
      mth insns count: 436
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
    /* JADX WARNING: Unknown variable types count: 13 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4114(p004o.C0643pc.C0650.C0651 r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r6 = r0.f4536
            r0 = r21
            java.lang.String r7 = r0.f4535
            r0 = r21
            java.lang.String r8 = r0.f4534
            r0 = r21
            java.lang.String r0 = r0.f4532
            r21 = r0
            r0 = r20
            o.tl r0 = r0.f4986
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Checking client updates at "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.mo3957(r1)
            p004o.C0624ov.m757()
            r0 = 47
            int r0 = r6.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r9 = r6.substring(r0)
            r0 = r6
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r20
            java.lang.String r3 = r3.f4987
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            o.pe$if r4 = p004o.C0653pe.C0654if.OVERWRITE
            r2 = 1
            r3 = 1
            r5 = 0
            byte[] r0 = p004o.C0829ty.m1528(r0, r1, r2, r3, r4, r5)
            o.op r1 = p004o.C0618op.LATIN
            java.lang.String r0 = p004o.C0622ot.m741(r0, r1)
            java.lang.String r1 = "\n"
            r2 = 1
            java.lang.String[] r6 = p004o.C0622ot.m751(r0, r2, r1)
            r0 = r20
            java.lang.String r0 = r0.f4987     // Catch:{ tu -> 0x00ba }
            r1 = r20
            o.tl r1 = r1.f4986     // Catch:{ tu -> 0x00ba }
            r2 = r21
            r3 = 0
            java.lang.Object r0 = p004o.C0653pe.m796(r0, r2, r3, r1)     // Catch:{ tu -> 0x00ba }
            byte[] r0 = (byte[]) r0     // Catch:{ tu -> 0x00ba }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ tu -> 0x00ba }
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ tu -> 0x00ba }
            java.nio.ByteBuffer r9 = r0.order(r1)     // Catch:{ tu -> 0x00ba }
            int r0 = r9.capacity()     // Catch:{ tu -> 0x00ba }
            r1 = 4
            if (r0 >= r1) goto L_0x00b5
            o.tr r0 = new o.tr     // Catch:{ tu -> 0x00ba }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ tu -> 0x00ba }
            java.lang.String r2 = "Client version inf file "
            r1.<init>(r2)     // Catch:{ tu -> 0x00ba }
            r2 = r21
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ tu -> 0x00ba }
            java.lang.String r2 = " has size less than 4. Please check your client integrity.\nIf you don't know what this means, just remove all files from "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ tu -> 0x00ba }
            r2 = r20
            java.lang.String r2 = r2.f4987     // Catch:{ tu -> 0x00ba }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ tu -> 0x00ba }
            java.lang.String r1 = r1.toString()     // Catch:{ tu -> 0x00ba }
            r0.<init>(r1)     // Catch:{ tu -> 0x00ba }
            throw r0     // Catch:{ tu -> 0x00ba }
        L_0x00b5:
            int r10 = r9.getInt()     // Catch:{ tu -> 0x00ba }
            goto L_0x00de
        L_0x00ba:
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r9 = r0.order(r1)
            r10 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r21
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = " not found, assuming client version = 0"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            p004o.C0624ov.m759(r0)
        L_0x00de:
            p004o.C0624ov.m757()
            r0 = 0
            java.lang.String[] r11 = new java.lang.String[r0]
            r12 = r10
            r15 = r6
            int r14 = r6.length
            r13 = 0
            goto L_0x0188
        L_0x00ea:
            r0 = r15[r13]
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "\r"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "\t"
            java.lang.String r2 = " "
            java.lang.String r6 = r0.replace(r1, r2)
            java.lang.String r0 = " "
            r1 = 2
            java.lang.String[] r16 = r6.split(r0, r1)
            r0 = r16
            int r0 = r0.length
            r1 = 2
            if (r0 < r1) goto L_0x0186
            r0 = 0
            r0 = r16[r0]     // Catch:{ NumberFormatException -> 0x0115 }
            int r17 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0115 }
            goto L_0x0121
        L_0x0115:
            r18 = move-exception
            o.tr r0 = new o.tr
            java.lang.String r1 = "Invalid patch list format."
            r2 = r18
            r3 = 0
            r0.<init>(r2, r1, r3)
            throw r0
        L_0x0121:
            r0 = 1
            r0 = r16[r0]
            java.lang.String r18 = r0.trim()
            if (r17 != 0) goto L_0x013e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Found patch with id=0. Line="
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            p004o.C0624ov.m759(r0)
            r0 = 0
            return r0
        L_0x013e:
            r0 = r17
            if (r0 <= r10) goto L_0x0186
            p004o.C0624ov.m757()
            int r0 = r11.length
            int r19 = r0 + -1
            goto L_0x015e
        L_0x0149:
            r0 = r11[r19]
            r1 = r18
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015c
            r0 = r19
            java.lang.Object[] r0 = p004o.C0619oq.m712((T[]) r11, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r11 = r0
        L_0x015c:
            int r19 = r19 + -1
        L_0x015e:
            if (r19 >= 0) goto L_0x0149
            r0 = r11
            r12 = r18
            r11 = r0
            if (r0 != 0) goto L_0x0172
            java.lang.Class r0 = r12.getClass()
            r1 = 0
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r11 = r0
        L_0x0172:
            int r0 = r11.length
            int r0 = r0 + 1
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r11, r0)
            int r0 = r11.length
            r6[r0] = r12
            r0 = r6
            java.lang.String[] r0 = (java.lang.String[]) r0
            r11 = r0
            r0 = r17
            int r12 = java.lang.Math.max(r0, r10)
        L_0x0186:
            int r13 = r13 + 1
        L_0x0188:
            if (r13 < r14) goto L_0x00ea
            p004o.C0624ov.m757()
            java.lang.String r0 = r7.toLowerCase()
            java.lang.String r1 = "ftp"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x01a7
            r0 = r20
            java.lang.String r0 = r0.f4987
            r1 = r20
            o.tl r1 = r1.f4986
            r2 = 1
            p004o.C0829ty.m1527(r7, r0, r11, r2, r1)
            goto L_0x0223
        L_0x01a7:
            r6 = 0
            goto L_0x0220
        L_0x01aa:
            r13 = r11[r6]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Processing update files\n["
            r0.<init>(r1)
            int r1 = r6 + 1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r11.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "] "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r14 = r0.toString()
            r0 = r20
            o.tl r0 = r0.f4986
            r0.mo3957(r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r7)
            r0.<init>(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r20
            java.lang.String r3 = r3.f4987
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r3)
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r13)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            o.pe$if r4 = p004o.C0653pe.C0654if.SKIP
            o.tk$鷭 r5 = new o.tk$鷭
            r2 = r20
            r5.<init>(r14)
            r2 = 0
            r3 = 0
            p004o.C0829ty.m1528(r0, r1, r2, r3, r4, r5)
            int r6 = r6 + 1
        L_0x0220:
            int r0 = r11.length
            if (r6 < r0) goto L_0x01aa
        L_0x0223:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r13 = 0
            goto L_0x028b
        L_0x022b:
            r14 = r11[r13]
            r0 = r20
            o.tl r0 = r0.f4986
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[1/2]  Applying update files\n["
            r1.<init>(r2)
            int r2 = r13 + 1
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r11.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "] "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.mo3957(r1)
            java.lang.String r0 = ".rgz"
            boolean r0 = r14.endsWith(r0)
            if (r0 == 0) goto L_0x0268
            r0 = r20
            r0.m1522(r14)
            goto L_0x0289
        L_0x0268:
            java.lang.String r0 = ".gpf"
            boolean r0 = r14.endsWith(r0)
            if (r0 == 0) goto L_0x0274
            r6.add(r14)
            goto L_0x0289
        L_0x0274:
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected format for file "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0289:
            int r13 = r13 + 1
        L_0x028b:
            int r0 = r11.length
            if (r13 < r0) goto L_0x022b
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x04b3
            p004o.C0624ov.m757()
            r0 = r20
            o.tl r0 = r0.f4986
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Merging GPFs to "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.mo3957(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040e }
            r1 = r20
            java.lang.String r1 = r1.f4987     // Catch:{ Exception -> 0x040e }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x040e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x040e }
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r0 = r0.append(r8)     // Catch:{ Exception -> 0x040e }
            java.lang.String r14 = r0.toString()     // Catch:{ Exception -> 0x040e }
            o.st r0 = p004o.C0653pe.f4541     // Catch:{ Exception -> 0x040e }
            boolean r0 = r0.mo4084(r14)     // Catch:{ Exception -> 0x040e }
            if (r0 != 0) goto L_0x02e5
            o.tr r0 = new o.tr     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "Failed to open GRF: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r1 = r1.append(r14)     // Catch:{ Exception -> 0x040e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x040e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x040e }
            throw r0     // Catch:{ Exception -> 0x040e }
        L_0x02e5:
            r15 = 0
            goto L_0x0406
        L_0x02e8:
            java.lang.Object r0 = r6.get(r15)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x040e }
            r16 = r0
            p004o.C0624ov.m757()     // Catch:{ Exception -> 0x040e }
            java.io.File r17 = new java.io.File     // Catch:{ Exception -> 0x040e }
            r0 = r20
            java.lang.String r0 = r0.f4987     // Catch:{ Exception -> 0x040e }
            r1 = r17
            r2 = r16
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x040e }
            r0 = r17
            r1 = 0
            o.te[] r18 = p004o.C0835ua.m1537(r0, r1)     // Catch:{ Exception -> 0x040e }
            r19 = 5000000(0x4c4b40, float:7.006492E-39)
            r13 = r18
            r0 = r18
            int r11 = r0.length     // Catch:{ Exception -> 0x040e }
            r10 = 0
            goto L_0x0319
        L_0x0311:
            r7 = r13[r10]     // Catch:{ Exception -> 0x040e }
            int r0 = r7.f4797     // Catch:{ Exception -> 0x040e }
            int r19 = r19 + r0
            int r10 = r10 + 1
        L_0x0319:
            if (r10 < r11) goto L_0x0311
            r0 = r20
            java.lang.String r11 = r0.f4987     // Catch:{ Exception -> 0x040e }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x040e }
            r0.<init>(r11)     // Catch:{ Exception -> 0x040e }
            long r0 = r0.getFreeSpace()     // Catch:{ Exception -> 0x040e }
            r2 = r19
            long r2 = (long) r2     // Catch:{ Exception -> 0x040e }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x034d
            o.tr r0 = new o.tr     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "Can't merge "
            r1.<init>(r2)     // Catch:{ Exception -> 0x040e }
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = ": no device space left."
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x040e }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x040e }
            throw r0     // Catch:{ Exception -> 0x040e }
        L_0x034d:
            r7 = 0
            goto L_0x03ff
        L_0x0350:
            r10 = r18[r7]     // Catch:{ Exception -> 0x040e }
            java.lang.String r11 = r10.f4792     // Catch:{ Exception -> 0x040e }
            p004o.C0624ov.m757()     // Catch:{ Exception -> 0x040e }
            r0 = r20
            o.tl r0 = r0.f4986     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "[2/2] Applying update files\n["
            r1.<init>(r2)     // Catch:{ Exception -> 0x040e }
            int r2 = r15 + 1
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            int r2 = r6.size()     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "] "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "\n["
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            int r2 = r7 + 1
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            r2 = r18
            int r2 = r2.length     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "] "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = r10.f4792     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x040e }
            r0.mo3957(r1)     // Catch:{ Exception -> 0x040e }
            r0 = r17
            r10.f4793 = r0     // Catch:{ Exception -> 0x040e }
            byte[] r13 = p004o.C0653pe.m794(r10)     // Catch:{ Exception -> 0x040e }
            o.st r0 = p004o.C0653pe.f4541     // Catch:{ Exception -> 0x040e }
            java.lang.String r1 = r10.f4792     // Catch:{ Exception -> 0x040e }
            o.op r2 = p004o.C0618op.KOREAN     // Catch:{ Exception -> 0x040e }
            r3 = 1
            byte[] r1 = p004o.C0622ot.m750(r1, r2, r3)     // Catch:{ Exception -> 0x040e }
            int r0 = r0.mo4087(r1, r13)     // Catch:{ Exception -> 0x040e }
            if (r0 != 0) goto L_0x03fd
            o.tv r0 = new o.tv     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "Failed to append entry to GRF\nentry size="
            r1.<init>(r2)     // Catch:{ Exception -> 0x040e }
            int r2 = r13.length     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "entry fn="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r1 = r1.append(r11)     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "gpf_name="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.String r2 = "grf_path="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r1 = r1.append(r14)     // Catch:{ Exception -> 0x040e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x040e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x040e }
            throw r0     // Catch:{ Exception -> 0x040e }
        L_0x03fd:
            int r7 = r7 + 1
        L_0x03ff:
            r0 = r18
            int r0 = r0.length     // Catch:{ Exception -> 0x040e }
            if (r7 < r0) goto L_0x0350
            int r15 = r15 + 1
        L_0x0406:
            int r0 = r6.size()     // Catch:{ Exception -> 0x040e }
            if (r15 < r0) goto L_0x02e8
            goto L_0x045b
        L_0x040e:
            r13 = move-exception
            p004o.C0624ov.m757()
            r0 = r20
            o.tl r0 = r0.f4986
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Closing GRF "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.mo3957(r1)
            o.st r0 = p004o.C0653pe.f4541
            r0.mo4088()
            boolean r0 = r13 instanceof p004o.C0822tr
            if (r0 == 0) goto L_0x0435
            r0 = r13
            o.tr r0 = (p004o.C0822tr) r0
            throw r0
        L_0x0435:
            o.tr r0 = new o.tr
            r0.<init>(r13)
            throw r0
        L_0x043b:
            r21 = move-exception
            p004o.C0624ov.m757()
            r0 = r20
            o.tl r0 = r0.f4986
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Closing GRF "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.mo3957(r1)
            o.st r0 = p004o.C0653pe.f4541
            r0.mo4088()
            throw r21
        L_0x045b:
            p004o.C0624ov.m757()
            r0 = r20
            o.tl r0 = r0.f4986
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Closing GRF "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.mo3957(r1)
            o.st r0 = p004o.C0653pe.f4541
            r0.mo4088()
            java.io.File r0 = new java.io.File
            r1 = r20
            java.lang.String r1 = r1.f4987
            r0.<init>(r1)
            java.io.File[] r18 = r0.listFiles()
            r0 = r18
            int r0 = r0.length
            r17 = r0
            r16 = 0
            goto L_0x04ad
        L_0x048e:
            r15 = r18[r16]
            java.lang.String r0 = r15.getName()
            java.lang.String r1 = ".rgz"
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L_0x04a8
            java.lang.String r0 = r15.getName()
            java.lang.String r1 = ".gpf"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x04ab
        L_0x04a8:
            r15.delete()
        L_0x04ab:
            int r16 = r16 + 1
        L_0x04ad:
            r0 = r16
            r1 = r17
            if (r0 < r1) goto L_0x048e
        L_0x04b3:
            r0 = 0
            r9.position(r0)
            r9.putInt(r12)
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x04d6 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x04d6 }
            r1 = r20
            java.lang.String r1 = r1.f4987     // Catch:{ IOException -> 0x04d6 }
            r2 = r21
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x04d6 }
            r1 = 0
            r13.<init>(r0, r1)     // Catch:{ IOException -> 0x04d6 }
            byte[] r0 = r9.array()     // Catch:{ IOException -> 0x04d6 }
            r13.write(r0)     // Catch:{ IOException -> 0x04d6 }
            r13.close()     // Catch:{ IOException -> 0x04d6 }
            goto L_0x04dd
        L_0x04d6:
            r13 = move-exception
            o.tr r0 = new o.tr
            r0.<init>(r13)
            throw r0
        L_0x04dd:
            p004o.C0624ov.m757()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0818to.mo4114(o.pc$鷭$鷭):boolean");
    }
}

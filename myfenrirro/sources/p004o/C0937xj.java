package p004o;

import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: o.xj */
public class C0937xj implements Closeable {

    /* renamed from: ċ */
    private static Logger f5622 = Logger.getLogger(C0937xj.class.getName());

    /* renamed from: 䒧 */
    private static /* synthetic */ int[] f5623;

    /* renamed from: 躆 */
    private static /* synthetic */ int[] f5624;

    /* renamed from: Ą */
    public C0966yg f5625;

    /* renamed from: ą */
    public C0965yf f5626;

    /* renamed from: Ć */
    public C0975yp f5627;

    /* renamed from: ć */
    public long f5628;

    /* renamed from: ȃ */
    public final List<C0951xw> f5629;

    /* renamed from: Ȋ */
    public C0939xl f5630;

    /* renamed from: ˮ͈ */
    public final C0974yo f5631;

    /* renamed from: ˮ͍ */
    public long f5632;

    /* renamed from: 岱 */
    public C0940xm f5633;

    /* renamed from: 櫯 */
    public final C0938xk f5634;

    /* renamed from: 纫 */
    private int f5635;

    /* renamed from: 鷭 */
    public C0946xr f5636;

    /* JADX WARNING: Can't wrap try/catch for region: R(22:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|(2:22|23)|24|26) */
    /* JADX WARNING: Can't wrap try/catch for region: R(23:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0069 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1623() {
        /*
            int[] r0 = f5624
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.yn[] r0 = p004o.C0973yn.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.yn r0 = p004o.C0973yn.AvHeader     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.yn r0 = p004o.C0973yn.CommHeader     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.yn r0 = p004o.C0973yn.EndArcHeader     // Catch:{ NoSuchFieldError -> 0x002b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002b }
        L_0x002b:
            o.yn r0 = p004o.C0973yn.FileHeader     // Catch:{ NoSuchFieldError -> 0x0035 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            o.yn r0 = p004o.C0973yn.MainHeader     // Catch:{ NoSuchFieldError -> 0x003f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003f }
        L_0x003f:
            o.yn r0 = p004o.C0973yn.MarkHeader     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            o.yn r0 = p004o.C0973yn.NewSubHeader     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            o.yn r0 = p004o.C0973yn.ProtectHeader     // Catch:{ NoSuchFieldError -> 0x005e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005e }
        L_0x005e:
            o.yn r0 = p004o.C0973yn.SignHeader     // Catch:{ NoSuchFieldError -> 0x0069 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
        L_0x0069:
            o.yn r0 = p004o.C0973yn.SubHeader     // Catch:{ NoSuchFieldError -> 0x0073 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
        L_0x0073:
            f5624 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0937xj.m1623():int[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|6|7|8|9|10|11|12|13|(2:14|15)|16|18) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: 櫯 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1624() {
        /*
            int[] r0 = f5623
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.yl[] r0 = p004o.C0971yl.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.yl r0 = p004o.C0971yl.BEEA_HEAD     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.yl r0 = p004o.C0971yl.EA_HEAD     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.yl r0 = p004o.C0971yl.MAC_HEAD     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.yl r0 = p004o.C0971yl.NTACL_HEAD     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.yl r0 = p004o.C0971yl.STREAM_HEAD     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            o.yl r0 = p004o.C0971yl.UO_HEAD     // Catch:{ NoSuchFieldError -> 0x0048 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            f5623 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0937xj.m1624():int[]");
    }

    static {
    }

    private C0937xj(C0945xq xqVar, C0817tn tnVar) {
        this.f5629 = new ArrayList();
        this.f5625 = null;
        this.f5626 = null;
        this.f5628 = 0;
        this.f5632 = 0;
        this.f5633 = xqVar;
        this.f5634 = tnVar;
        mo4130(this.f5633.mo4133(this, null));
        this.f5631 = new C0974yo(this);
    }

    public C0937xj(File file, C0817tn tnVar) {
        this(new C0945xq(file), tnVar);
    }

    /* JADX INFO: used method not loaded: o.xo.<init>(o.xo$鷭):null, types can be incorrect */
    /* JADX WARNING: CFG modification limit reached, blocks count: 187 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0135, code lost:
        r5 = new byte[4];
        r13.f5636.mo4137(r5, 4);
        r15 = new p004o.C0952xx(r15, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0152, code lost:
        switch(m1623()[r15.mo4149().ordinal()]) {
            case 3: goto L_0x016a;
            case 4: goto L_0x0254;
            case 5: goto L_0x0254;
            case 6: goto L_0x01c1;
            case 7: goto L_0x0198;
            case 8: goto L_0x0254;
            case 9: goto L_0x016a;
            default: goto L_0x0155;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016a, code lost:
        r14 = (r15.mo4146() - 7) - 4;
        r5 = new byte[r14];
        r13.f5636.mo4137(r5, r14);
        r14 = new p004o.C0961yb(r15, r5);
        r13.f5629.add(r14);
        r13.f5636.mo4139((r14.mo4143() + ((long) r14.mo4146())) + r14.f5719);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0198, code lost:
        r14 = (r15.mo4146() - 7) - 4;
        r5 = new byte[r14];
        r13.f5636.mo4137(r5, r14);
        r14 = new p004o.C0968yi(r15, r5);
        r13.f5636.mo4139((r14.mo4143() + ((long) r14.mo4146())) + r14.f5666);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01c1, code lost:
        r14 = new byte[3];
        r13.f5636.mo4137(r14, 3);
        r0 = new p004o.C0970yk(r15, r14);
        r15 = r0;
        r0.mo4150();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01e3, code lost:
        switch(m1624()[p004o.C0971yl.m1675(r15.f5755).ordinal()]) {
            case 1: goto L_0x0214;
            case 2: goto L_0x0232;
            case 3: goto L_0x01f8;
            case 4: goto L_0x0212;
            case 5: goto L_0x022e;
            case 6: goto L_0x0230;
            default: goto L_0x01e6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01f8, code lost:
        r5 = new byte[8];
        r13.f5636.mo4137(r5, 8);
        r14 = new p004o.C0964ye(r15, r5);
        r14.mo4150();
        r13.f5629.add(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0214, code lost:
        r5 = new byte[10];
        r13.f5636.mo4137(r5, 10);
        r14 = new p004o.C0954xz(r15, r5);
        r14.mo4150();
        r13.f5629.add(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0232, code lost:
        r14 = ((r15.mo4146() - 7) - 4) - 3;
        r5 = new byte[r14];
        r13.f5636.mo4137(r5, r14);
        r14 = new p004o.C0972ym(r15, r5);
        r14.mo4150();
        r13.f5629.add(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0254, code lost:
        f5622.warning("Unknown Header");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0262, code lost:
        throw new p004o.C0942xo(p004o.C0942xo.C0943.f5644);
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1625(p004o.C0948xt r13, long r14) {
        /*
            r12 = this;
            r0 = 0
            r12.f5628 = r0
            r0 = 0
            r12.f5632 = r0
            r12.close()
            r12.f5636 = r13
            r6 = r14
            r13 = r12
            r0 = 0
            r12.f5625 = r0     // Catch:{ Exception -> 0x0264 }
            r0 = 0
            r13.f5626 = r0     // Catch:{ Exception -> 0x0264 }
            java.util.List<o.xw> r0 = r13.f5629     // Catch:{ Exception -> 0x0264 }
            r0.clear()     // Catch:{ Exception -> 0x0264 }
            r0 = 0
            r13.f5635 = r0     // Catch:{ Exception -> 0x0264 }
        L_0x001d:
            r0 = 7
            byte[] r15 = new byte[r0]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            long r0 = r0.mo4138()     // Catch:{ Exception -> 0x0264 }
            r10 = r0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0263
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r1 = 7
            int r0 = r0.mo4137(r15, r1)     // Catch:{ Exception -> 0x0264 }
            if (r0 == 0) goto L_0x0263
            o.xw r0 = new o.xw     // Catch:{ Exception -> 0x0264 }
            r0.<init>(r15)     // Catch:{ Exception -> 0x0264 }
            r15 = r0
            r0.mo4152(r10)     // Catch:{ Exception -> 0x0264 }
            int[] r0 = m1623()     // Catch:{ Exception -> 0x0264 }
            o.yn r1 = r15.mo4149()     // Catch:{ Exception -> 0x0264 }
            int r1 = r1.ordinal()     // Catch:{ Exception -> 0x0264 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x0264 }
            switch(r0) {
                case 1: goto L_0x0088;
                case 2: goto L_0x0068;
                case 3: goto L_0x0135;
                case 4: goto L_0x00e2;
                case 5: goto L_0x00cc;
                case 6: goto L_0x0135;
                case 7: goto L_0x0135;
                case 8: goto L_0x00b4;
                case 9: goto L_0x0135;
                case 10: goto L_0x0108;
                default: goto L_0x004e;
            }     // Catch:{ Exception -> 0x0264 }
        L_0x004e:
            goto L_0x0135
        L_0x0068:
            o.yg r0 = new o.yg     // Catch:{ Exception -> 0x0264 }
            r0.<init>(r15)     // Catch:{ Exception -> 0x0264 }
            r13.f5625 = r0     // Catch:{ Exception -> 0x0264 }
            o.yg r0 = r13.f5625     // Catch:{ Exception -> 0x0264 }
            boolean r0 = r0.mo4163()     // Catch:{ Exception -> 0x0264 }
            if (r0 != 0) goto L_0x007f
            o.xo r0 = new o.xo     // Catch:{ Exception -> 0x0264 }
            o.xo$鷭 r1 = p004o.C0942xo.C0943.badRarArchive     // Catch:{ Exception -> 0x0264 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0264 }
            throw r0     // Catch:{ Exception -> 0x0264 }
        L_0x007f:
            java.util.List<o.xw> r0 = r13.f5629     // Catch:{ Exception -> 0x0264 }
            o.yg r1 = r13.f5625     // Catch:{ Exception -> 0x0264 }
            r0.add(r1)     // Catch:{ Exception -> 0x0264 }
            goto L_0x001d
        L_0x0088:
            boolean r0 = r15.mo4148()     // Catch:{ Exception -> 0x0264 }
            if (r0 == 0) goto L_0x0090
            r14 = 7
            goto L_0x0091
        L_0x0090:
            r14 = 6
        L_0x0091:
            byte[] r5 = new byte[r14]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r0.mo4137(r5, r14)     // Catch:{ Exception -> 0x0264 }
            o.yf r14 = new o.yf     // Catch:{ Exception -> 0x0264 }
            r14.<init>(r15, r5)     // Catch:{ Exception -> 0x0264 }
            java.util.List<o.xw> r0 = r13.f5629     // Catch:{ Exception -> 0x0264 }
            r0.add(r14)     // Catch:{ Exception -> 0x0264 }
            r13.f5626 = r14     // Catch:{ Exception -> 0x0264 }
            o.yf r0 = r13.f5626     // Catch:{ Exception -> 0x0264 }
            boolean r0 = r0.mo4162()     // Catch:{ Exception -> 0x0264 }
            if (r0 == 0) goto L_0x001d
            o.xo r0 = new o.xo     // Catch:{ Exception -> 0x0264 }
            o.xo$鷭 r1 = p004o.C0942xo.C0943.rarEncryptedException     // Catch:{ Exception -> 0x0264 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0264 }
            throw r0     // Catch:{ Exception -> 0x0264 }
        L_0x00b4:
            r0 = 8
            byte[] r14 = new byte[r0]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r1 = 8
            r0.mo4137(r14, r1)     // Catch:{ Exception -> 0x0264 }
            o.yj r0 = new o.yj     // Catch:{ Exception -> 0x0264 }
            r0.<init>(r15, r14)     // Catch:{ Exception -> 0x0264 }
            r14 = r0
            java.util.List<o.xw> r0 = r13.f5629     // Catch:{ Exception -> 0x0264 }
            r0.add(r14)     // Catch:{ Exception -> 0x0264 }
            goto L_0x001d
        L_0x00cc:
            r0 = 7
            byte[] r14 = new byte[r0]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r1 = 7
            r0.mo4137(r14, r1)     // Catch:{ Exception -> 0x0264 }
            o.xv r0 = new o.xv     // Catch:{ Exception -> 0x0264 }
            r0.<init>(r15, r14)     // Catch:{ Exception -> 0x0264 }
            r14 = r0
            java.util.List<o.xw> r0 = r13.f5629     // Catch:{ Exception -> 0x0264 }
            r0.add(r14)     // Catch:{ Exception -> 0x0264 }
            goto L_0x001d
        L_0x00e2:
            r0 = 6
            byte[] r14 = new byte[r0]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r1 = 6
            r0.mo4137(r14, r1)     // Catch:{ Exception -> 0x0264 }
            o.xy r0 = new o.xy     // Catch:{ Exception -> 0x0264 }
            r0.<init>(r15, r14)     // Catch:{ Exception -> 0x0264 }
            r14 = r0
            java.util.List<o.xw> r0 = r13.f5629     // Catch:{ Exception -> 0x0264 }
            r0.add(r14)     // Catch:{ Exception -> 0x0264 }
            long r0 = r14.mo4143()     // Catch:{ Exception -> 0x0264 }
            short r2 = r14.mo4146()     // Catch:{ Exception -> 0x0264 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x0264 }
            long r8 = r0 + r2
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r0.mo4139(r8)     // Catch:{ Exception -> 0x0264 }
            goto L_0x001d
        L_0x0108:
            r14 = 0
            boolean r0 = r15.mo4153()     // Catch:{ Exception -> 0x0264 }
            if (r0 == 0) goto L_0x0111
            int r14 = r14 + 4
        L_0x0111:
            boolean r0 = r15.mo4151()     // Catch:{ Exception -> 0x0264 }
            if (r0 == 0) goto L_0x0119
            int r14 = r14 + 2
        L_0x0119:
            if (r14 <= 0) goto L_0x0128
            byte[] r5 = new byte[r14]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r0.mo4137(r5, r14)     // Catch:{ Exception -> 0x0264 }
            o.ya r14 = new o.ya     // Catch:{ Exception -> 0x0264 }
            r14.<init>(r15, r5)     // Catch:{ Exception -> 0x0264 }
            goto L_0x012e
        L_0x0128:
            o.ya r14 = new o.ya     // Catch:{ Exception -> 0x0264 }
            r0 = 0
            r14.<init>(r15, r0)     // Catch:{ Exception -> 0x0264 }
        L_0x012e:
            java.util.List<o.xw> r0 = r13.f5629     // Catch:{ Exception -> 0x0264 }
            r0.add(r14)     // Catch:{ Exception -> 0x0264 }
            goto L_0x026e
        L_0x0135:
            r0 = 4
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r1 = 4
            r0.mo4137(r5, r1)     // Catch:{ Exception -> 0x0264 }
            o.xx r0 = new o.xx     // Catch:{ Exception -> 0x0264 }
            r0.<init>(r15, r5)     // Catch:{ Exception -> 0x0264 }
            r15 = r0
            int[] r0 = m1623()     // Catch:{ Exception -> 0x0264 }
            o.yn r1 = r15.mo4149()     // Catch:{ Exception -> 0x0264 }
            int r1 = r1.ordinal()     // Catch:{ Exception -> 0x0264 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x0264 }
            switch(r0) {
                case 3: goto L_0x016a;
                case 4: goto L_0x0254;
                case 5: goto L_0x0254;
                case 6: goto L_0x01c1;
                case 7: goto L_0x0198;
                case 8: goto L_0x0254;
                case 9: goto L_0x016a;
                default: goto L_0x0155;
            }     // Catch:{ Exception -> 0x0264 }
        L_0x0155:
            goto L_0x0254
        L_0x016a:
            short r0 = r15.mo4146()     // Catch:{ Exception -> 0x0264 }
            int r0 = r0 + -7
            int r14 = r0 + -4
            byte[] r5 = new byte[r14]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r0.mo4137(r5, r14)     // Catch:{ Exception -> 0x0264 }
            o.yb r14 = new o.yb     // Catch:{ Exception -> 0x0264 }
            r14.<init>(r15, r5)     // Catch:{ Exception -> 0x0264 }
            java.util.List<o.xw> r0 = r13.f5629     // Catch:{ Exception -> 0x0264 }
            r0.add(r14)     // Catch:{ Exception -> 0x0264 }
            long r0 = r14.mo4143()     // Catch:{ Exception -> 0x0264 }
            short r2 = r14.mo4146()     // Catch:{ Exception -> 0x0264 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x0264 }
            long r0 = r0 + r2
            long r2 = r14.f5719     // Catch:{ Exception -> 0x0264 }
            long r8 = r0 + r2
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r0.mo4139(r8)     // Catch:{ Exception -> 0x0264 }
            goto L_0x001d
        L_0x0198:
            short r0 = r15.mo4146()     // Catch:{ Exception -> 0x0264 }
            int r0 = r0 + -7
            int r14 = r0 + -4
            byte[] r5 = new byte[r14]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r0.mo4137(r5, r14)     // Catch:{ Exception -> 0x0264 }
            o.yi r14 = new o.yi     // Catch:{ Exception -> 0x0264 }
            r14.<init>(r15, r5)     // Catch:{ Exception -> 0x0264 }
            long r0 = r14.mo4143()     // Catch:{ Exception -> 0x0264 }
            short r2 = r14.mo4146()     // Catch:{ Exception -> 0x0264 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x0264 }
            long r0 = r0 + r2
            long r2 = r14.f5666     // Catch:{ Exception -> 0x0264 }
            long r8 = r0 + r2
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r0.mo4139(r8)     // Catch:{ Exception -> 0x0264 }
            goto L_0x001d
        L_0x01c1:
            r0 = 3
            byte[] r14 = new byte[r0]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r1 = 3
            r0.mo4137(r14, r1)     // Catch:{ Exception -> 0x0264 }
            o.yk r0 = new o.yk     // Catch:{ Exception -> 0x0264 }
            r0.<init>(r15, r14)     // Catch:{ Exception -> 0x0264 }
            r15 = r0
            r0.mo4150()     // Catch:{ Exception -> 0x0264 }
            int[] r0 = m1624()     // Catch:{ Exception -> 0x0264 }
            short r1 = r15.f5755     // Catch:{ Exception -> 0x0264 }
            o.yl r1 = p004o.C0971yl.m1675(r1)     // Catch:{ Exception -> 0x0264 }
            int r1 = r1.ordinal()     // Catch:{ Exception -> 0x0264 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x0264 }
            switch(r0) {
                case 1: goto L_0x0214;
                case 2: goto L_0x0232;
                case 3: goto L_0x01f8;
                case 4: goto L_0x0212;
                case 5: goto L_0x022e;
                case 6: goto L_0x0230;
                default: goto L_0x01e6;
            }     // Catch:{ Exception -> 0x0264 }
        L_0x01e6:
            goto L_0x0252
        L_0x01f8:
            r0 = 8
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r1 = 8
            r0.mo4137(r5, r1)     // Catch:{ Exception -> 0x0264 }
            o.ye r14 = new o.ye     // Catch:{ Exception -> 0x0264 }
            r14.<init>(r15, r5)     // Catch:{ Exception -> 0x0264 }
            r14.mo4150()     // Catch:{ Exception -> 0x0264 }
            java.util.List<o.xw> r0 = r13.f5629     // Catch:{ Exception -> 0x0264 }
            r0.add(r14)     // Catch:{ Exception -> 0x0264 }
            goto L_0x001d
        L_0x0212:
            goto L_0x001d
        L_0x0214:
            r0 = 10
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r1 = 10
            r0.mo4137(r5, r1)     // Catch:{ Exception -> 0x0264 }
            o.xz r14 = new o.xz     // Catch:{ Exception -> 0x0264 }
            r14.<init>(r15, r5)     // Catch:{ Exception -> 0x0264 }
            r14.mo4150()     // Catch:{ Exception -> 0x0264 }
            java.util.List<o.xw> r0 = r13.f5629     // Catch:{ Exception -> 0x0264 }
            r0.add(r14)     // Catch:{ Exception -> 0x0264 }
            goto L_0x001d
        L_0x022e:
            goto L_0x001d
        L_0x0230:
            goto L_0x001d
        L_0x0232:
            short r14 = r15.mo4146()     // Catch:{ Exception -> 0x0264 }
            int r14 = r14 + -7
            int r14 = r14 + -4
            int r14 = r14 + -3
            byte[] r5 = new byte[r14]     // Catch:{ Exception -> 0x0264 }
            o.xr r0 = r13.f5636     // Catch:{ Exception -> 0x0264 }
            r0.mo4137(r5, r14)     // Catch:{ Exception -> 0x0264 }
            o.ym r14 = new o.ym     // Catch:{ Exception -> 0x0264 }
            r14.<init>(r15, r5)     // Catch:{ Exception -> 0x0264 }
            r14.mo4150()     // Catch:{ Exception -> 0x0264 }
            java.util.List<o.xw> r0 = r13.f5629     // Catch:{ Exception -> 0x0264 }
            r0.add(r14)     // Catch:{ Exception -> 0x0264 }
            goto L_0x001d
        L_0x0252:
            goto L_0x001d
        L_0x0254:
            java.util.logging.Logger r0 = f5622     // Catch:{ Exception -> 0x0264 }
            java.lang.String r1 = "Unknown Header"
            r0.warning(r1)     // Catch:{ Exception -> 0x0264 }
            o.xo r0 = new o.xo     // Catch:{ Exception -> 0x0264 }
            o.xo$鷭 r1 = p004o.C0942xo.C0943.notRarArchive     // Catch:{ Exception -> 0x0264 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0264 }
            throw r0     // Catch:{ Exception -> 0x0264 }
        L_0x0263:
            goto L_0x026e
        L_0x0264:
            r13 = move-exception
            java.util.logging.Logger r0 = f5622
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r2 = "exception in archive constructor maybe file is encrypted or currupt"
            r0.log(r1, r2, r13)
        L_0x026e:
            java.util.List<o.xw> r0 = r12.f5629
            java.util.Iterator r14 = r0.iterator()
            goto L_0x028e
        L_0x0275:
            java.lang.Object r0 = r14.next()
            o.xw r0 = (p004o.C0951xw) r0
            r13 = r0
            o.yn r0 = r13.mo4149()
            o.yn r1 = p004o.C0973yn.FileHeader
            if (r0 != r1) goto L_0x028e
            long r0 = r12.f5628
            r2 = r13
            o.yb r2 = (p004o.C0961yb) r2
            long r2 = r2.f5719
            long r0 = r0 + r2
            r12.f5628 = r0
        L_0x028e:
            boolean r0 = r14.hasNext()
            if (r0 != 0) goto L_0x0275
            o.xk r0 = r12.f5634
            if (r0 == 0) goto L_0x02a1
            o.xk r0 = r12.f5634
            long r1 = r12.f5632
            long r3 = r12.f5628
            r0.mo4116(r1, r3)
        L_0x02a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0937xj.m1625(o.xt, long):void");
    }

    /* renamed from: 鷭 */
    public final C0961yb mo4129() {
        int size = this.f5629.size();
        while (this.f5635 < size) {
            List<C0951xw> list = this.f5629;
            int i = this.f5635;
            this.f5635 = i + 1;
            C0951xw xwVar = (C0951xw) list.get(i);
            if (xwVar.mo4149() == C0973yn.FileHeader) {
                return (C0961yb) xwVar;
            }
        }
        return null;
    }

    public void close() {
        if (this.f5636 != null) {
            this.f5636.close();
            this.f5636 = null;
        }
        if (this.f5627 != null) {
            C0975yp ypVar = this.f5627;
            if (ypVar.f5815 != null) {
                C1000zm zmVar = ypVar.f5815.f5929;
                if (zmVar != null) {
                    zmVar.mo4243();
                }
            }
        }
    }

    /* renamed from: 鷭 */
    public final void mo4130(C0944xp xpVar) {
        this.f5630 = xpVar;
        m1625(xpVar.mo4132(), xpVar.mo4131());
    }
}

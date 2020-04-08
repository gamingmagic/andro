package p004o;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: o.cj */
class C0246cj {

    /* renamed from: ą */
    private static final Integer f594 = Integer.valueOf(0);

    /* renamed from: ˮ͈ */
    static final ArrayList<Integer> f595 = new ArrayList<>();

    /* renamed from: 櫯 */
    private static ArrayList<C0246cj> f596 = new ArrayList<>();

    /* renamed from: 鷭 */
    private static final HashMap<String, C0246cj> f597 = new HashMap<>();

    /* renamed from: Ą */
    public String f598;

    /* renamed from: Ć */
    private long f599;

    /* renamed from: ć */
    private int f600;

    /* renamed from: ȃ */
    int f601 = 0;

    /* renamed from: ˮ͍ */
    private boolean f602;

    static {
    }

    /* renamed from: 鷭 */
    public static <E extends C0246cj> E m230(String str, Class<E> cls, boolean z, String str2) {
        try {
            return m229(str, cls);
        } catch (C0825tu unused) {
            if (!z) {
                return null;
            }
            C0592ns.m674("Resource not found. Server=" + C1014.f6140.f4522 + " class=" + cls + " filename=" + str);
            return m229(str2, cls);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r3 = (p004o.C0246cj) r7.newInstance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x003d, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0047, code lost:
        throw new java.lang.RuntimeException("Illegal access exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0049, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0053, code lost:
        throw new java.lang.RuntimeException("Instantiate exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0054, code lost:
        r3.f598 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005a, code lost:
        if (r3.mo3599() != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x005d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x005e, code lost:
        r4 = r3;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0060, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r4.f600++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0067, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x006c, code lost:
        r7 = f597;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x006e, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        f597.put(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0074, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0079, code lost:
        return r3;
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <E extends p004o.C0246cj> E m229(java.lang.String r6, java.lang.Class<E> r7) {
        /*
            if (r6 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            java.util.HashMap<java.lang.String, o.cj> r3 = f597
            monitor-enter(r3)
            java.util.HashMap<java.lang.String, o.cj> r0 = f597     // Catch:{ all -> 0x0031 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0031 }
            o.cj r0 = (p004o.C0246cj) r0     // Catch:{ all -> 0x0031 }
            r2 = r0
            if (r2 == 0) goto L_0x002f
            r4 = r2
            r5 = r2
            monitor-enter(r2)     // Catch:{ all -> 0x0031 }
            int r0 = r4.f600     // Catch:{ all -> 0x001d }
            int r0 = r0 + 1
            r4.f600 = r0     // Catch:{ all -> 0x001d }
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            goto L_0x0020
        L_0x001d:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0020:
            java.lang.Object r0 = r7.cast(r2)     // Catch:{ ClassCastException -> 0x0028 }
            o.cj r0 = (p004o.C0246cj) r0     // Catch:{ ClassCastException -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return r0
        L_0x0028:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            r0 = 0
            return r0
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            goto L_0x0034
        L_0x0031:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0
        L_0x0034:
            java.lang.Object r0 = r7.newInstance()     // Catch:{ IllegalAccessException -> 0x003c, InstantiationException -> 0x0048 }
            o.cj r0 = (p004o.C0246cj) r0     // Catch:{ IllegalAccessException -> 0x003c, InstantiationException -> 0x0048 }
            r3 = r0
            goto L_0x0054
        L_0x003c:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Illegal access exception"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Instantiate exception"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            r3.f598 = r6
            boolean r0 = r3.mo3599()
            if (r0 != 0) goto L_0x005e
            r0 = 0
            return r0
        L_0x005e:
            r4 = r3
            r5 = r3
            monitor-enter(r3)
            int r0 = r4.f600     // Catch:{ all -> 0x0069 }
            int r0 = r0 + 1
            r4.f600 = r0     // Catch:{ all -> 0x0069 }
            monitor-exit(r5)     // Catch:{ all -> 0x0069 }
            goto L_0x006c
        L_0x0069:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0069 }
            throw r0
        L_0x006c:
            java.util.HashMap<java.lang.String, o.cj> r7 = f597
            monitor-enter(r7)
            java.util.HashMap<java.lang.String, o.cj> r0 = f597     // Catch:{ all -> 0x0076 }
            r0.put(r6, r3)     // Catch:{ all -> 0x0076 }
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            goto L_0x0079
        L_0x0076:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            throw r0
        L_0x0079:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0246cj.m229(java.lang.String, java.lang.Class):o.cj");
    }

    /* renamed from: 鷭 */
    static void m231() {
        C0246cj[] cjVarArr;
        synchronized (f595) {
            f595.clear();
        }
        synchronized (f597) {
            cjVarArr = new C0246cj[f597.size()];
            int i = 0;
            for (Entry value : f597.entrySet()) {
                int i2 = i;
                i++;
                cjVarArr[i2] = (C0246cj) value.getValue();
            }
        }
        C0246cj[] cjVarArr2 = cjVarArr;
        int length = cjVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            cjVarArr2[i3].mo3599();
        }
    }

    /* renamed from: 櫯 */
    static IntBuffer m228() {
        IntBuffer allocate;
        if (f595.isEmpty()) {
            return null;
        }
        synchronized (f595) {
            allocate = IntBuffer.allocate(f595.size());
            Iterator it = f595.iterator();
            while (it.hasNext()) {
                allocate.put(((Integer) it.next()).intValue());
            }
            allocate.position(0);
            f595.clear();
        }
        return allocate;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 152 */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0071, code lost:
        r7.mo3600();
     */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m227() {
        /*
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Integer r7 = f594
            monitor-enter(r7)
            java.util.ArrayList<o.cj> r6 = f596     // Catch:{ all -> 0x0018 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0018 }
            java.util.ArrayList<o.cj> r1 = f596     // Catch:{ all -> 0x0018 }
            int r1 = r1.size()     // Catch:{ all -> 0x0018 }
            r0.<init>(r1)     // Catch:{ all -> 0x0018 }
            f596 = r0     // Catch:{ all -> 0x0018 }
            monitor-exit(r7)     // Catch:{ all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0018 }
            throw r0
        L_0x001b:
            java.util.Iterator r8 = r6.iterator()
            goto L_0x0029
        L_0x0020:
            java.lang.Object r0 = r8.next()
            o.cj r0 = (p004o.C0246cj) r0
            r1 = 0
            r0.f602 = r1
        L_0x0029:
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L_0x0020
            java.util.Iterator r8 = r6.iterator()
            goto L_0x0077
        L_0x0035:
            java.lang.Object r0 = r8.next()
            o.cj r0 = (p004o.C0246cj) r0
            r7 = r0
            int r0 = r7.f600
            if (r0 > 0) goto L_0x0074
            boolean r0 = r7.f602
            if (r0 != 0) goto L_0x0074
            long r0 = r7.f599
            long r0 = r4 - r0
            r2 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005c
            java.lang.Integer r6 = f594
            monitor-enter(r6)
            java.util.ArrayList<o.cj> r0 = f596     // Catch:{ all -> 0x0059 }
            r0.add(r7)     // Catch:{ all -> 0x0059 }
            monitor-exit(r6)     // Catch:{ all -> 0x0059 }
            goto L_0x0074
        L_0x0059:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0059 }
            throw r0
        L_0x005c:
            java.util.HashMap<java.lang.String, o.cj> r6 = f597
            monitor-enter(r6)
            int r0 = r7.f600     // Catch:{ all -> 0x006e }
            if (r0 <= 0) goto L_0x0065
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            goto L_0x0077
        L_0x0065:
            java.util.HashMap<java.lang.String, o.cj> r0 = f597     // Catch:{ all -> 0x006e }
            java.lang.String r1 = r7.f598     // Catch:{ all -> 0x006e }
            r0.remove(r1)     // Catch:{ all -> 0x006e }
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            goto L_0x0071
        L_0x006e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            throw r0
        L_0x0071:
            r7.mo3600()
        L_0x0074:
            r0 = 1
            r7.f602 = r0
        L_0x0077:
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L_0x0035
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0246cj.m227():void");
    }

    C0246cj() {
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        mo3600();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ȃ */
    public final void mo3601() {
        synchronized (this) {
            int i = this.f600 - 1;
            this.f600 = i;
            if (i <= 0) {
                if (i < 0) {
                    synchronized (f597) {
                        if (f597.get(this.f598) == null) {
                            return;
                        }
                    }
                }
                this.f599 = System.currentTimeMillis();
                f596.add(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ą */
    public final boolean mo3599() {
        switch (this.f601) {
            case 1:
                return true;
            case 2:
                return mo3603((byte[]) null);
            default:
                byte[] bArr = (byte[]) C1014.f6158.f677.mo3613(mo3602(this.f598), false);
                if (bArr == null) {
                    return false;
                }
                this.f601 = 1;
                return mo3603(bArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public String mo3602(String str) {
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ą */
    public void mo3600() {
    }

    /* renamed from: 鷭 */
    public boolean mo3603(byte[] bArr) {
        return false;
    }
}

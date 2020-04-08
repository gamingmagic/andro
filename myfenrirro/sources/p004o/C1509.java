package p004o;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import p004o.C1782.C1783if;
import p004o.C1782.C1786;

/* renamed from: o.䯲 */
public class C1509 implements Runnable {

    /* renamed from: Ą */
    private final /* synthetic */ C1783if f7251 = null;

    /* renamed from: ȃ */
    private final /* synthetic */ Handler f7252;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ C1786 f7253;

    /* renamed from: 櫯 */
    private final /* synthetic */ List f7254;

    /* renamed from: 鷭 */
    final /* synthetic */ C1782 f7255;

    public C1509(C1782 r2, ArrayList arrayList, C1786 r4, Handler handler, C1783if ifVar) {
        this.f7255 = r2;
        this.f7254 = arrayList;
        this.f7253 = r4;
        this.f7252 = handler;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 140 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r11.f7254
            java.util.Iterator r6 = r0.iterator()
            goto L_0x00fb
        L_0x000d:
            java.lang.Object r0 = r6.next()
            o.刴 r0 = (p004o.C1530) r0
            r5 = r0
            o.鑺 r7 = r11.f7255     // Catch:{ 櫂 -> 0x00f5 }
            r8 = r5
            java.lang.String r0 = "consume"
            r7.mo4508(r0)     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.String r0 = r8.f7295     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.String r1 = "inapp"
            boolean r0 = r0.equals(r1)     // Catch:{ 櫂 -> 0x00f5 }
            if (r0 != 0) goto L_0x0045
            o.櫂 r0 = new o.櫂     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.String r2 = "Items of type '"
            r1.<init>(r2)     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.String r2 = r8.f7295     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.String r2 = "' can't be consumed."
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.String r1 = r1.toString()     // Catch:{ 櫂 -> 0x00f5 }
            r2 = -1010(0xfffffffffffffc0e, float:NaN)
            r0.<init>(r2, r1)     // Catch:{ 櫂 -> 0x00f5 }
            throw r0     // Catch:{ 櫂 -> 0x00f5 }
        L_0x0045:
            java.lang.String r9 = r8.f7289     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.String r10 = r8.f7290     // Catch:{ RemoteException -> 0x00c2 }
            if (r9 == 0) goto L_0x0053
            java.lang.String r0 = ""
            boolean r0 = r9.equals(r0)     // Catch:{ RemoteException -> 0x00c2 }
            if (r0 == 0) goto L_0x009d
        L_0x0053:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.String r1 = "Can't consume "
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.StringBuilder r0 = r0.append(r10)     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.String r1 = ". No token."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.String r5 = r0.toString()     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.String r0 = r7.f8316     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.String r2 = "In-app billing error: "
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.String r1 = r1.toString()     // Catch:{ RemoteException -> 0x00c2 }
            android.util.Log.e(r0, r1)     // Catch:{ RemoteException -> 0x00c2 }
            o.櫂 r0 = new o.櫂     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.String r2 = "PurchaseInfo is missing token for sku: "
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.StringBuilder r1 = r1.append(r10)     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.StringBuilder r1 = r1.append(r8)     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.String r1 = r1.toString()     // Catch:{ RemoteException -> 0x00c2 }
            r2 = -1007(0xfffffffffffffc11, float:NaN)
            r0.<init>(r2, r1)     // Catch:{ RemoteException -> 0x00c2 }
            throw r0     // Catch:{ RemoteException -> 0x00c2 }
        L_0x009d:
            o.鷭 r0 = r7.f8308     // Catch:{ RemoteException -> 0x00c2 }
            android.content.Context r1 = r7.f8307     // Catch:{ RemoteException -> 0x00c2 }
            r1.getPackageName()     // Catch:{ RemoteException -> 0x00c2 }
            int r7 = r0.mo4540()     // Catch:{ RemoteException -> 0x00c2 }
            if (r7 == 0) goto L_0x00da
            p004o.C1782.m2448(r7)     // Catch:{ RemoteException -> 0x00c2 }
            o.櫂 r0 = new o.櫂     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.String r2 = "Error consuming sku "
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.StringBuilder r1 = r1.append(r10)     // Catch:{ RemoteException -> 0x00c2 }
            java.lang.String r1 = r1.toString()     // Catch:{ RemoteException -> 0x00c2 }
            r0.<init>(r7, r1)     // Catch:{ RemoteException -> 0x00c2 }
            throw r0     // Catch:{ RemoteException -> 0x00c2 }
        L_0x00c2:
            r9 = move-exception
            o.櫂 r0 = new o.櫂     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.String r2 = "Remote exception while consuming. PurchaseInfo: "
            r1.<init>(r2)     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.StringBuilder r1 = r1.append(r8)     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.String r1 = r1.toString()     // Catch:{ 櫂 -> 0x00f5 }
            r2 = -1001(0xfffffffffffffc17, float:NaN)
            r0.<init>(r2, r1, r9)     // Catch:{ 櫂 -> 0x00f5 }
            throw r0     // Catch:{ 櫂 -> 0x00f5 }
        L_0x00da:
            o.ậ r0 = new o.ậ     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.String r2 = "Successful consume of sku "
            r1.<init>(r2)     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.String r2 = r5.f7290     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ 櫂 -> 0x00f5 }
            java.lang.String r1 = r1.toString()     // Catch:{ 櫂 -> 0x00f5 }
            r2 = 0
            r0.<init>(r2, r1)     // Catch:{ 櫂 -> 0x00f5 }
            r4.add(r0)     // Catch:{ 櫂 -> 0x00f5 }
            goto L_0x00fb
        L_0x00f5:
            r5 = move-exception
            o.ậ r0 = r5.f7614
            r4.add(r0)
        L_0x00fb:
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L_0x000d
            o.鑺 r5 = r11.f7255
            java.lang.String r0 = ""
            r5.f8306 = r0
            r0 = 0
            r5.f8310 = r0
            o.鑺$鷭 r0 = r11.f7253
            if (r0 == 0) goto L_0x011c
            android.os.Handler r0 = r11.f7252
            o.閇 r1 = new o.閇
            o.鑺$鷭 r2 = r11.f7253
            java.util.List r3 = r11.f7254
            r1.<init>(r11, r2, r3, r4)
            r0.post(r1)
        L_0x011c:
            o.鑺$if r0 = r11.f7251
            if (r0 == 0) goto L_0x012e
            android.os.Handler r0 = r11.f7252
            o.祽 r1 = new o.祽
            o.鑺$if r2 = r11.f7251
            java.util.List r3 = r11.f7254
            r1.<init>(r11, r2, r3, r4)
            r0.post(r1)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1509.run():void");
    }
}

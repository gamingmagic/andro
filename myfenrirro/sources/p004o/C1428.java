package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import com.roworkshop.p003ro.natives;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import p004o.C0643pc.C0645;
import p004o.C0643pc.aux;

/* renamed from: o.㯲 */
public class C1428 extends C0445ip {

    /* renamed from: 㥳 */
    private static /* synthetic */ int[] f6998;

    /* renamed from: Ą */
    C1429 f6999;

    /* renamed from: ą */
    C0660pj f7000;

    /* renamed from: Ć */
    C0663pk f7001;

    /* renamed from: ć */
    long f7002;

    /* renamed from: ċ */
    C1357 f7003 = new C1357();

    /* renamed from: đ */
    boolean[] f7004 = new boolean[0];

    /* renamed from: Ē */
    private long f7005;

    /* renamed from: ē */
    private String f7006;

    /* renamed from: ȃ */
    public C1429 f7007;

    /* renamed from: Ȋ */
    boolean f7008 = true;

    /* renamed from: ˮ͈ */
    C1429 f7009;

    /* renamed from: ˮ͍ */
    public long f7010;

    /* renamed from: ܕ */
    final int f7011;

    /* renamed from: 䒧 */
    ByteBuffer f7012;

    /* renamed from: 岱 */
    public long f7013;

    /* renamed from: 庸 */
    final int f7014;

    /* renamed from: 櫯 */
    public C0757sv f7015;

    /* renamed from: 纫 */
    C0612oj f7016;

    /* renamed from: 躆 */
    final int f7017;

    /* renamed from: 鷭 */
    public C0758sw f7018;

    /* renamed from: 띥 */
    private Runnable f7019 = new C1672(this);

    /* renamed from: o.㯲$鷭 */
    public class C1429 {

        /* renamed from: Ą */
        Runnable f7020;

        /* renamed from: ą */
        Runnable f7021;

        /* renamed from: Ć */
        Runnable f7022;

        /* renamed from: ć */
        long f7023;

        /* renamed from: ċ */
        boolean f7024;

        /* renamed from: ȃ */
        C0598ny f7025;

        /* renamed from: Ȋ */
        BufferedInputStream f7026;

        /* renamed from: ˮ͈ */
        public C0585nl f7027;

        /* renamed from: ˮ͍ */
        C0765ta f7028;

        /* renamed from: 岱 */
        Socket f7030;

        /* renamed from: 櫯 */
        int f7031;

        /* renamed from: 纫 */
        ByteBuffer f7032;

        /* renamed from: 鷭 */
        String f7033;

        C1429() {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:3|4|5|6|7|8|9|10|11|12|13|14|15|(2:16|17)|18|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0048 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ć */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2129() {
        /*
            int[] r0 = f6998
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.nl[] r0 = p004o.C0585nl.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.nl r0 = p004o.C0585nl.CHAR     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.nl r0 = p004o.C0585nl.LOCKER     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.nl r0 = p004o.C0585nl.LOGIN     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.nl r0 = p004o.C0585nl.MAP     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.nl r0 = p004o.C0585nl.MASTER     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            o.nl r0 = p004o.C0585nl.NULL     // Catch:{ NoSuchFieldError -> 0x0048 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            o.nl r0 = p004o.C0585nl.RESOURCE     // Catch:{ NoSuchFieldError -> 0x0052 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            f6998 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1428.m2129():int[]");
    }

    /* renamed from: 鷭 */
    public boolean mo3654() {
        return (this.f7007 == null || this.f7007.f7030 == null || !this.f7007.f7030.isConnected()) ? false : true;
    }

    public C1428(String str, int i, int i2, int i3, int i4) {
        super(str);
        this.f7006 = str;
        this.f7011 = i != 0 ? i : SupportMenu.USER_MASK;
        this.f7014 = SupportMenu.USER_MASK;
        this.f7017 = i4;
        if (this.f7014 < 65535) {
            throw new IllegalArgumentException();
        } else if (this.f7011 < 100) {
            throw new IllegalArgumentException();
        } else {
            this.f7018 = new C0758sw(i3);
        }
    }

    /* renamed from: 鷭 */
    public void mo3652(C0839ue ueVar) {
        C1014.f6147.mo3387((Runnable) new C1365(this, ueVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4335(C0839ue ueVar, ByteBuffer byteBuffer, int i) {
        if (C1014.f6140 != null && this.f7007.f7027 == C0585nl.MAP) {
            ((C0183ah) this.f7015).mo3532(ueVar, byteBuffer, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4334(C0839ue ueVar, ByteBuffer byteBuffer, int i) {
        if (!(C1014.f6140 == null || this.f7016 == null || !this.f7016.f2997 || ueVar.getClass() == C1325.class)) {
            boolean z = ueVar.getClass() != $cON.m1858("o.Ŀ");
            boolean z2 = z;
            short s = byteBuffer.getShort(i);
            C0612oj ojVar = this.f7016;
            byteBuffer.putShort(i, z2 ? (short) (((ojVar.f2996 >>> 16) & Short.MAX_VALUE) ^ s) : (short) (((((ojVar.f2998[0] * ojVar.f2998[1]) + ojVar.f2998[2]) >>> 16) & Short.MAX_VALUE) ^ s));
            if (z) {
                C0612oj ojVar2 = this.f7016;
                ojVar2.f2996 = ((ojVar2.f2996 * ojVar2.f2998[1]) + ojVar2.f2998[2]) & -1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4333() {
        if (this.f7007 != null) {
            synchronized (this.f7007) {
                if (!this.f7007.f7030.isClosed()) {
                    try {
                        this.f7007.f7030.close();
                    } catch (IOException e) {
                        throw new C0588no((Exception) e);
                    }
                }
                if (this.f7007.f7026 != null) {
                    try {
                        this.f7007.f7026.close();
                    } catch (IOException unused) {
                    }
                }
                this.f7016 = null;
                this.f6999 = this.f7007;
                this.f7007 = null;
                C0758sw swVar = this.f7018;
                swVar.f4656.f4678 = 0;
                swVar.f4656.f4677 = 0;
            }
        }
    }

    /* renamed from: 櫯 */
    private void m2130(boolean z) {
        int[] iArr;
        if (!(this.f7007.f7027 == C0585nl.RESOURCE)) {
            C1014.f6147.mo3387((Runnable) new C0204b(this));
        }
        Runnable runnable = z ? this.f7007.f7020 : this.f7007.f7021;
        if (runnable != null) {
            this.f7007.f7025.mo3387(runnable);
        }
        if (!z) {
            mo4333();
            return;
        }
        this.f7005 = System.currentTimeMillis();
        this.f7008 = this.f7007.f7027 == C0585nl.RESOURCE;
        if (this.f7007.f7027 == C0585nl.CHAR) {
            this.f7018.f4657 = C1014.f6161.f6162;
        }
        if (this.f7007.f7027 == C0585nl.MAP) {
            if (C1014.f6140.f4464) {
                this.f7018.f4657 = C1014.f6161.f6162;
            }
            C1014.f6152 = new C1734();
            Iterator it = ((C0185ai) C1014.f6147.f51.f1451.f813.getAdapter()).f384.iterator();
            while (it.hasNext()) {
                C0299 r5 = (C0299) ((C0186aj) it.next());
                r5.f819 = false;
                r5.f817.setAdapter(null);
            }
        }
        if (this.f7007.f7027 == C0585nl.MAP && C1014.f6140.f4482) {
            if ((C0595nv.f2879 == C0564mr.all || C0595nv.f2879 == C0564mr.MOTR) && C1014.f6140.f4443 == aux.MOTR) {
                iArr = new int[]{2068070841, 1539072943, 1171918449};
            } else {
                iArr = ((C0183ah) this.f7015).f378;
            }
            if (this.f7007.f7027 != C0585nl.MAP || iArr == null) {
                this.f7016 = null;
            } else {
                this.f7016 = new C0612oj(iArr);
                this.f7016.f2997 = true;
            }
        }
        try {
            this.f7007.f7026 = new BufferedInputStream(this.f7007.f7030.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            if (this.f7007 != null) {
                this.f7007.f7024 = true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3842() {
        while (true) {
            if (this.f1342.size() == 0 && this.f7007 == null) {
                synchronized (this.f1341) {
                    this.f1341.wait();
                }
            }
            while (true) {
                Runnable r1 = mo3841();
                if (r1 == null) {
                    break;
                }
                r1.run();
            }
            mo3649();
        }
    }

    /* renamed from: Ą */
    private boolean mo3647() {
        int i = 0;
        synchronized (this.f7018.f4656) {
            if (!this.f7003.f2995) {
                i = Math.min(this.f7007.f7028.f4677, this.f7018.f4656.f4679.length - this.f7018.f4656.f4677);
                System.arraycopy(this.f7007.f7028.f4679, 0, this.f7018.f4656.f4679, this.f7018.f4656.f4677, i);
            } else if (this.f7007.f7028.f4677 >= 16) {
                i = Math.min((this.f7007.f7028.f4677 / 16) * 16, ((this.f7018.f4656.f4679.length - this.f7018.f4656.f4677) / 16) * 16);
                if (i >= 16) {
                    natives.procpacketrecv(this.f7007.f7028.f4679, i, this.f7003.f2993, this.f7018.f4656.f4679, this.f7018.f4656.f4677);
                }
            }
            this.f7018.f4656.f4677 += i;
            this.f7007.f7028.f4678 = i;
            this.f7007.f7028.mo4099();
        }
        return i > 0;
    }

    /* renamed from: ą */
    private void mo3648() {
        if (!this.f7018.f4655) {
            while (true) {
                if ((!this.f7003.f2995 && this.f7007.f7028.f4677 > 0) || (this.f7003.f2995 && this.f7007.f7028.f4677 >= 16)) {
                    mo3647();
                    synchronized (this.f7004) {
                        if (this.f7018.f4656.f4677 > 0) {
                            C1014.f6147.mo3387(this.f7019);
                            if (this.f7007.f7028.f4677 > 0) {
                                try {
                                    this.f7004.wait();
                                } catch (InterruptedException e) {
                                    throw new C0588no((Exception) e);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ȃ */
    public void mo3649() {
        int i;
        if (this.f7007 != null) {
            if (this.f7007.f7030 == null) {
                throw new C0588no("Unexpected connection state.");
            }
            if (!this.f7007.f7030.isConnected() || this.f7009 != null) {
                if (this.f7007 != null) {
                    this.f7007.f7024 = true;
                }
            }
            if (this.f7007.f7024 && this.f7018.f4656.f4677 == 0 && this.f7007.f7032.position() == 0 && this.f7007.f7032.limit() == this.f7007.f7032.capacity()) {
                if (this.f7007.f7022 != null) {
                    this.f7007.f7025.mo3387(this.f7007.f7022);
                }
                mo4333();
            }
        }
        if (this.f7007 == null && this.f7009 != null) {
            try {
                this.f7007 = this.f7009;
                this.f7009 = null;
                C1357 r6 = this.f7003;
                r6.f2995 = false;
                if (r6.f2995) {
                    r6.f2991 = ByteBuffer.allocate(16);
                } else {
                    r6.f2991 = null;
                }
                mo4336(false);
                new StringBuilder("Connecting to ").append(this.f7007.f7033).append(":").append(this.f7007.f7031).append(" purpose=").append(this.f7007.f7027);
                this.f7007.f7030 = new Socket();
                this.f7007.f7030.setReceiveBufferSize(this.f7011);
                this.f7007.f7030.setTcpNoDelay(false);
                this.f7007.f7030.setTrafficClass(8);
                this.f7007.f7030.setSoTimeout(this.f7017);
                this.f7007.f7030.connect(new InetSocketAddress(this.f7007.f7033, this.f7007.f7031), 10000);
                m2130(true);
            } catch (Exception unused) {
                m2130(false);
            }
        }
        if (this.f7007 != null) {
            mo3648();
            int i2 = C1014.f6161 != null ? C1014.f6161.f6162 : 0;
            if (this.f7008) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f7007 != null) {
                    switch (m2129()[this.f7007.f7027.ordinal()]) {
                        case 2:
                            if (C1014.f6140.f4447 != C0645.AEGIS && currentTimeMillis - this.f7005 > 5000) {
                                mo3652((C0839ue) new C1033(C1014.f6154));
                                this.f7005 = currentTimeMillis;
                                break;
                            }
                        case 3:
                            if (currentTimeMillis - this.f7005 > 12000) {
                                mo3652((C0839ue) new C1097(i2));
                                this.f7005 = currentTimeMillis;
                                break;
                            }
                            break;
                        case 4:
                            if (currentTimeMillis - this.f7005 > 5000) {
                                mo3652((C0839ue) new C1702(currentTimeMillis));
                                if (this.f7000 != null) {
                                    mo3652((C0839ue) new C1415());
                                } else if (this.f7001 != null) {
                                    mo3652((C0839ue) new C1334());
                                }
                                this.f7005 = currentTimeMillis;
                                break;
                            }
                            break;
                        case 5:
                        case 7:
                            break;
                        case 6:
                            if (currentTimeMillis - this.f7005 > 5000) {
                                mo3652((C0839ue) new C0865uz());
                                this.f7005 = currentTimeMillis;
                                break;
                            }
                            break;
                        default:
                            throw new C0588no("unknown connecton purpose " + this.f7007.f7027);
                    }
                }
            }
            try {
                i = this.f7007.f7026.read(this.f7007.f7028.f4679, this.f7007.f7028.f4677, this.f7007.f7028.f4679.length - this.f7007.f7028.f4677);
                if (i > 0) {
                    this.f7007.f7028.f4677 += i;
                }
            } catch (SocketTimeoutException unused2) {
                i = 0;
            } catch (IOException e) {
                e.printStackTrace();
                if (this.f7007 != null) {
                    this.f7007.f7024 = true;
                }
                return;
            }
            mo3648();
            if (i == -1 && !this.f7007.f7024) {
                if (this.f7007 != null) {
                    this.f7007.f7024 = true;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4336(boolean z) {
        if (this.f7018.f4655 && !z) {
            C1014.f6147.mo3387(this.f7019);
        }
        this.f7018.f4655 = z;
    }
}

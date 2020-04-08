package p004o;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.p000v4.media.session.PlaybackStateCompat;
import android.support.p000v4.view.MotionEventCompat;
import android.support.p000v4.view.ViewCompat;
import android.util.Log;
import com.roworkshop.andro.c_point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p004o.C0643pc.C0648;
import p004o.C0643pc.C0650.C0651;
import p004o.C0653pe.C0654if;

/* renamed from: o.cp */
public final class C0252cp extends C0445ip {

    /* renamed from: ć */
    static HashMap<String, C0405hk> f650 = new HashMap<>();

    /* renamed from: ˮ͍ */
    static HashMap<String, C0253if> f651 = new HashMap<>();

    /* renamed from: Ą */
    Bitmap f652;

    /* renamed from: ą */
    Bitmap f653;

    /* renamed from: Ć */
    Bitmap f654;

    /* renamed from: ċ */
    Bitmap f655;

    /* renamed from: đ */
    Bitmap[] f656;

    /* renamed from: Ē */
    Bitmap[] f657;

    /* renamed from: ē */
    Bitmap[] f658;

    /* renamed from: Ė */
    Bitmap f659;

    /* renamed from: ė */
    Bitmap f660;

    /* renamed from: Ę */
    Bitmap f661;

    /* renamed from: ę */
    Bitmap f662;

    /* renamed from: ȃ */
    Bitmap f663;

    /* renamed from: Ȋ */
    Bitmap[] f664;

    /* renamed from: ˮ͈ */
    Bitmap f665;

    /* renamed from: ܕ */
    Bitmap[] f666;

    /* renamed from: ঽ্ */
    boolean[] f667 = new boolean[0];

    /* renamed from: 㥳 */
    Bitmap f668;

    /* renamed from: 䒧 */
    Bitmap f669;

    /* renamed from: 囃 */
    final C1688[] f670 = {C1688.SHORTSWORD, C1688.SWORD, C1688.TWOHANDSWORD, C1688.SPEAR, C1688.TWOHANDSPEAR, C1688.AXE, C1688.TWOHANDAXE, C1688.CATARRH};

    /* renamed from: 岱 */
    Bitmap[] f671;

    /* renamed from: 庸 */
    Bitmap[] f672;

    /* renamed from: 廂 */
    final String f673 = "remote_filelist.txt";

    /* renamed from: 櫯 */
    public C0247ck f674;

    /* renamed from: 纫 */
    Bitmap f675;

    /* renamed from: 躆 */
    Bitmap f676;

    /* renamed from: 鷭 */
    C0248cl f677;

    /* renamed from: 띥 */
    Bitmap[] f678;

    /* renamed from: o.cp$if */
    class C0253if {

        /* renamed from: ˮ͈ */
        int f680;

        /* renamed from: 櫯 */
        int[] f681;

        /* renamed from: 鷭 */
        String f682;

        C0253if() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final int mo3625() {
            if (this.f680 > 0) {
                return this.f680;
            }
            this.f680 = C1812.m2467(16, 16, (Point) null, (byte[]) null, this.f681);
            this.f681 = null;
            return this.f680;
        }
    }

    /* renamed from: o.cp$鷭 */
    class C0254 extends C0658ph {

        /* renamed from: Ą */
        private long f683 = 0;

        /* renamed from: ą */
        private long f684 = 0;

        /* renamed from: ȃ */
        private long f685 = 0;

        /* renamed from: 櫯 */
        long f687;

        /* renamed from: 鷭 */
        long f688;

        C0254() {
        }

        /* renamed from: 鷭 */
        private void m287(long j) {
            if (this.f685 == 0 || j < this.f683) {
                this.f683 = j;
                this.f685 = System.currentTimeMillis();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f685;
            long j2 = currentTimeMillis;
            if (currentTimeMillis >= 3000) {
                this.f684 = (((j - this.f683) * 1000) / j2) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                this.f685 = System.currentTimeMillis();
                this.f683 = j;
            }
        }

        /* renamed from: 鷭 */
        public final void mo3626(long j, long j2) {
            String str;
            m287(j);
            long j3 = this.f688 + j;
            long j4 = this.f687;
            if (this.f684 >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                str = String.format("%.1f MBytes/s", new Object[]{Float.valueOf(((float) this.f684) / 1024.0f)});
            } else {
                str = this.f684 + " Kbytes/s";
            }
            if (j2 < 1) {
                C0453ix ixVar = C1014.f6147.f51;
                String str2 = "Downloading full game client\n" + str + "\n[" + C0622ot.m736(j3) + "] bytes";
                C0453ix ixVar2 = ixVar;
                if (ixVar.f1370 != null) {
                    C1014.f6147.mo3387((Runnable) new C0473jm(ixVar2));
                }
                C1014.f6147.mo3387((Runnable) new C0471jk(ixVar2, str2));
                return;
            }
            C0453ix ixVar3 = C1014.f6147.f51;
            String str3 = "Downloading full game client\n" + str + "\n" + C0622ot.m736(j3) + "/" + C0622ot.m736(j4);
            int i = (int) ((100 * j3) / j4);
            C0453ix ixVar4 = ixVar3;
            if (ixVar3.f1369 != null) {
                C1014.f6147.mo3387((Runnable) new C0473jm(ixVar4));
            }
            C1014.f6147.mo3387((Runnable) new C0469ji(ixVar4, str3, null, i, -1));
        }
    }

    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo3387(Runnable runnable) {
        super.mo3387(runnable);
    }

    static {
    }

    /* renamed from: 鷭 */
    private C0253if m271(String str, boolean z, boolean z2, boolean z3) {
        byte[] bArr;
        String str2;
        if (!z) {
            C0253if ifVar = (C0253if) f651.get(str);
            if (ifVar != null) {
                return ifVar;
            }
        }
        C0253if ifVar2 = new C0253if();
        ifVar2.f682 = str;
        ifVar2.f681 = new int[256];
        C0615om[] omVarArr = new C0615om[256];
        try {
            bArr = (byte[]) this.f677.mo3613("data\\palette\\" + str + ".pal", false);
        } catch (C0825tu e) {
            if (!C1014.f6140.f4465 || z3) {
                throw e;
            }
            C0592ns.m674("Palette not found, server=" + C1014.f6140.f4522 + " palette=" + str);
            if (str.startsWith(C1014.f6158.f674.f623.f7902.f7930)) {
                str2 = C1014.f6158.f674.mo3606(C1761.NOVICE.f8294, 0, (byte) C1977.MALE.ordinal());
            } else {
                str2 = C1014.f6158.f674.mo3611(C1761.NOVICE, 1, 1, (byte) C1977.MALE.ordinal());
            }
            bArr = (byte[]) this.f677.mo3613("data\\palette\\" + str2 + ".pal", false);
        }
        try {
            C0804th.m1504(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN), omVarArr);
            if (z2) {
                for (int i = 0; i < ifVar2.f681.length; i++) {
                    ifVar2.f681[i] = C0621os.m718(omVarArr[i].f3005, omVarArr[i].f3004, omVarArr[i].f3003, omVarArr[i].f3002);
                }
            } else {
                for (int i2 = 0; i2 < ifVar2.f681.length; i2++) {
                    ifVar2.f681[i2] = C0621os.m717(omVarArr[i2].f3005, omVarArr[i2].f3004, omVarArr[i2].f3003, omVarArr[i2].f3002);
                }
            }
            if (!z) {
                synchronized (f651) {
                    f651.put(str, ifVar2);
                }
            }
            return ifVar2;
        } catch (Exception e2) {
            throw new C0588no(e2, "Failed to load palette: " + str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0253if mo3619(C1761 r7, boolean z, int i, int i2, C1977 r11, boolean z2, boolean z3) {
        String str;
        String str2;
        String str3;
        if (z) {
            str = this.f674.mo3606(i, i2, (byte) r11.ordinal());
        } else {
            str = this.f674.mo3611(r7, i, i2, (byte) r11.ordinal());
        }
        try {
            return m271(str, z2, z3, true);
        } catch (C0825tu unused) {
            if (z) {
                str2 = this.f674.mo3606(i, 0, (byte) r11.ordinal());
            } else {
                str2 = this.f674.mo3611(r7, i, 1, (byte) r11.ordinal());
            }
            try {
                C0253if r9 = m271(str2, z2, z3, true);
                if (r9 != null && !str2.equals(str) && !z2) {
                    synchronized (f651) {
                        f651.put(str, r9);
                    }
                }
                return r9;
            } catch (C0825tu unused2) {
                if (z) {
                    str3 = this.f674.mo3606(0, 0, (byte) r11.ordinal());
                } else {
                    str3 = this.f674.mo3611(C1761.NOVICE, 1, 1, (byte) r11.ordinal());
                }
                C0253if r8 = m271(str3, z2, z3, false);
                if (r8 != null && !str2.equals(str) && !z2) {
                    synchronized (f651) {
                        f651.put(str, r8);
                    }
                }
                return r8;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0405hk mo3620(int i) {
        if (i == C1430.WARP_CLASS.f7044) {
            i = 723;
        } else if (i == C1430.FLAG_CLASS.f7044) {
            i = 973;
        } else if (i == 1288) {
            i = 1907;
        }
        if (i == C1430.HIDDEN_WARP_CLASS.f7044 || i == C1430.INVISIBLE_CLASS.f7044 || i == C1430.WARP_DEBUG_CLASS.f7044 || i == C1430.INVISIBLE_CLICKABLE.f7044) {
            return null;
        }
        String r7 = this.f674.mo3605(i, 0);
        if (r7.endsWith("gr2")) {
            r7 = this.f674.mo3605(1002, 0);
        }
        C0405hk hkVar = (C0405hk) C0246cj.m230(r7, C0405hk.class, C1014.f6140.f4465, this.f674.mo3605(1002, 0));
        if (hkVar != null) {
            return hkVar;
        }
        throw new C0588no("Failed to init SPR: " + r7);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0405hk mo3621(int i, byte b, boolean z) {
        if (i >= C1761.BABY.f8294 && i < C1761.SUPER_BABY.f8294) {
            i -= C1761.BABY.f8294;
        } else if (i == C1761.SUPER_BABY.f8294) {
            i = C1761.SUPER_NOVICE.f8294;
        }
        String r5 = this.f674.mo3605(i, b);
        C0405hk hkVar = (C0405hk) C0246cj.m230(r5, C0405hk.class, C1014.f6140.f4465, this.f674.mo3605(C1761.NOVICE.f8294, b));
        if (hkVar == null) {
            throw new C0588no("Failed to init SPR: " + r5);
        }
        if (z) {
            hkVar.mo3599();
            hkVar.f1150 = true;
        }
        return hkVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0405hk mo3623(C1761 r5, int i, byte b, boolean z) {
        String r52 = this.f674.mo3610(r5, i, b);
        C0405hk hkVar = (C0405hk) C0246cj.m230(r52, C0405hk.class, C1014.f6140.f4465, this.f674.mo3610(C1761.NOVICE, i, b));
        if (hkVar == null) {
            throw new C0588no("Failed to init SPR: " + r52);
        }
        if (z) {
            hkVar.mo3599();
            hkVar.f1150 = true;
        }
        return hkVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0405hk mo3622(int i, int i2, byte b, boolean z) {
        String r5 = this.f674.mo3604(i, i2, b);
        C0405hk hkVar = (C0405hk) C0246cj.m230(r5, C0405hk.class, C1014.f6140.f4465, this.f674.mo3604(1, i2, b));
        if (hkVar == null) {
            throw new C0588no("Failed to init SPR: " + r5);
        }
        if (z) {
            hkVar.mo3599();
            hkVar.f1150 = true;
        }
        return hkVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0405hk[] mo3624(C0206bb bbVar) {
        boolean z;
        C0405hk[] hkVarArr;
        String str;
        C0206bb bbVar2 = bbVar;
        switch (C1688.m2357()[this.f674.mo3612(bbVar2.f461, bbVar2.f457).ordinal()]) {
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            hkVarArr = null;
        } else {
            C0247ck ckVar = this.f674;
            C1688 r6 = ckVar.mo3612(bbVar2.f461, bbVar2.f457).mo4458();
            C1688 r7 = ckVar.mo3612(bbVar2.f461, bbVar2.f457).mo4457();
            C1761 r8 = C1761.m2430(bbVar2.f1633);
            if (r6 == null || r7 == null) {
                str = null;
            } else {
                int r9 = bbVar2.mo3557(true);
                if (r9 == C1761.GAMEMASTER.f8294) {
                    str = null;
                } else {
                    C1714 r12 = ckVar.f623;
                    String str2 = bbVar2.f446 == C1977.MALE.ordinal() ? r12.f7901 : r12.f7900;
                    C1716if ifVar = ckVar.f623.f7903.f7907;
                    String str3 = r8 == C1761.SUMMONER ? ifVar.f7918 : ifVar.f7919;
                    String r4 = ckVar.f626.mo3954(r9, bbVar2.f446);
                    if (r4 == null) {
                        C0592ns.m674("jclass == null for class=" + r9);
                        str = null;
                    } else {
                        C0533 r122 = (C0533) ckVar.f614.f1675.get(Integer.valueOf(r6.ordinal()));
                        String str4 = r122 == null ? null : r122.f1679;
                        if (str4 == null) {
                            C0592ns.m674("jspritename == null for view=" + r6);
                            str = null;
                        } else {
                            C0533 r123 = (C0533) ckVar.f614.f1675.get(Integer.valueOf(r7.ordinal()));
                            String str5 = r123 == null ? null : r123.f1679;
                            if (str5 == null) {
                                C0592ns.m674("jspritename == null for view=" + r7);
                                str = null;
                            } else {
                                String sb = new StringBuilder(String.valueOf(str3)).append("\\").append(r4).append("\\").append(r4).append("_").append(str2).toString();
                                str = ((r9 == C1761.KAGEROU.f8294 || r9 == C1761.OBORO.f8294) && r6 == C1688.SHORTSWORD && r7 == C1688.SHORTSWORD) ? new StringBuilder(String.valueOf(sb)).append(str4).toString() : (r6 == C1688.AXE || (r6 == C1688.SWORD && r7 == C1688.SHORTSWORD)) ? new StringBuilder(String.valueOf(sb)).append(str5).append(str4).toString() : new StringBuilder(String.valueOf(sb)).append(str4).append(str5).toString();
                            }
                        }
                    }
                }
            }
            if (str == null) {
                hkVarArr = null;
            } else {
                hkVarArr = new C0405hk[3];
                hkVarArr[0] = (C0405hk) C0246cj.m229(str, C0405hk.class);
                hkVarArr[2] = (C0405hk) C0246cj.m229(new StringBuilder(String.valueOf(str)).append("_").append(this.f674.f623.f7903.f7907.f7914).toString(), C0405hk.class);
            }
        }
        C0405hk[] hkVarArr2 = hkVarArr;
        if (hkVarArr != null) {
            return hkVarArr2;
        }
        C0405hk hkVar = null;
        C0405hk hkVar2 = null;
        try {
            C1761 r5 = C1761.m2430(bbVar.f1633).mo4502().mo4396().mo4398(C1977.values()[bbVar.f446]);
            if (bbVar.f461 > 0) {
                C1701 r124 = this.f674.f608.mo4465(bbVar.f461);
                String r72 = this.f674.mo3607(r124 == null ? -1 : r124.f7762, bbVar);
                C1688 r62 = this.f674.mo3612(bbVar.f461, 0);
                hkVar = (C0405hk) C0246cj.m230(r72, C0405hk.class, true, null);
                if (!(hkVar != null || r62 == null || r62 == C1688.NONE)) {
                    hkVar = (C0405hk) C0246cj.m229(this.f674.mo3607(r62.ordinal(), bbVar), C0405hk.class);
                }
                if (!(hkVar == null || r62 == null || r62 == C1688.NONE)) {
                    hkVar2 = m272(r62, bbVar);
                }
            }
            int i = bbVar.f457;
            C1701 r125 = this.f674.f608.mo4465(i);
            int i2 = r125 == null ? -1 : r125.f7762;
            if (i2 >= 0) {
                i = i2;
            }
            if (i < 0 || i >= C1881.values().length) {
                C0592ns.m674("Invalid shield type requested " + i + ", defaulting to " + C1881.GUARD.name());
                i = C1881.GUARD.ordinal();
            }
            C1881 r63 = C1881.values()[i];
            C0405hk hkVar3 = null;
            if (r63 != C1881.NONE) {
                if (r5 == C1761.TAEKWON || r5 == C1761.NINJA || r5 == C1761.GUNSLINGER || bbVar.f1633 == C1761.WEDDING.f8294 || bbVar.f1633 == C1761.XMAS.f8294 || bbVar.f1633 == C1761.SUMMER.f8294) {
                    hkVar3 = null;
                } else if (r63 == C1881.SHIELD) {
                    if (r5 != C1761.SWORDMAN) {
                        hkVar3 = null;
                    }
                } else if (r63 != C1881.BUCKLER && r63 != C1881.SHIELD && r63 != C1881.MIRRORSHIELD) {
                    C0247ck ckVar2 = this.f674;
                    int i3 = bbVar.f1633;
                    byte b = bbVar.f446;
                    C1881 r73 = r63;
                    int i4 = C1570.m2254(C1761.m2430(i3).mo4502().f7485 & 4095).mo4398(C1977.values()[b]).f8294;
                    String str6 = ckVar2.f623.f7903.f7912;
                    C1714 r11 = ckVar2.f623;
                    String str7 = b == C1977.MALE.ordinal() ? r11.f7901 : r11.f7900;
                    String r82 = ckVar2.f626.mo3954(i4, b);
                    String sb2 = new StringBuilder(String.valueOf(str6)).append("\\").append(r82).append("\\").append(r82).append("_").append(str7).append("_").append(ckVar2.f606.f940[r73.ordinal()]).toString();
                    new StringBuilder("Loading ").append(C1761.m2430(bbVar.f1633)).append(" shield ").append(r63.name()).append(" sprite ").append(sb2);
                    hkVar3 = (C0405hk) C0246cj.m229(sb2, C0405hk.class);
                } else if (r5 == C1761.MAGE || r5 == C1761.ARCHER || r5 == C1761.SOUL_LINKER || r5 == C1761.TAEKWON) {
                    hkVar3 = null;
                }
            }
            return new C0405hk[]{hkVar, hkVar3, hkVar2};
        } catch (NullPointerException unused) {
            throw new C0588no("Failed to init 1st class for " + bbVar.f1633);
        }
    }

    /* renamed from: 鷭 */
    private C0405hk m272(C1688 r9, C0206bb bbVar) {
        String str;
        if (bbVar.mo3557(false) == C1761.GAMEMASTER.f8294) {
            return null;
        }
        for (C1688 r0 : this.f670) {
            if (r0 == r9) {
                C0206bb bbVar2 = bbVar;
                C1688 r10 = r9;
                C0247ck ckVar = this.f674;
                C1761 r3 = C1761.m2430(bbVar2.f1633);
                int r4 = bbVar2.mo3557(true);
                if (r4 == C1761.GAMEMASTER.f8294) {
                    str = null;
                } else {
                    if (r4 == C1761.SOUL_LINKER.f8294) {
                        r4 = C1761.MAGE.f8294;
                    }
                    C1714 r6 = ckVar.f623;
                    String str2 = bbVar2.f446 == C1977.MALE.ordinal() ? r6.f7901 : r6.f7900;
                    C1716if ifVar = ckVar.f623.f7903.f7907;
                    String str3 = r3 == C1761.SUMMONER ? ifVar.f7918 : ifVar.f7919;
                    String r2 = ckVar.f626.mo3954(r4, bbVar2.f446);
                    C0533 r102 = (C0533) ckVar.f614.f1675.get(Integer.valueOf(r10.ordinal()));
                    str = new StringBuilder(String.valueOf(str3)).append("\\").append(r2).append("\\").append(r2).append("_").append(str2).append(r102 == null ? null : r102.f1679).append("_").append(ckVar.f623.f7903.f7907.f7914).toString();
                }
                return (C0405hk) C0246cj.m229(str, C0405hk.class);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final Bitmap mo3618(C0599nz nzVar, byte b) {
        C0253if ifVar = null;
        C0405hk r9 = mo3621((int) nzVar.f2916, b, true);
        if (nzVar.f2914 > 0) {
            ifVar = mo3619(C1761.m2430(nzVar.f2916), true, nzVar.f2916, nzVar.f2914, C1977.values()[b], false, true);
        }
        C0253if ifVar2 = null;
        C0405hk r11 = mo3623(C1761.m2430(nzVar.f2916), (int) nzVar.f2887, b, true);
        if (nzVar.f2917 > 0) {
            ifVar2 = mo3619(C1761.m2430(nzVar.f2916), false, nzVar.f2887, nzVar.f2917, C1977.values()[b], false, true);
        }
        C0405hk hkVar = null;
        if (nzVar.f2892 > 0) {
            hkVar = mo3622((int) nzVar.f2892, (int) nzVar.f2887, b, true);
        }
        C0405hk hkVar2 = null;
        if (nzVar.f2893 > 0) {
            hkVar2 = mo3622((int) nzVar.f2893, (int) nzVar.f2887, b, true);
        }
        C0405hk hkVar3 = null;
        if (nzVar.f2890 > 0) {
            hkVar3 = mo3622((int) nzVar.f2890, (int) nzVar.f2887, b, true);
        }
        C0408hl hlVar = new C0408hl(r9, new C0405hk[]{r9, r11, hkVar, hkVar2, hkVar3});
        int[][] iArr = new int[2][];
        iArr[0] = ifVar != null ? ifVar.f681 : null;
        iArr[1] = ifVar2 != null ? ifVar2.f681 : null;
        int[] r16 = hlVar.mo3787(iArr, nzVar.f2898 == 0 ? C0561mo.STAND.f1849 * 8 : C0561mo.SIT.f1849 * 8, 0, 128, 128, 64);
        Bitmap createBitmap = Bitmap.createBitmap(128, 128, Config.ARGB_8888);
        createBitmap.setPixels(r16, 0, 128, 0, 0, 128, 128);
        return createBitmap;
    }

    /* renamed from: 鷭 */
    private static Bitmap m267(ArrayList<Bitmap> arrayList, int i) {
        int width = ((Bitmap) arrayList.get(0)).getWidth();
        int height = ((Bitmap) arrayList.get(0)).getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width * i, height * 3, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            canvas.drawBitmap((Bitmap) arrayList.get(i2), ((float) (i2 % i)) * ((float) width), ((float) (i2 / i)) * ((float) height), null);
        }
        return createBitmap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final Bitmap mo3616() {
        int i;
        int i2;
        int i3;
        int i4 = 4;
        try {
            if (C1014.f6140.f4523 > 0) {
                i = C1014.f6140.f4523 - 1;
            } else {
                i = (int) (Math.random() * 5.0d);
            }
            ArrayList arrayList = new ArrayList();
            i2 = 1;
            while (i2 <= 3) {
                i3 = 1;
                while (i3 <= i4) {
                    byte[] bArr = (byte[]) this.f677.mo3613("data\\texture\\" + this.f674.f623.f7904.f7928 + "\\t" + (i == 0 ? "" : Integer.valueOf(i)) + "_" + this.f674.f623.f7904.f7926 + i2 + "-" + i3 + ".bmp", false);
                    arrayList.add(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                    i3++;
                }
                i2++;
            }
            return m267(arrayList, i4);
        } catch (C0825tu e) {
            if (i2 == 1 && i3 == 4) {
                i4 = 3;
            } else {
                throw e;
            }
        } catch (C0825tu unused) {
            try {
                byte[] bArr2 = (byte[]) this.f677.mo3613("data\\texture\\" + this.f674.f623.f7904.f7928 + "\\bgi_temp.bmp", false);
                return BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
            } catch (C0825tu unused2) {
                return null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final Bitmap mo3617(String str, int i) {
        byte[] bArr = (byte[]) this.f677.mo3613(str, false);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray == null) {
            throw new C0588no("Failed to decode BMP " + str + " size=" + bArr.length);
        }
        int[] iArr = new int[(decodeByteArray.getWidth() * decodeByteArray.getHeight())];
        decodeByteArray.getPixels(iArr, 0, decodeByteArray.getWidth(), 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight());
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == -65281) {
                iArr[i2] = 0;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, 0, decodeByteArray.getWidth(), decodeByteArray.getWidth(), decodeByteArray.getHeight(), Config.ARGB_8888);
        if (i <= 1) {
            return createBitmap;
        }
        return Bitmap.createScaledBitmap(createBitmap, decodeByteArray.getWidth() * i, decodeByteArray.getHeight() * i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final Bitmap mo3615(int i) {
        try {
            return mo3617(this.f674.mo3608(i, true, false), 1);
        } catch (C0825tu e) {
            C0592ns.m674(e.getMessage());
            return mo3617(this.f674.mo3608(512, true, false), 1);
        }
    }

    /* renamed from: 鷭 */
    static Bitmap m269(C0408hl hlVar, int i, c_point c_point) {
        C0408hl hlVar2 = hlVar;
        int i2 = i;
        if (i2 >= hlVar.f1168.length) {
            i = 0;
        }
        if (hlVar.f1168[i] == null) {
            hlVar.mo3785(i);
        }
        int[] r10 = hlVar2.mo3787(null, i2, hlVar.f1168[i].f1171.length / 2, c_point.x, c_point.y, c_point.x / 2);
        Rect rect = new Rect();
        rect.left = c_point.x;
        rect.top = c_point.y;
        for (int i3 = 0; i3 < c_point.y; i3++) {
            for (int i4 = 0; i4 < c_point.x; i4++) {
                if ((r10[(c_point.x * i3) + i4] & ViewCompat.MEASURED_STATE_MASK) != 0) {
                    rect.left = Math.min(rect.left, i4);
                    rect.right = Math.max(rect.right, i4);
                    rect.bottom = Math.max(rect.bottom, i3);
                    rect.top = Math.min(rect.top, i3);
                }
            }
        }
        if (rect.width() < 0 || rect.height() < 0) {
            return Bitmap.createBitmap(1, 1, Config.ARGB_8888);
        }
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Config.ARGB_8888);
        createBitmap.setPixels(r10, rect.left + (rect.top * c_point.x), c_point.x, 0, 0, rect.width(), rect.height());
        return createBitmap;
    }

    /* renamed from: 鷭 */
    static Bitmap m266(int i, c_point c_point) {
        return m269(C1014.f6142.f1680.f1186, i, c_point);
    }

    /* renamed from: 鷭 */
    static Bitmap m268(C0405hk hkVar) {
        int[] iArr = new int[256];
        for (int i = 0; i < hkVar.f1146.length; i++) {
            int i2 = hkVar.f1146[i];
            iArr[i] = (-16711936 & i2) | ((16711680 & i2) >> 16) | ((i2 & 255) << 16);
        }
        byte[] bArr = hkVar.f1144[0].f1164;
        int[] iArr2 = new int[bArr.length];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            iArr2[i3] = iArr[C0622ot.m730(bArr[i3])];
        }
        Bitmap createBitmap = Bitmap.createBitmap(hkVar.f1144[0].f1157, hkVar.f1144[0].f1158, Config.ARGB_8888);
        createBitmap.setPixels(iArr2, 0, hkVar.f1144[0].f1157, 0, 0, hkVar.f1144[0].f1157, hkVar.f1144[0].f1158);
        return createBitmap;
    }

    /* renamed from: ˮ͈ */
    static boolean m263(int i) {
        return i < C1014.f6142.f1680.f1186.f1168.length;
    }

    /* renamed from: 鷭 */
    static String m270(int i, int i2) {
        return C0595nv.f2869 + "/_tmpEmblem/" + C1014.f6159.f6173 + "_" + i + "_" + i2 + ".ebm";
    }

    /* renamed from: 櫯 */
    static Bitmap m264(int i, int i2) {
        double d;
        File file = new File(m270(i, i2));
        byte[] bArr = new byte[((int) file.length())];
        int i3 = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, i3, bArr.length - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            }
            fileInputStream.close();
            byte[] r12 = C0835ua.m1536(bArr, 3304, false);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(r12, 0, r12.length);
            if (decodeByteArray == null) {
                decodeByteArray = Bitmap.createBitmap(24, 24, Config.ARGB_8888);
            }
            int[] iArr = new int[(decodeByteArray.getWidth() * decodeByteArray.getHeight())];
            decodeByteArray.getPixels(iArr, 0, decodeByteArray.getWidth(), 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight());
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = (iArr[i4] & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                int i6 = iArr[i4] & 255;
                if (((iArr[i4] & 16711680) >> 16) >= 250 && i5 < 5 && i6 >= 250) {
                    iArr[i4] = 0;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, 0, decodeByteArray.getWidth(), decodeByteArray.getWidth(), decodeByteArray.getHeight(), Config.ARGB_8888);
            decodeByteArray.getHeight();
            decodeByteArray.getWidth();
            if (decodeByteArray.getHeight() == 24 && decodeByteArray.getWidth() == 24) {
                return createBitmap;
            }
            if (decodeByteArray.getHeight() > decodeByteArray.getWidth()) {
                d = 24.0d / ((double) decodeByteArray.getHeight());
            } else {
                d = 24.0d / ((double) decodeByteArray.getWidth());
            }
            return Bitmap.createScaledBitmap(createBitmap, (int) (((double) decodeByteArray.getWidth()) * d), (int) (((double) decodeByteArray.getHeight()) * d), false);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (IOException e) {
            Log.e("AndRO", e.toString());
            RuntimeException runtimeException = new RuntimeException(e.toString());
            runtimeException.setStackTrace(e.getStackTrace());
            throw runtimeException;
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 112 */
    /* renamed from: Ą */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m261() {
        /*
            r4 = this;
            r0 = 1
            boolean[] r2 = new boolean[r0]
            r0 = 1
            boolean[] r3 = new boolean[r0]
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.cq r1 = new o.cq
            r1.<init>(r4, r2, r3)
            r0.mo3387(r1)
            goto L_0x001f
        L_0x0011:
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0017 }
            goto L_0x001f
        L_0x0017:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
        L_0x001f:
            r0 = 0
            boolean r0 = r2[r0]
            if (r0 == 0) goto L_0x0011
            r0 = 0
            boolean r0 = r3[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0252cp.m261():boolean");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 254 */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b4, code lost:
        if (r17 != false) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b6, code lost:
        r11 = new p004o.C1026();
        r11.mo4056(java.nio.ByteBuffer.wrap(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c8, code lost:
        if (r10.f5070.length != r11.f5070.length) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ca, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01cd, code lost:
        r13 = r10.f5070[r12];
        r16 = r11.f5070[r12];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01dd, code lost:
        if (r13.f5074 == r16.f5074) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01df, code lost:
        r1 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z");
        r1.format(new java.sql.Date(r13.f5074));
        r1.format(new java.sql.Date(r16.f5074));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020c, code lost:
        if (r13.f5072 != r16.f5072) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x020e, code lost:
        r1 = new java.lang.String(r13.f5073);
        r1 = new java.lang.String(r16.f5073);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x022a, code lost:
        if (r1.equals(r1) == false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022c, code lost:
        r11.f5070[r12].equals(r10.f5070[r12]);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x023c, code lost:
        if (r12 < r10.f5070.length) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0241, code lost:
        if (r12 < r10.f5070.length) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0243, code lost:
        r25 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0268, code lost:
        if (new java.io.File(p004o.C0595nv.f2869, new java.lang.String(r10.f5070[r25].f5073).trim()).length() != r10.f5070[r25].f5072) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x026a, code lost:
        r25 = r25 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0271, code lost:
        if (r25 < r10.f5070.length) goto L_0x0246;
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m273(java.util.ArrayList<java.lang.String> r25) {
        /*
            r24 = this;
            r0 = 1
            boolean[] r8 = new boolean[r0]
            o.ba r0 = p004o.C0595nv.f2876
            if (r0 == 0) goto L_0x000d
            o.ba r0 = p004o.C0595nv.f2876
            boolean r0 = r0.f444
            if (r0 != 0) goto L_0x0019
        L_0x000d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.localclient
            if (r0 != r1) goto L_0x001a
            o.pc$鷭 r0 = p004o.C1014.f6140
            java.lang.String r0 = r0.f4468
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            return
        L_0x001a:
            java.io.File r9 = new java.io.File
            java.lang.String r0 = p004o.C0595nv.f2869
            java.lang.String r1 = "andro_full_client_downloaded.txt"
            r9.<init>(r0, r1)
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x002a
            return
        L_0x002a:
            r0 = r24
            boolean r0 = r0.m261()
            if (r0 != 0) goto L_0x0033
            return
        L_0x0033:
            o.pc$鷭 r0 = p004o.C1014.f6140
            java.lang.String r0 = r0.f4468
            if (r0 == 0) goto L_0x00b2
            o.ġ r10 = new o.ġ
            r10.<init>()
            r0 = 0
            o.um$鷭[] r0 = new p004o.C0847um.C0848[r0]
            r10.f5070 = r0
            r0 = r25
            java.util.Iterator r11 = r0.iterator()
            goto L_0x00ab
        L_0x004b:
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            r25 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ tu -> 0x0075, Exception -> 0x0077 }
            o.pc$鷭 r1 = p004o.C1014.f6140     // Catch:{ tu -> 0x0075, Exception -> 0x0077 }
            java.lang.String r1 = r1.f4468     // Catch:{ tu -> 0x0075, Exception -> 0x0077 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ tu -> 0x0075, Exception -> 0x0077 }
            r0.<init>(r1)     // Catch:{ tu -> 0x0075, Exception -> 0x0077 }
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ tu -> 0x0075, Exception -> 0x0077 }
            r1 = r25
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ tu -> 0x0075, Exception -> 0x0077 }
            java.lang.String r0 = r0.toString()     // Catch:{ tu -> 0x0075, Exception -> 0x0077 }
            o.ty$櫯 r12 = p004o.C0829ty.m1526(r0)     // Catch:{ tu -> 0x0075, Exception -> 0x0077 }
            goto L_0x007e
        L_0x0075:
            goto L_0x00ab
        L_0x0077:
            r14 = move-exception
            o.no r0 = new o.no
            r0.<init>(r14)
            throw r0
        L_0x007e:
            o.um$鷭[] r0 = r10.f5070
            o.um$鷭 r13 = new o.um$鷭
            r2 = r10
            r3 = r25
            long r4 = r12.f5024
            long r6 = r12.f5023
            r1 = r13
            r1.<init>(r2, r3, r4, r6)
            r12 = r0
            if (r0 != 0) goto L_0x009c
            java.lang.Class r0 = r13.getClass()
            r1 = 0
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r12 = r0
        L_0x009c:
            int r0 = r12.length
            int r0 = r0 + 1
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r12, r0)
            int r0 = r12.length
            r14[r0] = r13
            r0 = r14
            o.um$鷭[] r0 = (p004o.C0847um.C0848[]) r0
            r10.f5070 = r0
        L_0x00ab:
            boolean r0 = r11.hasNext()
            if (r0 != 0) goto L_0x004b
            goto L_0x00e6
        L_0x00b2:
            o.df r0 = p004o.C1014.f6149
            o.do r0 = r0.f729
            o.ux r1 = new o.ux
            r1.<init>()
            r0.mo3652(r1)
            r0 = r24
            boolean[] r0 = r0.f667
            r25 = r0
            monitor-enter(r25)
            r0 = r24
            boolean[] r0 = r0.f667     // Catch:{ InterruptedException -> 0x00cd }
            r0.wait()     // Catch:{ InterruptedException -> 0x00cd }
            goto L_0x00d4
        L_0x00cd:
            r11 = move-exception
            o.no r0 = new o.no     // Catch:{ all -> 0x00d6 }
            r0.<init>(r11)     // Catch:{ all -> 0x00d6 }
            throw r0     // Catch:{ all -> 0x00d6 }
        L_0x00d4:
            monitor-exit(r25)     // Catch:{ all -> 0x00d6 }
            goto L_0x00d9
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r25)     // Catch:{ all -> 0x00d6 }
            throw r0
        L_0x00d9:
            o.df r0 = p004o.C1014.f6149
            o.do r0 = r0.f729
            o.ġ r10 = r0.f751
            o.df r0 = p004o.C1014.f6149
            o.do r0 = r0.f729
            r1 = 0
            r0.f751 = r1
        L_0x00e6:
            r25 = -1
            o.hp r0 = p004o.C1014.f6160
            java.lang.String r1 = "local_client_checksum"
            r2 = 0
            java.lang.String r11 = r0.mo3802(r1, r2)
            if (r11 != 0) goto L_0x00f5
            r0 = 0
            goto L_0x00f6
        L_0x00f5:
            r0 = r11
        L_0x00f6:
            r11 = r0
            if (r0 == 0) goto L_0x0273
            byte[] r14 = p004o.C0622ot.m724(r11)
            java.io.File r12 = new java.io.File
            java.lang.String r0 = p004o.C0595nv.f2869
            r12.<init>(r0)
            r15 = r12
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            p004o.C0623ou.m754(r12, r13)
            r16 = r13
            r17 = 0
            r0 = r16
            java.util.Iterator r13 = r0.iterator()
            goto L_0x01ae
        L_0x0119:
            java.lang.Object r0 = r13.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r18 = r0.getAbsolutePath()
            java.lang.String r0 = r15.getAbsolutePath()
            int r0 = r0.length()
            int r0 = r0 + 1
            r1 = r18
            int r1 = r1.length()
            r2 = r18
            java.lang.String r18 = r2.substring(r0, r1)
            r16 = 0
            goto L_0x019d
        L_0x013d:
            o.um$鷭[] r0 = r10.f5070
            r0 = r0[r16]
            char[] r0 = r0.f5073
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r19 = r0.trim()
            r0 = r18
            r1 = r19
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r19
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = ".tmp"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r18
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01a4
            o.pc$鷭 r0 = p004o.C1014.f6140
            java.lang.String r0 = r0.f4498
            if (r0 == 0) goto L_0x017d
            o.pc$鷭 r0 = p004o.C1014.f6140
            java.lang.String r0 = r0.f4498
            goto L_0x017f
        L_0x017d:
            java.lang.String r0 = "DATA.INI"
        L_0x017f:
            r1 = r18
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01a4
            java.lang.String r0 = "remote_filelist.txt"
            r1 = r18
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01a4
            java.lang.String r0 = "BGM"
            r1 = r18
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x01a4
            int r16 = r16 + 1
        L_0x019d:
            o.um$鷭[] r0 = r10.f5070
            int r0 = r0.length
            r1 = r16
            if (r1 < r0) goto L_0x013d
        L_0x01a4:
            o.um$鷭[] r0 = r10.f5070
            int r0 = r0.length
            r1 = r16
            if (r1 != r0) goto L_0x01ae
            r17 = 1
            goto L_0x01b4
        L_0x01ae:
            boolean r0 = r13.hasNext()
            if (r0 != 0) goto L_0x0119
        L_0x01b4:
            if (r17 != 0) goto L_0x0273
            o.ġ r11 = new o.ġ
            r11.<init>()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r14)
            r11.mo4056(r0)
            o.um$鷭[] r0 = r10.f5070
            int r0 = r0.length
            o.um$鷭[] r1 = r11.f5070
            int r1 = r1.length
            if (r0 != r1) goto L_0x0273
            r12 = 0
            goto L_0x0239
        L_0x01cd:
            o.um$鷭[] r0 = r10.f5070
            r13 = r0[r12]
            o.um$鷭[] r0 = r11.f5070
            r16 = r0[r12]
            long r0 = r13.f5074
            r2 = r16
            long r2 = r2.f5074
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0204
            java.text.SimpleDateFormat r18 = new java.text.SimpleDateFormat
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss.SSS Z"
            r1 = r18
            r1.<init>(r0)
            java.sql.Date r0 = new java.sql.Date
            long r1 = r13.f5074
            r0.<init>(r1)
            r1 = r18
            r1.format(r0)
            java.sql.Date r0 = new java.sql.Date
            r1 = r16
            long r1 = r1.f5074
            r0.<init>(r1)
            r1 = r18
            r1.format(r0)
            goto L_0x023e
        L_0x0204:
            long r0 = r13.f5072
            r2 = r16
            long r2 = r2.f5072
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x023e
            java.lang.String r18 = new java.lang.String
            char[] r0 = r13.f5073
            r1 = r18
            r1.<init>(r0)
            java.lang.String r19 = new java.lang.String
            r0 = r16
            char[] r0 = r0.f5073
            r1 = r19
            r1.<init>(r0)
            r0 = r18
            r1 = r19
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x023e
            o.um$鷭[] r0 = r11.f5070
            r0 = r0[r12]
            o.um$鷭[] r1 = r10.f5070
            r1 = r1[r12]
            r0.equals(r1)
            int r12 = r12 + 1
        L_0x0239:
            o.um$鷭[] r0 = r10.f5070
            int r0 = r0.length
            if (r12 < r0) goto L_0x01cd
        L_0x023e:
            o.um$鷭[] r0 = r10.f5070
            int r0 = r0.length
            if (r12 < r0) goto L_0x0273
            r25 = 0
            goto L_0x026c
        L_0x0246:
            java.lang.String r0 = new java.lang.String
            o.um$鷭[] r1 = r10.f5070
            r1 = r1[r25]
            char[] r1 = r1.f5073
            r0.<init>(r1)
            java.lang.String r13 = r0.trim()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = p004o.C0595nv.f2869
            r0.<init>(r1, r13)
            long r0 = r0.length()
            o.um$鷭[] r2 = r10.f5070
            r2 = r2[r25]
            long r2 = r2.f5072
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0273
            int r25 = r25 + 1
        L_0x026c:
            o.um$鷭[] r0 = r10.f5070
            int r0 = r0.length
            r1 = r25
            if (r1 < r0) goto L_0x0246
        L_0x0273:
            r0 = r25
            r1 = -1
            if (r0 != r1) goto L_0x02c6
            r25 = 0
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r12 = r0.f51
            java.lang.String r13 = "Deleting old directory content..."
            android.app.AlertDialog r0 = r12.f1370
            if (r0 == 0) goto L_0x028f
            r14 = r12
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.jm r1 = new o.jm
            r1.<init>(r14)
            r0.mo3387(r1)
        L_0x028f:
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.jk r1 = new o.jk
            r1.<init>(r12, r13)
            r0.mo3387(r1)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = p004o.C0595nv.f2869
            r0.<init>(r1)
            p004o.C0623ou.m753(r0)
            r0 = 65535(0xffff, float:9.1834E-41)
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r0)
            r0 = 0
            r10.mo4053(r12, r0)
            o.hp r0 = p004o.C1014.f6160
            java.lang.String r1 = "local_client_checksum"
            byte[] r2 = r12.array()
            int r3 = r12.position()
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r14 = p004o.C0622ot.m723(r2)
            r2 = 0
            r0.mo3805(r1, r2, r14)
        L_0x02c6:
            o.cp$鷭 r12 = new o.cp$鷭
            r0 = r24
            r12.<init>()
            r14 = 0
            r16 = 0
            goto L_0x02db
        L_0x02d2:
            o.um$鷭[] r0 = r10.f5070
            r0 = r0[r16]
            long r0 = r0.f5072
            long r14 = r14 + r0
            int r16 = r16 + 1
        L_0x02db:
            o.um$鷭[] r0 = r10.f5070
            int r0 = r0.length
            r1 = r16
            if (r1 < r0) goto L_0x02d2
            r16 = 0
            r11 = 0
            goto L_0x02f0
        L_0x02e6:
            o.um$鷭[] r0 = r10.f5070
            r0 = r0[r11]
            long r0 = r0.f5072
            long r16 = r16 + r0
            int r11 = r11 + 1
        L_0x02f0:
            r0 = r25
            if (r11 < r0) goto L_0x02e6
            r11 = r25
            goto L_0x0364
        L_0x02f8:
            java.lang.String r0 = new java.lang.String
            o.um$鷭[] r1 = r10.f5070
            r1 = r1[r11]
            char[] r1 = r1.f5073
            r0.<init>(r1)
            java.lang.String r13 = r0.trim()
            r22 = r14
            r20 = r16
            r25 = r12
            r0 = r20
            r12.f688 = r0
            r0 = r22
            r2 = r25
            r2.f687 = r0
            r0 = r25
            r1 = 0
            r3 = 1
            r0.mo3626(r1, r3)
            o.um$鷭[] r0 = r10.f5070
            r0 = r0[r11]
            long r0 = r0.f5072
            long r16 = r16 + r0
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ tu -> 0x0362 }
            java.lang.String r0 = r0.f4468     // Catch:{ tu -> 0x0362 }
            if (r0 == 0) goto L_0x0359
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ tu -> 0x0362 }
            o.pc$鷭 r1 = p004o.C1014.f6140     // Catch:{ tu -> 0x0362 }
            java.lang.String r1 = r1.f4468     // Catch:{ tu -> 0x0362 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ tu -> 0x0362 }
            r0.<init>(r1)     // Catch:{ tu -> 0x0362 }
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ tu -> 0x0362 }
            java.lang.StringBuilder r0 = r0.append(r13)     // Catch:{ tu -> 0x0362 }
            java.lang.String r0 = r0.toString()     // Catch:{ tu -> 0x0362 }
            java.io.File r1 = new java.io.File     // Catch:{ tu -> 0x0362 }
            java.lang.String r2 = p004o.C0595nv.f2869     // Catch:{ tu -> 0x0362 }
            r1.<init>(r2, r13)     // Catch:{ tu -> 0x0362 }
            o.pe$if r4 = p004o.C0653pe.C0654if.RESUME     // Catch:{ tu -> 0x0362 }
            r5 = r12
            r2 = 0
            r3 = 0
            p004o.C0829ty.m1528(r0, r1, r2, r3, r4, r5)     // Catch:{ tu -> 0x0362 }
            goto L_0x0362
        L_0x0359:
            java.lang.String r0 = p004o.C0595nv.f2869     // Catch:{ tu -> 0x0362 }
            o.pe$if r1 = p004o.C0653pe.C0654if.RESUME     // Catch:{ tu -> 0x0362 }
            r2 = 0
            p004o.C0248cl.m253(r0, r13, r2, r1, r12)     // Catch:{ tu -> 0x0362 }
        L_0x0362:
            int r11 = r11 + 1
        L_0x0364:
            o.um$鷭[] r0 = r10.f5070
            int r0 = r0.length
            if (r11 < r0) goto L_0x02f8
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r12 = r0.f51
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.jm r1 = new o.jm
            r1.<init>(r12)
            r0.mo3387(r1)
            r13 = 1
            goto L_0x03bf
        L_0x037a:
            r0 = 10
            if (r13 >= r0) goto L_0x038e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "0"
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r16 = r0.toString()
            goto L_0x0392
        L_0x038e:
            java.lang.String r16 = java.lang.String.valueOf(r13)
        L_0x0392:
            r18 = r13
            java.lang.String r0 = p004o.C0595nv.f2869     // Catch:{ tu -> 0x03bd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ tu -> 0x03bd }
            java.lang.String r2 = "BGM/"
            r1.<init>(r2)     // Catch:{ tu -> 0x03bd }
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ tu -> 0x03bd }
            java.lang.String r2 = ".mp3"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ tu -> 0x03bd }
            java.lang.String r1 = r1.toString()     // Catch:{ tu -> 0x03bd }
            o.pe$if r2 = p004o.C0653pe.C0654if.RESUME     // Catch:{ tu -> 0x03bd }
            o.ct r3 = new o.ct     // Catch:{ tu -> 0x03bd }
            r4 = r24
            r5 = r18
            r3.<init>(r4, r5)     // Catch:{ tu -> 0x03bd }
            r4 = 0
            p004o.C0248cl.m253(r0, r1, r4, r2, r3)     // Catch:{ tu -> 0x03bd }
        L_0x03bd:
            int r13 = r13 + 1
        L_0x03bf:
            r0 = 172(0xac, float:2.41E-43)
            if (r13 <= r0) goto L_0x037a
            r9.createNewFile()     // Catch:{ IOException -> 0x03c7 }
        L_0x03c7:
            o.hp r0 = p004o.C1014.f6160
            java.lang.String r1 = "local_client_checksum"
            r2 = 0
            r3 = 0
            r0.mo3805(r1, r2, r3)
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.cu r1 = new o.cu
            r2 = r24
            r1.<init>(r2, r8)
            r0.mo3387(r1)
            r13 = r8
            monitor-enter(r8)
            r8.wait()     // Catch:{ InterruptedException -> 0x03e2 }
            goto L_0x03eb
        L_0x03e2:
            r16 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x03ed }
            r1 = r16
            r0.<init>(r1)     // Catch:{ all -> 0x03ed }
            throw r0     // Catch:{ all -> 0x03ed }
        L_0x03eb:
            monitor-exit(r13)     // Catch:{ all -> 0x03ed }
            return
        L_0x03ed:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x03ed }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0252cp.m273(java.util.ArrayList):void");
    }

    /* renamed from: 鷭 */
    static /* synthetic */ void m274(C0252cp cpVar) {
        C0811tk tkVar;
        C0252cp cpVar2 = cpVar;
        C0252cp cpVar3 = cpVar2;
        C0835ua.f5031 = new C0261cw(cpVar2);
        if (C1014.f6140.f4469 != null) {
            File file = new File(C0595nv.f2869, "remote_filelist.txt");
            C0453ix ixVar = C1014.f6147.f51;
            String str = "Checking updates in file list";
            if (ixVar.f1370 != null) {
                C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
            }
            C1014.f6147.mo3387((Runnable) new C0471jk(ixVar, str));
            byte[] r10 = C0829ty.m1528(C1014.f6140.f4469, file, true, true, C0654if.RETURN_NULL_IF_SAME_LASTMODIFIED, new C0267db(cpVar3));
            if (r10 == null && -1 == C1014.f6160.mo3799("dummy_remote_filelist", (int) file.length(), (int) file.lastModified(), (String) null)) {
                try {
                    r10 = C0623ou.m755(file.getAbsolutePath());
                } catch (IOException e) {
                    throw new C0588no((Exception) e);
                }
            }
            if (r10 != null) {
                C0415hp hpVar = C1014.f6160;
                String[] r8 = C0833tz.m1530(r10, new C0419hs(hpVar, true));
                hpVar.f1210.beginTransaction();
                hpVar.f1210.delete("remote_filelist", null, null);
                hpVar.mo3806("INSERT OR IGNORE INTO `remote_filelist` (`filename`) VALUES ", r8, 1, (C0759sx) new C0420ht(hpVar, true));
                hpVar.f1210.setTransactionSuccessful();
                hpVar.f1210.endTransaction();
                C1014.f6160.mo3800(true, -1, "dummy_remote_filelist", (int) file.length(), (int) file.lastModified(), null);
            }
        }
        ArrayList<String> arrayList = C1014.f6140.f4530;
        if (arrayList.size() <= 0) {
            if (C0595nv.f2879 != C0564mr.localclient) {
                C0248cl.m253(C0595nv.f2869, C1014.f6140.f4498 != null ? C1014.f6140.f4498 : "DATA.INI", false, C0654if.SKIP, null);
            }
            arrayList = new ArrayList<>(Arrays.asList(C0653pe.m802(new File(C0595nv.f2869), C1014.f6140.f4498)));
        }
        cpVar3.m273(arrayList);
        if (C0595nv.f2876 == null || !C0595nv.f2876.f443) {
            Iterator it = C1014.f6140.f4529.iterator();
            while (it.hasNext()) {
                C0651 r82 = (C0651) it.next();
                if (r82.f4537 == C0648.official) {
                    tkVar = new C0818to(C0595nv.f2869, C0524lh.m567());
                } else if (r82.f4537 == C0648.neoncube) {
                    tkVar = new C0814tm(C0595nv.f2869, C0524lh.m567());
                } else if (r82.f4537 == C0648.thor) {
                    tkVar = new C0819tp(C0595nv.f2869, C0524lh.m567());
                } else {
                    String str2 = "Failed to instantiate updater: unknown type";
                    Log.e("AndRO", str2);
                    throw new C0588no(str2);
                }
                tkVar.mo4114(r82);
            }
        }
        cpVar3.f677 = new C0248cl(C1014.f6147.f51, C1014.f6160, C0595nv.f2869, arrayList, C1014.f6140.f4467);
        cpVar3.f674 = new C0247ck(C1014.f6147, cpVar3.f677, C1014.f6140.f4485);
        C0453ix ixVar2 = C1014.f6147.f51;
        String str3 = "Initializing UI bitmaps";
        if (ixVar2.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar2));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(ixVar2, str3));
        cpVar3.f665 = cpVar3.mo3617("data\\texture\\" + cpVar3.f674.f623.f7904.f7928 + "\\shop.bmp", 1);
        cpVar3.f654 = cpVar3.mo3617("data\\texture\\" + cpVar3.f674.f623.f7904.f7928 + "\\buyingshop.bmp", 1);
        cpVar3.f663 = cpVar3.mo3617("data\\texture\\" + cpVar3.f674.f623.f7904.f7928 + "\\chat_open.bmp", 1);
        cpVar3.f652 = cpVar3.mo3617("data\\texture\\" + cpVar3.f674.f623.f7904.f7928 + "\\chat_close.bmp", 1);
        cpVar3.f653 = cpVar3.mo3615(714);
        C0252cp cpVar4 = cpVar3;
        cpVar3.f671 = new Bitmap[]{cpVar4.mo3617("data\\texture\\" + cpVar4.f674.f623.f7904.f7928 + "\\basic_interface\\btn_comm_off.bmp", 2), cpVar4.mo3617("data\\texture\\" + cpVar4.f674.f623.f7904.f7928 + "\\basic_interface\\btn_comm_on.bmp", 2)};
        C0252cp cpVar5 = cpVar3;
        cpVar3.f664 = new Bitmap[]{cpVar5.mo3617("data\\texture\\" + cpVar5.f674.f623.f7904.f7928 + "\\basic_interface\\btn_items_off.bmp", 2), cpVar5.mo3617("data\\texture\\" + cpVar5.f674.f623.f7904.f7928 + "\\basic_interface\\btn_items_on.bmp", 2)};
        cpVar3.f655 = cpVar3.mo3617(cpVar3.f674.mo3608(512, true, false), 1);
        cpVar3.f675 = cpVar3.mo3617(cpVar3.f674.mo3609("BD_RAGNAROK"), 1);
        C0252cp cpVar6 = cpVar3;
        cpVar3.f666 = new Bitmap[]{cpVar6.mo3617("data\\texture\\" + cpVar6.f674.f623.f7904.f7928 + "\\basic_interface\\btn_profile_off.bmp", 2), cpVar6.mo3617("data\\texture\\" + cpVar6.f674.f623.f7904.f7928 + "\\basic_interface\\btn_profile_on.bmp", 2)};
        C0252cp cpVar7 = cpVar3;
        cpVar3.f672 = new Bitmap[]{cpVar7.mo3617("data\\texture\\" + cpVar7.f674.f623.f7904.f7928 + "\\basic_interface\\btn_skill_off.bmp", 2), cpVar7.mo3617("data\\texture\\" + cpVar7.f674.f623.f7904.f7928 + "\\basic_interface\\btn_skill_on.bmp", 2)};
        C0252cp cpVar8 = cpVar3;
        cpVar3.f656 = new Bitmap[]{cpVar8.mo3617("data\\texture\\" + cpVar8.f674.f623.f7904.f7928 + "\\basic_interface\\btn_status_off.bmp", 2), cpVar8.mo3617("data\\texture\\" + cpVar8.f674.f623.f7904.f7928 + "\\basic_interface\\btn_status_on.bmp", 2)};
        C0252cp cpVar9 = cpVar3;
        cpVar3.f657 = new Bitmap[]{cpVar9.mo3617("data\\texture\\" + cpVar9.f674.f623.f7904.f7928 + "\\basic_interface\\btn_equip_off.bmp", 2), cpVar9.mo3617("data\\texture\\" + cpVar9.f674.f623.f7904.f7928 + "\\basic_interface\\btn_equip_on.bmp", 2)};
        C0252cp cpVar10 = cpVar3;
        cpVar3.f658 = new Bitmap[]{cpVar10.mo3617("data\\texture\\" + cpVar10.f674.f623.f7904.f7928 + "\\basic_interface\\btn_option_off.bmp", 2), cpVar10.mo3617("data\\texture\\" + cpVar10.f674.f623.f7904.f7928 + "\\basic_interface\\btn_option_on.bmp", 2)};
        C0252cp cpVar11 = cpVar3;
        cpVar3.f678 = new Bitmap[]{cpVar11.mo3617("data\\texture\\" + cpVar11.f674.f623.f7904.f7928 + "\\basic_interface\\btn_abil_off.bmp", 2), cpVar11.mo3617("data\\texture\\" + cpVar11.f674.f623.f7904.f7928 + "\\basic_interface\\btn_abil_on.bmp", 2)};
        try {
            cpVar3.f668 = cpVar3.mo3617("data\\texture\\" + cpVar3.f674.f623.f7904.f7928 + "\\basic_interface\\nc_cashshop.bmp", 2);
        } catch (C0825tu unused) {
            cpVar3.f668 = null;
        }
        cpVar3.f669 = cpVar3.mo3617("data\\texture\\" + cpVar3.f674.f623.f7904.f7928 + "\\disable_card_slot.bmp", 1);
        cpVar3.f676 = cpVar3.mo3617("data\\texture\\" + cpVar3.f674.f623.f7904.f7928 + "\\empty_card_slot.bmp", 1);
    }

    C0252cp() {
        super("c_res_thread");
        super.mo3387(new C0268dc(this));
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 160 */
    /* renamed from: 櫯 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m265() {
        /*
            java.util.HashMap<java.lang.String, o.hk> r4 = f650
            monitor-enter(r4)
            java.util.HashMap<java.lang.String, o.hk> r0 = f650     // Catch:{ all -> 0x00ab }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x00ab }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x00ab }
            goto L_0x00a3
        L_0x000f:
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x00ab }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00ab }
            r5 = r0
            java.lang.Object r0 = r5.getKey()     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00ab }
            r7 = r0
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x00ab }
            o.hk r0 = (p004o.C0405hk) r0     // Catch:{ all -> 0x00ab }
            r5 = r0
            r8 = 0
            if (r5 != 0) goto L_0x003c
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "filename="
            r1.<init>(r2)     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r1 = r1.append(r7)     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ab }
            r0.<init>(r1)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x003c:
            o.hk$鷭[] r0 = r5.f1144     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0055
            o.hk$鷭[] r12 = r5.f1144     // Catch:{ all -> 0x00ab }
            int r11 = r12.length     // Catch:{ all -> 0x00ab }
            r10 = 0
            goto L_0x0053
        L_0x0045:
            r9 = r12[r10]     // Catch:{ all -> 0x00ab }
            int r0 = r9.f1163     // Catch:{ all -> 0x00ab }
            if (r0 > 0) goto L_0x004f
            int r0 = r9.f1161     // Catch:{ all -> 0x00ab }
            if (r0 <= 0) goto L_0x0051
        L_0x004f:
            r8 = 1
            goto L_0x0055
        L_0x0051:
            int r10 = r10 + 1
        L_0x0053:
            if (r10 < r11) goto L_0x0045
        L_0x0055:
            if (r8 != 0) goto L_0x0072
            o.hk$鷭[] r0 = r5.f1145     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0072
            o.hk$鷭[] r12 = r5.f1145     // Catch:{ all -> 0x00ab }
            int r11 = r12.length     // Catch:{ all -> 0x00ab }
            r10 = 0
            goto L_0x0070
        L_0x0060:
            r9 = r12[r10]     // Catch:{ all -> 0x00ab }
            if (r9 == 0) goto L_0x006e
            int r0 = r9.f1163     // Catch:{ all -> 0x00ab }
            if (r0 > 0) goto L_0x006c
            int r0 = r9.f1161     // Catch:{ all -> 0x00ab }
            if (r0 <= 0) goto L_0x006e
        L_0x006c:
            r8 = 1
            goto L_0x0072
        L_0x006e:
            int r10 = r10 + 1
        L_0x0070:
            if (r10 < r11) goto L_0x0060
        L_0x0072:
            if (r8 == 0) goto L_0x00a3
            java.lang.Class r0 = r5.getClass()     // Catch:{ all -> 0x00ab }
            java.lang.Class<o.잖> r1 = p004o.C2000.class
            if (r0 != r1) goto L_0x008f
            r0 = r5
            o.잖 r0 = (p004o.C2000) r0     // Catch:{ all -> 0x00ab }
            r10 = r0
            o.잖 r9 = new o.잖     // Catch:{ all -> 0x00ab }
            int r0 = r10.f8874     // Catch:{ all -> 0x00ab }
            int r1 = r10.f8873     // Catch:{ all -> 0x00ab }
            boolean r2 = r5.mo3778()     // Catch:{ all -> 0x00ab }
            r3 = 1
            r9.<init>(r0, r1, r2, r3)     // Catch:{ all -> 0x00ab }
            goto L_0x00a0
        L_0x008f:
            o.hk r9 = new o.hk     // Catch:{ all -> 0x00ab }
            o.tb r0 = r5.f1148     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x0097
            r0 = 1
            goto L_0x0098
        L_0x0097:
            r0 = 0
        L_0x0098:
            boolean r1 = r5.mo3778()     // Catch:{ all -> 0x00ab }
            r2 = 1
            r9.<init>(r7, r0, r1, r2)     // Catch:{ all -> 0x00ab }
        L_0x00a0:
            r5.mo3780(r9)     // Catch:{ all -> 0x00ab }
        L_0x00a3:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r4)     // Catch:{ all -> 0x00ab }
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ab }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0252cp.m265():void");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 118 */
    /* renamed from: ȃ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m262() {
        /*
            java.util.HashMap<java.lang.String, o.cp$if> r5 = f651
            monitor-enter(r5)
            java.util.HashMap<java.lang.String, o.cp$if> r0 = f651     // Catch:{ all -> 0x0033 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0033 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0033 }
            goto L_0x002b
        L_0x000e:
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0033 }
            o.cp$if r0 = (p004o.C0252cp.C0253if) r0     // Catch:{ all -> 0x0033 }
            r6 = r0
            int r0 = r6.f680     // Catch:{ all -> 0x0033 }
            if (r0 <= 0) goto L_0x002b
            o.cp r0 = p004o.C1014.f6158     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = r6.f682     // Catch:{ all -> 0x0033 }
            r2 = 1
            r3 = 1
            r4 = 0
            o.cp$if r0 = r0.m271(r1, r2, r3, r4)     // Catch:{ all -> 0x0033 }
            int[] r8 = r0.f681     // Catch:{ all -> 0x0033 }
            r6.f681 = r8     // Catch:{ all -> 0x0033 }
            r0 = 0
            r6.f680 = r0     // Catch:{ all -> 0x0033 }
        L_0x002b:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r5)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0252cp.m262():void");
    }
}

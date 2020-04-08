package p004o;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.support.p000v4.view.MotionEventCompat;
import android.support.p000v4.view.ViewCompat;
import android.util.Log;
import p004o.C0766tb.C0768;
import p004o.C0766tb.C0768.C0769;
import p004o.C0766tb.C0768.C0769.C0770if;
import p004o.C0804th.C0805if;

/* renamed from: o.hk */
class C0405hk extends C0246cj {

    /* renamed from: ą */
    C0407[] f1144;

    /* renamed from: Ć */
    C0407[] f1145;

    /* renamed from: ć */
    int[] f1146;

    /* renamed from: ċ */
    C0406if f1147;

    /* renamed from: Ȋ */
    C0766tb f1148;

    /* renamed from: ˮ͍ */
    int f1149;

    /* renamed from: 岱 */
    boolean f1150;

    /* renamed from: 纫 */
    String f1151;

    /* renamed from: o.hk$if */
    enum C0406if {
        EXT_SPR,
        EXT_TGA,
        EXT_BMP,
        EXT_JPG
    }

    /* renamed from: o.hk$鷭 */
    class C0407 {

        /* renamed from: Ą */
        int f1157;

        /* renamed from: ą */
        int f1158;

        /* renamed from: Ć */
        Point f1159 = new Point();

        /* renamed from: ȃ */
        int f1161;

        /* renamed from: ˮ͈ */
        int[] f1162;

        /* renamed from: 櫯 */
        int f1163;

        /* renamed from: 鷭 */
        byte[] f1164;

        C0407() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final int mo3782() {
            if (this.f1163 > 0) {
                return this.f1163;
            }
            this.f1163 = C1812.m2467(this.f1157, this.f1158, this.f1159, this.f1164, (int[]) null);
            if (!C0405hk.this.f1150) {
                this.f1164 = null;
            }
            if (C0405hk.this.f601 > 0) {
                C0405hk.this.f601 = C0405hk.this.f1150 ? 2 : 3;
            }
            return this.f1163;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 櫯 */
        public final int mo3781() {
            if (this.f1161 > 0) {
                return this.f1161;
            }
            if (this.f1161 >= 0) {
                this.f1161 = C1812.m2467(16, 16, (Point) null, (byte[]) null, this.f1162);
                if (!C0405hk.this.f1150) {
                    this.f1162 = null;
                }
            } else if (C0405hk.this.f1149 > 0) {
                int i = C0405hk.this.f1149;
                this.f1161 = i;
                return i;
            } else {
                C0405hk hkVar = C0405hk.this;
                int r0 = C1812.m2467(16, 16, (Point) null, (byte[]) null, C0405hk.this.f1146);
                hkVar.f1149 = r0;
                this.f1161 = r0;
                if (!C0405hk.this.f1150) {
                    C0405hk.this.f1146 = null;
                }
            }
            if (C0405hk.this.f601 > 0) {
                C0405hk.this.f601 = C0405hk.this.f1150 ? 2 : 3;
            }
            return this.f1161;
        }
    }

    protected C0405hk() {
        this.f1149 = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final boolean mo3778() {
        if (this.f1144 != null && this.f1144.length > 0) {
            return this.f1150;
        }
        if (this.f1145 == null || this.f1145.length <= 0) {
            return false;
        }
        return this.f1150;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3780(C0405hk hkVar) {
        if (!(this.f1144 == null || hkVar.f1144 == null)) {
            for (int i = 0; i < this.f1144.length; i++) {
                this.f1144[i].f1164 = hkVar.f1144[i].f1164;
                this.f1144[i].f1163 = 0;
                this.f1144[i].f1162 = hkVar.f1144[i].f1162;
                this.f1144[i].f1161 = -1;
            }
        }
        if (!(this.f1145 == null || hkVar.f1145 == null)) {
            for (int i2 = 0; i2 < this.f1145.length; i2++) {
                this.f1145[i2].f1164 = hkVar.f1145[i2].f1164;
                this.f1145[i2].f1163 = 0;
                this.f1145[i2].f1162 = hkVar.f1145[i2].f1162;
                this.f1145[i2].f1161 = 0;
            }
        }
        if (hkVar.f1146 != null) {
            if (this.f1146 == null) {
                this.f1146 = new int[hkVar.f1146.length];
            }
            for (int i3 = 0; i3 < hkVar.f1146.length; i3++) {
                this.f1146[i3] = hkVar.f1146[i3];
            }
        }
        this.f1149 = 0;
    }

    public C0405hk(String str) {
        this(str, false, false, false);
    }

    /* renamed from: ć */
    public final void mo3779() {
        this.f1148 = new C0766tb();
        int i = 0;
        if (this.f1144 != null) {
            i = this.f1144.length + 0;
        }
        if (this.f1145 != null) {
            i += this.f1145.length;
        }
        this.f1148.f4682 = new C0768[i];
        int i2 = 0;
        while (i2 < this.f1148.f4682.length) {
            int i3 = 0;
            if (this.f1144 != null) {
                i3 = this.f1144.length + 0;
            }
            boolean z = this.f1144 != null && i2 < this.f1144.length;
            C0407 r7 = z ? this.f1144[i2] : this.f1145[i2 - i3];
            this.f1148.f4682[i2] = new C0768();
            this.f1148.f4682[i2].f4692 = new C0769[1];
            this.f1148.f4682[i2].f4692[0] = new C0769();
            this.f1148.f4682[i2].f4692[0].f4694 = -1;
            this.f1148.f4682[i2].f4692[0].f4697 = new C0770if[1];
            this.f1148.f4682[i2].f4692[0].f4697[0] = new C0770if();
            this.f1148.f4682[i2].f4692[0].f4697[0].f4708 = z ? i2 : i2 - i3;
            this.f1148.f4682[i2].f4692[0].f4697[0].f4709 = z ? 0 : 1;
            this.f1148.f4682[i2].f4692[0].f4697[0].f4701 = -1;
            this.f1148.f4682[i2].f4692[0].f4697[0].f4707 = r7.f1157;
            this.f1148.f4682[i2].f4692[0].f4697[0].f4705 = r7.f1158;
            this.f1148.f4682[i2].f4692[0].f4697[0].f4702 = 1.0f;
            this.f1148.f4682[i2].f4692[0].f4697[0].f4703 = 1.0f;
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final String mo3602(String str) {
        this.f1151 = str;
        int lastIndexOf = this.f598.lastIndexOf(".");
        String substring = str.substring(this.f598.lastIndexOf(".") + 1);
        if (substring.equals("tga")) {
            this.f1147 = C0406if.EXT_TGA;
        } else if (substring.equals("bmp")) {
            this.f1147 = C0406if.EXT_BMP;
        } else if (substring.equals("jpg")) {
            this.f1147 = C0406if.EXT_JPG;
        } else {
            this.f1147 = C0406if.EXT_SPR;
            if (lastIndexOf != -1) {
                this.f1151 = str.substring(0, lastIndexOf);
            }
            return "data\\sprite\\" + this.f1151 + ".spr";
        }
        return "data\\texture\\" + this.f598;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.f601 != 0) {
            mo3600();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ą */
    public final void mo3600() {
        C0407[] r5;
        C0407[] r52;
        if (this.f1144 != null) {
            for (C0407 r2 : this.f1144) {
                if (r2.f1163 > 0) {
                    synchronized (f595) {
                        f595.add(Integer.valueOf(r2.f1163));
                        r2.f1163 = 0;
                    }
                }
            }
        }
        if (this.f1149 > 0) {
            synchronized (f595) {
                f595.add(Integer.valueOf(this.f1149));
                this.f1149 = 0;
            }
        }
        if (this.f1145 != null) {
            for (C0407 r22 : this.f1145) {
                if (r22.f1163 > 0) {
                    synchronized (f595) {
                        f595.add(Integer.valueOf(r22.f1163));
                        r22.f1163 = 0;
                    }
                }
                if (r22.f1161 > 0) {
                    synchronized (f595) {
                        f595.add(Integer.valueOf(r22.f1161));
                        r22.f1161 = 0;
                    }
                }
            }
        }
    }

    /* renamed from: 鷭 */
    public final boolean mo3603(byte[] bArr) {
        C0407[] r5;
        C0407[] r52;
        if (bArr == null) {
            this.f1149 = 0;
            if (this.f1144 != null) {
                for (C0407 r7 : this.f1144) {
                    r7.f1161 = -1;
                    r7.f1163 = 0;
                }
            }
            if (this.f1145 != null) {
                for (C0407 r0 : this.f1145) {
                    r0.f1163 = 0;
                    r0.f1161 = 0;
                }
            }
            this.f601 = 1;
            return true;
        }
        C0804th thVar = null;
        C1621 r53 = null;
        this.f1150 = true;
        if (this.f1147 == C0406if.EXT_SPR) {
            try {
                thVar = new C0804th(bArr);
                if (this.f1148 == null) {
                    byte[] bArr2 = (byte[]) C1014.f6158.f677.mo3613("data\\sprite\\" + this.f1151 + ".act", false);
                    this.f1148 = new C0766tb();
                    try {
                        this.f1148.mo4100(bArr2);
                    } catch (C0826tv e) {
                        throw new C0588no(e, "Failed to init ACT: " + this.f1151);
                    }
                }
            } catch (C0823ts e2) {
                throw new C0588no(e2, "Failed to init SPR: " + this.f1151);
            }
        } else {
            r53 = C0596nw.m683(this.f1151, bArr);
        }
        m394(thVar, r53);
        return true;
    }

    /* renamed from: 鷭 */
    private void m394(C0804th thVar, C1621 r12) {
        int i;
        this.f1149 = 0;
        if (r12 != null) {
            if (this.f1144 == null) {
                this.f1144 = new C0407[1];
                this.f1144[0] = new C0407();
            }
            byte[] bArr = new byte[r12.f7548.length];
            if (r12.f7547 == null) {
                int[] iArr = new int[256];
                int[] iArr2 = r12.f7548;
                int i2 = r12.f7546.x;
                int i3 = r12.f7546.y;
                C0441in.m458(iArr2, i2, bArr, iArr);
                this.f1144[0].f1162 = iArr;
            } else {
                this.f1144[0].f1162 = r12.f7547;
                for (int i4 = 0; i4 < r12.f7548.length; i4++) {
                    bArr[i4] = (byte) r12.f7548[i4];
                }
            }
            this.f1144[0].f1164 = bArr;
            for (int i5 = 0; i5 < this.f1144[0].f1162.length; i5++) {
                int[] iArr3 = this.f1144[0].f1162;
                if ((this.f1144[0].f1162[i5] & -986896) == -1048336) {
                    i = 0;
                } else {
                    int i6 = this.f1144[0].f1162[i5];
                    i = (-16711936 & i6) | ((16711680 & i6) >> 16) | ((i6 & 255) << 16);
                }
                iArr3[i5] = i;
            }
            this.f1144[0].f1164 = bArr;
            this.f1144[0].f1161 = 0;
            this.f1144[0].f1163 = 0;
            this.f1144[0].f1157 = r12.f7546.x;
            this.f1144[0].f1158 = r12.f7546.y;
        } else if (thVar != null) {
            this.f1146 = new int[256];
            for (int i7 = 0; i7 < 256; i7++) {
                this.f1146[i7] = C0621os.m718(thVar.f4928[i7].f3005, thVar.f4928[i7].f3004, thVar.f4928[i7].f3003, thVar.f4928[i7].f3002);
                if ((this.f1146[i7] & -986896) == -1048336) {
                    this.f1146[i7] = 0;
                }
            }
            if ((this.f1144 == null ? 0 : this.f1144.length) < thVar.f4930) {
                this.f1144 = new C0407[thVar.f4930];
            }
            if ((this.f1145 == null ? 0 : this.f1145.length) < thVar.f4929) {
                this.f1145 = new C0407[thVar.f4929];
            }
            if (thVar.f4930 > 0) {
                for (int i8 = 0; i8 < thVar.f4926.length; i8++) {
                    if (this.f1144[i8] == null) {
                        this.f1144[i8] = new C0407();
                    }
                    this.f1144[i8].f1164 = thVar.f4926[i8].f4938;
                    this.f1144[i8].f1157 = thVar.f4926[i8].f4941;
                    this.f1144[i8].f1158 = thVar.f4926[i8].f4940;
                    this.f1144[i8].f1162 = null;
                    this.f1144[i8].f1161 = -1;
                    this.f1144[i8].f1163 = 0;
                }
            }
            if (thVar.f4929 > 0) {
                for (int i9 = 0; i9 < thVar.f4927.length; i9++) {
                    C0805if ifVar = thVar.f4927[i9];
                    int[] iArr4 = new int[(ifVar.f4934.length / 4)];
                    for (int i10 = 0; i10 < iArr4.length; i10++) {
                        iArr4[i10] = C0621os.m717(ifVar.f4934[(i10 * 4) + 3], ifVar.f4934[(i10 * 4) + 2], ifVar.f4934[(i10 * 4) + 1], ifVar.f4934[i10 * 4] & 240);
                    }
                    int[] iArr5 = new int[256];
                    byte[] bArr2 = new byte[iArr4.length];
                    C0441in.m458(iArr4, ifVar.f4936, bArr2, iArr5);
                    for (int i11 = 0; i11 < iArr5.length; i11++) {
                        int i12 = iArr5[i11];
                        iArr5[i11] = (-16711936 & i12) | ((16711680 & i12) >> 16) | ((i12 & 255) << 16);
                    }
                    if (this.f1145[i9] == null) {
                        this.f1145[i9] = new C0407();
                    }
                    this.f1145[i9].f1164 = bArr2;
                    this.f1145[i9].f1162 = iArr5;
                    this.f1145[i9].f1161 = 0;
                    this.f1145[i9].f1163 = 0;
                    this.f1145[i9].f1157 = ifVar.f4936;
                    this.f1145[i9].f1158 = ifVar.f4935;
                }
            }
        }
    }

    protected C0405hk(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        C0804th thVar;
        this.f1149 = 0;
        this.f1150 = z2;
        Bitmap bitmap = null;
        if (z4) {
            str = "[emblem-guild_id=" + i + "-emblem_id=" + i2 + "]";
        }
        if (str == null) {
            String str2 = "filename = null, probably sprite filename not found";
            Log.e("AndRO", str2);
            throw new C0588no(str2);
        }
        String lowerCase = str.toLowerCase();
        if (!z3) {
            C0405hk hkVar = (C0405hk) C0252cp.f650.get(lowerCase);
            if (hkVar != null && (!z2 || hkVar.mo3778())) {
                C0405hk hkVar2 = hkVar;
                String str3 = lowerCase;
                this.f1151 = str3;
                this.f1148 = hkVar2.f1148;
                this.f1144 = hkVar2.f1144;
                this.f1145 = hkVar2.f1145;
                this.f1146 = hkVar2.f1146;
                return;
            }
        }
        if (z4) {
            C0252cp cpVar = C1014.f6158;
            bitmap = C0252cp.m264(i, i2);
            if (bitmap == null) {
                C1014.f6144.mo3652((C0839ue) new C1545(i));
                z3 = true;
            }
        }
        String str4 = "data\\sprite\\" + lowerCase + ".act";
        String str5 = "data\\sprite\\" + lowerCase + ".spr";
        this.f1151 = lowerCase;
        if (!z4) {
            try {
                thVar = new C0804th((byte[]) C1014.f6158.f677.mo3613(str5, false));
            } catch (C0823ts e) {
                throw new C0588no(e, "Failed to init SPR: " + lowerCase);
            }
        } else {
            byte[] bArr = new byte[2304];
            if (bitmap != null) {
                int[] iArr = new int[576];
                bitmap.getPixels(iArr, 0, 24, 0, 0, 24, 24);
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    bArr[(i3 * 4) + 1] = (byte) (iArr[i3] & 255);
                    bArr[(i3 * 4) + 2] = (byte) ((iArr[i3] & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8);
                    bArr[(i3 * 4) + 3] = (byte) ((iArr[i3] & 16711680) >> 16);
                    bArr[(i3 * 4) + 0] = (byte) ((iArr[i3] & ViewCompat.MEASURED_STATE_MASK) >> 24);
                }
            }
            thVar = new C1355(bArr);
        }
        if (!z) {
            byte[] bArr2 = (byte[]) C1014.f6158.f677.mo3613(str4, false);
            this.f1148 = new C0766tb();
            try {
                this.f1148.mo4100(bArr2);
            } catch (C0826tv e2) {
                throw new C0588no(e2, "Failed to init ACT: " + lowerCase);
            }
        }
        m394(thVar, null);
        if (!z3) {
            synchronized (C0252cp.f650) {
                C0252cp.f650.put(lowerCase, this);
            }
        }
    }

    public C0405hk(String str, boolean z, boolean z2, boolean z3) {
        this(str, z, z2, z3, false, 0, 0);
    }
}

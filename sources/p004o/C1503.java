package p004o;

import java.util.Arrays;
import java.util.LinkedList;

/* renamed from: o.䩚 */
final class C1503 {

    /* renamed from: Ą */
    int f7201;

    /* renamed from: ą */
    int f7202;

    /* renamed from: Ć */
    int f7203;

    /* renamed from: ć */
    int f7204;

    /* renamed from: ċ */
    LinkedList<C1507> f7205 = new LinkedList<>();

    /* renamed from: đ */
    String f7206;

    /* renamed from: Ē */
    String f7207;

    /* renamed from: ȃ */
    int f7208;

    /* renamed from: Ȋ */
    int f7209;

    /* renamed from: ˮ͈ */
    int f7210;

    /* renamed from: ˮ͍ */
    int f7211;

    /* renamed from: ܕ */
    LinkedList<C1504if> f7212 = new LinkedList<>();

    /* renamed from: 䒧 */
    LinkedList<C1506> f7213 = new LinkedList<>();

    /* renamed from: 岱 */
    int f7214;

    /* renamed from: 庸 */
    C1505[] f7215;

    /* renamed from: 櫯 */
    String f7216;

    /* renamed from: 纫 */
    LinkedList<C1507> f7217 = new LinkedList<>();

    /* renamed from: 躆 */
    LinkedList<C0377gm> f7218 = new LinkedList<>();

    /* renamed from: 鷭 */
    String f7219;

    /* renamed from: o.䩚$if */
    class C1504if {

        /* renamed from: 櫯 */
        String f7221;

        /* renamed from: 鷭 */
        String f7222;

        C1504if(String str, String str2) {
            this.f7222 = str;
            this.f7221 = str2;
        }
    }

    /* renamed from: o.䩚$ˮ͈ */
    static class C1505 {

        /* renamed from: ȃ */
        int f7223;

        /* renamed from: ˮ͈ */
        boolean f7224;

        /* renamed from: 櫯 */
        boolean f7225;

        /* renamed from: 鷭 */
        String f7226;

        C1505(String str, boolean z, boolean z2, int i) {
            this.f7226 = str;
            this.f7225 = z;
            this.f7224 = z2;
            this.f7223 = i;
        }

        C1505(int i, boolean z, boolean z2, int i2) {
            C0252cp cpVar = C1014.f6158;
            String r6 = C1014.f6160.mo3796(343);
            this.f7226 = new StringBuilder(String.valueOf(r6 == null ? "MSG343" : r6)).append(" ").append(i + 1).toString();
            this.f7225 = false;
            this.f7224 = false;
            this.f7223 = 0;
        }
    }

    /* renamed from: o.䩚$櫯 */
    class C1506 {

        /* renamed from: Ą */
        byte f7227;

        /* renamed from: ą */
        short f7228;

        /* renamed from: Ć */
        short f7229;

        /* renamed from: ć */
        int f7230;

        /* renamed from: ċ */
        int f7231;

        /* renamed from: ȃ */
        short f7232;

        /* renamed from: Ȋ */
        String f7233;

        /* renamed from: ˮ͈ */
        short f7234;

        /* renamed from: ˮ͍ */
        boolean f7235;

        /* renamed from: 岱 */
        int f7237;

        /* renamed from: 櫯 */
        int f7238;

        /* renamed from: 纫 */
        int f7239;

        /* renamed from: 鷭 */
        int f7240;

        C1506() {
        }
    }

    /* renamed from: o.䩚$鷭 */
    class C1507 {

        /* renamed from: 櫯 */
        String f7242;

        /* renamed from: 鷭 */
        int f7243;

        C1507(int i, String str) {
            this.f7243 = i;
            this.f7242 = str;
        }
    }

    C1503() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4363(int i) {
        if (this.f7215 == null) {
            this.f7215 = new C1505[i];
            return;
        }
        if (this.f7215.length < i) {
            this.f7215 = (C1505[]) Arrays.copyOf(this.f7215, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final C1505 mo4362(int i) {
        mo4363(i + 1);
        C1505 r3 = this.f7215[i];
        if (r3 != null) {
            return r3;
        }
        C1505 r32 = new C1505(i, false, false, 0);
        this.f7215[i] = r32;
        return r32;
    }
}

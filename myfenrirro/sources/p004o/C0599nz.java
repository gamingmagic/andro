package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.nz */
final class C0599nz {

    /* renamed from: Ą */
    int f2882;

    /* renamed from: ą */
    int f2883;

    /* renamed from: Ć */
    int f2884;

    /* renamed from: ć */
    int f2885;

    /* renamed from: ċ */
    int f2886;

    /* renamed from: đ */
    short f2887;

    /* renamed from: Ē */
    short f2888;

    /* renamed from: ē */
    short f2889;

    /* renamed from: Ė */
    short f2890;

    /* renamed from: ė */
    short f2891;

    /* renamed from: Ę */
    short f2892;

    /* renamed from: ę */
    short f2893;

    /* renamed from: ġ */
    byte f2894;

    /* renamed from: ģ */
    short f2895;

    /* renamed from: Ĥ */
    short f2896;

    /* renamed from: ĥ */
    byte[] f2897;

    /* renamed from: Ħ */
    int f2898;

    /* renamed from: ħ */
    int f2899;

    /* renamed from: Ĩ */
    int f2900;

    /* renamed from: Ī */
    byte f2901;

    /* renamed from: ȃ */
    long f2902;

    /* renamed from: Ȋ */
    short f2903;

    /* renamed from: Ƞ */
    byte f2904;

    /* renamed from: ˮ͈ */
    int f2905;

    /* renamed from: ˮ͍ */
    int f2906;

    /* renamed from: ܕ */
    short f2907;

    /* renamed from: ܨ */
    byte f2908;

    /* renamed from: ঽ্ */
    byte[] f2909 = new byte[24];

    /* renamed from: 㥳 */
    short f2910;

    /* renamed from: 㱽 */
    byte f2911;

    /* renamed from: 㵼 */
    byte f2912;

    /* renamed from: 䒧 */
    short f2913;

    /* renamed from: 囃 */
    short f2914;

    /* renamed from: 岱 */
    int f2915;

    /* renamed from: 庸 */
    short f2916;

    /* renamed from: 廂 */
    short f2917;

    /* renamed from: 廅 */
    byte f2918;

    /* renamed from: 廑 */
    int f2919;

    /* renamed from: 櫯 */
    long f2920;

    /* renamed from: 纫 */
    int f2921;

    /* renamed from: 躆 */
    short f2922;

    /* renamed from: 鷭 */
    int f2923;

    /* renamed from: 띥 */
    short f2924;

    C0599nz() {
    }

    C0599nz(ByteBuffer byteBuffer) {
        byte[] bArr;
        this.f2923 = byteBuffer.getInt();
        this.f2920 = C1014.f6140.f4455 ? byteBuffer.getLong() : (long) byteBuffer.getInt();
        this.f2905 = byteBuffer.getInt();
        this.f2902 = C1014.f6140.f4455 ? byteBuffer.getLong() : (long) byteBuffer.getInt();
        this.f2882 = byteBuffer.getInt();
        this.f2883 = byteBuffer.getInt();
        this.f2884 = byteBuffer.getInt();
        this.f2885 = byteBuffer.getInt();
        this.f2906 = byteBuffer.getInt();
        this.f2915 = byteBuffer.getInt();
        this.f2903 = byteBuffer.getShort();
        this.f2886 = C1014.f6140.f4470 > 20081217 ? byteBuffer.getInt() : byteBuffer.getShort();
        this.f2921 = C1014.f6140.f4470 > 20081217 ? byteBuffer.getInt() : byteBuffer.getShort();
        this.f2913 = byteBuffer.getShort();
        this.f2922 = byteBuffer.getShort();
        this.f2907 = byteBuffer.getShort();
        this.f2916 = byteBuffer.getShort();
        this.f2887 = byteBuffer.getShort();
        this.f2888 = C1014.f6140.f4453 ? byteBuffer.getShort() : 0;
        this.f2889 = byteBuffer.getShort();
        this.f2924 = byteBuffer.getShort();
        this.f2910 = byteBuffer.getShort();
        this.f2890 = byteBuffer.getShort();
        this.f2891 = byteBuffer.getShort();
        this.f2892 = byteBuffer.getShort();
        this.f2893 = byteBuffer.getShort();
        this.f2917 = byteBuffer.getShort();
        this.f2914 = byteBuffer.getShort();
        byteBuffer.get(this.f2909);
        this.f2918 = byteBuffer.get();
        this.f2912 = byteBuffer.get();
        this.f2911 = byteBuffer.get();
        this.f2904 = byteBuffer.get();
        this.f2894 = byteBuffer.get();
        this.f2908 = byteBuffer.get();
        this.f2895 = byteBuffer.getShort();
        this.f2896 = C1014.f6140.f4470 >= 20061023 ? byteBuffer.getShort() : 0;
        if (C1014.f6140.f4449) {
            byte[] bArr2 = new byte[16];
            byteBuffer.get(bArr2);
            bArr = bArr2;
        } else {
            bArr = null;
        }
        this.f2897 = bArr;
        this.f2898 = C1014.f6140.f4450 ? byteBuffer.getInt() : 0;
        this.f2899 = C1014.f6140.f4492 ? byteBuffer.getInt() : 0;
        this.f2900 = C1014.f6140.f4503 ? byteBuffer.getInt() : 0;
        this.f2919 = C1014.f6140.f4509 ? byteBuffer.getInt() : 0;
        this.f2901 = C1014.f6140.f4454 ? byteBuffer.get() : C1014.f6161.f6163;
        if (this.f2901 == 99) {
            this.f2901 = C1014.f6161.f6163;
        }
    }
}

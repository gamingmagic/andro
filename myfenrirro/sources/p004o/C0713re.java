package p004o;

import p004o.C0663pk.C0664if;

/* renamed from: o.re */
public final class C0713re extends C0663pk {
    public C0713re(C0682qa qaVar) {
        super(qaVar);
    }

    /* renamed from: 鷭 */
    public final int mo4076() {
        return 1626668964;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 櫯 */
    public final long mo4075() {
        return 1046766857;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ˮ͈ */
    public final long mo4074() {
        return -150077848;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final long mo4078(C0664if ifVar, long j, long j2) {
        long j3 = j - ((-1053200238 * j) - (-1282776673 * j2));
        long j4 = j3;
        ifVar.f4620[(int) j2] = (j3 >> 5) & 255;
        return j4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final void mo4080(byte[] bArr, int i, int i2, C0664if ifVar) {
        long[] jArr = ifVar.f4620;
        int i3 = (int) ifVar.f4621;
        jArr[i3] = jArr[i3] ^ ifVar.f4623;
        long[] jArr2 = ifVar.f4620;
        int i4 = (int) ifVar.f4621;
        jArr2[i4] = jArr2[i4] & 255;
        ifVar.f4622 += ifVar.f4620[(int) ifVar.f4623] * 46;
        ifVar.f4622 &= 255;
        ifVar.f4623 += ifVar.f4620[(int) ifVar.f4622] * 228;
        ifVar.f4623 &= 255;
        long[] jArr3 = ifVar.f4620;
        int i5 = (int) ifVar.f4622;
        jArr3[i5] = jArr3[i5] ^ ifVar.f4621;
        long[] jArr4 = ifVar.f4620;
        int i6 = (int) ifVar.f4622;
        jArr4[i6] = jArr4[i6] & 255;
        ifVar.f4623 += ifVar.f4621 ^ 155;
        ifVar.f4623 &= 255;
        bArr[i] = (byte) ((int) (((long) bArr[i]) ^ ifVar.f4620[(int) ifVar.f4622]));
        ifVar.f4623 ^= ifVar.f4622 - ((long) (i2 % 255));
        ifVar.f4623 &= 255;
        ifVar.f4621++;
        ifVar.f4621 &= 255;
    }
}

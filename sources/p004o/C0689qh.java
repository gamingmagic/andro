package p004o;

import p004o.C0663pk.C0664if;

/* renamed from: o.qh */
public final class C0689qh extends C0663pk {
    public C0689qh(C0682qa qaVar) {
        super(qaVar);
    }

    /* renamed from: 鷭 */
    public final int mo4076() {
        return 961605246;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 櫯 */
    public final long mo4075() {
        return -635974733;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ˮ͈ */
    public final long mo4074() {
        return -367963998;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final long mo4078(C0664if ifVar, long j, long j2) {
        long j3 = ((857107894 * j) - (((long) ((int) j2)) * -626656751)) + j;
        long j4 = j3;
        ifVar.f4620[(int) j2] = (j3 >> 4) & 255;
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
        ifVar.f4622 -= ifVar.f4620[(int) ifVar.f4621] * 151;
        ifVar.f4622 &= 255;
        ifVar.f4623 += ifVar.f4620[(int) ifVar.f4622] - 170;
        ifVar.f4623 &= 255;
        long[] jArr3 = ifVar.f4620;
        int i5 = (int) ifVar.f4623;
        jArr3[i5] = jArr3[i5] ^ ifVar.f4622;
        long[] jArr4 = ifVar.f4620;
        int i6 = (int) ifVar.f4623;
        jArr4[i6] = jArr4[i6] & 255;
        ifVar.f4623 -= ifVar.f4622 ^ 249;
        ifVar.f4623 &= 255;
        bArr[i] = (byte) ((int) (((long) bArr[i]) ^ ifVar.f4620[(int) ifVar.f4622]));
        ifVar.f4622 ^= ifVar.f4621 - ((long) (i2 % 255));
        ifVar.f4622 &= 255;
        ifVar.f4621++;
        ifVar.f4621 &= 255;
    }
}

package p004o;

import p004o.C0663pk.C0664if;

/* renamed from: o.qs */
public final class C0700qs extends C0663pk {
    public C0700qs(C0682qa qaVar) {
        super(qaVar);
    }

    /* renamed from: 鷭 */
    public final int mo4076() {
        return -2009390055;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 櫯 */
    public final long mo4075() {
        return -606574536;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ˮ͈ */
    public final long mo4074() {
        return 393236470;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final long mo4078(C0664if ifVar, long j, long j2) {
        long j3 = j - ((-1772558172 * j) - (((long) ((int) j2)) * 1538539605));
        long j4 = j3;
        ifVar.f4620[(int) j2] = (j3 >> 13) & 255;
        return j4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final void mo4080(byte[] bArr, int i, int i2, C0664if ifVar) {
        ifVar.f4622 -= ifVar.f4620[(int) ifVar.f4623] * 106;
        ifVar.f4622 &= 255;
        long[] jArr = ifVar.f4620;
        int i3 = (int) ifVar.f4621;
        jArr[i3] = jArr[i3] ^ ifVar.f4622;
        long[] jArr2 = ifVar.f4620;
        int i4 = (int) ifVar.f4621;
        jArr2[i4] = jArr2[i4] & 255;
        ifVar.f4622 += ifVar.f4620[(int) ifVar.f4621] - 185;
        ifVar.f4622 &= 255;
        long[] jArr3 = ifVar.f4620;
        int i5 = (int) ifVar.f4622;
        jArr3[i5] = jArr3[i5] ^ ifVar.f4623;
        long[] jArr4 = ifVar.f4620;
        int i6 = (int) ifVar.f4622;
        jArr4[i6] = jArr4[i6] & 255;
        ifVar.f4623 += ifVar.f4622 * 56;
        ifVar.f4623 &= 255;
        bArr[i] = (byte) ((int) (((long) bArr[i]) ^ ifVar.f4620[(int) ifVar.f4623]));
        ifVar.f4623 ^= ifVar.f4621 + ((long) (i2 % 255));
        ifVar.f4623 &= 255;
        ifVar.f4621++;
        ifVar.f4621 &= 255;
    }
}

package p004o;

import p004o.C0663pk.C0664if;

/* renamed from: o.pv */
public final class C0676pv extends C0663pk {
    public C0676pv(C0682qa qaVar) {
        super(qaVar);
    }

    /* renamed from: 鷭 */
    public final int mo4076() {
        return -1711645755;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 櫯 */
    public final long mo4075() {
        return -936012293;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ˮ͈ */
    public final long mo4074() {
        return -364559969;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final long mo4078(C0664if ifVar, long j, long j2) {
        long j3 = j - ((-355007898 * j) - (-318176484 * j2));
        long j4 = j3;
        ifVar.f4620[(int) j2] = (j3 >> 3) & 255;
        return j4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final void mo4080(byte[] bArr, int i, int i2, C0664if ifVar) {
        ifVar.f4622 -= ifVar.f4620[(int) ifVar.f4623] * 19;
        ifVar.f4622 &= 255;
        long[] jArr = ifVar.f4620;
        int i3 = (int) ifVar.f4622;
        jArr[i3] = jArr[i3] ^ ifVar.f4623;
        long[] jArr2 = ifVar.f4620;
        int i4 = (int) ifVar.f4622;
        jArr2[i4] = jArr2[i4] & 255;
        ifVar.f4623 += ifVar.f4620[(int) ifVar.f4622] * 172;
        ifVar.f4623 &= 255;
        long[] jArr3 = ifVar.f4620;
        int i5 = (int) ifVar.f4621;
        jArr3[i5] = jArr3[i5] ^ ifVar.f4622;
        long[] jArr4 = ifVar.f4620;
        int i6 = (int) ifVar.f4621;
        jArr4[i6] = jArr4[i6] & 255;
        ifVar.f4622 -= ifVar.f4621 * 180;
        ifVar.f4622 &= 255;
        bArr[i] = (byte) ((int) (((long) bArr[i]) ^ ifVar.f4620[(int) ifVar.f4623]));
        ifVar.f4623 ^= ifVar.f4622 + ((long) (i2 % 255));
        ifVar.f4623 &= 255;
        ifVar.f4621++;
        ifVar.f4621 &= 255;
    }
}

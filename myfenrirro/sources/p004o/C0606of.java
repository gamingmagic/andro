package p004o;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: o.of */
public final class C0606of {

    /* renamed from: 鷭 */
    public ByteBuffer f2975;

    public C0606of() {
        this.f2975 = ByteBuffer.allocate(32);
    }

    public C0606of(int i) {
        this.f2975 = ByteBuffer.allocate(i);
    }

    /* renamed from: 鷭 */
    public final void mo4029(int i) {
        while (this.f2975.remaining() < i) {
            this.f2975 = (ByteBuffer) ByteBuffer.wrap(Arrays.copyOf(this.f2975.array(), this.f2975.array().length * 2)).position(this.f2975.position());
        }
    }

    /* renamed from: 鷭 */
    public final C0606of mo4026(byte[] bArr) {
        mo4029(bArr.length);
        this.f2975.put(bArr);
        return this;
    }

    /* renamed from: 鷭 */
    public final C0606of mo4027(byte[] bArr, int i) {
        mo4029(i);
        this.f2975.put(bArr, 0, i);
        return this;
    }

    /* renamed from: 櫯 */
    private int m687(byte[] bArr, int i) {
        byte[] array = this.f2975.array();
        int position = this.f2975.position();
        while (i < (position - bArr.length) + 1) {
            if (array[i] == bArr[0]) {
                int i2 = 0;
                while (i2 < bArr.length && array[i2 + i] == bArr[i2]) {
                    i2++;
                }
                if (i2 == bArr.length) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 137 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p004o.C0606of mo4028(byte[] r9, byte[] r10) {
        /*
            r8 = this;
            int r0 = r9.length
            int r1 = r10.length
            if (r0 == r1) goto L_0x0061
            r2 = 0
            r3 = 0
        L_0x0006:
            int r2 = r8.m687(r9, r2)
            r0 = -1
            if (r2 == r0) goto L_0x0012
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L_0x0006
        L_0x0012:
            if (r3 > 0) goto L_0x0015
            return r8
        L_0x0015:
            int r0 = r10.length
            int r1 = r9.length
            int r2 = r0 - r1
            java.nio.ByteBuffer r0 = r8.f2975
            byte[] r4 = r0.array()
            java.nio.ByteBuffer r0 = r8.f2975
            int r5 = r0.position()
            int r0 = r2 * r3
            int r0 = r0 + r5
            byte[] r2 = new byte[r0]
            r3 = 0
            r6 = 0
            goto L_0x0052
        L_0x002d:
            int r0 = r9.length
            int r0 = p004o.C0622ot.m734(r4, r6, r9, r0)
            if (r0 != 0) goto L_0x004a
            r7 = 0
            goto L_0x0044
        L_0x0036:
            r0 = r3
            int r3 = r3 + 1
            byte r1 = r10[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003e }
            r2[r0] = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0042:
            int r7 = r7 + 1
        L_0x0044:
            int r0 = r10.length
            if (r7 < r0) goto L_0x0036
            int r0 = r9.length
            int r6 = r6 + r0
            goto L_0x0052
        L_0x004a:
            byte r0 = r4[r6]
            r2[r3] = r0
            int r3 = r3 + 1
            int r6 = r6 + 1
        L_0x0052:
            if (r6 < r5) goto L_0x002d
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2)
            r8.f2975 = r0
            java.nio.ByteBuffer r0 = r8.f2975
            int r1 = r2.length
            r0.position(r1)
            goto L_0x007f
        L_0x0061:
            r2 = 0
            java.nio.ByteBuffer r0 = r8.f2975
            byte[] r3 = r0.array()
        L_0x0068:
            int r2 = r8.m687(r9, r2)
            r0 = -1
            if (r2 == r0) goto L_0x007f
            r4 = 0
            goto L_0x0079
        L_0x0071:
            int r0 = r2 + r4
            byte r1 = r10[r4]
            r3[r0] = r1
            int r4 = r4 + 1
        L_0x0079:
            int r0 = r10.length
            if (r4 < r0) goto L_0x0071
            int r2 = r2 + 1
            goto L_0x0068
        L_0x007f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0606of.mo4028(byte[], byte[]):o.of");
    }
}

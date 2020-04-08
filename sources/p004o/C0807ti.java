package p004o;

import android.util.FloatMath;
import java.nio.ByteBuffer;

/* renamed from: o.ti */
public final class C0807ti {

    /* renamed from: Ą */
    public String[] f4942;

    /* renamed from: ą */
    public float[] f4943;

    /* renamed from: Ć */
    public float[] f4944;

    /* renamed from: ć */
    public float[] f4945;

    /* renamed from: ȃ */
    public int f4946;

    /* renamed from: Ȋ */
    public int[] f4947;

    /* renamed from: ˮ͈ */
    public int f4948;

    /* renamed from: ˮ͍ */
    public int[] f4949;

    /* renamed from: 岱 */
    public char[] f4950;

    /* renamed from: 櫯 */
    public int f4951;

    /* renamed from: 鷭 */
    public int f4952;

    /* renamed from: o.ti$if */
    public class C0808if {

        /* renamed from: Ą */
        C0809 f4953;

        /* renamed from: ą */
        int f4954;

        /* renamed from: ȃ */
        C0809 f4956;

        /* renamed from: ˮ͈ */
        C0809[] f4957;

        /* renamed from: 櫯 */
        int[] f4958;

        /* renamed from: 鷭 */
        String[] f4959;

        C0808if(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            this.f4959 = new String[i];
            this.f4958 = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                String[] strArr = this.f4959;
                C0618op opVar = C0618op.KOREAN;
                byte[] bArr = new byte[128];
                byteBuffer.get(bArr);
                strArr[i2] = C0622ot.m741(bArr, opVar);
            }
            this.f4957 = new C0809[byteBuffer.getInt()];
            for (int i3 = 0; i3 < this.f4957.length; i3++) {
                this.f4957[i3] = new C0809(byteBuffer);
            }
            this.f4956 = this.f4957[0];
            this.f4954 = 0;
        }
    }

    /* renamed from: o.ti$鷭 */
    public class C0809 {

        /* renamed from: Ą */
        public float f4960;

        /* renamed from: ą */
        public float f4961;

        /* renamed from: Ć */
        public float f4962;

        /* renamed from: ć */
        public float f4963;

        /* renamed from: ċ */
        public float f4964;

        /* renamed from: đ */
        public float f4965;

        /* renamed from: Ē */
        public float f4966;

        /* renamed from: ē */
        public float f4967;

        /* renamed from: Ė */
        public int f4968;

        /* renamed from: ė */
        public int f4969;

        /* renamed from: Ę */
        public int f4970;

        /* renamed from: ȃ */
        public float f4972;

        /* renamed from: Ȋ */
        public float f4973;

        /* renamed from: ˮ͈ */
        public float f4974;

        /* renamed from: ˮ͍ */
        public float f4975;

        /* renamed from: ܕ */
        public int f4976;

        /* renamed from: 㥳 */
        public float f4977;

        /* renamed from: 䒧 */
        public float[] f4978 = new float[4];

        /* renamed from: 岱 */
        public float f4979;

        /* renamed from: 庸 */
        public float f4980;

        /* renamed from: 櫯 */
        public int f4981;

        /* renamed from: 纫 */
        public float[] f4982 = new float[4];

        /* renamed from: 躆 */
        public int f4983;

        /* renamed from: 鷭 */
        public int f4984;

        /* renamed from: 띥 */
        public float f4985;

        C0809(ByteBuffer byteBuffer) {
            this.f4984 = byteBuffer.getInt();
            this.f4981 = byteBuffer.getInt();
            this.f4974 = byteBuffer.getFloat();
            this.f4972 = byteBuffer.getFloat();
            this.f4960 = byteBuffer.getFloat();
            this.f4961 = byteBuffer.getFloat();
            this.f4962 = byteBuffer.getFloat();
            this.f4963 = byteBuffer.getFloat();
            this.f4975 = byteBuffer.getFloat();
            this.f4979 = byteBuffer.getFloat();
            this.f4973 = byteBuffer.getFloat();
            this.f4964 = byteBuffer.getFloat();
            C0620or.m714(byteBuffer, this.f4982);
            C0620or.m714(byteBuffer, this.f4978);
            this.f4983 = (int) byteBuffer.getFloat();
            this.f4976 = byteBuffer.getInt();
            this.f4980 = byteBuffer.getFloat();
            this.f4965 = byteBuffer.getFloat();
            this.f4966 = byteBuffer.getFloat();
            this.f4967 = byteBuffer.getFloat();
            this.f4985 = byteBuffer.getFloat();
            this.f4977 = byteBuffer.getFloat();
            this.f4968 = byteBuffer.getInt();
            this.f4969 = byteBuffer.getInt();
            this.f4970 = byteBuffer.getInt();
            if (this.f4969 == 7) {
                this.f4969 = 2;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final void mo4113(C0809 r5, int i) {
            this.f4974 += r5.f4974;
            this.f4972 += r5.f4972;
            this.f4960 += r5.f4960;
            this.f4961 += r5.f4961;
            this.f4962 += r5.f4962;
            this.f4963 += r5.f4963;
            this.f4975 += r5.f4975;
            this.f4979 += r5.f4979;
            this.f4973 += r5.f4973;
            this.f4964 += r5.f4964;
            for (int i2 = 0; i2 < 4; i2++) {
                float[] fArr = this.f4982;
                fArr[i2] = fArr[i2] + r5.f4982[i2];
                float[] fArr2 = this.f4978;
                fArr2[i2] = fArr2[i2] + r5.f4978[i2];
            }
            this.f4966 += r5.f4966;
            this.f4967 += r5.f4967;
            this.f4985 += r5.f4985;
            this.f4977 += r5.f4977;
            this.f4965 += r5.f4965;
            switch (r5.f4976) {
                case 1:
                    this.f4983 += r5.f4983;
                    return;
                case 2:
                    this.f4983 += r5.f4983;
                    if (this.f4983 >= i) {
                        this.f4983 = i - 1;
                        return;
                    }
                    break;
                case 3:
                    this.f4983 += r5.f4983;
                    this.f4983 %= i;
                    return;
                case 4:
                    this.f4983 -= r5.f4983;
                    while (this.f4983 < 0) {
                        this.f4983 += i;
                    }
                    break;
            }
        }
    }

    /* renamed from: 鷭 */
    private void m1506(C0809 r9, int i, int i2) {
        this.f4949[i2] = i;
        this.f4950[i2] = (char) ((r9.f4969 << 4) + r9.f4968);
        int i3 = i2 << 2;
        this.f4945[i3 + 0] = r9.f4966 * 0.003921569f;
        this.f4945[i3 + 1] = r9.f4967 * 0.003921569f;
        this.f4945[i3 + 2] = r9.f4985 * 0.003921569f;
        this.f4945[i3 + 3] = r9.f4977 * 0.003921569f;
        int i4 = i3 << 1;
        if (r9.f4982[0] >= r9.f4982[1]) {
            this.f4943[i4 + 2] = r9.f4982[1];
            this.f4943[i4 + 6] = r9.f4982[0];
            this.f4943[i4 + 0] = r9.f4982[2];
            this.f4943[i4 + 4] = r9.f4982[3];
            this.f4944[i4 + 2] = r9.f4960 + r9.f4962;
            this.f4944[i4 + 6] = r9.f4960;
            this.f4944[i4 + 0] = r9.f4960 + r9.f4962;
            this.f4944[i4 + 4] = r9.f4960;
        } else {
            this.f4943[i4 + 2] = r9.f4982[0];
            this.f4943[i4 + 6] = r9.f4982[1];
            this.f4943[i4 + 0] = r9.f4982[3];
            this.f4943[i4 + 4] = r9.f4982[2];
            this.f4944[i4 + 2] = r9.f4960;
            this.f4944[i4 + 6] = r9.f4960 + r9.f4962;
            this.f4944[i4 + 0] = r9.f4960;
            this.f4944[i4 + 4] = r9.f4960 + r9.f4962;
        }
        if (r9.f4978[1] >= r9.f4978[2]) {
            this.f4943[i4 + 7] = r9.f4978[2];
            this.f4943[i4 + 5] = r9.f4978[1];
            this.f4943[i4 + 3] = r9.f4978[3];
            this.f4943[i4 + 1] = r9.f4978[0];
            this.f4944[i4 + 7] = r9.f4961 + r9.f4963;
            this.f4944[i4 + 5] = r9.f4961;
            this.f4944[i4 + 3] = r9.f4961 + r9.f4963;
            this.f4944[i4 + 1] = r9.f4961;
        } else {
            this.f4943[i4 + 7] = r9.f4978[1];
            this.f4943[i4 + 5] = r9.f4978[2];
            this.f4943[i4 + 3] = r9.f4978[0];
            this.f4943[i4 + 1] = r9.f4978[3];
            this.f4944[i4 + 7] = r9.f4961;
            this.f4944[i4 + 5] = r9.f4961 + r9.f4963;
            this.f4944[i4 + 3] = r9.f4961;
            this.f4944[i4 + 1] = r9.f4961 + r9.f4963;
        }
        float sin = FloatMath.sin(r9.f4965 * 0.0061359233f);
        float cos = FloatMath.cos(r9.f4965 * 0.0061359233f);
        for (int i5 = 0; i5 < 8; i5 += 2) {
            float f = this.f4943[i4 + i5 + 0];
            float f2 = this.f4943[i4 + i5 + 1];
            this.f4943[i4 + i5 + 0] = (((f * cos) - (f2 * sin)) + r9.f4974) - 320.0f;
            this.f4943[i4 + i5 + 1] = (((f * sin) + (f2 * cos)) + r9.f4972) - 320.0f;
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 165 */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01c1, code lost:
        if (r10.f4956.f4984 >= r9) goto L_0x01c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0807ti(java.nio.ByteBuffer r17) {
        /*
            r16 = this;
            r0 = r16
            r0.<init>()
            o.op r8 = p004o.C0618op.LATIN
            r5 = r17
            r0 = 4
            byte[] r6 = new byte[r0]
            r5.get(r6)
            java.lang.String r0 = p004o.C0622ot.m741(r6, r8)
            java.lang.String r1 = "STRM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0023
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid file magic"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            r0 = r17
            int r0 = r0.getInt()
            r1 = r16
            r1.f4952 = r0
            r0 = r16
            int r0 = r0.f4952
            r1 = 148(0x94, float:2.07E-43)
            if (r0 == r1) goto L_0x004e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid file version: "
            r1.<init>(r2)
            r2 = r16
            int r2 = r2.f4952
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x004e:
            r0 = r17
            int r0 = r0.getInt()
            r1 = r16
            r1.f4946 = r0
            r0 = r17
            int r0 = r0.getInt()
            r1 = r16
            r1.f4951 = r0
            r0 = r17
            int r5 = r0.getInt()
            r6 = r17
            r0 = 24
            byte[] r8 = new byte[r0]
            r6.get(r8)
            int r5 = r5 + -1
            o.ti$if[] r5 = new p004o.C0807ti.C0808if[r5]
            r6 = 0
            goto L_0x0084
        L_0x0077:
            o.ti$if r0 = new o.ti$if
            r1 = r16
            r2 = r17
            r0.<init>(r2)
            r5[r6] = r0
            int r6 = r6 + 1
        L_0x0084:
            int r0 = r5.length
            if (r6 < r0) goto L_0x0077
            r6 = 0
            r17 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r0 = 0
            r1 = r16
            r1.f4948 = r0
            r12 = r5
            int r11 = r5.length
            r10 = 0
            goto L_0x0110
        L_0x009e:
            r9 = r12[r10]
            r13 = 0
            goto L_0x00cd
        L_0x00a2:
            int[] r1 = r9.f4958
            java.lang.String[] r0 = r9.f4959
            r0 = r0[r13]
            int r0 = r7.indexOf(r0)
            r1[r13] = r0
            if (r0 >= 0) goto L_0x00cb
            int[] r0 = r9.f4958
            r1 = r8
            int r2 = r1.intValue()
            int r2 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8 = r2
            int r1 = r1.intValue()
            r0[r13] = r1
            java.lang.String[] r0 = r9.f4959
            r0 = r0[r13]
            r7.add(r0)
        L_0x00cb:
            int r13 = r13 + 1
        L_0x00cd:
            java.lang.String[] r0 = r9.f4959
            int r0 = r0.length
            if (r13 < r0) goto L_0x00a2
            r0 = 0
            r9.f4959 = r0
            o.ti$鷭[] r15 = r9.f4957
            int r14 = r15.length
            r9 = 0
            goto L_0x010c
        L_0x00da:
            r13 = r15[r9]
            int r0 = r13.f4981
            if (r0 != 0) goto L_0x00ff
            if (r6 == 0) goto L_0x00ef
            r0 = r16
            int r0 = r0.f4948
            int r1 = r13.f4984
            int r1 = r1 - r17
            int r0 = r0 + r1
            r1 = r16
            r1.f4948 = r0
        L_0x00ef:
            r0 = r16
            int r0 = r0.f4948
            int r0 = r0 + 1
            r1 = r16
            r1.f4948 = r0
            int r0 = r13.f4984
            int r17 = r0 + 1
            r6 = 0
            goto L_0x010a
        L_0x00ff:
            int r0 = r13.f4984
            r1 = r17
            if (r1 >= r0) goto L_0x0109
            int r0 = r13.f4984
            r17 = r0
        L_0x0109:
            r6 = 1
        L_0x010a:
            int r9 = r9 + 1
        L_0x010c:
            if (r9 < r14) goto L_0x00da
            int r10 = r10 + 1
        L_0x0110:
            if (r10 < r11) goto L_0x009e
            r0 = r16
            int r0 = r0.f4948
            int r0 = r0 * 8
            float[] r0 = new float[r0]
            r1 = r16
            r1.f4943 = r0
            r0 = r16
            int r0 = r0.f4948
            int r0 = r0 * 8
            float[] r0 = new float[r0]
            r1 = r16
            r1.f4944 = r0
            r0 = r16
            int r0 = r0.f4948
            int r0 = r0 * 4
            float[] r0 = new float[r0]
            r1 = r16
            r1.f4945 = r0
            r0 = r16
            int r0 = r0.f4948
            char[] r0 = new char[r0]
            r1 = r16
            r1.f4950 = r0
            r0 = r16
            int r0 = r0.f4948
            int[] r0 = new int[r0]
            r1 = r16
            r1.f4949 = r0
            r0 = r16
            int r0 = r0.f4951
            int r0 = r0 + 2
            int[] r0 = new int[r0]
            r1 = r16
            r1.f4947 = r0
            r0 = 0
            r1 = r16
            r1.f4948 = r0
            r0 = r16
            int[] r0 = r0.f4947
            r1 = 0
            r2 = 0
            r0[r2] = r1
            r9 = 0
            goto L_0x01ee
        L_0x0166:
            r13 = r5
            int r12 = r5.length
            r11 = 0
            goto L_0x01de
        L_0x016b:
            r10 = r13[r11]
            o.ti$鷭 r0 = r10.f4956
            int r0 = r0.f4984
            if (r0 <= r9) goto L_0x0199
            goto L_0x01dc
        L_0x0175:
            int r0 = r10.f4954
            int r0 = r0 + 1
            r10.f4954 = r0
            o.ti$鷭[] r0 = r10.f4957
            int r1 = r10.f4954
            r0 = r0[r1]
            int r0 = r0.f4981
            if (r0 != 0) goto L_0x0191
            o.ti$鷭[] r0 = r10.f4957
            int r1 = r10.f4954
            r0 = r0[r1]
            r10.f4956 = r0
            r0 = 0
            r10.f4953 = r0
            goto L_0x0199
        L_0x0191:
            o.ti$鷭[] r0 = r10.f4957
            int r1 = r10.f4954
            r0 = r0[r1]
            r10.f4953 = r0
        L_0x0199:
            int r0 = r10.f4954
            o.ti$鷭[] r1 = r10.f4957
            int r1 = r1.length
            int r1 = r1 + -1
            if (r0 >= r1) goto L_0x01ae
            o.ti$鷭[] r0 = r10.f4957
            int r1 = r10.f4954
            int r1 = r1 + 1
            r0 = r0[r1]
            int r0 = r0.f4984
            if (r0 <= r9) goto L_0x0175
        L_0x01ae:
            o.ti$鷭 r0 = r10.f4953
            if (r0 == 0) goto L_0x01bd
            o.ti$鷭 r0 = r10.f4956
            o.ti$鷭 r1 = r10.f4953
            int[] r2 = r10.f4958
            int r2 = r2.length
            r0.mo4113(r1, r2)
            goto L_0x01c3
        L_0x01bd:
            o.ti$鷭 r0 = r10.f4956
            int r0 = r0.f4984
            if (r0 < r9) goto L_0x01dc
        L_0x01c3:
            o.ti$鷭 r0 = r10.f4956
            int[] r1 = r10.f4958
            o.ti$鷭 r2 = r10.f4956
            int r2 = r2.f4983
            r1 = r1[r2]
            r2 = r16
            int r2 = r2.f4948
            int r3 = r2 + 1
            r4 = r16
            r4.f4948 = r3
            r3 = r16
            r3.m1506(r0, r1, r2)
        L_0x01dc:
            int r11 = r11 + 1
        L_0x01de:
            if (r11 < r12) goto L_0x016b
            r0 = r16
            int[] r0 = r0.f4947
            int r1 = r9 + 1
            r2 = r16
            int r2 = r2.f4948
            r0[r1] = r2
            int r9 = r9 + 1
        L_0x01ee:
            r0 = r16
            int r0 = r0.f4951
            if (r9 <= r0) goto L_0x0166
            int r0 = r7.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r16
            r1.f4942 = r0
            r0 = r16
            java.lang.String[] r0 = r0.f4942
            r7.toArray(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0807ti.<init>(java.nio.ByteBuffer):void");
    }
}

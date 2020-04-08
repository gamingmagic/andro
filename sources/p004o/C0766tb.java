package p004o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.tb */
public final class C0766tb {

    /* renamed from: Ą */
    public int f4680;

    /* renamed from: ą */
    public int f4681;

    /* renamed from: Ć */
    public C0768[] f4682;

    /* renamed from: ć */
    public C0767if[] f4683;

    /* renamed from: ȃ */
    public short f4684;

    /* renamed from: ˮ͈ */
    public byte f4685;

    /* renamed from: 櫯 */
    public byte f4686;

    /* renamed from: 鷭 */
    public byte[] f4687 = new byte[2];

    /* renamed from: o.tb$if */
    public class C0767if {

        /* renamed from: 鷭 */
        public byte[] f4689 = new byte[40];

        public C0767if() {
        }
    }

    /* renamed from: o.tb$鷭 */
    public class C0768 {

        /* renamed from: ˮ͈ */
        public float f4691 = 0.0f;

        /* renamed from: 櫯 */
        public C0769[] f4692;

        /* renamed from: 鷭 */
        public int f4693 = 0;

        /* renamed from: o.tb$鷭$鷭 */
        public class C0769 {

            /* renamed from: Ą */
            public int f4694;

            /* renamed from: ą */
            public C0771[] f4695;

            /* renamed from: ȃ */
            public C0770if[] f4697;

            /* renamed from: ˮ͈ */
            public short[] f4698 = new short[12];

            /* renamed from: 櫯 */
            public int f4699;

            /* renamed from: 鷭 */
            public int f4700;

            /* renamed from: o.tb$鷭$鷭$if */
            public class C0770if {

                /* renamed from: Ą */
                public int f4701;

                /* renamed from: ą */
                public float f4702 = 2.5f;

                /* renamed from: Ć */
                public float f4703 = 2.5f;

                /* renamed from: ć */
                public int f4704;

                /* renamed from: ċ */
                public int f4705;

                /* renamed from: ȃ */
                public int f4706;

                /* renamed from: Ȋ */
                public int f4707;

                /* renamed from: ˮ͈ */
                public int f4708;

                /* renamed from: ˮ͍ */
                public int f4709;

                /* renamed from: 岱 */
                public char[] f4710 = new char[12];

                /* renamed from: 櫯 */
                public int f4711 = -110;

                /* renamed from: 鷭 */
                public int f4713;

                public C0770if() {
                }
            }

            /* renamed from: o.tb$鷭$鷭$鷭 */
            public class C0771 {

                /* renamed from: ȃ */
                public int f4715;

                /* renamed from: ˮ͈ */
                public int f4716;

                /* renamed from: 櫯 */
                public int f4717;

                /* renamed from: 鷭 */
                public int f4718;

                public C0771() {
                }
            }

            public C0769() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: 鷭 */
            public final void mo4102(ByteBuffer byteBuffer) {
                this.f4700 = byteBuffer.getInt();
                this.f4699 = byteBuffer.getInt();
                for (int i = 0; i < this.f4698.length; i++) {
                    this.f4698[i] = byteBuffer.getShort();
                }
                int i2 = byteBuffer.getInt();
                if (i2 < 0) {
                    throw new C0826tv("Invalid ACT layer count: " + i2);
                }
                this.f4697 = new C0770if[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    this.f4697[i3] = new C0770if();
                    C0770if ifVar = this.f4697[i3];
                    ByteBuffer byteBuffer2 = byteBuffer;
                    ifVar.f4713 = byteBuffer2.getInt();
                    ifVar.f4711 = byteBuffer2.getInt();
                    ifVar.f4708 = byteBuffer2.getInt();
                    ifVar.f4706 = byteBuffer2.getInt();
                    C0766tb tbVar = C0766tb.this;
                    if (((double) tbVar.f4685) + (((double) tbVar.f4686) / 10.0d) >= 2.0d) {
                        ifVar.f4701 = byteBuffer2.getInt();
                        C0766tb tbVar2 = C0766tb.this;
                        if (((double) tbVar2.f4685) + (((double) tbVar2.f4686) / 10.0d) <= 2.3d) {
                            float f = byteBuffer2.getFloat();
                            ifVar.f4702 = f;
                            ifVar.f4703 = f;
                        } else {
                            ifVar.f4702 = byteBuffer2.getFloat();
                            ifVar.f4703 = byteBuffer2.getFloat();
                        }
                        ifVar.f4704 = byteBuffer2.getInt();
                        ifVar.f4709 = byteBuffer2.getInt();
                        C0766tb tbVar3 = C0766tb.this;
                        if (((double) tbVar3.f4685) + (((double) tbVar3.f4686) / 10.0d) >= 2.5d) {
                            ifVar.f4707 = byteBuffer2.getInt();
                            ifVar.f4705 = byteBuffer2.getInt();
                            if ((ifVar.f4707 < 0 || ifVar.f4705 < 0) && ifVar.f4708 >= 0) {
                                StringBuilder append = new StringBuilder("Invalid ACT width / height: ").append(ifVar.f4707).append("/").append(ifVar.f4705).append(" version=");
                                C0766tb tbVar4 = C0766tb.this;
                                throw new C0826tv(append.append(((double) tbVar4.f4685) + (((double) tbVar4.f4686) / 10.0d)).toString());
                            }
                        } else {
                            continue;
                        }
                    }
                }
                C0766tb tbVar5 = C0766tb.this;
                if (((double) tbVar5.f4685) + (((double) tbVar5.f4686) / 10.0d) >= 2.0d) {
                    this.f4694 = byteBuffer.getInt();
                }
                C0766tb tbVar6 = C0766tb.this;
                if (((double) tbVar6.f4685) + (((double) tbVar6.f4686) / 10.0d) >= 2.3d) {
                    int i4 = byteBuffer.getInt();
                    if (i4 > 0) {
                        this.f4695 = new C0771[i4];
                        for (int i5 = 0; i5 < this.f4695.length; i5++) {
                            this.f4695[i5] = new C0771();
                            this.f4695[i5].f4718 = byteBuffer.getInt();
                            this.f4695[i5].f4717 = byteBuffer.getInt();
                            this.f4695[i5].f4716 = byteBuffer.getInt();
                            this.f4695[i5].f4715 = byteBuffer.getInt();
                        }
                    }
                }
            }
        }

        public C0768() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final void mo4101(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new C0826tv("Invalid ACT frames count: " + i);
            }
            this.f4692 = new C0769[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f4692[i2] = new C0769();
                this.f4692[i2].mo4102(byteBuffer);
            }
        }
    }

    /* renamed from: 鷭 */
    private void m1485(ByteBuffer byteBuffer) {
        byteBuffer.get(this.f4687);
        if (!C0622ot.m741(this.f4687, C0618op.LATIN).equals("AC")) {
            throw new C0826tv("Invalid ACT file magic");
        }
        this.f4686 = byteBuffer.get();
        this.f4685 = byteBuffer.get();
        short s = byteBuffer.getShort();
        this.f4684 = byteBuffer.getShort();
        this.f4680 = byteBuffer.getInt();
        this.f4681 = byteBuffer.getInt();
        if (s <= 0) {
            throw new C0826tv("Invalid ACT file actions count: " + s);
        }
        this.f4682 = new C0768[s];
        for (int i = 0; i < s; i++) {
            this.f4682[i] = new C0768();
            this.f4682[i].mo4101(byteBuffer);
        }
        if (((double) this.f4685) + (((double) this.f4686) / 10.0d) >= 2.1d) {
            int i2 = byteBuffer.getInt();
            if (i2 < 0) {
                throw new C0826tv("Invalid ACT file sounds count: " + i2);
            }
            this.f4683 = new C0767if[i2];
            int i3 = 0;
            while (i3 < i2) {
                this.f4683[i3] = new C0767if();
                byteBuffer.get(this.f4683[i3].f4689);
                C0767if ifVar = this.f4683[i3];
                if (ifVar.f4689[0] == 97 && ifVar.f4689[1] == 116 && ifVar.f4689[2] == 107 && ifVar.f4689[3] == 0) {
                    C0768[] r12 = this.f4682;
                    int length = r12.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        C0768 r9 = r12[i4];
                        int length2 = r9.f4692.length - 1;
                        while (length2 >= 0 && r9.f4692[length2].f4694 != i3) {
                            length2--;
                        }
                        if (length2 > 0) {
                            r9.f4693 = length2;
                        }
                    }
                }
                i3++;
            }
        }
        if (((double) this.f4685) + (((double) this.f4686) / 10.0d) >= 2.2d) {
            for (int i5 = 0; i5 < s; i5++) {
                this.f4682[i5].f4691 = byteBuffer.getFloat();
            }
        }
    }

    /* renamed from: 鷭 */
    public final void mo4100(byte[] bArr) {
        m1485(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
        m1484();
    }

    /* renamed from: 鷭 */
    private void m1484() {
        C0768[] r4;
        C0769[] r7;
        C0770if[] ifVarArr;
        if (this.f4682 != null) {
            for (C0768 r1 : this.f4682) {
                if (r1 != null) {
                    for (C0769 r12 : r1.f4692) {
                        if (r12 != null) {
                            r12.f4698 = null;
                            if (r12.f4697 != null) {
                                for (C0770if ifVar : r12.f4697) {
                                    if (ifVar != null) {
                                        ifVar.f4710 = null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.pj */
public abstract class C0660pj {

    /* renamed from: Ą */
    protected byte f4550;

    /* renamed from: ą */
    protected byte f4551;

    /* renamed from: Ć */
    protected byte f4552;

    /* renamed from: ć */
    public int f4553;

    /* renamed from: ċ */
    public short f4554 = -1;

    /* renamed from: đ */
    public short f4555 = 631;

    /* renamed from: Ē */
    public short f4556 = 688;

    /* renamed from: ē */
    public short f4557 = 477;

    /* renamed from: Ė */
    public short f4558 = 2085;

    /* renamed from: ė */
    public short f4559 = 2134;

    /* renamed from: Ę */
    public short f4560 = 2135;

    /* renamed from: ę */
    public short f4561 = 151;

    /* renamed from: ġ */
    final int f4562 = 20480;

    /* renamed from: ģ */
    final int f4563 = 20482;

    /* renamed from: Ĥ */
    final int f4564 = 20483;

    /* renamed from: ĥ */
    final int f4565 = 99;

    /* renamed from: Ħ */
    final int f4566 = 24;

    /* renamed from: ħ */
    final int f4567 = 100;

    /* renamed from: Ĩ */
    int f4568;

    /* renamed from: Ī */
    protected int[] f4569;

    /* renamed from: ī */
    byte[] f4570;

    /* renamed from: Ĭ */
    public C0661if f4571 = new C0661if();

    /* renamed from: Į */
    public C0661if f4572 = new C0661if();

    /* renamed from: į */
    private final int f4573 = 2049;

    /* renamed from: ȃ */
    protected byte f4574;

    /* renamed from: Ȋ */
    final int f4575 = 48059;

    /* renamed from: Ƞ */
    public short f4576;

    /* renamed from: ˮ͈ */
    protected int f4577;

    /* renamed from: ˮ͍ */
    public int f4578 = -1;

    /* renamed from: ܕ */
    public short f4579 = 2108;

    /* renamed from: ܨ */
    final int f4580 = 20481;

    /* renamed from: ঽ্ */
    public short f4581;

    /* renamed from: 㥳 */
    public short f4582 = 636;

    /* renamed from: 㱽 */
    public short f4583;

    /* renamed from: 㵼 */
    public short f4584;

    /* renamed from: 䒧 */
    public short f4585 = 150;

    /* renamed from: 囃 */
    public short f4586 = 135;

    /* renamed from: 岱 */
    final int f4587 = 43690;

    /* renamed from: 庸 */
    public short f4588 = 1080;

    /* renamed from: 廂 */
    public short f4589 = 152;

    /* renamed from: 廅 */
    public short f4590;

    /* renamed from: 廑 */
    protected int[] f4591;

    /* renamed from: 廕 */
    public C0661if f4592 = new C0661if();

    /* renamed from: 櫯 */
    public int f4593;

    /* renamed from: 瞣 */
    private final int f4594 = 33;

    /* renamed from: 纫 */
    public short f4595 = 125;

    /* renamed from: 躆 */
    public short f4596 = 1079;

    /* renamed from: 鷭 */
    protected int f4597;

    /* renamed from: 띥 */
    public short f4598 = 506;

    /* renamed from: o.pj$if */
    class C0661if {

        /* renamed from: ȃ */
        int f4600;

        /* renamed from: ˮ͈ */
        int f4601;

        /* renamed from: 櫯 */
        int f4602;

        /* renamed from: 鷭 */
        byte[] f4603 = new byte[33];

        C0661if() {
        }
    }

    /* renamed from: o.pj$鷭 */
    public enum C0662 {
        BANNED,
        OLD_VERSION,
        DUAL_LOGIN,
        CORUPTED_UID,
        WRONG_LICENSE_ID,
        WRONG_GRF_HASH
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ą */
    public abstract byte mo4057(byte b, byte b2);

    /* access modifiers changed from: 0000 */
    /* renamed from: ą */
    public abstract byte mo4058(byte b, byte b2);

    /* access modifiers changed from: 0000 */
    /* renamed from: ȃ */
    public abstract byte mo4059(byte b, byte b2);

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public abstract byte mo4060(byte b, byte b2);

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public abstract void mo4061(C0661if ifVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public abstract byte mo4062(byte b, byte b2);

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public abstract int mo4063();

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public abstract void mo4065(C0661if ifVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public abstract byte mo4066(byte b, byte b2);

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public abstract void mo4072(C0661if ifVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public void mo4068(int i) {
        this.f4568 = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public int mo4067() {
        int i = (int) ((((long) this.f4568) * 214013) + 2531011);
        this.f4568 = i;
        return (i >> 16) & 32767;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public void mo4070(int i, int i2, int i3, byte b, byte b2, byte b3, byte b4, int i4, int i5, int[] iArr, int[] iArr2, byte[] bArr) {
        if (this.f4554 == -1) {
            throw new C0826tv();
        }
        this.f4597 = i;
        this.f4593 = i2;
        this.f4577 = i3;
        this.f4574 = b;
        this.f4550 = b2;
        this.f4551 = b3;
        this.f4552 = b4;
        this.f4553 = i4;
        this.f4578 = i5;
        this.f4591 = iArr;
        this.f4569 = iArr2;
        this.f4570 = bArr;
    }

    /* renamed from: 鷭 */
    public void mo4069(int i, int i2, int i3) {
        byte b = this.f4551;
        byte b2 = this.f4552;
        C0661if ifVar = this.f4592;
        C0661if ifVar2 = this.f4571;
        byte b3 = this.f4574 & 255;
        this.f4572.f4602 = b3;
        ifVar2.f4602 = b3;
        ifVar.f4602 = b3;
        C0661if ifVar3 = this.f4592;
        C0661if ifVar4 = this.f4571;
        byte b4 = this.f4550 & 255;
        this.f4572.f4601 = b4;
        ifVar4.f4601 = b4;
        ifVar3.f4601 = b4;
        C0661if ifVar5 = this.f4592;
        C0661if ifVar6 = this.f4571;
        this.f4572.f4600 = 0;
        ifVar6.f4600 = 0;
        ifVar5.f4600 = 0;
        mo4068(this.f4577 ^ i);
        for (int i4 = 0; i4 < 32; i4++) {
            byte r5 = mo4066((byte) (this.f4570[mo4067() % 2048] ^ b), b2);
            b2 = mo4062(r5, (byte) (this.f4570[mo4067() % 2048] ^ b2));
            b = (byte) ((this.f4570[mo4067() % 2048] ^ b2) + r5);
            this.f4592.f4603[i4] = b;
        }
        byte b5 = this.f4551;
        byte b6 = this.f4552;
        mo4068(this.f4577 | i2);
        for (int i5 = 0; i5 < 32; i5++) {
            byte r52 = mo4060((byte) (this.f4570[mo4067() % 2048] ^ b5), b6);
            b6 = mo4059(r52, (byte) (this.f4570[mo4067() % 2048] ^ b6));
            b5 = (byte) ((this.f4570[mo4067() % 2048] ^ b6) + r52);
            this.f4571.f4603[i5] = b5;
        }
        byte b7 = this.f4551;
        byte b8 = this.f4552;
        mo4068(this.f4577 | i3);
        for (int i6 = 0; i6 < 32; i6++) {
            byte r53 = mo4057((byte) (this.f4570[mo4067() % 2048] ^ b7), b8);
            b8 = mo4058(r53, (byte) (this.f4570[mo4067() % 2048] ^ b8));
            b7 = (byte) ((mo4063() * (this.f4570[mo4067() % 2048] ^ b8)) + r53);
            this.f4572.f4603[i6] = b7;
        }
    }

    /* renamed from: 鷭 */
    public void mo4073(byte[] bArr, int i, byte[] bArr2, int i2, int i3, C0661if ifVar) {
        for (int i4 = 0; i4 < i3; i4++) {
            ifVar.f4602 += ifVar.f4603[ifVar.f4600 % 32];
            ifVar.f4602 &= 255;
            mo4072(ifVar);
            ifVar.f4601 &= 255;
            byte[] bArr3 = ifVar.f4603;
            int i5 = ifVar.f4601 % 32;
            bArr3[i5] = (byte) (bArr3[i5] ^ ifVar.f4602);
            byte[] bArr4 = ifVar.f4603;
            int i6 = ifVar.f4601 % 32;
            bArr4[i6] = (byte) (bArr4[i6] & 255);
            mo4065(ifVar);
            ifVar.f4602 &= 255;
            byte[] bArr5 = ifVar.f4603;
            int i7 = ifVar.f4600 % 32;
            bArr5[i7] = (byte) (bArr5[i7] ^ ifVar.f4602);
            byte[] bArr6 = ifVar.f4603;
            int i8 = ifVar.f4600 % 32;
            bArr6[i8] = (byte) (bArr6[i8] & 255);
            bArr2[i2 + i4] = (byte) ((bArr[i + i4] ^ ifVar.f4602) & 255);
            mo4061(ifVar);
            ifVar.f4602 &= 255;
            ifVar.f4601 -= i3 % 255;
            ifVar.f4601 &= 255;
            ifVar.f4600++;
            ifVar.f4600 &= 255;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: 櫯 */
    public C0661if mo4064(int i) {
        if (i == 8192) {
            return this.f4572;
        }
        for (int i2 : this.f4591) {
            if (i == i2) {
                return this.f4592;
            }
        }
        for (int i3 : this.f4569) {
            if (i == i3) {
                return this.f4571;
            }
        }
        return null;
    }

    /* renamed from: 鷭 */
    public void mo4071(ByteBuffer byteBuffer, C0837uc ucVar, int i) {
        C0661if r7 = mo4064(i);
        if (r7 != null) {
            int position = byteBuffer.position();
            byteBuffer.position(position + 2);
            int r11 = ucVar.mo4050();
            if (r11 == -1) {
                r11 = byteBuffer.getShort() - 4;
                byteBuffer.position(position + 4);
            } else if (i == this.f4560 || i == this.f4559) {
                byteBuffer.position(position + 4);
                r11 -= 2;
            }
            mo4073(byteBuffer.array(), byteBuffer.position(), byteBuffer.array(), byteBuffer.position(), r11, r7);
            byteBuffer.position(position);
        }
    }
}

package p004o;

import com.roworkshop.p003ro.natives;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.zip.InflaterInputStream;

/* renamed from: o.te */
public final class C0785te {

    /* renamed from: Ą */
    public int f4790;

    /* renamed from: ą */
    public byte f4791;

    /* renamed from: Ć */
    public String f4792;

    /* renamed from: ć */
    public File f4793;

    /* renamed from: ȃ */
    public int f4794;

    /* renamed from: ˮ͈ */
    public int f4795;

    /* renamed from: 櫯 */
    public int f4796;

    /* renamed from: 鷭 */
    public int f4797;

    /* renamed from: 鷭 */
    public final C0614ol mo4108() {
        if (!this.f4793.exists()) {
            throw new RuntimeException("GRF " + this.f4793 + " requested by " + this.f4792 + " not exists");
        }
        byte[] bArr = new byte[this.f4796];
        C0607og ogVar = new C0607og(new FileInputStream(this.f4793));
        long r8 = C0622ot.m735(this.f4794);
        for (long j = 0; j < r8; j += ogVar.skip(r8 - j)) {
        }
        ogVar.read(bArr, 0, this.f4796);
        if (this.f4791 == 1 || this.f4791 == 3 || this.f4791 == 5) {
            if (this.f4790 >= 0) {
                int i = this.f4796;
                int i2 = this.f4790 == 0 ? 1 : 0;
                int i3 = this.f4790;
                byte[] bArr2 = bArr;
                if (C0835ua.f5032) {
                    natives.decodedes(bArr2, i, i2, i3);
                } else {
                    C0835ua.m1532(bArr2, i, i2, i3);
                }
            }
            byte[] copyOf = Arrays.copyOf(bArr, this.f4797);
            ogVar.close();
            return new C0614ol(new InflaterInputStream(new ByteArrayInputStream(copyOf)));
        }
        ogVar.close();
        return new C0614ol(new ByteArrayInputStream(bArr));
    }
}

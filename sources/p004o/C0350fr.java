package p004o;

import android.media.AudioTrack;
import java.security.InvalidParameterException;

/* renamed from: o.fr */
final class C0350fr {

    /* renamed from: ˮ͈ */
    long f935;

    /* renamed from: 櫯 */
    AudioTrack f936;

    /* renamed from: 鷭 */
    C0351fs f937;

    C0350fr(C0351fs fsVar) {
        int i;
        int i2;
        if (fsVar.f938.f1673 == 1) {
            i = 4;
        } else if (fsVar.f938.f1673 == 2) {
            i = 12;
        } else {
            throw new InvalidParameterException("Invalid channels");
        }
        if (fsVar.f938.f1671 == 8) {
            i2 = 3;
        } else if (fsVar.f938.f1671 == 16) {
            i2 = 2;
        } else {
            throw new InvalidParameterException("Invalid encoding");
        }
        this.f936 = new AudioTrack(3, fsVar.f938.f1672, i, i2, fsVar.f938.f1670, 0);
        this.f936.write(fsVar.f938.f1668, fsVar.f938.f1669, fsVar.f938.f1670);
        this.f937 = fsVar;
    }
}

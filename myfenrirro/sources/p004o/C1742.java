package p004o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import p004o.C0638pa.C0640;

/* renamed from: o.蔖 */
final class C1742 extends C0762sz {
    C1742() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1919 r0;
        C0540lv lvVar;
        this.f4671 = 478;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        int i8 = byteBuffer.getInt();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (!z) {
            C0520le leVar = (C0520le) C1014.f6137.f1637.get(i3);
            if (leVar == null) {
                r0 = null;
            } else {
                C0520le leVar2 = leVar;
                r0 = C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null;
            }
            C1919 r29 = r0;
            if (b >= 0 && b < C0583nj.values().length) {
                C0583nj njVar = C0583nj.values()[b];
                int i9 = 0;
                if (s < 13000) {
                    C0640 r22 = C0638pa.f4231[s];
                    C0540lv r23 = C1014.f6142.mo3978(i4);
                    if (r29 != null) {
                        r29.mo4576(s, s2, i4, i6, i7, i8, s3);
                        lvVar = C1014.f6142.mo3978(i3);
                        if (lvVar != null) {
                            if (lvVar.f1769.f1629 != C0587nn.MOB) {
                                C0381gq gqVar = (C0381gq) C1014.f6158.f674.f609.f1055.get(Integer.valueOf(s));
                                lvVar.mo3999(new StringBuilder(String.valueOf(gqVar != null ? gqVar.f1071 : "Unknown Skill")).append(" !!").toString(), -1);
                            }
                            lvVar.f1734 = null;
                            C0561mo moVar = C0561mo.CAST;
                            C0540lv lvVar2 = lvVar;
                            lvVar.mo4634(((C1720) lvVar.f8954).mo4468(moVar, lvVar2.f1776), System.currentTimeMillis());
                            lvVar2.f1772 = moVar;
                            lvVar2.mo3991();
                            if (i6 > 0) {
                                i9 = lvVar.mo3996(i6, true);
                            }
                            if (r22 != null) {
                                if (r22.f4239 != null) {
                                    C1014.f6158.mo3387((Runnable) new C1324(this, lvVar, r23, r22));
                                }
                                if (r22.f4237 != null) {
                                    C1014.f6136.mo4428(r22.f4237, 1.0f);
                                }
                            }
                        }
                    } else {
                        lvVar = null;
                    }
                    if (i8 > 0 && r23 != null) {
                        int i10 = s == 56 ? 280 : 200;
                        int i11 = 0;
                        while (i11 < s3) {
                            boolean z2 = i11 == 0;
                            c_activity c_activity = C1014.f6147;
                            C1987 r2 = new C1987(this, i8, s3, r23, njVar, i5, i7, r22, z2, r29, lvVar);
                            long j = (long) (i9 + (i11 * i10));
                            c_activity c_activity2 = c_activity;
                            if (c_activity.f56 != null) {
                                c_activity2.f56.postDelayed(new C1348(c_activity2, r2), j);
                            }
                            i11++;
                        }
                    }
                }
            }
        }
    }
}

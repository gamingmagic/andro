package p004o;

import java.util.ArrayList;

/* renamed from: o.㼛 */
class C1439 extends C0328ew {
    C1439(int i, int i2, ArrayList<C1999> arrayList) {
        this.f4671 = 2073;
        this.f4538.putInt(i);
        this.f4538.putInt(i2);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f4538.putShort((short) (((C1999) arrayList.get(i3)).f8869 + 2));
            if (C1014.f6140.f4506) {
                this.f4538.putInt(((C1999) arrayList.get(i3)).f8872.f8848);
            } else {
                this.f4538.putShort((short) ((C1999) arrayList.get(i3)).f8872.f8848);
            }
            this.f4538.putShort((short) ((C1999) arrayList.get(i3)).f8872.f8846);
        }
        this.f4540 = (short) (this.f4538.position() + 4);
    }
}

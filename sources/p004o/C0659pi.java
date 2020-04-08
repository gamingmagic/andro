package p004o;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: o.pi */
public abstract class C0659pi extends C0756su {

    /* renamed from: 鷭 */
    protected static HashMap<Integer, Integer> f4549 = new HashMap<>();

    static {
    }

    /* renamed from: 鷭 */
    private int mo4051() {
        ByteBuffer r1 = m1463();
        r1.rewind();
        C0810tj.m1509(r1, this, 0);
        int position = r1.position();
        r1.rewind();
        C0810tj.m1509(r1, this, 1);
        return r1.position() - position;
    }

    /* renamed from: ą */
    private int m804() {
        Integer num = (Integer) f4549.get(Integer.valueOf(mo4090()));
        if (num == null || num.intValue() == 0) {
            num = Integer.valueOf(mo4051());
            f4549.put(Integer.valueOf(mo4090()), num);
        }
        return num.intValue();
    }

    /* renamed from: 櫯 */
    public final int mo4050() {
        return -1;
    }

    /* renamed from: 鷭 */
    public final void mo4053(ByteBuffer byteBuffer, boolean z) {
        if (z) {
            byteBuffer.putShort(mo4090());
        }
        int position = byteBuffer.position();
        byteBuffer.position(byteBuffer.position() + 2);
        super.mo4053(byteBuffer, false);
        int position2 = (byteBuffer.position() - position) - 2;
        byteBuffer.position(position);
        byteBuffer.putShort((short) (position2 + 4));
        byteBuffer.position(position + 2 + position2);
    }

    /* renamed from: 鷭 */
    public final void mo4056(ByteBuffer byteBuffer) {
        C0810tj.m1509(byteBuffer, this, ((C0622ot.m731(byteBuffer.getShort()) - mo4089()) - 2) / m804());
    }
}

package p004o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: o.su */
public abstract class C0756su implements C0839ue {

    /* renamed from: ˮ͈ */
    protected static ByteBuffer f4649 = ByteBuffer.allocate(2048).order(ByteOrder.LITTLE_ENDIAN);

    /* renamed from: 櫯 */
    protected static HashMap<Integer, Integer> f4650 = new HashMap<>();

    /* renamed from: ȃ */
    public abstract short mo4090();

    static {
    }

    /* renamed from: ˮ͈ */
    static ByteBuffer m1463() {
        f4649.rewind();
        f4649.limit(f4649.capacity());
        Arrays.fill(f4649.array(), 0);
        return f4649;
    }

    /* renamed from: 櫯 */
    public int mo4050() {
        return mo4089();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ą */
    public final int mo4089() {
        Integer num = (Integer) f4650.get(Integer.valueOf(mo4090()));
        if (num == null) {
            num = Integer.valueOf(m1462());
            f4650.put(Integer.valueOf(mo4090()), num);
        }
        return num.intValue();
    }

    @Deprecated
    /* renamed from: 鷭 */
    private static short mo4051() {
        return 0;
    }

    /* renamed from: 鷭 */
    public synchronized void mo4053(ByteBuffer byteBuffer, boolean z) {
        if (z) {
            byteBuffer.putShort(mo4090());
        }
        C0810tj.m1508(this, byteBuffer);
    }

    /* renamed from: ą */
    private synchronized int m1462() {
        ByteBuffer r1;
        r1 = m1463();
        r1.rewind();
        mo4053(r1, false);
        return r1.position();
    }

    /* renamed from: 鷭 */
    public void mo4056(ByteBuffer byteBuffer) {
        C0810tj.m1509(byteBuffer, this, -1);
    }
}

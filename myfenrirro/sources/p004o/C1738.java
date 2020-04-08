package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.胿 */
final class C1738 {

    /* renamed from: Ą */
    int f8002;

    /* renamed from: ą */
    byte f8003;

    /* renamed from: Ć */
    byte f8004;

    /* renamed from: ć */
    byte f8005;

    /* renamed from: ċ */
    short f8006;

    /* renamed from: ȃ */
    byte f8007;

    /* renamed from: Ȋ */
    int f8008;

    /* renamed from: ˮ͈ */
    short f8009;

    /* renamed from: ˮ͍ */
    C1111 f8010;

    /* renamed from: 岱 */
    C1665 f8011;

    /* renamed from: 櫯 */
    short f8012;

    /* renamed from: 鷭 */
    int f8013;

    C1738(ByteBuffer byteBuffer) {
        this.f8013 = byteBuffer.getInt();
        this.f8012 = byteBuffer.getShort();
        this.f8009 = byteBuffer.getShort();
        this.f8007 = byteBuffer.get();
        this.f8002 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        this.f8003 = byteBuffer.get();
        this.f8004 = byteBuffer.get();
        this.f8005 = byteBuffer.get();
        this.f8010 = new C1111(byteBuffer);
        if (C1014.f6140.f4456) {
            this.f8011 = new C1665(byteBuffer);
        }
        if (C1014.f6140.f4457) {
            this.f8008 = byteBuffer.getInt();
            this.f8006 = byteBuffer.getShort();
            return;
        }
        this.f8008 = 0;
        this.f8006 = -1;
    }
}

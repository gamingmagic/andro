package p004o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.Log;
import com.roworkshop.p003ro.natives;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import p004o.C0608oh.C0610;

/* renamed from: o.nw */
final class C0596nw {

    /* renamed from: 鷭 */
    private static byte[] f2881 = new byte[16384];

    C0596nw() {
    }

    static {
    }

    /* renamed from: 鷭 */
    public static C1621 m683(String str, byte[] bArr) {
        C1621 r8 = new C1621();
        String lowerCase = str.toLowerCase();
        if (lowerCase.endsWith(".tga")) {
            try {
                C0610 r10 = C0608oh.m694(new ByteArrayInputStream(bArr));
                int[] iArr = new int[(r10.f2986 * r10.f2983)];
                if (r10.f2987 == 32) {
                    for (int i = 0; i < r10.f2983; i++) {
                        for (int i2 = 0; i2 < r10.f2986; i2++) {
                            int i3 = i2 + (r10.f2986 * i);
                            iArr[i2 + (r10.f2986 * ((r10.f2983 - 1) - i))] = C0621os.m717(r10.f2984[(i3 * 4) + 0], r10.f2984[(i3 * 4) + 1], r10.f2984[(i3 * 4) + 2], r10.f2984[(i3 * 4) + 3]);
                        }
                    }
                } else if (r10.f2987 == 24) {
                    for (int i4 = 0; i4 < r10.f2983; i4++) {
                        for (int i5 = 0; i5 < r10.f2986; i5++) {
                            int i6 = i5 + (r10.f2986 * i4);
                            iArr[i5 + (r10.f2986 * ((r10.f2983 - 1) - i4))] = C0621os.m717(r10.f2984[(i6 * 3) + 0], r10.f2984[(i6 * 3) + 1], r10.f2984[(i6 * 3) + 2], 255);
                        }
                    }
                } else {
                    String str2 = "Unsupported TGA pixel depth: " + r10.f2987 + " for image " + str;
                    Log.e("AndRO", str2);
                    throw new C0588no(str2);
                }
                r8.f7548 = iArr;
                r8.f7547 = null;
                r8.f7546.set(r10.f2986, r10.f2983);
                r8.f7545 = 32;
                return r8;
            } catch (IOException unused) {
                String str3 = "Wrong file format: " + str;
                Log.e("AndRO", str3);
                throw new C0588no(str3);
            }
        } else if (lowerCase.endsWith(".bmp") && C0595nv.f2864) {
            Options options = new Options();
            options.inDither = false;
            options.inTempStorage = f2881;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int[] iArr2 = new int[(options.outWidth * options.outHeight)];
            int[] iArr3 = new int[256];
            int decodebmp = natives.decodebmp(bArr, iArr2, iArr3);
            if (decodebmp >= 0) {
                r8.f7548 = iArr2;
                if (decodebmp == 8) {
                    r8.f7547 = iArr3;
                }
                r8.f7546.set(options.outWidth, options.outHeight);
                r8.f7545 = decodebmp;
                return r8;
            }
            options.inJustDecodeBounds = false;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray == null) {
                throw new C0588no("Failed to decode bmp, error " + decodebmp + " filename=" + str + " size=" + bArr.length);
            }
            int[] iArr4 = new int[(decodeByteArray.getWidth() * decodeByteArray.getHeight())];
            decodeByteArray.getPixels(iArr4, 0, decodeByteArray.getWidth(), 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight());
            r8.f7548 = iArr4;
            r8.f7547 = null;
            r8.f7546.set(decodeByteArray.getWidth(), decodeByteArray.getHeight());
            r8.f7545 = 32;
            decodeByteArray.recycle();
            return r8;
        } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || (lowerCase.endsWith(".bmp") && !C0595nv.f2864)) {
            Options options2 = new Options();
            options2.inTempStorage = f2881;
            Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
            if (decodeByteArray2 == null) {
                throw new C0588no("Failed to decode bmp, filename=" + str + " size=" + bArr.length);
            }
            int[] iArr5 = new int[(decodeByteArray2.getWidth() * decodeByteArray2.getHeight())];
            decodeByteArray2.getPixels(iArr5, 0, decodeByteArray2.getWidth(), 0, 0, decodeByteArray2.getWidth(), decodeByteArray2.getHeight());
            r8.f7548 = iArr5;
            r8.f7547 = null;
            r8.f7546.set(decodeByteArray2.getWidth(), decodeByteArray2.getHeight());
            r8.f7545 = 32;
            decodeByteArray2.recycle();
            return r8;
        } else {
            String str4 = "Unknown texture format";
            Log.e("AndRO", str4);
            throw new C0588no(str4);
        }
    }
}

package p004o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.UnmappableCharacterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: o.ot */
public final class C0622ot {

    /* renamed from: Ą */
    public static CharsetEncoder f3019;

    /* renamed from: ą */
    public static CharsetEncoder f3020;

    /* renamed from: Ć */
    static byte[] f3021;

    /* renamed from: ć */
    static NumberFormat f3022 = NumberFormat.getInstance();

    /* renamed from: ċ */
    private static Charset f3023;

    /* renamed from: ȃ */
    public static CharsetDecoder f3024;

    /* renamed from: Ȋ */
    private static CharsetDecoder f3025 = f3027.newDecoder();

    /* renamed from: ˮ͈ */
    public static CharsetDecoder f3026;

    /* renamed from: ˮ͍ */
    private static Charset f3027;

    /* renamed from: 䒧 */
    private static CharsetDecoder f3028 = f3023.newDecoder();

    /* renamed from: 岱 */
    private static CharsetEncoder f3029;

    /* renamed from: 櫯 */
    public static Charset f3030;

    /* renamed from: 纫 */
    private static CharsetEncoder f3031;

    /* renamed from: 躆 */
    private static Charset f3032;

    /* renamed from: 鷭 */
    static MessageDigest f3033;

    static {
        try {
            f3033 = MessageDigest.getInstance("MD5");
            Charset forName = Charset.forName("windows-949");
            f3027 = forName;
            f3029 = forName.newEncoder();
            Charset forName2 = Charset.forName("windows-1252");
            f3023 = forName2;
            f3031 = forName2.newEncoder();
            m743((String) null);
            byte[] bArr = new byte[2048];
            f3021 = bArr;
            bArr[48] = 0;
            f3021[49] = 1;
            f3021[50] = 2;
            f3021[51] = 3;
            f3021[52] = 4;
            f3021[53] = 5;
            f3021[54] = 6;
            f3021[55] = 7;
            f3021[56] = 8;
            f3021[57] = 9;
            f3021[65] = 10;
            f3021[66] = 11;
            f3021[67] = 12;
            f3021[68] = 13;
            f3021[69] = 14;
            f3021[70] = 15;
            f3021[97] = 10;
            f3021[98] = 11;
            f3021[99] = 12;
            f3021[100] = 13;
            f3021[101] = 14;
            f3021[102] = 15;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: 鷭 */
    public static final String m738(byte[] bArr) {
        f3033.update(bArr, 0, bArr.length);
        return m740(f3033.digest(), (String) null);
    }

    /* renamed from: 鷭 */
    public static final int m730(byte b) {
        return b & 255;
    }

    /* renamed from: 鷭 */
    public static final long m735(int i) {
        return i >= 0 ? (long) i : ((long) i) + 4294967296L;
    }

    /* renamed from: 鷭 */
    public static final int m731(short s) {
        return 65535 & s;
    }

    /* renamed from: 鷭 */
    public static final int m732(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* renamed from: 櫯 */
    public static final byte m726(byte[] bArr, int i) {
        if (bArr == null || bArr.equals(null)) {
            return 0;
        }
        return bArr[i];
    }

    /* renamed from: 鷭 */
    public static final boolean m746(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (bArr2 == null || i2 < 0) {
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = bArr2[i2 + i3];
        }
        return true;
    }

    /* renamed from: ˮ͈ */
    public static final byte[] m725(byte[] bArr, int i) {
        if (bArr == null || bArr.equals(null)) {
            return null;
        }
        int i2 = 0;
        while (i2 < 108 && bArr[i + i2] != 0) {
            i2++;
        }
        byte[] bArr2 = new byte[i2];
        if (!m746(bArr2, bArr, i2, i)) {
            return null;
        }
        return bArr2;
    }

    /* renamed from: 櫯 */
    public static final int m728(byte[] bArr) {
        int i = 0;
        while (i < bArr.length && bArr[i] != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: 鷭 */
    private static CharsetEncoder m742(C0618op opVar) {
        if (opVar == C0618op.KOREAN) {
            return f3029;
        }
        if (opVar == C0618op.LATIN) {
            return f3031;
        }
        if (opVar == C0618op.LOCAL) {
            return f3019;
        }
        if (opVar == C0618op.UTF8) {
            return f3020;
        }
        return null;
    }

    /* renamed from: 鷭 */
    public static final void m743(String str) {
        String country = Locale.getDefault().getCountry();
        if (str != null) {
            f3030 = Charset.forName(str);
        } else if (country.equals("TH")) {
            f3030 = Charset.forName("windows-874");
        } else if (country.equals("RU")) {
            f3030 = Charset.forName("windows-1251");
        } else if (country.equals("JP")) {
            f3030 = Charset.forName("shift-jis");
        } else {
            f3030 = Charset.forName("windows-1252");
        }
        f3032 = Charset.forName("utf-8");
        f3026 = f3030.newDecoder();
        f3024 = f3032.newDecoder();
        f3019 = f3030.newEncoder().onUnmappableCharacter(CodingErrorAction.REPLACE).onMalformedInput(CodingErrorAction.REPLACE).replaceWith(new byte[]{63});
        f3020 = f3032.newEncoder().onUnmappableCharacter(CodingErrorAction.REPLACE).onMalformedInput(CodingErrorAction.REPLACE).replaceWith(new byte[]{63});
    }

    /* renamed from: 鷭 */
    public static final synchronized String m739(byte[] bArr, int i, C0618op opVar) {
        int i2;
        String charBuffer;
        synchronized (C0622ot.class) {
            byte[] bArr2 = bArr;
            int i3 = 0;
            while (true) {
                if (i3 >= bArr2.length) {
                    i2 = i3;
                    break;
                }
                try {
                    if (bArr2[i3] == 0) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                } catch (CharacterCodingException e) {
                    C0624ov.m759("bytes2str: " + e.toString() + " buf=" + new String(bArr, f3023) + Arrays.toString(bArr));
                    return "";
                }
            }
            if (i2 < i) {
                i = i2;
            }
            CharsetDecoder charsetDecoder = opVar == C0618op.KOREAN ? f3025 : opVar == C0618op.LATIN ? f3028 : opVar == C0618op.LOCAL ? f3026 : opVar == C0618op.UTF8 ? f3024 : null;
            charBuffer = charsetDecoder.decode(ByteBuffer.wrap(bArr, 0, i)).toString();
        }
        return charBuffer;
    }

    /* renamed from: 鷭 */
    public static final String m741(byte[] bArr, C0618op opVar) {
        return m739(bArr, bArr.length, opVar);
    }

    /* renamed from: 鷭 */
    public static final byte[] m749(String str, C0618op opVar, int i) {
        try {
            return Arrays.copyOf(m742(opVar).encode(CharBuffer.wrap(str)).array(), i);
        } catch (CharacterCodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: 鷭 */
    public static final byte[] m750(String str, C0618op opVar, boolean z) {
        try {
            byte[] array = m742(opVar).encode(CharBuffer.wrap(str)).array();
            int i = -1;
            int length = array.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                } else if (array[length] != 0) {
                    i = length + 1;
                    break;
                } else {
                    length--;
                }
            }
            if (i == -1) {
                return array;
            }
            if (z) {
                i++;
            }
            if (i != array.length) {
                array = Arrays.copyOf(array, i);
            }
            if (z) {
                array[array.length - 1] = 0;
            }
            return array;
        } catch (UnmappableCharacterException e) {
            throw new RuntimeException("str=" + str, e);
        } catch (CharacterCodingException e2) {
            throw new RuntimeException("str=" + str, e2);
        }
    }

    /* renamed from: 櫯 */
    public static final byte[] m729(String str) {
        if (m742(C0618op.LOCAL).canEncode(str)) {
            return m750(str, C0618op.LOCAL, true);
        }
        return m750("/" + str, C0618op.UTF8, true);
    }

    /* renamed from: 鷭 */
    public static final int m733(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2.length <= 0) {
            throw new IllegalArgumentException();
        }
        while (i < bArr.length - bArr2.length) {
            int i2 = 0;
            while (i2 < bArr2.length && bArr[i + i2] == bArr2[i2]) {
                i2++;
            }
            if (i2 == bArr2.length) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: ˮ͈ */
    public static final byte[] m724(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (((byte) ((f3021[str.charAt(i)] & 15) << 4)) | ((byte) (f3021[str.charAt(i + 1)] & 15)));
        }
        return bArr;
    }

    /* renamed from: 鷭 */
    public static final byte[] m748(String str, String str2) {
        String[] split = str.split(str2);
        byte[] bArr = new byte[split.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (((byte) ((f3021[split[i].charAt(0)] & 15) << 4)) | ((byte) (f3021[split[i].charAt(1)] & 15)));
        }
        return bArr;
    }

    /* renamed from: 鷭 */
    public static final void m745(int[] iArr, int i, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = i8 + (i7 * i4);
                int i10 = i2 + i8;
                int i11 = i10 + ((i3 + i7) * i);
                if (i11 >= 0 && i11 < iArr.length && i10 >= 0 && i10 < i && ((iArr2[i9] >>> 24) & 255) != 0) {
                    iArr[i11] = iArr2[i9];
                }
            }
        }
    }

    /* renamed from: ȃ */
    public static String m721(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        String[] split = str.split("\n");
        boolean z = false;
        int i = 0;
        while (i < split.length) {
            if (z) {
                String str2 = split[i];
                if (str2.indexOf("*/") != -1) {
                    split[i] = str2.split("\\*/", 2)[1];
                    z = false;
                } else {
                    continue;
                    i++;
                }
            }
            String str3 = split[i];
            int indexOf = str3.indexOf("//");
            int indexOf2 = str3.indexOf("/*");
            char c = (indexOf == -1 || indexOf2 == -1) ? indexOf != -1 ? 0 : indexOf2 != -1 ? (char) 1 : 65535 : Math.min(indexOf, indexOf2) == indexOf ? (char) 0 : 1;
            switch (c) {
                case 65535:
                    sb.append(str3);
                    sb.append("\n");
                    break;
                case 0:
                    sb.append(str3.split("//", 2)[0]);
                    sb.append("\n");
                    break;
                case 1:
                    String[] split2 = str3.split("/\\*", 2);
                    sb.append(split2[0]);
                    int i2 = i;
                    i--;
                    split[i2] = split2[1];
                    z = true;
                    break;
                default:
                    throw new RuntimeException();
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: 鷭 */
    public static final String[] m751(String str, boolean z, String str2) {
        CharBuffer allocate = CharBuffer.allocate((str.length() * 2) + 100);
        if (!z) {
            return str.split(str2);
        }
        for (String split : str.split("\n")) {
            String[] split2 = split.split("//", 2);
            if (split2.length > 0) {
                allocate.put(split2[0] + "\n");
            }
        }
        allocate.position(0);
        return String.valueOf(allocate).split(str2);
    }

    /* renamed from: ˮ͈ */
    public static final String m723(byte[] bArr) {
        return m740(bArr, (String) null);
    }

    /* renamed from: 鷭 */
    public static final String m740(byte[] bArr, String str) {
        char[] cArr;
        if (str == null) {
            cArr = new char[(bArr.length * 2)];
        } else {
            cArr = new char[(bArr.length * (str.length() + 2))];
        }
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            String hexString = Integer.toHexString(b2);
            if ((b2 & 240) > 0) {
                cArr[i + 0] = hexString.charAt(0);
                cArr[i + 1] = hexString.charAt(1);
            } else {
                cArr[i + 0] = '0';
                cArr[i + 1] = hexString.charAt(0);
            }
            i += 2;
            if (str != null) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    cArr[i + i2] = str.charAt(i2);
                }
                i += str.length();
            }
        }
        return String.valueOf(cArr);
    }

    /* renamed from: 鷭 */
    public static final String m736(long j) {
        return f3022.format(j);
    }

    /* renamed from: 櫯 */
    public static final int m727(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 *= 2;
        }
        return i2;
    }

    /* renamed from: 鷭 */
    public static final String m737(Object obj) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (obj.getClass().isArray()) {
            sb.append(": { ");
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(Array.get(obj, i).toString());
            }
            sb.append(" } ");
            return sb.toString();
        }
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        sb.append(obj.getClass().getSimpleName()).append(" {");
        boolean z = true;
        Field[] fieldArr = declaredFields;
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            Field field = fieldArr[i2];
            if (!z) {
                sb.append(", ");
            }
            z = false;
            field.setAccessible(true);
            try {
                Object obj2 = field.get(obj);
                if (obj2 == null) {
                    str = "null";
                } else {
                    str = obj2.toString();
                }
                sb.append(field.getName());
                if (obj2 == null || !obj2.getClass().isArray()) {
                    sb.append('=').append('\'').append(str).append('\'');
                    i2++;
                } else {
                    sb.append(": { ");
                    for (int i3 = 0; i3 < Array.getLength(obj2); i3++) {
                        if (i3 > 0) {
                            sb.append(", ");
                        }
                        Object obj3 = Array.get(obj2, i3);
                        if (obj3 == null) {
                            sb.append("null");
                        } else {
                            sb.append(obj3.toString());
                        }
                    }
                    sb.append(" } ");
                    i2++;
                }
            } catch (IllegalAccessException unused) {
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: Ą */
    public static final void m719(String str) {
        new File(str.substring(0, str.lastIndexOf("/"))).mkdirs();
    }

    /* renamed from: ˮ͈ */
    public static final String m722(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    /* renamed from: 鷭 */
    public static final void m744(String str, char[] cArr) {
        int min = Math.min(str.length(), cArr.length);
        for (int i = 0; i < min; i++) {
            cArr[i] = str.charAt(i);
        }
    }

    /* renamed from: 鷭 */
    private static byte[] m747(File file) {
        byte[] bArr = new byte[((int) file.length())];
        FileInputStream fileInputStream = new FileInputStream(file);
        int i = 0;
        while (true) {
            int read = fileInputStream.read(bArr, i, bArr.length - i);
            if (read <= 0) {
                break;
            }
            i += read;
        }
        if (((long) i) != file.length()) {
            fileInputStream.close();
            throw new IOException("Failed to fully read file: " + file.getAbsolutePath());
        }
        fileInputStream.close();
        return bArr;
    }

    /* renamed from: ą */
    public static final byte[] m720(String str) {
        return m747(new File(str));
    }

    /* renamed from: 鷭 */
    public static final int m734(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i + i3] - bArr2[i3 + 0];
            if (i4 > 0) {
                return 1;
            }
            if (i4 < 0) {
                return -1;
            }
        }
        return 0;
    }
}

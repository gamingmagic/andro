package p004o;

import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: o.긫 */
public final class C1890 {
    /* renamed from: 鷭 */
    public static PublicKey m2562(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C1659.m2330(str)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            Log.e("IABUtil/Security", "Invalid key specification.");
            throw new IllegalArgumentException(e2);
        } catch (C1395 e3) {
            Log.e("IABUtil/Security", "Base64 decoding failed.");
            throw new IllegalArgumentException(e3);
        }
    }

    /* renamed from: 鷭 */
    public static boolean m2563(PublicKey publicKey, String str, String str2) {
        try {
            Signature instance = Signature.getInstance("SHA1withRSA");
            instance.initVerify(publicKey);
            instance.update(str.getBytes());
            if (instance.verify(C1659.m2330(str2))) {
                return true;
            }
            Log.e("IABUtil/Security", "Signature verification failed.");
            return false;
        } catch (NoSuchAlgorithmException unused) {
            Log.e("IABUtil/Security", "NoSuchAlgorithmException.");
            return false;
        } catch (InvalidKeyException unused2) {
            Log.e("IABUtil/Security", "Invalid key specification.");
            return false;
        } catch (SignatureException unused3) {
            Log.e("IABUtil/Security", "Signature exception.");
            return false;
        } catch (C1395 unused4) {
            Log.e("IABUtil/Security", "Base64 decoding failed.");
            return false;
        }
    }
}

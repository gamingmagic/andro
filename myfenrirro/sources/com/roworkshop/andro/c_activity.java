package com.roworkshop.andro;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.libroserver.apk.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HttpRequestExecutor;
import p004o.C0248cl;
import p004o.C0280do;
import p004o.C0415hp;
import p004o.C0421hu;
import p004o.C0425hy;
import p004o.C0426hz;
import p004o.C0428ia;
import p004o.C0440im;
import p004o.C0441in;
import p004o.C0453ix;
import p004o.C0564mr;
import p004o.C0588no;
import p004o.C0592ns;
import p004o.C0595nv;
import p004o.C0598ny;
import p004o.C0623ou;
import p004o.C0624ov;
import p004o.C0653pe;
import p004o.C1013zz;
import p004o.C1014;
import p004o.C1285;
import p004o.C1308;
import p004o.C1428;
import p004o.C1492;
import p004o.C1493;
import p004o.C1569;
import p004o.C1641;
import p004o.C1675;
import p004o.C1796;
import p004o.C1857;
import p004o.C1991;
import p004o.aaz;
import p004o.abk;

public class c_activity extends Activity implements C0598ny {

    /* renamed from: ċ */
    public static final byte[] f45 = {83, 19, 56, -100, 5, -7, -8, 5, 2, -15, 1, -12, 5, -69, 70, -15, -5, -7, 4, -12, -1, -11, 4, -15, 3, -3, -70, 49, 8, -6};

    /* renamed from: 䒧 */
    private static int f46 = 230;

    /* renamed from: Ą */
    public boolean f47;

    /* renamed from: ą */
    public String f48;

    /* renamed from: Ć */
    public C1493 f49;

    /* renamed from: ć */
    Runnable f50;

    /* renamed from: ȃ */
    public C0453ix f51;

    /* renamed from: Ȋ */
    public Runnable f52;

    /* renamed from: ˮ͈ */
    public C1675 f53;

    /* renamed from: ˮ͍ */
    public C0280do f54;

    /* renamed from: 岱 */
    public long f55;

    /* renamed from: 櫯 */
    public Handler f56;
    /* access modifiers changed from: private */

    /* renamed from: 纫 */
    public C0440im f57;

    /* renamed from: 鷭 */
    public final C0161 f58;

    /* renamed from: com.roworkshop.andro.c_activity$鷭 */
    public class C0161 {

        /* renamed from: 鷭 */
        public String f60;

        C0161(String str) {
            this.f60 = str;
        }
    }

    static {
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24(int r6, int r7, int r8) {
        /*
            r5 = -1
            byte[] r4 = f45
            int r6 = r6 * 13
            int r6 = 17 - r6
            int r8 = r8 * 3
            int r8 = r8 + 14
            int r7 = r7 * 15
            int r7 = 114 - r7
            java.lang.String r0 = new java.lang.String
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            if (r4 != 0) goto L_0x001e
            r2 = r7
            r3 = r8
        L_0x0019:
            int r6 = r6 + 1
            int r2 = r2 + r3
            int r7 = r2 + 4
        L_0x001e:
            int r5 = r5 + 1
            byte r2 = (byte) r7
            r1[r5] = r2
            if (r5 != r8) goto L_0x002a
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        L_0x002a:
            r2 = r7
            byte r3 = r4[r6]
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roworkshop.andro.c_activity.m24(int, int, int):java.lang.String");
    }

    public c_activity() {
        C0161 r0;
        if (C0595nv.f2879 == C0564mr.AevaRO) {
            r0 = new C0161("086ddbfd731b4886b1001aacce13f298");
        } else if (C0595nv.f2879 == C0564mr.AmatsuRO) {
            r0 = new C0161("768e7a3b7af74ee28632dbc38d018c84");
        } else if (C0595nv.f2879 == C0564mr.AtlasRO) {
            r0 = new C0161("a5dc76a5c5a14a3184f94bd0c90a7666");
        } else if (C0595nv.f2879 == C0564mr.AustinRO) {
            r0 = new C0161("b11c7ca2c3a5477d855911e290476320");
        } else if (C0595nv.f2879 == C0564mr.BarnabyRO) {
            r0 = new C0161("d9231e9880184043a347d4fe5a207a47");
        } else if (C0595nv.f2879 == C0564mr.BrightRO) {
            r0 = new C0161("5a1ac344d50c43d0b75921287f01d4dc");
        } else if (C0595nv.f2879 == C0564mr.ClassicRONet) {
            r0 = new C0161("8972654e3fc2427e85d62b36b3e4db97");
        } else if (C0595nv.f2879 == C0564mr.Classic2RoInTh) {
            r0 = new C0161("c52b917944c048c7a53a12d84b76c634");
        } else if (C0595nv.f2879 == C0564mr.CrownRO) {
            r0 = new C0161("7ead675d3a2345a195efdb2b10276822");
        } else if (C0595nv.f2879 == C0564mr.Class2RO) {
            r0 = new C0161("faa7597872ae40789ac57e337a947285");
        } else if (C0595nv.f2879 == C0564mr.Daro) {
            r0 = new C0161("3f2f4a38a876485bb10b25155455db02");
        } else if (C0595nv.f2879 == C0564mr.Eden3) {
            r0 = new C0161("b27ee780d8d24b1384b5ed10039882b2");
        } else if (C0595nv.f2879 == C0564mr.EosRagnarokOnline) {
            r0 = new C0161("fb7bb46604df4281a44eef74443918f8");
        } else if (C0595nv.f2879 == C0564mr.FreePlayRoCom) {
            r0 = new C0161("eae69c998b01458f954a642d0ae53351");
        } else if (C0595nv.f2879 == C0564mr.FreeRO) {
            r0 = new C0161("f06c4220a7e545e2a886a31f81a99ec5");
        } else if (C0595nv.f2879 == C0564mr.FreeRoWeb) {
            r0 = new C0161("3fa61a46822143b2ab788b8c5128f153");
        } else if (C0595nv.f2879 == C0564mr.InfamyRO) {
            r0 = new C0161("2f8af5d9721140eb80e2a474d14d0351");
        } else if (C0595nv.f2879 == C0564mr.iPlayRo201804) {
            r0 = new C0161("eb8c99f255654c39bf403147327d880d");
        } else if (C0595nv.f2879 == C0564mr.IfritRagnarokCom) {
            r0 = new C0161("8635600cbea54797b5fafa52c84fa08f");
        } else if (C0595nv.f2879 == C0564mr.Gugusjungs57572) {
            r0 = new C0161("0b2498444479444590e4252e677c3cdb");
        } else if (C0595nv.f2879 == C0564mr.iRO_hockeyapp) {
            r0 = new C0161("7c86184fec2e17b8d5ec2f3fd6c79ef7");
        } else if (C0595nv.f2879 == C0564mr.LeonardRO) {
            r0 = new C0161("23cc88189ff744528aaf66c04b4bd50e");
        } else if (C0595nv.f2879 == C0564mr.LidiaRO) {
            r0 = new C0161("a8382953dc484a308119c3a234a691f0");
        } else if (C0595nv.f2879 == C0564mr.localclient) {
            r0 = new C0161("0686481d44764e57a8eababb2ec7800a");
        } else if (C0595nv.f2879 == C0564mr.MobiRO) {
            r0 = new C0161("86594e26dd5f43aaa131fea5024c4d06");
        } else if (C0595nv.f2879 == C0564mr.MOTR) {
            r0 = new C0161("416e2a7224001f5688177f6632d4c2eb");
        } else if (C0595nv.f2879 == C0564mr.MyRO) {
            r0 = new C0161("f87a58f1a5ad4766ace4354d44b0f733");
        } else if (C0595nv.f2879 == C0564mr.NoviceRO) {
            r0 = new C0161("058d812f63a442ad8377fbd999da87db");
        } else if (C0595nv.f2879 == C0564mr.OldchaosROCom) {
            r0 = new C0161("311edbc04489488da1390d64d4c23e1a");
        } else if (C0595nv.f2879 == C0564mr.OldSchoolRO) {
            r0 = new C0161("94274207124c40ff8980bb1869d369e1");
        } else if (C0595nv.f2879 == C0564mr.PlayLokiServerCom) {
            r0 = new C0161("7ae21607163f49fd824d90e6e3e7182c");
        } else if (C0595nv.f2879 == C0564mr.PlayragnarokPh) {
            r0 = new C0161("15057c05d14f45a4a7af126b9ace9f3c");
        } else if (C0595nv.f2879 == C0564mr.PlayvalhallaPh) {
            r0 = new C0161("c68e0fb6fc1c4fd3b8b280cd223db50b");
        } else if (C0595nv.f2879 == C0564mr.Ragnaclan) {
            r0 = new C0161("8db2e4af8c0245988870636a2f79e744");
        } else if (C0595nv.f2879 == C0564mr.RebirthRO_Ancyker) {
            r0 = new C0161("093e2cda42664b7cb80d295f5beac18c");
        } else if (C0595nv.f2879 == C0564mr.RagnarevivalCom) {
            r0 = new C0161("89eadda6435346ad9a776ae09f68ac21");
        } else if (C0595nv.f2879 == C0564mr.RoHeimdallCom) {
            r0 = new C0161("95c65773a3504968a76c84ca4d66d7f3");
        } else if (C0595nv.f2879 == C0564mr.SarahServer) {
            r0 = new C0161("33b6d94bf33641e9a92249ab3daffcfa");
        } else if (C0595nv.f2879 == C0564mr.ShinServer) {
            r0 = new C0161("6e1e88b46ee44b2f9758f854d93b498e");
        } else if (C0595nv.f2879 == C0564mr.SuccessRoNet) {
            r0 = new C0161("6ae913495f5d4aa2b324103071801b89");
        } else if (C0595nv.f2879 == C0564mr.Thai_id9169) {
            r0 = new C0161("dbdae225dc084d18958bc30491a114b5");
        } else if (C0595nv.f2879 == C0564mr.ThaiRoInTh) {
            r0 = new C0161("6ad316a304a0415889c46da4561e5eca");
        } else if (C0595nv.f2879 == C0564mr.TheClassicROCom) {
            r0 = new C0161("7227e702edc9452bb7679e1265a9d4b7");
        } else if (C0595nv.f2879 == C0564mr.TitanRO) {
            r0 = new C0161("f5a61910feb84e0e89ab2187629df256");
        } else if (C0595nv.f2879 == C0564mr.TyrServer) {
            r0 = new C0161("c3c98959da5d4fc4a39c8017730687dc");
        } else if (C0595nv.f2879 == C0564mr.WeDevGames) {
            r0 = new C0161("4ba8b268498f4747bcc760186d1c7b25");
        } else if (C0595nv.f2879 == C0564mr.ROProviderValkyrie) {
            r0 = new C0161("151ea453f7a74a7c98cb04b372868e76");
        } else if (C0595nv.f2879 == C0564mr.XileRO) {
            r0 = new C0161("e7eeef336e0645a29a8b3f2c0f496564");
        } else if (C0595nv.f2879 == C0564mr.RoFaction) {
            r0 = new C0161("e3fad41cc18e4c6a9fedbff673990878");
        } else if (C0595nv.f2879 == C0564mr.WeloveRo) {
            r0 = new C0161("754896997465481a8d4baab53eefebc2");
        } else if (C0595nv.f2879 == C0564mr.KafraRO) {
            r0 = new C0161("b6ae5b90537a4f708751a80c95dda9ec");
        } else if (C0595nv.f2879 == C0564mr.ChaosReborn) {
            r0 = new C0161("cac2c09af58c4262a9a05623b8d41666");
        } else if (C0595nv.f2879 == C0564mr.RagnarokReturnPh) {
            r0 = new C0161("8c03216befe24b4ea3da671e32e86409");
        } else if (C0595nv.f2879 == C0564mr.GachoRO) {
            r0 = new C0161("ae57f139101345cd9b7b72e1c56cf076");
        } else if (C0595nv.f2879 == C0564mr.RoRetro) {
            r0 = new C0161("6012a25fda2e46e68ddbb976cddd67ec");
        } else if (C0595nv.f2879 == C0564mr.LibRO) {
            r0 = new C0161("44d8232462654e8cb5fc965e6664eeda");
        } else if (C0595nv.f2879 == C0564mr.SecretRO) {
            r0 = new C0161("cb4d31024eae4110ab46c856719c2b6e");
        } else if (C0595nv.f2879 == C0564mr.NorseRO) {
            r0 = new C0161("62a6d336016d4784a56105a8b97f8721");
        } else if (C0595nv.f2879 == C0564mr.Trinity_Reborn_Full) {
            r0 = new C0161("6a79c4d5f3bf45e99afdb9fe1b79e2b0");
        } else if (C0595nv.f2879 == C0564mr.AlbertaServer) {
            r0 = new C0161("d880f525ff234381b14ac1c40b9767b2");
        } else if (C0595nv.f2879 == C0564mr.hiclassro) {
            r0 = new C0161("cb3404db34354f2c9ff3cfbf41108164");
        } else if (C0595nv.f2879 == C0564mr.OldschoolragnarokCom) {
            r0 = new C0161("4ae5dfcf3b364cf9a98b231aa9a38f46");
        } else if (C0595nv.f2879 == C0564mr.Ragnarevo) {
            r0 = new C0161("f373186bfe3b4aadbb77f465b280915a");
        } else if (C0595nv.f2879 == C0564mr.CrazyPoring) {
            r0 = new C0161("1f9fee6196f145a1bb364ee3a69e4728");
        } else if (C0595nv.f2879 == C0564mr.LucianoRO) {
            r0 = new C0161("5294568b53aa41d2bcdfd303f1031a01");
        } else if (C0595nv.f2879 == C0564mr.GarciaRO) {
            r0 = new C0161("728a33218a874cd9865bd4b7223d9748");
        } else if (C0595nv.f2879 == C0564mr.Blytanias) {
            r0 = new C0161("a21adb52e02849c4a99f12065c5aec28");
        } else if (C0595nv.f2879 == C0564mr.PinoyRO) {
            r0 = new C0161("aac10214718840e58096e5436ca66427");
        } else if (C0595nv.f2879 == C0564mr.OMGRO) {
            r0 = new C0161("d73cecfc91174662b592d160e2f0de8c");
        } else if (C0595nv.f2879 == C0564mr.RagnarokPuzzle) {
            r0 = new C0161("5eebefcac4784033bf4bc2627bd81aec");
        } else if (C0595nv.f2879 == C0564mr.Modify_Full) {
            r0 = new C0161("7de17e0451544a0bb5e73ebfbcd93db7");
        } else if (C0595nv.f2879 == C0564mr.Newyear) {
            r0 = new C0161("4e40bfbfce804584b2ea676688ec7ced");
        } else if (C0595nv.f2879 == C0564mr.GRANDRO) {
            r0 = new C0161("951affd80f8a464e9275f5d6a1aa0d29");
        } else if (C0595nv.f2879 == C0564mr.SakrayPh) {
            r0 = new C0161("c2a7b255cfc9460eae0ad51ea8099870");
        } else if (C0595nv.f2879 == C0564mr.MyRebornRO) {
            r0 = new C0161("98d272e2d73f478ab931b2bde7770114");
        } else if (C0595nv.f2879 == C0564mr.XileRO2019) {
            r0 = new C0161("e7eeef336e0645a29a8b3f2c0f496564");
        } else if (C0595nv.f2879 == C0564mr.eSport2019) {
            r0 = new C0161("0b2498444479444590e4252e677c3cdb");
        } else if (C0595nv.f2879 == C0564mr.PhoenixRO2) {
            r0 = new C0161("e8b8976ce5fd40d2964b54338f6d62f0");
        } else if (C0595nv.f2879 == C0564mr.OcrClassicCom) {
            r0 = new C0161("9c141e319eff406188a3e6f82d71abc4");
        } else if (C0595nv.f2879 == C0564mr.RoFreedom) {
            r0 = new C0161("9d67d271e95f4695950b067431da8969");
        } else if (C0595nv.f2879 == C0564mr.C2RO) {
            r0 = new C0161("63cb047d4c8f4d17850b13b8b2a84c52");
        } else if (C0595nv.f2879 == C0564mr.RelaxRO) {
            r0 = new C0161("7aae87a88cf047588d78b3b69ba695d2");
        } else if (C0595nv.f2879 == C0564mr.BgRO) {
            r0 = new C0161("b06fc165c17f4310bc12bfb86c2c242e");
        } else if (C0595nv.f2879 == C0564mr.ROClashed) {
            r0 = new C0161("c5b0c8e45a4a4d569a0999412ae52aeb");
        } else {
            r0 = null;
        }
        this.f58 = r0;
        this.f56 = new Handler();
        this.f47 = false;
        this.f48 = null;
        this.f49 = new C1493();
        this.f50 = new C1991(this);
        this.f55 = 0;
        this.f52 = new C1569(this);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!C1014.f6149.f728.mo4509(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: 鷭 */
    public final void mo3387(Runnable runnable) {
        if (this.f56 != null) {
            try {
                this.f56.post(runnable);
            } catch (Throwable th) {
                this.f49.mo4354(Thread.currentThread(), th);
            }
        }
    }

    /* renamed from: 鷭 */
    public final byte[] mo3389(String str) {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            InputStream open = getAssets().open(str);
            InputStreamReader inputStreamReader2 = new InputStreamReader(open);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(open.available());
            byte[] bArr = new byte[32000];
            while (true) {
                int read = open.read(bArr, 0, bArr.length);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream2.write(bArr, 0, read);
            }
            byteArrayOutputStream2.flush();
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            try {
                byteArrayOutputStream2.close();
                inputStreamReader2.close();
                if (open != null) {
                    open.close();
                }
                return byteArray;
            } catch (IOException e) {
                throw new C0588no((Exception) e);
            }
        } catch (IOException e2) {
            throw new C0588no((Exception) e2);
        } catch (Throwable th) {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e3) {
                    throw new C0588no((Exception) e3);
                }
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: 鷭 */
    public final byte[] mo3388(int i) {
        Resources resources = getResources();
        if (resources == null) {
            String str = "Failed to get resources";
            Log.e("AndRO", str);
            throw new C0588no(str);
        }
        InputStream openRawResource = resources.openRawResource(i);
        if (openRawResource == null) {
            String str2 = "Failed to open resource";
            Log.e("AndRO", str2);
            throw new C0588no(str2);
        }
        try {
            byte[] bArr = new byte[openRawResource.available()];
            int i2 = 0;
            while (true) {
                int read = openRawResource.read(bArr, i2, bArr.length - i2);
                if (read <= 0) {
                    return bArr;
                }
                i2 += read;
            }
        } catch (IOException e) {
            String iOException = e.toString();
            Log.e("AndRO", iOException);
            throw new C0588no(iOException);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        Thread.setDefaultUncaughtExceptionHandler(this.f49);
        Thread.currentThread().setUncaughtExceptionHandler(this.f49);
        setTheme(16973931);
        C1014.f6147 = this;
        try {
            this.f51 = new C0453ix(this);
            C0248cl.f4541 = new C1857();
            C0595nv.f2874 = new StringBuilder(String.valueOf(getFilesDir().getAbsolutePath())).append("/ragnarok").toString();
            setContentView(R.layout.start);
            ActionBar actionBar = getActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
            StrictMode.setThreadPolicy(new Builder().permitAll().build());
            getWindow().setSoftInputMode(32);
            C0624ov.f3034 = new C1492(this);
            C1014.f6161 = new C1014();
            C1014.f6144 = new C1428("c_network", 0, 0, 0, 500);
            C1014.f6160 = new C0415hp(C1014.f6147);
            if (C0595nv.f2879 == C0564mr.XileRO) {
                getWindow().setFlags(1024, 1024);
            }
            C0441in.f1306 = C1014.f6160.mo3795("GL_MAX_TEXTURE_SIZE", 0);
            this.f51.f1372.mo3537h_();
            C0421hu huVar = this.f51.f1372;
            if (C0595nv.f2876 == null || C0595nv.f2876.f442 == null || C0595nv.f2876.f442.isEmpty()) {
                String r13 = C1014.f6160.mo3802("last_login", 0);
                str = r13 == null ? null : r13;
            } else {
                str = C0595nv.f2876.f442;
            }
            if (C0595nv.f2876 == null || C0595nv.f2876.f441 == null || C0595nv.f2876.f441.isEmpty()) {
                String r132 = C1014.f6160.mo3802("last_password", 0);
                str2 = r132 == null ? null : r132;
            } else {
                str2 = C0595nv.f2876.f441;
            }
            String r133 = C1014.f6160.mo3802("server_name", 0);
            String str3 = r133 == null ? null : r133;
            String r134 = C1014.f6160.mo3802("save_login", 0);
            String str4 = r134 == null ? null : r134;
            boolean parseBoolean = str4 == null ? false : Boolean.parseBoolean(str4);
            String r135 = C1014.f6160.mo3802("save_password", 0);
            String str5 = r135 == null ? null : r135;
            boolean parseBoolean2 = str5 == null ? false : Boolean.parseBoolean(str5);
            boolean z = true;
            if (C0595nv.f2879 == C0564mr.localclient && !C0653pe.m800(new File(C0595nv.f2874))) {
                z = false;
            }
            if (str != null && str2 != null && str3 != null && parseBoolean && parseBoolean2 && z) {
                ProgressDialog progressDialog = new ProgressDialog(huVar.f1226);
                long j = (long) (C0595nv.f2876 == null ? HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE : HttpStatus.SC_MULTIPLE_CHOICES);
                progressDialog.setProgressStyle(1);
                progressDialog.setMax((int) j);
                progressDialog.setMessage("Initializing: [" + str + "] at [" + str3 + "]");
                progressDialog.setButton(-1, "OK", new C0425hy(huVar, str, str2));
                progressDialog.setButton(-2, "Change", new C0426hz(huVar, progressDialog));
                progressDialog.setCancelable(true);
                progressDialog.setProgressNumberFormat(null);
                progressDialog.setProgressPercentFormat(null);
                progressDialog.show();
                new C0428ia(huVar, progressDialog, System.currentTimeMillis(), j, str, str2).run();
            }
        } catch (Throwable th) {
            this.f49.mo4354(Thread.currentThread(), th);
        }
    }

    /* renamed from: 鷭 */
    public final void mo3385() {
        setContentView(R.layout.clear);
        C0453ix.m477(R.id.relativeLayout1);
        if (C0441in.f1306 == 0) {
            m23(this.f50);
        } else {
            this.f50.run();
        }
    }

    /* renamed from: 櫯 */
    private synchronized void m23(Runnable runnable) {
        this.f57 = new C0440im(new C1796(this, System.currentTimeMillis(), runnable));
        ((ViewGroup) getWindow().getDecorView()).addView(this.f57);
    }

    /* renamed from: 鷭 */
    public final void mo3386(File file) {
        StringBuilder append = new StringBuilder().append(file).append(File.separator).append("data").append(File.separator);
        byte b = f45[10];
        File file2 = new File(append.append(m24(b, b, b - 1)).toString());
        if (file2.exists()) {
            try {
                C1014.f6161.f6167 = C0623ou.m755(file2.getAbsolutePath());
                C1014.f6161.mo4256(true);
            } catch (IOException e) {
                throw new C0588no(e, "Failed to read " + file.getAbsolutePath());
            }
        } else {
            ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Loading client");
            progressDialog.setProgressStyle(1);
            progressDialog.setMax(100);
            progressDialog.setCancelable(false);
            progressDialog.show();
            new C1308(this, file, progressDialog).execute(new Void[]{null});
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable th) {
            this.f49.mo4354(Thread.currentThread(), th);
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 269 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r9, android.view.KeyEvent r10) {
        /*
            r8 = this;
            o.ix r0 = r8.f51     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x029e
            o.ix r4 = r8.f51     // Catch:{ Throwable -> 0x0292 }
            r0 = 4
            if (r9 != r0) goto L_0x01b7
            o.댚 r0 = r4.f1452     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x0078
            o.댚 r5 = r4.f1452     // Catch:{ Throwable -> 0x0292 }
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147     // Catch:{ Throwable -> 0x0292 }
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x0292 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Throwable -> 0x0292 }
            r1 = 2131296320(0x7f090040, float:1.8210553E38)
            android.view.View r6 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x0292 }
            if (r6 == 0) goto L_0x0029
            android.widget.RelativeLayout r0 = r5.f8557     // Catch:{ Throwable -> 0x0292 }
            if (r6 != r0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x0078
            o.댚 r6 = r4.f1452     // Catch:{ Throwable -> 0x0292 }
            r5 = r6
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147     // Catch:{ Throwable -> 0x0292 }
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x0292 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Throwable -> 0x0292 }
            r1 = 2131296320(0x7f090040, float:1.8210553E38)
            android.view.View r7 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x0292 }
            if (r7 == 0) goto L_0x0049
            android.widget.RelativeLayout r0 = r6.f8557     // Catch:{ Throwable -> 0x0292 }
            if (r7 != r0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 == 0) goto L_0x0075
            r7 = r5
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147     // Catch:{ Throwable -> 0x0292 }
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x0292 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Throwable -> 0x0292 }
            r1 = 2131296320(0x7f090040, float:1.8210553E38)
            android.view.View r4 = r0.findViewById(r1)     // Catch:{ Throwable -> 0x0292 }
            if (r4 == 0) goto L_0x0067
            android.widget.RelativeLayout r0 = r7.f8557     // Catch:{ Throwable -> 0x0292 }
            if (r4 != r0) goto L_0x0067
            r0 = 1
            goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            if (r0 == 0) goto L_0x0072
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147     // Catch:{ Throwable -> 0x0292 }
            r1 = 2130903090(0x7f030032, float:1.7412988E38)
            r0.setContentView(r1)     // Catch:{ Throwable -> 0x0292 }
        L_0x0072:
            p004o.C1014.m1828()     // Catch:{ Throwable -> 0x0292 }
        L_0x0075:
            r0 = 1
            goto L_0x028e
        L_0x0078:
            o.fh r0 = r4.f1386     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x00a1
            o.fh r0 = r4.f1386     // Catch:{ Throwable -> 0x0292 }
            boolean r0 = r0.f922     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x00a1
            o.fh r5 = r4.f1386     // Catch:{ Throwable -> 0x0292 }
            o.hp r0 = p004o.C1014.f6160     // Catch:{ Throwable -> 0x0292 }
            r0.mo3792()     // Catch:{ Throwable -> 0x0292 }
            r0 = 0
            r5.f922 = r0     // Catch:{ Throwable -> 0x0292 }
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147     // Catch:{ Throwable -> 0x0292 }
            o.ix r0 = r0.f51     // Catch:{ Throwable -> 0x0292 }
            o.hu r0 = r0.f1372     // Catch:{ Throwable -> 0x0292 }
            r0.mo3537h_()     // Catch:{ Throwable -> 0x0292 }
            o.hp r0 = p004o.C1014.f6160     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x009e
            o.hp r0 = p004o.C1014.f6160     // Catch:{ Throwable -> 0x0292 }
            r0.mo3792()     // Catch:{ Throwable -> 0x0292 }
        L_0x009e:
            r0 = 1
            goto L_0x028e
        L_0x00a1:
            r5 = 0
            goto L_0x00d3
        L_0x00a3:
            java.util.Stack<o.km> r0 = r4.f1434     // Catch:{ Throwable -> 0x0292 }
            java.lang.Object r0 = r0.pop()     // Catch:{ Throwable -> 0x0292 }
            o.km r0 = (p004o.C0499km) r0     // Catch:{ Throwable -> 0x0292 }
            r5 = r0
            o.cb r0 = r4.f1416     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x00b6
            o.cb r0 = r4.f1416     // Catch:{ Throwable -> 0x0292 }
            o.cb$鷭 r0 = r0.f544     // Catch:{ Throwable -> 0x0292 }
            if (r5 == r0) goto L_0x00ba
        L_0x00b6:
            o.g r0 = r4.f1432     // Catch:{ Throwable -> 0x0292 }
            if (r5 != r0) goto L_0x00d3
        L_0x00ba:
            java.util.Stack<o.km> r0 = r4.f1434     // Catch:{ Throwable -> 0x0292 }
            int r0 = r0.size()     // Catch:{ Throwable -> 0x0292 }
            if (r0 <= 0) goto L_0x00d2
            java.util.Stack<o.km> r0 = r4.f1434     // Catch:{ Throwable -> 0x0292 }
            java.lang.Object r0 = r0.pop()     // Catch:{ Throwable -> 0x0292 }
            o.km r0 = (p004o.C0499km) r0     // Catch:{ Throwable -> 0x0292 }
            r6 = r0
            java.util.Stack<o.km> r0 = r4.f1434     // Catch:{ Throwable -> 0x0292 }
            r0.push(r5)     // Catch:{ Throwable -> 0x0292 }
            r5 = r6
            goto L_0x00d3
        L_0x00d2:
            r5 = 0
        L_0x00d3:
            java.util.Stack<o.km> r0 = r4.f1434     // Catch:{ Throwable -> 0x0292 }
            int r0 = r0.size()     // Catch:{ Throwable -> 0x0292 }
            if (r0 <= 0) goto L_0x00dd
            if (r5 == 0) goto L_0x00a3
        L_0x00dd:
            if (r5 == 0) goto L_0x0161
            o.is r0 = r4.f1384     // Catch:{ Throwable -> 0x0292 }
            if (r5 != r0) goto L_0x00ef
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.絳 r1 = new o.絳     // Catch:{ Throwable -> 0x0292 }
            r1.<init>()     // Catch:{ Throwable -> 0x0292 }
            r0.mo3652(r1)     // Catch:{ Throwable -> 0x0292 }
            goto L_0x015b
        L_0x00ef:
            o.冱 r0 = r4.f1388     // Catch:{ Throwable -> 0x0292 }
            if (r5 != r0) goto L_0x0102
            o.冱 r0 = r4.f1388     // Catch:{ Throwable -> 0x0292 }
            o.nx r0 = r0.f7283     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x015b
            o.冱 r0 = r4.f1388     // Catch:{ Throwable -> 0x0292 }
            o.nx r0 = r0.f7283     // Catch:{ Throwable -> 0x0292 }
            r0.mo3668()     // Catch:{ Throwable -> 0x0292 }
            goto L_0x015b
        L_0x0102:
            o.ڇ r0 = r4.f1389     // Catch:{ Throwable -> 0x0292 }
            if (r5 != r0) goto L_0x0115
            o.ڇ r0 = r4.f1389     // Catch:{ Throwable -> 0x0292 }
            o.nx r0 = r0.f6613     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x015b
            o.ڇ r0 = r4.f1389     // Catch:{ Throwable -> 0x0292 }
            o.nx r0 = r0.f6613     // Catch:{ Throwable -> 0x0292 }
            r0.mo3668()     // Catch:{ Throwable -> 0x0292 }
            goto L_0x015b
        L_0x0115:
            o.fy r0 = r4.f1377     // Catch:{ Throwable -> 0x0292 }
            if (r5 != r0) goto L_0x0135
            o.fy r0 = r4.f1377     // Catch:{ Throwable -> 0x0292 }
            o.fy$鷭 r0 = r0.f979     // Catch:{ Throwable -> 0x0292 }
            o.fy$鷭 r1 = p004o.C0357fy.C0358.CHANGE_MATERIAL     // Catch:{ Throwable -> 0x0292 }
            if (r0 != r1) goto L_0x0135
            r0 = 1
            int[] r6 = new int[r0]     // Catch:{ Throwable -> 0x0292 }
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x015b
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.뛒 r1 = new o.뛒     // Catch:{ Throwable -> 0x0292 }
            r2 = 0
            r3 = 0
            r1.<init>(r6, r2, r3, r6)     // Catch:{ Throwable -> 0x0292 }
            r0.mo3652(r1)     // Catch:{ Throwable -> 0x0292 }
            goto L_0x015b
        L_0x0135:
            o.ii r0 = r4.f1421     // Catch:{ Throwable -> 0x0292 }
            if (r5 != r0) goto L_0x014a
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x0147
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.鎹 r1 = new o.鎹     // Catch:{ Throwable -> 0x0292 }
            r1.<init>()     // Catch:{ Throwable -> 0x0292 }
            r0.mo3652(r1)     // Catch:{ Throwable -> 0x0292 }
        L_0x0147:
            r0 = 1
            goto L_0x028e
        L_0x014a:
            o.cb r0 = r4.f1416     // Catch:{ Throwable -> 0x0292 }
            if (r5 != r0) goto L_0x015b
            o.cb r5 = r4.f1416     // Catch:{ Throwable -> 0x0292 }
            r5.mo3538()     // Catch:{ Throwable -> 0x0292 }
            o.cb$鷭 r0 = r5.f544     // Catch:{ Throwable -> 0x0292 }
            r0.mo3537h_()     // Catch:{ Throwable -> 0x0292 }
            r0 = 1
            goto L_0x028e
        L_0x015b:
            r5.mo3538()     // Catch:{ Throwable -> 0x0292 }
            r0 = 1
            goto L_0x028e
        L_0x0161:
            o.lq r0 = p004o.C1014.f6142     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x018e
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147     // Catch:{ Throwable -> 0x0292 }
            o.ix r0 = r0.f51     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x018e
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147     // Catch:{ Throwable -> 0x0292 }
            o.ix r0 = r0.f51     // Catch:{ Throwable -> 0x0292 }
            o.gm r0 = r0.f1457     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x018e
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147     // Catch:{ Throwable -> 0x0292 }
            o.ix r5 = r0.f51     // Catch:{ Throwable -> 0x0292 }
            r0 = 0
            r5.f1457 = r0     // Catch:{ Throwable -> 0x0292 }
            android.widget.TextView r0 = r5.f1426     // Catch:{ Throwable -> 0x0292 }
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ Throwable -> 0x0292 }
            android.widget.TextView r0 = r5.f1447     // Catch:{ Throwable -> 0x0292 }
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ Throwable -> 0x0292 }
            r5.mo3864()     // Catch:{ Throwable -> 0x0292 }
            r0 = 1
            goto L_0x028e
        L_0x018e:
            o.lq r0 = p004o.C1014.f6142     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x01b1
            o.lq r0 = p004o.C1014.f6142     // Catch:{ Throwable -> 0x0292 }
            o.mb r0 = r0.f1693     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x01b1
            o.lq r0 = p004o.C1014.f6142     // Catch:{ Throwable -> 0x0292 }
            boolean r0 = r0.f1688     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x01b1
            o.lq r5 = p004o.C1014.f6142     // Catch:{ Throwable -> 0x0292 }
            o.mb r0 = r5.f1693     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x01ab
            o.mb r6 = r5.f1693     // Catch:{ Throwable -> 0x0292 }
            r0 = 1
            r5.mo3976(r6, r0)     // Catch:{ Throwable -> 0x0292 }
            goto L_0x01ae
        L_0x01ab:
            r5.mo3975()     // Catch:{ Throwable -> 0x0292 }
        L_0x01ae:
            r0 = 1
            goto L_0x028e
        L_0x01b1:
            r4.mo3858()     // Catch:{ Throwable -> 0x0292 }
            r0 = 1
            goto L_0x028e
        L_0x01b7:
            r0 = 19
            if (r9 != r0) goto L_0x01ed
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.㯲$鷭 r0 = r0.f7007     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.㯲$鷭 r0 = r0.f7007     // Catch:{ Throwable -> 0x0292 }
            o.nl r0 = r0.f7027     // Catch:{ Throwable -> 0x0292 }
            o.nl r1 = p004o.C0585nl.MAP     // Catch:{ Throwable -> 0x0292 }
            if (r0 != r1) goto L_0x028d
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ Throwable -> 0x0292 }
            boolean r0 = r0.f4490     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.齴 r1 = new o.齴     // Catch:{ Throwable -> 0x0292 }
            o.hn$鷭 r2 = p004o.C0412hn.C0413.NUM8     // Catch:{ Throwable -> 0x0292 }
            int r2 = r2.ordinal()     // Catch:{ Throwable -> 0x0292 }
            byte r2 = (byte) r2     // Catch:{ Throwable -> 0x0292 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0292 }
            r0.mo3652(r1)     // Catch:{ Throwable -> 0x0292 }
            r0 = 1
            goto L_0x028e
        L_0x01ed:
            r0 = 20
            if (r9 != r0) goto L_0x0223
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.㯲$鷭 r0 = r0.f7007     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.㯲$鷭 r0 = r0.f7007     // Catch:{ Throwable -> 0x0292 }
            o.nl r0 = r0.f7027     // Catch:{ Throwable -> 0x0292 }
            o.nl r1 = p004o.C0585nl.MAP     // Catch:{ Throwable -> 0x0292 }
            if (r0 != r1) goto L_0x028d
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ Throwable -> 0x0292 }
            boolean r0 = r0.f4490     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.齴 r1 = new o.齴     // Catch:{ Throwable -> 0x0292 }
            o.hn$鷭 r2 = p004o.C0412hn.C0413.NUM2     // Catch:{ Throwable -> 0x0292 }
            int r2 = r2.ordinal()     // Catch:{ Throwable -> 0x0292 }
            byte r2 = (byte) r2     // Catch:{ Throwable -> 0x0292 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0292 }
            r0.mo3652(r1)     // Catch:{ Throwable -> 0x0292 }
            r0 = 1
            goto L_0x028e
        L_0x0223:
            r0 = 21
            if (r9 != r0) goto L_0x0258
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.㯲$鷭 r0 = r0.f7007     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.㯲$鷭 r0 = r0.f7007     // Catch:{ Throwable -> 0x0292 }
            o.nl r0 = r0.f7027     // Catch:{ Throwable -> 0x0292 }
            o.nl r1 = p004o.C0585nl.MAP     // Catch:{ Throwable -> 0x0292 }
            if (r0 != r1) goto L_0x028d
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ Throwable -> 0x0292 }
            boolean r0 = r0.f4490     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.齴 r1 = new o.齴     // Catch:{ Throwable -> 0x0292 }
            o.hn$鷭 r2 = p004o.C0412hn.C0413.NUM4     // Catch:{ Throwable -> 0x0292 }
            int r2 = r2.ordinal()     // Catch:{ Throwable -> 0x0292 }
            byte r2 = (byte) r2     // Catch:{ Throwable -> 0x0292 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0292 }
            r0.mo3652(r1)     // Catch:{ Throwable -> 0x0292 }
            r0 = 1
            goto L_0x028e
        L_0x0258:
            r0 = 22
            if (r9 != r0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.㯲$鷭 r0 = r0.f7007     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.㯲$鷭 r0 = r0.f7007     // Catch:{ Throwable -> 0x0292 }
            o.nl r0 = r0.f7027     // Catch:{ Throwable -> 0x0292 }
            o.nl r1 = p004o.C0585nl.MAP     // Catch:{ Throwable -> 0x0292 }
            if (r0 != r1) goto L_0x028d
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ Throwable -> 0x0292 }
            boolean r0 = r0.f4490     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x028d
            o.㯲 r0 = p004o.C1014.f6144     // Catch:{ Throwable -> 0x0292 }
            o.齴 r1 = new o.齴     // Catch:{ Throwable -> 0x0292 }
            o.hn$鷭 r2 = p004o.C0412hn.C0413.NUM6     // Catch:{ Throwable -> 0x0292 }
            int r2 = r2.ordinal()     // Catch:{ Throwable -> 0x0292 }
            byte r2 = (byte) r2     // Catch:{ Throwable -> 0x0292 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0292 }
            r0.mo3652(r1)     // Catch:{ Throwable -> 0x0292 }
            r0 = 1
            goto L_0x028e
        L_0x028d:
            r0 = 0
        L_0x028e:
            if (r0 == 0) goto L_0x029e
            r0 = 1
            return r0
        L_0x0292:
            r9 = move-exception
            o.䖫 r0 = r8.f49
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.mo4354(r1, r9)
            r0 = 0
            return r0
        L_0x029e:
            boolean r0 = super.onKeyDown(r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roworkshop.andro.c_activity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            aaz.m62(this);
            super.onPause();
            C1641 r2 = C1014.f6136;
            if (r2.f7601.isPlaying()) {
                r2.f7601.pause();
                r2.f7600 = true;
            }
            if (this.f53 != null) {
                this.f53.onPause();
            }
        } catch (Throwable th) {
            this.f49.mo4354(Thread.currentThread(), th);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        try {
            super.onResume();
            if (this.f58 != null) {
                C1013zz.m1817(this, this.f58.f60);
            }
            if (this.f58 != null) {
                abk.m76(this, this.f58.f60, new C1285(this));
            }
            aaz.m63(this);
            C1641 r2 = C1014.f6136;
            if (r2.f7600) {
                r2.f7601.start();
            }
            if (this.f53 != null) {
                this.f53.onResume();
            }
        } catch (Throwable th) {
            this.f49.mo4354(Thread.currentThread(), th);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onLowMemory() {
        super.onLowMemory();
        C0592ns.m674("[ANDRO_ONLOWMEMORY]");
    }
}

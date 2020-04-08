package p004o;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.support.p000v4.view.ViewCompat;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import com.roworkshop.andro.c_point;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import org.apache.http.HttpStatus;

/* renamed from: o.ix */
public final class C0453ix {

    /* renamed from: ř */
    private static boolean f1366 = false;

    /* renamed from: 䕌 */
    static Bitmap f1367;

    /* renamed from: 뛒 */
    private static /* synthetic */ int[] f1368;

    /* renamed from: Ą */
    ProgressDialog f1369;

    /* renamed from: ą */
    AlertDialog f1370;

    /* renamed from: Ć */
    ProgressBar f1371;

    /* renamed from: ć */
    public C0421hu f1372;

    /* renamed from: ċ */
    public C0455 f1373 = new C0455();

    /* renamed from: đ */
    public C0383gr f1374;

    /* renamed from: Ē */
    public C0429ib f1375;

    /* renamed from: ē */
    public C2009 f1376;

    /* renamed from: Ė */
    public C0357fy f1377;

    /* renamed from: ė */
    public C1877 f1378;

    /* renamed from: Ę */
    public C0265d f1379;

    /* renamed from: ę */
    public C1978 f1380;

    /* renamed from: ġ */
    public C0197at f1381;

    /* renamed from: ģ */
    public C1331 f1382;

    /* renamed from: Ĥ */
    public C1535 f1383;

    /* renamed from: ĥ */
    public C0448is f1384;

    /* renamed from: Ħ */
    public C0527lk f1385;

    /* renamed from: ħ */
    public C0340fh f1386;

    /* renamed from: Ĩ */
    public C1733 f1387;

    /* renamed from: Ī */
    public C1528 f1388;

    /* renamed from: ī */
    public C1315 f1389;

    /* renamed from: Ĭ */
    public C1294 f1390;

    /* renamed from: Į */
    public C1629 f1391;

    /* renamed from: į */
    public C0241cf f1392;

    /* renamed from: ĸ */
    Bitmap[] f1393;

    /* renamed from: ĺ */
    Bitmap[] f1394;

    /* renamed from: Ļ */
    Bitmap[] f1395;

    /* renamed from: Ľ */
    Bitmap[] f1396;

    /* renamed from: Ŀ */
    Bitmap[] f1397;

    /* renamed from: ō */
    Runnable f1398 = new C0484jx(this);

    /* renamed from: Ŏ */
    OnClickListener f1399 = new C0488kb(this);

    /* renamed from: ŏ */
    OnClickListener f1400 = new C0489kc(this);

    /* renamed from: ő */
    OnClickListener f1401 = new C0491ke(this);

    /* renamed from: Œ */
    OnClickListener f1402 = new C0492kf(this);

    /* renamed from: œ */
    OnClickListener f1403 = new C0493kg(this);

    /* renamed from: Ŕ */
    OnClickListener f1404 = new C0459iz(this);

    /* renamed from: Ŗ */
    OnTouchListener f1405 = new C0462jb(this);

    /* renamed from: ŗ */
    OnClickListener f1406 = new C0463jc(this);

    /* renamed from: ś */
    private OnItemSelectedListener f1407 = new C0472jl(this);

    /* renamed from: ȃ */
    ProgressDialog f1408;

    /* renamed from: Ȋ */
    public C0456 f1409;

    /* renamed from: Ƞ */
    public C2027 f1410;

    /* renamed from: ɕ */
    Bitmap[] f1411;

    /* renamed from: ˮ͈ */
    RelativeLayout f1412;

    /* renamed from: ˮ͍ */
    public C0312eh f1413;

    /* renamed from: غ */
    OnLongClickListener f1414 = new C0464jd(this);

    /* renamed from: ف */
    private OnClickListener f1415 = new C0458iy(this);

    /* renamed from: ܕ */
    public C0234cb f1416;

    /* renamed from: ܨ */
    public C0192ao f1417;

    /* renamed from: ঽ্ */
    public C0735s f1418;

    /* renamed from: ਓ */
    Bitmap[] f1419;

    /* renamed from: 㥳 */
    public C1941 f1420;

    /* renamed from: 㱽 */
    public C0436ii f1421;

    /* renamed from: 㵼 */
    public C1681 f1422;

    /* renamed from: 㺗 */
    Bitmap[] f1423;

    /* renamed from: 㺳 */
    OnClickListener f1424 = new C0461ja(this);

    /* renamed from: 䆬 */
    HashMap<String, Bitmap> f1425 = new HashMap<>();

    /* renamed from: 䍼 */
    public TextView f1426;

    /* renamed from: 䒧 */
    public C1746 f1427 = new C1746();

    /* renamed from: 䲑 */
    public C0290dv f1428;

    /* renamed from: 䲕 */
    ArrayList<C0500kn> f1429;

    /* renamed from: 囃 */
    public C0317em f1430;

    /* renamed from: 坴 */
    OnClickListener f1431 = new C0490kd(this);

    /* renamed from: 岱 */
    public C0360g f1432;

    /* renamed from: 崲 */
    public C0286dr f1433;

    /* renamed from: 差 */
    public Stack<C0499km> f1434 = new Stack<>();

    /* renamed from: 庸 */
    public C0396hc f1435;

    /* renamed from: 廂 */
    public C1916 f1436;

    /* renamed from: 廅 */
    public C0365ge f1437;

    /* renamed from: 廑 */
    public C0330ey f1438;

    /* renamed from: 廕 */
    public C1585 f1439;

    /* renamed from: 櫯 */
    boolean f1440 = false;

    /* renamed from: 漐 */
    C0500kn f1441;

    /* renamed from: 瞣 */
    public C1536 f1442;

    /* renamed from: 簇 */
    public C1724 f1443;

    /* renamed from: 纫 */
    public C0454if f1444;

    /* renamed from: 躆 */
    public C1842 f1445;

    /* renamed from: 釫 */
    HashMap<Integer, ImageView> f1446 = new HashMap<>();

    /* renamed from: 釯 */
    public TextView f1447;

    /* renamed from: 釳 */
    C0457 f1448;

    /* renamed from: 鷭 */
    boolean f1449 = false;

    /* renamed from: 麹 */
    Bitmap f1450;

    /* renamed from: 黬 */
    public C0297eb f1451;

    /* renamed from: 齴 */
    public C1904 f1452;

    /* renamed from: ꑣ */
    C0372gk[] f1453;

    /* renamed from: 냆 */
    TextView f1454;

    /* renamed from: 띥 */
    public C1496 f1455;

    /* renamed from: 윬 */
    Bitmap f1456;

    /* renamed from: 졸 */
    public C0377gm f1457;

    /* renamed from: 진 */
    TextView f1458;

    /* renamed from: o.ix$if */
    class C0454if {

        /* renamed from: ȃ */
        OnClickListener f1460 = new C0495ki(this);

        /* renamed from: ˮ͈ */
        OnClickListener f1461 = new C0494kh(this);

        /* renamed from: 櫯 */
        AlertDialog f1462;

        /* renamed from: 鷭 */
        RelativeLayout f1463;

        C0454if(c_activity c_activity) {
            this.f1463 = (RelativeLayout) ((LayoutInflater) c_activity.getSystemService("layout_inflater")).inflate(R.layout.respawn, null);
        }
    }

    /* renamed from: o.ix$ˮ͈ */
    class C0455 {

        /* renamed from: 櫯 */
        int f1465;

        /* renamed from: 鷭 */
        AlertDialog f1466;

        C0455() {
        }

        /* renamed from: 鷭 */
        static int m512(String str, int i) {
            boolean z;
            String substring = str.substring(i);
            if (substring.length() < 7) {
                throw new ParseException("String is too short", 0);
            } else if (substring.charAt(0) != '^') {
                throw new ParseException("String doesn't start with ^ symbol", 0);
            } else {
                for (int i2 = 1; i2 < 7; i2++) {
                    char charAt = substring.charAt(i2);
                    if (!Character.isDigit(charAt)) {
                        switch (Character.toLowerCase(charAt)) {
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
                            case HttpStatus.SC_PROCESSING /*102*/:
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                    } else {
                        z = true;
                    }
                    if (!z) {
                        throw new ParseException("Part of the color code is not a valid hex digit", i2);
                    }
                }
                try {
                    return Integer.parseInt(substring.substring(1, 7), 16);
                } catch (NumberFormatException e) {
                    throw new ParseException(e.getMessage(), 1);
                }
            }
        }
    }

    /* renamed from: o.ix$櫯 */
    class C0456 {

        /* renamed from: ą */
        private OnClickListener f1468 = new C0496kj(this);

        /* renamed from: ȃ */
        int f1469;

        /* renamed from: ˮ͈ */
        boolean f1470;

        /* renamed from: 櫯 */
        AlertDialog f1471;

        /* renamed from: 鷭 */
        RelativeLayout f1472;

        C0456(c_activity c_activity) {
            this.f1472 = (RelativeLayout) ((LayoutInflater) c_activity.getSystemService("layout_inflater")).inflate(R.layout.npcinput, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final void mo3880(boolean z, int i) {
            Context context = this.f1472.getContext();
            if (this.f1471 == null) {
                Builder builder = new Builder(context);
                Builder builder2 = builder;
                builder.setView(this.f1472);
                builder2.setCancelable(false);
                this.f1471 = builder2.create();
                this.f1471.show();
                ((Button) this.f1471.findViewById(R.id.button)).setOnClickListener(this.f1468);
            } else {
                this.f1471.show();
            }
            Button button = (Button) this.f1471.findViewById(R.id.button);
            if (z) {
                button.setInputType(8192);
            } else {
                button.setInputType(0);
            }
            this.f1470 = z;
            this.f1469 = i;
        }
    }

    /* renamed from: o.ix$鷭 */
    class C0457 {

        /* renamed from: Ą */
        ProgressBar f1473 = ((ProgressBar) this.f1478.findViewById(R.id.progressBar2));

        /* renamed from: ȃ */
        ProgressBar f1475 = ((ProgressBar) this.f1478.findViewById(R.id.progressBar1));

        /* renamed from: ˮ͈ */
        TextView f1476 = ((TextView) this.f1478.findViewById(R.id.textView2));

        /* renamed from: 櫯 */
        TextView f1477 = ((TextView) this.f1478.findViewById(R.id.textView1));

        /* renamed from: 鷭 */
        LinearLayout f1478;

        C0457(c_activity c_activity) {
            this.f1478 = (LinearLayout) c_activity.getLayoutInflater().inflate(R.layout.download_doublebar, null);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(27:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0022 */
    /* renamed from: ċ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m480() {
        /*
            int[] r0 = f1368
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.nn[] r0 = p004o.C0587nn.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.nn r0 = p004o.C0587nn.ALL     // Catch:{ NoSuchFieldError -> 0x0017 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
            r1 = 12
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
        L_0x0017:
            o.nn r0 = p004o.C0587nn.CHAT     // Catch:{ NoSuchFieldError -> 0x0022 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0022 }
        L_0x0022:
            o.nn r0 = p004o.C0587nn.ELEM     // Catch:{ NoSuchFieldError -> 0x002d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002d }
        L_0x002d:
            o.nn r0 = p004o.C0587nn.HOM     // Catch:{ NoSuchFieldError -> 0x0037 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0037 }
        L_0x0037:
            o.nn r0 = p004o.C0587nn.ITEM     // Catch:{ NoSuchFieldError -> 0x0041 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0041 }
        L_0x0041:
            o.nn r0 = p004o.C0587nn.MER     // Catch:{ NoSuchFieldError -> 0x004b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            o.nn r0 = p004o.C0587nn.MOB     // Catch:{ NoSuchFieldError -> 0x0055 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0055 }
        L_0x0055:
            o.nn r0 = p004o.C0587nn.NPC     // Catch:{ NoSuchFieldError -> 0x0060 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0060 }
        L_0x0060:
            o.nn r0 = p004o.C0587nn.NUL     // Catch:{ NoSuchFieldError -> 0x006a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
        L_0x006a:
            o.nn r0 = p004o.C0587nn.PC     // Catch:{ NoSuchFieldError -> 0x0074 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0074 }
        L_0x0074:
            o.nn r0 = p004o.C0587nn.PET     // Catch:{ NoSuchFieldError -> 0x007e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x007e }
        L_0x007e:
            o.nn r0 = p004o.C0587nn.SKILL     // Catch:{ NoSuchFieldError -> 0x0089 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0089 }
        L_0x0089:
            f1368 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0453ix.m480():int[]");
    }

    static {
    }

    public C0453ix(c_activity c_activity) {
        this.f1372 = new C0421hu(c_activity);
        this.f1413 = new C0312eh(c_activity);
        this.f1448 = new C0457(c_activity);
        this.f1386 = new C0340fh();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3868() {
        C1919 r0;
        Builder builder = new Builder(C1014.f6147);
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(C1014.f6137.f1636.f6538.f6567.f6595);
        if (leVar == null) {
            r0 = null;
        } else {
            C0520le leVar2 = leVar;
            r0 = C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null;
        }
        if (r0 != null) {
            String[] strArr = new String[1];
            C0252cp cpVar = C1014.f6158;
            String r5 = C1014.f6160.mo3796(1113);
            strArr[0] = r5 == null ? "MSG1113" : r5;
            builder.setItems(strArr, new C0466jf(this));
            builder.show();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo3866() {
        C1919 r0;
        Builder builder = new Builder(C1014.f6147);
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(C1014.f6137.f1636.f6524.f6567.f6595);
        if (leVar == null) {
            r0 = null;
        } else {
            C0520le leVar2 = leVar;
            r0 = C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null;
        }
        if (r0 != null) {
            if (C1014.f6137.f1636.f6524.f6567 == null) {
                C1014.f6137.f1636.f6524.f6567 = new C1305();
            }
            C1305 r4 = C1014.f6137.f1636.f6524.f6567;
            C0252cp cpVar = C1014.f6158;
            String r5 = C1014.f6160.mo3796(586);
            StringBuilder append = new StringBuilder(String.valueOf(r5 == null ? "MSG586" : r5)).append(": ").append(m479(r4.f6587)).append(" ").append(r4.f6587).append("; ");
            C0252cp cpVar2 = C1014.f6158;
            String r52 = C1014.f6160.mo3796(587);
            builder.setTitle(append.append(r52 == null ? "MSG587" : r52).append(": ").append(m484((int) r4.f6589)).toString());
            String[] strArr = new String[2];
            C0252cp cpVar3 = C1014.f6158;
            String r53 = C1014.f6160.mo3796(1113);
            strArr[0] = r53 == null ? "MSG1113" : r53;
            C0252cp cpVar4 = C1014.f6158;
            String r54 = C1014.f6160.mo3796(1114);
            strArr[1] = r54 == null ? "MSG1114" : r54;
            builder.setItems(strArr, new C0467jg(this));
            builder.show();
        }
    }

    /* renamed from: ą */
    private static String m479(int i) {
        if (i < 20) {
            C0252cp cpVar = C1014.f6158;
            String r2 = C1014.f6160.mo3796(668);
            return r2 == null ? "MSG668" : r2;
        } else if (i < 40) {
            C0252cp cpVar2 = C1014.f6158;
            String r22 = C1014.f6160.mo3796(669);
            return r22 == null ? "MSG669" : r22;
        } else if (i < 60) {
            C0252cp cpVar3 = C1014.f6158;
            String r23 = C1014.f6160.mo3796(670);
            return r23 == null ? "MSG670" : r23;
        } else {
            C0252cp cpVar4 = C1014.f6158;
            String r24 = C1014.f6160.mo3796(671);
            return r24 == null ? "MSG671" : r24;
        }
    }

    /* renamed from: 鷭 */
    static String m484(int i) {
        if (i < 250) {
            C0252cp cpVar = C1014.f6158;
            String r2 = C1014.f6160.mo3796(673);
            return r2 == null ? "MSG673" : r2;
        } else if (i < 500) {
            C0252cp cpVar2 = C1014.f6158;
            String r22 = C1014.f6160.mo3796(674);
            return r22 == null ? "MSG674" : r22;
        } else if (i < 750) {
            C0252cp cpVar3 = C1014.f6158;
            String r23 = C1014.f6160.mo3796(675);
            return r23 == null ? "MSG675" : r23;
        } else {
            C0252cp cpVar4 = C1014.f6158;
            String r24 = C1014.f6160.mo3796(676);
            return r24 == null ? "MSG676" : r24;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3862() {
        Builder builder = new Builder(C1014.f6147);
        C1305 r4 = C1014.f6137.f1636.f6547.f6581;
        if (r4 != null) {
            C0252cp cpVar = C1014.f6158;
            String r5 = C1014.f6160.mo3796(586);
            StringBuilder append = new StringBuilder(String.valueOf(r5 == null ? "MSG586" : r5)).append(": ").append(m479(r4.f6587)).append("(").append(r4.f6587).append(") ; ");
            C0252cp cpVar2 = C1014.f6158;
            String r52 = C1014.f6160.mo3796(587);
            builder.setTitle(append.append(r52 == null ? "MSG587" : r52).append(": ").append(m484((int) r4.f6589)).toString());
            String[] strArr = new String[3];
            C0252cp cpVar3 = C1014.f6158;
            String r53 = C1014.f6160.mo3796(593);
            strArr[0] = r53 == null ? "MSG593" : r53;
            C0252cp cpVar4 = C1014.f6158;
            String r54 = C1014.f6160.mo3796(594);
            strArr[1] = r54 == null ? "MSG594" : r54;
            C0252cp cpVar5 = C1014.f6158;
            String r55 = C1014.f6160.mo3796(595);
            strArr[2] = r55 == null ? "MSG595" : r55;
            builder.setItems(strArr, new C0468jh(this));
            builder.show();
        }
    }

    /* renamed from: 鷭 */
    public final void mo3872(String str) {
        if (this.f1370 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(this));
        }
        C1014.f6147.mo3387((Runnable) new C0471jk(this, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo3867(int i) {
        C0311 r3 = (C0311) C1014.f6158.f674.f615.f843.get(Integer.valueOf(i));
        String str = r3 == null ? null : r3.f845;
        if (str != null) {
            String str2 = "data\\texture\\" + str;
            if (((ImageView) this.f1446.get(Integer.valueOf(i))) == null) {
                ImageView imageView = (ImageView) C1014.f6147.getLayoutInflater().inflate(R.layout.sc_icon, null);
                imageView.setId(i);
                ImageView imageView2 = imageView;
                Bitmap bitmap = (Bitmap) this.f1425.get(str);
                if (bitmap == null) {
                    C1014.f6158.mo3387((Runnable) new C0474jn(this, str2, str, imageView2));
                } else {
                    imageView.setImageBitmap(bitmap);
                }
                ((RelativeLayout) C1014.f6147.f51.f1412.findViewById(R.id.sc_layout)).addView(imageView, new LayoutParams(-2, -2));
                this.f1446.put(Integer.valueOf(i), imageView);
                m481();
            }
        }
    }

    /* renamed from: Ȋ */
    private void m481() {
        int i = -1;
        for (ImageView imageView : this.f1446.values()) {
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            if (i == -1) {
                layoutParams.addRule(10);
            } else {
                layoutParams.addRule(3, i);
            }
            imageView.setLayoutParams(layoutParams);
            i = imageView.getId();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3863(int i) {
        C0311 r2 = (C0311) C1014.f6158.f674.f615.f843.get(Integer.valueOf(i));
        if ((r2 == null ? null : r2.f845) != null) {
            ImageView imageView = (ImageView) this.f1446.remove(Integer.valueOf(i));
            if (imageView != null) {
                ((RelativeLayout) C1014.f6147.f51.f1412.findViewById(R.id.sc_layout)).removeView(imageView);
                m481();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 116 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3869(int r5, int r6) {
        /*
            r4 = this;
            java.util.ArrayList<o.kn> r0 = r4.f1429
            java.util.Iterator r3 = r0.iterator()
            goto L_0x0020
        L_0x0007:
            java.lang.Object r0 = r3.next()
            o.kn r0 = (p004o.C0500kn) r0
            r2 = r0
            if (r2 == 0) goto L_0x0020
            int r0 = r2.f1558
            if (r0 != r5) goto L_0x0020
            o.kn$鷭 r0 = r2.f1566
            o.kn$鷭 r1 = p004o.C0500kn.C0501.ITEM
            if (r0 != r1) goto L_0x0020
            if (r6 >= 0) goto L_0x001d
            r6 = 0
        L_0x001d:
            r2.mo3923(r6)
        L_0x0020:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0007
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0453ix.mo3869(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 129 */
    /* renamed from: ȃ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3861(int r6) {
        /*
            r5 = this;
            java.util.ArrayList<o.kn> r0 = r5.f1429
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r2 = 0
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6528
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
            goto L_0x002c
        L_0x0015:
            java.lang.Object r0 = r4.next()
            o.쎥 r0 = (p004o.C1992) r0
            r3 = r0
            if (r3 == 0) goto L_0x002c
            int r0 = r3.f8848
            if (r0 != r6) goto L_0x002c
            int r0 = r3.f8836
            if (r0 != 0) goto L_0x002c
            int r0 = r3.f8846
            if (r0 <= r2) goto L_0x002c
            int r2 = r3.f8846
        L_0x002c:
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L_0x0015
            java.util.ArrayList<o.kn> r0 = r5.f1429
            java.util.Iterator r4 = r0.iterator()
            goto L_0x004f
        L_0x0039:
            java.lang.Object r0 = r4.next()
            o.kn r0 = (p004o.C0500kn) r0
            r3 = r0
            if (r3 == 0) goto L_0x004f
            int r0 = r3.f1558
            if (r0 != r6) goto L_0x004f
            o.kn$鷭 r0 = r3.f1566
            o.kn$鷭 r1 = p004o.C0500kn.C0501.ITEM
            if (r0 != r1) goto L_0x004f
            r3.mo3923(r2)
        L_0x004f:
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L_0x0039
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0453ix.mo3861(int):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 120 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r2.f1548 > r5.f1051) goto L_0x0029;
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3874(p004o.C0377gm r5) {
        /*
            r4 = this;
            java.util.ArrayList<o.kn> r0 = r4.f1429
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.util.ArrayList<o.kn> r0 = r4.f1429
            java.util.Iterator r3 = r0.iterator()
            goto L_0x002f
        L_0x000c:
            java.lang.Object r0 = r3.next()
            o.kn r0 = (p004o.C0500kn) r0
            r2 = r0
            o.kn$鷭 r0 = r2.f1566
            o.kn$鷭 r1 = p004o.C0500kn.C0501.SKILL
            if (r0 != r1) goto L_0x002f
            int r0 = r2.f1558
            int r1 = r5.f1053
            if (r0 != r1) goto L_0x002f
            int r0 = r2.f1548
            if (r0 == 0) goto L_0x0029
            int r0 = r2.f1548
            int r1 = r5.f1051
            if (r0 <= r1) goto L_0x002f
        L_0x0029:
            int r0 = r5.f1051
            r2.mo3923(r0)
            return
        L_0x002f:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x000c
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0453ix.mo3874(o.gm):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ȃ */
    public final void mo3860() {
        if (C1014.f6137.f1636 != null) {
            for (C0377gm r0 : C1014.f6137.f1636.f6548.f6579.values()) {
                mo3874(r0);
            }
            if (C1014.f6137.f1636.f6524 != null) {
                for (C0377gm r02 : C1014.f6137.f1636.f6524.f6572.f6579.values()) {
                    mo3874(r02);
                }
            }
            if (C1014.f6137.f1636.f6538 != null) {
                for (C0377gm r03 : C1014.f6137.f1636.f6538.f6572.f6579.values()) {
                    mo3874(r03);
                }
            }
        }
    }

    /* renamed from: 鷭 */
    private C0500kn m485(c_point c_point, c_point c_point2) {
        Rect rect = new Rect(c_point.x, c_point.y, c_point.x + c_point2.x, c_point.y + c_point2.y);
        Iterator it = this.f1429.iterator();
        while (it.hasNext()) {
            C0500kn knVar = (C0500kn) it.next();
            if (knVar.f1552.equals(c_point)) {
                return knVar;
            }
            if (rect.intersect(new Rect(knVar.f1552.x, knVar.f1552.y, knVar.f1552.x + knVar.f1564.getWidth(), knVar.f1552.y + knVar.f1564.getHeight()))) {
                return knVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 140 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3876(p004o.C0500kn.C0501 r14, int r15, int r16, int r17, byte r18) {
        /*
            r13 = this;
            o.kn r0 = r13.f1441
            if (r0 != 0) goto L_0x0053
            o.kn$鷭 r0 = p004o.C0500kn.C0501.HOMUN
            if (r14 != r0) goto L_0x0022
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            o.ձ$if r0 = r0.f6524
            if (r0 == 0) goto L_0x0022
            o.kn r0 = new o.kn
            r1 = r15
            o.kn$鷭 r3 = p004o.C0500kn.C0501.HOMUN
            com.roworkshop.andro.c_point r4 = p004o.C0500kn.f1541
            r2 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.f1441 = r0
            goto L_0x0053
        L_0x0022:
            o.kn$鷭 r0 = p004o.C0500kn.C0501.MERC
            if (r14 != r0) goto L_0x0042
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            o.ձ$if r0 = r0.f6538
            if (r0 == 0) goto L_0x0042
            o.kn r0 = new o.kn
            r1 = r15
            o.kn$鷭 r3 = p004o.C0500kn.C0501.MERC
            com.roworkshop.andro.c_point r4 = p004o.C0500kn.f1541
            r7 = r17
            r8 = r18
            r2 = 1
            r5 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.f1441 = r0
            goto L_0x0053
        L_0x0042:
            o.kn r0 = new o.kn
            o.kn$鷭 r3 = p004o.C0500kn.C0501.SKILL
            com.roworkshop.andro.c_point r4 = p004o.C0500kn.f1541
            r1 = 1
            r2 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.f1441 = r0
        L_0x0053:
            com.roworkshop.andro.c_point r9 = new com.roworkshop.andro.c_point
            o.kn r0 = r13.f1441
            android.widget.RelativeLayout r0 = r0.f1564
            int r0 = r0.getPaddingLeft()
            o.kn r1 = r13.f1441
            android.widget.RelativeLayout r1 = r1.f1564
            int r1 = r1.getPaddingRight()
            int r0 = r0 + r1
            o.kn r1 = r13.f1441
            android.widget.RelativeLayout r1 = r1.f1564
            int r1 = r1.getPaddingTop()
            o.kn r2 = r13.f1441
            android.widget.RelativeLayout r2 = r2.f1564
            int r2 = r2.getPaddingBottom()
            int r1 = r1 + r2
            r9.<init>(r0, r1)
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r10 = r0.getDisplayMetrics()
            int r0 = r10.densityDpi
            float r0 = (float) r0
            r1 = 1126170624(0x43200000, float:160.0)
            float r0 = r0 / r1
            r1 = 1117782016(0x42a00000, float:80.0)
            float r0 = r0 * r1
            int r11 = (int) r0
            o.kn$鷭 r0 = p004o.C0500kn.C0501.EMOTION
            if (r14 != r0) goto L_0x00a8
            com.roworkshop.andro.c_point r10 = new com.roworkshop.andro.c_point
            com.roworkshop.andro.c_point r0 = p004o.C0500kn.f1541
            r10.<init>(r0)
            int r0 = r9.x
            int r1 = r9.y
            r10.offset(r0, r1)
            com.roworkshop.andro.c_point r9 = new com.roworkshop.andro.c_point
            r0 = 0
            r1 = 0
            r9.<init>(r0, r1)
            goto L_0x00d0
        L_0x00a8:
            com.roworkshop.andro.c_point r10 = new com.roworkshop.andro.c_point
            com.roworkshop.andro.c_point r0 = p004o.C0500kn.f1541
            r10.<init>(r0)
            int r0 = r9.x
            int r1 = r9.y
            r10.offset(r0, r1)
            com.roworkshop.andro.c_point r9 = new com.roworkshop.andro.c_point
            o.lq r0 = p004o.C1014.f6142
            android.graphics.Point r0 = r0.f1690
            int r0 = r0.x
            int r1 = r10.x
            int r0 = r0 - r1
            com.roworkshop.andro.c_point r1 = p004o.C0500kn.f1545
            int r1 = r1.y
            int r1 = r1 % r11
            int r1 = r11 - r1
            com.roworkshop.andro.c_point r2 = p004o.C0500kn.f1545
            int r2 = r2.y
            int r1 = r1 + r2
            r9.<init>(r0, r1)
        L_0x00d0:
            com.roworkshop.andro.c_point r11 = new com.roworkshop.andro.c_point
            r11.<init>(r9)
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            r1 = 2131296419(0x7f0900a3, float:1.8210754E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            float r0 = r0.getY()
            int r0 = (int) r0
            o.lq r1 = p004o.C1014.f6142
            android.graphics.Point r1 = r1.f1690
            int r1 = r1.y
            int r12 = java.lang.Math.min(r0, r1)
            goto L_0x0117
        L_0x00f0:
            int r0 = r11.y
            com.roworkshop.andro.c_point r1 = p004o.C0500kn.f1545
            int r1 = r1.y
            int r0 = r0 + r1
            r11.y = r0
            int r0 = r11.y
            int r1 = r10.y
            int r0 = r0 + r1
            if (r0 < r12) goto L_0x0117
            o.kn$鷭 r0 = p004o.C0500kn.C0501.EMOTION
            if (r14 != r0) goto L_0x010c
            int r0 = r11.x
            int r1 = r10.x
            int r0 = r0 + r1
            r11.x = r0
            goto L_0x0113
        L_0x010c:
            int r0 = r11.x
            int r1 = r10.x
            int r0 = r0 - r1
            r11.x = r0
        L_0x0113:
            int r0 = r9.y
            r11.y = r0
        L_0x0117:
            o.kn r0 = r13.m485(r11, r10)
            if (r0 != 0) goto L_0x00f0
            o.kn r0 = r13.m485(r11, r10)
            if (r0 == 0) goto L_0x0130
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            java.lang.String r1 = "Couldn't find a place for hotkey"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            return
        L_0x0130:
            o.kn$鷭 r0 = p004o.C0500kn.C0501.MERC
            if (r14 != r0) goto L_0x0149
            o.kn r0 = new o.kn
            r1 = r15
            r2 = r16
            r3 = r14
            com.roworkshop.andro.c_point r4 = p004o.C0500kn.f1541
            int r5 = r11.x
            int r6 = r11.y
            r7 = r17
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r14 = r0
            goto L_0x015b
        L_0x0149:
            o.kn r0 = new o.kn
            r1 = r15
            r2 = r16
            r3 = r14
            com.roworkshop.andro.c_point r4 = p004o.C0500kn.f1541
            int r5 = r11.x
            int r6 = r11.y
            r7 = 0
            r8 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r14 = r0
        L_0x015b:
            r14.mo3537h_()
            java.util.ArrayList<o.kn> r0 = r13.f1429
            r0.add(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0453ix.mo3876(o.kn$鷭, int, int, int, byte):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 130 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r5 == p004o.C0500kn.C0501.f1569) goto L_0x0027;
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3879(p004o.C0500kn.C0501 r5, int r6) {
        /*
            r4 = this;
            java.util.ArrayList<o.kn> r0 = r4.f1429
            java.util.Iterator r2 = r0.iterator()
            goto L_0x0045
        L_0x0008:
            java.lang.Object r0 = r2.next()
            o.kn r0 = (p004o.C0500kn) r0
            r3 = r0
            int r0 = r3.f1558
            if (r0 != r6) goto L_0x0017
            o.kn$鷭 r0 = r3.f1566
            if (r0 == r5) goto L_0x0027
        L_0x0017:
            o.kn$鷭 r0 = r3.f1566
            if (r0 != r5) goto L_0x001f
            o.kn$鷭 r0 = p004o.C0500kn.C0501.HOMUN
            if (r5 == r0) goto L_0x0027
        L_0x001f:
            o.kn$鷭 r0 = r3.f1566
            if (r0 != r5) goto L_0x0045
            o.kn$鷭 r0 = p004o.C0500kn.C0501.MERC
            if (r5 != r0) goto L_0x0045
        L_0x0027:
            r5 = r3
            android.widget.RelativeLayout r0 = r3.f1564
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r0 == 0) goto L_0x0040
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r0 = r0.f51
            android.widget.RelativeLayout r0 = r0.f1412
            android.widget.RelativeLayout r1 = r5.f1564
            r0.removeView(r1)
        L_0x0040:
            r2.remove()
            r0 = 1
            return r0
        L_0x0045:
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L_0x0008
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0453ix.mo3879(o.kn$鷭, int):boolean");
    }

    /* renamed from: 鷭 */
    static void m488(C0377gm gmVar, int i, C0587nn nnVar) {
        C0548mb mbVar = C1014.f6142.f1693;
        if (!C1014.f6142.f1688) {
            mbVar = null;
        }
        if ((nnVar != C0587nn.HOM || C1014.f6137.f1636.f6524 != null) && (nnVar != C0587nn.MER || C1014.f6137.f1636.f6538 != null)) {
            C1302if ifVar = null;
            if (m486(nnVar) != null) {
                ifVar = m486(nnVar);
            }
            if (!(gmVar.f1052 == 0)) {
                if (!((gmVar.f1052 & 4) != 0)) {
                    if ((gmVar.f1052 & 2) != 0) {
                        C1014.f6147.f51.mo3875(gmVar, i);
                        return;
                    }
                    if (!((gmVar.f1052 & 16) != 0)) {
                        if (!((gmVar.f1052 & 1) != 0)) {
                            return;
                        }
                    }
                    if (mbVar == null || !C0543ly.m632(gmVar, mbVar)) {
                        C1014.f6147.f51.mo3875(gmVar, i);
                    } else if (ifVar != null) {
                        ifVar.f6560 = C0568mv.SKILL_OBJECT_CMD;
                        ifVar.f6571 = mbVar.f1769.f1630;
                        C1014.f6158.f674.f620.mo4635(nnVar);
                    } else {
                        C1014.f6144.mo3652((C0839ue) new C1085(gmVar.f1053, i, mbVar.f1769.f1630));
                    }
                } else if (ifVar == null || C1014.f6137.f1636.f6524 == null) {
                    C1014.f6144.mo3652((C0839ue) new C1085(gmVar.f1053, i, C1014.f6137.f1636.f1630));
                } else {
                    ifVar.f6560 = C0568mv.SKILL_OBJECT_CMD;
                    ifVar.f6571 = C1014.f6137.f1636.f6524.f6567.f6595;
                    C1014.f6158.f674.f620.mo4635(nnVar);
                }
            }
        }
    }

    /* renamed from: 鷭 */
    private static C1302if m486(C0587nn nnVar) {
        if (nnVar == C0587nn.HOM) {
            return C1014.f6137.f1636.f6524;
        }
        if (nnVar == C0587nn.MER) {
            return C1014.f6137.f1636.f6538;
        }
        return null;
    }

    /* renamed from: 櫯 */
    static void m482(int i, int i2) {
        if (C1014.f6137.f1636 != null && C1014.f6137.f1636.f6548 != null) {
            C0587nn nnVar = null;
            C1303 r2 = C1014.f6137.f1636.f6548;
            if (((C0377gm) r2.f6579.get(Integer.valueOf(i))) == null && C1014.f6137.f1636.f6524 != null) {
                r2 = C1014.f6137.f1636.f6524.f6572;
                nnVar = C0587nn.HOM;
            }
            if (((C0377gm) r2.f6579.get(Integer.valueOf(i))) == null && C1014.f6137.f1636.f6538 != null) {
                r2 = C1014.f6137.f1636.f6538.f6572;
                nnVar = C0587nn.MER;
            }
            C0377gm gmVar = (C0377gm) r2.f6579.get(Integer.valueOf(i));
            if (gmVar == null) {
                C0592ns.m674("Unknown error");
            } else {
                m488(gmVar, i2, nnVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ą */
    public final void mo3857() {
        if (this.f1429 != null) {
            for (int i = 0; i < this.f1429.size(); i++) {
                ((C0500kn) this.f1429.get(i)).mo3924(i);
            }
            C1014.f6160.mo3805("nhotkeys" + m478(), 0, String.valueOf(this.f1429.size()));
        }
    }

    /* renamed from: ą */
    static String m478() {
        return " " + C1014.f6159.f6173 + " " + C1014.f6161.f6169;
    }

    /* renamed from: 鷭 */
    public static SpannableStringBuilder m483(String str, boolean z) {
        int i;
        if (str == null) {
            return null;
        }
        int i2 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i3 = 0;
        int i4 = 0;
        while (i4 < str.length()) {
            if (str.charAt(i4) == '^' && i4 + 7 <= str.length()) {
                try {
                    i = Integer.valueOf(str.substring(i4 + 1, i4 + 7), 16).intValue();
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                spannableStringBuilder.delete(i4, i4 + 7);
            } else if (i4 == str.length() - 1) {
                i4++;
                i = 0;
            } else {
                i4++;
            }
            if (z) {
                if (i2 == 0) {
                    i2 = ViewCompat.MEASURED_SIZE_MASK;
                } else if (i2 == 16777215) {
                    i2 = 8947848;
                }
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-16777216 | i2), i3, i4, 17);
            str = spannableStringBuilder.toString();
            i2 = i;
            i3 = i4;
            i4++;
        }
        String str2 = "ITEM";
        String str3 = "NAVI";
        String[] strArr = {str2, str3};
        int i5 = 0;
        while (i5 < str.length()) {
            String[] strArr2 = strArr;
            int length = strArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                String str4 = strArr2[i6];
                String str5 = "<" + str4 + ">";
                String str6 = "</" + str4 + ">";
                if (str.regionMatches(i5, str5, 0, str5.length())) {
                    int indexOf = str.indexOf(str6, i5 + 1);
                    if (indexOf != -1) {
                        String substring = str.substring(str5.length() + i5, indexOf);
                        int indexOf2 = substring.indexOf("<INFO>");
                        int indexOf3 = substring.indexOf("</INFO>");
                        String str7 = null;
                        if (!(indexOf2 == -1 || indexOf3 == -1)) {
                            str7 = substring.substring(indexOf2 + 6, indexOf3);
                            substring = substring.substring(0, indexOf2) + substring.substring(indexOf3 + 7, substring.length());
                        }
                        spannableStringBuilder.replace(i5, str6.length() + indexOf, substring);
                        str = spannableStringBuilder.toString();
                        Object obj = null;
                        if (str4.equals(str2)) {
                            try {
                                int parseInt = Integer.parseInt(str7.trim());
                                if (C1014.f6158.f674.f608.mo4465(parseInt) != null) {
                                    obj = new C0476jp(parseInt);
                                }
                            } catch (NumberFormatException unused2) {
                            }
                        } else if (str4.equals(str3)) {
                            String[] split = str7.split(",");
                            if (split.length >= 3) {
                                obj = new C0477jq(split);
                            }
                        }
                        if (obj != null) {
                            spannableStringBuilder.setSpan(obj, i5, substring.length() + i5, 17);
                        }
                        i5 += substring.length() - 1;
                    }
                }
                i6++;
            }
            i5++;
        }
        return spannableStringBuilder;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3878(String[] strArr) {
        C1014.f6147.setContentView(R.layout.select_char_server);
        Spinner spinner = (Spinner) C1014.f6147.findViewById(R.id.spinner1);
        spinner.setAdapter(new ArrayAdapter(C1014.f6147, R.layout.spinner_item, strArr));
        spinner.setOnItemSelectedListener(this.f1407);
        int r4 = C1014.f6160.mo3795("last_char_server", 0);
        if (r4 < strArr.length) {
            spinner.setSelection(r4);
        }
        ((Button) C1014.f6147.findViewById(R.id.connect_button)).setOnClickListener(this.f1415);
        m477(R.id.select_char_server);
    }

    /* renamed from: 鷭 */
    static void m487(RelativeLayout relativeLayout, Point point, Point point2) {
        if (point == null) {
            point = new Point(0, 0);
        }
        Point point3 = new Point(C1014.f6147.f53.getWidth(), C1014.f6147.f53.getHeight());
        Rect rect = new Rect(point.x - (point2.x / 2), point.y - (point2.y / 2), point.x + (point2.x / 2), point.y + (point2.y / 2));
        Rect rect2 = rect;
        if (rect.left < 0) {
            rect2.offset(-rect2.left, 0);
        }
        if (rect2.top < 0) {
            rect2.offset(0, -rect2.top);
        }
        if (rect2.right > point3.x) {
            rect2.offset(point3.x - rect2.right, 0);
        }
        if (rect2.bottom > point3.y) {
            rect2.offset(0, point3.y - rect2.bottom);
        }
        relativeLayout.setX((float) rect2.left);
        relativeLayout.setY((float) rect2.top);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3873(String str, int i) {
        if (str.startsWith("blue")) {
            i = -16711681;
            str = str.substring(4);
        } else if (str.startsWith("ssss")) {
            str = str.substring(4);
        }
        this.f1427.mo4490(str, 16777215 & i);
        this.f1454.setVisibility(0);
        this.f1454.setTextColor(i);
        this.f1454.setText(str);
        C1014.f6147.f56.removeCallbacks(this.f1398);
        c_activity c_activity = C1014.f6147;
        Runnable runnable = this.f1398;
        if (c_activity.f56 != null) {
            c_activity.f56.postDelayed(new C1348(c_activity, runnable), 5000);
        }
    }

    /* renamed from: Ć */
    public final void mo3858() {
        new Builder(C1014.f6147).setTitle(null).setMessage("Are you sure you want to quit?").setPositiveButton("Yes", new C0478jr(this)).setNegativeButton("No", new C0479js(this)).show();
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.String[], code=java.lang.Object[], for r7v0, types: [java.lang.String[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3877(short r6, java.lang.Object[] r7) {
        /*
            r5 = this;
            r3 = 0
            goto L_0x001a
        L_0x0002:
            r0 = r7[r3]
            java.lang.String r1 = ".gat"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x0018
            r0 = r7[r3]
            java.lang.String r1 = ".gat"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            r7[r3] = r0
        L_0x0018:
            int r3 = r3 + 1
        L_0x001a:
            int r0 = r7.length
            if (r3 < r0) goto L_0x0002
            java.lang.String r3 = "Memorize (/memo)"
            if (r7 != 0) goto L_0x002d
            java.lang.Class r0 = r3.getClass()
            r1 = 0
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r7 = r0
        L_0x002d:
            int r0 = r7.length
            int r0 = r0 + 1
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r7, r0)
            int r0 = r7.length
            r4[r0] = r3
            r0 = r4
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3 = r0
            android.app.AlertDialog$Builder r7 = new android.app.AlertDialog$Builder
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            r7.<init>(r0)
            o.jv r0 = new o.jv
            r0.<init>(r5, r3, r6)
            r7.setItems(r3, r0)
            o.jw r0 = new o.jw
            r0.<init>(r5, r6)
            r7.setOnCancelListener(r0)
            r7.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0453ix.mo3877(short, java.lang.String[]):void");
    }

    /* renamed from: 鷭 */
    public final void mo3871(ImageView imageView, String str, Bitmap bitmap) {
        if (str == null) {
            imageView.setImageBitmap(null);
            return;
        }
        Bitmap bitmap2 = (Bitmap) this.f1425.get(str);
        if (bitmap2 != null) {
            imageView.setImageBitmap(bitmap2);
            return;
        }
        imageView.setImageBitmap(bitmap);
        C1014.f6158.mo3387((Runnable) new C0485jy(this, str, imageView, imageView.getDrawable()));
    }

    /* renamed from: 鷭 */
    public final void mo3870(ImageView imageView, int i) {
        mo3871(imageView, C1014.f6158.f674.mo3609(C1014.f6158.f674.f609.mo3752(i).f1073), this.f1456);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: Ą */
    public static void m477(int i) {
        Bitmap bitmap;
        String str = C0595nv.f2874 + File.separator + "last_bg.png";
        if (C1014.f6140 == null || !C1014.f6140.f4483) {
            if (f1367 != null) {
                bitmap = f1367;
            } else {
                bitmap = BitmapFactory.decodeFile(str);
                if (bitmap == null) {
                    bitmap = BitmapFactory.decodeResource(C1014.f6147.getResources(), R.drawable.background);
                }
            }
            f1367 = bitmap;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(C1014.f6147.getResources(), bitmap);
            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            bitmapDrawable.setColorFilter(Color.rgb(123, 123, 123), Mode.MULTIPLY);
            RelativeLayout relativeLayout = (RelativeLayout) C1014.f6147.findViewById(i);
            if (VERSION.SDK_INT < 16) {
                relativeLayout.setBackgroundDrawable(bitmapDrawable2);
            } else {
                relativeLayout.setBackground(bitmapDrawable2);
            }
            if (C1014.f6158 != null && !f1366) {
                f1366 = true;
                C1014.f6158.mo3387((Runnable) new C0487ka(str));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3875(C0377gm gmVar, int i) {
        this.f1457 = null;
        this.f1426.setVisibility(8);
        this.f1447.setVisibility(8);
        mo3864();
        this.f1457 = gmVar.mo3750();
        this.f1457.f1051 = i;
        C0381gq r4 = C1014.f6158.f674.f609.mo3752(gmVar.f1053);
        this.f1426.setVisibility(0);
        this.f1426.setText(r4.f1071);
        this.f1447.setVisibility(0);
        mo3864();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ć */
    public final void mo3859() {
        this.f1457 = null;
        this.f1426.setVisibility(8);
        this.f1447.setVisibility(8);
        mo3864();
    }

    /* renamed from: ˮ͍ */
    public final void mo3864() {
        c_activity c_activity = C1014.f6147;
        ImageView imageView = (ImageView) C1014.f6147.findViewById(R.id.imageview_attackbtn2);
        if (imageView != null) {
            C0548mb mbVar = C1014.f6142.f1693;
            if (mbVar == null) {
                imageView.setImageBitmap(null);
                return;
            }
            C0520le leVar = mbVar.f1769;
            if ((C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null) != null) {
                switch (m480()[mbVar.f1769.f1629.ordinal()]) {
                    case 9:
                        imageView.setImageBitmap(C1014.f6158.f661);
                        return;
                    default:
                        C0520le leVar2 = mbVar.f1769;
                        if ((C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null).mo4581()) {
                            if (this.f1457 != null) {
                                if ((this.f1457.f1052 & 1) != 0) {
                                    mo3870(imageView, this.f1457.f1053);
                                    return;
                                }
                            }
                            imageView.setImageBitmap(C1014.f6158.f660);
                            return;
                        }
                        if (this.f1457 != null) {
                            if ((this.f1457.f1052 & 16) != 0) {
                                C0453ix ixVar = C1014.f6147.f51;
                                c_activity c_activity2 = C1014.f6147;
                                ixVar.mo3870((ImageView) C1014.f6147.findViewById(R.id.imageview_attackbtn2), C1014.f6147.f51.f1457.f1053);
                                return;
                            }
                        }
                        c_activity c_activity3 = C1014.f6147;
                        ((ImageView) C1014.f6147.findViewById(R.id.imageview_attackbtn2)).setImageBitmap(C1014.f6158.f659);
                        return;
                }
            } else {
                switch (m480()[mbVar.f1769.f1629.ordinal()]) {
                    case 7:
                        c_activity c_activity4 = C1014.f6147;
                        ((ImageView) C1014.f6147.findViewById(R.id.imageview_attackbtn2)).setImageBitmap(C1014.f6158.f662);
                        return;
                    case 9:
                        c_activity c_activity5 = C1014.f6147;
                        ((ImageView) C1014.f6147.findViewById(R.id.imageview_attackbtn2)).setImageBitmap(C1014.f6158.f661);
                        return;
                    default:
                        throw new C0588no();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 116 */
    /* renamed from: 岱 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3865() {
        /*
            r6 = this;
            r3 = 0
            o.cp r0 = p004o.C1014.f6158
            o.ck r0 = r0.f674
            o.gl r0 = r0.f611
            java.util.ArrayList<o.gl$if> r0 = r0.f1024
            int r0 = r0.size()
            o.gk[] r0 = new p004o.C0372gk[r0]
            r6.f1453 = r0
            o.cp r0 = p004o.C1014.f6158
            o.ck r0 = r0.f674
            o.gl r0 = r0.f611
            java.util.ArrayList<o.gl$if> r0 = r0.f1024
            java.util.Iterator r5 = r0.iterator()
            goto L_0x0089
        L_0x001f:
            java.lang.Object r0 = r5.next()
            o.gl$if r0 = (p004o.C0373gl.C0374if) r0
            r4 = r0
            o.lq r0 = p004o.C1014.f6142
            o.嫶 r0 = r0.f1695
            java.lang.String r0 = r0.f7353
            java.lang.String r1 = r4.f1033
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            o.gl$櫯 r0 = r4.f1025
            o.gl$櫯 r1 = p004o.C0373gl.C0375.NONE
            if (r0 == r1) goto L_0x0040
            o.gl$櫯 r0 = r4.f1025
            o.gl$櫯 r1 = p004o.C0373gl.C0375.SPRITE
            if (r0 != r1) goto L_0x007d
        L_0x0040:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported signboard ICONID "
            r0.<init>(r1)
            o.gl$櫯 r1 = r4.f1025
            int r1 = r1.ordinal()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " at "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r4.f1033
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r4.f1032
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r4.f1030
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
            goto L_0x0089
        L_0x007d:
            o.gk[] r0 = r6.f1453
            r1 = r3
            int r3 = r3 + 1
            o.gk r2 = new o.gk
            r2.<init>(r4)
            r0[r1] = r2
        L_0x0089:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x001f
            o.gk[] r0 = r6.f1453
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            o.gk[] r0 = (p004o.C0372gk[]) r0
            r6.f1453 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0453ix.mo3865():void");
    }
}

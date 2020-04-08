package p004o;

import android.app.AlertDialog.Builder;
import android.graphics.LightingColorFilter;
import android.graphics.Point;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import com.roworkshop.andro.c_point;
import java.util.Iterator;
import org.apache.http.HttpStatus;

/* renamed from: o.kn */
final class C0500kn extends C0499km {

    /* renamed from: đ */
    static final c_point f1541;

    /* renamed from: ę */
    private static /* synthetic */ int[] f1542;

    /* renamed from: ܕ */
    static LightingColorFilter f1543 = new LightingColorFilter(-11184811, 0);

    /* renamed from: 䒧 */
    static int f1544 = 25;

    /* renamed from: 庸 */
    static final c_point f1545 = new c_point((int) ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 5.0f), (int) ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 5.0f));

    /* renamed from: 廂 */
    private static /* synthetic */ int[] f1546;

    /* renamed from: 躆 */
    static LightingColorFilter f1547 = new LightingColorFilter(-2130706433, 0);

    /* renamed from: Ą */
    int f1548;

    /* renamed from: ą */
    int f1549 = 0;

    /* renamed from: Ć */
    ImageView f1550;

    /* renamed from: ć */
    TextView f1551;

    /* renamed from: ċ */
    Point f1552 = new Point();

    /* renamed from: Ē */
    int f1553;

    /* renamed from: ē */
    byte f1554;

    /* renamed from: Ė */
    private OnClickListener f1555 = new C0502ko(this);

    /* renamed from: ė */
    private OnTouchListener f1556 = new C0503kp(this);

    /* renamed from: Ę */
    private OnLongClickListener f1557 = new C0504kq(this);

    /* renamed from: ȃ */
    int f1558;

    /* renamed from: Ȋ */
    boolean f1559 = false;

    /* renamed from: ˮ͈ */
    RelativeLayout f1560;

    /* renamed from: ˮ͍ */
    boolean f1561 = false;

    /* renamed from: 㥳 */
    private c_point f1562;

    /* renamed from: 岱 */
    boolean f1563 = false;

    /* renamed from: 櫯 */
    RelativeLayout f1564;

    /* renamed from: 纫 */
    Point f1565 = new Point();

    /* renamed from: 鷭 */
    C0501 f1566;

    /* renamed from: 띥 */
    private c_point f1567;

    /* renamed from: o.kn$鷭 */
    enum C0501 {
        GAMEMENU,
        ITEM,
        SKILL,
        EMOTION,
        HOMUN,
        MERC
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|6|7|8|9|10|11|12|13|(2:14|15)|16|18) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: Ć */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m523() {
        /*
            int[] r0 = f1542
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.kn$鷭[] r0 = p004o.C0500kn.C0501.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.kn$鷭 r0 = p004o.C0500kn.C0501.EMOTION     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.kn$鷭 r0 = p004o.C0500kn.C0501.GAMEMENU     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.kn$鷭 r0 = p004o.C0500kn.C0501.HOMUN     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.kn$鷭 r0 = p004o.C0500kn.C0501.ITEM     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.kn$鷭 r0 = p004o.C0500kn.C0501.MERC     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            o.kn$鷭 r0 = p004o.C0500kn.C0501.SKILL     // Catch:{ NoSuchFieldError -> 0x0048 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            f1542 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0500kn.m523():int[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:3|4|5|6|7|8|9|(2:10|11)|12|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|7|8|9|10|11|12|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ć */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m525() {
        /*
            int[] r0 = f1546
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.mz[] r0 = p004o.C0572mz.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.mz r0 = p004o.C0572mz.CART     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.mz r0 = p004o.C0572mz.EQUIP     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.mz r0 = p004o.C0572mz.ETC     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.mz r0 = p004o.C0572mz.USABLE     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            f1546 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0500kn.m525():int[]");
    }

    static {
        float f = (float) f1544;
        float f2 = (float) f1544;
        f1541 = new c_point((int) ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * f), (int) ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * f2));
    }

    C0500kn(int i, int i2, C0501 r11, c_point c_point, int i3, int i4, int i5, byte b) {
        this.f1553 = i5;
        this.f1554 = b;
        m533(i, i2, r11, c_point.x, c_point.y, i3, i4);
    }

    C0500kn(int i) {
        String r13 = C1014.f6160.mo3802("hotkey" + i + C0453ix.m478(), 0);
        String str = r13 == null ? null : r13;
        String str2 = str;
        if (str == null) {
            String str3 = "Failed to init hotkey.";
            Log.e("AndRO", str3);
            throw new C0588no(str3);
        }
        String[] split = str2.split(" ");
        if (split.length < 4) {
            String str4 = "Invalid emotion string format: " + str2;
            Log.e("AndRO", str4);
            throw new C0588no(str4);
        }
        C0501[] values = C0501.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            C0501 r132 = values[i2];
            if (r132.name().equalsIgnoreCase(split[0])) {
                this.f1566 = r132;
                break;
            }
            i2++;
        }
        if (this.f1566 == null) {
            String str5 = "Invalid emotion type: " + split[0];
            Log.e("AndRO", str5);
            throw new C0588no(str5);
        }
        try {
            this.f1558 = Integer.parseInt(split[1]);
            this.f1552.x = Integer.parseInt(split[2]);
            this.f1552.y = Integer.parseInt(split[3]);
            if (split.length >= 5) {
                this.f1548 = Integer.parseInt(split[4]);
            }
            if (split.length == 6) {
                this.f1565.x = f1544;
                this.f1565.y = f1544;
                this.f1553 = 0;
                this.f1554 = 0;
                this.f1549 = f1544;
            } else {
                if (split.length >= 6) {
                    this.f1565.x = Integer.parseInt(split[5]);
                }
                if (split.length >= 7) {
                    this.f1565.y = Integer.parseInt(split[6]);
                }
                if (split.length >= 8) {
                    this.f1553 = Short.parseShort(split[7]);
                }
                if (split.length >= 9) {
                    this.f1554 = Byte.parseByte(split[8]);
                }
                if (split.length >= 10) {
                    this.f1549 = Integer.parseInt(split[9]);
                }
            }
            switch (m523()[this.f1566.ordinal()]) {
                case 2:
                    this.f1548 = 0;
                    if (!(C1014.f6137.f1636 == null || C1014.f6137.f1636.f6528 == null)) {
                        Iterator it = C1014.f6137.f1636.f6528.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C1992 r133 = (C1992) it.next();
                                if (r133.f8848 == this.f1558) {
                                    this.f1548 = r133.f8846;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                case 3:
                    if (!(C1014.f6137.f1636 == null || C1014.f6137.f1636.f6548 == null)) {
                        C0377gm gmVar = (C0377gm) C1014.f6137.f1636.f6548.f6579.get(Integer.valueOf(this.f1558));
                        if (gmVar != null) {
                            if (this.f1548 != 0) {
                                this.f1548 = Math.min(gmVar.f1051, this.f1548);
                                break;
                            } else {
                                this.f1548 = gmVar.f1051;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    this.f1548 = -1;
                    break;
            }
            m533(this.f1558, this.f1548, this.f1566, this.f1565.x, this.f1565.y, this.f1552.x, this.f1552.y);
        } catch (NumberFormatException e) {
            Log.e("AndRO", e.toString());
            RuntimeException runtimeException = new RuntimeException(e.toString());
            runtimeException.setStackTrace(e.getStackTrace());
            throw runtimeException;
        }
    }

    /* renamed from: 鷭 */
    private void m533(int i, int i2, C0501 r8, int i3, int i4, int i5, int i6) {
        this.f1564 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.hotkeyed_item, null);
        this.f1550 = (ImageView) this.f1564.findViewById(R.id.imageView1);
        this.f1551 = (TextView) this.f1564.findViewById(R.id.textView1);
        this.f1558 = i;
        this.f1566 = r8;
        mo3923(i2);
        this.f1552.set(i5, i6);
        this.f1565.set(i3, i4);
        if (r8 != null) {
            if (r8 == C0501.SKILL && i != 0) {
                C1014.f6147.f51.mo3870(this.f1550, i);
            } else if (r8 == C0501.ITEM && i != 0) {
                C0453ix ixVar = C1014.f6147.f51;
                ImageView imageView = this.f1550;
                C1992 r82 = new C1992((int) (short) i);
                ixVar.mo3871(imageView, C1014.f6158.f674.mo3608(r82.f8848, r82.f8837, false), ixVar.f1450);
            } else if (r8 == C0501.EMOTION && i != 0) {
                ImageView imageView2 = this.f1550;
                C0252cp cpVar = C1014.f6158;
                imageView2.setImageBitmap(C0252cp.m269(C1014.f6142.f1680.f1186, i, new c_point(i3, i4)));
            } else if (r8 == C0501.HOMUN && i != 0) {
                C1014.f6158.mo3387((Runnable) new C0505kr(this));
            } else if (r8 != C0501.MERC || i == 0) {
                this.f1550.setImageBitmap(null);
                this.f1551.setText(r8.toString().substring(0, 2));
                this.f1551.setMinimumWidth(this.f1565.x);
                this.f1551.setMinimumHeight(this.f1565.y);
                this.f1551.setMaxWidth(this.f1565.x);
                this.f1551.setMaxHeight(this.f1565.y);
                this.f1551.setGravity(17);
                this.f1551.setTextSize((float) (this.f1565.x / 2));
            } else {
                C1014.f6158.mo3387((Runnable) new C0507kt(this));
            }
            this.f1564.setOnClickListener(this.f1555);
            this.f1564.setOnLongClickListener(this.f1557);
            this.f1564.setOnTouchListener(this.f1556);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3924(int i) {
        C1014.f6160.mo3805("hotkey" + i + C0453ix.m478(), 0, this.f1566.name() + " " + this.f1558 + " " + this.f1552.x + " " + this.f1552.y + " " + this.f1548 + " " + this.f1565.x + " " + this.f1565.y + " " + this.f1553 + " " + this.f1554 + " " + this.f1549);
    }

    /* renamed from: ȃ */
    private void m526() {
        if (this.f1563) {
            this.f1550.setColorFilter(f1547);
        } else if (this.f1548 == 0) {
            this.f1550.setColorFilter(f1543);
        } else {
            this.f1550.setColorFilter(null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo3923(int i) {
        int i2 = this.f1548;
        if (i != -1) {
            this.f1551.setText(String.valueOf(i));
        } else {
            this.f1551.setText(null);
        }
        this.f1548 = i;
        if (this.f1563) {
            return;
        }
        if ((i2 > 0 && i == 0) || (i2 == 0 && i > 0)) {
            m526();
        }
    }

    /* renamed from: ȃ */
    static /* synthetic */ void m527(C0500kn knVar) {
        if (C1014.f6147.f51.f1449) {
            knVar.f1550.clearColorFilter();
        } else {
            knVar.f1550.setColorFilter(R.color.HalfTransparentBlack);
        }
        C1014.f6147.f51.f1449 = !C1014.f6147.f51.f1449;
    }

    /* renamed from: Ą */
    static /* synthetic */ void m519(C0500kn knVar) {
        if (C1014.f6147.f51.f1440) {
            knVar.f1550.clearColorFilter();
        } else {
            knVar.f1550.setColorFilter(R.color.HalfTransparentBlack);
        }
        C1014.f6147.f51.f1440 = !C1014.f6147.f51.f1440;
    }

    /* renamed from: 鷭 */
    static /* synthetic */ boolean m535(C0500kn knVar, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 5:
                if (knVar.f1563) {
                    knVar.f1562 = new c_point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    knVar.f1567 = new c_point(knVar.f1552);
                    knVar.m526();
                    return true;
                }
                break;
            case 1:
            case 6:
                if (knVar.f1563) {
                    knVar.f1563 = false;
                    knVar.m526();
                    return true;
                }
                break;
            case 2:
                if (knVar.f1563) {
                    c_point c_point = new c_point(new c_point((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
                    c_point c_point2 = knVar.f1562;
                    c_point c_point3 = c_point;
                    c_point.set(c_point.x - c_point2.x, c_point3.y - c_point2.y);
                    c_point c_point4 = new c_point(knVar.f1567);
                    c_point c_point5 = c_point3;
                    c_point c_point6 = c_point4;
                    c_point4.offset(c_point5.x, c_point5.y);
                    int[] iArr = new int[2];
                    C1014.f6147.f51.f1412.getLocationOnScreen(iArr);
                    c_point6.x -= c_point6.x % f1545.x;
                    c_point6.y -= c_point6.y % f1545.y;
                    c_point6.x = Math.max(c_point6.x, iArr[0]);
                    c_point6.y = Math.max(c_point6.y, iArr[0]);
                    c_point6.x = Math.min(c_point6.x, (iArr[0] + C1014.f6147.f51.f1412.getWidth()) - knVar.f1564.getWidth());
                    c_point6.y = Math.min(c_point6.y, (iArr[0] + C1014.f6147.f51.f1412.getHeight()) - knVar.f1564.getHeight());
                    if (!knVar.f1552.equals(c_point6)) {
                        knVar.f1552 = c_point6;
                        knVar.m520();
                    }
                    return true;
                }
                break;
        }
        return false;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 127 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r4 = ((java.lang.Integer) r6.getKey()).intValue();
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r8.f8836 != 0) goto L_0x0040;
     */
    /* renamed from: 櫯 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m532(p004o.C0500kn r9) {
        /*
            r4 = 0
            r5 = 0
            o.lf r0 = p004o.C1014.f6137
            if (r0 == 0) goto L_0x000c
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            java.util.HashMap<java.lang.Integer, o.쎥> r0 = r0.f6528
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
            goto L_0x0040
        L_0x001c:
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r6 = r0
            java.lang.Object r0 = r6.getValue()
            o.쎥 r0 = (p004o.C1992) r0
            r8 = r0
            int r0 = r8.f8848
            int r1 = r9.f1558
            if (r0 != r1) goto L_0x0040
            int r0 = r8.f8836
            if (r0 != 0) goto L_0x0040
            java.lang.Object r0 = r6.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = r0.intValue()
            r5 = r8
            goto L_0x0046
        L_0x0040:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x001c
        L_0x0046:
            if (r5 == 0) goto L_0x0099
            int r0 = r5.f8846
            if (r0 <= 0) goto L_0x0099
            int[] r0 = m525()
            o.䒧 r1 = r5.f8839
            o.mz r1 = p004o.C0572mz.m662(r1)
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0068;
                case 2: goto L_0x0074;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x0085
        L_0x0068:
            o.㯲 r0 = p004o.C1014.f6144
            o.ƿ r1 = new o.ƿ
            short r2 = (short) r4
            r1.<init>(r2)
            r0.mo3652(r1)
            return
        L_0x0074:
            o.㯲 r0 = p004o.C1014.f6144
            o.ꑣ r1 = new o.ꑣ
            short r2 = (short) r4
            int r3 = r5.mo4613()
            short r3 = (short) r3
            r1.<init>(r2, r3)
            r0.mo3652(r1)
            return
        L_0x0085:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected hotkeyed item type: "
            r0.<init>(r1)
            o.䒧 r1 = r5.f8839
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0500kn.m532(o.kn):void");
    }

    /* renamed from: 鷭 */
    static /* synthetic */ void m534(C0500kn knVar) {
        c_activity c_activity = C1014.f6147;
        C0453ix.m482(knVar.f1558, knVar.f1548);
    }

    /* renamed from: ą */
    static /* synthetic */ boolean m521(C0500kn knVar) {
        String[] strArr;
        if (knVar.f1563) {
            return false;
        }
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle(knVar.f1566.toString());
        if (knVar.f1566 == C0501.HOMUN || knVar.f1566 == C0501.MERC) {
            strArr = new String[]{"Move", "Zoom"};
        } else {
            builder.setIcon(knVar.f1550.getDrawable());
            strArr = new String[]{"Move", "Zoom", "Delete"};
        }
        builder.setItems(strArr, new C0509kv(knVar));
        builder.show();
        return true;
    }

    /* renamed from: Ć */
    static /* synthetic */ void m522(C0500kn knVar) {
        if (!knVar.f1563) {
            knVar.f1563 = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ą */
    public void m518() {
        if (!(this.f1566 == C0501.EMOTION || this.f1566 == C0501.HOMUN || this.f1566 == C0501.MERC || this.f1566 == C0501.ITEM || this.f1566 == C0501.SKILL)) {
            this.f1551.setMinimumWidth(this.f1565.x);
            this.f1551.setMinimumHeight(this.f1565.y);
            this.f1551.setMaxWidth(this.f1565.x);
            this.f1551.setMaxHeight(this.f1565.y);
            this.f1551.setTextSize((float) ((f1544 + this.f1549) / 2));
        }
        this.f1550.setMinimumWidth(this.f1565.x);
        this.f1550.setMinimumHeight(this.f1565.y);
        this.f1550.setMaxWidth(this.f1565.x);
        this.f1550.setMaxHeight(this.f1565.y);
        this.f1564.setMinimumWidth(this.f1565.x);
        this.f1564.setMinimumHeight(this.f1565.y);
        m520();
    }

    /* renamed from: ć */
    static /* synthetic */ void m524(C0500kn knVar) {
        knVar.f1560 = (RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.hotkey_size, null);
        Builder builder = new Builder(C1014.f6147);
        builder.setView(knVar.f1560);
        builder.setPositiveButton("Ok", null);
        builder.create();
        builder.show();
        builder.setTitle("Hotkey size");
        SeekBar seekBar = (SeekBar) knVar.f1560.findViewById(R.id.seekBar1);
        seekBar.setMax(HttpStatus.SC_MULTIPLE_CHOICES);
        seekBar.setProgress(knVar.f1549);
        seekBar.setOnSeekBarChangeListener(new C0511kx(knVar));
    }

    /* renamed from: ˮ͍ */
    static /* synthetic */ void m530(C0500kn knVar) {
        if (((float) C1014.f6142.f1690.x) < ((float) knVar.f1552.x) + ((((float) knVar.f1565.x) / (((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f)) * 2.0f)) {
            Point point = knVar.f1552;
            point.x = (int) (((float) point.x) - ((((float) knVar.f1552.x) + ((((float) knVar.f1565.x) / (((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f)) * 2.0f)) - ((float) C1014.f6142.f1690.x)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ą */
    public void m520() {
        LayoutParams layoutParams = (LayoutParams) this.f1564.getLayoutParams();
        layoutParams.leftMargin = this.f1552.x;
        layoutParams.topMargin = this.f1552.y;
        this.f1564.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final boolean mo3539() {
        return this.f1564.getParent() != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h_ */
    public final void mo3537h_() {
        if (!(this.f1564.getParent() != null)) {
            C1014.f6147.f51.f1412.addView(this.f1564);
            m520();
            m518();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3538() {
        if (this.f1564.getParent() != null) {
            C1014.f6147.f51.f1412.removeView(this.f1564);
        }
    }
}

package p004o;

import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.widget.RelativeLayout.LayoutParams;
import com.libroserver.apk.R;
import com.roworkshop.andro.JoystickView;
import com.roworkshop.andro.c_activity;
import com.roworkshop.andro.c_point;
import p004o.C0643pc.C0645;

/* renamed from: o.煯 */
public final class C1675 extends GLSurfaceView {

    /* renamed from: ć */
    private static final int[] f7653;

    /* renamed from: ˮ͍ */
    private static final int[] f7654;

    /* renamed from: 岱 */
    private static /* synthetic */ int[] f7655;

    /* renamed from: Ą */
    int f7656;

    /* renamed from: ą */
    Point f7657;

    /* renamed from: Ć */
    long f7658;

    /* renamed from: ȃ */
    C1677[] f7659 = {new C1677(), new C1677(), new C1677(), new C1677(), new C1677()};

    /* renamed from: ˮ͈ */
    C0525li f7660;

    /* renamed from: 櫯 */
    C1676if f7661 = C1676if.NONE;

    /* renamed from: 鷭 */
    public C1812 f7662;

    /* renamed from: o.煯$if */
    enum C1676if {
        NONE,
        CAMERA,
        CONTINUOUS_MOVE,
        JOYSTICK_MOVE
    }

    /* renamed from: o.煯$鷭 */
    class C1677 {

        /* renamed from: Ą */
        long f7668;

        /* renamed from: ȃ */
        long f7670;

        /* renamed from: ˮ͈ */
        C0525li f7671;

        /* renamed from: 櫯 */
        C0525li f7672;

        /* renamed from: 鷭 */
        C0525li f7673;

        C1677() {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:3|4|5|6|7|8|9|(2:10|11)|12|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|7|8|9|10|11|12|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2339() {
        /*
            int[] r0 = f7655
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.煯$if[] r0 = p004o.C1675.C1676if.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.煯$if r0 = p004o.C1675.C1676if.CAMERA     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.煯$if r0 = p004o.C1675.C1676if.CONTINUOUS_MOVE     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.煯$if r0 = p004o.C1675.C1676if.JOYSTICK_MOVE     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.煯$if r0 = p004o.C1675.C1676if.NONE     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            f7655 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1675.m2339():int[]");
    }

    public C1675(c_activity c_activity) {
        super(c_activity);
        setEGLContextClientVersion(2);
        this.f7662 = new C1812(c_activity);
        super.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setRenderer(this.f7662);
    }

    /* access modifiers changed from: private */
    /* renamed from: 鷭 */
    public final void m2343() {
        if (this.f7661 == C1676if.CONTINUOUS_MOVE) {
            C1014.f6142.mo3980(this.f7660.f1649, this.f7660.f1648, false);
            c_activity c_activity = C1014.f6147;
            C1432 r5 = new C1432(this);
            if (c_activity.f56 != null) {
                c_activity.f56.postDelayed(new C1348(c_activity, r5), 700);
            }
        }
    }

    /* renamed from: 鷭 */
    private static final C0525li m2342(MotionEvent motionEvent, int i) {
        if (motionEvent.getPointerCount() != 2) {
            throw new RuntimeException();
        }
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            if (i2 != i) {
                return new C0525li(motionEvent.getX(i2), motionEvent.getY(i2));
            }
        }
        throw new RuntimeException();
    }

    static {
        int[] iArr = new int[8];
        iArr[0] = 1;
        iArr[1] = 1;
        iArr[3] = -1;
        iArr[4] = -1;
        iArr[5] = -1;
        iArr[7] = 1;
        f7653 = iArr;
        int[] iArr2 = new int[8];
        iArr2[1] = 1;
        iArr2[2] = 1;
        iArr2[3] = 1;
        iArr2[5] = -1;
        iArr2[6] = -1;
        iArr2[7] = -1;
        f7654 = iArr2;
    }

    /* access modifiers changed from: private */
    /* renamed from: 櫯 */
    public final void m2340() {
        if (this.f7661 == C1676if.JOYSTICK_MOVE) {
            long currentTimeMillis = System.currentTimeMillis() - this.f7658;
            long j = currentTimeMillis;
            if (currentTimeMillis >= 500) {
                Point point = this.f7657;
                int i = (int) (((float) this.f7656) - ((C1014.f6142.f1689.f7999 - 22.5f) / 45.0f));
                while (i > 7) {
                    i -= 8;
                }
                while (i < 0) {
                    i += 8;
                }
                if (C1014.f6137.f1636 != null) {
                    Point point2 = new Point(C1014.f6137.f1636.f1634, C1014.f6137.f1636.f1631);
                    if (C1014.f6137.f1636.f8642 != null) {
                        int i2 = C1014.f6137.f1636.f8642.f8690.f1662[C1014.f6137.f1636.f8642.f8690.f1663];
                        if (i2 != -1) {
                            point2.x += C0593nt.f2859[i2];
                            point2.y += C0593nt.f2858[i2];
                        }
                    }
                    c_point c_point = new c_point(point2.x, point2.y);
                    c_point c_point2 = new c_point(c_point.x, c_point.y);
                    for (int i3 = 0; i3 < 12; i3++) {
                        c_point.offset(f7653[i], f7654[i]);
                        if (C0593nt.m678((C0529lm) null, C1014.f6137.f1636.f1634, C1014.f6137.f1636.f1631, c_point.x, c_point.y, C1014.f6140.f4447 == C0645.AEGIS, C1014.f6142.f1695.f7342)) {
                            c_point2.set(c_point.x, c_point.y);
                            if (C1014.f6137.f1636.f8642 != null && C1014.f6137.f1636.f8642.f8688.x == c_point.x && C1014.f6137.f1636.f8642.f8688.y == c_point.y && C1014.f6137.f1636.f8642.f8690.f1664 - C1014.f6137.f1636.f8642.f8690.f1663 > 5) {
                                break;
                            }
                        }
                    }
                    this.f7657 = c_point2;
                }
                if (this.f7657 != null && C1014.f6137.f1636 != null && !this.f7657.equals(C1014.f6137.f1636.f1634, C1014.f6137.f1636.f1631)) {
                    if (point == null || !this.f7657.equals(point) || j >= 2000) {
                        if (C1014.f6137.f1636.f6524 != null && C1014.f6147.f51.f1449) {
                            C1302if ifVar = C1014.f6137.f1636.f6524;
                            ifVar.f6555 = this.f7657.x;
                            ifVar.f6556 = this.f7657.y;
                            C1014.f6137.f1636.f6524.f6560 = C0568mv.MOVE_CMD;
                            C2045 r0 = C1014.f6158.f674.f620;
                            C0587nn nnVar = C0587nn.HOM;
                            C0521lf lfVar = C1014.f6137;
                            r0.mo4635(nnVar);
                        }
                        if (C1014.f6137.f1636.f6538 != null && C1014.f6147.f51.f1440) {
                            C1302if ifVar2 = C1014.f6137.f1636.f6538;
                            ifVar2.f6555 = this.f7657.x;
                            ifVar2.f6556 = this.f7657.y;
                            C1014.f6137.f1636.f6538.f6560 = C0568mv.MOVE_CMD;
                            C2045 r02 = C1014.f6158.f674.f620;
                            C0587nn nnVar2 = C0587nn.MER;
                            C0521lf lfVar2 = C1014.f6137;
                            r02.mo4635(nnVar2);
                        } else if (!C1014.f6147.f51.f1449 && !C1014.f6147.f51.f1449) {
                            C1014.f6144.mo3652((C0839ue) new C1093((short) this.f7657.x, (short) this.f7657.y));
                        }
                        this.f7658 = System.currentTimeMillis();
                    }
                } else {
                    return;
                }
            }
            c_activity c_activity = C1014.f6147;
            C1745 r15 = new C1745(this);
            if (c_activity.f56 != null) {
                c_activity.f56.postDelayed(new C1348(c_activity, r15), 500);
            }
        }
    }

    /* renamed from: 鷭 */
    private final void m2344(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int actionMasked = motionEvent.getActionMasked();
        C0525li liVar = new C0525li(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            this.f7659[motionEvent.getPointerId(i)].f7673 = new C0525li(motionEvent.getX(i), motionEvent.getY(i));
        }
        switch (actionMasked) {
            case 0:
            case 5:
                this.f7659[motionEvent.getPointerId(actionIndex)].f7672 = new C0525li(liVar);
                this.f7659[motionEvent.getPointerId(actionIndex)].f7670 = System.currentTimeMillis();
                return;
            case 1:
            case 6:
                this.f7659[motionEvent.getPointerId(actionIndex)].f7671 = new C0525li(liVar);
                this.f7659[motionEvent.getPointerId(actionIndex)].f7668 = System.currentTimeMillis();
                break;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this != null) {
            try {
                if (!(C1014.f6142 == null || C1014.f6142.f1689 == null || motionEvent == null)) {
                    MotionEvent motionEvent2 = motionEvent;
                    if (motionEvent2 != null) {
                        if (!(C1014.f6137 == null || C1014.f6137.f1636 == null || C1014.f6142 == null || C1014.f6142.f1695 == null)) {
                            int actionIndex = motionEvent2.getActionIndex();
                            int actionMasked = motionEvent2.getActionMasked();
                            C0525li liVar = new C0525li(motionEvent2.getX(actionIndex), motionEvent2.getY(actionIndex));
                            if (actionMasked == 0 || actionMasked == 5) {
                                if (motionEvent2.getPointerCount() == 1) {
                                    C1677 r10 = this.f7659[motionEvent2.getPointerId(actionIndex)];
                                    if (r10.f7668 - r10.f7670 < 500 && System.currentTimeMillis() - r10.f7668 < 500) {
                                        this.f7660 = new C0525li(liVar);
                                        this.f7661 = C1676if.CONTINUOUS_MOVE;
                                        m2343();
                                    }
                                }
                                m2344(motionEvent);
                                return true;
                            }
                            if (actionMasked == 2) {
                                if (motionEvent2.getPointerCount() == 2) {
                                    if (this.f7661 == C1676if.NONE) {
                                        this.f7661 = C1676if.CAMERA;
                                    }
                                    for (int i = 0; i < motionEvent2.getPointerCount(); i++) {
                                        int i2 = i;
                                        MotionEvent motionEvent3 = motionEvent2;
                                        C0525li liVar2 = new C0525li(motionEvent3.getX(i2), motionEvent3.getY(i2));
                                        C0525li r14 = m2342(motionEvent3, i2);
                                        C0525li liVar3 = this.f7659[motionEvent3.getPointerId(i2)].f7673;
                                        if (liVar3 != null) {
                                            C0525li liVar4 = new C0525li(liVar3);
                                            C0525li liVar5 = r14;
                                            liVar4.f1649 -= liVar5.f1649;
                                            liVar4.f1648 -= liVar5.f1648;
                                            float sqrt = FloatMath.sqrt((liVar4.f1649 * liVar4.f1649) + (liVar4.f1648 * liVar4.f1648));
                                            C0525li liVar6 = new C0525li(liVar2);
                                            C0525li liVar7 = r14;
                                            liVar6.f1649 -= liVar7.f1649;
                                            liVar6.f1648 -= liVar7.f1648;
                                            float sqrt2 = FloatMath.sqrt((liVar6.f1649 * liVar6.f1649) + (liVar6.f1648 * liVar6.f1648)) - sqrt;
                                            C0525li liVar8 = new C0525li((float) getWidth(), (float) getHeight());
                                            float sqrt3 = sqrt2 / FloatMath.sqrt((liVar8.f1649 * liVar8.f1649) + (liVar8.f1648 * liVar8.f1648));
                                            C1735 r0 = C1014.f6142.f1689;
                                            r0.mo4475(r0.f7998 + ((-sqrt3) * 250.0f));
                                        }
                                        int i3 = i;
                                        MotionEvent motionEvent4 = motionEvent2;
                                        C0525li liVar9 = new C0525li(motionEvent4.getX(i3), motionEvent4.getY(i3));
                                        C0525li r142 = m2342(motionEvent4, i3);
                                        C0525li liVar10 = this.f7659[motionEvent4.getPointerId(i3)].f7673;
                                        if (liVar10 != null) {
                                            C0525li liVar11 = r142;
                                            C0525li liVar12 = liVar9;
                                            liVar9.f1649 -= liVar11.f1649;
                                            liVar12.f1648 -= liVar11.f1648;
                                            C0525li liVar13 = r142;
                                            C0525li liVar14 = liVar10;
                                            liVar10.f1649 -= liVar13.f1649;
                                            liVar14.f1648 -= liVar13.f1648;
                                            float r12 = (liVar9.mo3959() / 3.1415927f) * 180.0f;
                                            float r13 = (liVar10.mo3959() / 3.1415927f) * 180.0f;
                                            C1735 r02 = C1014.f6142.f1689;
                                            r02.mo4473(r02.f7999 + (-(r12 - r13)));
                                        }
                                    }
                                } else if (motionEvent2.getPointerCount() == 1) {
                                    if (this.f7661 == C1676if.CONTINUOUS_MOVE) {
                                        C0525li liVar15 = this.f7660;
                                        C0525li liVar16 = liVar;
                                        liVar15.f1649 = liVar16.f1649;
                                        liVar15.f1648 = liVar16.f1648;
                                    } else {
                                        MotionEvent motionEvent5 = motionEvent2;
                                        int actionIndex2 = motionEvent5.getActionIndex();
                                        C0525li liVar17 = new C0525li(motionEvent5.getX(actionIndex2), motionEvent5.getY(actionIndex2));
                                        C1677 r143 = this.f7659[motionEvent5.getPointerId(actionIndex2)];
                                        C0525li liVar18 = new C0525li((float) getWidth(), (float) getHeight());
                                        if (liVar17.f1649 < (liVar18.f1649 * 2.0f) / 5.0f || this.f7661 == C1676if.JOYSTICK_MOVE) {
                                            C0525li liVar19 = new C0525li(liVar17);
                                            C0525li liVar20 = r143.f7672;
                                            liVar19.f1649 -= liVar20.f1649;
                                            liVar19.f1648 -= liVar20.f1648;
                                            C0525li liVar21 = liVar19;
                                            C0525li liVar22 = liVar21;
                                            C0525li liVar23 = liVar21;
                                            C0525li liVar24 = liVar18;
                                            if (FloatMath.sqrt((liVar21.f1649 * liVar23.f1649) + (liVar23.f1648 * liVar23.f1648)) / FloatMath.sqrt((liVar18.f1649 * liVar24.f1649) + (liVar24.f1648 * liVar24.f1648)) > 0.05f) {
                                                float f = -((liVar22.mo3959() / 3.1415927f) * 180.0f);
                                                if (f < 0.0f) {
                                                    f += 360.0f;
                                                }
                                                int i4 = (int) (((22.5f + f) / 360.0f) * 8.0f);
                                                if (i4 < 0) {
                                                    i4 += 8;
                                                }
                                                if (i4 > 7) {
                                                    C0592ns.m674("dir=" + i4 + ">7");
                                                } else {
                                                    int i5 = this.f7656;
                                                    this.f7656 = i4;
                                                    JoystickView joystickView = (JoystickView) C1014.f6147.findViewById(R.id.joystickView);
                                                    if (joystickView == null) {
                                                        C0592ns.m674("joystick == null");
                                                    } else {
                                                        int i6 = (-f7654[this.f7656]) * 1000;
                                                        JoystickView joystickView2 = joystickView;
                                                        int min = Math.min(joystickView.getMeasuredWidth() / 2, joystickView2.getMeasuredHeight() / 2) - joystickView2.f14;
                                                        joystickView2.f17 = (double) (f7653[this.f7656] * 1000);
                                                        joystickView2.f17 = Math.max(Math.min(joystickView2.f17, (double) min), (double) (-min));
                                                        joystickView2.f16 = (double) i6;
                                                        joystickView2.f16 = Math.max(Math.min(joystickView2.f16, (double) min), (double) (-min));
                                                        joystickView2.invalidate();
                                                        if (this.f7661 != C1676if.JOYSTICK_MOVE) {
                                                            this.f7661 = C1676if.JOYSTICK_MOVE;
                                                            LayoutParams layoutParams = (LayoutParams) joystickView.getLayoutParams();
                                                            layoutParams.leftMargin = ((int) r143.f7672.f1649) - (joystickView.getMeasuredWidth() / 2);
                                                            layoutParams.topMargin = ((int) r143.f7672.f1648) - (joystickView.getMeasuredHeight() / 2);
                                                            joystickView.setLayoutParams(layoutParams);
                                                            joystickView.setVisibility(0);
                                                        } else if (this.f7656 != i5) {
                                                            if (System.currentTimeMillis() - this.f7658 < 500) {
                                                            }
                                                        }
                                                        m2340();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if ((actionMasked == 1 || actionMasked == 6) && motionEvent2.getPointerCount() == 1) {
                                switch (m2339()[this.f7661.ordinal()]) {
                                    case 1:
                                        C0525li liVar25 = new C0525li((float) getWidth(), (float) getHeight());
                                        C1677 r7 = this.f7659[motionEvent2.getPointerId(actionIndex)];
                                        C0525li liVar26 = new C0525li(liVar);
                                        C0525li liVar27 = r7.f7672;
                                        liVar26.f1649 -= liVar27.f1649;
                                        liVar26.f1648 -= liVar27.f1648;
                                        C0525li liVar28 = liVar26;
                                        C0525li liVar29 = liVar28;
                                        C0525li liVar30 = liVar28;
                                        C0525li liVar31 = liVar25;
                                        if (FloatMath.sqrt((liVar28.f1649 * liVar30.f1649) + (liVar30.f1648 * liVar30.f1648)) / FloatMath.sqrt((liVar25.f1649 * liVar31.f1649) + (liVar31.f1648 * liVar31.f1648)) >= 0.05f) {
                                            if (C1014.f6137.f1636.f8642 == null || C1014.f6147.f51.f1449 || C1014.f6147.f51.f1440) {
                                                C0525li liVar32 = new C0525li(r7.f7672.f1649 / liVar25.f1649, r7.f7672.f1648 / liVar25.f1648);
                                                C0525li liVar33 = new C0525li(liVar29.f1649 / liVar25.f1649, liVar29.f1648 / liVar25.f1648);
                                                if (((double) liVar32.f1649) >= 0.4d && ((double) liVar32.f1649) <= 0.6d && ((double) liVar32.f1648) >= 0.4d && ((double) liVar32.f1648) <= 0.6d && ((double) Math.abs(liVar33.f1648)) >= 0.25d && ((liVar29.f1649 == 0.0f || Math.abs(liVar29.f1648 / liVar29.f1649) > 3.0f) && !C1014.f6147.f51.f1449 && !C1014.f6147.f51.f1440)) {
                                                    if (liVar29.f1648 <= 0.0f) {
                                                        C1014.f6144.mo3652((C0839ue) new C1511(C1014.f6137.f1636.f1630, C0563mq.STAND));
                                                        break;
                                                    } else {
                                                        C1014.f6144.mo3652((C0839ue) new C1511(C1014.f6137.f1636.f1630, C0563mq.SIT));
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (C1014.f6142.f1680.f1190 == null) {
                                            C1014.f6142.mo3980(liVar.f1649, liVar.f1648, System.currentTimeMillis() - r7.f7670 > 400);
                                            break;
                                        } else {
                                            C1014.f6144.mo3652((C0839ue) new C0876vj(C1014.f6142.f1680.f1190.f465));
                                            break;
                                        }
                                    case 2:
                                    case 3:
                                        break;
                                    case 4:
                                        ((JoystickView) C1014.f6147.findViewById(R.id.joystickView)).setVisibility(4);
                                        if (C1014.f6140.f4490 && (C1014.f6137.f1636.f8642 == null || C1014.f6137.f1636.f8642.f8690.f1664 - C1014.f6137.f1636.f8642.f8690.f1663 > 1)) {
                                            C1014.f6144.mo3652((C0839ue) new C1864(-1));
                                        }
                                        this.f7661 = C1676if.NONE;
                                        break;
                                }
                                this.f7661 = C1676if.NONE;
                            }
                            m2344(motionEvent);
                            return true;
                        }
                    }
                    this.f7661 = null;
                    m2344(motionEvent);
                    return true;
                }
            } catch (NullPointerException unused) {
            }
        }
        return false;
    }
}

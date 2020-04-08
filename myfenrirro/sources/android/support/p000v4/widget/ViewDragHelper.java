package android.support.p000v4.widget;

import android.content.Context;
import android.support.p000v4.view.MotionEventCompat;
import android.support.p000v4.view.VelocityTrackerCompat;
import android.support.p000v4.view.ViewCompat;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.ViewDragHelper */
public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private int mActivePointerId = -1;
    private final Callback mCallback;
    private View mCapturedView;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private ScrollerCompat mScroller;
    private final Runnable mSetIdleRunnable = new Runnable() {
        public void run() {
            ViewDragHelper.this.setDragState(0);
        }
    };
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;

    /* renamed from: android.support.v4.widget.ViewDragHelper$Callback */
    public static abstract class Callback {
        public abstract boolean tryCaptureView(View view, int i);

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        }

        public void onViewCaptured(View view, int i) {
        }

        public void onViewReleased(View view, float f, float f2) {
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return 0;
        }
    }

    static {
    }

    public static ViewDragHelper create(ViewGroup viewGroup, Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    public static ViewDragHelper create(ViewGroup viewGroup, float f, Callback callback) {
        ViewDragHelper create = create(viewGroup, callback);
        create.mTouchSlop = (int) (((float) create.mTouchSlop) * (1.0f / f));
        return create;
    }

    private ViewDragHelper(Context context, ViewGroup viewGroup, Callback callback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (callback == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.mParentView = viewGroup;
            this.mCallback = callback;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.mEdgeSize = (int) ((20.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
            this.mMaxVelocity = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.mMinVelocity = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.mScroller = ScrollerCompat.create(context, sInterpolator);
        }
    }

    public void setMinVelocity(float f) {
        this.mMinVelocity = f;
    }

    public float getMinVelocity() {
        return this.mMinVelocity;
    }

    public int getViewDragState() {
        return this.mDragState;
    }

    public void setEdgeTrackingEnabled(int i) {
        this.mTrackingEdges = i;
    }

    public int getEdgeSize() {
        return this.mEdgeSize;
    }

    public void captureChildView(View view, int i) {
        if (view.getParent() != this.mParentView) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.mParentView + ")");
        }
        this.mCapturedView = view;
        this.mActivePointerId = i;
        this.mCallback.onViewCaptured(view, i);
        setDragState(1);
    }

    public View getCapturedView() {
        return this.mCapturedView;
    }

    public int getActivePointerId() {
        return this.mActivePointerId;
    }

    public int getTouchSlop() {
        return this.mTouchSlop;
    }

    public void cancel() {
        this.mActivePointerId = -1;
        clearMotionHistory();
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public void abort() {
        cancel();
        if (this.mDragState == 2) {
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            this.mScroller.abortAnimation();
            int currX2 = this.mScroller.getCurrX();
            int currY2 = this.mScroller.getCurrY();
            this.mCallback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        setDragState(0);
    }

    public boolean smoothSlideViewTo(View view, int i, int i2) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean forceSettleCapturedViewAt = forceSettleCapturedViewAt(i, i2, 0, 0);
        if (!forceSettleCapturedViewAt && this.mDragState == 0 && this.mCapturedView != null) {
            this.mCapturedView = null;
        }
        return forceSettleCapturedViewAt;
    }

    public boolean settleCapturedViewAt(int i, int i2) {
        if (this.mReleaseInProgress) {
            return forceSettleCapturedViewAt(i, i2, (int) VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, this.mActivePointerId), (int) VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, this.mActivePointerId));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    private boolean forceSettleCapturedViewAt(int i, int i2, int i3, int i4) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.mScroller.abortAnimation();
            setDragState(0);
            return false;
        }
        this.mScroller.startScroll(left, top, i5, i6, computeSettleDuration(this.mCapturedView, i5, i6, i3, i4));
        setDragState(2);
        return true;
    }

    private int computeSettleDuration(View view, int i, int i2, int i3, int i4) {
        int clampMag = clampMag(i3, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int clampMag2 = clampMag(i4, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(clampMag);
        int abs4 = Math.abs(clampMag2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        return (int) ((((float) computeAxisDuration(i, clampMag, this.mCallback.getViewHorizontalDragRange(view))) * (clampMag != 0 ? ((float) abs3) / ((float) i5) : ((float) abs) / ((float) i6))) + (((float) computeAxisDuration(i2, clampMag2, this.mCallback.getViewVerticalDragRange(view))) * (clampMag2 != 0 ? ((float) abs4) / ((float) i5) : ((float) abs2) / ((float) i6))));
    }

    private int computeAxisDuration(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.mParentView.getWidth();
        int i5 = width / 2;
        float distanceInfluenceForSnapDuration = ((float) i5) + (((float) i5) * distanceInfluenceForSnapDuration(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))));
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(distanceInfluenceForSnapDuration / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, MAX_SETTLE_DURATION);
    }

    private int clampMag(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    private float clampMag(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    private float distanceInfluenceForSnapDuration(float f) {
        return FloatMath.sin((float) (((double) (f - 0.5f)) * 0.4712389167638204d));
    }

    public void flingCapturedView(int i, int i2, int i3, int i4) {
        if (!this.mReleaseInProgress) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int) VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, this.mActivePointerId), (int) VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, this.mActivePointerId), i, i3, i2, i4);
        setDragState(2);
    }

    public boolean continueSettling(boolean z) {
        if (this.mDragState == 2) {
            boolean computeScrollOffset = this.mScroller.computeScrollOffset();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            int left = currX - this.mCapturedView.getLeft();
            int top = currY - this.mCapturedView.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.mCapturedView, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.mCapturedView, top);
            }
            if (!(left == 0 && top == 0)) {
                this.mCallback.onViewPositionChanged(this.mCapturedView, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.mScroller.getFinalX() && currY == this.mScroller.getFinalY()) {
                this.mScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.mParentView.post(this.mSetIdleRunnable);
                } else {
                    setDragState(0);
                }
            }
        }
        return this.mDragState == 2;
    }

    private void dispatchViewReleased(float f, float f2) {
        this.mReleaseInProgress = true;
        this.mCallback.onViewReleased(this.mCapturedView, f, f2);
        this.mReleaseInProgress = false;
        if (this.mDragState == 1) {
            setDragState(0);
        }
    }

    private void clearMotionHistory() {
        if (this.mInitialMotionX != null) {
            Arrays.fill(this.mInitialMotionX, 0.0f);
            Arrays.fill(this.mInitialMotionY, 0.0f);
            Arrays.fill(this.mLastMotionX, 0.0f);
            Arrays.fill(this.mLastMotionY, 0.0f);
            Arrays.fill(this.mInitialEdgesTouched, 0);
            Arrays.fill(this.mEdgeDragsInProgress, 0);
            Arrays.fill(this.mEdgeDragsLocked, 0);
            this.mPointersDown = 0;
        }
    }

    private void clearMotionHistory(int i) {
        if (this.mInitialMotionX != null) {
            this.mInitialMotionX[i] = 0.0f;
            this.mInitialMotionY[i] = 0.0f;
            this.mLastMotionX[i] = 0.0f;
            this.mLastMotionY[i] = 0.0f;
            this.mInitialEdgesTouched[i] = 0;
            this.mEdgeDragsInProgress[i] = 0;
            this.mEdgeDragsLocked[i] = 0;
            this.mPointersDown &= (1 << i) ^ -1;
        }
    }

    private void ensureMotionHistorySizeForId(int i) {
        if (this.mInitialMotionX == null || this.mInitialMotionX.length <= i) {
            float[] fArr = new float[(i + 1)];
            float[] fArr2 = new float[(i + 1)];
            float[] fArr3 = new float[(i + 1)];
            float[] fArr4 = new float[(i + 1)];
            int[] iArr = new int[(i + 1)];
            int[] iArr2 = new int[(i + 1)];
            int[] iArr3 = new int[(i + 1)];
            if (this.mInitialMotionX != null) {
                System.arraycopy(this.mInitialMotionX, 0, fArr, 0, this.mInitialMotionX.length);
                System.arraycopy(this.mInitialMotionY, 0, fArr2, 0, this.mInitialMotionY.length);
                System.arraycopy(this.mLastMotionX, 0, fArr3, 0, this.mLastMotionX.length);
                System.arraycopy(this.mLastMotionY, 0, fArr4, 0, this.mLastMotionY.length);
                System.arraycopy(this.mInitialEdgesTouched, 0, iArr, 0, this.mInitialEdgesTouched.length);
                System.arraycopy(this.mEdgeDragsInProgress, 0, iArr2, 0, this.mEdgeDragsInProgress.length);
                System.arraycopy(this.mEdgeDragsLocked, 0, iArr3, 0, this.mEdgeDragsLocked.length);
            }
            this.mInitialMotionX = fArr;
            this.mInitialMotionY = fArr2;
            this.mLastMotionX = fArr3;
            this.mLastMotionY = fArr4;
            this.mInitialEdgesTouched = iArr;
            this.mEdgeDragsInProgress = iArr2;
            this.mEdgeDragsLocked = iArr3;
        }
    }

    private void saveInitialMotion(float f, float f2, int i) {
        ensureMotionHistorySizeForId(i);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.mInitialMotionY;
        this.mLastMotionY[i] = f2;
        fArr2[i] = f2;
        this.mInitialEdgesTouched[i] = getEdgesTouched((int) f, (int) f2);
        this.mPointersDown |= 1 << i;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = MotionEventCompat.getPointerId(motionEvent, i);
            float x = MotionEventCompat.getX(motionEvent, i);
            float y = MotionEventCompat.getY(motionEvent, i);
            this.mLastMotionX[pointerId] = x;
            this.mLastMotionY[pointerId] = y;
        }
    }

    public boolean isPointerDown(int i) {
        return (this.mPointersDown & (1 << i)) != 0;
    }

    /* access modifiers changed from: 0000 */
    public void setDragState(int i) {
        this.mParentView.removeCallbacks(this.mSetIdleRunnable);
        if (this.mDragState != i) {
            this.mDragState = i;
            this.mCallback.onViewDragStateChanged(i);
            if (this.mDragState == 0) {
                this.mCapturedView = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean tryCaptureViewForDrag(View view, int i) {
        if (view == this.mCapturedView && this.mActivePointerId == i) {
            return true;
        }
        if (view == null || !this.mCallback.tryCaptureView(view, i)) {
            return false;
        }
        this.mActivePointerId = i;
        captureChildView(view, i);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View view, boolean z, int i, int i2, int i3, int i4) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i3 + scrollX >= childAt.getLeft() && i3 + scrollX < childAt.getRight() && i4 + scrollY >= childAt.getTop() && i4 + scrollY < childAt.getBottom() && canScroll(childAt, true, i, i2, (i3 + scrollX) - childAt.getLeft(), (i4 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && (ViewCompat.canScrollHorizontally(view, -i) || ViewCompat.canScrollVertically(view, -i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0165, code lost:
        if (r11 != r10) goto L_0x016d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldInterceptTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r17
            int r3 = android.support.p000v4.view.MotionEventCompat.getActionMasked(r0)
            r0 = r17
            int r4 = android.support.p000v4.view.MotionEventCompat.getActionIndex(r0)
            if (r3 != 0) goto L_0x0013
            r0 = r16
            r0.cancel()
        L_0x0013:
            r0 = r16
            android.view.VelocityTracker r0 = r0.mVelocityTracker
            if (r0 != 0) goto L_0x0021
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1 = r16
            r1.mVelocityTracker = r0
        L_0x0021:
            r0 = r16
            android.view.VelocityTracker r0 = r0.mVelocityTracker
            r1 = r17
            r0.addMovement(r1)
            switch(r3) {
                case 0: goto L_0x0042;
                case 1: goto L_0x019b;
                case 2: goto L_0x00e3;
                case 3: goto L_0x019b;
                case 4: goto L_0x01a0;
                case 5: goto L_0x008f;
                case 6: goto L_0x018f;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x01a0
        L_0x0042:
            r0 = r17
            float r3 = r0.getX()
            r0 = r17
            float r5 = r0.getY()
            r0 = r17
            r1 = 0
            int r4 = android.support.p000v4.view.MotionEventCompat.getPointerId(r0, r1)
            r0 = r16
            r0.saveInitialMotion(r3, r5, r4)
            int r0 = (int) r3
            int r1 = (int) r5
            r2 = r16
            android.view.View r6 = r2.findTopChildUnder(r0, r1)
            r0 = r16
            android.view.View r0 = r0.mCapturedView
            if (r6 != r0) goto L_0x0074
            r0 = r16
            int r0 = r0.mDragState
            r1 = 2
            if (r0 != r1) goto L_0x0074
            r0 = r16
            r0.tryCaptureViewForDrag(r6, r4)
        L_0x0074:
            r0 = r16
            int[] r0 = r0.mInitialEdgesTouched
            r7 = r0[r4]
            r0 = r16
            int r0 = r0.mTrackingEdges
            r0 = r0 & r7
            if (r0 == 0) goto L_0x01a0
            r0 = r16
            android.support.v4.widget.ViewDragHelper$Callback r0 = r0.mCallback
            r1 = r16
            int r1 = r1.mTrackingEdges
            r1 = r1 & r7
            r0.onEdgeTouched(r1, r4)
            goto L_0x01a0
        L_0x008f:
            r0 = r17
            int r3 = android.support.p000v4.view.MotionEventCompat.getPointerId(r0, r4)
            r0 = r17
            float r5 = android.support.p000v4.view.MotionEventCompat.getX(r0, r4)
            r0 = r17
            float r4 = android.support.p000v4.view.MotionEventCompat.getY(r0, r4)
            r0 = r16
            r0.saveInitialMotion(r5, r4, r3)
            r0 = r16
            int r0 = r0.mDragState
            if (r0 != 0) goto L_0x00c7
            r0 = r16
            int[] r0 = r0.mInitialEdgesTouched
            r6 = r0[r3]
            r0 = r16
            int r0 = r0.mTrackingEdges
            r0 = r0 & r6
            if (r0 == 0) goto L_0x00c5
            r0 = r16
            android.support.v4.widget.ViewDragHelper$Callback r0 = r0.mCallback
            r1 = r16
            int r1 = r1.mTrackingEdges
            r1 = r1 & r6
            r0.onEdgeTouched(r1, r3)
        L_0x00c5:
            goto L_0x01a0
        L_0x00c7:
            r0 = r16
            int r0 = r0.mDragState
            r1 = 2
            if (r0 != r1) goto L_0x01a0
            int r0 = (int) r5
            int r1 = (int) r4
            r2 = r16
            android.view.View r6 = r2.findTopChildUnder(r0, r1)
            r0 = r16
            android.view.View r0 = r0.mCapturedView
            if (r6 != r0) goto L_0x00e1
            r0 = r16
            r0.tryCaptureViewForDrag(r6, r3)
        L_0x00e1:
            goto L_0x01a0
        L_0x00e3:
            r0 = r16
            float[] r0 = r0.mInitialMotionX
            if (r0 == 0) goto L_0x01a0
            r0 = r16
            float[] r0 = r0.mInitialMotionY
            if (r0 == 0) goto L_0x01a0
            r0 = r17
            int r3 = android.support.p000v4.view.MotionEventCompat.getPointerCount(r0)
            r5 = 0
        L_0x00f6:
            if (r5 >= r3) goto L_0x0187
            r0 = r17
            int r4 = android.support.p000v4.view.MotionEventCompat.getPointerId(r0, r5)
            r0 = r17
            float r6 = android.support.p000v4.view.MotionEventCompat.getX(r0, r5)
            r0 = r17
            float r7 = android.support.p000v4.view.MotionEventCompat.getY(r0, r5)
            r0 = r16
            float[] r0 = r0.mInitialMotionX
            r0 = r0[r4]
            float r8 = r6 - r0
            r0 = r16
            float[] r0 = r0.mInitialMotionY
            r0 = r0[r4]
            float r9 = r7 - r0
            int r0 = (int) r6
            int r1 = (int) r7
            r2 = r16
            android.view.View r6 = r2.findTopChildUnder(r0, r1)
            if (r6 == 0) goto L_0x012e
            r0 = r16
            boolean r0 = r0.checkTouchSlop(r6, r8, r9)
            if (r0 == 0) goto L_0x012e
            r7 = 1
            goto L_0x012f
        L_0x012e:
            r7 = 0
        L_0x012f:
            if (r7 == 0) goto L_0x016d
            int r10 = r6.getLeft()
            int r0 = (int) r8
            int r11 = r10 + r0
            r0 = r16
            android.support.v4.widget.ViewDragHelper$Callback r0 = r0.mCallback
            int r1 = (int) r8
            int r11 = r0.clampViewPositionHorizontal(r6, r11, r1)
            int r12 = r6.getTop()
            int r0 = (int) r9
            int r13 = r12 + r0
            r0 = r16
            android.support.v4.widget.ViewDragHelper$Callback r0 = r0.mCallback
            int r1 = (int) r9
            int r13 = r0.clampViewPositionVertical(r6, r13, r1)
            r0 = r16
            android.support.v4.widget.ViewDragHelper$Callback r0 = r0.mCallback
            int r14 = r0.getViewHorizontalDragRange(r6)
            r0 = r16
            android.support.v4.widget.ViewDragHelper$Callback r0 = r0.mCallback
            int r15 = r0.getViewVerticalDragRange(r6)
            if (r14 == 0) goto L_0x0167
            if (r14 <= 0) goto L_0x016d
            if (r11 != r10) goto L_0x016d
        L_0x0167:
            if (r15 == 0) goto L_0x0187
            if (r15 <= 0) goto L_0x016d
            if (r13 == r12) goto L_0x0187
        L_0x016d:
            r0 = r16
            r0.reportNewEdgeDrags(r8, r9, r4)
            r0 = r16
            int r0 = r0.mDragState
            r1 = 1
            if (r0 == r1) goto L_0x0187
            if (r7 == 0) goto L_0x0183
            r0 = r16
            boolean r0 = r0.tryCaptureViewForDrag(r6, r4)
            if (r0 != 0) goto L_0x0187
        L_0x0183:
            int r5 = r5 + 1
            goto L_0x00f6
        L_0x0187:
            r0 = r16
            r1 = r17
            r0.saveLastMotion(r1)
            goto L_0x01a0
        L_0x018f:
            r0 = r17
            int r3 = android.support.p000v4.view.MotionEventCompat.getPointerId(r0, r4)
            r0 = r16
            r0.clearMotionHistory(r3)
            goto L_0x01a0
        L_0x019b:
            r0 = r16
            r0.cancel()
        L_0x01a0:
            r0 = r16
            int r0 = r0.mDragState
            r1 = 1
            if (r0 != r1) goto L_0x01a9
            r0 = 1
            return r0
        L_0x01a9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.widget.ViewDragHelper.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void processTouchEvent(MotionEvent motionEvent) {
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                View findTopChildUnder = findTopChildUnder((int) x, (int) y);
                saveInitialMotion(x, y, pointerId);
                tryCaptureViewForDrag(findTopChildUnder, pointerId);
                int i = this.mInitialEdgesTouched[pointerId];
                if ((this.mTrackingEdges & i) != 0) {
                    this.mCallback.onEdgeTouched(this.mTrackingEdges & i, pointerId);
                    return;
                }
                break;
            case 1:
                if (this.mDragState == 1) {
                    releaseViewForPointerUp();
                }
                cancel();
                return;
            case 2:
                if (this.mDragState == 1) {
                    int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId);
                    float x2 = MotionEventCompat.getX(motionEvent, findPointerIndex);
                    int i2 = (int) (x2 - this.mLastMotionX[this.mActivePointerId]);
                    int y2 = (int) (MotionEventCompat.getY(motionEvent, findPointerIndex) - this.mLastMotionY[this.mActivePointerId]);
                    dragTo(this.mCapturedView.getLeft() + i2, this.mCapturedView.getTop() + y2, i2, y2);
                    saveLastMotion(motionEvent);
                    return;
                }
                int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
                int i3 = 0;
                while (i3 < pointerCount) {
                    int pointerId2 = MotionEventCompat.getPointerId(motionEvent, i3);
                    float x3 = MotionEventCompat.getX(motionEvent, i3);
                    float y3 = MotionEventCompat.getY(motionEvent, i3);
                    float f = x3 - this.mInitialMotionX[pointerId2];
                    float f2 = y3 - this.mInitialMotionY[pointerId2];
                    reportNewEdgeDrags(f, f2, pointerId2);
                    if (this.mDragState != 1) {
                        View findTopChildUnder2 = findTopChildUnder((int) x3, (int) y3);
                        if (!checkTouchSlop(findTopChildUnder2, f, f2) || !tryCaptureViewForDrag(findTopChildUnder2, pointerId2)) {
                            i3++;
                        }
                    }
                    saveLastMotion(motionEvent);
                    return;
                }
                saveLastMotion(motionEvent);
                return;
            case 3:
                if (this.mDragState == 1) {
                    dispatchViewReleased(0.0f, 0.0f);
                }
                cancel();
                break;
            case 5:
                int pointerId3 = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                float x4 = MotionEventCompat.getX(motionEvent, actionIndex);
                float y4 = MotionEventCompat.getY(motionEvent, actionIndex);
                saveInitialMotion(x4, y4, pointerId3);
                if (this.mDragState == 0) {
                    tryCaptureViewForDrag(findTopChildUnder((int) x4, (int) y4), pointerId3);
                    int i4 = this.mInitialEdgesTouched[pointerId3];
                    if ((this.mTrackingEdges & i4) != 0) {
                        this.mCallback.onEdgeTouched(this.mTrackingEdges & i4, pointerId3);
                    }
                    return;
                } else if (isCapturedViewUnder((int) x4, (int) y4)) {
                    tryCaptureViewForDrag(this.mCapturedView, pointerId3);
                    return;
                }
                break;
            case 6:
                int pointerId4 = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                if (this.mDragState == 1 && pointerId4 == this.mActivePointerId) {
                    int i5 = -1;
                    int pointerCount2 = MotionEventCompat.getPointerCount(motionEvent);
                    int i6 = 0;
                    while (true) {
                        if (i6 < pointerCount2) {
                            int pointerId5 = MotionEventCompat.getPointerId(motionEvent, i6);
                            if (pointerId5 != this.mActivePointerId) {
                                if (findTopChildUnder((int) MotionEventCompat.getX(motionEvent, i6), (int) MotionEventCompat.getY(motionEvent, i6)) == this.mCapturedView && tryCaptureViewForDrag(this.mCapturedView, pointerId5)) {
                                    i5 = this.mActivePointerId;
                                }
                            }
                            i6++;
                        }
                    }
                    if (i5 == -1) {
                        releaseViewForPointerUp();
                    }
                }
                clearMotionHistory(pointerId4);
                return;
        }
    }

    private void reportNewEdgeDrags(float f, float f2, int i) {
        int i2 = 0;
        if (checkNewEdgeDrag(f, f2, i, 1)) {
            i2 = 1;
        }
        if (checkNewEdgeDrag(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (checkNewEdgeDrag(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (checkNewEdgeDrag(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.mEdgeDragsInProgress;
            iArr[i] = iArr[i] | i2;
            this.mCallback.onEdgeDragStarted(i2, i);
        }
    }

    private boolean checkNewEdgeDrag(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.mInitialEdgesTouched[i] & i2) != i2 || (this.mTrackingEdges & i2) == 0 || (this.mEdgeDragsLocked[i] & i2) == i2 || (this.mEdgeDragsInProgress[i] & i2) == i2 || (abs <= ((float) this.mTouchSlop) && abs2 <= ((float) this.mTouchSlop))) {
            return false;
        }
        if (abs >= 0.5f * abs2 || !this.mCallback.onEdgeLock(i2)) {
            return (this.mEdgeDragsInProgress[i] & i2) == 0 && abs > ((float) this.mTouchSlop);
        }
        int[] iArr = this.mEdgeDragsLocked;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    private boolean checkTouchSlop(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.mCallback.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.mCallback.getViewVerticalDragRange(view) > 0;
        if (z && z2) {
            return (f * f) + (f2 * f2) > ((float) (this.mTouchSlop * this.mTouchSlop));
        }
        if (z) {
            return Math.abs(f) > ((float) this.mTouchSlop);
        }
        if (z2) {
            return Math.abs(f2) > ((float) this.mTouchSlop);
        }
        return false;
    }

    public boolean checkTouchSlop(int i) {
        int length = this.mInitialMotionX.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (checkTouchSlop(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int i, int i2) {
        if (!isPointerDown(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.mLastMotionX[i2] - this.mInitialMotionX[i2];
        float f2 = this.mLastMotionY[i2] - this.mInitialMotionY[i2];
        if (z && z2) {
            return (f * f) + (f2 * f2) > ((float) (this.mTouchSlop * this.mTouchSlop));
        }
        if (z) {
            return Math.abs(f) > ((float) this.mTouchSlop);
        }
        if (z2) {
            return Math.abs(f2) > ((float) this.mTouchSlop);
        }
        return false;
    }

    public boolean isEdgeTouched(int i) {
        int length = this.mInitialEdgesTouched.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (isEdgeTouched(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEdgeTouched(int i, int i2) {
        return isPointerDown(i2) && (this.mInitialEdgesTouched[i2] & i) != 0;
    }

    private void releaseViewForPointerUp() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        dispatchViewReleased(clampMag(VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }

    private void dragTo(int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        if (i3 != 0) {
            i5 = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, i, i3);
            ViewCompat.offsetLeftAndRight(this.mCapturedView, i5 - left);
        }
        if (i4 != 0) {
            i6 = this.mCallback.clampViewPositionVertical(this.mCapturedView, i2, i4);
            ViewCompat.offsetTopAndBottom(this.mCapturedView, i6 - top);
        }
        if (i3 != 0 || i4 != 0) {
            this.mCallback.onViewPositionChanged(this.mCapturedView, i5, i6, i5 - left, i6 - top);
        }
    }

    public boolean isCapturedViewUnder(int i, int i2) {
        return isViewUnder(this.mCapturedView, i, i2);
    }

    public boolean isViewUnder(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        return i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public View findTopChildUnder(int i, int i2) {
        for (int childCount = this.mParentView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private int getEdgesTouched(int i, int i2) {
        int i3 = 0;
        if (i < this.mParentView.getLeft() + this.mEdgeSize) {
            i3 = 1;
        }
        if (i2 < this.mParentView.getTop() + this.mEdgeSize) {
            i3 |= 4;
        }
        if (i > this.mParentView.getRight() - this.mEdgeSize) {
            i3 |= 2;
        }
        if (i2 > this.mParentView.getBottom() - this.mEdgeSize) {
            return i3 | 8;
        }
        return i3;
    }
}

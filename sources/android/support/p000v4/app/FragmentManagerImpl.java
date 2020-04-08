package android.support.p000v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p000v4.app.BackStackRecord.TransitionState;
import android.support.p000v4.app.Fragment.SavedState;
import android.support.p000v4.app.FragmentManager.BackStackEntry;
import android.support.p000v4.app.FragmentManager.OnBackStackChangedListener;
import android.support.p000v4.util.DebugUtils;
import android.support.p000v4.util.LogWriter;
import android.support.p000v4.view.LayoutInflaterFactory;
import android.support.p000v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: android.support.v4.app.FragmentManagerImpl */
final class FragmentManagerImpl extends FragmentManager implements LayoutInflaterFactory {
    static final Interpolator ACCELERATE_CUBIC = new AccelerateInterpolator(1.5f);
    static final Interpolator ACCELERATE_QUINT = new AccelerateInterpolator(2.5f);
    static final int ANIM_DUR = 220;
    public static final int ANIM_STYLE_CLOSE_ENTER = 3;
    public static final int ANIM_STYLE_CLOSE_EXIT = 4;
    public static final int ANIM_STYLE_FADE_ENTER = 5;
    public static final int ANIM_STYLE_FADE_EXIT = 6;
    public static final int ANIM_STYLE_OPEN_ENTER = 1;
    public static final int ANIM_STYLE_OPEN_EXIT = 2;
    static boolean DEBUG = HONEYCOMB;
    static final Interpolator DECELERATE_CUBIC = new DecelerateInterpolator(1.5f);
    static final Interpolator DECELERATE_QUINT = new DecelerateInterpolator(2.5f);
    static final boolean HONEYCOMB = (VERSION.SDK_INT >= 11 ? true : HONEYCOMB);
    static final String TAG = "FragmentManager";
    static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    static final String TARGET_STATE_TAG = "android:target_state";
    static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    static final String VIEW_STATE_TAG = "android:view_state";
    static Field sAnimationListenerField = null;
    ArrayList<Fragment> mActive;
    ArrayList<Fragment> mAdded;
    ArrayList<Integer> mAvailBackStackIndices;
    ArrayList<Integer> mAvailIndices;
    ArrayList<BackStackRecord> mBackStack;
    ArrayList<OnBackStackChangedListener> mBackStackChangeListeners;
    ArrayList<BackStackRecord> mBackStackIndices;
    FragmentContainer mContainer;
    FragmentController mController;
    ArrayList<Fragment> mCreatedMenus;
    int mCurState = 0;
    boolean mDestroyed;
    Runnable mExecCommit = new Runnable() {
        public void run() {
            FragmentManagerImpl.this.execPendingActions();
        }
    };
    boolean mExecutingActions;
    boolean mHavePendingDeferredStart;
    FragmentHostCallback mHost;
    boolean mNeedMenuInvalidate;
    String mNoTransactionsBecause;
    Fragment mParent;
    ArrayList<Runnable> mPendingActions;
    SparseArray<Parcelable> mStateArray = null;
    Bundle mStateBundle = null;
    boolean mStateSaved;
    Runnable[] mTmpActions;

    /* renamed from: android.support.v4.app.FragmentManagerImpl$AnimateOnHWLayerIfNeededListener */
    static class AnimateOnHWLayerIfNeededListener implements AnimationListener {
        private AnimationListener mOrignalListener = null;
        private boolean mShouldRunOnHWLayer = FragmentManagerImpl.HONEYCOMB;
        /* access modifiers changed from: private */
        public View mView = null;

        public AnimateOnHWLayerIfNeededListener(View view, Animation animation) {
            if (view != null && animation != null) {
                this.mView = view;
            }
        }

        public AnimateOnHWLayerIfNeededListener(View view, Animation animation, AnimationListener animationListener) {
            if (view != null && animation != null) {
                this.mOrignalListener = animationListener;
                this.mView = view;
            }
        }

        public void onAnimationStart(Animation animation) {
            if (this.mView != null) {
                this.mShouldRunOnHWLayer = FragmentManagerImpl.shouldRunOnHWLayer(this.mView, animation);
                if (this.mShouldRunOnHWLayer) {
                    this.mView.post(new Runnable() {
                        public void run() {
                            ViewCompat.setLayerType(AnimateOnHWLayerIfNeededListener.this.mView, 2, null);
                        }
                    });
                }
            }
            if (this.mOrignalListener != null) {
                this.mOrignalListener.onAnimationStart(animation);
            }
        }

        public void onAnimationEnd(Animation animation) {
            if (this.mView != null && this.mShouldRunOnHWLayer) {
                this.mView.post(new Runnable() {
                    public void run() {
                        ViewCompat.setLayerType(AnimateOnHWLayerIfNeededListener.this.mView, 0, null);
                    }
                });
            }
            if (this.mOrignalListener != null) {
                this.mOrignalListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.mOrignalListener != null) {
                this.mOrignalListener.onAnimationRepeat(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.FragmentManagerImpl$FragmentTag */
    static class FragmentTag {
        public static final int[] Fragment = {16842755, 16842960, 16842961};
        public static final int Fragment_id = 1;
        public static final int Fragment_name = 0;
        public static final int Fragment_tag = 2;

        FragmentTag() {
        }

        static {
        }
    }

    FragmentManagerImpl() {
    }

    static {
    }

    static boolean modifiesAlpha(Animation animation) {
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (animation instanceof AnimationSet) {
            List animations = ((AnimationSet) animation).getAnimations();
            for (int i = 0; i < animations.size(); i++) {
                if (animations.get(i) instanceof AlphaAnimation) {
                    return true;
                }
            }
        }
        return HONEYCOMB;
    }

    static boolean shouldRunOnHWLayer(View view, Animation animation) {
        if (VERSION.SDK_INT < 19 || ViewCompat.getLayerType(view) != 0 || !ViewCompat.hasOverlappingRendering(view) || !modifiesAlpha(animation)) {
            return HONEYCOMB;
        }
        return true;
    }

    private void throwException(RuntimeException runtimeException) {
        Log.e(TAG, runtimeException.getMessage());
        Log.e(TAG, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter(TAG));
        if (this.mHost != null) {
            try {
                this.mHost.onDump("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e(TAG, "Failed dumping state", e);
            }
        } else {
            try {
                dump("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e(TAG, "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    public final FragmentTransaction beginTransaction() {
        return new BackStackRecord(this);
    }

    public final boolean executePendingTransactions() {
        return execPendingActions();
    }

    public final void popBackStack() {
        enqueueAction(new Runnable() {
            public void run() {
                FragmentManagerImpl.this.popBackStackState(FragmentManagerImpl.this.mHost.getHandler(), null, -1, 0);
            }
        }, HONEYCOMB);
    }

    public final boolean popBackStackImmediate() {
        checkStateLoss();
        executePendingTransactions();
        return popBackStackState(this.mHost.getHandler(), null, -1, 0);
    }

    public final void popBackStack(final String str, final int i) {
        enqueueAction(new Runnable() {
            public void run() {
                FragmentManagerImpl.this.popBackStackState(FragmentManagerImpl.this.mHost.getHandler(), str, -1, i);
            }
        }, HONEYCOMB);
    }

    public final boolean popBackStackImmediate(String str, int i) {
        checkStateLoss();
        executePendingTransactions();
        return popBackStackState(this.mHost.getHandler(), str, -1, i);
    }

    public final void popBackStack(final int i, final int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        enqueueAction(new Runnable() {
            public void run() {
                FragmentManagerImpl.this.popBackStackState(FragmentManagerImpl.this.mHost.getHandler(), null, i, i2);
            }
        }, HONEYCOMB);
    }

    public final boolean popBackStackImmediate(int i, int i2) {
        checkStateLoss();
        executePendingTransactions();
        if (i >= 0) {
            return popBackStackState(this.mHost.getHandler(), null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    public final int getBackStackEntryCount() {
        if (this.mBackStack != null) {
            return this.mBackStack.size();
        }
        return 0;
    }

    public final BackStackEntry getBackStackEntryAt(int i) {
        return (BackStackEntry) this.mBackStack.get(i);
    }

    public final void addOnBackStackChangedListener(OnBackStackChangedListener onBackStackChangedListener) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new ArrayList<>();
        }
        this.mBackStackChangeListeners.add(onBackStackChangedListener);
    }

    public final void removeOnBackStackChangedListener(OnBackStackChangedListener onBackStackChangedListener) {
        if (this.mBackStackChangeListeners != null) {
            this.mBackStackChangeListeners.remove(onBackStackChangedListener);
        }
    }

    public final void putFragment(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mIndex < 0) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.mIndex);
    }

    public final Fragment getFragment(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.mActive.size()) {
            throwException(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        Fragment fragment = (Fragment) this.mActive.get(i);
        if (fragment == null) {
            throwException(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        return fragment;
    }

    public final List<Fragment> getFragments() {
        return this.mActive;
    }

    public final SavedState saveFragmentInstanceState(Fragment fragment) {
        if (fragment.mIndex < 0) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.mState <= 0) {
            return null;
        }
        Bundle saveFragmentBasicState = saveFragmentBasicState(fragment);
        if (saveFragmentBasicState != null) {
            return new SavedState(saveFragmentBasicState);
        }
        return null;
    }

    public final boolean isDestroyed() {
        return this.mDestroyed;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.mParent != null) {
            DebugUtils.buildShortClassTag(this.mParent, sb);
        } else {
            DebugUtils.buildShortClassTag(this.mHost, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (this.mActive != null) {
            int size = this.mActive.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (int i = 0; i < size; i++) {
                    Fragment fragment = (Fragment) this.mActive.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment);
                    if (fragment != null) {
                        fragment.dump(str2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        if (this.mAdded != null) {
            int size2 = this.mAdded.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (int i2 = 0; i2 < size2; i2++) {
                    Fragment fragment2 = (Fragment) this.mAdded.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(fragment2.toString());
                }
            }
        }
        if (this.mCreatedMenus != null) {
            int size3 = this.mCreatedMenus.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i3 = 0; i3 < size3; i3++) {
                    Fragment fragment3 = (Fragment) this.mCreatedMenus.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(fragment3.toString());
                }
            }
        }
        if (this.mBackStack != null) {
            int size4 = this.mBackStack.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i4 = 0; i4 < size4; i4++) {
                    BackStackRecord backStackRecord = (BackStackRecord) this.mBackStack.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(backStackRecord.toString());
                    backStackRecord.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.mBackStackIndices != null) {
                int size5 = this.mBackStackIndices.size();
                if (size5 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i5 = 0; i5 < size5; i5++) {
                        BackStackRecord backStackRecord2 = (BackStackRecord) this.mBackStackIndices.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(backStackRecord2);
                    }
                }
            }
            if (this.mAvailBackStackIndices != null && this.mAvailBackStackIndices.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.mAvailBackStackIndices.toArray()));
            }
            if (this.mPendingActions != null) {
                int size6 = this.mPendingActions.size();
                if (size6 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size6; i6++) {
                        Runnable runnable = (Runnable) this.mPendingActions.get(i6);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
                        printWriter.print(": ");
                        printWriter.println(runnable);
                    }
                }
            }
            printWriter.print(str);
            printWriter.println("FragmentManager misc state:");
            printWriter.print(str);
            printWriter.print("  mHost=");
            printWriter.println(this.mHost);
            printWriter.print(str);
            printWriter.print("  mContainer=");
            printWriter.println(this.mContainer);
            if (this.mParent != null) {
                printWriter.print(str);
                printWriter.print("  mParent=");
                printWriter.println(this.mParent);
            }
            printWriter.print(str);
            printWriter.print("  mCurState=");
            printWriter.print(this.mCurState);
            printWriter.print(" mStateSaved=");
            printWriter.print(this.mStateSaved);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.mDestroyed);
            if (this.mNeedMenuInvalidate) {
                printWriter.print(str);
                printWriter.print("  mNeedMenuInvalidate=");
                printWriter.println(this.mNeedMenuInvalidate);
            }
            if (this.mNoTransactionsBecause != null) {
                printWriter.print(str);
                printWriter.print("  mNoTransactionsBecause=");
                printWriter.println(this.mNoTransactionsBecause);
            }
            if (this.mAvailIndices != null && this.mAvailIndices.size() > 0) {
                printWriter.print(str);
                printWriter.print("  mAvailIndices: ");
                printWriter.println(Arrays.toString(this.mAvailIndices.toArray()));
            }
        }
    }

    static Animation makeOpenCloseAnimation(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(HONEYCOMB);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        ScaleAnimation scaleAnimation2 = scaleAnimation;
        scaleAnimation.setInterpolator(DECELERATE_QUINT);
        scaleAnimation2.setDuration(220);
        animationSet.addAnimation(scaleAnimation2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(DECELERATE_CUBIC);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    static Animation makeFadeAnimation(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(DECELERATE_CUBIC);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    /* access modifiers changed from: 0000 */
    public final Animation loadAnimation(Fragment fragment, int i, boolean z, int i2) {
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, fragment.mNextAnim);
        if (onCreateAnimation != null) {
            return onCreateAnimation;
        }
        if (fragment.mNextAnim != 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.mHost.getContext(), fragment.mNextAnim);
            if (loadAnimation != null) {
                return loadAnimation;
            }
        }
        if (i == 0) {
            return null;
        }
        int transitToStyleIndex = transitToStyleIndex(i, z);
        if (transitToStyleIndex < 0) {
            return null;
        }
        switch (transitToStyleIndex) {
            case 1:
                return makeOpenCloseAnimation(this.mHost.getContext(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return makeOpenCloseAnimation(this.mHost.getContext(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return makeOpenCloseAnimation(this.mHost.getContext(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return makeOpenCloseAnimation(this.mHost.getContext(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return makeFadeAnimation(this.mHost.getContext(), 0.0f, 1.0f);
            case 6:
                return makeFadeAnimation(this.mHost.getContext(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.mHost.onHasWindowAnimations()) {
                    i2 = this.mHost.onGetWindowAnimations();
                }
                if (i2 == 0) {
                    return null;
                }
                return null;
        }
    }

    public final void performPendingDeferredStart(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
            } else {
                fragment.mDeferStart = HONEYCOMB;
                moveToState(fragment, this.mCurState, 0, 0, HONEYCOMB);
            }
        }
    }

    private void setHWLayerAnimListenerIfAlpha(View view, Animation animation) {
        if (!(view == null || animation == null || !shouldRunOnHWLayer(view, animation))) {
            AnimationListener animationListener = null;
            try {
                if (sAnimationListenerField == null) {
                    Field declaredField = Animation.class.getDeclaredField("mListener");
                    sAnimationListenerField = declaredField;
                    declaredField.setAccessible(true);
                }
                animationListener = (AnimationListener) sAnimationListenerField.get(animation);
            } catch (NoSuchFieldException e) {
                Log.e(TAG, "No field with the name mListener is found in Animation class", e);
            } catch (IllegalAccessException e2) {
                Log.e(TAG, "Cannot access Animation's mListener field", e2);
            }
            animation.setAnimationListener(new AnimateOnHWLayerIfNeededListener(view, animation, animationListener));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x020d, code lost:
        r8.mInnerView = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0210, code lost:
        r8.performActivityCreated(r8.mSavedFragmentState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0217, code lost:
        if (r8.mView == null) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0219, code lost:
        r8.restoreViewState(r8.mSavedFragmentState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x021e, code lost:
        r8.mSavedFragmentState = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0222, code lost:
        if (r9 <= 3) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0226, code lost:
        if (DEBUG == false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0228, code lost:
        new java.lang.StringBuilder("moveto STARTED: ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0232, code lost:
        r8.performStart();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0236, code lost:
        if (r9 <= 4) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x023a, code lost:
        if (DEBUG == false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x023c, code lost:
        new java.lang.StringBuilder("moveto RESUMED: ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0246, code lost:
        r8.performResume();
        r8.mSavedFragmentState = null;
        r8.mSavedViewState = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x027f, code lost:
        if (r9 >= 4) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0283, code lost:
        if (DEBUG == false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0285, code lost:
        new java.lang.StringBuilder("movefrom STARTED: ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x028f, code lost:
        r8.performStop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0293, code lost:
        if (r9 >= 3) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0297, code lost:
        if (DEBUG == false) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0299, code lost:
        new java.lang.StringBuilder("movefrom STOPPED: ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02a3, code lost:
        r8.performReallyStop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02a7, code lost:
        if (r9 >= 2) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ab, code lost:
        if (DEBUG == false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ad, code lost:
        new java.lang.StringBuilder("movefrom ACTIVITY_CREATED: ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02b9, code lost:
        if (r8.mView == null) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02c1, code lost:
        if (r7.mHost.onShouldSaveFragmentState(r8) == false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02c5, code lost:
        if (r8.mSavedViewState != null) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02c7, code lost:
        saveFragmentViewState(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ca, code lost:
        r8.performDestroyView();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02cf, code lost:
        if (r8.mView == null) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02d3, code lost:
        if (r8.mContainer == null) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02d5, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02d8, code lost:
        if (r7.mCurState <= 0) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02dc, code lost:
        if (r7.mDestroyed != false) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02de, code lost:
        r6 = loadAnimation(r8, r10, HONEYCOMB, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02e3, code lost:
        if (r6 == null) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02e5, code lost:
        r10 = r8;
        r8.mAnimatingAway = r8.mView;
        r8.mStateAfterAnimating = r9;
        r6.setAnimationListener(new android.support.p000v4.app.FragmentManagerImpl.C00175(r7, r8.mView, r6));
        r8.mView.startAnimation(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02fb, code lost:
        r8.mContainer.removeView(r8.mView);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0302, code lost:
        r8.mContainer = null;
        r8.mView = null;
        r8.mInnerView = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x030b, code lost:
        if (r9 > 0) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x030f, code lost:
        if (r7.mDestroyed == false) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0313, code lost:
        if (r8.mAnimatingAway == null) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0315, code lost:
        r6 = r8.mAnimatingAway;
        r8.mAnimatingAway = null;
        r6.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x031f, code lost:
        if (r8.mAnimatingAway == null) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0321, code lost:
        r8.mStateAfterAnimating = r9;
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0328, code lost:
        if (DEBUG == false) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x032a, code lost:
        new java.lang.StringBuilder("movefrom CREATED: ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0336, code lost:
        if (r8.mRetaining != false) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0338, code lost:
        r8.performDestroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x033c, code lost:
        r8.mState = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x033f, code lost:
        r8.mCalled = HONEYCOMB;
        r8.onDetach();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0347, code lost:
        if (r8.mCalled != false) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0363, code lost:
        throw new android.support.p000v4.app.SuperNotCalledException("Fragment " + r8 + " did not call through to super.onDetach()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0364, code lost:
        if (r12 != false) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0368, code lost:
        if (r8.mRetaining != false) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x036a, code lost:
        makeInactive(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x036e, code lost:
        r8.mHost = null;
        r8.mParentFragment = null;
        r8.mFragmentManager = null;
        r8.mChildFragmentManager = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
        if (r9 <= 1) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0154, code lost:
        if (DEBUG == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0156, code lost:
        new java.lang.StringBuilder("moveto ACTIVITY_CREATED: ").append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0162, code lost:
        if (r8.mFromLayout != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0164, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0167, code lost:
        if (r8.mContainerId == 0) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0169, code lost:
        r6 = (android.view.ViewGroup) r7.mContainer.onFindViewById(r8.mContainerId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0174, code lost:
        if (r6 != null) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0178, code lost:
        if (r8.mRestored != false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017a, code lost:
        throwException(new java.lang.IllegalArgumentException("No view found for id 0x" + java.lang.Integer.toHexString(r8.mContainerId) + " (" + r8.getResources().getResourceName(r8.mContainerId) + ") for fragment " + r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b5, code lost:
        r8.mContainer = r6;
        r8.mView = r8.performCreateView(r8.getLayoutInflater(r8.mSavedFragmentState), r6, r8.mSavedFragmentState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c7, code lost:
        if (r8.mView == null) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c9, code lost:
        r8.mInnerView = r8.mView;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d1, code lost:
        if (android.os.Build.VERSION.SDK_INT < 11) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d3, code lost:
        android.support.p000v4.view.ViewCompat.setSaveFromParentEnabled(r8.mView, HONEYCOMB);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01da, code lost:
        r8.mView = android.support.p000v4.app.NoSaveStateFrameLayout.wrap(r8.mView);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e2, code lost:
        if (r6 == null) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e4, code lost:
        r10 = loadAnimation(r8, r10, true, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e9, code lost:
        if (r10 == null) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01eb, code lost:
        setHWLayerAnimListenerIfAlpha(r8.mView, r10);
        r8.mView.startAnimation(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f5, code lost:
        r6.addView(r8.mView);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01fc, code lost:
        if (r8.mHidden == false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fe, code lost:
        r8.mView.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0205, code lost:
        r8.onViewCreated(r8.mView, r8.mSavedFragmentState);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void moveToState(android.support.p000v4.app.Fragment r8, int r9, int r10, int r11, boolean r12) {
        /*
            r7 = this;
            boolean r0 = r8.mAdded
            if (r0 == 0) goto L_0x0008
            boolean r0 = r8.mDetached
            if (r0 == 0) goto L_0x000c
        L_0x0008:
            r0 = 1
            if (r9 <= r0) goto L_0x000c
            r9 = 1
        L_0x000c:
            boolean r0 = r8.mRemoving
            if (r0 == 0) goto L_0x0016
            int r0 = r8.mState
            if (r9 <= r0) goto L_0x0016
            int r9 = r8.mState
        L_0x0016:
            boolean r0 = r8.mDeferStart
            if (r0 == 0) goto L_0x0023
            int r0 = r8.mState
            r1 = 4
            if (r0 >= r1) goto L_0x0023
            r0 = 3
            if (r9 <= r0) goto L_0x0023
            r9 = 3
        L_0x0023:
            int r0 = r8.mState
            if (r0 >= r9) goto L_0x0251
            boolean r0 = r8.mFromLayout
            if (r0 == 0) goto L_0x0030
            boolean r0 = r8.mInLayout
            if (r0 != 0) goto L_0x0030
            return
        L_0x0030:
            android.view.View r0 = r8.mAnimatingAway
            if (r0 == 0) goto L_0x0041
            r0 = 0
            r8.mAnimatingAway = r0
            r0 = r7
            r1 = r8
            int r2 = r1.mStateAfterAnimating
            r3 = 0
            r4 = 0
            r5 = 1
            r0.moveToState(r1, r2, r3, r4, r5)
        L_0x0041:
            int r0 = r8.mState
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x014f;
                case 2: goto L_0x0221;
                case 3: goto L_0x0221;
                case 4: goto L_0x0235;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x024f
        L_0x0056:
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x0064
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveto CREATED: "
            r0.<init>(r1)
            r0.append(r8)
        L_0x0064:
            android.os.Bundle r0 = r8.mSavedFragmentState
            if (r0 == 0) goto L_0x00b0
            android.os.Bundle r0 = r8.mSavedFragmentState
            android.support.v4.app.FragmentHostCallback r1 = r7.mHost
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r8.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r8.mSavedViewState = r0
            android.os.Bundle r0 = r8.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.Fragment r0 = r7.getFragment(r0, r1)
            r8.mTarget = r0
            android.support.v4.app.Fragment r0 = r8.mTarget
            if (r0 == 0) goto L_0x009a
            android.os.Bundle r0 = r8.mSavedFragmentState
            java.lang.String r1 = "android:target_req_state"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            r8.mTargetRequestCode = r0
        L_0x009a:
            android.os.Bundle r0 = r8.mSavedFragmentState
            java.lang.String r1 = "android:user_visible_hint"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            r8.mUserVisibleHint = r0
            boolean r0 = r8.mUserVisibleHint
            if (r0 != 0) goto L_0x00b0
            r0 = 1
            r8.mDeferStart = r0
            r0 = 3
            if (r9 <= r0) goto L_0x00b0
            r9 = 3
        L_0x00b0:
            android.support.v4.app.FragmentHostCallback r0 = r7.mHost
            r8.mHost = r0
            android.support.v4.app.Fragment r0 = r7.mParent
            r8.mParentFragment = r0
            android.support.v4.app.Fragment r0 = r7.mParent
            if (r0 == 0) goto L_0x00c1
            android.support.v4.app.Fragment r0 = r7.mParent
            android.support.v4.app.FragmentManagerImpl r0 = r0.mChildFragmentManager
            goto L_0x00c7
        L_0x00c1:
            android.support.v4.app.FragmentHostCallback r0 = r7.mHost
            android.support.v4.app.FragmentManagerImpl r0 = r0.getFragmentManagerImpl()
        L_0x00c7:
            r8.mFragmentManager = r0
            r0 = 0
            r8.mCalled = r0
            android.support.v4.app.FragmentHostCallback r0 = r7.mHost
            android.content.Context r0 = r0.getContext()
            r8.onAttach(r0)
            boolean r0 = r8.mCalled
            if (r0 != 0) goto L_0x00f4
            android.support.v4.app.SuperNotCalledException r0 = new android.support.v4.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f4:
            android.support.v4.app.Fragment r0 = r8.mParentFragment
            if (r0 != 0) goto L_0x00fd
            android.support.v4.app.FragmentHostCallback r0 = r7.mHost
            r0.onAttachFragment(r8)
        L_0x00fd:
            boolean r0 = r8.mRetaining
            if (r0 != 0) goto L_0x0106
            android.os.Bundle r0 = r8.mSavedFragmentState
            r8.performCreate(r0)
        L_0x0106:
            r0 = 0
            r8.mRetaining = r0
            boolean r0 = r8.mFromLayout
            if (r0 == 0) goto L_0x014f
            android.os.Bundle r0 = r8.mSavedFragmentState
            android.view.LayoutInflater r0 = r8.getLayoutInflater(r0)
            android.os.Bundle r1 = r8.mSavedFragmentState
            r2 = 0
            android.view.View r0 = r8.performCreateView(r0, r2, r1)
            r8.mView = r0
            android.view.View r0 = r8.mView
            if (r0 == 0) goto L_0x014c
            android.view.View r0 = r8.mView
            r8.mInnerView = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 11
            if (r0 < r1) goto L_0x0131
            android.view.View r0 = r8.mView
            r1 = 0
            android.support.p000v4.view.ViewCompat.setSaveFromParentEnabled(r0, r1)
            goto L_0x0139
        L_0x0131:
            android.view.View r0 = r8.mView
            android.view.ViewGroup r0 = android.support.p000v4.app.NoSaveStateFrameLayout.wrap(r0)
            r8.mView = r0
        L_0x0139:
            boolean r0 = r8.mHidden
            if (r0 == 0) goto L_0x0144
            android.view.View r0 = r8.mView
            r1 = 8
            r0.setVisibility(r1)
        L_0x0144:
            android.view.View r0 = r8.mView
            android.os.Bundle r1 = r8.mSavedFragmentState
            r8.onViewCreated(r0, r1)
            goto L_0x014f
        L_0x014c:
            r0 = 0
            r8.mInnerView = r0
        L_0x014f:
            r0 = 1
            if (r9 <= r0) goto L_0x0221
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x0160
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.<init>(r1)
            r0.append(r8)
        L_0x0160:
            boolean r0 = r8.mFromLayout
            if (r0 != 0) goto L_0x0210
            r6 = 0
            int r0 = r8.mContainerId
            if (r0 == 0) goto L_0x01b5
            android.support.v4.app.FragmentContainer r0 = r7.mContainer
            int r1 = r8.mContainerId
            android.view.View r0 = r0.onFindViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6 = r0
            if (r6 != 0) goto L_0x01b5
            boolean r0 = r8.mRestored
            if (r0 != 0) goto L_0x01b5
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No view found for id 0x"
            r1.<init>(r2)
            int r2 = r8.mContainerId
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " ("
            java.lang.StringBuilder r1 = r1.append(r2)
            android.content.res.Resources r2 = r8.getResources()
            int r3 = r8.mContainerId
            java.lang.String r2 = r2.getResourceName(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ") for fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r7.throwException(r0)
        L_0x01b5:
            r8.mContainer = r6
            android.os.Bundle r0 = r8.mSavedFragmentState
            android.view.LayoutInflater r0 = r8.getLayoutInflater(r0)
            android.os.Bundle r1 = r8.mSavedFragmentState
            android.view.View r0 = r8.performCreateView(r0, r6, r1)
            r8.mView = r0
            android.view.View r0 = r8.mView
            if (r0 == 0) goto L_0x020d
            android.view.View r0 = r8.mView
            r8.mInnerView = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 11
            if (r0 < r1) goto L_0x01da
            android.view.View r0 = r8.mView
            r1 = 0
            android.support.p000v4.view.ViewCompat.setSaveFromParentEnabled(r0, r1)
            goto L_0x01e2
        L_0x01da:
            android.view.View r0 = r8.mView
            android.view.ViewGroup r0 = android.support.p000v4.app.NoSaveStateFrameLayout.wrap(r0)
            r8.mView = r0
        L_0x01e2:
            if (r6 == 0) goto L_0x01fa
            r0 = 1
            android.view.animation.Animation r10 = r7.loadAnimation(r8, r10, r0, r11)
            if (r10 == 0) goto L_0x01f5
            android.view.View r0 = r8.mView
            r7.setHWLayerAnimListenerIfAlpha(r0, r10)
            android.view.View r0 = r8.mView
            r0.startAnimation(r10)
        L_0x01f5:
            android.view.View r0 = r8.mView
            r6.addView(r0)
        L_0x01fa:
            boolean r0 = r8.mHidden
            if (r0 == 0) goto L_0x0205
            android.view.View r0 = r8.mView
            r1 = 8
            r0.setVisibility(r1)
        L_0x0205:
            android.view.View r0 = r8.mView
            android.os.Bundle r1 = r8.mSavedFragmentState
            r8.onViewCreated(r0, r1)
            goto L_0x0210
        L_0x020d:
            r0 = 0
            r8.mInnerView = r0
        L_0x0210:
            android.os.Bundle r0 = r8.mSavedFragmentState
            r8.performActivityCreated(r0)
            android.view.View r0 = r8.mView
            if (r0 == 0) goto L_0x021e
            android.os.Bundle r0 = r8.mSavedFragmentState
            r8.restoreViewState(r0)
        L_0x021e:
            r0 = 0
            r8.mSavedFragmentState = r0
        L_0x0221:
            r0 = 3
            if (r9 <= r0) goto L_0x0235
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x0232
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveto STARTED: "
            r0.<init>(r1)
            r0.append(r8)
        L_0x0232:
            r8.performStart()
        L_0x0235:
            r0 = 4
            if (r9 <= r0) goto L_0x024f
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x0246
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveto RESUMED: "
            r0.<init>(r1)
            r0.append(r8)
        L_0x0246:
            r8.performResume()
            r0 = 0
            r8.mSavedFragmentState = r0
            r0 = 0
            r8.mSavedViewState = r0
        L_0x024f:
            goto L_0x037a
        L_0x0251:
            int r0 = r8.mState
            if (r0 <= r9) goto L_0x037a
            int r0 = r8.mState
            switch(r0) {
                case 1: goto L_0x030b;
                case 2: goto L_0x02a6;
                case 3: goto L_0x0292;
                case 4: goto L_0x027e;
                case 5: goto L_0x026a;
                default: goto L_0x025a;
            }
        L_0x025a:
            goto L_0x037a
        L_0x026a:
            r0 = 5
            if (r9 >= r0) goto L_0x027e
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x027b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "movefrom RESUMED: "
            r0.<init>(r1)
            r0.append(r8)
        L_0x027b:
            r8.performPause()
        L_0x027e:
            r0 = 4
            if (r9 >= r0) goto L_0x0292
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x028f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "movefrom STARTED: "
            r0.<init>(r1)
            r0.append(r8)
        L_0x028f:
            r8.performStop()
        L_0x0292:
            r0 = 3
            if (r9 >= r0) goto L_0x02a6
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x02a3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "movefrom STOPPED: "
            r0.<init>(r1)
            r0.append(r8)
        L_0x02a3:
            r8.performReallyStop()
        L_0x02a6:
            r0 = 2
            if (r9 >= r0) goto L_0x030b
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x02b7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "movefrom ACTIVITY_CREATED: "
            r0.<init>(r1)
            r0.append(r8)
        L_0x02b7:
            android.view.View r0 = r8.mView
            if (r0 == 0) goto L_0x02ca
            android.support.v4.app.FragmentHostCallback r0 = r7.mHost
            boolean r0 = r0.onShouldSaveFragmentState(r8)
            if (r0 == 0) goto L_0x02ca
            android.util.SparseArray<android.os.Parcelable> r0 = r8.mSavedViewState
            if (r0 != 0) goto L_0x02ca
            r7.saveFragmentViewState(r8)
        L_0x02ca:
            r8.performDestroyView()
            android.view.View r0 = r8.mView
            if (r0 == 0) goto L_0x0302
            android.view.ViewGroup r0 = r8.mContainer
            if (r0 == 0) goto L_0x0302
            r6 = 0
            int r0 = r7.mCurState
            if (r0 <= 0) goto L_0x02e3
            boolean r0 = r7.mDestroyed
            if (r0 != 0) goto L_0x02e3
            r0 = 0
            android.view.animation.Animation r6 = r7.loadAnimation(r8, r10, r0, r11)
        L_0x02e3:
            if (r6 == 0) goto L_0x02fb
            r10 = r8
            android.view.View r0 = r8.mView
            r8.mAnimatingAway = r0
            r8.mStateAfterAnimating = r9
            android.view.View r11 = r8.mView
            android.support.v4.app.FragmentManagerImpl$5 r0 = new android.support.v4.app.FragmentManagerImpl$5
            r0.<init>(r11, r6, r10)
            r6.setAnimationListener(r0)
            android.view.View r0 = r8.mView
            r0.startAnimation(r6)
        L_0x02fb:
            android.view.ViewGroup r0 = r8.mContainer
            android.view.View r1 = r8.mView
            r0.removeView(r1)
        L_0x0302:
            r0 = 0
            r8.mContainer = r0
            r0 = 0
            r8.mView = r0
            r0 = 0
            r8.mInnerView = r0
        L_0x030b:
            if (r9 > 0) goto L_0x037a
            boolean r0 = r7.mDestroyed
            if (r0 == 0) goto L_0x031d
            android.view.View r0 = r8.mAnimatingAway
            if (r0 == 0) goto L_0x031d
            android.view.View r6 = r8.mAnimatingAway
            r0 = 0
            r8.mAnimatingAway = r0
            r6.clearAnimation()
        L_0x031d:
            android.view.View r0 = r8.mAnimatingAway
            if (r0 == 0) goto L_0x0326
            r8.mStateAfterAnimating = r9
            r9 = 1
            goto L_0x037a
        L_0x0326:
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x0334
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "movefrom CREATED: "
            r0.<init>(r1)
            r0.append(r8)
        L_0x0334:
            boolean r0 = r8.mRetaining
            if (r0 != 0) goto L_0x033c
            r8.performDestroy()
            goto L_0x033f
        L_0x033c:
            r0 = 0
            r8.mState = r0
        L_0x033f:
            r0 = 0
            r8.mCalled = r0
            r8.onDetach()
            boolean r0 = r8.mCalled
            if (r0 != 0) goto L_0x0364
            android.support.v4.app.SuperNotCalledException r0 = new android.support.v4.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = " did not call through to super.onDetach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0364:
            if (r12 != 0) goto L_0x037a
            boolean r0 = r8.mRetaining
            if (r0 != 0) goto L_0x036e
            r7.makeInactive(r8)
            goto L_0x037a
        L_0x036e:
            r0 = 0
            r8.mHost = r0
            r0 = 0
            r8.mParentFragment = r0
            r0 = 0
            r8.mFragmentManager = r0
            r0 = 0
            r8.mChildFragmentManager = r0
        L_0x037a:
            int r0 = r8.mState
            if (r0 == r9) goto L_0x03a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r1 = " not updated inline; expected state "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r1 = " found "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r8.mState
            r0.append(r1)
            r8.mState = r9
        L_0x03a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.app.FragmentManagerImpl.moveToState(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    public final void moveToState(Fragment fragment) {
        moveToState(fragment, this.mCurState, 0, 0, HONEYCOMB);
    }

    /* access modifiers changed from: 0000 */
    public final void moveToState(int i, boolean z) {
        moveToState(i, 0, 0, z);
    }

    /* access modifiers changed from: 0000 */
    public final void moveToState(int i, int i2, int i3, boolean z) {
        if (this.mHost == null && i != 0) {
            throw new IllegalStateException("No host");
        } else if (z || this.mCurState != i) {
            this.mCurState = i;
            if (this.mActive != null) {
                boolean z2 = HONEYCOMB;
                for (int i4 = 0; i4 < this.mActive.size(); i4++) {
                    Fragment fragment = (Fragment) this.mActive.get(i4);
                    if (fragment != null) {
                        moveToState(fragment, i, i2, i3, HONEYCOMB);
                        if (fragment.mLoaderManager != null) {
                            z2 |= fragment.mLoaderManager.hasRunningLoaders();
                        }
                    }
                }
                if (!z2) {
                    startPendingDeferredFragments();
                }
                if (this.mNeedMenuInvalidate && this.mHost != null && this.mCurState == 5) {
                    this.mHost.onSupportInvalidateOptionsMenu();
                    this.mNeedMenuInvalidate = HONEYCOMB;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void startPendingDeferredFragments() {
        if (this.mActive != null) {
            for (int i = 0; i < this.mActive.size(); i++) {
                Fragment fragment = (Fragment) this.mActive.get(i);
                if (fragment != null) {
                    performPendingDeferredStart(fragment);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void makeActive(Fragment fragment) {
        if (fragment.mIndex < 0) {
            if (this.mAvailIndices == null || this.mAvailIndices.size() <= 0) {
                if (this.mActive == null) {
                    this.mActive = new ArrayList<>();
                }
                fragment.setIndex(this.mActive.size(), this.mParent);
                this.mActive.add(fragment);
            } else {
                fragment.setIndex(((Integer) this.mAvailIndices.remove(this.mAvailIndices.size() - 1)).intValue(), this.mParent);
                this.mActive.set(fragment.mIndex, fragment);
            }
            if (DEBUG) {
                new StringBuilder("Allocated fragment index ").append(fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void makeInactive(Fragment fragment) {
        if (fragment.mIndex >= 0) {
            if (DEBUG) {
                new StringBuilder("Freeing fragment index ").append(fragment);
            }
            this.mActive.set(fragment.mIndex, null);
            if (this.mAvailIndices == null) {
                this.mAvailIndices = new ArrayList<>();
            }
            this.mAvailIndices.add(Integer.valueOf(fragment.mIndex));
            this.mHost.inactivateFragment(fragment.mWho);
            fragment.initState();
        }
    }

    public final void addFragment(Fragment fragment, boolean z) {
        if (this.mAdded == null) {
            this.mAdded = new ArrayList<>();
        }
        if (DEBUG) {
            new StringBuilder("add: ").append(fragment);
        }
        makeActive(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (this.mAdded.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        this.mAdded.add(fragment);
        fragment.mAdded = true;
        fragment.mRemoving = HONEYCOMB;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            this.mNeedMenuInvalidate = true;
        }
        if (z) {
            moveToState(fragment);
        }
    }

    public final void removeFragment(Fragment fragment, int i, int i2) {
        if (DEBUG) {
            new StringBuilder("remove: ").append(fragment).append(" nesting=").append(fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack() ? true : HONEYCOMB;
        if (!fragment.mDetached || z) {
            if (this.mAdded != null) {
                this.mAdded.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mAdded = HONEYCOMB;
            fragment.mRemoving = true;
            moveToState(fragment, z ? 0 : 1, i, i2, HONEYCOMB);
        }
    }

    public final void hideFragment(Fragment fragment, int i, int i2) {
        if (DEBUG) {
            new StringBuilder("hide: ").append(fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            if (fragment.mView != null) {
                Animation loadAnimation = loadAnimation(fragment, i, HONEYCOMB, i2);
                if (loadAnimation != null) {
                    setHWLayerAnimListenerIfAlpha(fragment.mView, loadAnimation);
                    fragment.mView.startAnimation(loadAnimation);
                }
                fragment.mView.setVisibility(8);
            }
            if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.onHiddenChanged(true);
        }
    }

    public final void showFragment(Fragment fragment, int i, int i2) {
        if (DEBUG) {
            new StringBuilder("show: ").append(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = HONEYCOMB;
            if (fragment.mView != null) {
                Animation loadAnimation = loadAnimation(fragment, i, true, i2);
                if (loadAnimation != null) {
                    setHWLayerAnimListenerIfAlpha(fragment.mView, loadAnimation);
                    fragment.mView.startAnimation(loadAnimation);
                }
                fragment.mView.setVisibility(0);
            }
            if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.onHiddenChanged(HONEYCOMB);
        }
    }

    public final void detachFragment(Fragment fragment, int i, int i2) {
        if (DEBUG) {
            new StringBuilder("detach: ").append(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (this.mAdded != null) {
                    if (DEBUG) {
                        new StringBuilder("remove from detach: ").append(fragment);
                    }
                    this.mAdded.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.mNeedMenuInvalidate = true;
                }
                fragment.mAdded = HONEYCOMB;
                moveToState(fragment, 1, i, i2, HONEYCOMB);
            }
        }
    }

    public final void attachFragment(Fragment fragment, int i, int i2) {
        if (DEBUG) {
            new StringBuilder("attach: ").append(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = HONEYCOMB;
            if (!fragment.mAdded) {
                if (this.mAdded == null) {
                    this.mAdded = new ArrayList<>();
                }
                if (this.mAdded.contains(fragment)) {
                    throw new IllegalStateException("Fragment already added: " + fragment);
                }
                if (DEBUG) {
                    new StringBuilder("add from attach: ").append(fragment);
                }
                this.mAdded.add(fragment);
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.mNeedMenuInvalidate = true;
                }
                moveToState(fragment, this.mCurState, i, i2, HONEYCOMB);
            }
        }
    }

    public final Fragment findFragmentById(int i) {
        if (this.mAdded != null) {
            for (int size = this.mAdded.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.mAdded.get(size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            }
        }
        if (this.mActive != null) {
            for (int size2 = this.mActive.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.mActive.get(size2);
                if (fragment2 != null && fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment findFragmentByTag(String str) {
        if (!(this.mAdded == null || str == null)) {
            for (int size = this.mAdded.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.mAdded.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (!(this.mActive == null || str == null)) {
            for (int size2 = this.mActive.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.mActive.get(size2);
                if (fragment2 != null && str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment findFragmentByWho(String str) {
        if (!(this.mActive == null || str == null)) {
            for (int size = this.mActive.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.mActive.get(size);
                if (fragment != null) {
                    Fragment findFragmentByWho = fragment.findFragmentByWho(str);
                    if (findFragmentByWho != null) {
                        return findFragmentByWho;
                    }
                }
            }
        }
        return null;
    }

    private void checkStateLoss() {
        if (this.mStateSaved) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.mNoTransactionsBecause != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.mNoTransactionsBecause);
        }
    }

    public final void enqueueAction(Runnable runnable, boolean z) {
        if (!z) {
            checkStateLoss();
        }
        synchronized (this) {
            if (this.mDestroyed || this.mHost == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.mPendingActions == null) {
                this.mPendingActions = new ArrayList<>();
            }
            this.mPendingActions.add(runnable);
            if (this.mPendingActions.size() == 1) {
                this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                this.mHost.getHandler().post(this.mExecCommit);
            }
        }
    }

    public final int allocBackStackIndex(BackStackRecord backStackRecord) {
        synchronized (this) {
            if (this.mAvailBackStackIndices == null || this.mAvailBackStackIndices.size() <= 0) {
                if (this.mBackStackIndices == null) {
                    this.mBackStackIndices = new ArrayList<>();
                }
                int size = this.mBackStackIndices.size();
                if (DEBUG) {
                    new StringBuilder("Setting back stack index ").append(size).append(" to ").append(backStackRecord);
                }
                this.mBackStackIndices.add(backStackRecord);
                return size;
            }
            int intValue = ((Integer) this.mAvailBackStackIndices.remove(this.mAvailBackStackIndices.size() - 1)).intValue();
            if (DEBUG) {
                new StringBuilder("Adding back stack index ").append(intValue).append(" with ").append(backStackRecord);
            }
            this.mBackStackIndices.set(intValue, backStackRecord);
            return intValue;
        }
    }

    public final void setBackStackIndex(int i, BackStackRecord backStackRecord) {
        synchronized (this) {
            if (this.mBackStackIndices == null) {
                this.mBackStackIndices = new ArrayList<>();
            }
            int size = this.mBackStackIndices.size();
            if (i < size) {
                if (DEBUG) {
                    new StringBuilder("Setting back stack index ").append(i).append(" to ").append(backStackRecord);
                }
                this.mBackStackIndices.set(i, backStackRecord);
            } else {
                while (size < i) {
                    this.mBackStackIndices.add(null);
                    if (this.mAvailBackStackIndices == null) {
                        this.mAvailBackStackIndices = new ArrayList<>();
                    }
                    this.mAvailBackStackIndices.add(Integer.valueOf(size));
                    size++;
                }
                if (DEBUG) {
                    new StringBuilder("Adding back stack index ").append(i).append(" with ").append(backStackRecord);
                }
                this.mBackStackIndices.add(backStackRecord);
            }
        }
    }

    public final void freeBackStackIndex(int i) {
        synchronized (this) {
            this.mBackStackIndices.set(i, null);
            if (this.mAvailBackStackIndices == null) {
                this.mAvailBackStackIndices = new ArrayList<>();
            }
            this.mAvailBackStackIndices.add(Integer.valueOf(i));
        }
    }

    public final boolean execPendingActions() {
        if (this.mExecutingActions) {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        } else if (Looper.myLooper() != this.mHost.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of process");
        } else {
            boolean z = HONEYCOMB;
            while (true) {
                synchronized (this) {
                    if (this.mPendingActions == null || this.mPendingActions.size() == 0) {
                    } else {
                        int size = this.mPendingActions.size();
                        if (this.mTmpActions == null || this.mTmpActions.length < size) {
                            this.mTmpActions = new Runnable[size];
                        }
                        this.mPendingActions.toArray(this.mTmpActions);
                        this.mPendingActions.clear();
                        this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                        this.mExecutingActions = true;
                        for (int i = 0; i < size; i++) {
                            this.mTmpActions[i].run();
                            this.mTmpActions[i] = null;
                        }
                        this.mExecutingActions = HONEYCOMB;
                        z = true;
                    }
                }
            }
            if (this.mHavePendingDeferredStart) {
                boolean z2 = HONEYCOMB;
                for (int i2 = 0; i2 < this.mActive.size(); i2++) {
                    Fragment fragment = (Fragment) this.mActive.get(i2);
                    if (!(fragment == null || fragment.mLoaderManager == null)) {
                        z2 |= fragment.mLoaderManager.hasRunningLoaders();
                    }
                }
                if (!z2) {
                    this.mHavePendingDeferredStart = HONEYCOMB;
                    startPendingDeferredFragments();
                }
            }
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void reportBackStackChanged() {
        if (this.mBackStackChangeListeners != null) {
            for (int i = 0; i < this.mBackStackChangeListeners.size(); i++) {
                ((OnBackStackChangedListener) this.mBackStackChangeListeners.get(i)).onBackStackChanged();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void addBackStackState(BackStackRecord backStackRecord) {
        if (this.mBackStack == null) {
            this.mBackStack = new ArrayList<>();
        }
        this.mBackStack.add(backStackRecord);
        reportBackStackChanged();
    }

    /* access modifiers changed from: 0000 */
    public final boolean popBackStackState(Handler handler, String str, int i, int i2) {
        if (this.mBackStack == null) {
            return HONEYCOMB;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.mBackStack.size() - 1;
            if (size < 0) {
                return HONEYCOMB;
            }
            BackStackRecord backStackRecord = (BackStackRecord) this.mBackStack.remove(size);
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            backStackRecord.calculateBackFragments(sparseArray, sparseArray2);
            backStackRecord.popFromBackStack(true, null, sparseArray, sparseArray2);
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = this.mBackStack.size() - 1;
                while (i3 >= 0) {
                    BackStackRecord backStackRecord2 = (BackStackRecord) this.mBackStack.get(i3);
                    if ((str != null && str.equals(backStackRecord2.getName())) || (i >= 0 && i == backStackRecord2.mIndex)) {
                        break;
                    }
                    size2 = i3 - 1;
                }
                if (i3 < 0) {
                    return HONEYCOMB;
                }
                if ((i2 & 1) != 0) {
                    i3--;
                    while (i3 >= 0) {
                        BackStackRecord backStackRecord3 = (BackStackRecord) this.mBackStack.get(i3);
                        if ((str == null || !str.equals(backStackRecord3.getName())) && (i < 0 || i != backStackRecord3.mIndex)) {
                            break;
                        }
                        i3--;
                    }
                }
            }
            if (i3 == this.mBackStack.size() - 1) {
                return HONEYCOMB;
            }
            ArrayList arrayList = new ArrayList();
            for (int size3 = this.mBackStack.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.mBackStack.remove(size3));
            }
            int size4 = arrayList.size() - 1;
            SparseArray sparseArray3 = new SparseArray();
            SparseArray sparseArray4 = new SparseArray();
            for (int i4 = 0; i4 <= size4; i4++) {
                ((BackStackRecord) arrayList.get(i4)).calculateBackFragments(sparseArray3, sparseArray4);
            }
            TransitionState transitionState = null;
            int i5 = 0;
            while (i5 <= size4) {
                if (DEBUG) {
                    new StringBuilder("Popping back stack state: ").append(arrayList.get(i5));
                }
                transitionState = ((BackStackRecord) arrayList.get(i5)).popFromBackStack(i5 == size4 ? true : HONEYCOMB, transitionState, sparseArray3, sparseArray4);
                i5++;
            }
        }
        reportBackStackChanged();
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final ArrayList<Fragment> retainNonConfig() {
        ArrayList<Fragment> arrayList = null;
        if (this.mActive != null) {
            for (int i = 0; i < this.mActive.size(); i++) {
                Fragment fragment = (Fragment) this.mActive.get(i);
                if (fragment != null && fragment.mRetainInstance) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    fragment.mRetaining = true;
                    fragment.mTargetIndex = fragment.mTarget != null ? fragment.mTarget.mIndex : -1;
                    if (DEBUG) {
                        new StringBuilder("retainNonConfig: keeping retained ").append(fragment);
                    }
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public final void saveFragmentViewState(Fragment fragment) {
        if (fragment.mInnerView != null) {
            if (this.mStateArray == null) {
                this.mStateArray = new SparseArray<>();
            } else {
                this.mStateArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.mStateArray);
            if (this.mStateArray.size() > 0) {
                fragment.mSavedViewState = this.mStateArray;
                this.mStateArray = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final Bundle saveFragmentBasicState(Fragment fragment) {
        Bundle bundle = null;
        if (this.mStateBundle == null) {
            this.mStateBundle = new Bundle();
        }
        fragment.performSaveInstanceState(this.mStateBundle);
        if (!this.mStateBundle.isEmpty()) {
            bundle = this.mStateBundle;
            this.mStateBundle = null;
        }
        if (fragment.mView != null) {
            saveFragmentViewState(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(VIEW_STATE_TAG, fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(USER_VISIBLE_HINT_TAG, fragment.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    public final Parcelable saveAllState() {
        execPendingActions();
        if (HONEYCOMB) {
            this.mStateSaved = true;
        }
        if (this.mActive == null || this.mActive.size() <= 0) {
            return null;
        }
        int size = this.mActive.size();
        FragmentState[] fragmentStateArr = new FragmentState[size];
        boolean z = HONEYCOMB;
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.mActive.get(i);
            if (fragment != null) {
                if (fragment.mIndex < 0) {
                    throwException(new IllegalStateException("Failure saving state: active " + fragment + " has cleared index: " + fragment.mIndex));
                }
                z = true;
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.mState <= 0 || fragmentState.mSavedFragmentState != null) {
                    fragmentState.mSavedFragmentState = fragment.mSavedFragmentState;
                } else {
                    fragmentState.mSavedFragmentState = saveFragmentBasicState(fragment);
                    if (fragment.mTarget != null) {
                        if (fragment.mTarget.mIndex < 0) {
                            throwException(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.mTarget));
                        }
                        if (fragmentState.mSavedFragmentState == null) {
                            fragmentState.mSavedFragmentState = new Bundle();
                        }
                        putFragment(fragmentState.mSavedFragmentState, TARGET_STATE_TAG, fragment.mTarget);
                        if (fragment.mTargetRequestCode != 0) {
                            fragmentState.mSavedFragmentState.putInt(TARGET_REQUEST_CODE_STATE_TAG, fragment.mTargetRequestCode);
                        }
                    }
                }
                if (DEBUG) {
                    new StringBuilder("Saved state of ").append(fragment).append(": ").append(fragmentState.mSavedFragmentState);
                }
            }
        }
        if (!z) {
            return null;
        }
        int[] iArr = null;
        BackStackState[] backStackStateArr = null;
        if (this.mAdded != null) {
            int size2 = this.mAdded.size();
            if (size2 > 0) {
                iArr = new int[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    iArr[i2] = ((Fragment) this.mAdded.get(i2)).mIndex;
                    if (iArr[i2] < 0) {
                        throwException(new IllegalStateException("Failure saving state: active " + this.mAdded.get(i2) + " has cleared index: " + iArr[i2]));
                    }
                    if (DEBUG) {
                        new StringBuilder("saveAllState: adding fragment #").append(i2).append(": ").append(this.mAdded.get(i2));
                    }
                }
            }
        }
        if (this.mBackStack != null) {
            int size3 = this.mBackStack.size();
            if (size3 > 0) {
                backStackStateArr = new BackStackState[size3];
                for (int i3 = 0; i3 < size3; i3++) {
                    backStackStateArr[i3] = new BackStackState((BackStackRecord) this.mBackStack.get(i3));
                    if (DEBUG) {
                        new StringBuilder("saveAllState: adding back stack #").append(i3).append(": ").append(this.mBackStack.get(i3));
                    }
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.mActive = fragmentStateArr;
        fragmentManagerState.mAdded = iArr;
        fragmentManagerState.mBackStack = backStackStateArr;
        return fragmentManagerState;
    }

    /* access modifiers changed from: 0000 */
    public final void restoreAllState(Parcelable parcelable, List<Fragment> list) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            FragmentManagerState fragmentManagerState2 = fragmentManagerState;
            if (fragmentManagerState.mActive != null) {
                if (list != null) {
                    for (int i = 0; i < list.size(); i++) {
                        Fragment fragment = (Fragment) list.get(i);
                        if (DEBUG) {
                            new StringBuilder("restoreAllState: re-attaching retained ").append(fragment);
                        }
                        FragmentState fragmentState = fragmentManagerState2.mActive[fragment.mIndex];
                        fragmentState.mInstance = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = HONEYCOMB;
                        fragment.mAdded = HONEYCOMB;
                        fragment.mTarget = null;
                        if (fragmentState.mSavedFragmentState != null) {
                            fragmentState.mSavedFragmentState.setClassLoader(this.mHost.getContext().getClassLoader());
                            fragment.mSavedViewState = fragmentState.mSavedFragmentState.getSparseParcelableArray(VIEW_STATE_TAG);
                            fragment.mSavedFragmentState = fragmentState.mSavedFragmentState;
                        }
                    }
                }
                this.mActive = new ArrayList<>(fragmentManagerState2.mActive.length);
                if (this.mAvailIndices != null) {
                    this.mAvailIndices.clear();
                }
                for (int i2 = 0; i2 < fragmentManagerState2.mActive.length; i2++) {
                    FragmentState fragmentState2 = fragmentManagerState2.mActive[i2];
                    if (fragmentState2 != null) {
                        Fragment instantiate = fragmentState2.instantiate(this.mHost, this.mParent);
                        if (DEBUG) {
                            new StringBuilder("restoreAllState: active #").append(i2).append(": ").append(instantiate);
                        }
                        this.mActive.add(instantiate);
                        fragmentState2.mInstance = null;
                    } else {
                        this.mActive.add(null);
                        if (this.mAvailIndices == null) {
                            this.mAvailIndices = new ArrayList<>();
                        }
                        this.mAvailIndices.add(Integer.valueOf(i2));
                    }
                }
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        Fragment fragment2 = (Fragment) list.get(i3);
                        if (fragment2.mTargetIndex >= 0) {
                            if (fragment2.mTargetIndex < this.mActive.size()) {
                                fragment2.mTarget = (Fragment) this.mActive.get(fragment2.mTargetIndex);
                            } else {
                                new StringBuilder("Re-attaching retained fragment ").append(fragment2).append(" target no longer exists: ").append(fragment2.mTargetIndex);
                                fragment2.mTarget = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState2.mAdded != null) {
                    this.mAdded = new ArrayList<>(fragmentManagerState2.mAdded.length);
                    for (int i4 = 0; i4 < fragmentManagerState2.mAdded.length; i4++) {
                        Fragment fragment3 = (Fragment) this.mActive.get(fragmentManagerState2.mAdded[i4]);
                        if (fragment3 == null) {
                            throwException(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState2.mAdded[i4]));
                        }
                        fragment3.mAdded = true;
                        if (DEBUG) {
                            new StringBuilder("restoreAllState: added #").append(i4).append(": ").append(fragment3);
                        }
                        if (this.mAdded.contains(fragment3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.mAdded.add(fragment3);
                    }
                } else {
                    this.mAdded = null;
                }
                if (fragmentManagerState2.mBackStack != null) {
                    this.mBackStack = new ArrayList<>(fragmentManagerState2.mBackStack.length);
                    for (int i5 = 0; i5 < fragmentManagerState2.mBackStack.length; i5++) {
                        BackStackRecord instantiate2 = fragmentManagerState2.mBackStack[i5].instantiate(this);
                        if (DEBUG) {
                            new StringBuilder("restoreAllState: back stack #").append(i5).append(" (index ").append(instantiate2.mIndex).append("): ").append(instantiate2);
                            instantiate2.dump("  ", new PrintWriter(new LogWriter(TAG)), HONEYCOMB);
                        }
                        this.mBackStack.add(instantiate2);
                        if (instantiate2.mIndex >= 0) {
                            setBackStackIndex(instantiate2.mIndex, instantiate2);
                        }
                    }
                    return;
                }
                this.mBackStack = null;
            }
        }
    }

    public final void attachController(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, Fragment fragment) {
        if (this.mHost != null) {
            throw new IllegalStateException("Already attached");
        }
        this.mHost = fragmentHostCallback;
        this.mContainer = fragmentContainer;
        this.mParent = fragment;
    }

    public final void noteStateNotSaved() {
        this.mStateSaved = HONEYCOMB;
    }

    public final void dispatchCreate() {
        this.mStateSaved = HONEYCOMB;
        moveToState(1, HONEYCOMB);
    }

    public final void dispatchActivityCreated() {
        this.mStateSaved = HONEYCOMB;
        moveToState(2, HONEYCOMB);
    }

    public final void dispatchStart() {
        this.mStateSaved = HONEYCOMB;
        moveToState(4, HONEYCOMB);
    }

    public final void dispatchResume() {
        this.mStateSaved = HONEYCOMB;
        moveToState(5, HONEYCOMB);
    }

    public final void dispatchPause() {
        moveToState(4, HONEYCOMB);
    }

    public final void dispatchStop() {
        this.mStateSaved = true;
        moveToState(3, HONEYCOMB);
    }

    public final void dispatchReallyStop() {
        moveToState(2, HONEYCOMB);
    }

    public final void dispatchDestroyView() {
        moveToState(1, HONEYCOMB);
    }

    public final void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions();
        moveToState(0, HONEYCOMB);
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
    }

    public final void dispatchConfigurationChanged(Configuration configuration) {
        if (this.mAdded != null) {
            for (int i = 0; i < this.mAdded.size(); i++) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null) {
                    fragment.performConfigurationChanged(configuration);
                }
            }
        }
    }

    public final void dispatchLowMemory() {
        if (this.mAdded != null) {
            for (int i = 0; i < this.mAdded.size(); i++) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null) {
                    fragment.performLowMemory();
                }
            }
        }
    }

    public final boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = HONEYCOMB;
        ArrayList<Fragment> arrayList = null;
        if (this.mAdded != null) {
            for (int i = 0; i < this.mAdded.size(); i++) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                }
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i2 = 0; i2 < this.mCreatedMenus.size(); i2++) {
                Fragment fragment2 = (Fragment) this.mCreatedMenus.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z;
    }

    public final boolean dispatchPrepareOptionsMenu(Menu menu) {
        boolean z = HONEYCOMB;
        if (this.mAdded != null) {
            for (int i = 0; i < this.mAdded.size(); i++) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        if (this.mAdded != null) {
            for (int i = 0; i < this.mAdded.size(); i++) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                    return true;
                }
            }
        }
        return HONEYCOMB;
    }

    public final boolean dispatchContextItemSelected(MenuItem menuItem) {
        if (this.mAdded != null) {
            for (int i = 0; i < this.mAdded.size(); i++) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                    return true;
                }
            }
        }
        return HONEYCOMB;
    }

    public final void dispatchOptionsMenuClosed(Menu menu) {
        if (this.mAdded != null) {
            for (int i = 0; i < this.mAdded.size(); i++) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public static int reverseTransit(int i) {
        switch (i) {
            case FragmentTransaction.TRANSIT_FRAGMENT_OPEN /*4097*/:
                return 8194;
            case FragmentTransaction.TRANSIT_FRAGMENT_FADE /*4099*/:
                return FragmentTransaction.TRANSIT_FRAGMENT_FADE;
            case 8194:
                return FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
            default:
                return 0;
        }
    }

    public static int transitToStyleIndex(int i, boolean z) {
        switch (i) {
            case FragmentTransaction.TRANSIT_FRAGMENT_OPEN /*4097*/:
                return z ? 1 : 2;
            case FragmentTransaction.TRANSIT_FRAGMENT_FADE /*4099*/:
                return z ? 5 : 6;
            case 8194:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentTag.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.isSupportFragmentClass(this.mHost.getContext(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment findFragmentById = resourceId != -1 ? findFragmentById(resourceId) : null;
        if (findFragmentById == null && string != null) {
            findFragmentById = findFragmentByTag(string);
        }
        if (findFragmentById == null && id != -1) {
            findFragmentById = findFragmentById(id);
        }
        if (DEBUG) {
            new StringBuilder("onCreateView: id=0x").append(Integer.toHexString(resourceId)).append(" fname=").append(attributeValue).append(" existing=").append(findFragmentById);
        }
        if (findFragmentById == null) {
            findFragmentById = Fragment.instantiate(context, attributeValue);
            findFragmentById.mFromLayout = true;
            findFragmentById.mFragmentId = resourceId != 0 ? resourceId : id;
            findFragmentById.mContainerId = id;
            findFragmentById.mTag = string;
            findFragmentById.mInLayout = true;
            findFragmentById.mFragmentManager = this;
            findFragmentById.mHost = this.mHost;
            findFragmentById.onInflate(this.mHost.getContext(), attributeSet, findFragmentById.mSavedFragmentState);
            addFragment(findFragmentById, true);
        } else if (findFragmentById.mInLayout) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        } else {
            findFragmentById.mInLayout = true;
            findFragmentById.mHost = this.mHost;
            if (!findFragmentById.mRetaining) {
                findFragmentById.onInflate(this.mHost.getContext(), attributeSet, findFragmentById.mSavedFragmentState);
            }
        }
        if (this.mCurState > 0 || !findFragmentById.mFromLayout) {
            moveToState(findFragmentById);
        } else {
            moveToState(findFragmentById, 1, 0, 0, HONEYCOMB);
        }
        if (findFragmentById.mView == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            findFragmentById.mView.setId(resourceId);
        }
        if (findFragmentById.mView.getTag() == null) {
            findFragmentById.mView.setTag(string);
        }
        return findFragmentById.mView;
    }

    /* access modifiers changed from: 0000 */
    public final LayoutInflaterFactory getLayoutInflaterFactory() {
        return this;
    }
}

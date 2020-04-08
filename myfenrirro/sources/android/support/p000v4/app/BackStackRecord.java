package android.support.p000v4.app;

import android.os.Build.VERSION;
import android.support.p000v4.app.FragmentManager.BackStackEntry;
import android.support.p000v4.app.FragmentTransitionCompat21.EpicenterView;
import android.support.p000v4.app.FragmentTransitionCompat21.ViewRetriever;
import android.support.p000v4.util.ArrayMap;
import android.support.p000v4.util.LogWriter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.BackStackRecord */
final class BackStackRecord extends FragmentTransaction implements BackStackEntry, Runnable {
    static final int OP_ADD = 1;
    static final int OP_ATTACH = 7;
    static final int OP_DETACH = 6;
    static final int OP_HIDE = 4;
    static final int OP_NULL = 0;
    static final int OP_REMOVE = 3;
    static final int OP_REPLACE = 2;
    static final int OP_SHOW = 5;
    static final boolean SUPPORTS_TRANSITIONS = (VERSION.SDK_INT >= 21 ? true : SUPPORTS_TRANSITIONS);
    static final String TAG = "FragmentManager";
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack = true;
    int mBreadCrumbShortTitleRes;
    CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    CharSequence mBreadCrumbTitleText;
    boolean mCommitted;
    int mEnterAnim;
    int mExitAnim;
    C0008Op mHead;
    int mIndex = -1;
    final FragmentManagerImpl mManager;
    String mName;
    int mNumOp;
    int mPopEnterAnim;
    int mPopExitAnim;
    ArrayList<String> mSharedElementSourceNames;
    ArrayList<String> mSharedElementTargetNames;
    C0008Op mTail;
    int mTransition;
    int mTransitionStyle;

    /* renamed from: android.support.v4.app.BackStackRecord$Op */
    static final class C0008Op {
        int cmd;
        int enterAnim;
        int exitAnim;
        Fragment fragment;
        C0008Op next;
        int popEnterAnim;
        int popExitAnim;
        C0008Op prev;
        ArrayList<Fragment> removed;

        C0008Op() {
        }
    }

    /* renamed from: android.support.v4.app.BackStackRecord$TransitionState */
    public class TransitionState {
        public EpicenterView enteringEpicenterView = new EpicenterView();
        public ArrayList<View> hiddenFragmentViews = new ArrayList<>();
        public ArrayMap<String, String> nameOverrides = new ArrayMap<>();
        public View nonExistentView;

        public TransitionState() {
        }
    }

    static {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mName != null) {
            sb.append(" ");
            sb.append(this.mName);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dump(str, printWriter, true);
    }

    public final void dump(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.mName);
            printWriter.print(" mIndex=");
            printWriter.print(this.mIndex);
            printWriter.print(" mCommitted=");
            printWriter.println(this.mCommitted);
            if (this.mTransition != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.mTransition));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.mTransitionStyle));
            }
            if (!(this.mEnterAnim == 0 && this.mExitAnim == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mEnterAnim));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.mExitAnim));
            }
            if (!(this.mPopEnterAnim == 0 && this.mPopExitAnim == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mPopEnterAnim));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.mPopExitAnim));
            }
            if (!(this.mBreadCrumbTitleRes == 0 && this.mBreadCrumbTitleText == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbTitleRes));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.mBreadCrumbTitleText);
            }
            if (!(this.mBreadCrumbShortTitleRes == 0 && this.mBreadCrumbShortTitleText == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbShortTitleRes));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.mBreadCrumbShortTitleText);
            }
        }
        if (this.mHead != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            C0008Op op = this.mHead;
            int i = 0;
            while (op != null) {
                switch (op.cmd) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + op.cmd;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(op.fragment);
                if (z) {
                    if (!(op.enterAnim == 0 && op.exitAnim == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(op.enterAnim));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(op.exitAnim));
                    }
                    if (!(op.popEnterAnim == 0 && op.popExitAnim == 0)) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(op.popEnterAnim));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(op.popExitAnim));
                    }
                }
                if (op.removed != null && op.removed.size() > 0) {
                    for (int i2 = 0; i2 < op.removed.size(); i2++) {
                        printWriter.print(str3);
                        if (op.removed.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str3);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(op.removed.get(i2));
                    }
                }
                op = op.next;
                i++;
            }
        }
    }

    public BackStackRecord(FragmentManagerImpl fragmentManagerImpl) {
        this.mManager = fragmentManagerImpl;
    }

    public final int getId() {
        return this.mIndex;
    }

    public final int getBreadCrumbTitleRes() {
        return this.mBreadCrumbTitleRes;
    }

    public final int getBreadCrumbShortTitleRes() {
        return this.mBreadCrumbShortTitleRes;
    }

    public final CharSequence getBreadCrumbTitle() {
        if (this.mBreadCrumbTitleRes != 0) {
            return this.mManager.mHost.getContext().getText(this.mBreadCrumbTitleRes);
        }
        return this.mBreadCrumbTitleText;
    }

    public final CharSequence getBreadCrumbShortTitle() {
        if (this.mBreadCrumbShortTitleRes != 0) {
            return this.mManager.mHost.getContext().getText(this.mBreadCrumbShortTitleRes);
        }
        return this.mBreadCrumbShortTitleText;
    }

    /* access modifiers changed from: 0000 */
    public final void addOp(C0008Op op) {
        if (this.mHead == null) {
            this.mTail = op;
            this.mHead = op;
        } else {
            op.prev = this.mTail;
            this.mTail.next = op;
            this.mTail = op;
        }
        op.enterAnim = this.mEnterAnim;
        op.exitAnim = this.mExitAnim;
        op.popEnterAnim = this.mPopEnterAnim;
        op.popExitAnim = this.mPopExitAnim;
        this.mNumOp++;
    }

    public final FragmentTransaction add(Fragment fragment, String str) {
        doAddOp(0, fragment, str, 1);
        return this;
    }

    public final FragmentTransaction add(int i, Fragment fragment) {
        doAddOp(i, fragment, null, 1);
        return this;
    }

    public final FragmentTransaction add(int i, Fragment fragment, String str) {
        doAddOp(i, fragment, str, 1);
        return this;
    }

    private void doAddOp(int i, Fragment fragment, String str, int i2) {
        fragment.mFragmentManager = this.mManager;
        if (str != null) {
            if (fragment.mTag == null || str.equals(fragment.mTag)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (fragment.mFragmentId == 0 || fragment.mFragmentId == i) {
                fragment.mFragmentId = i;
                fragment.mContainerId = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
        }
        C0008Op op = new C0008Op();
        op.cmd = i2;
        op.fragment = fragment;
        addOp(op);
    }

    public final FragmentTransaction replace(int i, Fragment fragment) {
        return replace(i, fragment, null);
    }

    public final FragmentTransaction replace(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        doAddOp(i, fragment, str, 2);
        return this;
    }

    public final FragmentTransaction remove(Fragment fragment) {
        C0008Op op = new C0008Op();
        op.cmd = 3;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public final FragmentTransaction hide(Fragment fragment) {
        C0008Op op = new C0008Op();
        op.cmd = 4;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public final FragmentTransaction show(Fragment fragment) {
        C0008Op op = new C0008Op();
        op.cmd = 5;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public final FragmentTransaction detach(Fragment fragment) {
        C0008Op op = new C0008Op();
        op.cmd = 6;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public final FragmentTransaction attach(Fragment fragment) {
        C0008Op op = new C0008Op();
        op.cmd = 7;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    public final FragmentTransaction setCustomAnimations(int i, int i2) {
        return setCustomAnimations(i, i2, 0, 0);
    }

    public final FragmentTransaction setCustomAnimations(int i, int i2, int i3, int i4) {
        this.mEnterAnim = i;
        this.mExitAnim = i2;
        this.mPopEnterAnim = i3;
        this.mPopExitAnim = i4;
        return this;
    }

    public final FragmentTransaction setTransition(int i) {
        this.mTransition = i;
        return this;
    }

    public final FragmentTransaction addSharedElement(View view, String str) {
        if (SUPPORTS_TRANSITIONS) {
            String transitionName = FragmentTransitionCompat21.getTransitionName(view);
            if (transitionName == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.mSharedElementSourceNames == null) {
                this.mSharedElementSourceNames = new ArrayList<>();
                this.mSharedElementTargetNames = new ArrayList<>();
            }
            this.mSharedElementSourceNames.add(transitionName);
            this.mSharedElementTargetNames.add(str);
        }
        return this;
    }

    public final FragmentTransaction setTransitionStyle(int i) {
        this.mTransitionStyle = i;
        return this;
    }

    public final FragmentTransaction addToBackStack(String str) {
        if (!this.mAllowAddToBackStack) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.mAddToBackStack = true;
        this.mName = str;
        return this;
    }

    public final boolean isAddToBackStackAllowed() {
        return this.mAllowAddToBackStack;
    }

    public final FragmentTransaction disallowAddToBackStack() {
        if (this.mAddToBackStack) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.mAllowAddToBackStack = SUPPORTS_TRANSITIONS;
        return this;
    }

    public final FragmentTransaction setBreadCrumbTitle(int i) {
        this.mBreadCrumbTitleRes = i;
        this.mBreadCrumbTitleText = null;
        return this;
    }

    public final FragmentTransaction setBreadCrumbTitle(CharSequence charSequence) {
        this.mBreadCrumbTitleRes = 0;
        this.mBreadCrumbTitleText = charSequence;
        return this;
    }

    public final FragmentTransaction setBreadCrumbShortTitle(int i) {
        this.mBreadCrumbShortTitleRes = i;
        this.mBreadCrumbShortTitleText = null;
        return this;
    }

    public final FragmentTransaction setBreadCrumbShortTitle(CharSequence charSequence) {
        this.mBreadCrumbShortTitleRes = 0;
        this.mBreadCrumbShortTitleText = charSequence;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final void bumpBackStackNesting(int i) {
        if (this.mAddToBackStack) {
            if (FragmentManagerImpl.DEBUG) {
                new StringBuilder("Bump nesting in ").append(this).append(" by ").append(i);
            }
            C0008Op op = this.mHead;
            while (op != null) {
                if (op.fragment != null) {
                    op.fragment.mBackStackNesting += i;
                    if (FragmentManagerImpl.DEBUG) {
                        new StringBuilder("Bump nesting of ").append(op.fragment).append(" to ").append(op.fragment.mBackStackNesting);
                    }
                }
                if (op.removed != null) {
                    for (int size = op.removed.size() - 1; size >= 0; size--) {
                        Fragment fragment = (Fragment) op.removed.get(size);
                        fragment.mBackStackNesting += i;
                        if (FragmentManagerImpl.DEBUG) {
                            new StringBuilder("Bump nesting of ").append(fragment).append(" to ").append(fragment.mBackStackNesting);
                        }
                    }
                }
                op = op.next;
            }
        }
    }

    public final int commit() {
        return commitInternal(SUPPORTS_TRANSITIONS);
    }

    public final int commitAllowingStateLoss() {
        return commitInternal(true);
    }

    /* access modifiers changed from: 0000 */
    public final int commitInternal(boolean z) {
        if (this.mCommitted) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManagerImpl.DEBUG) {
            new StringBuilder("Commit: ").append(this);
            dump("  ", null, new PrintWriter(new LogWriter(TAG)), null);
        }
        this.mCommitted = true;
        if (this.mAddToBackStack) {
            this.mIndex = this.mManager.allocBackStackIndex(this);
        } else {
            this.mIndex = -1;
        }
        this.mManager.enqueueAction(this, z);
        return this.mIndex;
    }

    public final void run() {
        if (FragmentManagerImpl.DEBUG) {
            new StringBuilder("Run: ").append(this);
        }
        if (!this.mAddToBackStack || this.mIndex >= 0) {
            bumpBackStackNesting(1);
            TransitionState transitionState = null;
            if (SUPPORTS_TRANSITIONS) {
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                calculateFragments(sparseArray, sparseArray2);
                transitionState = beginTransition(sparseArray, sparseArray2, SUPPORTS_TRANSITIONS);
            }
            int i = transitionState != null ? 0 : this.mTransitionStyle;
            int i2 = transitionState != null ? 0 : this.mTransition;
            C0008Op op = this.mHead;
            while (op != null) {
                int i3 = transitionState != null ? 0 : op.enterAnim;
                int i4 = transitionState != null ? 0 : op.exitAnim;
                switch (op.cmd) {
                    case 1:
                        Fragment fragment = op.fragment;
                        fragment.mNextAnim = i3;
                        this.mManager.addFragment(fragment, SUPPORTS_TRANSITIONS);
                        break;
                    case 2:
                        Fragment fragment2 = op.fragment;
                        int i5 = fragment2.mContainerId;
                        if (this.mManager.mAdded != null) {
                            for (int size = this.mManager.mAdded.size() - 1; size >= 0; size--) {
                                Fragment fragment3 = (Fragment) this.mManager.mAdded.get(size);
                                if (FragmentManagerImpl.DEBUG) {
                                    new StringBuilder("OP_REPLACE: adding=").append(fragment2).append(" old=").append(fragment3);
                                }
                                if (fragment3.mContainerId == i5) {
                                    if (fragment3 == fragment2) {
                                        fragment2 = null;
                                        op.fragment = null;
                                    } else {
                                        if (op.removed == null) {
                                            op.removed = new ArrayList<>();
                                        }
                                        op.removed.add(fragment3);
                                        fragment3.mNextAnim = i4;
                                        if (this.mAddToBackStack) {
                                            fragment3.mBackStackNesting++;
                                            if (FragmentManagerImpl.DEBUG) {
                                                new StringBuilder("Bump nesting of ").append(fragment3).append(" to ").append(fragment3.mBackStackNesting);
                                            }
                                        }
                                        this.mManager.removeFragment(fragment3, i2, i);
                                    }
                                }
                            }
                        }
                        if (fragment2 == null) {
                            break;
                        } else {
                            fragment2.mNextAnim = i3;
                            this.mManager.addFragment(fragment2, SUPPORTS_TRANSITIONS);
                            break;
                        }
                    case 3:
                        Fragment fragment4 = op.fragment;
                        fragment4.mNextAnim = i4;
                        this.mManager.removeFragment(fragment4, i2, i);
                        break;
                    case 4:
                        Fragment fragment5 = op.fragment;
                        fragment5.mNextAnim = i4;
                        this.mManager.hideFragment(fragment5, i2, i);
                        break;
                    case 5:
                        Fragment fragment6 = op.fragment;
                        fragment6.mNextAnim = i3;
                        this.mManager.showFragment(fragment6, i2, i);
                        break;
                    case 6:
                        Fragment fragment7 = op.fragment;
                        fragment7.mNextAnim = i4;
                        this.mManager.detachFragment(fragment7, i2, i);
                        break;
                    case 7:
                        Fragment fragment8 = op.fragment;
                        fragment8.mNextAnim = i3;
                        this.mManager.attachFragment(fragment8, i2, i);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + op.cmd);
                }
                op = op.next;
            }
            this.mManager.moveToState(this.mManager.mCurState, i2, i, true);
            if (this.mAddToBackStack) {
                this.mManager.addBackStackState(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    private static void setFirstOut(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, Fragment fragment) {
        if (fragment != null) {
            int i = fragment.mContainerId;
            if (i != 0 && !fragment.isHidden()) {
                if (fragment.isAdded() && fragment.getView() != null && sparseArray.get(i) == null) {
                    sparseArray.put(i, fragment);
                }
                if (sparseArray2.get(i) == fragment) {
                    sparseArray2.remove(i);
                }
            }
        }
    }

    private void setLastIn(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, Fragment fragment) {
        if (fragment != null) {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (!fragment.isAdded()) {
                    sparseArray2.put(i, fragment);
                }
                if (sparseArray.get(i) == fragment) {
                    sparseArray.remove(i);
                }
            }
        }
    }

    private void calculateFragments(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (this.mManager.mContainer.onHasView()) {
            for (C0008Op op = this.mHead; op != null; op = op.next) {
                switch (op.cmd) {
                    case 1:
                        setLastIn(sparseArray, sparseArray2, op.fragment);
                        break;
                    case 2:
                        Fragment fragment = op.fragment;
                        if (this.mManager.mAdded != null) {
                            for (int i = 0; i < this.mManager.mAdded.size(); i++) {
                                Fragment fragment2 = (Fragment) this.mManager.mAdded.get(i);
                                if (fragment == null || fragment2.mContainerId == fragment.mContainerId) {
                                    if (fragment2 == fragment) {
                                        fragment = null;
                                        sparseArray2.remove(fragment2.mContainerId);
                                    } else {
                                        setFirstOut(sparseArray, sparseArray2, fragment2);
                                    }
                                }
                            }
                        }
                        setLastIn(sparseArray, sparseArray2, op.fragment);
                        break;
                    case 3:
                        setFirstOut(sparseArray, sparseArray2, op.fragment);
                        break;
                    case 4:
                        setFirstOut(sparseArray, sparseArray2, op.fragment);
                        break;
                    case 5:
                        setLastIn(sparseArray, sparseArray2, op.fragment);
                        break;
                    case 6:
                        setFirstOut(sparseArray, sparseArray2, op.fragment);
                        break;
                    case 7:
                        setLastIn(sparseArray, sparseArray2, op.fragment);
                        break;
                }
            }
        }
    }

    public final void calculateBackFragments(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (this.mManager.mContainer.onHasView()) {
            for (C0008Op op = this.mTail; op != null; op = op.prev) {
                switch (op.cmd) {
                    case 1:
                        setFirstOut(sparseArray, sparseArray2, op.fragment);
                        break;
                    case 2:
                        if (op.removed != null) {
                            for (int size = op.removed.size() - 1; size >= 0; size--) {
                                setLastIn(sparseArray, sparseArray2, (Fragment) op.removed.get(size));
                            }
                        }
                        setFirstOut(sparseArray, sparseArray2, op.fragment);
                        break;
                    case 3:
                        setLastIn(sparseArray, sparseArray2, op.fragment);
                        break;
                    case 4:
                        setLastIn(sparseArray, sparseArray2, op.fragment);
                        break;
                    case 5:
                        setFirstOut(sparseArray, sparseArray2, op.fragment);
                        break;
                    case 6:
                        setLastIn(sparseArray, sparseArray2, op.fragment);
                        break;
                    case 7:
                        setFirstOut(sparseArray, sparseArray2, op.fragment);
                        break;
                }
            }
        }
    }

    public final TransitionState popFromBackStack(boolean z, TransitionState transitionState, SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        if (FragmentManagerImpl.DEBUG) {
            new StringBuilder("popFromBackStack: ").append(this);
            dump("  ", null, new PrintWriter(new LogWriter(TAG)), null);
        }
        if (SUPPORTS_TRANSITIONS) {
            if (transitionState == null) {
                if (!(sparseArray.size() == 0 && sparseArray2.size() == 0)) {
                    transitionState = beginTransition(sparseArray, sparseArray2, true);
                }
            } else if (!z) {
                setNameOverrides(transitionState, this.mSharedElementTargetNames, this.mSharedElementSourceNames);
            }
        }
        bumpBackStackNesting(-1);
        int i = transitionState != null ? 0 : this.mTransitionStyle;
        int i2 = transitionState != null ? 0 : this.mTransition;
        C0008Op op = this.mTail;
        while (op != null) {
            int i3 = transitionState != null ? 0 : op.popEnterAnim;
            int i4 = transitionState != null ? 0 : op.popExitAnim;
            switch (op.cmd) {
                case 1:
                    Fragment fragment = op.fragment;
                    fragment.mNextAnim = i4;
                    this.mManager.removeFragment(fragment, FragmentManagerImpl.reverseTransit(i2), i);
                    break;
                case 2:
                    Fragment fragment2 = op.fragment;
                    if (fragment2 != null) {
                        fragment2.mNextAnim = i4;
                        this.mManager.removeFragment(fragment2, FragmentManagerImpl.reverseTransit(i2), i);
                    }
                    if (op.removed == null) {
                        break;
                    } else {
                        for (int i5 = 0; i5 < op.removed.size(); i5++) {
                            Fragment fragment3 = (Fragment) op.removed.get(i5);
                            fragment3.mNextAnim = i3;
                            this.mManager.addFragment(fragment3, SUPPORTS_TRANSITIONS);
                        }
                        break;
                    }
                case 3:
                    Fragment fragment4 = op.fragment;
                    fragment4.mNextAnim = i3;
                    this.mManager.addFragment(fragment4, SUPPORTS_TRANSITIONS);
                    break;
                case 4:
                    Fragment fragment5 = op.fragment;
                    fragment5.mNextAnim = i3;
                    this.mManager.showFragment(fragment5, FragmentManagerImpl.reverseTransit(i2), i);
                    break;
                case 5:
                    Fragment fragment6 = op.fragment;
                    fragment6.mNextAnim = i4;
                    this.mManager.hideFragment(fragment6, FragmentManagerImpl.reverseTransit(i2), i);
                    break;
                case 6:
                    Fragment fragment7 = op.fragment;
                    fragment7.mNextAnim = i3;
                    this.mManager.attachFragment(fragment7, FragmentManagerImpl.reverseTransit(i2), i);
                    break;
                case 7:
                    Fragment fragment8 = op.fragment;
                    fragment8.mNextAnim = i3;
                    this.mManager.detachFragment(fragment8, FragmentManagerImpl.reverseTransit(i2), i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.cmd);
            }
            op = op.prev;
        }
        if (z) {
            this.mManager.moveToState(this.mManager.mCurState, FragmentManagerImpl.reverseTransit(i2), i, true);
            transitionState = null;
        }
        if (this.mIndex >= 0) {
            this.mManager.freeBackStackIndex(this.mIndex);
            this.mIndex = -1;
        }
        return transitionState;
    }

    public final String getName() {
        return this.mName;
    }

    public final int getTransition() {
        return this.mTransition;
    }

    public final int getTransitionStyle() {
        return this.mTransitionStyle;
    }

    public final boolean isEmpty() {
        if (this.mNumOp == 0) {
            return true;
        }
        return SUPPORTS_TRANSITIONS;
    }

    private TransitionState beginTransition(SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2, boolean z) {
        ensureFragmentsAreInitialized(sparseArray2);
        TransitionState transitionState = new TransitionState();
        transitionState.nonExistentView = new View(this.mManager.mHost.getContext());
        boolean z2 = SUPPORTS_TRANSITIONS;
        for (int i = 0; i < sparseArray.size(); i++) {
            if (configureTransitions(sparseArray.keyAt(i), transitionState, z, sparseArray, sparseArray2)) {
                z2 = true;
            }
        }
        for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
            int keyAt = sparseArray2.keyAt(i2);
            if (sparseArray.get(keyAt) == null && configureTransitions(keyAt, transitionState, z, sparseArray, sparseArray2)) {
                z2 = true;
            }
        }
        if (!z2) {
            return null;
        }
        return transitionState;
    }

    private void ensureFragmentsAreInitialized(SparseArray<Fragment> sparseArray) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) sparseArray.valueAt(i);
            if (fragment.mState <= 0) {
                this.mManager.makeActive(fragment);
                this.mManager.moveToState(fragment, 1, 0, 0, SUPPORTS_TRANSITIONS);
            }
        }
    }

    private static Object getEnterTransition(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return FragmentTransitionCompat21.cloneTransition(z ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    private static Object getExitTransition(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return FragmentTransitionCompat21.cloneTransition(z ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    private static Object getSharedElementTransition(Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return FragmentTransitionCompat21.wrapSharedElementTransition(z ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition());
    }

    private static Object captureExitingViews(Object obj, Fragment fragment, ArrayList<View> arrayList, ArrayMap<String, View> arrayMap, View view) {
        if (obj != null) {
            return FragmentTransitionCompat21.captureExitingViews(obj, fragment.getView(), arrayList, arrayMap, view);
        }
        return obj;
    }

    private ArrayMap<String, View> remapSharedElements(TransitionState transitionState, Fragment fragment, boolean z) {
        ArrayMap<String, View> arrayMap = new ArrayMap<>();
        if (this.mSharedElementSourceNames != null) {
            FragmentTransitionCompat21.findNamedViews(arrayMap, fragment.getView());
            if (z) {
                arrayMap.retainAll(this.mSharedElementTargetNames);
            } else {
                arrayMap = remapNames(this.mSharedElementSourceNames, this.mSharedElementTargetNames, arrayMap);
            }
        }
        if (z) {
            if (fragment.mEnterTransitionCallback != null) {
                fragment.mEnterTransitionCallback.onMapSharedElements(this.mSharedElementTargetNames, arrayMap);
            }
            setBackNameOverrides(transitionState, arrayMap, SUPPORTS_TRANSITIONS);
        } else {
            if (fragment.mExitTransitionCallback != null) {
                fragment.mExitTransitionCallback.onMapSharedElements(this.mSharedElementTargetNames, arrayMap);
            }
            setNameOverrides(transitionState, arrayMap, (boolean) SUPPORTS_TRANSITIONS);
        }
        return arrayMap;
    }

    private boolean configureTransitions(int i, TransitionState transitionState, boolean z, SparseArray<Fragment> sparseArray, SparseArray<Fragment> sparseArray2) {
        ViewGroup viewGroup = (ViewGroup) this.mManager.mContainer.onFindViewById(i);
        if (viewGroup == null) {
            return SUPPORTS_TRANSITIONS;
        }
        Fragment fragment = (Fragment) sparseArray2.get(i);
        Fragment fragment2 = (Fragment) sparseArray.get(i);
        Object enterTransition = getEnterTransition(fragment, z);
        Object sharedElementTransition = getSharedElementTransition(fragment, fragment2, z);
        Object exitTransition = getExitTransition(fragment2, z);
        ArrayMap arrayMap = null;
        ArrayList arrayList = new ArrayList();
        if (sharedElementTransition != null) {
            arrayMap = remapSharedElements(transitionState, fragment2, z);
            if (arrayMap.isEmpty()) {
                sharedElementTransition = null;
                arrayMap = null;
            } else {
                SharedElementCallback sharedElementCallback = z ? fragment2.mEnterTransitionCallback : fragment.mEnterTransitionCallback;
                if (sharedElementCallback != null) {
                    ArrayList arrayList2 = new ArrayList(arrayMap.keySet());
                    ArrayList arrayList3 = new ArrayList(arrayMap.values());
                    sharedElementCallback.onSharedElementStart(arrayList2, arrayList3, null);
                }
                prepareSharedElementTransition(transitionState, viewGroup, sharedElementTransition, fragment, fragment2, z, arrayList);
            }
        }
        if (enterTransition == null && sharedElementTransition == null && exitTransition == null) {
            return SUPPORTS_TRANSITIONS;
        }
        ArrayList arrayList4 = new ArrayList();
        Object captureExitingViews = captureExitingViews(exitTransition, fragment2, arrayList4, arrayMap, transitionState.nonExistentView);
        if (!(this.mSharedElementTargetNames == null || arrayMap == null)) {
            View view = (View) arrayMap.get(this.mSharedElementTargetNames.get(0));
            if (view != null) {
                if (captureExitingViews != null) {
                    FragmentTransitionCompat21.setEpicenter(captureExitingViews, view);
                }
                if (sharedElementTransition != null) {
                    FragmentTransitionCompat21.setEpicenter(sharedElementTransition, view);
                }
            }
        }
        final Fragment fragment3 = fragment;
        C00051 r0 = new ViewRetriever() {
            public View getView() {
                return fragment3.getView();
            }
        };
        ArrayList arrayList5 = new ArrayList();
        ArrayMap arrayMap2 = new ArrayMap();
        boolean z2 = true;
        if (fragment != null) {
            z2 = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        Object mergeTransitions = FragmentTransitionCompat21.mergeTransitions(enterTransition, captureExitingViews, sharedElementTransition, z2);
        if (mergeTransitions != null) {
            FragmentTransitionCompat21.addTransitionTargets(enterTransition, sharedElementTransition, viewGroup, r0, transitionState.nonExistentView, transitionState.enteringEpicenterView, transitionState.nameOverrides, arrayList5, arrayMap, arrayMap2, arrayList);
            excludeHiddenFragmentsAfterEnter(viewGroup, transitionState, i, mergeTransitions);
            FragmentTransitionCompat21.excludeTarget(mergeTransitions, transitionState.nonExistentView, true);
            excludeHiddenFragments(transitionState, i, mergeTransitions);
            FragmentTransitionCompat21.beginDelayedTransition(viewGroup, mergeTransitions);
            FragmentTransitionCompat21.cleanupTransitions(viewGroup, transitionState.nonExistentView, enterTransition, arrayList5, captureExitingViews, arrayList4, sharedElementTransition, arrayList, mergeTransitions, transitionState.hiddenFragmentViews, arrayMap2);
        }
        if (mergeTransitions != null) {
            return true;
        }
        return SUPPORTS_TRANSITIONS;
    }

    private void prepareSharedElementTransition(TransitionState transitionState, View view, Object obj, Fragment fragment, Fragment fragment2, boolean z, ArrayList<View> arrayList) {
        final View view2 = view;
        final Object obj2 = obj;
        final ArrayList<View> arrayList2 = arrayList;
        final TransitionState transitionState2 = transitionState;
        final boolean z2 = z;
        final Fragment fragment3 = fragment;
        final Fragment fragment4 = fragment2;
        view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public boolean onPreDraw() {
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                if (obj2 != null) {
                    FragmentTransitionCompat21.removeTargets(obj2, arrayList2);
                    arrayList2.clear();
                    ArrayMap access$000 = BackStackRecord.this.mapSharedElementsIn(transitionState2, z2, fragment3);
                    FragmentTransitionCompat21.setSharedElementTargets(obj2, transitionState2.nonExistentView, access$000, arrayList2);
                    BackStackRecord.this.setEpicenterIn(access$000, transitionState2);
                    BackStackRecord.this.callSharedElementEnd(transitionState2, fragment3, fragment4, z2, access$000);
                }
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    public void callSharedElementEnd(TransitionState transitionState, Fragment fragment, Fragment fragment2, boolean z, ArrayMap<String, View> arrayMap) {
        SharedElementCallback sharedElementCallback = z ? fragment2.mEnterTransitionCallback : fragment.mEnterTransitionCallback;
        if (sharedElementCallback != null) {
            sharedElementCallback.onSharedElementEnd(new ArrayList(arrayMap.keySet()), new ArrayList(arrayMap.values()), null);
        }
    }

    /* access modifiers changed from: private */
    public void setEpicenterIn(ArrayMap<String, View> arrayMap, TransitionState transitionState) {
        if (this.mSharedElementTargetNames != null && !arrayMap.isEmpty()) {
            View view = (View) arrayMap.get(this.mSharedElementTargetNames.get(0));
            if (view != null) {
                transitionState.enteringEpicenterView.epicenter = view;
            }
        }
    }

    /* access modifiers changed from: private */
    public ArrayMap<String, View> mapSharedElementsIn(TransitionState transitionState, boolean z, Fragment fragment) {
        ArrayMap<String, View> mapEnteringSharedElements = mapEnteringSharedElements(transitionState, fragment, z);
        if (z) {
            if (fragment.mExitTransitionCallback != null) {
                fragment.mExitTransitionCallback.onMapSharedElements(this.mSharedElementTargetNames, mapEnteringSharedElements);
            }
            setBackNameOverrides(transitionState, mapEnteringSharedElements, true);
        } else {
            if (fragment.mEnterTransitionCallback != null) {
                fragment.mEnterTransitionCallback.onMapSharedElements(this.mSharedElementTargetNames, mapEnteringSharedElements);
            }
            setNameOverrides(transitionState, mapEnteringSharedElements, true);
        }
        return mapEnteringSharedElements;
    }

    private static ArrayMap<String, View> remapNames(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayMap<String, View> arrayMap) {
        if (arrayMap.isEmpty()) {
            return arrayMap;
        }
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayMap.get(arrayList.get(i));
            if (view != null) {
                arrayMap2.put(arrayList2.get(i), view);
            }
        }
        return arrayMap2;
    }

    private ArrayMap<String, View> mapEnteringSharedElements(TransitionState transitionState, Fragment fragment, boolean z) {
        ArrayMap<String, View> arrayMap = new ArrayMap<>();
        View view = fragment.getView();
        if (view == null || this.mSharedElementSourceNames == null) {
            return arrayMap;
        }
        FragmentTransitionCompat21.findNamedViews(arrayMap, view);
        if (z) {
            return remapNames(this.mSharedElementSourceNames, this.mSharedElementTargetNames, arrayMap);
        }
        arrayMap.retainAll(this.mSharedElementTargetNames);
        return arrayMap;
    }

    private void excludeHiddenFragmentsAfterEnter(View view, TransitionState transitionState, int i, Object obj) {
        final View view2 = view;
        final TransitionState transitionState2 = transitionState;
        final int i2 = i;
        final Object obj2 = obj;
        view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public boolean onPreDraw() {
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                BackStackRecord.this.excludeHiddenFragments(transitionState2, i2, obj2);
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    public void excludeHiddenFragments(TransitionState transitionState, int i, Object obj) {
        if (this.mManager.mAdded != null) {
            for (int i2 = 0; i2 < this.mManager.mAdded.size(); i2++) {
                Fragment fragment = (Fragment) this.mManager.mAdded.get(i2);
                if (!(fragment.mView == null || fragment.mContainer == null || fragment.mContainerId != i)) {
                    if (!fragment.mHidden) {
                        FragmentTransitionCompat21.excludeTarget(obj, fragment.mView, SUPPORTS_TRANSITIONS);
                        transitionState.hiddenFragmentViews.remove(fragment.mView);
                    } else if (!transitionState.hiddenFragmentViews.contains(fragment.mView)) {
                        FragmentTransitionCompat21.excludeTarget(obj, fragment.mView, true);
                        transitionState.hiddenFragmentViews.add(fragment.mView);
                    }
                }
            }
        }
    }

    private static void setNameOverride(ArrayMap<String, String> arrayMap, String str, String str2) {
        if (!(str == null || str2 == null)) {
            for (int i = 0; i < arrayMap.size(); i++) {
                if (str.equals(arrayMap.valueAt(i))) {
                    arrayMap.setValueAt(i, str2);
                    return;
                }
            }
            arrayMap.put(str, str2);
        }
    }

    private static void setNameOverrides(TransitionState transitionState, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                setNameOverride(transitionState.nameOverrides, (String) arrayList.get(i), (String) arrayList2.get(i));
            }
        }
    }

    private void setBackNameOverrides(TransitionState transitionState, ArrayMap<String, View> arrayMap, boolean z) {
        int size = this.mSharedElementTargetNames == null ? 0 : this.mSharedElementTargetNames.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.mSharedElementSourceNames.get(i);
            View view = (View) arrayMap.get((String) this.mSharedElementTargetNames.get(i));
            if (view != null) {
                String transitionName = FragmentTransitionCompat21.getTransitionName(view);
                if (z) {
                    setNameOverride(transitionState.nameOverrides, str, transitionName);
                } else {
                    setNameOverride(transitionState.nameOverrides, transitionName, str);
                }
            }
        }
    }

    private void setNameOverrides(TransitionState transitionState, ArrayMap<String, View> arrayMap, boolean z) {
        int size = arrayMap.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayMap.keyAt(i);
            String transitionName = FragmentTransitionCompat21.getTransitionName((View) arrayMap.valueAt(i));
            if (z) {
                setNameOverride(transitionState.nameOverrides, str, transitionName);
            } else {
                setNameOverride(transitionState.nameOverrides, transitionName, str);
            }
        }
    }
}

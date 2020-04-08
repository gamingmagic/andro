package android.support.p000v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.BackStackState */
final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new Creator<BackStackState>() {
        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public final BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    };
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int[] mOps;
    final ArrayList<String> mSharedElementSourceNames;
    final ArrayList<String> mSharedElementTargetNames;
    final int mTransition;
    final int mTransitionStyle;

    public BackStackState(BackStackRecord backStackRecord) {
        int i = 0;
        for (C0008Op op = backStackRecord.mHead; op != null; op = op.next) {
            if (op.removed != null) {
                i += op.removed.size();
            }
        }
        this.mOps = new int[((backStackRecord.mNumOp * 7) + i)];
        if (!backStackRecord.mAddToBackStack) {
            throw new IllegalStateException("Not on back stack");
        }
        int i2 = 0;
        for (C0008Op op2 = backStackRecord.mHead; op2 != null; op2 = op2.next) {
            int i3 = i2;
            int i4 = i2 + 1;
            this.mOps[i3] = op2.cmd;
            int i5 = i4;
            int i6 = i4 + 1;
            this.mOps[i5] = op2.fragment != null ? op2.fragment.mIndex : -1;
            int i7 = i6;
            int i8 = i6 + 1;
            this.mOps[i7] = op2.enterAnim;
            int i9 = i8;
            int i10 = i8 + 1;
            this.mOps[i9] = op2.exitAnim;
            int i11 = i10;
            int i12 = i10 + 1;
            this.mOps[i11] = op2.popEnterAnim;
            int i13 = i12;
            int i14 = i12 + 1;
            this.mOps[i13] = op2.popExitAnim;
            if (op2.removed != null) {
                int size = op2.removed.size();
                int i15 = i14;
                i2 = i14 + 1;
                this.mOps[i15] = size;
                for (int i16 = 0; i16 < size; i16++) {
                    int i17 = i2;
                    i2++;
                    this.mOps[i17] = ((Fragment) op2.removed.get(i16)).mIndex;
                }
            } else {
                int i18 = i14;
                i2 = i14 + 1;
                this.mOps[i18] = 0;
            }
        }
        this.mTransition = backStackRecord.mTransition;
        this.mTransitionStyle = backStackRecord.mTransitionStyle;
        this.mName = backStackRecord.mName;
        this.mIndex = backStackRecord.mIndex;
        this.mBreadCrumbTitleRes = backStackRecord.mBreadCrumbTitleRes;
        this.mBreadCrumbTitleText = backStackRecord.mBreadCrumbTitleText;
        this.mBreadCrumbShortTitleRes = backStackRecord.mBreadCrumbShortTitleRes;
        this.mBreadCrumbShortTitleText = backStackRecord.mBreadCrumbShortTitleText;
        this.mSharedElementSourceNames = backStackRecord.mSharedElementSourceNames;
        this.mSharedElementTargetNames = backStackRecord.mSharedElementTargetNames;
    }

    public BackStackState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mTransitionStyle = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        this.mBreadCrumbTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
    }

    public final BackStackRecord instantiate(FragmentManagerImpl fragmentManagerImpl) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManagerImpl);
        int i = 0;
        int i2 = 0;
        while (i < this.mOps.length) {
            C0008Op op = new C0008Op();
            int i3 = i;
            int i4 = i + 1;
            op.cmd = this.mOps[i3];
            if (FragmentManagerImpl.DEBUG) {
                new StringBuilder("Instantiate ").append(backStackRecord).append(" op #").append(i2).append(" base fragment #").append(this.mOps[i4]);
            }
            int i5 = i4;
            int i6 = i4 + 1;
            int i7 = this.mOps[i5];
            if (i7 >= 0) {
                op.fragment = (Fragment) fragmentManagerImpl.mActive.get(i7);
            } else {
                op.fragment = null;
            }
            int i8 = i6;
            int i9 = i6 + 1;
            op.enterAnim = this.mOps[i8];
            int i10 = i9;
            int i11 = i9 + 1;
            op.exitAnim = this.mOps[i10];
            int i12 = i11;
            int i13 = i11 + 1;
            op.popEnterAnim = this.mOps[i12];
            int i14 = i13;
            int i15 = i13 + 1;
            op.popExitAnim = this.mOps[i14];
            int i16 = i15;
            i = i15 + 1;
            int i17 = this.mOps[i16];
            if (i17 > 0) {
                op.removed = new ArrayList<>(i17);
                for (int i18 = 0; i18 < i17; i18++) {
                    if (FragmentManagerImpl.DEBUG) {
                        new StringBuilder("Instantiate ").append(backStackRecord).append(" set remove fragment #").append(this.mOps[i]);
                    }
                    int i19 = i;
                    i++;
                    op.removed.add((Fragment) fragmentManagerImpl.mActive.get(this.mOps[i19]));
                }
            }
            backStackRecord.addOp(op);
            i2++;
        }
        backStackRecord.mTransition = this.mTransition;
        backStackRecord.mTransitionStyle = this.mTransitionStyle;
        backStackRecord.mName = this.mName;
        backStackRecord.mIndex = this.mIndex;
        backStackRecord.mAddToBackStack = true;
        backStackRecord.mBreadCrumbTitleRes = this.mBreadCrumbTitleRes;
        backStackRecord.mBreadCrumbTitleText = this.mBreadCrumbTitleText;
        backStackRecord.mBreadCrumbShortTitleRes = this.mBreadCrumbShortTitleRes;
        backStackRecord.mBreadCrumbShortTitleText = this.mBreadCrumbShortTitleText;
        backStackRecord.mSharedElementSourceNames = this.mSharedElementSourceNames;
        backStackRecord.mSharedElementTargetNames = this.mSharedElementTargetNames;
        backStackRecord.bumpBackStackNesting(1);
        return backStackRecord;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.mOps);
        parcel.writeInt(this.mTransition);
        parcel.writeInt(this.mTransitionStyle);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
    }

    static {
    }
}

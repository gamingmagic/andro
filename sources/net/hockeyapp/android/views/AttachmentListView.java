package net.hockeyapp.android.views;

import android.content.Context;
import android.net.Uri;
import android.support.p000v4.widget.ExploreByTouchHelper;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import p004o.adc;

public class AttachmentListView extends ViewGroup {

    /* renamed from: 鷭 */
    private int f100;

    public AttachmentListView(Context context) {
        super(context);
    }

    public AttachmentListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: 鷭 */
    public final ArrayList<Uri> mo3424() {
        ArrayList<Uri> arrayList = new ArrayList<>();
        for (int i = 0; i < getChildCount(); i++) {
            arrayList.add(((adc) getChildAt(i)).f353);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            View view = childAt;
            adc adc = (adc) childAt;
            i3 = (adc.f351 == 1 ? adc.f345 : adc.f343) + adc.getPaddingTop();
            if (view.getVisibility() != 8) {
                LayoutParams layoutParams = view.getLayoutParams();
                view.measure(MeasureSpec.makeMeasureSpec(size, ExploreByTouchHelper.INVALID_ID), MeasureSpec.makeMeasureSpec(i3, ExploreByTouchHelper.INVALID_ID));
                int measuredWidth = view.getMeasuredWidth();
                i4 = Math.max(i4, view.getMeasuredHeight() + layoutParams.height);
                if (paddingLeft + measuredWidth > size) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += i4;
                }
                paddingLeft += layoutParams.width + measuredWidth;
            }
        }
        this.f100 = i4;
        if (MeasureSpec.getMode(i2) == 0) {
            i3 = paddingTop + i4 + getPaddingBottom();
        } else if (MeasureSpec.getMode(i2) == Integer.MIN_VALUE && paddingTop + i4 + getPaddingBottom() < i3) {
            i3 = paddingTop + i4 + getPaddingBottom();
        }
        setMeasuredDimension(size, i3);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(1, 1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                childAt.invalidate();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (paddingLeft + measuredWidth > i5) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += this.f100;
                }
                childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
                paddingLeft += layoutParams.width + measuredWidth + ((adc) childAt).f346;
            }
        }
    }
}

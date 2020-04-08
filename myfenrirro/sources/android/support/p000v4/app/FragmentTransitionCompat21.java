package android.support.p000v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.support.v4.app.FragmentTransitionCompat21 */
class FragmentTransitionCompat21 {

    /* renamed from: android.support.v4.app.FragmentTransitionCompat21$EpicenterView */
    public static class EpicenterView {
        public View epicenter;
    }

    /* renamed from: android.support.v4.app.FragmentTransitionCompat21$ViewRetriever */
    public interface ViewRetriever {
        View getView();
    }

    FragmentTransitionCompat21() {
    }

    public static String getTransitionName(View view) {
        return view.getTransitionName();
    }

    public static Object cloneTransition(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return obj;
    }

    public static Object captureExitingViews(Object obj, View view, ArrayList<View> arrayList, Map<String, View> map, View view2) {
        if (obj == null) {
            return obj;
        }
        captureTransitioningViews(arrayList, view);
        if (map != null) {
            arrayList.removeAll(map.values());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.add(view2);
        addTargets((Transition) obj, arrayList);
        return obj;
    }

    public static void excludeTarget(Object obj, View view, boolean z) {
        ((Transition) obj).excludeTarget(view, z);
    }

    public static void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public static void setEpicenter(Object obj, View view) {
        Transition transition = (Transition) obj;
        final Rect boundsOnScreen = getBoundsOnScreen(view);
        transition.setEpicenterCallback(new EpicenterCallback() {
            public final Rect onGetEpicenter(Transition transition) {
                return boundsOnScreen;
            }
        });
    }

    public static Object wrapSharedElementTransition(Object obj) {
        if (obj == null) {
            return null;
        }
        Transition transition = (Transition) obj;
        Transition transition2 = transition;
        if (transition == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    public static void addTransitionTargets(Object obj, Object obj2, View view, ViewRetriever viewRetriever, View view2, EpicenterView epicenterView, Map<String, String> map, ArrayList<View> arrayList, Map<String, View> map2, Map<String, View> map3, ArrayList<View> arrayList2) {
        if (obj != null || obj2 != null) {
            Transition transition = (Transition) obj;
            Transition transition2 = transition;
            if (transition != null) {
                transition2.addTarget(view2);
            }
            if (obj2 != null) {
                setSharedElementTargets(obj2, view2, map2, arrayList2);
            }
            if (viewRetriever != null) {
                final View view3 = view;
                final Transition transition3 = transition2;
                final View view4 = view2;
                final ViewRetriever viewRetriever2 = viewRetriever;
                final Map<String, String> map4 = map;
                final Map<String, View> map5 = map3;
                final ArrayList<View> arrayList3 = arrayList;
                view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        view3.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (transition3 != null) {
                            transition3.removeTarget(view4);
                        }
                        View view = viewRetriever2.getView();
                        if (view != null) {
                            if (!map4.isEmpty()) {
                                FragmentTransitionCompat21.findNamedViews(map5, view);
                                map5.keySet().retainAll(map4.values());
                                for (Entry entry : map4.entrySet()) {
                                    View view2 = (View) map5.get((String) entry.getValue());
                                    if (view2 != null) {
                                        view2.setTransitionName((String) entry.getKey());
                                    }
                                }
                            }
                            if (transition3 != null) {
                                FragmentTransitionCompat21.captureTransitioningViews(arrayList3, view);
                                arrayList3.removeAll(map5.values());
                                arrayList3.add(view4);
                                FragmentTransitionCompat21.addTargets(transition3, arrayList3);
                            }
                        }
                        return true;
                    }
                });
            }
            setSharedElementEpicenter(transition2, epicenterView);
        }
    }

    public static Object mergeTransitions(Object obj, Object obj2, Object obj3, boolean z) {
        boolean z2 = true;
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (!(transition == null || transition2 == null)) {
            z2 = z;
        }
        if (z2) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            if (transition2 != null) {
                transitionSet.addTransition(transition2);
            }
            if (transition3 != null) {
                transitionSet.addTransition(transition3);
            }
            return transitionSet;
        }
        Transition transition4 = null;
        if (transition2 != null && transition != null) {
            transition4 = new TransitionSet().addTransition(transition2).addTransition(transition).setOrdering(1);
        } else if (transition2 != null) {
            transition4 = transition2;
        } else if (transition != null) {
            transition4 = transition;
        }
        if (transition3 == null) {
            return transition4;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition4 != null) {
            transitionSet2.addTransition(transition4);
        }
        transitionSet2.addTransition(transition3);
        return transitionSet2;
    }

    public static void setSharedElementTargets(Object obj, View view, Map<String, View> map, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        arrayList.clear();
        arrayList.addAll(map.values());
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bfsAddViewChildren(targets, (View) arrayList.get(i));
        }
        arrayList.add(view);
        addTargets(transitionSet, arrayList);
    }

    private static void bfsAddViewChildren(List<View> list, View view) {
        int size = list.size();
        if (!containedBeforeIndex(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    ViewGroup viewGroup2 = viewGroup;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup2.getChildAt(i2);
                        if (!containedBeforeIndex(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean containedBeforeIndex(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    private static void setSharedElementEpicenter(Transition transition, final EpicenterView epicenterView) {
        if (transition != null) {
            transition.setEpicenterCallback(new EpicenterCallback() {
                private Rect mEpicenter;

                public final Rect onGetEpicenter(Transition transition) {
                    if (this.mEpicenter == null && epicenterView.epicenter != null) {
                        this.mEpicenter = FragmentTransitionCompat21.getBoundsOnScreen(epicenterView.epicenter);
                    }
                    return this.mEpicenter;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static Rect getBoundsOnScreen(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    /* access modifiers changed from: private */
    public static void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup.isTransitionGroup()) {
                    arrayList.add(viewGroup2);
                    return;
                }
                int childCount = viewGroup2.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    captureTransitioningViews(arrayList, viewGroup2.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    public static void findNamedViews(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroup viewGroup2 = viewGroup;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    findNamedViews(map, viewGroup2.getChildAt(i));
                }
            }
        }
    }

    public static void cleanupTransitions(View view, View view2, Object obj, ArrayList<View> arrayList, Object obj2, ArrayList<View> arrayList2, Object obj3, ArrayList<View> arrayList3, Object obj4, ArrayList<View> arrayList4, Map<String, View> map) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        Transition transition4 = (Transition) obj4;
        Transition transition5 = transition4;
        if (transition4 != null) {
            final View view3 = view;
            final Transition transition6 = transition;
            final ArrayList<View> arrayList5 = arrayList;
            final Transition transition7 = transition2;
            final ArrayList<View> arrayList6 = arrayList2;
            final Transition transition8 = transition3;
            final ArrayList<View> arrayList7 = arrayList3;
            final Map<String, View> map2 = map;
            final ArrayList<View> arrayList8 = arrayList4;
            final Transition transition9 = transition5;
            final View view4 = view2;
            view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    view3.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (transition6 != null) {
                        FragmentTransitionCompat21.removeTargets(transition6, arrayList5);
                    }
                    if (transition7 != null) {
                        FragmentTransitionCompat21.removeTargets(transition7, arrayList6);
                    }
                    if (transition8 != null) {
                        FragmentTransitionCompat21.removeTargets(transition8, arrayList7);
                    }
                    for (Entry entry : map2.entrySet()) {
                        ((View) entry.getValue()).setTransitionName((String) entry.getKey());
                    }
                    int size = arrayList8.size();
                    for (int i = 0; i < size; i++) {
                        transition9.excludeTarget((View) arrayList8.get(i), false);
                    }
                    transition9.excludeTarget(view4, false);
                    return true;
                }
            });
        }
    }

    public static void removeTargets(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        Transition transition2 = transition;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition2;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                removeTargets(transitionSet.getTransitionAt(i), arrayList);
            }
            return;
        }
        if (!hasSimpleTarget(transition2)) {
            List targets = transition2.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition2.removeTarget((View) arrayList.get(size));
                }
            }
        }
    }

    public static void addTargets(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        Transition transition2 = transition;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition2;
            TransitionSet transitionSet2 = transitionSet;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                addTargets(transitionSet2.getTransitionAt(i), arrayList);
            }
            return;
        }
        if (!hasSimpleTarget(transition2) && isNullOrEmpty(transition2.getTargets())) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                transition2.addTarget((View) arrayList.get(i2));
            }
        }
    }

    private static boolean hasSimpleTarget(Transition transition) {
        return !isNullOrEmpty(transition.getTargetIds()) || !isNullOrEmpty(transition.getTargetNames()) || !isNullOrEmpty(transition.getTargetTypes());
    }

    private static boolean isNullOrEmpty(List list) {
        return list == null || list.isEmpty();
    }
}

package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import i0.c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class u0 {
    public static void d(List<View> list, View view) {
        boolean z10;
        boolean z11;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = false;
                break;
            } else if (list.get(i10) == view) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            return;
        }
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (z.i.k(view) != null) {
            list.add(view);
        }
        for (int i11 = size; i11 < list.size(); i11++) {
            View view2 = list.get(i11);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            z11 = false;
                            break;
                        } else if (list.get(i13) == childAt) {
                            z11 = true;
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (!z11 && z.i.k(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean h(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public final void g(View view, Rect rect) {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (!z.g.b(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        int[] iArr = new int[2];
        view.getRootView().getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public abstract Object i(Object obj, Object obj2, Object obj3);

    public abstract Object j(Object obj, Object obj2);

    public abstract void k(Object obj, View view, ArrayList<View> arrayList);

    public abstract void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract void m(Object obj, Rect rect);

    public abstract void n(Object obj, View view);

    public void o(Object obj, c cVar, Runnable runnable) {
        ((m) runnable).run();
    }

    public abstract void p(Object obj, View view, ArrayList<View> arrayList);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object r(Object obj);
}

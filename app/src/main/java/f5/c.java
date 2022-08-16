package f5;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c4.a;
import java.util.List;
import java.util.WeakHashMap;
import m0.e;
import m0.f0;
import m0.l0;
import m0.z;

/* loaded from: classes.dex */
public abstract class c extends d<View> {

    /* renamed from: c */
    public final Rect f4539c = new Rect();

    /* renamed from: d */
    public final Rect f4540d = new Rect();

    /* renamed from: e */
    public int f4541e = 0;

    /* renamed from: f */
    public int f4542f;

    public c() {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        View v10;
        l0 lastWindowInsets;
        int i13 = view.getLayoutParams().height;
        if ((i13 == -1 || i13 == -2) && (v10 = v(coordinatorLayout.d(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                if (z.d.b(v10) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.c() + lastWindowInsets.f();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            coordinatorLayout.s(view, i10, i11, View.MeasureSpec.makeMeasureSpec((x(v10) + size) - v10.getMeasuredHeight(), i13 == -1 ? 1073741824 : Integer.MIN_VALUE));
            return true;
        }
        return false;
    }

    @Override // f5.d
    public final void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View v10 = v(coordinatorLayout.d(view));
        int i11 = 0;
        if (v10 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f4539c;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, v10.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((v10.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            l0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                if (z.d.b(coordinatorLayout) && !z.d.b(view)) {
                    rect.left = lastWindowInsets.d() + rect.left;
                    rect.right -= lastWindowInsets.e();
                }
            }
            Rect rect2 = this.f4540d;
            int i12 = fVar.f1244c;
            if (i12 == 0) {
                i12 = 8388659;
            }
            e.b(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            if (this.f4542f != 0) {
                float w10 = w(v10);
                int i13 = this.f4542f;
                i11 = a.b((int) (w10 * i13), 0, i13);
            }
            view.layout(rect2.left, rect2.top - i11, rect2.right, rect2.bottom - i11);
            this.f4541e = rect2.top - v10.getBottom();
            return;
        }
        coordinatorLayout.r(view, i10);
        this.f4541e = 0;
    }

    public abstract View v(List<View> list);

    public float w(View view) {
        return 1.0f;
    }

    public int x(View view) {
        return view.getMeasuredHeight();
    }
}

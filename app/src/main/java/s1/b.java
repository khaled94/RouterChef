package s1;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import m0.l0;
import m0.q;
import m0.z;

/* loaded from: classes.dex */
public final class b implements q {

    /* renamed from: a */
    public final Rect f17593a = new Rect();

    /* renamed from: b */
    public final /* synthetic */ ViewPager f17594b;

    public b(ViewPager viewPager) {
        this.f17594b = viewPager;
    }

    @Override // m0.q
    public final l0 a(View view, l0 l0Var) {
        l0 k10 = z.k(view, l0Var);
        if (k10.h()) {
            return k10;
        }
        Rect rect = this.f17593a;
        rect.left = k10.d();
        rect.top = k10.f();
        rect.right = k10.e();
        rect.bottom = k10.c();
        int childCount = this.f17594b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            l0 c10 = z.c(this.f17594b.getChildAt(i10), k10);
            rect.left = Math.min(c10.d(), rect.left);
            rect.top = Math.min(c10.f(), rect.top);
            rect.right = Math.min(c10.e(), rect.right);
            rect.bottom = Math.min(c10.c(), rect.bottom);
        }
        return k10.i(rect.left, rect.top, rect.right, rect.bottom);
    }
}

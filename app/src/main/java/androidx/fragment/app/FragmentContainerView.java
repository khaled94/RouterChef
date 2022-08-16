package androidx.fragment.app;

import a0.a;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.raouf.routerchef.R;
import e0.d;
import e9.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.l0;
import m0.z;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: u */
    public View.OnApplyWindowInsetsListener f1359u;

    /* renamed from: s */
    public final List<View> f1357s = new ArrayList();

    /* renamed from: t */
    public final List<View> f1358t = new ArrayList();

    /* renamed from: v */
    public boolean f1360v = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        f.e(context, "context");
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f8z, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final void a(View view) {
        if (this.f1358t.contains(view)) {
            this.f1357s.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        f.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof o ? (o) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        l0 l0Var;
        f.e(windowInsets, "insets");
        l0 l10 = l0.l(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1359u;
        if (onApplyWindowInsetsListener != null) {
            f.c(onApplyWindowInsetsListener);
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            f.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            l0Var = l0.l(onApplyWindowInsets, null);
        } else {
            l0Var = z.k(this, l10);
        }
        f.d(l0Var, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!l0Var.h()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                z.c(getChildAt(i10), l0Var);
            }
        }
        return windowInsets;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        f.e(canvas, "canvas");
        if (this.f1360v) {
            Iterator it = this.f1357s.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        f.e(canvas, "canvas");
        f.e(view, "child");
        if (!this.f1360v || !(!this.f1357s.isEmpty()) || !this.f1357s.contains(view)) {
            return super.drawChild(canvas, view, j3);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        f.e(view, "view");
        this.f1358t.remove(view);
        if (this.f1357s.remove(view)) {
            this.f1360v = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v14 */
    public final <F extends o> F getFragment() {
        o oVar;
        g0 g0Var;
        t tVar = null;
        FragmentContainerView fragmentContainerView = this;
        while (true) {
            if (fragmentContainerView == 0) {
                oVar = null;
                break;
            }
            Object tag = fragmentContainerView.getTag(R.id.fragment_container_view_tag);
            oVar = tag instanceof o ? (o) tag : null;
            if (oVar != null) {
                break;
            }
            ViewParent parent = fragmentContainerView.getParent();
            fragmentContainerView = parent instanceof View ? (View) parent : 0;
        }
        if (oVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof t) {
                    tVar = (t) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (tVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            g0Var = tVar.J();
        } else if (!oVar.z()) {
            throw new IllegalStateException("The Fragment " + oVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        } else {
            g0Var = oVar.k();
        }
        return (F) g0Var.E(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        f.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            View childAt = getChildAt(childCount);
            f.d(childAt, "view");
            a(childAt);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        f.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        f.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        f.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            f.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            f.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f1360v = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        f.e(onApplyWindowInsetsListener, "listener");
        this.f1359u = onApplyWindowInsetsListener;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        f.e(view, "view");
        if (view.getParent() == this) {
            this.f1358t.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, g0 g0Var) {
        super(context, attributeSet);
        View view;
        f.e(context, "context");
        f.e(attributeSet, "attrs");
        f.e(g0Var, "fm");
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f8z, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        o E = g0Var.E(id);
        if (classAttribute != null && E == null) {
            if (id == -1) {
                throw new IllegalStateException(d.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? d7.a.c(" with tag ", string) : ""));
            }
            o a10 = g0Var.H().a(context.getClassLoader(), classAttribute);
            f.d(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.L();
            b bVar = new b(g0Var);
            bVar.p = true;
            a10.V = this;
            bVar.d(getId(), a10, string, 1);
            if (!bVar.f1544g) {
                bVar.f1545h = false;
                bVar.f1364q.B(bVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = ((ArrayList) g0Var.f1401c.e()).iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            o oVar = m0Var.f1477c;
            if (oVar.O == getId() && (view = oVar.W) != null && view.getParent() == null) {
                oVar.V = this;
                m0Var.b();
            }
        }
    }
}

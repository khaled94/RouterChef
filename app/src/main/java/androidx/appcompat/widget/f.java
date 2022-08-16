package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final View f824a;

    /* renamed from: d */
    public d1 f827d;

    /* renamed from: e */
    public d1 f828e;

    /* renamed from: f */
    public d1 f829f;

    /* renamed from: c */
    public int f826c = -1;

    /* renamed from: b */
    public final l f825b = l.a();

    public f(View view) {
        this.f824a = view;
    }

    public final void a() {
        Drawable background = this.f824a.getBackground();
        if (background != null) {
            boolean z10 = true;
            if (this.f827d != null) {
                if (this.f829f == null) {
                    this.f829f = new d1();
                }
                d1 d1Var = this.f829f;
                d1Var.f816a = null;
                d1Var.f819d = false;
                d1Var.f817b = null;
                d1Var.f818c = false;
                View view = this.f824a;
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                ColorStateList g10 = z.i.g(view);
                if (g10 != null) {
                    d1Var.f819d = true;
                    d1Var.f816a = g10;
                }
                PorterDuff.Mode h10 = z.i.h(this.f824a);
                if (h10 != null) {
                    d1Var.f818c = true;
                    d1Var.f817b = h10;
                }
                if (d1Var.f819d || d1Var.f818c) {
                    l.f(background, d1Var, this.f824a.getDrawableState());
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
            }
            d1 d1Var2 = this.f828e;
            if (d1Var2 != null) {
                l.f(background, d1Var2, this.f824a.getDrawableState());
                return;
            }
            d1 d1Var3 = this.f827d;
            if (d1Var3 == null) {
                return;
            }
            l.f(background, d1Var3, this.f824a.getDrawableState());
        }
    }

    public final ColorStateList b() {
        d1 d1Var = this.f828e;
        if (d1Var != null) {
            return d1Var.f816a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        d1 d1Var = this.f828e;
        if (d1Var != null) {
            return d1Var.f817b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        Context context = this.f824a.getContext();
        int[] iArr = a6.f.S;
        f1 q10 = f1.q(context, attributeSet, iArr, i10);
        View view = this.f824a;
        z.o(view, view.getContext(), iArr, attributeSet, q10.f848b, i10);
        try {
            if (q10.o(0)) {
                this.f826c = q10.l(0, -1);
                ColorStateList d5 = this.f825b.d(this.f824a.getContext(), this.f826c);
                if (d5 != null) {
                    g(d5);
                }
            }
            if (q10.o(1)) {
                z.i.q(this.f824a, q10.c(1));
            }
            if (q10.o(2)) {
                z.i.r(this.f824a, m0.e(q10.j(2, -1), null));
            }
        } finally {
            q10.r();
        }
    }

    public final void e() {
        this.f826c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        this.f826c = i10;
        l lVar = this.f825b;
        g(lVar != null ? lVar.d(this.f824a.getContext(), i10) : null);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f827d == null) {
                this.f827d = new d1();
            }
            d1 d1Var = this.f827d;
            d1Var.f816a = colorStateList;
            d1Var.f819d = true;
        } else {
            this.f827d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f828e == null) {
            this.f828e = new d1();
        }
        d1 d1Var = this.f828e;
        d1Var.f816a = colorStateList;
        d1Var.f819d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f828e == null) {
            this.f828e = new d1();
        }
        d1 d1Var = this.f828e;
        d1Var.f817b = mode;
        d1Var.f818c = true;
        a();
    }
}

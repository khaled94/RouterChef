package m4;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import d4.m;
import java.util.Collections;
import k4.a;
import k4.b;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class fy0 extends cz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, iu {

    /* renamed from: s */
    public View f8670s;

    /* renamed from: t */
    public lq f8671t;

    /* renamed from: u */
    public av0 f8672u;

    /* renamed from: v */
    public boolean f8673v = false;

    /* renamed from: w */
    public boolean f8674w = false;

    public fy0(av0 av0Var, ev0 ev0Var) {
        this.f8670s = ev0Var.j();
        this.f8671t = ev0Var.k();
        this.f8672u = av0Var;
        if (ev0Var.p() != null) {
            ev0Var.p().O(this);
        }
    }

    public static final void O3(fz fzVar, int i10) {
        try {
            fzVar.E(i10);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    public final void N3(a aVar, fz fzVar) {
        m.d("#008 Must be called on the main UI thread.");
        if (this.f8673v) {
            g1.g("Instream ad can not be shown after destroy().");
            O3(fzVar, 2);
            return;
        }
        View view = this.f8670s;
        if (view == null || this.f8671t == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            g1.g(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            O3(fzVar, 0);
        } else if (this.f8674w) {
            g1.g("Instream ad should not be used again.");
            O3(fzVar, 1);
        } else {
            this.f8674w = true;
            f();
            ((ViewGroup) b.e0(aVar)).addView(this.f8670s, new ViewGroup.LayoutParams(-1, -1));
            s sVar = s.B;
            ba0 ba0Var = sVar.A;
            ba0.a(this.f8670s, this);
            ba0 ba0Var2 = sVar.A;
            ba0.b(this.f8670s, this);
            e();
            try {
                fzVar.d();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void e() {
        View view;
        av0 av0Var = this.f8672u;
        if (av0Var == null || (view = this.f8670s) == null) {
            return;
        }
        av0Var.l(view, Collections.emptyMap(), Collections.emptyMap(), av0.g(this.f8670s));
    }

    public final void f() {
        View view = this.f8670s;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).removeView(this.f8670s);
    }

    public final void g() {
        m.d("#008 Must be called on the main UI thread.");
        f();
        av0 av0Var = this.f8672u;
        if (av0Var != null) {
            av0Var.a();
        }
        this.f8672u = null;
        this.f8670s = null;
        this.f8671t = null;
        this.f8673v = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        e();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        e();
    }
}

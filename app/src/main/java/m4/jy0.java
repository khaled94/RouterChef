package m4;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import k4.a;
import k4.b;
import n3.g1;

/* loaded from: classes.dex */
public final class jy0 extends ev {

    /* renamed from: s */
    public final Context f10215s;

    /* renamed from: t */
    public final ev0 f10216t;

    /* renamed from: u */
    public tv0 f10217u;

    /* renamed from: v */
    public av0 f10218v;

    public jy0(Context context, ev0 ev0Var, tv0 tv0Var, av0 av0Var) {
        this.f10215s = context;
        this.f10216t = ev0Var;
        this.f10217u = tv0Var;
        this.f10218v = av0Var;
    }

    public final void N3(String str) {
        av0 av0Var = this.f10218v;
        if (av0Var != null) {
            synchronized (av0Var) {
                av0Var.f6262k.l(str);
            }
        }
    }

    @Override // m4.fv
    public final boolean Z(a aVar) {
        tv0 tv0Var;
        Object e02 = b.e0(aVar);
        if ((e02 instanceof ViewGroup) && (tv0Var = this.f10217u) != null && tv0Var.c((ViewGroup) e02, true)) {
            this.f10216t.p().i0(new f7(this, 3));
            return true;
        }
        return false;
    }

    @Override // m4.fv
    public final a e() {
        return new b(this.f10215s);
    }

    @Override // m4.fv
    public final String f() {
        return this.f10216t.v();
    }

    public final void j() {
        av0 av0Var = this.f10218v;
        if (av0Var != null) {
            synchronized (av0Var) {
                if (!av0Var.f6272v) {
                    av0Var.f6262k.s();
                }
            }
        }
    }

    public final void l() {
        String str;
        ev0 ev0Var = this.f10216t;
        synchronized (ev0Var) {
            str = ev0Var.f8289w;
        }
        if ("Google".equals(str)) {
            g1.j("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(str)) {
            g1.j("Not starting OMID session. OM partner name has not been configured.");
        } else {
            av0 av0Var = this.f10218v;
            if (av0Var == null) {
                return;
            }
            av0Var.k(str, false);
        }
    }
}

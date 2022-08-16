package m4;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;
import n3.g1;
import n3.i1;
import n3.v0;

/* loaded from: classes.dex */
public final class tv0 {

    /* renamed from: a */
    public final i1 f14170a;

    /* renamed from: b */
    public final om1 f14171b;

    /* renamed from: c */
    public final iv0 f14172c;

    /* renamed from: d */
    public final ev0 f14173d;

    /* renamed from: e */
    public final dw0 f14174e;

    /* renamed from: f */
    public final kw0 f14175f;

    /* renamed from: g */
    public final Executor f14176g;

    /* renamed from: h */
    public final Executor f14177h;

    /* renamed from: i */
    public final lu f14178i;

    /* renamed from: j */
    public final cv0 f14179j;

    public tv0(i1 i1Var, om1 om1Var, iv0 iv0Var, ev0 ev0Var, dw0 dw0Var, kw0 kw0Var, Executor executor, Executor executor2, cv0 cv0Var) {
        this.f14170a = i1Var;
        this.f14171b = om1Var;
        this.f14178i = om1Var.f12208i;
        this.f14172c = iv0Var;
        this.f14173d = ev0Var;
        this.f14174e = dw0Var;
        this.f14175f = kw0Var;
        this.f14176g = executor;
        this.f14177h = executor2;
        this.f14179j = cv0Var;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(lw0 lw0Var) {
        if (lw0Var == null) {
            return;
        }
        Context context = lw0Var.d().getContext();
        if (!v0.h(context, this.f14172c.f9753a)) {
            return;
        }
        if (!(context instanceof Activity)) {
            g1.e("Activity context is needed for policy validator.");
        } else if (this.f14175f == null || lw0Var.f() == null) {
        } else {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f14175f.a(lw0Var.f(), windowManager), v0.b());
            } catch (fe0 e10) {
                g1.b("web view can not be obtained", e10);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z10) {
        View view;
        View view2;
        if (z10) {
            view = this.f14173d.j();
        } else {
            ev0 ev0Var = this.f14173d;
            synchronized (ev0Var) {
                view2 = ev0Var.f8281n;
            }
            view = view2;
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroup.addView(view, ((Boolean) jo.f10145d.f10148c.a(es.f8105h2)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}

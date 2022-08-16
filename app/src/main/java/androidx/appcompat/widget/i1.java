package androidx.appcompat.widget;

import a6.f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import com.raouf.routerchef.R;
import m0.f0;
import m0.h0;
import m0.z;

/* loaded from: classes.dex */
public final class i1 implements l0 {

    /* renamed from: a */
    public Toolbar f888a;

    /* renamed from: b */
    public int f889b;

    /* renamed from: c */
    public y0 f890c;

    /* renamed from: d */
    public View f891d;

    /* renamed from: e */
    public Drawable f892e;

    /* renamed from: f */
    public Drawable f893f;

    /* renamed from: g */
    public Drawable f894g;

    /* renamed from: h */
    public boolean f895h;

    /* renamed from: i */
    public CharSequence f896i;

    /* renamed from: j */
    public CharSequence f897j;

    /* renamed from: k */
    public CharSequence f898k;

    /* renamed from: l */
    public Window.Callback f899l;

    /* renamed from: m */
    public boolean f900m;

    /* renamed from: n */
    public c f901n;

    /* renamed from: o */
    public int f902o;
    public Drawable p;

    /* loaded from: classes.dex */
    public class a extends h0 {

        /* renamed from: t */
        public boolean f903t = false;

        /* renamed from: u */
        public final /* synthetic */ int f904u;

        public a(int i10) {
            i1.this = r1;
            this.f904u = i10;
        }

        @Override // m0.g0
        public final void a() {
            if (!this.f903t) {
                i1.this.f888a.setVisibility(this.f904u);
            }
        }

        @Override // m0.h0, m0.g0
        public final void b(View view) {
            this.f903t = true;
        }

        @Override // m0.h0, m0.g0
        public final void d() {
            i1.this.f888a.setVisibility(0);
        }
    }

    public i1(Toolbar toolbar) {
        Drawable drawable;
        this.f902o = 0;
        this.f888a = toolbar;
        this.f896i = toolbar.getTitle();
        this.f897j = toolbar.getSubtitle();
        this.f895h = this.f896i != null;
        this.f894g = toolbar.getNavigationIcon();
        String str = null;
        f1 q10 = f1.q(toolbar.getContext(), null, f.f184s, R.attr.actionBarStyle);
        this.p = q10.g(15);
        CharSequence n10 = q10.n(27);
        if (!TextUtils.isEmpty(n10)) {
            this.f895h = true;
            u(n10);
        }
        CharSequence n11 = q10.n(25);
        if (!TextUtils.isEmpty(n11)) {
            this.f897j = n11;
            if ((this.f889b & 8) != 0) {
                this.f888a.setSubtitle(n11);
            }
        }
        Drawable g10 = q10.g(20);
        if (g10 != null) {
            this.f893f = g10;
            x();
        }
        Drawable g11 = q10.g(17);
        if (g11 != null) {
            setIcon(g11);
        }
        if (this.f894g == null && (drawable = this.p) != null) {
            this.f894g = drawable;
            w();
        }
        l(q10.j(10, 0));
        int l10 = q10.l(9, 0);
        if (l10 != 0) {
            View inflate = LayoutInflater.from(this.f888a.getContext()).inflate(l10, (ViewGroup) this.f888a, false);
            View view = this.f891d;
            if (view != null && (this.f889b & 16) != 0) {
                this.f888a.removeView(view);
            }
            this.f891d = inflate;
            if (inflate != null && (this.f889b & 16) != 0) {
                this.f888a.addView(inflate);
            }
            l(this.f889b | 16);
        }
        int k10 = q10.k(13, 0);
        if (k10 > 0) {
            ViewGroup.LayoutParams layoutParams = this.f888a.getLayoutParams();
            layoutParams.height = k10;
            this.f888a.setLayoutParams(layoutParams);
        }
        int e10 = q10.e(7, -1);
        int e11 = q10.e(3, -1);
        if (e10 >= 0 || e11 >= 0) {
            Toolbar toolbar2 = this.f888a;
            int max = Math.max(e10, 0);
            int max2 = Math.max(e11, 0);
            toolbar2.d();
            toolbar2.L.a(max, max2);
        }
        int l11 = q10.l(28, 0);
        if (l11 != 0) {
            Toolbar toolbar3 = this.f888a;
            Context context = toolbar3.getContext();
            toolbar3.D = l11;
            h0 h0Var = toolbar3.f743t;
            if (h0Var != null) {
                h0Var.setTextAppearance(context, l11);
            }
        }
        int l12 = q10.l(26, 0);
        if (l12 != 0) {
            Toolbar toolbar4 = this.f888a;
            Context context2 = toolbar4.getContext();
            toolbar4.E = l12;
            h0 h0Var2 = toolbar4.f744u;
            if (h0Var2 != null) {
                h0Var2.setTextAppearance(context2, l12);
            }
        }
        int l13 = q10.l(22, 0);
        if (l13 != 0) {
            this.f888a.setPopupTheme(l13);
        }
        q10.r();
        if (R.string.abc_action_bar_up_description != this.f902o) {
            this.f902o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f888a.getNavigationContentDescription())) {
                int i10 = this.f902o;
                this.f898k = i10 != 0 ? getContext().getString(i10) : str;
                v();
            }
        }
        this.f898k = this.f888a.getNavigationContentDescription();
        this.f888a.setNavigationOnClickListener(new h1(this));
    }

    @Override // androidx.appcompat.widget.l0
    public final void a(Menu menu, i.a aVar) {
        g gVar;
        if (this.f901n == null) {
            this.f901n = new c(this.f888a.getContext());
        }
        c cVar = this.f901n;
        cVar.f518w = aVar;
        Toolbar toolbar = this.f888a;
        e eVar = (e) menu;
        if (eVar == null && toolbar.f742s == null) {
            return;
        }
        toolbar.g();
        e eVar2 = toolbar.f742s.H;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            eVar2.v(toolbar.f738g0);
            eVar2.v(toolbar.f739h0);
        }
        if (toolbar.f739h0 == null) {
            toolbar.f739h0 = new Toolbar.d();
        }
        cVar.I = true;
        if (eVar != null) {
            eVar.c(cVar, toolbar.B);
            eVar.c(toolbar.f739h0, toolbar.B);
        } else {
            cVar.e(toolbar.B, null);
            Toolbar.d dVar = toolbar.f739h0;
            e eVar3 = dVar.f752s;
            if (eVar3 != null && (gVar = dVar.f753t) != null) {
                eVar3.e(gVar);
            }
            dVar.f752s = null;
            cVar.f();
            toolbar.f739h0.f();
        }
        toolbar.f742s.setPopupTheme(toolbar.C);
        toolbar.f742s.setPresenter(cVar);
        toolbar.f738g0 = cVar;
    }

    @Override // androidx.appcompat.widget.l0
    public final boolean b() {
        return this.f888a.r();
    }

    @Override // androidx.appcompat.widget.l0
    public final void c() {
        this.f900m = true;
    }

    @Override // androidx.appcompat.widget.l0
    public final void collapseActionView() {
        Toolbar.d dVar = this.f888a.f739h0;
        g gVar = dVar == null ? null : dVar.f753t;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f888a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f742s
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            androidx.appcompat.widget.c r0 = r0.L
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.c$c r3 = r0.M
            if (r3 != 0) goto L19
            boolean r0 = r0.l()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i1.d():boolean");
    }

    @Override // androidx.appcompat.widget.l0
    public final boolean e() {
        ActionMenuView actionMenuView = this.f888a.f742s;
        if (actionMenuView != null) {
            c cVar = actionMenuView.L;
            if (cVar != null && cVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.widget.l0
    public final boolean f() {
        return this.f888a.x();
    }

    @Override // androidx.appcompat.widget.l0
    public final boolean g() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f888a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f742s) != null && actionMenuView.K;
    }

    @Override // androidx.appcompat.widget.l0
    public final Context getContext() {
        return this.f888a.getContext();
    }

    @Override // androidx.appcompat.widget.l0
    public final CharSequence getTitle() {
        return this.f888a.getTitle();
    }

    @Override // androidx.appcompat.widget.l0
    public final void h() {
        c cVar;
        ActionMenuView actionMenuView = this.f888a.f742s;
        if (actionMenuView == null || (cVar = actionMenuView.L) == null) {
            return;
        }
        cVar.b();
    }

    @Override // androidx.appcompat.widget.l0
    public final void i(int i10) {
        this.f888a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.l0
    public final void j() {
    }

    @Override // androidx.appcompat.widget.l0
    public final boolean k() {
        Toolbar.d dVar = this.f888a.f739h0;
        return (dVar == null || dVar.f753t == null) ? false : true;
    }

    @Override // androidx.appcompat.widget.l0
    public final void l(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f889b ^ i10;
        this.f889b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    v();
                }
                w();
            }
            if ((i11 & 3) != 0) {
                x();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f888a.setTitle(this.f896i);
                    toolbar = this.f888a;
                    charSequence = this.f897j;
                } else {
                    charSequence = null;
                    this.f888a.setTitle((CharSequence) null);
                    toolbar = this.f888a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f891d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f888a.addView(view);
            } else {
                this.f888a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.l0
    public final void m() {
        y0 y0Var = this.f890c;
        if (y0Var != null) {
            ViewParent parent = y0Var.getParent();
            Toolbar toolbar = this.f888a;
            if (parent == toolbar) {
                toolbar.removeView(this.f890c);
            }
        }
        this.f890c = null;
    }

    @Override // androidx.appcompat.widget.l0
    public final int n() {
        return this.f889b;
    }

    @Override // androidx.appcompat.widget.l0
    public final void o(int i10) {
        this.f893f = i10 != 0 ? f.a.b(getContext(), i10) : null;
        x();
    }

    @Override // androidx.appcompat.widget.l0
    public final void p() {
    }

    @Override // androidx.appcompat.widget.l0
    public final f0 q(int i10, long j3) {
        f0 b10 = z.b(this.f888a);
        b10.a(i10 == 0 ? 1.0f : 0.0f);
        b10.c(j3);
        b10.d(new a(i10));
        return b10;
    }

    @Override // androidx.appcompat.widget.l0
    public final void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.l0
    public final void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.l0
    public final void setIcon(int i10) {
        setIcon(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.l0
    public final void setIcon(Drawable drawable) {
        this.f892e = drawable;
        x();
    }

    @Override // androidx.appcompat.widget.l0
    public final void setWindowCallback(Window.Callback callback) {
        this.f899l = callback;
    }

    @Override // androidx.appcompat.widget.l0
    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f895h) {
            u(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.l0
    public final void t(boolean z10) {
        this.f888a.setCollapsible(z10);
    }

    public final void u(CharSequence charSequence) {
        this.f896i = charSequence;
        if ((this.f889b & 8) != 0) {
            this.f888a.setTitle(charSequence);
            if (!this.f895h) {
                return;
            }
            z.q(this.f888a.getRootView(), charSequence);
        }
    }

    public final void v() {
        if ((this.f889b & 4) != 0) {
            if (TextUtils.isEmpty(this.f898k)) {
                this.f888a.setNavigationContentDescription(this.f902o);
            } else {
                this.f888a.setNavigationContentDescription(this.f898k);
            }
        }
    }

    public final void w() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f889b & 4) != 0) {
            toolbar = this.f888a;
            drawable = this.f894g;
            if (drawable == null) {
                drawable = this.p;
            }
        } else {
            toolbar = this.f888a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void x() {
        Drawable drawable;
        int i10 = this.f889b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f893f) == null) {
            drawable = this.f892e;
        }
        this.f888a.setLogo(drawable);
    }
}

package e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l0;
import com.raouf.routerchef.R;
import e.a;
import j.a;
import j.f;
import j.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m0.f0;
import m0.h0;
import m0.i0;
import m0.z;

/* loaded from: classes.dex */
public final class s extends e.a implements ActionBarOverlayLayout.d {
    public static final AccelerateInterpolator A = new AccelerateInterpolator();
    public static final DecelerateInterpolator B = new DecelerateInterpolator();

    /* renamed from: a */
    public Context f4278a;

    /* renamed from: b */
    public Context f4279b;

    /* renamed from: c */
    public ActionBarOverlayLayout f4280c;

    /* renamed from: d */
    public ActionBarContainer f4281d;

    /* renamed from: e */
    public l0 f4282e;

    /* renamed from: f */
    public ActionBarContextView f4283f;

    /* renamed from: g */
    public View f4284g;

    /* renamed from: h */
    public boolean f4285h;

    /* renamed from: i */
    public d f4286i;

    /* renamed from: j */
    public d f4287j;

    /* renamed from: k */
    public a.AbstractC0076a f4288k;

    /* renamed from: l */
    public boolean f4289l;

    /* renamed from: n */
    public boolean f4291n;

    /* renamed from: q */
    public boolean f4293q;

    /* renamed from: r */
    public boolean f4294r;

    /* renamed from: s */
    public boolean f4295s;

    /* renamed from: u */
    public g f4297u;

    /* renamed from: v */
    public boolean f4298v;

    /* renamed from: w */
    public boolean f4299w;

    /* renamed from: m */
    public ArrayList<a.b> f4290m = new ArrayList<>();

    /* renamed from: o */
    public int f4292o = 0;
    public boolean p = true;

    /* renamed from: t */
    public boolean f4296t = true;

    /* renamed from: x */
    public final a f4300x = new a();
    public final b y = new b();

    /* renamed from: z */
    public final c f4301z = new c();

    /* loaded from: classes.dex */
    public class a extends h0 {
        public a() {
            s.this = r1;
        }

        @Override // m0.g0
        public final void a() {
            View view;
            s sVar = s.this;
            if (sVar.p && (view = sVar.f4284g) != null) {
                view.setTranslationY(0.0f);
                s.this.f4281d.setTranslationY(0.0f);
            }
            s.this.f4281d.setVisibility(8);
            s.this.f4281d.setTransitioning(false);
            s sVar2 = s.this;
            sVar2.f4297u = null;
            a.AbstractC0076a abstractC0076a = sVar2.f4288k;
            if (abstractC0076a != null) {
                abstractC0076a.c(sVar2.f4287j);
                sVar2.f4287j = null;
                sVar2.f4288k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = s.this.f4280c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                z.h.c(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends h0 {
        public b() {
            s.this = r1;
        }

        @Override // m0.g0
        public final void a() {
            s sVar = s.this;
            sVar.f4297u = null;
            sVar.f4281d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c implements i0 {
        public c() {
            s.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class d extends j.a implements e.a {

        /* renamed from: u */
        public final Context f4305u;

        /* renamed from: v */
        public final e f4306v;

        /* renamed from: w */
        public a.AbstractC0076a f4307w;

        /* renamed from: x */
        public WeakReference<View> f4308x;

        public d(Context context, a.AbstractC0076a abstractC0076a) {
            s.this = r1;
            this.f4305u = context;
            this.f4307w = abstractC0076a;
            e eVar = new e(context);
            eVar.f562l = 1;
            this.f4306v = eVar;
            eVar.f555e = this;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public final boolean a(e eVar, MenuItem menuItem) {
            a.AbstractC0076a abstractC0076a = this.f4307w;
            if (abstractC0076a != null) {
                return abstractC0076a.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public final void b(e eVar) {
            if (this.f4307w == null) {
                return;
            }
            i();
            androidx.appcompat.widget.c cVar = s.this.f4283f.f766v;
            if (cVar == null) {
                return;
            }
            cVar.m();
        }

        @Override // j.a
        public final void c() {
            s sVar = s.this;
            if (sVar.f4286i != this) {
                return;
            }
            boolean z10 = sVar.f4293q;
            boolean z11 = sVar.f4294r;
            boolean z12 = true;
            if (z10 || z11) {
                z12 = false;
            }
            if (!z12) {
                sVar.f4287j = this;
                sVar.f4288k = this.f4307w;
            } else {
                this.f4307w.c(this);
            }
            this.f4307w = null;
            s.this.c(false);
            ActionBarContextView actionBarContextView = s.this.f4283f;
            if (actionBarContextView.C == null) {
                actionBarContextView.h();
            }
            s sVar2 = s.this;
            sVar2.f4280c.setHideOnContentScrollEnabled(sVar2.f4299w);
            s.this.f4286i = null;
        }

        @Override // j.a
        public final View d() {
            WeakReference<View> weakReference = this.f4308x;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // j.a
        public final Menu e() {
            return this.f4306v;
        }

        @Override // j.a
        public final MenuInflater f() {
            return new f(this.f4305u);
        }

        @Override // j.a
        public final CharSequence g() {
            return s.this.f4283f.getSubtitle();
        }

        @Override // j.a
        public final CharSequence h() {
            return s.this.f4283f.getTitle();
        }

        @Override // j.a
        public final void i() {
            if (s.this.f4286i != this) {
                return;
            }
            this.f4306v.B();
            try {
                this.f4307w.d(this, this.f4306v);
            } finally {
                this.f4306v.A();
            }
        }

        @Override // j.a
        public final boolean j() {
            return s.this.f4283f.K;
        }

        @Override // j.a
        public final void k(View view) {
            s.this.f4283f.setCustomView(view);
            this.f4308x = new WeakReference<>(view);
        }

        @Override // j.a
        public final void l(int i10) {
            s.this.f4283f.setSubtitle(s.this.f4278a.getResources().getString(i10));
        }

        @Override // j.a
        public final void m(CharSequence charSequence) {
            s.this.f4283f.setSubtitle(charSequence);
        }

        @Override // j.a
        public final void n(int i10) {
            s.this.f4283f.setTitle(s.this.f4278a.getResources().getString(i10));
        }

        @Override // j.a
        public final void o(CharSequence charSequence) {
            s.this.f4283f.setTitle(charSequence);
        }

        @Override // j.a
        public final void p(boolean z10) {
            this.f5318t = z10;
            s.this.f4283f.setTitleOptional(z10);
        }
    }

    public s(Activity activity, boolean z10) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        f(decorView);
        if (!z10) {
            this.f4284g = decorView.findViewById(16908290);
        }
    }

    public s(Dialog dialog) {
        new ArrayList();
        f(dialog.getWindow().getDecorView());
    }

    @Override // e.a
    public final int a() {
        return this.f4282e.n();
    }

    @Override // e.a
    public final void b() {
        if (!this.f4293q) {
            this.f4293q = true;
            j(false);
        }
    }

    public final void c(boolean z10) {
        f0 f0Var;
        f0 f0Var2;
        if (z10) {
            if (!this.f4295s) {
                this.f4295s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4280c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                j(false);
            }
        } else if (this.f4295s) {
            this.f4295s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4280c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            j(false);
        }
        ActionBarContainer actionBarContainer = this.f4281d;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (!z.g.c(actionBarContainer)) {
            if (z10) {
                this.f4282e.i(4);
                this.f4283f.setVisibility(0);
                return;
            }
            this.f4282e.i(0);
            this.f4283f.setVisibility(8);
            return;
        }
        if (z10) {
            f0Var = this.f4282e.q(4, 100L);
            f0Var2 = this.f4283f.e(0, 200L);
        } else {
            f0Var2 = this.f4282e.q(0, 200L);
            f0Var = this.f4283f.e(8, 100L);
        }
        g gVar = new g();
        gVar.f5368a.add(f0Var);
        View view = f0Var.f5873a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = f0Var2.f5873a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        gVar.f5368a.add(f0Var2);
        gVar.c();
    }

    public final void d(boolean z10) {
        if (z10 == this.f4289l) {
            return;
        }
        this.f4289l = z10;
        int size = this.f4290m.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4290m.get(i10).a();
        }
    }

    public final Context e() {
        if (this.f4279b == null) {
            TypedValue typedValue = new TypedValue();
            this.f4278a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f4279b = new ContextThemeWrapper(this.f4278a, i10);
            } else {
                this.f4279b = this.f4278a;
            }
        }
        return this.f4279b;
    }

    public final void f(View view) {
        l0 l0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f4280c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof l0) {
            l0Var = (l0) findViewById;
        } else if (!(findViewById instanceof Toolbar)) {
            StringBuilder c10 = androidx.activity.result.a.c("Can't make a decor toolbar out of ");
            c10.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(c10.toString());
        } else {
            l0Var = ((Toolbar) findViewById).getWrapper();
        }
        this.f4282e = l0Var;
        this.f4283f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f4281d = actionBarContainer;
        l0 l0Var2 = this.f4282e;
        if (l0Var2 == null || this.f4283f == null || actionBarContainer == null) {
            throw new IllegalStateException(s.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f4278a = l0Var2.getContext();
        if ((this.f4282e.n() & 4) != 0) {
            this.f4285h = true;
        }
        Context context = this.f4278a;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.f4282e.j();
        h(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f4278a.obtainStyledAttributes(null, a6.f.f184s, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4280c;
            if (!actionBarOverlayLayout2.f638z) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f4299w = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f4281d;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.i.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void g(boolean z10) {
        if (!this.f4285h) {
            int i10 = z10 ? 4 : 0;
            int n10 = this.f4282e.n();
            this.f4285h = true;
            this.f4282e.l((i10 & 4) | (n10 & (-5)));
        }
    }

    public final void h(boolean z10) {
        this.f4291n = z10;
        if (!z10) {
            this.f4282e.m();
            this.f4281d.setTabContainer(null);
        } else {
            this.f4281d.setTabContainer(null);
            this.f4282e.m();
        }
        this.f4282e.p();
        l0 l0Var = this.f4282e;
        boolean z11 = this.f4291n;
        l0Var.t(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4280c;
        boolean z12 = this.f4291n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void i(CharSequence charSequence) {
        this.f4282e.setWindowTitle(charSequence);
    }

    public final void j(boolean z10) {
        View view;
        int[] iArr;
        View view2;
        View view3;
        int[] iArr2;
        if (!(this.f4295s || (!this.f4293q && !this.f4294r))) {
            if (!this.f4296t) {
                return;
            }
            this.f4296t = false;
            g gVar = this.f4297u;
            if (gVar != null) {
                gVar.a();
            }
            if (this.f4292o != 0 || (!this.f4298v && !z10)) {
                this.f4300x.a();
                return;
            }
            this.f4281d.setAlpha(1.0f);
            this.f4281d.setTransitioning(true);
            g gVar2 = new g();
            float f10 = -this.f4281d.getHeight();
            if (z10) {
                this.f4281d.getLocationInWindow(new int[]{0, 0});
                f10 -= iArr[1];
            }
            f0 b10 = z.b(this.f4281d);
            b10.g(f10);
            b10.f(this.f4301z);
            gVar2.b(b10);
            if (this.p && (view = this.f4284g) != null) {
                f0 b11 = z.b(view);
                b11.g(f10);
                gVar2.b(b11);
            }
            AccelerateInterpolator accelerateInterpolator = A;
            boolean z11 = gVar2.f5372e;
            if (!z11) {
                gVar2.f5370c = accelerateInterpolator;
            }
            if (!z11) {
                gVar2.f5369b = 250L;
            }
            a aVar = this.f4300x;
            if (!z11) {
                gVar2.f5371d = aVar;
            }
            this.f4297u = gVar2;
            gVar2.c();
        } else if (this.f4296t) {
        } else {
            this.f4296t = true;
            g gVar3 = this.f4297u;
            if (gVar3 != null) {
                gVar3.a();
            }
            this.f4281d.setVisibility(0);
            if (this.f4292o != 0 || (!this.f4298v && !z10)) {
                this.f4281d.setAlpha(1.0f);
                this.f4281d.setTranslationY(0.0f);
                if (this.p && (view2 = this.f4284g) != null) {
                    view2.setTranslationY(0.0f);
                }
                this.y.a();
            } else {
                this.f4281d.setTranslationY(0.0f);
                float f11 = -this.f4281d.getHeight();
                if (z10) {
                    this.f4281d.getLocationInWindow(new int[]{0, 0});
                    f11 -= iArr2[1];
                }
                this.f4281d.setTranslationY(f11);
                g gVar4 = new g();
                f0 b12 = z.b(this.f4281d);
                b12.g(0.0f);
                b12.f(this.f4301z);
                gVar4.b(b12);
                if (this.p && (view3 = this.f4284g) != null) {
                    view3.setTranslationY(f11);
                    f0 b13 = z.b(this.f4284g);
                    b13.g(0.0f);
                    gVar4.b(b13);
                }
                DecelerateInterpolator decelerateInterpolator = B;
                boolean z12 = gVar4.f5372e;
                if (!z12) {
                    gVar4.f5370c = decelerateInterpolator;
                }
                if (!z12) {
                    gVar4.f5369b = 250L;
                }
                b bVar = this.y;
                if (!z12) {
                    gVar4.f5371d = bVar;
                }
                this.f4297u = gVar4;
                gVar4.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f4280c;
            if (actionBarOverlayLayout == null) {
                return;
            }
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.h.c(actionBarOverlayLayout);
        }
    }
}

package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.u0;
import com.raouf.routerchef.R;
import java.util.Objects;
import k.d;

/* loaded from: classes.dex */
public final class k extends d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final u0 A;
    public PopupWindow.OnDismissListener D;
    public View E;
    public View F;
    public i.a G;
    public ViewTreeObserver H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean M;

    /* renamed from: t */
    public final Context f615t;

    /* renamed from: u */
    public final e f616u;

    /* renamed from: v */
    public final d f617v;

    /* renamed from: w */
    public final boolean f618w;

    /* renamed from: x */
    public final int f619x;
    public final int y;

    /* renamed from: z */
    public final int f620z;
    public final a B = new a();
    public final b C = new b();
    public int L = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
            k.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (k.this.b()) {
                k kVar = k.this;
                if (kVar.A.P) {
                    return;
                }
                View view = kVar.F;
                if (view == null || !view.isShown()) {
                    k.this.dismiss();
                } else {
                    k.this.A.d();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
            k.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.H;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.H = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.H.removeGlobalOnLayoutListener(kVar.B);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f615t = context;
        this.f616u = eVar;
        this.f618w = z10;
        this.f617v = new d(eVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.y = i10;
        this.f620z = i11;
        Resources resources = context.getResources();
        this.f619x = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.E = view;
        this.A = new u0(context, i10, i11);
        eVar.c(this, context);
    }

    @Override // androidx.appcompat.view.menu.i
    public final void a(e eVar, boolean z10) {
        if (eVar != this.f616u) {
            return;
        }
        dismiss();
        i.a aVar = this.G;
        if (aVar == null) {
            return;
        }
        aVar.a(eVar, z10);
    }

    @Override // k.f
    public final boolean b() {
        return !this.I && this.A.b();
    }

    @Override // k.f
    public final void d() {
        View view;
        boolean z10 = true;
        if (!b()) {
            if (this.I || (view = this.E) == null) {
                z10 = false;
            } else {
                this.F = view;
                this.A.u(this);
                u0 u0Var = this.A;
                u0Var.H = this;
                u0Var.t();
                View view2 = this.F;
                boolean z11 = this.H == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.H = viewTreeObserver;
                if (z11) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.B);
                }
                view2.addOnAttachStateChangeListener(this.C);
                u0 u0Var2 = this.A;
                u0Var2.G = view2;
                u0Var2.D = this.L;
                if (!this.J) {
                    this.K = d.m(this.f617v, this.f615t, this.f619x);
                    this.J = true;
                }
                this.A.r(this.K);
                this.A.s();
                u0 u0Var3 = this.A;
                Rect rect = this.f5538s;
                Objects.requireNonNull(u0Var3);
                u0Var3.O = rect != null ? new Rect(rect) : null;
                this.A.d();
                n0 n0Var = this.A.f1004u;
                n0Var.setOnKeyListener(this);
                if (this.M && this.f616u.f563m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f615t).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) n0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f616u.f563m);
                    }
                    frameLayout.setEnabled(false);
                    n0Var.addHeaderView(frameLayout, null, false);
                }
                this.A.p(this.f617v);
                this.A.d();
            }
        }
        if (z10) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // k.f
    public final void dismiss() {
        if (b()) {
            this.A.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public final void f() {
        this.J = false;
        d dVar = this.f617v;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // k.f
    public final ListView g() {
        return this.A.f1004u;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    @Override // androidx.appcompat.view.menu.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(androidx.appcompat.view.menu.l r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L79
            androidx.appcompat.view.menu.h r0 = new androidx.appcompat.view.menu.h
            android.content.Context r3 = r9.f615t
            android.view.View r5 = r9.F
            boolean r6 = r9.f618w
            int r7 = r9.y
            int r8 = r9.f620z
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.i$a r2 = r9.G
            r0.d(r2)
            boolean r2 = k.d.u(r10)
            r0.f609h = r2
            k.d r3 = r0.f611j
            if (r3 == 0) goto L2a
            r3.o(r2)
        L2a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.D
            r0.f612k = r2
            r2 = 0
            r9.D = r2
            androidx.appcompat.view.menu.e r2 = r9.f616u
            r2.d(r1)
            androidx.appcompat.widget.u0 r2 = r9.A
            int r3 = r2.f1007x
            boolean r4 = r2.A
            if (r4 != 0) goto L40
            r2 = r1
            goto L42
        L40:
            int r2 = r2.y
        L42:
            int r4 = r9.L
            android.view.View r5 = r9.E
            java.util.WeakHashMap<android.view.View, m0.f0> r6 = m0.z.f5921a
            int r5 = m0.z.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5c
            android.view.View r4 = r9.E
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5c:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L65
        L63:
            r0 = r5
            goto L6f
        L65:
            android.view.View r4 = r0.f607f
            if (r4 != 0) goto L6b
            r0 = r1
            goto L6f
        L6b:
            r0.e(r3, r2, r5, r5)
            goto L63
        L6f:
            if (r0 == 0) goto L79
            androidx.appcompat.view.menu.i$a r0 = r9.G
            if (r0 == 0) goto L78
            r0.b(r10)
        L78:
            return r5
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k.h(androidx.appcompat.view.menu.l):boolean");
    }

    @Override // androidx.appcompat.view.menu.i
    public final boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public final void j(i.a aVar) {
        this.G = aVar;
    }

    @Override // k.d
    public final void l(e eVar) {
    }

    @Override // k.d
    public final void n(View view) {
        this.E = view;
    }

    @Override // k.d
    public final void o(boolean z10) {
        this.f617v.f547u = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.I = true;
        this.f616u.d(true);
        ViewTreeObserver viewTreeObserver = this.H;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.H = this.F.getViewTreeObserver();
            }
            this.H.removeGlobalOnLayoutListener(this.B);
            this.H = null;
        }
        this.F.removeOnAttachStateChangeListener(this.C);
        PopupWindow.OnDismissListener onDismissListener = this.D;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // k.d
    public final void p(int i10) {
        this.L = i10;
    }

    @Override // k.d
    public final void q(int i10) {
        this.A.f1007x = i10;
    }

    @Override // k.d
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // k.d
    public final void s(boolean z10) {
        this.M = z10;
    }

    @Override // k.d
    public final void t(int i10) {
        this.A.j(i10);
    }
}

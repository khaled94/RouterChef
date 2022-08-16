package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.j;
import androidx.activity.result.e;
import androidx.activity.result.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.m;
import b0.b;
import b0.v;
import b0.w;
import b0.y;
import c0.c;
import j1.b;
import j1.d;
import java.util.Objects;
import m0.h;
import m0.i;
import m0.k;

/* loaded from: classes.dex */
public class t extends ComponentActivity implements b.c {
    public boolean H;
    public boolean I;
    public final w F = new w(new a());
    public final m G = new m(this);
    public boolean J = true;

    /* loaded from: classes.dex */
    public class a extends y<t> implements c0.b, c, v, w, j0, j, f, d, k0, h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(r1);
            t.this = r1;
        }

        @Override // m0.h
        public final void B(k kVar) {
            t.this.f386u.c(kVar);
        }

        @Override // c0.c
        public final void D(l0.a<Integer> aVar) {
            t.this.B.remove(aVar);
        }

        @Override // b0.w
        public final void E(l0.a<y> aVar) {
            t.this.E.remove(aVar);
        }

        @Override // androidx.lifecycle.l
        public final g a() {
            return t.this.G;
        }

        @Override // androidx.activity.j
        public final OnBackPressedDispatcher b() {
            return t.this.y;
        }

        @Override // j1.d
        public final j1.b c() {
            return t.this.f388w.f5437b;
        }

        @Override // androidx.fragment.app.k0
        public final void d() {
            Objects.requireNonNull(t.this);
        }

        @Override // m0.h
        public final void e(k kVar) {
            i iVar = t.this.f386u;
            iVar.f5878b.add(kVar);
            iVar.f5877a.run();
        }

        @Override // androidx.fragment.app.v
        public final View i(int i10) {
            return t.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.v
        public final boolean j() {
            Window window = t.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.y
        public final t k() {
            return t.this;
        }

        @Override // androidx.fragment.app.y
        public final LayoutInflater l() {
            return t.this.getLayoutInflater().cloneInContext(t.this);
        }

        @Override // b0.v
        public final void m(l0.a<b0.k> aVar) {
            t.this.D.remove(aVar);
        }

        @Override // androidx.fragment.app.y
        public final void n() {
            t.this.invalidateOptionsMenu();
        }

        @Override // c0.b
        public final void o(l0.a<Configuration> aVar) {
            t.this.A.remove(aVar);
        }

        @Override // c0.b
        public final void p(l0.a<Configuration> aVar) {
            t.this.p(aVar);
        }

        @Override // androidx.activity.result.f
        public final e s() {
            return t.this.f390z;
        }

        @Override // b0.v
        public final void t(l0.a<b0.k> aVar) {
            t.this.D.add(aVar);
        }

        @Override // c0.c
        public final void v(l0.a<Integer> aVar) {
            t.this.B.add(aVar);
        }

        @Override // androidx.lifecycle.j0
        public final i0 w() {
            return t.this.w();
        }

        @Override // b0.w
        public final void x(l0.a<y> aVar) {
            t.this.E.add(aVar);
        }
    }

    public t() {
        this.f388w.f5437b.b("android:support:lifecycle", new b.AbstractC0077b() { // from class: androidx.fragment.app.q
            @Override // j1.b.AbstractC0077b
            public final Bundle a() {
                t tVar = t.this;
                do {
                } while (t.K(tVar.J()));
                tVar.G.f(g.b.ON_STOP);
                return new Bundle();
            }
        });
        p(new l0.a() { // from class: androidx.fragment.app.r
            @Override // l0.a
            public final void a(Object obj) {
                Configuration configuration = (Configuration) obj;
                t.this.F.a();
            }
        });
        this.C.add(new l0.a() { // from class: androidx.fragment.app.s
            @Override // l0.a
            public final void a(Object obj) {
                Intent intent = (Intent) obj;
                t.this.F.a();
            }
        });
        G(new b.b() { // from class: androidx.fragment.app.p
            @Override // b.b
            public final void a() {
                y<?> yVar = t.this.F.f1597a;
                yVar.f1606v.b(yVar, yVar, null);
            }
        });
    }

    public static boolean K(g0 g0Var) {
        g.c cVar = g.c.STARTED;
        boolean z10 = false;
        for (o oVar : g0Var.f1401c.h()) {
            if (oVar != null) {
                y<?> yVar = oVar.K;
                if ((yVar == null ? null : yVar.k()) != null) {
                    z10 |= K(oVar.k());
                }
                v0 v0Var = oVar.f1511g0;
                if (v0Var != null) {
                    v0Var.e();
                    if (v0Var.f1595u.f1702b.b(cVar)) {
                        oVar.f1511g0.f1595u.k();
                        z10 = true;
                    }
                }
                if (oVar.f1510f0.f1702b.b(cVar)) {
                    oVar.f1510f0.k();
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final g0 J() {
        return this.F.f1597a.f1606v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 31) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        r1 = true;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            r5 = this;
            super.dump(r6, r7, r8, r9)
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L51
            int r2 = r9.length
            if (r2 <= 0) goto L51
            r2 = r9[r1]
            java.util.Objects.requireNonNull(r2)
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -645125871: goto L2e;
                case 1159329357: goto L23;
                case 1455016274: goto L18;
                default: goto L17;
            }
        L17:
            goto L38
        L18:
            java.lang.String r4 = "--autofill"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L21
            goto L38
        L21:
            r3 = 2
            goto L38
        L23:
            java.lang.String r4 = "--contentcapture"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L2c
            goto L38
        L2c:
            r3 = r0
            goto L38
        L2e:
            java.lang.String r4 = "--translation"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L37
            goto L38
        L37:
            r3 = r1
        L38:
            switch(r3) {
                case 0: goto L4a;
                case 1: goto L43;
                case 2: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L51
        L3c:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L51
            goto L50
        L43:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L51
            goto L50
        L4a:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L51
        L50:
            r1 = r0
        L51:
            r0 = r0 ^ r1
            if (r0 != 0) goto L55
            return
        L55:
            r8.print(r6)
            java.lang.String r0 = "Local FragmentActivity "
            r8.print(r0)
            int r0 = java.lang.System.identityHashCode(r5)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " State:"
            r8.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.print(r0)
            java.lang.String r1 = "mCreated="
            r8.print(r1)
            boolean r1 = r5.H
            r8.print(r1)
            java.lang.String r1 = " mResumed="
            r8.print(r1)
            boolean r1 = r5.I
            r8.print(r1)
            java.lang.String r1 = " mStopped="
            r8.print(r1)
            boolean r1 = r5.J
            r8.print(r1)
            android.app.Application r1 = r5.getApplication()
            if (r1 == 0) goto Lac
            d1.a r1 = d1.a.b(r5)
            r1.a(r0, r8)
        Lac:
            androidx.fragment.app.w r0 = r5.F
            androidx.fragment.app.y<?> r0 = r0.f1597a
            androidx.fragment.app.h0 r0 = r0.f1606v
            r0.w(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.t.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // b0.b.c
    @Deprecated
    public final void j() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        this.F.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, b0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.G.f(g.b.ON_CREATE);
        this.F.f1597a.f1606v.j();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.F.f1597a.f1606v.f1404f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.F.f1597a.f1606v.l();
        this.G.f(g.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 6) {
            return false;
        }
        return this.F.f1597a.f1606v.i(menuItem);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.I = false;
        this.F.f1597a.f1606v.u(5);
        this.G.f(g.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.G.f(g.b.ON_RESUME);
        h0 h0Var = this.F.f1597a.f1606v;
        h0Var.E = false;
        h0Var.F = false;
        h0Var.L.f1461h = false;
        h0Var.u(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.F.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.F.a();
        super.onResume();
        this.I = true;
        this.F.f1597a.f1606v.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.F.a();
        super.onStart();
        this.J = false;
        if (!this.H) {
            this.H = true;
            h0 h0Var = this.F.f1597a.f1606v;
            h0Var.E = false;
            h0Var.F = false;
            h0Var.L.f1461h = false;
            h0Var.u(4);
        }
        this.F.f1597a.f1606v.A(true);
        this.G.f(g.b.ON_START);
        h0 h0Var2 = this.F.f1597a.f1606v;
        h0Var2.E = false;
        h0Var2.F = false;
        h0Var2.L.f1461h = false;
        h0Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.F.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.J = true;
        do {
        } while (K(J()));
        h0 h0Var = this.F.f1597a.f1606v;
        h0Var.F = true;
        h0Var.L.f1461h = true;
        h0Var.u(4);
        this.G.f(g.b.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.F.f1597a.f1606v.f1404f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}

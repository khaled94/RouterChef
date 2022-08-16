package androidx.fragment.app;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.fragment.app.z0;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import com.raouf.routerchef.R;
import d1.b;
import e9.f;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import s.b;
import y0.d;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a */
    public final a0 f1475a;

    /* renamed from: b */
    public final n0 f1476b;

    /* renamed from: c */
    public final o f1477c;

    /* renamed from: d */
    public boolean f1478d = false;

    /* renamed from: e */
    public int f1479e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: s */
        public final /* synthetic */ View f1480s;

        public a(View view) {
            this.f1480s = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.f1480s.removeOnAttachStateChangeListener(this);
            View view2 = this.f1480s;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.h.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public m0(a0 a0Var, n0 n0Var, o oVar) {
        this.f1475a = a0Var;
        this.f1476b = n0Var;
        this.f1477c = oVar;
    }

    public m0(a0 a0Var, n0 n0Var, o oVar, l0 l0Var) {
        this.f1475a = a0Var;
        this.f1476b = n0Var;
        this.f1477c = oVar;
        oVar.f1518u = null;
        oVar.f1519v = null;
        oVar.I = 0;
        oVar.F = false;
        oVar.C = false;
        o oVar2 = oVar.y;
        oVar.f1522z = oVar2 != null ? oVar2.f1520w : null;
        oVar.y = null;
        Bundle bundle = l0Var.E;
        oVar.f1517t = bundle == null ? new Bundle() : bundle;
    }

    public m0(a0 a0Var, n0 n0Var, ClassLoader classLoader, x xVar, l0 l0Var) {
        this.f1475a = a0Var;
        this.f1476b = n0Var;
        o a10 = xVar.a(classLoader, l0Var.f1466s);
        Bundle bundle = l0Var.B;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.a0(l0Var.B);
        a10.f1520w = l0Var.f1467t;
        a10.E = l0Var.f1468u;
        a10.G = true;
        a10.N = l0Var.f1469v;
        a10.O = l0Var.f1470w;
        a10.P = l0Var.f1471x;
        a10.S = l0Var.y;
        a10.D = l0Var.f1472z;
        a10.R = l0Var.A;
        a10.Q = l0Var.C;
        a10.f1509e0 = g.c.values()[l0Var.D];
        Bundle bundle2 = l0Var.E;
        a10.f1517t = bundle2 == null ? new Bundle() : bundle2;
        this.f1477c = a10;
        if (g0.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public final void a() {
        if (g0.K(3)) {
            StringBuilder c10 = androidx.activity.result.a.c("moveto ACTIVITY_CREATED: ");
            c10.append(this.f1477c);
            Log.d("FragmentManager", c10.toString());
        }
        o oVar = this.f1477c;
        Bundle bundle = oVar.f1517t;
        oVar.L.Q();
        oVar.f1516s = 3;
        oVar.U = false;
        oVar.C();
        if (oVar.U) {
            if (g0.K(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + oVar);
            }
            View view = oVar.W;
            if (view != null) {
                Bundle bundle2 = oVar.f1517t;
                SparseArray<Parcelable> sparseArray = oVar.f1518u;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    oVar.f1518u = null;
                }
                if (oVar.W != null) {
                    v0 v0Var = oVar.f1511g0;
                    v0Var.f1596v.c(oVar.f1519v);
                    oVar.f1519v = null;
                }
                oVar.U = false;
                oVar.R(bundle2);
                if (!oVar.U) {
                    throw new e1("Fragment " + oVar + " did not call through to super.onViewStateRestored()");
                } else if (oVar.W != null) {
                    oVar.f1511g0.d(g.b.ON_CREATE);
                }
            }
            oVar.f1517t = null;
            h0 h0Var = oVar.L;
            h0Var.E = false;
            h0Var.F = false;
            h0Var.L.f1461h = false;
            h0Var.u(4);
            a0 a0Var = this.f1475a;
            o oVar2 = this.f1477c;
            a0Var.a(oVar2, oVar2.f1517t, false);
            return;
        }
        throw new e1("Fragment " + oVar + " did not call through to super.onActivityCreated()");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r1 >= r0.f1500a.size()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        r4 = r0.f1500a.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r4.V != r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        r4 = r4.W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        r3 = r2.indexOfChild(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            androidx.fragment.app.n0 r0 = r7.f1476b
            androidx.fragment.app.o r1 = r7.f1477c
            java.util.Objects.requireNonNull(r0)
            android.view.ViewGroup r2 = r1.V
            r3 = -1
            if (r2 != 0) goto Ld
            goto L4f
        Ld:
            java.util.ArrayList<androidx.fragment.app.o> r4 = r0.f1500a
            int r1 = r4.indexOf(r1)
            int r4 = r1 + (-1)
        L15:
            if (r4 < 0) goto L31
            java.util.ArrayList<androidx.fragment.app.o> r5 = r0.f1500a
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.o r5 = (androidx.fragment.app.o) r5
            android.view.ViewGroup r6 = r5.V
            if (r6 != r2) goto L2e
            android.view.View r5 = r5.W
            if (r5 == 0) goto L2e
            int r0 = r2.indexOfChild(r5)
            int r3 = r0 + 1
            goto L4f
        L2e:
            int r4 = r4 + (-1)
            goto L15
        L31:
            int r1 = r1 + 1
            java.util.ArrayList<androidx.fragment.app.o> r4 = r0.f1500a
            int r4 = r4.size()
            if (r1 >= r4) goto L4f
            java.util.ArrayList<androidx.fragment.app.o> r4 = r0.f1500a
            java.lang.Object r4 = r4.get(r1)
            androidx.fragment.app.o r4 = (androidx.fragment.app.o) r4
            android.view.ViewGroup r5 = r4.V
            if (r5 != r2) goto L31
            android.view.View r4 = r4.W
            if (r4 == 0) goto L31
            int r3 = r2.indexOfChild(r4)
        L4f:
            androidx.fragment.app.o r0 = r7.f1477c
            android.view.ViewGroup r1 = r0.V
            android.view.View r0 = r0.W
            r1.addView(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m0.b():void");
    }

    public final void c() {
        if (g0.K(3)) {
            StringBuilder c10 = androidx.activity.result.a.c("moveto ATTACHED: ");
            c10.append(this.f1477c);
            Log.d("FragmentManager", c10.toString());
        }
        o oVar = this.f1477c;
        o oVar2 = oVar.y;
        m0 m0Var = null;
        if (oVar2 != null) {
            m0 g10 = this.f1476b.g(oVar2.f1520w);
            if (g10 == null) {
                StringBuilder c11 = androidx.activity.result.a.c("Fragment ");
                c11.append(this.f1477c);
                c11.append(" declared target fragment ");
                c11.append(this.f1477c.y);
                c11.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(c11.toString());
            }
            o oVar3 = this.f1477c;
            oVar3.f1522z = oVar3.y.f1520w;
            oVar3.y = null;
            m0Var = g10;
        } else {
            String str = oVar.f1522z;
            if (str != null && (m0Var = this.f1476b.g(str)) == null) {
                StringBuilder c12 = androidx.activity.result.a.c("Fragment ");
                c12.append(this.f1477c);
                c12.append(" declared target fragment ");
                throw new IllegalStateException(b.b(c12, this.f1477c.f1522z, " that does not belong to this FragmentManager!"));
            }
        }
        if (m0Var != null) {
            m0Var.k();
        }
        o oVar4 = this.f1477c;
        g0 g0Var = oVar4.J;
        oVar4.K = g0Var.f1417t;
        oVar4.M = g0Var.f1419v;
        this.f1475a.g(oVar4, false);
        o oVar5 = this.f1477c;
        Iterator<o.e> it = oVar5.f1514j0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        oVar5.f1514j0.clear();
        oVar5.L.b(oVar5.K, oVar5.g(), oVar5);
        oVar5.f1516s = 0;
        oVar5.U = false;
        Context context = oVar5.K.f1604t;
        oVar5.E();
        if (oVar5.U) {
            Iterator<k0> it2 = oVar5.J.f1411m.iterator();
            while (it2.hasNext()) {
                it2.next().d();
            }
            h0 h0Var = oVar5.L;
            h0Var.E = false;
            h0Var.F = false;
            h0Var.L.f1461h = false;
            h0Var.u(0);
            this.f1475a.b(this.f1477c, false);
            return;
        }
        throw new e1("Fragment " + oVar5 + " did not call through to super.onAttach()");
    }

    public final int d() {
        o oVar = this.f1477c;
        if (oVar.J == null) {
            return oVar.f1516s;
        }
        int i10 = this.f1479e;
        int ordinal = oVar.f1509e0.ordinal();
        int i11 = 0;
        if (ordinal == 1) {
            i10 = Math.min(i10, 0);
        } else if (ordinal == 2) {
            i10 = Math.min(i10, 1);
        } else if (ordinal == 3) {
            i10 = Math.min(i10, 5);
        } else if (ordinal != 4) {
            i10 = Math.min(i10, -1);
        }
        o oVar2 = this.f1477c;
        if (oVar2.E) {
            if (oVar2.F) {
                i10 = Math.max(this.f1479e, 2);
                View view = this.f1477c.W;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f1479e < 4 ? Math.min(i10, oVar2.f1516s) : Math.min(i10, 1);
            }
        }
        if (!this.f1477c.C) {
            i10 = Math.min(i10, 1);
        }
        o oVar3 = this.f1477c;
        ViewGroup viewGroup = oVar3.V;
        z0.b bVar = null;
        if (viewGroup != null) {
            z0 g10 = z0.g(viewGroup, oVar3.q().I());
            Objects.requireNonNull(g10);
            z0.b d5 = g10.d(this.f1477c);
            if (d5 != null) {
                i11 = d5.f1619b;
            }
            o oVar4 = this.f1477c;
            Iterator<z0.b> it = g10.f1614c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                z0.b next = it.next();
                if (next.f1620c.equals(oVar4) && !next.f1623f) {
                    bVar = next;
                    break;
                }
            }
            if (bVar != null && (i11 == 0 || i11 == 1)) {
                i11 = bVar.f1619b;
            }
        }
        if (i11 == 2) {
            i10 = Math.min(i10, 6);
        } else if (i11 == 3) {
            i10 = Math.max(i10, 3);
        } else {
            o oVar5 = this.f1477c;
            if (oVar5.D) {
                i10 = oVar5.B() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        o oVar6 = this.f1477c;
        if (oVar6.X && oVar6.f1516s < 5) {
            i10 = Math.min(i10, 4);
        }
        if (g0.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f1477c);
        }
        return i10;
    }

    public final void e() {
        if (g0.K(3)) {
            StringBuilder c10 = androidx.activity.result.a.c("moveto CREATED: ");
            c10.append(this.f1477c);
            Log.d("FragmentManager", c10.toString());
        }
        o oVar = this.f1477c;
        if (!oVar.f1507c0) {
            this.f1475a.h(oVar, oVar.f1517t, false);
            final o oVar2 = this.f1477c;
            Bundle bundle = oVar2.f1517t;
            oVar2.L.Q();
            oVar2.f1516s = 1;
            oVar2.U = false;
            oVar2.f1510f0.a(new j() { // from class: androidx.fragment.app.Fragment$6
                @Override // androidx.lifecycle.j
                public final void a(l lVar, g.b bVar) {
                    View view;
                    if (bVar != g.b.ON_STOP || (view = o.this.W) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
            oVar2.f1513i0.c(bundle);
            oVar2.F(bundle);
            oVar2.f1507c0 = true;
            if (oVar2.U) {
                oVar2.f1510f0.f(g.b.ON_CREATE);
                a0 a0Var = this.f1475a;
                o oVar3 = this.f1477c;
                a0Var.c(oVar3, oVar3.f1517t, false);
                return;
            }
            throw new e1("Fragment " + oVar2 + " did not call through to super.onCreate()");
        }
        oVar.Y(oVar.f1517t);
        this.f1477c.f1516s = 1;
    }

    public final void f() {
        String str;
        if (this.f1477c.E) {
            return;
        }
        if (g0.K(3)) {
            StringBuilder c10 = androidx.activity.result.a.c("moveto CREATE_VIEW: ");
            c10.append(this.f1477c);
            Log.d("FragmentManager", c10.toString());
        }
        o oVar = this.f1477c;
        LayoutInflater T = oVar.T(oVar.f1517t);
        ViewGroup viewGroup = null;
        o oVar2 = this.f1477c;
        ViewGroup viewGroup2 = oVar2.V;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = oVar2.O;
            if (i10 != 0) {
                if (i10 != -1) {
                    viewGroup = (ViewGroup) oVar2.J.f1418u.i(i10);
                    if (viewGroup == null) {
                        o oVar3 = this.f1477c;
                        if (!oVar3.G) {
                            try {
                                str = oVar3.t().getResourceName(this.f1477c.O);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            StringBuilder c11 = androidx.activity.result.a.c("No view found for id 0x");
                            c11.append(Integer.toHexString(this.f1477c.O));
                            c11.append(" (");
                            c11.append(str);
                            c11.append(") for fragment ");
                            c11.append(this.f1477c);
                            throw new IllegalArgumentException(c11.toString());
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        o oVar4 = this.f1477c;
                        d dVar = d.f20245a;
                        f.e(oVar4, "fragment");
                        y0.j jVar = new y0.j(oVar4, viewGroup);
                        d dVar2 = d.f20245a;
                        d.c(jVar);
                        d.c a10 = d.a(oVar4);
                        if (a10.f20254a.contains(d.a.DETECT_WRONG_FRAGMENT_CONTAINER) && d.f(a10, oVar4.getClass(), y0.j.class)) {
                            d.b(a10, jVar);
                        }
                    }
                } else {
                    StringBuilder c12 = androidx.activity.result.a.c("Cannot create fragment ");
                    c12.append(this.f1477c);
                    c12.append(" for a container view with no id");
                    throw new IllegalArgumentException(c12.toString());
                }
            }
        }
        o oVar5 = this.f1477c;
        oVar5.V = viewGroup;
        oVar5.S(T, viewGroup, oVar5.f1517t);
        View view = this.f1477c.W;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            o oVar6 = this.f1477c;
            oVar6.W.setTag(R.id.fragment_container_view_tag, oVar6);
            if (viewGroup != null) {
                b();
            }
            o oVar7 = this.f1477c;
            if (oVar7.Q) {
                oVar7.W.setVisibility(8);
            }
            View view2 = this.f1477c.W;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            if (z.g.b(view2)) {
                z.h.c(this.f1477c.W);
            } else {
                View view3 = this.f1477c.W;
                view3.addOnAttachStateChangeListener(new a(view3));
            }
            o oVar8 = this.f1477c;
            View view4 = oVar8.W;
            oVar8.Q(oVar8.f1517t);
            oVar8.L.u(2);
            a0 a0Var = this.f1475a;
            o oVar9 = this.f1477c;
            a0Var.m(oVar9, oVar9.W, oVar9.f1517t, false);
            int visibility = this.f1477c.W.getVisibility();
            this.f1477c.i().f1536l = this.f1477c.W.getAlpha();
            o oVar10 = this.f1477c;
            if (oVar10.V != null && visibility == 0) {
                View findFocus = oVar10.W.findFocus();
                if (findFocus != null) {
                    this.f1477c.b0(findFocus);
                    if (g0.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f1477c);
                    }
                }
                this.f1477c.W.setAlpha(0.0f);
            }
        }
        this.f1477c.f1516s = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r2 != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m0.g():void");
    }

    public final void h() {
        View view;
        if (g0.K(3)) {
            StringBuilder c10 = androidx.activity.result.a.c("movefrom CREATE_VIEW: ");
            c10.append(this.f1477c);
            Log.d("FragmentManager", c10.toString());
        }
        o oVar = this.f1477c;
        ViewGroup viewGroup = oVar.V;
        if (viewGroup != null && (view = oVar.W) != null) {
            viewGroup.removeView(view);
        }
        o oVar2 = this.f1477c;
        oVar2.L.u(1);
        if (oVar2.W != null) {
            v0 v0Var = oVar2.f1511g0;
            v0Var.e();
            if (v0Var.f1595u.f1702b.b(g.c.CREATED)) {
                oVar2.f1511g0.d(g.b.ON_DESTROY);
            }
        }
        oVar2.f1516s = 1;
        oVar2.U = false;
        oVar2.I();
        if (oVar2.U) {
            b.C0055b c0055b = ((d1.b) d1.a.b(oVar2)).f3731b;
            int i10 = c0055b.f3733c.f17205u;
            for (int i11 = 0; i11 < i10; i11++) {
                Objects.requireNonNull((b.a) c0055b.f3733c.f17204t[i11]);
            }
            oVar2.H = false;
            this.f1475a.n(this.f1477c, false);
            o oVar3 = this.f1477c;
            oVar3.V = null;
            oVar3.W = null;
            oVar3.f1511g0 = null;
            oVar3.f1512h0.h(null);
            this.f1477c.F = false;
            return;
        }
        throw new e1("Fragment " + oVar2 + " did not call through to super.onDestroyView()");
    }

    public final void i() {
        if (g0.K(3)) {
            StringBuilder c10 = androidx.activity.result.a.c("movefrom ATTACHED: ");
            c10.append(this.f1477c);
            Log.d("FragmentManager", c10.toString());
        }
        o oVar = this.f1477c;
        oVar.f1516s = -1;
        boolean z10 = false;
        oVar.U = false;
        oVar.J();
        oVar.f1506b0 = null;
        if (oVar.U) {
            h0 h0Var = oVar.L;
            if (!h0Var.G) {
                h0Var.l();
                oVar.L = new h0();
            }
            this.f1475a.e(this.f1477c, false);
            o oVar2 = this.f1477c;
            oVar2.f1516s = -1;
            oVar2.K = null;
            oVar2.M = null;
            oVar2.J = null;
            boolean z11 = true;
            if (oVar2.D && !oVar2.B()) {
                z10 = true;
            }
            if (!z10) {
                j0 j0Var = this.f1476b.f1503d;
                if (j0Var.f1456c.containsKey(this.f1477c.f1520w) && j0Var.f1459f) {
                    z11 = j0Var.f1460g;
                }
                if (!z11) {
                    return;
                }
            }
            if (g0.K(3)) {
                StringBuilder c11 = androidx.activity.result.a.c("initState called for fragment: ");
                c11.append(this.f1477c);
                Log.d("FragmentManager", c11.toString());
            }
            this.f1477c.y();
            return;
        }
        throw new e1("Fragment " + oVar + " did not call through to super.onDetach()");
    }

    public final void j() {
        o oVar = this.f1477c;
        if (!oVar.E || !oVar.F || oVar.H) {
            return;
        }
        if (g0.K(3)) {
            StringBuilder c10 = androidx.activity.result.a.c("moveto CREATE_VIEW: ");
            c10.append(this.f1477c);
            Log.d("FragmentManager", c10.toString());
        }
        o oVar2 = this.f1477c;
        oVar2.S(oVar2.T(oVar2.f1517t), null, this.f1477c.f1517t);
        View view = this.f1477c.W;
        if (view == null) {
            return;
        }
        view.setSaveFromParentEnabled(false);
        o oVar3 = this.f1477c;
        oVar3.W.setTag(R.id.fragment_container_view_tag, oVar3);
        o oVar4 = this.f1477c;
        if (oVar4.Q) {
            oVar4.W.setVisibility(8);
        }
        o oVar5 = this.f1477c;
        View view2 = oVar5.W;
        oVar5.Q(oVar5.f1517t);
        oVar5.L.u(2);
        a0 a0Var = this.f1475a;
        o oVar6 = this.f1477c;
        a0Var.m(oVar6, oVar6.W, oVar6.f1517t, false);
        this.f1477c.f1516s = 2;
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f1478d) {
            if (!g0.K(2)) {
                return;
            }
            StringBuilder c10 = androidx.activity.result.a.c("Ignoring re-entrant call to moveToExpectedState() for ");
            c10.append(this.f1477c);
            Log.v("FragmentManager", c10.toString());
            return;
        }
        try {
            this.f1478d = true;
            boolean z10 = false;
            while (true) {
                int d5 = d();
                o oVar = this.f1477c;
                int i10 = oVar.f1516s;
                if (d5 == i10) {
                    if (!z10 && i10 == -1 && oVar.D && !oVar.B()) {
                        Objects.requireNonNull(this.f1477c);
                        if (g0.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f1477c);
                        }
                        this.f1476b.f1503d.b(this.f1477c);
                        this.f1476b.j(this);
                        if (g0.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f1477c);
                        }
                        this.f1477c.y();
                    }
                    o oVar2 = this.f1477c;
                    if (oVar2.f1505a0) {
                        if (oVar2.W != null && (viewGroup = oVar2.V) != null) {
                            z0 g10 = z0.g(viewGroup, oVar2.q().I());
                            if (this.f1477c.Q) {
                                Objects.requireNonNull(g10);
                                if (g0.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f1477c);
                                }
                                g10.a(3, 1, this);
                            } else {
                                Objects.requireNonNull(g10);
                                if (g0.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f1477c);
                                }
                                g10.a(2, 1, this);
                            }
                        }
                        o oVar3 = this.f1477c;
                        g0 g0Var = oVar3.J;
                        if (g0Var != null && oVar3.C && g0Var.L(oVar3)) {
                            g0Var.D = true;
                        }
                        o oVar4 = this.f1477c;
                        oVar4.f1505a0 = false;
                        oVar4.L.o();
                    }
                    return;
                }
                if (d5 > i10) {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (oVar.W != null && (viewGroup3 = oVar.V) != null) {
                                z0 g11 = z0.g(viewGroup3, oVar.q().I());
                                int b10 = c1.b(this.f1477c.W.getVisibility());
                                Objects.requireNonNull(g11);
                                if (g0.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f1477c);
                                }
                                g11.a(b10, 2, this);
                            }
                            this.f1477c.f1516s = 4;
                            continue;
                        case 5:
                            q();
                            continue;
                        case 6:
                            oVar.f1516s = 6;
                            continue;
                        case 7:
                            n();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            g();
                            continue;
                        case 1:
                            h();
                            this.f1477c.f1516s = 1;
                            continue;
                        case 2:
                            oVar.F = false;
                            oVar.f1516s = 2;
                            continue;
                        case 3:
                            if (g0.K(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f1477c);
                            }
                            Objects.requireNonNull(this.f1477c);
                            o oVar5 = this.f1477c;
                            if (oVar5.W != null && oVar5.f1518u == null) {
                                p();
                            }
                            o oVar6 = this.f1477c;
                            if (oVar6.W != null && (viewGroup2 = oVar6.V) != null) {
                                z0 g12 = z0.g(viewGroup2, oVar6.q().I());
                                Objects.requireNonNull(g12);
                                if (g0.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f1477c);
                                }
                                g12.a(1, 3, this);
                            }
                            this.f1477c.f1516s = 3;
                            continue;
                        case 4:
                            r();
                            continue;
                        case 5:
                            oVar.f1516s = 5;
                            continue;
                        case 6:
                            l();
                            continue;
                        default:
                            continue;
                    }
                }
                z10 = true;
            }
        } finally {
            this.f1478d = false;
        }
    }

    public final void l() {
        if (g0.K(3)) {
            StringBuilder c10 = androidx.activity.result.a.c("movefrom RESUMED: ");
            c10.append(this.f1477c);
            Log.d("FragmentManager", c10.toString());
        }
        o oVar = this.f1477c;
        oVar.L.u(5);
        if (oVar.W != null) {
            oVar.f1511g0.d(g.b.ON_PAUSE);
        }
        oVar.f1510f0.f(g.b.ON_PAUSE);
        oVar.f1516s = 6;
        oVar.U = true;
        this.f1475a.f(this.f1477c, false);
    }

    public final void m(ClassLoader classLoader) {
        Bundle bundle = this.f1477c.f1517t;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        o oVar = this.f1477c;
        oVar.f1518u = oVar.f1517t.getSparseParcelableArray("android:view_state");
        o oVar2 = this.f1477c;
        oVar2.f1519v = oVar2.f1517t.getBundle("android:view_registry_state");
        o oVar3 = this.f1477c;
        oVar3.f1522z = oVar3.f1517t.getString("android:target_state");
        o oVar4 = this.f1477c;
        if (oVar4.f1522z != null) {
            oVar4.A = oVar4.f1517t.getInt("android:target_req_state", 0);
        }
        o oVar5 = this.f1477c;
        Objects.requireNonNull(oVar5);
        oVar5.Y = oVar5.f1517t.getBoolean("android:user_visible_hint", true);
        o oVar6 = this.f1477c;
        if (oVar6.Y) {
            return;
        }
        oVar6.X = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m0.n():void");
    }

    public final void o() {
        l0 l0Var = new l0(this.f1477c);
        o oVar = this.f1477c;
        if (oVar.f1516s <= -1 || l0Var.E != null) {
            l0Var.E = oVar.f1517t;
        } else {
            Bundle bundle = new Bundle();
            o oVar2 = this.f1477c;
            oVar2.N(bundle);
            oVar2.f1513i0.d(bundle);
            bundle.putParcelable("android:support:fragments", oVar2.L.X());
            this.f1475a.j(this.f1477c, bundle, false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (this.f1477c.W != null) {
                p();
            }
            if (this.f1477c.f1518u != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", this.f1477c.f1518u);
            }
            if (this.f1477c.f1519v != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", this.f1477c.f1519v);
            }
            if (!this.f1477c.Y) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", this.f1477c.Y);
            }
            l0Var.E = bundle;
            if (this.f1477c.f1522z != null) {
                if (bundle == null) {
                    l0Var.E = new Bundle();
                }
                l0Var.E.putString("android:target_state", this.f1477c.f1522z);
                int i10 = this.f1477c.A;
                if (i10 != 0) {
                    l0Var.E.putInt("android:target_req_state", i10);
                }
            }
        }
        this.f1476b.k(this.f1477c.f1520w, l0Var);
    }

    public final void p() {
        if (this.f1477c.W == null) {
            return;
        }
        if (g0.K(2)) {
            StringBuilder c10 = androidx.activity.result.a.c("Saving view state for fragment ");
            c10.append(this.f1477c);
            c10.append(" with view ");
            c10.append(this.f1477c.W);
            Log.v("FragmentManager", c10.toString());
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f1477c.W.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f1477c.f1518u = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f1477c.f1511g0.f1596v.d(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f1477c.f1519v = bundle;
    }

    public final void q() {
        if (g0.K(3)) {
            StringBuilder c10 = androidx.activity.result.a.c("moveto STARTED: ");
            c10.append(this.f1477c);
            Log.d("FragmentManager", c10.toString());
        }
        o oVar = this.f1477c;
        oVar.L.Q();
        oVar.L.A(true);
        oVar.f1516s = 5;
        oVar.U = false;
        oVar.O();
        if (oVar.U) {
            m mVar = oVar.f1510f0;
            g.b bVar = g.b.ON_START;
            mVar.f(bVar);
            if (oVar.W != null) {
                oVar.f1511g0.d(bVar);
            }
            h0 h0Var = oVar.L;
            h0Var.E = false;
            h0Var.F = false;
            h0Var.L.f1461h = false;
            h0Var.u(5);
            this.f1475a.k(this.f1477c, false);
            return;
        }
        throw new e1("Fragment " + oVar + " did not call through to super.onStart()");
    }

    public final void r() {
        if (g0.K(3)) {
            StringBuilder c10 = androidx.activity.result.a.c("movefrom STARTED: ");
            c10.append(this.f1477c);
            Log.d("FragmentManager", c10.toString());
        }
        o oVar = this.f1477c;
        h0 h0Var = oVar.L;
        h0Var.F = true;
        h0Var.L.f1461h = true;
        h0Var.u(4);
        if (oVar.W != null) {
            oVar.f1511g0.d(g.b.ON_STOP);
        }
        oVar.f1510f0.f(g.b.ON_STOP);
        oVar.f1516s = 4;
        oVar.U = false;
        oVar.P();
        if (oVar.U) {
            this.f1475a.l(this.f1477c, false);
            return;
        }
        throw new e1("Fragment " + oVar + " did not call through to super.onStop()");
    }
}

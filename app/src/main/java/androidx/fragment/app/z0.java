package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.g0;
import androidx.fragment.app.o;
import com.raouf.routerchef.R;
import i0.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a */
    public final ViewGroup f1612a;

    /* renamed from: b */
    public final ArrayList<b> f1613b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<b> f1614c = new ArrayList<>();

    /* renamed from: d */
    public boolean f1615d = false;

    /* renamed from: e */
    public boolean f1616e = false;

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: h */
        public final m0 f1617h;

        public a(int i10, int i11, m0 m0Var, c cVar) {
            super(i10, i11, m0Var.f1477c, cVar);
            this.f1617h = m0Var;
        }

        @Override // androidx.fragment.app.z0.b
        public final void c() {
            super.c();
            this.f1617h.k();
        }

        @Override // androidx.fragment.app.z0.b
        public final void e() {
            int i10 = this.f1619b;
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                o oVar = this.f1617h.f1477c;
                View X = oVar.X();
                if (g0.K(2)) {
                    StringBuilder c10 = androidx.activity.result.a.c("Clearing focus ");
                    c10.append(X.findFocus());
                    c10.append(" on view ");
                    c10.append(X);
                    c10.append(" for Fragment ");
                    c10.append(oVar);
                    Log.v("FragmentManager", c10.toString());
                }
                X.clearFocus();
                return;
            }
            o oVar2 = this.f1617h.f1477c;
            View findFocus = oVar2.W.findFocus();
            if (findFocus != null) {
                oVar2.b0(findFocus);
                if (g0.K(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + oVar2);
                }
            }
            View X2 = this.f1620c.X();
            if (X2.getParent() == null) {
                this.f1617h.b();
                X2.setAlpha(0.0f);
            }
            if (X2.getAlpha() == 0.0f && X2.getVisibility() == 0) {
                X2.setVisibility(4);
            }
            o.c cVar = oVar2.Z;
            X2.setAlpha(cVar == null ? 1.0f : cVar.f1536l);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f1618a;

        /* renamed from: b */
        public int f1619b;

        /* renamed from: c */
        public final o f1620c;

        /* renamed from: d */
        public final List<Runnable> f1621d = new ArrayList();

        /* renamed from: e */
        public final HashSet<c> f1622e = new HashSet<>();

        /* renamed from: f */
        public boolean f1623f = false;

        /* renamed from: g */
        public boolean f1624g = false;

        public b(int i10, int i11, o oVar, c cVar) {
            this.f1618a = i10;
            this.f1619b = i11;
            this.f1620c = oVar;
            cVar.b(new a1(this));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.Runnable>, java.util.ArrayList] */
        public final void a(Runnable runnable) {
            this.f1621d.add(runnable);
        }

        public final void b() {
            if (this.f1623f) {
                return;
            }
            this.f1623f = true;
            if (this.f1622e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f1622e).iterator();
            while (it.hasNext()) {
                ((c) it.next()).a();
            }
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<java.lang.Runnable>, java.util.ArrayList] */
        public void c() {
            if (this.f1624g) {
                return;
            }
            if (g0.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1624g = true;
            Iterator it = this.f1621d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void d(int i10, int i11) {
            if (i11 != 0) {
                int i12 = i11 - 1;
                if (i12 == 0) {
                    if (this.f1618a == 1) {
                        return;
                    }
                    if (g0.K(2)) {
                        StringBuilder c10 = androidx.activity.result.a.c("SpecialEffectsController: For fragment ");
                        c10.append(this.f1620c);
                        c10.append(" mFinalState = ");
                        c10.append(c1.d(this.f1618a));
                        c10.append(" -> ");
                        c10.append(c1.d(i10));
                        c10.append(". ");
                        Log.v("FragmentManager", c10.toString());
                    }
                    this.f1618a = i10;
                    return;
                } else if (i12 == 1) {
                    if (this.f1618a != 1) {
                        return;
                    }
                    if (g0.K(2)) {
                        StringBuilder c11 = androidx.activity.result.a.c("SpecialEffectsController: For fragment ");
                        c11.append(this.f1620c);
                        c11.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        c11.append(b1.c(this.f1619b));
                        c11.append(" to ADDING.");
                        Log.v("FragmentManager", c11.toString());
                    }
                    this.f1618a = 2;
                    this.f1619b = 2;
                    return;
                } else if (i12 != 2) {
                    return;
                } else {
                    if (g0.K(2)) {
                        StringBuilder c12 = androidx.activity.result.a.c("SpecialEffectsController: For fragment ");
                        c12.append(this.f1620c);
                        c12.append(" mFinalState = ");
                        c12.append(c1.d(this.f1618a));
                        c12.append(" -> REMOVED. mLifecycleImpact  = ");
                        c12.append(b1.c(this.f1619b));
                        c12.append(" to REMOVING.");
                        Log.v("FragmentManager", c12.toString());
                    }
                    this.f1618a = 1;
                    this.f1619b = 3;
                    return;
                }
            }
            throw null;
        }

        public void e() {
        }

        public final String toString() {
            StringBuilder c10 = androidx.fragment.app.a.c("Operation ", "{");
            c10.append(Integer.toHexString(System.identityHashCode(this)));
            c10.append("} ");
            c10.append("{");
            c10.append("mFinalState = ");
            c10.append(c1.d(this.f1618a));
            c10.append("} ");
            c10.append("{");
            c10.append("mLifecycleImpact = ");
            c10.append(b1.c(this.f1619b));
            c10.append("} ");
            c10.append("{");
            c10.append("mFragment = ");
            c10.append(this.f1620c);
            c10.append("}");
            return c10.toString();
        }
    }

    public z0(ViewGroup viewGroup) {
        this.f1612a = viewGroup;
    }

    public static z0 f(ViewGroup viewGroup, g0 g0Var) {
        return g(viewGroup, g0Var.I());
    }

    public static z0 g(ViewGroup viewGroup, d1 d1Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof z0) {
            return (z0) tag;
        }
        Objects.requireNonNull((g0.e) d1Var);
        e eVar = new e(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, eVar);
        return eVar;
    }

    public final void a(int i10, int i11, m0 m0Var) {
        synchronized (this.f1613b) {
            c cVar = new c();
            b d5 = d(m0Var.f1477c);
            if (d5 != null) {
                d5.d(i10, i11);
                return;
            }
            a aVar = new a(i10, i11, m0Var, cVar);
            this.f1613b.add(aVar);
            aVar.a(new x0(this, aVar));
            aVar.a(new y0(this, aVar));
        }
    }

    public abstract void b(List<b> list, boolean z10);

    public final void c() {
        if (this.f1616e) {
            return;
        }
        ViewGroup viewGroup = this.f1612a;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (!z.g.b(viewGroup)) {
            e();
            this.f1615d = false;
            return;
        }
        synchronized (this.f1613b) {
            if (!this.f1613b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f1614c);
                this.f1614c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (g0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + bVar);
                    }
                    bVar.b();
                    if (!bVar.f1624g) {
                        this.f1614c.add(bVar);
                    }
                }
                i();
                ArrayList arrayList2 = new ArrayList(this.f1613b);
                this.f1613b.clear();
                this.f1614c.addAll(arrayList2);
                if (g0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).e();
                }
                b(arrayList2, this.f1615d);
                this.f1615d = false;
                if (g0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    public final b d(o oVar) {
        Iterator<b> it = this.f1613b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1620c.equals(oVar) && !next.f1623f) {
                return next;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (g0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1612a;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        boolean b10 = z.g.b(viewGroup);
        synchronized (this.f1613b) {
            i();
            Iterator<b> it = this.f1613b.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
            Iterator it2 = new ArrayList(this.f1614c).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (g0.K(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (b10) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f1612a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(bVar);
                    Log.v("FragmentManager", sb.toString());
                }
                bVar.b();
            }
            Iterator it3 = new ArrayList(this.f1613b).iterator();
            while (it3.hasNext()) {
                b bVar2 = (b) it3.next();
                if (g0.K(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b10) {
                        str = "";
                    } else {
                        str = "Container " + this.f1612a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(bVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                bVar2.b();
            }
        }
    }

    public final void h() {
        synchronized (this.f1613b) {
            i();
            this.f1616e = false;
            int size = this.f1613b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                b bVar = this.f1613b.get(size);
                int c10 = c1.c(bVar.f1620c.W);
                if (bVar.f1618a == 2 && c10 != 2) {
                    o.c cVar = bVar.f1620c.Z;
                    this.f1616e = false;
                    break;
                }
            }
        }
    }

    public final void i() {
        Iterator<b> it = this.f1613b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1619b == 2) {
                next.d(c1.b(next.f1620c.X().getVisibility()), 1);
            }
        }
    }
}

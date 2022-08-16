package c4;

import a4.b;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.b1;
import b4.a;
import b4.a.c;
import b4.d;
import b4.j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import d4.b;
import d4.l;
import d4.m;
import f4.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p4.f;

/* loaded from: classes.dex */
public final class w<O extends a.c> implements d.a, d.b {
    public boolean A;
    public final /* synthetic */ e E;
    @NotOnlyInitialized

    /* renamed from: t */
    public final a.e f2745t;

    /* renamed from: u */
    public final b<O> f2746u;

    /* renamed from: v */
    public final m f2747v;
    public final int y;

    /* renamed from: z */
    public final j0 f2750z;

    /* renamed from: s */
    public final Queue<o0> f2744s = new LinkedList();

    /* renamed from: w */
    public final Set<p0> f2748w = new HashSet();

    /* renamed from: x */
    public final Map<h<?>, g0> f2749x = new HashMap();
    public final List<x> B = new ArrayList();
    public b C = null;
    public int D = 0;

    /* JADX WARN: Type inference failed for: r1v5, types: [b4.a$e] */
    public w(e eVar, b4.c<O> cVar) {
        this.E = eVar;
        Looper looper = eVar.F.getLooper();
        d4.c a10 = cVar.a().a();
        a.AbstractC0032a<?, O> abstractC0032a = cVar.f2563c.f2557a;
        Objects.requireNonNull(abstractC0032a, "null reference");
        ?? a11 = abstractC0032a.a(cVar.f2561a, looper, a10, cVar.f2564d, this, this);
        String str = cVar.f2562b;
        if (str != null && (a11 instanceof d4.b)) {
            ((d4.b) a11).f3822s = str;
        }
        if (str != null && (a11 instanceof i)) {
            Objects.requireNonNull((i) a11);
        }
        this.f2745t = a11;
        this.f2746u = cVar.f2565e;
        this.f2747v = new m();
        this.y = cVar.f2566f;
        if (a11.l()) {
            this.f2750z = new j0(eVar.f2689w, eVar.F, cVar.a().a());
        } else {
            this.f2750z = null;
        }
    }

    public final a4.d a(a4.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            a4.d[] h10 = this.f2745t.h();
            if (h10 == null) {
                h10 = new a4.d[0];
            }
            r.a aVar = new r.a(h10.length);
            for (a4.d dVar : h10) {
                aVar.put(dVar.f126s, Long.valueOf(dVar.s()));
            }
            for (a4.d dVar2 : dVarArr) {
                Long l10 = (Long) aVar.getOrDefault(dVar2.f126s, null);
                if (l10 == null || l10.longValue() < dVar2.s()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<c4.p0>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashSet, java.util.Set<c4.p0>] */
    public final void b(b bVar) {
        Iterator it = this.f2748w.iterator();
        if (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            if (l.a(bVar, b.f114w)) {
                this.f2745t.i();
            }
            Objects.requireNonNull(p0Var);
            throw null;
        }
        this.f2748w.clear();
    }

    public final void c(Status status) {
        m.c(this.E.F);
        d(status, null, false);
    }

    @Override // c4.j
    public final void c0(b bVar) {
        q(bVar, null);
    }

    public final void d(Status status, Exception exc, boolean z10) {
        m.c(this.E.F);
        boolean z11 = false;
        boolean z12 = status == null;
        if (exc == null) {
            z11 = true;
        }
        if (z12 != z11) {
            Iterator<o0> it = this.f2744s.iterator();
            while (it.hasNext()) {
                o0 next = it.next();
                if (!z10 || next.f2723a == 2) {
                    if (status != null) {
                        next.a(status);
                    } else {
                        next.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Queue<c4.o0>, java.util.LinkedList] */
    public final void e() {
        ArrayList arrayList = new ArrayList(this.f2744s);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0 o0Var = (o0) arrayList.get(i10);
            if (!this.f2745t.a()) {
                return;
            }
            if (k(o0Var)) {
                this.f2744s.remove(o0Var);
            }
        }
    }

    @Override // c4.d
    public final void e0() {
        if (Looper.myLooper() == this.E.F.getLooper()) {
            f();
        } else {
            this.E.F.post(new s(this, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<c4.h<?>, c4.g0>, java.util.HashMap] */
    public final void f() {
        n();
        b(b.f114w);
        j();
        Iterator it = this.f2749x.values().iterator();
        if (it.hasNext()) {
            Objects.requireNonNull((g0) it.next());
            throw null;
        }
        e();
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Map<c4.h<?>, c4.g0>, java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r6) {
        /*
            r5 = this;
            r5.n()
            r0 = 1
            r5.A = r0
            c4.m r1 = r5.f2747v
            b4.a$e r2 = r5.f2745t
            java.lang.String r2 = r2.j()
            java.util.Objects.requireNonNull(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The connection to Google Play services was lost"
            r3.<init>(r4)
            if (r6 != r0) goto L1d
            java.lang.String r6 = " due to service disconnection."
            goto L22
        L1d:
            r4 = 3
            if (r6 != r4) goto L25
            java.lang.String r6 = " due to dead object exception."
        L22:
            r3.append(r6)
        L25:
            if (r2 == 0) goto L2f
            java.lang.String r6 = " Last reason for disconnect: "
            r3.append(r6)
            r3.append(r2)
        L2f:
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r2 = 20
            java.lang.String r3 = r3.toString()
            r6.<init>(r2, r3)
            r1.a(r0, r6)
            c4.e r6 = r5.E
            p4.f r6 = r6.F
            r0 = 9
            c4.b<O extends b4.a$c> r1 = r5.f2746u
            android.os.Message r0 = android.os.Message.obtain(r6, r0, r1)
            c4.e r1 = r5.E
            java.util.Objects.requireNonNull(r1)
            r1 = 5000(0x1388, double:2.4703E-320)
            r6.sendMessageDelayed(r0, r1)
            c4.e r6 = r5.E
            p4.f r6 = r6.F
            r0 = 11
            c4.b<O extends b4.a$c> r1 = r5.f2746u
            android.os.Message r0 = android.os.Message.obtain(r6, r0, r1)
            c4.e r1 = r5.E
            java.util.Objects.requireNonNull(r1)
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            r6.sendMessageDelayed(r0, r1)
            c4.e r6 = r5.E
            d4.a0 r6 = r6.y
            android.util.SparseIntArray r6 = r6.f3801a
            r6.clear()
            java.util.Map<c4.h<?>, c4.g0> r6 = r5.f2749x
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L84
            return
        L84:
            java.lang.Object r6 = r6.next()
            c4.g0 r6 = (c4.g0) r6
            java.util.Objects.requireNonNull(r6)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.w.g(int):void");
    }

    public final void h() {
        this.E.F.removeMessages(12, this.f2746u);
        f fVar = this.E.F;
        fVar.sendMessageDelayed(fVar.obtainMessage(12, this.f2746u), this.E.f2685s);
    }

    public final void i(o0 o0Var) {
        o0Var.d(this.f2747v, s());
        try {
            o0Var.c(this);
        } catch (DeadObjectException unused) {
            w(1);
            this.f2745t.d("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void j() {
        if (this.A) {
            this.E.F.removeMessages(11, this.f2746u);
            this.E.F.removeMessages(9, this.f2746u);
            this.A = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<c4.x>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<c4.x>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.List<c4.x>, java.util.ArrayList] */
    public final boolean k(o0 o0Var) {
        if (!(o0Var instanceof c0)) {
            i(o0Var);
            return true;
        }
        c0 c0Var = (c0) o0Var;
        a4.d a10 = a(c0Var.g(this));
        if (a10 == null) {
            i(o0Var);
            return true;
        }
        String name = this.f2745t.getClass().getName();
        String str = a10.f126s;
        long s10 = a10.s();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        b1.b(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(s10);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.E.G || !c0Var.f(this)) {
            c0Var.b(new j(a10));
            return true;
        }
        x xVar = new x(this.f2746u, a10);
        int indexOf = this.B.indexOf(xVar);
        if (indexOf >= 0) {
            x xVar2 = (x) this.B.get(indexOf);
            this.E.F.removeMessages(15, xVar2);
            f fVar = this.E.F;
            Message obtain = Message.obtain(fVar, 15, xVar2);
            Objects.requireNonNull(this.E);
            fVar.sendMessageDelayed(obtain, 5000L);
            return false;
        }
        this.B.add(xVar);
        f fVar2 = this.E.F;
        Message obtain2 = Message.obtain(fVar2, 15, xVar);
        Objects.requireNonNull(this.E);
        fVar2.sendMessageDelayed(obtain2, 5000L);
        f fVar3 = this.E.F;
        Message obtain3 = Message.obtain(fVar3, 16, xVar);
        Objects.requireNonNull(this.E);
        fVar3.sendMessageDelayed(obtain3, 120000L);
        b bVar = new b(2, null, null);
        if (l(bVar)) {
            return false;
        }
        this.E.b(bVar, this.y);
        return false;
    }

    public final boolean l(b bVar) {
        synchronized (e.J) {
            e eVar = this.E;
            if (eVar.C == null || !eVar.D.contains(this.f2746u)) {
                return false;
            }
            n nVar = this.E.C;
            int i10 = this.y;
            Objects.requireNonNull(nVar);
            q0 q0Var = new q0(bVar, i10);
            if (nVar.f2737u.compareAndSet(null, q0Var)) {
                nVar.f2738v.post(new s0(nVar, q0Var));
            }
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map<c4.h<?>, c4.g0>, java.util.HashMap] */
    public final boolean m(boolean z10) {
        m.c(this.E.F);
        if (!this.f2745t.a() || this.f2749x.size() != 0) {
            return false;
        }
        m mVar = this.f2747v;
        if (!(!mVar.f2717a.isEmpty() || !mVar.f2718b.isEmpty())) {
            this.f2745t.d("Timing out service connection.");
            return true;
        }
        if (z10) {
            h();
        }
        return false;
    }

    public final void n() {
        m.c(this.E.F);
        this.C = null;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [b4.a$e, z4.f] */
    public final void o() {
        m.c(this.E.F);
        if (this.f2745t.a() || this.f2745t.g()) {
            return;
        }
        try {
            e eVar = this.E;
            int a10 = eVar.y.a(eVar.f2689w, this.f2745t);
            if (a10 != 0) {
                b bVar = new b(a10, null, null);
                String name = this.f2745t.getClass().getName();
                String bVar2 = bVar.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + bVar2.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(bVar2);
                Log.w("GoogleApiManager", sb.toString());
                q(bVar, null);
                return;
            }
            e eVar2 = this.E;
            a.e eVar3 = this.f2745t;
            z zVar = new z(eVar2, eVar3, this.f2746u);
            if (eVar3.l()) {
                j0 j0Var = this.f2750z;
                Objects.requireNonNull(j0Var, "null reference");
                z4.f fVar = j0Var.f2707x;
                if (fVar != null) {
                    ((d4.b) fVar).p();
                }
                j0Var.f2706w.f3841h = Integer.valueOf(System.identityHashCode(j0Var));
                a.AbstractC0032a<? extends z4.f, z4.a> abstractC0032a = j0Var.f2704u;
                Context context = j0Var.f2702s;
                Looper looper = j0Var.f2703t.getLooper();
                d4.c cVar = j0Var.f2706w;
                j0Var.f2707x = abstractC0032a.a(context, looper, cVar, cVar.f3840g, j0Var, j0Var);
                j0Var.y = zVar;
                Set<Scope> set = j0Var.f2705v;
                if (set != null && !set.isEmpty()) {
                    a5.a aVar = (a5.a) j0Var.f2707x;
                    Objects.requireNonNull(aVar);
                    aVar.m(new b.d());
                } else {
                    j0Var.f2703t.post(new h0(j0Var, 0));
                }
            }
            try {
                this.f2745t.m(zVar);
            } catch (SecurityException e10) {
                q(new a4.b(10, null, null), e10);
            }
        } catch (IllegalStateException e11) {
            q(new a4.b(10, null, null), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Queue<c4.o0>, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Queue<c4.o0>, java.util.LinkedList] */
    public final void p(o0 o0Var) {
        m.c(this.E.F);
        if (this.f2745t.a()) {
            if (k(o0Var)) {
                h();
                return;
            } else {
                this.f2744s.add(o0Var);
                return;
            }
        }
        this.f2744s.add(o0Var);
        a4.b bVar = this.C;
        if (bVar == null || !bVar.s()) {
            o();
        } else {
            q(this.C, null);
        }
    }

    public final void q(a4.b bVar, Exception exc) {
        z4.f fVar;
        m.c(this.E.F);
        j0 j0Var = this.f2750z;
        if (j0Var != null && (fVar = j0Var.f2707x) != null) {
            ((d4.b) fVar).p();
        }
        n();
        this.E.y.f3801a.clear();
        b(bVar);
        if ((this.f2745t instanceof e) && bVar.f116t != 24) {
            e eVar = this.E;
            eVar.f2686t = true;
            f fVar2 = eVar.F;
            fVar2.sendMessageDelayed(fVar2.obtainMessage(19), 300000L);
        }
        if (bVar.f116t == 4) {
            c(e.I);
        } else if (this.f2744s.isEmpty()) {
            this.C = bVar;
        } else if (exc != null) {
            m.c(this.E.F);
            d(null, exc, false);
        } else if (this.E.G) {
            d(e.c(this.f2746u, bVar), null, true);
            if (this.f2744s.isEmpty() || l(bVar) || this.E.b(bVar, this.y)) {
                return;
            }
            if (bVar.f116t == 18) {
                this.A = true;
            }
            if (this.A) {
                f fVar3 = this.E.F;
                Message obtain = Message.obtain(fVar3, 9, this.f2746u);
                Objects.requireNonNull(this.E);
                fVar3.sendMessageDelayed(obtain, 5000L);
                return;
            }
            c(e.c(this.f2746u, bVar));
        } else {
            c(e.c(this.f2746u, bVar));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<c4.h<?>, c4.g0>, java.util.HashMap] */
    public final void r() {
        m.c(this.E.F);
        Status status = e.H;
        c(status);
        m mVar = this.f2747v;
        Objects.requireNonNull(mVar);
        mVar.a(false, status);
        for (h hVar : (h[]) this.f2749x.keySet().toArray(new h[0])) {
            p(new n0(hVar, new c5.j()));
        }
        b(new a4.b(4, null, null));
        if (this.f2745t.a()) {
            this.f2745t.k(new v(this));
        }
    }

    public final boolean s() {
        return this.f2745t.l();
    }

    @Override // c4.d
    public final void w(int i10) {
        if (Looper.myLooper() == this.E.F.getLooper()) {
            g(i10);
        } else {
            this.E.F.post(new t(this, i10));
        }
    }
}

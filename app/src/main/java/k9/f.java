package k9;

import d.a;
import d9.l;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k9.o0;
import n9.c;
import v8.e;
import v8.h;
import z8.d;

/* loaded from: classes.dex */
public final class f<T> extends a0<T> implements e<T>, d {
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(f.class, "_decision");

    /* renamed from: z */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5648z = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = b.f5639s;

    /* renamed from: v */
    public final x8.d<T> f5649v;

    /* renamed from: w */
    public final x8.f f5650w;

    /* renamed from: x */
    public c0 f5651x;

    public f(x8.d dVar) {
        super(1);
        this.f5649v = dVar;
        this.f5650w = dVar.getContext();
    }

    @Override // z8.d
    public final d a() {
        x8.d<T> dVar = this.f5649v;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    @Override // k9.a0
    public final void b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof w0)) {
                if (obj2 instanceof m) {
                    return;
                }
                boolean z10 = false;
                if (obj2 instanceof l) {
                    l lVar = (l) obj2;
                    if (!(lVar.f5667e != null)) {
                        l a10 = l.a(lVar, null, th, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5648z;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            } else {
                                z10 = true;
                                break;
                            }
                        }
                        if (z10) {
                            d dVar = lVar.f5664b;
                            if (dVar != null) {
                                j(dVar, th);
                            }
                            l<Throwable, h> lVar2 = lVar.f5665c;
                            if (lVar2 == null) {
                                return;
                            }
                            k(lVar2, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5648z;
                    l lVar3 = new l(obj2, (d) null, (l) null, th, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, lVar3)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // k9.a0
    public final x8.d<T> c() {
        return this.f5649v;
    }

    @Override // x8.d
    public final void d(Object obj) {
        boolean z10;
        Object obj2;
        boolean z11;
        Throwable a10 = e.a(obj);
        if (a10 != null) {
            obj = new m(a10);
        }
        int i10 = this.f5637u;
        do {
            Object obj3 = this._state;
            z10 = true;
            if (obj3 instanceof w0) {
                w0 w0Var = (w0) obj3;
                if (!(obj instanceof m) && e9.d.h(i10) && ((z11 = w0Var instanceof d))) {
                    obj2 = new l(obj, z11 ? (d) w0Var : null, (l) null, (Throwable) null, 16);
                } else {
                    obj2 = obj;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5648z;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, obj2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            z10 = false;
                            continue;
                            break;
                        }
                    }
                }
            } else {
                if (obj3 instanceof g) {
                    g gVar = (g) obj3;
                    Objects.requireNonNull(gVar);
                    if (g.f5658c.compareAndSet(gVar, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(e9.f.j("Already resumed, but proposed with update ", obj).toString());
            }
        } while (!z10);
        n();
        o(i10);
    }

    @Override // k9.a0
    public final Throwable e(Object obj) {
        Throwable e10 = super.e(obj);
        if (e10 == null) {
            return null;
        }
        return e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k9.a0
    public final <T> T f(Object obj) {
        return obj instanceof l ? (T) ((l) obj).f5663a : obj;
    }

    @Override // x8.d
    public final x8.f getContext() {
        return this.f5650w;
    }

    @Override // k9.a0
    public final Object h() {
        return this._state;
    }

    public final void i(l<? super Throwable, h> lVar, Throwable th) {
        try {
            lVar.c(th);
        } catch (Throwable th2) {
            a.a(this.f5650w, new p(e9.f.j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void j(d dVar, Throwable th) {
        try {
            dVar.a(th);
        } catch (Throwable th2) {
            a.a(this.f5650w, new p(e9.f.j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void k(l<? super Throwable, h> lVar, Throwable th) {
        try {
            lVar.c(th);
        } catch (Throwable th2) {
            a.a(this.f5650w, new p(e9.f.j("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0020, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.lang.Throwable r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._state
            boolean r1 = r0 instanceof k9.w0
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            k9.g r1 = new k9.g
            boolean r3 = r0 instanceof k9.d
            r1.<init>(r7, r8, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = k9.f.f5648z
        L11:
            boolean r5 = r4.compareAndSet(r7, r0, r1)
            r6 = 1
            if (r5 == 0) goto L1a
            r2 = r6
            goto L20
        L1a:
            java.lang.Object r5 = r4.get(r7)
            if (r5 == r0) goto L11
        L20:
            if (r2 != 0) goto L23
            goto L0
        L23:
            if (r3 == 0) goto L28
            k9.d r0 = (k9.d) r0
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 != 0) goto L2c
            goto L2f
        L2c:
            r7.j(r0, r8)
        L2f:
            r7.n()
            int r8 = r7.f5637u
            r7.o(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.f.l(java.lang.Throwable):boolean");
    }

    public final void m() {
        c0 c0Var = this.f5651x;
        if (c0Var == null) {
            return;
        }
        c0Var.d();
        this.f5651x = v0.f5695s;
    }

    public final void n() {
        if (!r()) {
            m();
        }
    }

    public final void o(int i10) {
        boolean z10;
        boolean z11;
        while (true) {
            int i11 = this._decision;
            z10 = false;
            if (i11 == 0) {
                if (y.compareAndSet(this, 0, 2)) {
                    z11 = true;
                    break;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("Already resumed".toString());
            } else {
                z11 = false;
            }
        }
        if (z11) {
            return;
        }
        x8.d<T> dVar = this.f5649v;
        if (i10 == 4) {
            z10 = true;
        }
        if (z10 || !(dVar instanceof c) || e9.d.h(i10) != e9.d.h(this.f5637u)) {
            e9.d.i(this, dVar, z10);
            return;
        }
        q qVar = ((c) dVar).f16682v;
        x8.f context = dVar.getContext();
        if (qVar.n0()) {
            qVar.m0(context, this);
            return;
        }
        z0 z0Var = z0.f5699a;
        e0 a10 = z0.a();
        if (a10.s0()) {
            a10.q0(this);
            return;
        }
        a10.r0(true);
        try {
            e9.d.i(this, this.f5649v, true);
            do {
            } while (a10.t0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final Object p() {
        boolean z10;
        boolean r10 = r();
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 == 0) {
                if (y.compareAndSet(this, 0, 1)) {
                    z10 = true;
                    break;
                }
            } else if (i10 != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z10) {
            if (this.f5651x == null) {
                x8.f fVar = this.f5650w;
                int i11 = o0.f5676a;
                o0 o0Var = (o0) fVar.get(o0.b.f5677s);
                if (o0Var != null) {
                    this.f5651x = o0.a.a(o0Var, true, false, new h(this), 2, null);
                }
            }
            if (r10) {
                t();
            }
            return y8.a.COROUTINE_SUSPENDED;
        }
        if (r10) {
            t();
        }
        Object obj = this._state;
        if (obj instanceof m) {
            throw ((m) obj).f5670a;
        }
        if (e9.d.h(this.f5637u)) {
            x8.f fVar2 = this.f5650w;
            int i12 = o0.f5676a;
            o0 o0Var2 = (o0) fVar2.get(o0.b.f5677s);
            if (o0Var2 != null && !o0Var2.b()) {
                CancellationException L = o0Var2.L();
                b(obj, L);
                throw L;
            }
        }
        return f(obj);
    }

    public final void q(l<? super Throwable, h> lVar) {
        d l0Var = lVar instanceof d ? (d) lVar : new l0(lVar);
        while (true) {
            Object obj = this._state;
            boolean z10 = false;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5648z;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, l0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                Throwable th = null;
                if (obj instanceof d) {
                    s(lVar, obj);
                    throw null;
                }
                boolean z11 = obj instanceof m;
                if (z11) {
                    m mVar = (m) obj;
                    Objects.requireNonNull(mVar);
                    if (!m.f5669b.compareAndSet(mVar, 0, 1)) {
                        s(lVar, obj);
                        throw null;
                    } else if (!(obj instanceof g)) {
                        return;
                    } else {
                        if (!z11) {
                            mVar = null;
                        }
                        if (mVar != null) {
                            th = mVar.f5670a;
                        }
                        i(lVar, th);
                        return;
                    }
                } else if (obj instanceof l) {
                    l lVar2 = (l) obj;
                    if (lVar2.f5664b != null) {
                        s(lVar, obj);
                        throw null;
                    }
                    Throwable th2 = lVar2.f5667e;
                    if (th2 != null) {
                        i(lVar, th2);
                        return;
                    }
                    l a10 = l.a(lVar2, l0Var, null, 29);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5648z;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, a10)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                } else {
                    l lVar3 = new l(obj, l0Var, (l) null, (Throwable) null, 28);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f5648z;
                    while (true) {
                        if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, lVar3)) {
                            if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean r() {
        return (this.f5637u == 2) && ((c) this.f5649v).i();
    }

    public final void s(l<? super Throwable, h> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public final void t() {
        x8.d<T> dVar = this.f5649v;
        Throwable th = null;
        c cVar = dVar instanceof c ? (c) dVar : null;
        if (cVar != null) {
            th = cVar.l(this);
        }
        if (th == null) {
            return;
        }
        m();
        l(th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CancellableContinuation");
        sb.append('(');
        sb.append(u.c(this.f5649v));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof w0 ? "Active" : obj instanceof g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(u.b(this));
        return sb.toString();
    }
}

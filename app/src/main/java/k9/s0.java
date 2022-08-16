package k9;

import d9.l;
import d9.p;
import e9.f;
import j0.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k9.o0;
import n9.g;
import n9.h;
import n9.n;
import n9.r;
import v8.h;
import x8.f;

/* loaded from: classes.dex */
public class s0 implements o0, k, x0 {

    /* renamed from: s */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5684s = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* loaded from: classes.dex */
    public static final class a extends r0 {

        /* renamed from: w */
        public final s0 f5685w;

        /* renamed from: x */
        public final b f5686x;
        public final j y;

        /* renamed from: z */
        public final Object f5687z;

        public a(s0 s0Var, b bVar, j jVar, Object obj) {
            this.f5685w = s0Var;
            this.f5686x = bVar;
            this.y = jVar;
            this.f5687z = obj;
        }

        @Override // d9.l
        public final /* bridge */ /* synthetic */ h c(Throwable th) {
            m(th);
            return h.f19835a;
        }

        @Override // k9.o
        public final void m(Throwable th) {
            s0 s0Var = this.f5685w;
            b bVar = this.f5686x;
            j jVar = this.y;
            Object obj = this.f5687z;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s0.f5684s;
            j u10 = s0Var.u(jVar);
            if (u10 == null || !s0Var.B(bVar, u10, obj)) {
                s0Var.f(s0Var.m(bVar, obj));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements j0 {
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: s */
        public final u0 f5688s;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        public b(u0 u0Var, Throwable th) {
            this.f5688s = u0Var;
            this._rootCause = th;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
        public final void a(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th == th2) {
            } else {
                ?? r02 = this._exceptionsHolder;
                if (r02 == 0) {
                    this._exceptionsHolder = th;
                } else if (!(r02 instanceof Throwable)) {
                    if (!(r02 instanceof ArrayList)) {
                        throw new IllegalStateException(f.j("State is ", r02).toString());
                    }
                    ((ArrayList) r02).add(th);
                } else if (th == r02) {
                } else {
                    ArrayList<Throwable> c10 = c();
                    c10.add(r02);
                    c10.add(th);
                    this._exceptionsHolder = c10;
                }
            }
        }

        @Override // k9.j0
        public final boolean b() {
            return ((Throwable) this._rootCause) == null;
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        @Override // k9.j0
        public final u0 e() {
            return this.f5688s;
        }

        public final boolean f() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            return this._exceptionsHolder == d0.b.D;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        public final List<Throwable> i(Throwable th) {
            ArrayList<Throwable> arrayList;
            ?? r02 = this._exceptionsHolder;
            if (r02 == 0) {
                arrayList = c();
            } else if (r02 instanceof Throwable) {
                ArrayList<Throwable> c10 = c();
                c10.add(r02);
                arrayList = c10;
            } else if (!(r02 instanceof ArrayList)) {
                throw new IllegalStateException(f.j("State is ", r02).toString());
            } else {
                arrayList = (ArrayList) r02;
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !f.a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = d0.b.D;
            return arrayList;
        }

        public final void j() {
            this._isCompleting = 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("Finishing[cancelling=");
            c10.append(f());
            c10.append(", completing=");
            c10.append((boolean) this._isCompleting);
            c10.append(", rootCause=");
            c10.append((Throwable) this._rootCause);
            c10.append(", exceptions=");
            c10.append(this._exceptionsHolder);
            c10.append(", list=");
            c10.append(this.f5688s);
            c10.append(']');
            return c10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends h.a {

        /* renamed from: d */
        public final /* synthetic */ s0 f5689d;

        /* renamed from: e */
        public final /* synthetic */ Object f5690e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n9.h hVar, s0 s0Var, Object obj) {
            super(hVar);
            this.f5689d = s0Var;
            this.f5690e = obj;
        }

        @Override // n9.b
        public final Object c(n9.h hVar) {
            if (this.f5689d.o() == this.f5690e) {
                return null;
            }
            return g.f16697s;
        }
    }

    public final Object A(Object obj, Object obj2) {
        r rVar;
        boolean z10;
        if (!(obj instanceof j0)) {
            return d0.b.f3686z;
        }
        boolean z11 = true;
        boolean z12 = false;
        if (((obj instanceof d0) || (obj instanceof r0)) && !(obj instanceof j) && !(obj2 instanceof m)) {
            j0 j0Var = (j0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5684s;
            Object k0Var = obj2 instanceof j0 ? new k0((j0) obj2) : obj2;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, j0Var, k0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != j0Var) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                z11 = false;
            } else {
                w(obj2);
                k(j0Var, obj2);
            }
            return z11 ? obj2 : d0.b.B;
        }
        j0 j0Var2 = (j0) obj;
        u0 n10 = n(j0Var2);
        if (n10 == null) {
            return d0.b.B;
        }
        j jVar = null;
        b bVar = j0Var2 instanceof b ? (b) j0Var2 : null;
        if (bVar == null) {
            bVar = new b(n10, null);
        }
        synchronized (bVar) {
            if (!bVar.g()) {
                bVar.j();
                if (bVar != j0Var2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5684s;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, j0Var2, bVar)) {
                            if (atomicReferenceFieldUpdater2.get(this) != j0Var2) {
                                break;
                            }
                        } else {
                            z12 = true;
                            break;
                        }
                    }
                    if (!z12) {
                        rVar = d0.b.B;
                    }
                }
                boolean f10 = bVar.f();
                m mVar = obj2 instanceof m ? (m) obj2 : null;
                if (mVar != null) {
                    bVar.a(mVar.f5670a);
                }
                Throwable d5 = bVar.d();
                if (!(true ^ f10)) {
                    d5 = null;
                }
                if (d5 != null) {
                    v(n10, d5);
                }
                j jVar2 = j0Var2 instanceof j ? (j) j0Var2 : null;
                if (jVar2 == null) {
                    u0 e10 = j0Var2.e();
                    if (e10 != null) {
                        jVar = u(e10);
                    }
                } else {
                    jVar = jVar2;
                }
                return (jVar == null || !B(bVar, jVar, obj2)) ? m(bVar, obj2) : d0.b.A;
            }
            rVar = d0.b.f3686z;
            return rVar;
        }
    }

    public final boolean B(b bVar, j jVar, Object obj) {
        while (o0.a.a(jVar.f5661w, false, false, new a(this, bVar, jVar, obj), 1, null) == v0.f5695s) {
            jVar = u(jVar);
            if (jVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // k9.k
    public final void H(x0 x0Var) {
        g(x0Var);
    }

    @Override // k9.x0
    public final CancellationException I() {
        Throwable th;
        Object o10 = o();
        CancellationException cancellationException = null;
        if (o10 instanceof b) {
            th = ((b) o10).d();
        } else if (o10 instanceof m) {
            th = ((m) o10).f5670a;
        } else if (o10 instanceof j0) {
            throw new IllegalStateException(f.j("Cannot be cancelling child in this state: ", o10).toString());
        } else {
            th = null;
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        return cancellationException == null ? new p0(f.j("Parent job is ", y(o10)), th, this) : cancellationException;
    }

    @Override // k9.o0
    public final CancellationException L() {
        Object o10 = o();
        CancellationException cancellationException = null;
        if (!(o10 instanceof b)) {
            if (o10 instanceof j0) {
                throw new IllegalStateException(f.j("Job is still new or active: ", this).toString());
            }
            if (o10 instanceof m) {
                return z(((m) o10).f5670a, null);
            }
            return new p0(f.j(getClass().getSimpleName(), " has completed normally"), null, this);
        }
        Throwable d5 = ((b) o10).d();
        if (d5 != null) {
            cancellationException = z(d5, f.j(getClass().getSimpleName(), " is cancelling"));
        }
        if (cancellationException == null) {
            throw new IllegalStateException(f.j("Job is still new or active: ", this).toString());
        }
        return cancellationException;
    }

    @Override // k9.o0
    public final void Y(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new p0(i(), null, this);
        }
        g(cancellationException);
    }

    @Override // k9.o0
    public boolean b() {
        Object o10 = o();
        return (o10 instanceof j0) && ((j0) o10).b();
    }

    public final boolean e(Object obj, u0 u0Var, r0 r0Var) {
        boolean z10;
        boolean z11;
        c cVar = new c(r0Var, this, obj);
        do {
            n9.h j3 = u0Var.j();
            n9.h.f16702t.lazySet(r0Var, j3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n9.h.f16701s;
            atomicReferenceFieldUpdater.lazySet(r0Var, u0Var);
            cVar.f16705c = u0Var;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(j3, u0Var, cVar)) {
                    if (atomicReferenceFieldUpdater.get(j3) != u0Var) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            z11 = !z10 ? false : cVar.a(j3) == null ? true : true;
            if (z11) {
                return true;
            }
        } while (!z11);
        return false;
    }

    @Override // k9.o0
    public final c0 e0(boolean z10, boolean z11, l<? super Throwable, v8.h> lVar) {
        r0 r0Var;
        boolean z12;
        Throwable th;
        Throwable th2 = null;
        if (z10) {
            r0Var = lVar instanceof q0 ? (q0) lVar : null;
            if (r0Var == null) {
                r0Var = new m0(lVar);
            }
        } else {
            r0Var = lVar instanceof r0 ? (r0) lVar : null;
            if (r0Var == null) {
                r0Var = null;
            }
            if (r0Var == null) {
                r0Var = new n0(lVar);
            }
        }
        r0Var.f5682v = this;
        while (true) {
            Object o10 = o();
            if (o10 instanceof d0) {
                d0 d0Var = (d0) o10;
                if (d0Var.f5643s) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5684s;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, o10, r0Var)) {
                            if (atomicReferenceFieldUpdater.get(this) != o10) {
                                z12 = false;
                                break;
                            }
                        } else {
                            z12 = true;
                            break;
                        }
                    }
                    if (z12) {
                        return r0Var;
                    }
                } else {
                    u0 u0Var = new u0();
                    Object i0Var = d0Var.f5643s ? u0Var : new i0(u0Var);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5684s;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, d0Var, i0Var) && atomicReferenceFieldUpdater2.get(this) == d0Var) {
                    }
                }
            } else if (!(o10 instanceof j0)) {
                if (z11) {
                    m mVar = o10 instanceof m ? (m) o10 : null;
                    if (mVar != null) {
                        th2 = mVar.f5670a;
                    }
                    lVar.c(th2);
                }
                return v0.f5695s;
            } else {
                u0 e10 = ((j0) o10).e();
                if (e10 == null) {
                    Objects.requireNonNull(o10, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    x((r0) o10);
                } else {
                    c0 c0Var = v0.f5695s;
                    if (!z10 || !(o10 instanceof b)) {
                        th = null;
                    } else {
                        synchronized (o10) {
                            th = ((b) o10).d();
                            if (th == null || ((lVar instanceof j) && !((b) o10).g())) {
                                if (e(o10, e10, r0Var)) {
                                    if (th == null) {
                                        return r0Var;
                                    }
                                    c0Var = r0Var;
                                }
                            }
                        }
                    }
                    if (th != null) {
                        if (z11) {
                            lVar.c(th);
                        }
                        return c0Var;
                    } else if (e(o10, e10, r0Var)) {
                        return r0Var;
                    }
                }
            }
        }
    }

    public void f(Object obj) {
    }

    @Override // x8.f
    public final <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.b(r10, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
        r10 = d0.b.f3686z;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087 A[EDGE_INSN: B:63:0x0087->B:44:0x0087 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.o()
            boolean r3 = r2 instanceof k9.s0.b
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L4d
            monitor-enter(r2)
            r3 = r2
            k9.s0$b r3 = (k9.s0.b) r3     // Catch: java.lang.Throwable -> L4a
            boolean r3 = r3.h()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L1b
            n9.r r10 = d0.b.C     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r2)
            goto Lb1
        L1b:
            r3 = r2
            k9.s0$b r3 = (k9.s0.b) r3     // Catch: java.lang.Throwable -> L4a
            boolean r3 = r3.f()     // Catch: java.lang.Throwable -> L4a
            if (r10 != 0) goto L26
            if (r3 != 0) goto L32
        L26:
            if (r1 != 0) goto L2c
            java.lang.Throwable r1 = r9.l(r10)     // Catch: java.lang.Throwable -> L4a
        L2c:
            r10 = r2
            k9.s0$b r10 = (k9.s0.b) r10     // Catch: java.lang.Throwable -> L4a
            r10.a(r1)     // Catch: java.lang.Throwable -> L4a
        L32:
            r10 = r2
            k9.s0$b r10 = (k9.s0.b) r10     // Catch: java.lang.Throwable -> L4a
            java.lang.Throwable r10 = r10.d()     // Catch: java.lang.Throwable -> L4a
            r1 = r3 ^ 1
            if (r1 == 0) goto L3e
            r0 = r10
        L3e:
            monitor-exit(r2)
            if (r0 != 0) goto L42
            goto L87
        L42:
            k9.s0$b r2 = (k9.s0.b) r2
            k9.u0 r10 = r2.f5688s
            r9.v(r10, r0)
            goto L87
        L4a:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L4d:
            boolean r3 = r2 instanceof k9.j0
            if (r3 == 0) goto Laf
            if (r1 != 0) goto L57
            java.lang.Throwable r1 = r9.l(r10)
        L57:
            r3 = r2
            k9.j0 r3 = (k9.j0) r3
            boolean r6 = r3.b()
            if (r6 == 0) goto L8a
            k9.u0 r6 = r9.n(r3)
            if (r6 != 0) goto L67
            goto L7f
        L67:
            k9.s0$b r7 = new k9.s0$b
            r7.<init>(r6, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = k9.s0.f5684s
        L6e:
            boolean r2 = r8.compareAndSet(r9, r3, r7)
            if (r2 == 0) goto L76
            r2 = r5
            goto L7d
        L76:
            java.lang.Object r2 = r8.get(r9)
            if (r2 == r3) goto L6e
            r2 = r4
        L7d:
            if (r2 != 0) goto L81
        L7f:
            r2 = r4
            goto L85
        L81:
            r9.v(r6, r1)
            r2 = r5
        L85:
            if (r2 == 0) goto L2
        L87:
            n9.r r10 = d0.b.f3686z
            goto Lb1
        L8a:
            k9.m r3 = new k9.m
            r3.<init>(r1)
            java.lang.Object r3 = r9.A(r2, r3)
            n9.r r6 = d0.b.f3686z
            if (r3 == r6) goto L9f
            n9.r r2 = d0.b.B
            if (r3 != r2) goto L9d
            goto L2
        L9d:
            r10 = r3
            goto Lb1
        L9f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r0 = e9.f.j(r0, r2)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        Laf:
            n9.r r10 = d0.b.C
        Lb1:
            n9.r r0 = d0.b.f3686z
            if (r10 != r0) goto Lb6
            goto Lc3
        Lb6:
            n9.r r0 = d0.b.A
            if (r10 != r0) goto Lbb
            goto Lc3
        Lbb:
            n9.r r0 = d0.b.C
            if (r10 != r0) goto Lc0
            goto Lc4
        Lc0:
            r9.f(r10)
        Lc3:
            r4 = r5
        Lc4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.s0.g(java.lang.Object):boolean");
    }

    @Override // x8.f.b, x8.f
    public final <E extends f.b> E get(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // x8.f.b
    public final f.c<?> getKey() {
        return o0.b.f5677s;
    }

    public final boolean h(Throwable th) {
        if (r()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        i iVar = (i) this._parentHandle;
        return (iVar == null || iVar == v0.f5695s) ? z10 : iVar.g(th) || z10;
    }

    public String i() {
        return "Job was cancelled";
    }

    public final void k(j0 j0Var, Object obj) {
        p pVar;
        i iVar = (i) this._parentHandle;
        if (iVar != null) {
            iVar.d();
            this._parentHandle = v0.f5695s;
        }
        m mVar = obj instanceof m ? (m) obj : null;
        Throwable th = mVar == null ? null : mVar.f5670a;
        if (j0Var instanceof r0) {
            try {
                ((r0) j0Var).m(th);
                return;
            } catch (Throwable th2) {
                q(new p("Exception in completion handler " + j0Var + " for " + this, th2));
                return;
            }
        }
        u0 e10 = j0Var.e();
        if (e10 == null) {
            return;
        }
        p pVar2 = null;
        for (n9.h hVar = (n9.h) e10.h(); !e9.f.a(hVar, e10); hVar = hVar.i()) {
            if (hVar instanceof r0) {
                r0 r0Var = (r0) hVar;
                try {
                    r0Var.m(th);
                } catch (Throwable th3) {
                    if (pVar2 == null) {
                        pVar = null;
                    } else {
                        d.a(pVar2, th3);
                        pVar = pVar2;
                    }
                    if (pVar == null) {
                        pVar2 = new p("Exception in completion handler " + r0Var + " for " + this, th3);
                    }
                }
            }
        }
        if (pVar2 == null) {
            return;
        }
        q(pVar2);
    }

    public final Throwable l(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new p0(i(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((x0) obj).I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object m(b bVar, Object obj) {
        Throwable th = null;
        m mVar = obj instanceof m ? (m) obj : null;
        Throwable th2 = mVar == null ? null : mVar.f5670a;
        synchronized (bVar) {
            bVar.f();
            List<Throwable> i10 = bVar.i(th2);
            if (!i10.isEmpty()) {
                Iterator<T> it = i10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = i10.get(0);
                }
            } else if (bVar.f()) {
                th = new p0(i(), null, this);
            }
            if (th != null && i10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i10.size()));
                for (Throwable th3 : i10) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        d.a(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new m(th);
        }
        if (th != null) {
            if (h(th) || p(th)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                m.f5669b.compareAndSet((m) obj, 0, 1);
            }
        }
        w(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5684s;
        Object k0Var = obj instanceof j0 ? new k0((j0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, bVar, k0Var) && atomicReferenceFieldUpdater.get(this) == bVar) {
        }
        k(bVar, obj);
        return obj;
    }

    @Override // x8.f
    public final x8.f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    public final u0 n(j0 j0Var) {
        u0 e10 = j0Var.e();
        if (e10 == null) {
            if (j0Var instanceof d0) {
                return new u0();
            }
            if (!(j0Var instanceof r0)) {
                throw new IllegalStateException(e9.f.j("State should have list: ", j0Var).toString());
            }
            x((r0) j0Var);
            return null;
        }
        return e10;
    }

    public final Object o() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public boolean p(Throwable th) {
        return false;
    }

    public void q(Throwable th) {
        throw th;
    }

    public boolean r() {
        return false;
    }

    public final Object s(Object obj) {
        Object A;
        do {
            A = A(o(), obj);
            if (A == d0.b.f3686z) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                m mVar = obj instanceof m ? (m) obj : null;
                if (mVar != null) {
                    th = mVar.f5670a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (A == d0.b.B);
        return A;
    }

    public String t() {
        return getClass().getSimpleName();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(t() + '{' + y(o()) + '}');
        sb.append('@');
        sb.append(u.b(this));
        return sb.toString();
    }

    public final j u(n9.h hVar) {
        while (hVar.k()) {
            hVar = hVar.j();
        }
        while (true) {
            hVar = hVar.i();
            if (!hVar.k()) {
                if (hVar instanceof j) {
                    return (j) hVar;
                }
                if (hVar instanceof u0) {
                    return null;
                }
            }
        }
    }

    public final void v(u0 u0Var, Throwable th) {
        p pVar;
        p pVar2 = null;
        for (n9.h hVar = (n9.h) u0Var.h(); !e9.f.a(hVar, u0Var); hVar = hVar.i()) {
            if (hVar instanceof q0) {
                r0 r0Var = (r0) hVar;
                try {
                    r0Var.m(th);
                } catch (Throwable th2) {
                    if (pVar2 == null) {
                        pVar = null;
                    } else {
                        d.a(pVar2, th2);
                        pVar = pVar2;
                    }
                    if (pVar == null) {
                        pVar2 = new p("Exception in completion handler " + r0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (pVar2 != null) {
            q(pVar2);
        }
        h(th);
    }

    public void w(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(k9.r0 r6) {
        /*
            r5 = this;
            k9.u0 r0 = new k9.u0
            r0.<init>()
            java.util.Objects.requireNonNull(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = n9.h.f16702t
            r1.lazySet(r0, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = n9.h.f16701s
            r1.lazySet(r0, r6)
        L12:
            java.lang.Object r1 = r6.h()
            r2 = 0
            if (r1 == r6) goto L1a
            goto L30
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = n9.h.f16701s
        L1c:
            boolean r3 = r1.compareAndSet(r6, r6, r0)
            r4 = 1
            if (r3 == 0) goto L25
            r2 = r4
            goto L2b
        L25:
            java.lang.Object r3 = r1.get(r6)
            if (r3 == r6) goto L1c
        L2b:
            if (r2 == 0) goto L12
            r0.f(r6)
        L30:
            n9.h r1 = r6.i()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = k9.s0.f5684s
        L36:
            boolean r0 = r2.compareAndSet(r5, r6, r1)
            if (r0 == 0) goto L3d
            goto L43
        L3d:
            java.lang.Object r0 = r2.get(r5)
            if (r0 == r6) goto L36
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.s0.x(k9.r0):void");
    }

    public final String y(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof j0 ? ((j0) obj).b() ? "Active" : "New" : obj instanceof m ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.f() ? "Cancelling" : bVar.g() ? "Completing" : "Active";
    }

    public final CancellationException z(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = i();
            }
            cancellationException = new p0(str, th, this);
        }
        return cancellationException;
    }
}

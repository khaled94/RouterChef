package n9;

import c4.a;
import e9.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k9.a0;
import k9.e0;
import k9.n;
import k9.q;
import k9.u;
import k9.z0;
import n9.t;
import z8.d;

/* loaded from: classes.dex */
public final class c<T> extends a0<T> implements d, x8.d<T> {

    /* renamed from: z */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16681z = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_reusableCancellableContinuation");

    /* renamed from: v */
    public final q f16682v;

    /* renamed from: w */
    public final x8.d<T> f16683w;
    public final Object y;

    /* renamed from: x */
    public Object f16684x = d.f16685s;
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* JADX WARN: Multi-variable type inference failed */
    public c(q qVar, x8.d<? super T> dVar) {
        super(-1);
        this.f16682v = qVar;
        this.f16683w = dVar;
        Object fold = getContext().fold(0, t.a.f16721t);
        f.c(fold);
        this.y = fold;
    }

    @Override // z8.d
    public final d a() {
        x8.d<T> dVar = this.f16683w;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    @Override // k9.a0
    public final void b(Object obj, Throwable th) {
        if (obj instanceof n) {
            ((n) obj).f5674b.c(th);
        }
    }

    @Override // k9.a0
    public final x8.d<T> c() {
        return this;
    }

    @Override // x8.d
    public final void d(Object obj) {
        x8.f context = this.f16683w.getContext();
        Object d5 = a.d(obj, null);
        if (this.f16682v.n0()) {
            this.f16684x = d5;
            this.f5637u = 0;
            this.f16682v.m0(context, this);
            return;
        }
        z0 z0Var = z0.f5699a;
        e0 a10 = z0.a();
        if (a10.s0()) {
            this.f16684x = d5;
            this.f5637u = 0;
            a10.q0(this);
            return;
        }
        a10.r0(true);
        try {
            x8.f context2 = getContext();
            Object b10 = t.b(context2, this.y);
            this.f16683w.d(obj);
            t.a(context2, b10);
            do {
            } while (a10.t0());
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // x8.d
    public final x8.f getContext() {
        return this.f16683w.getContext();
    }

    @Override // k9.a0
    public final Object h() {
        Object obj = this.f16684x;
        this.f16684x = d.f16685s;
        return obj;
    }

    public final boolean i() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean j(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            r rVar = d.f16686t;
            boolean z10 = false;
            boolean z11 = true;
            if (f.a(obj, rVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16681z;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, th)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16681z;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        z11 = false;
                        break;
                    }
                }
                if (z11) {
                    return false;
                }
            }
        }
    }

    public final void k() {
        Object obj = this._reusableCancellableContinuation;
        k9.f fVar = obj instanceof k9.f ? (k9.f) obj : null;
        if (fVar == null) {
            return;
        }
        fVar.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0019, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Throwable l(k9.e<?> r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6._reusableCancellableContinuation
            n9.r r1 = n9.d.f16686t
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = n9.c.f16681z
        Lb:
            boolean r0 = r5.compareAndSet(r6, r1, r7)
            if (r0 == 0) goto L13
            r3 = r4
            goto L19
        L13:
            java.lang.Object r0 = r5.get(r6)
            if (r0 == r1) goto Lb
        L19:
            if (r3 == 0) goto L0
            return r2
        L1c:
            boolean r7 = r0 instanceof java.lang.Throwable
            if (r7 == 0) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = n9.c.f16681z
        L22:
            boolean r1 = r7.compareAndSet(r6, r0, r2)
            if (r1 == 0) goto L2a
            r3 = r4
            goto L30
        L2a:
            java.lang.Object r1 = r7.get(r6)
            if (r1 == r0) goto L22
        L30:
            if (r3 == 0) goto L35
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L35:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L41:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r1 = "Inconsistent state "
            java.lang.String r0 = e9.f.j(r1, r0)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.c.l(k9.e):java.lang.Throwable");
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("DispatchedContinuation[");
        c10.append(this.f16682v);
        c10.append(", ");
        c10.append(u.c(this.f16683w));
        c10.append(']');
        return c10.toString();
    }
}

package k9;

import d9.l;
import e9.g;
import n9.c;
import x8.b;
import x8.d;
import x8.e;
import x8.f;

/* loaded from: classes.dex */
public abstract class q extends x8.a implements e {

    /* renamed from: s */
    public static final a f5679s = new a();

    /* loaded from: classes.dex */
    public static final class a extends b<e, q> {

        /* renamed from: k9.q$a$a */
        /* loaded from: classes.dex */
        public static final class C0087a extends g implements l<f.b, q> {

            /* renamed from: t */
            public static final C0087a f5680t = new C0087a();

            public C0087a() {
                super(1);
            }

            @Override // d9.l
            public final q c(f.b bVar) {
                f.b bVar2 = bVar;
                if (bVar2 instanceof q) {
                    return (q) bVar2;
                }
                return null;
            }
        }

        public a() {
            super(e.a.f20102s, C0087a.f5680t);
        }
    }

    public q() {
        super(e.a.f20102s);
    }

    @Override // x8.e
    public final void c(d<?> dVar) {
        ((c) dVar).k();
    }

    @Override // x8.e
    public final <T> d<T> d0(d<? super T> dVar) {
        return new c(this, dVar);
    }

    @Override // x8.a, x8.f.b, x8.f
    public final <E extends f.b> E get(f.c<E> cVar) {
        e9.f.e(cVar, "key");
        if (!(cVar instanceof b)) {
            if (e.a.f20102s != cVar) {
                return null;
            }
            return this;
        }
        b bVar = (b) cVar;
        f.c<?> key = getKey();
        e9.f.e(key, "key");
        if (!(key == bVar || bVar.f20097t == key)) {
            return null;
        }
        E e10 = (E) bVar.f20096s.c(this);
        if (!(e10 instanceof f.b)) {
            return null;
        }
        return e10;
    }

    public abstract void m0(f fVar, Runnable runnable);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r3.a(r2) != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (x8.e.a.f20102s == r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        return x8.g.f20104s;
     */
    @Override // x8.a, x8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x8.f minusKey(x8.f.c<?> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            e9.f.e(r3, r0)
            boolean r1 = r3 instanceof x8.b
            if (r1 == 0) goto L29
            x8.b r3 = (x8.b) r3
            x8.f$c r1 = r2.getKey()
            e9.f.e(r1, r0)
            if (r1 == r3) goto L1b
            x8.f$c<?> r0 = r3.f20097t
            if (r0 != r1) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            if (r0 == 0) goto L27
            x8.f$b r3 = r3.a(r2)
            if (r3 == 0) goto L27
        L24:
            x8.g r3 = x8.g.f20104s
            goto L2e
        L27:
            r3 = r2
            goto L2e
        L29:
            x8.e$a r0 = x8.e.a.f20102s
            if (r0 != r3) goto L27
            goto L24
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.q.minusKey(x8.f$c):x8.f");
    }

    public boolean n0() {
        return !(this instanceof a1);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + u.b(this);
    }
}

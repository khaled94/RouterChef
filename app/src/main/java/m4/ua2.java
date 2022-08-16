package m4;

/* loaded from: classes.dex */
public final class ua2<T> implements eb2<T> {

    /* renamed from: a */
    public final qa2 f14325a;

    /* renamed from: b */
    public final pb2<?, ?> f14326b;

    /* renamed from: c */
    public final boolean f14327c;

    /* renamed from: d */
    public final a92<?> f14328d;

    public ua2(pb2<?, ?> pb2Var, a92<?> a92Var, qa2 qa2Var) {
        this.f14326b = pb2Var;
        this.f14327c = a92Var.h(qa2Var);
        this.f14328d = a92Var;
        this.f14325a = qa2Var;
    }

    @Override // m4.eb2
    public final int a(T t10) {
        int hashCode = this.f14326b.d(t10).hashCode();
        if (!this.f14327c) {
            return hashCode;
        }
        this.f14328d.a(t10);
        throw null;
    }

    @Override // m4.eb2
    public final T b() {
        return (T) ((j92) this.f14325a.c()).l();
    }

    @Override // m4.eb2
    public final void c(T t10) {
        this.f14326b.m(t10);
        this.f14328d.e(t10);
    }

    @Override // m4.eb2
    public final void d(T t10, T t11) {
        pb2<?, ?> pb2Var = this.f14326b;
        Class<?> cls = fb2.f8390a;
        pb2Var.o(t10, pb2Var.e(pb2Var.d(t10), pb2Var.d(t11)));
        if (!this.f14327c) {
            return;
        }
        this.f14328d.a(t11);
        throw null;
    }

    @Override // m4.eb2
    public final void e(T t10, byte[] bArr, int i10, int i11, e82 e82Var) {
        m92 m92Var = (m92) t10;
        if (m92Var.zzc == qb2.f12763f) {
            m92Var.zzc = qb2.b();
        }
        k92 k92Var = (k92) t10;
        throw null;
    }

    @Override // m4.eb2
    public final void f(T t10, w82 w82Var) {
        this.f14328d.a(t10);
        throw null;
    }

    @Override // m4.eb2
    public final void g(T t10, s82 s82Var, z82 z82Var) {
        boolean o10;
        pb2<?, ?> pb2Var = this.f14326b;
        a92<?> a92Var = this.f14328d;
        Object c10 = pb2Var.c(t10);
        a92Var.b(t10);
        while (s82Var.x() != Integer.MAX_VALUE) {
            try {
                int i10 = s82Var.f13549b;
                if (i10 != 11) {
                    if ((i10 & 7) != 2) {
                        o10 = s82Var.o();
                    } else if (a92Var.c(z82Var, this.f14325a, i10 >>> 3) != null) {
                        a92Var.f();
                    } else {
                        o10 = pb2Var.p(c10, s82Var);
                    }
                    if (!o10) {
                        return;
                    }
                } else {
                    int i11 = 0;
                    Object obj = null;
                    n82 n82Var = null;
                    while (s82Var.x() != Integer.MAX_VALUE) {
                        int i12 = s82Var.f13549b;
                        if (i12 == 16) {
                            i11 = s82Var.D();
                            obj = a92Var.c(z82Var, this.f14325a, i11);
                        } else if (i12 == 26) {
                            if (obj != null) {
                                a92Var.f();
                            } else {
                                n82Var = s82Var.J();
                            }
                        } else if (!s82Var.o()) {
                            break;
                        }
                    }
                    if (s82Var.f13549b != 12) {
                        throw x92.b();
                    } else if (n82Var != null) {
                        if (obj != null) {
                            a92Var.g();
                        } else {
                            pb2Var.k(c10, i11, n82Var);
                        }
                    }
                }
            } finally {
                pb2Var.n(t10, c10);
            }
        }
    }

    @Override // m4.eb2
    public final int h(T t10) {
        pb2<?, ?> pb2Var = this.f14326b;
        int b10 = pb2Var.b(pb2Var.d(t10));
        if (!this.f14327c) {
            return b10;
        }
        this.f14328d.a(t10);
        throw null;
    }

    @Override // m4.eb2
    public final boolean i(T t10, T t11) {
        if (!this.f14326b.d(t10).equals(this.f14326b.d(t11))) {
            return false;
        }
        if (!this.f14327c) {
            return true;
        }
        this.f14328d.a(t10);
        this.f14328d.a(t11);
        throw null;
    }

    @Override // m4.eb2
    public final boolean j(T t10) {
        this.f14328d.a(t10);
        throw null;
    }
}

package s4;

/* loaded from: classes.dex */
public final class h8<T> implements o8<T> {

    /* renamed from: a */
    public final d8 f17908a;

    /* renamed from: b */
    public final z8<?, ?> f17909b;

    /* renamed from: c */
    public final boolean f17910c;

    /* renamed from: d */
    public final p6<?> f17911d;

    public h8(z8<?, ?> z8Var, p6<?> p6Var, d8 d8Var) {
        this.f17909b = z8Var;
        this.f17910c = p6Var.c(d8Var);
        this.f17911d = p6Var;
        this.f17908a = d8Var;
    }

    @Override // s4.o8
    public final int a(T t10) {
        int hashCode = this.f17909b.c(t10).hashCode();
        if (!this.f17910c) {
            return hashCode;
        }
        this.f17911d.a(t10);
        throw null;
    }

    @Override // s4.o8
    public final T b() {
        return (T) ((y6) this.f17908a.d()).g();
    }

    @Override // s4.o8
    public final void c(T t10) {
        this.f17909b.g(t10);
        this.f17911d.b(t10);
    }

    @Override // s4.o8
    public final void d(T t10, T t11) {
        z8<?, ?> z8Var = this.f17909b;
        Class<?> cls = p8.f18060a;
        z8Var.h(t10, z8Var.d(z8Var.c(t10), z8Var.c(t11)));
        if (!this.f17910c) {
            return;
        }
        this.f17911d.a(t11);
        throw null;
    }

    @Override // s4.o8
    public final boolean e(T t10) {
        this.f17911d.a(t10);
        throw null;
    }

    @Override // s4.o8
    public final void f(T t10, byte[] bArr, int i10, int i11, a6 a6Var) {
        b7 b7Var = (b7) t10;
        if (b7Var.zzc == a9.f17720f) {
            b7Var.zzc = a9.b();
        }
        z6 z6Var = (z6) t10;
        throw null;
    }

    @Override // s4.o8
    public final boolean g(T t10, T t11) {
        if (!this.f17909b.c(t10).equals(this.f17909b.c(t11))) {
            return false;
        }
        if (!this.f17910c) {
            return true;
        }
        this.f17911d.a(t10);
        this.f17911d.a(t11);
        throw null;
    }

    @Override // s4.o8
    public final int h(T t10) {
        z8<?, ?> z8Var = this.f17909b;
        int b10 = z8Var.b(z8Var.c(t10));
        if (!this.f17910c) {
            return b10;
        }
        this.f17911d.a(t10);
        throw null;
    }

    @Override // s4.o8
    public final void i(T t10, l6 l6Var) {
        this.f17911d.a(t10);
        throw null;
    }
}

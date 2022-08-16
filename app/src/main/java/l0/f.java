package l0;

/* loaded from: classes.dex */
public final class f<T> extends e {

    /* renamed from: u */
    public final Object f5713u = new Object();

    public f() {
        super(12, 0);
    }

    @Override // l0.e
    public final T a() {
        T t10;
        synchronized (this.f5713u) {
            t10 = (T) super.a();
        }
        return t10;
    }

    @Override // l0.e
    public final boolean b(T t10) {
        boolean b10;
        synchronized (this.f5713u) {
            b10 = super.b(t10);
        }
        return b10;
    }
}

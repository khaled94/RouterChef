package m4;

/* loaded from: classes.dex */
public final class fy1<V> implements Runnable {

    /* renamed from: s */
    public final my1<V> f8675s;

    /* renamed from: t */
    public final tz1<? extends V> f8676t;

    public fy1(my1<V> my1Var, tz1<? extends V> tz1Var) {
        this.f8675s = my1Var;
        this.f8676t = tz1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8675s.f11358s != this) {
            return;
        }
        if (!my1.f11357x.d(this.f8675s, this, my1.f(this.f8676t))) {
            return;
        }
        my1.q(this.f8675s);
    }
}

package g1;

import k1.f;

/* loaded from: classes.dex */
public abstract class i<T> extends e0 {
    public i(z zVar) {
        super(zVar);
    }

    public abstract void e(f fVar, T t10);

    public final void f(T t10) {
        f a10 = a();
        try {
            e(a10, t10);
            a10.i0();
        } finally {
            d(a10);
        }
    }
}

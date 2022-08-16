package e2;

import e2.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    public final boolean k(V v10) {
        if (v10 == null) {
            v10 = (V) a.y;
        }
        if (a.f4380x.b(this, null, v10)) {
            a.d(this);
            return true;
        }
        return false;
    }

    public final boolean l(Throwable th) {
        Objects.requireNonNull(th);
        if (a.f4380x.b(this, null, new a.c(th))) {
            a.d(this);
            return true;
        }
        return false;
    }

    public final boolean m(g6.a<? extends V> aVar) {
        a.c cVar;
        Objects.requireNonNull(aVar);
        Object obj = this.f4381s;
        if (obj == null) {
            if (((a) aVar).isDone()) {
                if (!a.f4380x.b(this, null, a.g(aVar))) {
                    return false;
                }
                a.d(this);
            } else {
                a.f fVar = new a.f(this, aVar);
                if (a.f4380x.b(this, null, fVar)) {
                    try {
                        ((a) aVar).c(fVar, b.f4404s);
                    } catch (Throwable th) {
                        try {
                            cVar = new a.c(th);
                        } catch (Throwable unused) {
                            cVar = a.c.f4388b;
                        }
                        a.f4380x.b(this, fVar, cVar);
                    }
                } else {
                    obj = this.f4381s;
                }
            }
            return true;
        }
        if (obj instanceof a.b) {
            ((a) aVar).cancel(((a.b) obj).f4386a);
            return false;
        }
        return false;
    }
}

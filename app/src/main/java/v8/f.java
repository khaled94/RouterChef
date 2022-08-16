package v8;

import d9.a;
import java.io.Serializable;
import r2.d;

/* loaded from: classes.dex */
public final class f<T> implements Serializable {

    /* renamed from: s */
    public a<? extends T> f19832s;

    /* renamed from: t */
    public volatile Object f19833t = d.f17248s;

    /* renamed from: u */
    public final Object f19834u = this;

    public f(a aVar) {
        this.f19832s = aVar;
    }

    public final T a() {
        T t10;
        T t11 = (T) this.f19833t;
        d dVar = d.f17248s;
        if (t11 != dVar) {
            return t11;
        }
        synchronized (this.f19834u) {
            t10 = (T) this.f19833t;
            if (t10 == dVar) {
                a<? extends T> aVar = this.f19832s;
                e9.f.c(aVar);
                t10 = aVar.a();
                this.f19833t = t10;
                this.f19832s = null;
            }
        }
        return t10;
    }

    public final String toString() {
        return this.f19833t != d.f17248s ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

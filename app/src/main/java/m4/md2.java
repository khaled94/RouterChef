package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class md2<T> implements vd2, jd2 {

    /* renamed from: c */
    public static final Object f11164c = new Object();

    /* renamed from: a */
    public volatile vd2<T> f11165a;

    /* renamed from: b */
    public volatile Object f11166b = f11164c;

    public md2(vd2<T> vd2Var) {
        this.f11165a = vd2Var;
    }

    public static <P extends vd2<T>, T> jd2<T> b(P p) {
        if (p instanceof jd2) {
            return (jd2) p;
        }
        Objects.requireNonNull(p);
        return new md2(p);
    }

    public static <P extends vd2<T>, T> vd2<T> c(P p) {
        return p instanceof md2 ? p : new md2(p);
    }

    @Override // m4.vd2
    public final T a() {
        T t10 = (T) this.f11166b;
        Object obj = f11164c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f11166b;
                if (t10 == obj) {
                    t10 = this.f11165a.a();
                    Object obj2 = this.f11166b;
                    if (obj2 != obj && obj2 != t10) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t10);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f11166b = t10;
                    this.f11165a = null;
                }
            }
        }
        return t10;
    }
}

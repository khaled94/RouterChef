package d8;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a */
    public final Class<? super T> f3994a;

    /* renamed from: b */
    public final Type f3995b;

    /* renamed from: c */
    public final int f3996c;

    public a() {
        Type genericSuperclass = a.class.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a10 = z7.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f3995b = a10;
            this.f3994a = (Class<? super T>) z7.a.f(a10);
            this.f3996c = a10.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && z7.a.d(this.f3995b, ((a) obj).f3995b);
    }

    public final int hashCode() {
        return this.f3996c;
    }

    public final String toString() {
        return z7.a.j(this.f3995b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a10 = z7.a.a(type);
        this.f3995b = a10;
        this.f3994a = (Class<? super T>) z7.a.f(a10);
        this.f3996c = a10.hashCode();
    }
}

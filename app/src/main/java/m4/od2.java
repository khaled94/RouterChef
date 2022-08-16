package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class od2<T> implements nd2, jd2 {

    /* renamed from: b */
    public static final od2<Object> f12119b = new od2<>(null);

    /* renamed from: a */
    public final T f12120a;

    public od2(T t10) {
        this.f12120a = t10;
    }

    public static <T> nd2<T> b(T t10) {
        Objects.requireNonNull(t10, "instance cannot be null");
        return new od2(t10);
    }

    public static <T> nd2<T> c(T t10) {
        return t10 == null ? f12119b : new od2(t10);
    }

    @Override // m4.vd2
    public final T a() {
        return this.f12120a;
    }
}

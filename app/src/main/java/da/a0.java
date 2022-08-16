package da;

import javax.annotation.Nullable;
import r9.g0;

/* loaded from: classes.dex */
public final class a0<T> {

    /* renamed from: a */
    public final g0 f4004a;
    @Nullable

    /* renamed from: b */
    public final T f4005b;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(g0 g0Var, @Nullable Object obj) {
        this.f4004a = g0Var;
        this.f4005b = obj;
    }

    public static <T> a0<T> b(@Nullable T t10, g0 g0Var) {
        if (g0Var.j()) {
            return new a0<>(g0Var, t10);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final boolean a() {
        return this.f4004a.j();
    }

    public final String toString() {
        return this.f4004a.toString();
    }
}

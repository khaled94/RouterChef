package m4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes.dex */
public final class f11 {

    /* renamed from: a */
    public final j11 f8318a;

    /* renamed from: b */
    public final Executor f8319b;

    /* renamed from: c */
    public final Map<String, String> f8320c;

    public f11(j11 j11Var, Executor executor) {
        this.f8318a = j11Var;
        Objects.requireNonNull(j11Var);
        this.f8320c = new HashMap(j11Var.f10236a);
        this.f8319b = executor;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.concurrent.ConcurrentHashMap] */
    public final e11 a() {
        e11 e11Var = new e11(this);
        e11Var.f7689a.putAll(this.f8320c);
        return e11Var;
    }
}

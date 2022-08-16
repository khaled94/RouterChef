package k9;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a */
    public static final z0 f5699a = null;

    /* renamed from: b */
    public static final ThreadLocal<e0> f5700b = new ThreadLocal<>();

    public static final e0 a() {
        ThreadLocal<e0> threadLocal = f5700b;
        e0 e0Var = threadLocal.get();
        if (e0Var == null) {
            c cVar = new c(Thread.currentThread());
            threadLocal.set(cVar);
            return cVar;
        }
        return e0Var;
    }
}

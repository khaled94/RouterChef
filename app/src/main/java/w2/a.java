package w2;

/* loaded from: classes.dex */
public final class a<T> implements u8.a<T>, v2.a<T> {

    /* renamed from: c */
    public static final Object f19917c = new Object();

    /* renamed from: a */
    public volatile u8.a<T> f19918a;

    /* renamed from: b */
    public volatile Object f19919b = f19917c;

    public a(u8.a<T> aVar) {
        this.f19918a = aVar;
    }

    public static <P extends u8.a<T>, T> u8.a<T> a(P p) {
        return p instanceof a ? p : new a(p);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f19917c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // u8.a
    public final T get() {
        T t10 = (T) this.f19919b;
        Object obj = f19917c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f19919b;
                if (t10 == obj) {
                    t10 = this.f19918a.get();
                    b(this.f19919b, t10);
                    this.f19919b = t10;
                    this.f19918a = null;
                }
            }
        }
        return t10;
    }
}

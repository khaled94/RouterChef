package n6;

import o7.b;

/* loaded from: classes.dex */
public final class t<T> implements b<T> {

    /* renamed from: c */
    public static final Object f16658c = new Object();

    /* renamed from: a */
    public volatile Object f16659a = f16658c;

    /* renamed from: b */
    public volatile b<T> f16660b;

    public t(b<T> bVar) {
        this.f16660b = bVar;
    }

    @Override // o7.b
    public final T get() {
        T t10 = (T) this.f16659a;
        Object obj = f16658c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f16659a;
                if (t10 == obj) {
                    t10 = this.f16660b.get();
                    this.f16659a = t10;
                    this.f16660b = null;
                }
            }
        }
        return t10;
    }
}

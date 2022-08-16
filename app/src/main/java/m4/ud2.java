package m4;

/* loaded from: classes.dex */
public final class ud2<T> implements vd2<T> {

    /* renamed from: c */
    public static final Object f14380c = new Object();

    /* renamed from: a */
    public volatile vd2<T> f14381a;

    /* renamed from: b */
    public volatile Object f14382b = f14380c;

    public ud2(vd2<T> vd2Var) {
        this.f14381a = vd2Var;
    }

    public static <P extends vd2<T>, T> vd2<T> b(P p) {
        return ((p instanceof ud2) || (p instanceof md2)) ? p : new ud2(p);
    }

    @Override // m4.vd2
    public final T a() {
        T t10 = (T) this.f14382b;
        if (t10 == f14380c) {
            vd2<T> vd2Var = this.f14381a;
            if (vd2Var == null) {
                return (T) this.f14382b;
            }
            T a10 = vd2Var.a();
            this.f14382b = a10;
            this.f14381a = null;
            return a10;
        }
        return t10;
    }
}

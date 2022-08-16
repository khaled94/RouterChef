package e9;

/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a */
    public final Class<?> f4469a;

    public h(Class cls) {
        f.e(cls, "jClass");
        this.f4469a = cls;
    }

    @Override // e9.b
    public final Class<?> a() {
        return this.f4469a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h) && f.a(this.f4469a, ((h) obj).f4469a);
    }

    public final int hashCode() {
        return this.f4469a.hashCode();
    }

    public final String toString() {
        return this.f4469a.toString() + " (Kotlin reflection is not available)";
    }
}

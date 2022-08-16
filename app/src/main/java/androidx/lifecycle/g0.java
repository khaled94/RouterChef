package androidx.lifecycle;

import c1.d;
import e9.f;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a */
    public final i0 f1690a;

    /* renamed from: b */
    public final a f1691b;

    /* renamed from: c */
    public final c1.a f1692c;

    /* loaded from: classes.dex */
    public interface a {
        <T extends e0> T a(Class<T> cls);

        <T extends e0> T b(Class<T> cls, c1.a aVar);
    }

    /* loaded from: classes.dex */
    public static class b {
    }

    public g0(i0 i0Var, a aVar, c1.a aVar2) {
        f.e(i0Var, "store");
        f.e(aVar2, "defaultCreationExtras");
        this.f1690a = i0Var;
        this.f1691b = aVar;
        this.f1692c = aVar2;
    }

    public final <T extends e0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final <T extends e0> T b(String str, Class<T> cls) {
        T t10;
        f.e(str, "key");
        T t11 = (T) this.f1690a.f1700a.get(str);
        if (cls.isInstance(t11)) {
            a aVar = this.f1691b;
            if ((aVar instanceof b ? (b) aVar : null) != null) {
                f.d(t11, "viewModel");
            }
            Objects.requireNonNull(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t11;
        }
        d dVar = new d(this.f1692c);
        dVar.f2604a.put(h0.f1693s, str);
        try {
            t10 = (T) this.f1691b.b(cls, dVar);
        } catch (AbstractMethodError unused) {
            t10 = (T) this.f1691b.a(cls);
        }
        e0 put = this.f1690a.f1700a.put(str, t10);
        if (put != null) {
            put.a();
        }
        return t10;
    }
}

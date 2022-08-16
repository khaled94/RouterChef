package c1;

import androidx.activity.result.a;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import e9.f;

/* loaded from: classes.dex */
public final class b implements g0.a {

    /* renamed from: a */
    public final g<?>[] f2606a;

    public b(g<?>... gVarArr) {
        f.e(gVarArr, "initializers");
        this.f2606a = gVarArr;
    }

    @Override // androidx.lifecycle.g0.a
    public final e0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // androidx.lifecycle.g0.a
    public final <T extends e0> T b(Class<T> cls, a aVar) {
        g<?>[] gVarArr;
        T t10 = null;
        for (g<?> gVar : this.f2606a) {
            if (f.a(gVar.f2610a, cls)) {
                Object c10 = gVar.f2611b.c(aVar);
                t10 = c10 instanceof e0 ? (T) c10 : null;
            }
        }
        if (t10 != null) {
            return t10;
        }
        StringBuilder c11 = a.c("No initializer set for given class ");
        c11.append(cls.getName());
        throw new IllegalArgumentException(c11.toString());
    }
}

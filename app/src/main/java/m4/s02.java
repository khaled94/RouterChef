package m4;

import androidx.fragment.app.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import m4.qa2;

/* loaded from: classes.dex */
public abstract class s02<KeyProtoT extends qa2> {

    /* renamed from: a */
    public final Class<KeyProtoT> f13478a;

    /* renamed from: b */
    public final Map<Class<?>, r02<?, KeyProtoT>> f13479b;

    /* renamed from: c */
    public final Class<?> f13480c;

    @SafeVarargs
    public s02(Class<KeyProtoT> cls, r02<?, KeyProtoT>... r02VarArr) {
        this.f13478a = cls;
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            r02<?, KeyProtoT> r02Var = r02VarArr[i10];
            if (hashMap.containsKey(r02Var.f13093a)) {
                String valueOf = String.valueOf(r02Var.f13093a.getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            hashMap.put(r02Var.f13093a, r02Var);
        }
        this.f13480c = r02VarArr[0].f13093a;
        this.f13479b = Collections.unmodifiableMap(hashMap);
    }

    public fa0 a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract KeyProtoT b(n82 n82Var);

    public final <P> P c(KeyProtoT keyprotot, Class<P> cls) {
        r02<?, KeyProtoT> r02Var = this.f13479b.get(cls);
        if (r02Var != null) {
            return (P) r02Var.a(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException(a.b(new StringBuilder(String.valueOf(canonicalName).length() + 41), "Requested primitive class ", canonicalName, " not supported."));
    }

    public abstract String d();

    public final Set<Class<?>> e() {
        return this.f13479b.keySet();
    }

    public abstract void f(KeyProtoT keyprotot);

    public int g() {
        return 1;
    }

    public abstract int h();
}

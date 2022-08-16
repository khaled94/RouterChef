package m4;

import java.security.GeneralSecurityException;
import java.util.Set;
import k1.a;

/* loaded from: classes.dex */
public final class f12 implements g12 {

    /* renamed from: a */
    public final /* synthetic */ c12 f8321a;

    /* renamed from: b */
    public final /* synthetic */ s02 f8322b;

    public f12(c12 c12Var, s02 s02Var) {
        this.f8321a = c12Var;
        this.f8322b = s02Var;
    }

    @Override // m4.g12
    public final a a() {
        c12 c12Var = this.f8321a;
        return new b12(c12Var, c12Var.f13480c);
    }

    @Override // m4.g12
    public final Set<Class<?>> b() {
        return this.f8321a.e();
    }

    @Override // m4.g12
    public final Class<?> c() {
        return this.f8321a.getClass();
    }

    @Override // m4.g12
    public final <Q> a d(Class<Q> cls) {
        try {
            return new b12(this.f8321a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // m4.g12
    public final Class<?> g() {
        return this.f8322b.getClass();
    }
}

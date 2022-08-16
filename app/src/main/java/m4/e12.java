package m4;

import java.security.GeneralSecurityException;
import java.util.Set;
import k1.a;

/* loaded from: classes.dex */
public final class e12 implements g12 {

    /* renamed from: a */
    public final /* synthetic */ s02 f7691a;

    public e12(s02 s02Var) {
        this.f7691a = s02Var;
    }

    @Override // m4.g12
    public final a a() {
        s02 s02Var = this.f7691a;
        return new a(s02Var, (Class) s02Var.f13480c);
    }

    @Override // m4.g12
    public final Set<Class<?>> b() {
        return this.f7691a.e();
    }

    @Override // m4.g12
    public final Class<?> c() {
        return this.f7691a.getClass();
    }

    @Override // m4.g12
    public final <Q> a d(Class<Q> cls) {
        try {
            return new a(this.f7691a, (Class) cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // m4.g12
    public final Class<?> g() {
        return null;
    }
}

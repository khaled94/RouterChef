package m4;

import java.util.Collections;
import java.util.Set;
import k1.a;

/* loaded from: classes.dex */
public final class d12 implements g12 {

    /* renamed from: a */
    public final /* synthetic */ a f7172a;

    public d12(a aVar) {
        this.f7172a = aVar;
    }

    @Override // m4.g12
    public final a a() {
        return this.f7172a;
    }

    @Override // m4.g12
    public final Set<Class<?>> b() {
        return Collections.singleton((Class) this.f7172a.f5567t);
    }

    @Override // m4.g12
    public final Class<?> c() {
        return this.f7172a.getClass();
    }

    @Override // m4.g12
    public final <Q> a d(Class<Q> cls) {
        if (((Class) this.f7172a.f5567t).equals(cls)) {
            return this.f7172a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // m4.g12
    public final Class<?> g() {
        return null;
    }
}

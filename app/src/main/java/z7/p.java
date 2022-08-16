package z7;

import java.lang.reflect.Method;
import x5.f;

/* loaded from: classes.dex */
public final class p extends f {

    /* renamed from: a */
    public final /* synthetic */ Method f21056a;

    public p(Method method) {
        this.f21056a = method;
    }

    @Override // x5.f
    public final <T> T b(Class<T> cls) {
        f.a(cls);
        return (T) this.f21056a.invoke(null, cls, Object.class);
    }
}

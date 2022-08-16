package z7;

import java.lang.reflect.Method;
import x5.f;

/* loaded from: classes.dex */
public final class n extends f {

    /* renamed from: a */
    public final /* synthetic */ Method f21052a;

    /* renamed from: b */
    public final /* synthetic */ Object f21053b;

    public n(Method method, Object obj) {
        this.f21052a = method;
        this.f21053b = obj;
    }

    @Override // x5.f
    public final <T> T b(Class<T> cls) {
        f.a(cls);
        return (T) this.f21052a.invoke(this.f21053b, cls);
    }
}

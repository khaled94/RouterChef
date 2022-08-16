package z7;

import java.lang.reflect.Method;
import x5.f;

/* loaded from: classes.dex */
public final class o extends f {

    /* renamed from: a */
    public final /* synthetic */ Method f21054a;

    /* renamed from: b */
    public final /* synthetic */ int f21055b;

    public o(Method method, int i10) {
        this.f21054a = method;
        this.f21055b = i10;
    }

    @Override // x5.f
    public final <T> T b(Class<T> cls) {
        f.a(cls);
        return (T) this.f21054a.invoke(null, cls, Integer.valueOf(this.f21055b));
    }
}

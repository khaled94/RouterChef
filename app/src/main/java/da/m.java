package da;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public final Method f4054a;

    /* renamed from: b */
    public final List<?> f4055b;

    public m(Method method, List<?> list) {
        this.f4054a = method;
        this.f4055b = Collections.unmodifiableList(list);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f4054a.getDeclaringClass().getName(), this.f4054a.getName(), this.f4055b);
    }
}

package e9;

import h9.b;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public static final l f4470a;

    /* renamed from: b */
    public static final b[] f4471b;

    static {
        l lVar = null;
        try {
            lVar = (l) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (lVar == null) {
            lVar = new l();
        }
        f4470a = lVar;
        f4471b = new b[0];
    }

    public static b a(Class cls) {
        Objects.requireNonNull(f4470a);
        return new c(cls);
    }
}

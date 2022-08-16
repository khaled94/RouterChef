package n1;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d */
    public static volatile a f16420d;

    /* renamed from: e */
    public static final Object f16421e = new Object();

    /* renamed from: c */
    public final Context f16424c;

    /* renamed from: b */
    public final Set<Class<? extends b<?>>> f16423b = new HashSet();

    /* renamed from: a */
    public final Map<Class<?>, Object> f16422a = new HashMap();

    public a(Context context) {
        this.f16424c = context.getApplicationContext();
    }

    public static a b(Context context) {
        if (f16420d == null) {
            synchronized (f16421e) {
                if (f16420d == null) {
                    f16420d = new a(context);
                }
            }
        }
        return f16420d;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map<java.lang.Class<?>, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map<java.lang.Class<?>, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Map<java.lang.Class<?>, java.lang.Object>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Map<java.lang.Class<?>, java.lang.Object>, java.util.HashMap] */
    public final <T> T a(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t10;
        synchronized (f16421e) {
            if (o1.a.a()) {
                Trace.beginSection(cls.getSimpleName());
            }
            if (set.contains(cls)) {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
            if (!this.f16422a.containsKey(cls)) {
                set.add(cls);
                try {
                    b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends b<?>>> a10 = newInstance.a();
                    if (!a10.isEmpty()) {
                        for (Class<? extends b<?>> cls2 : a10) {
                            if (!this.f16422a.containsKey(cls2)) {
                                a(cls2, set);
                            }
                        }
                    }
                    t10 = (T) newInstance.b(this.f16424c);
                    set.remove(cls);
                    this.f16422a.put(cls, t10);
                } catch (Throwable th) {
                    throw new c(th);
                }
            } else {
                t10 = (T) this.f16422a.get(cls);
            }
            Trace.endSection();
        }
        return t10;
    }
}

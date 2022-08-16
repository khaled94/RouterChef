package androidx.lifecycle;

import androidx.lifecycle.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c */
    public static a f1654c = new a();

    /* renamed from: a */
    public final Map<Class<?>, C0015a> f1655a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f1656b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes.dex */
    public static class C0015a {

        /* renamed from: a */
        public final Map<g.b, List<b>> f1657a = new HashMap();

        /* renamed from: b */
        public final Map<b, g.b> f1658b;

        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<androidx.lifecycle.g$b, java.util.List<androidx.lifecycle.a$b>>, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<androidx.lifecycle.g$b, java.util.List<androidx.lifecycle.a$b>>, java.util.HashMap] */
        public C0015a(Map<b, g.b> map) {
            this.f1658b = map;
            for (Map.Entry<b, g.b> entry : map.entrySet()) {
                g.b value = entry.getValue();
                List list = (List) this.f1657a.get(value);
                if (list == null) {
                    list = new ArrayList();
                    this.f1657a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void a(List<b> list, l lVar, g.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar2 = list.get(size);
                    Objects.requireNonNull(bVar2);
                    try {
                        int i10 = bVar2.f1659a;
                        if (i10 == 0) {
                            bVar2.f1660b.invoke(obj, new Object[0]);
                        } else if (i10 == 1) {
                            bVar2.f1660b.invoke(obj, lVar);
                        } else if (i10 == 2) {
                            bVar2.f1660b.invoke(obj, lVar, bVar);
                        }
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException("Failed to call observer method", e11.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f1659a;

        /* renamed from: b */
        public final Method f1660b;

        public b(int i10, Method method) {
            this.f1659a = i10;
            this.f1660b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1659a == bVar.f1659a && this.f1660b.getName().equals(bVar.f1660b.getName());
        }

        public final int hashCode() {
            return this.f1660b.getName().hashCode() + (this.f1659a * 31);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map<java.lang.Class<?>, androidx.lifecycle.a$a>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Boolean>] */
    public final C0015a a(Class<?> cls, Method[] methodArr) {
        int i10;
        Class<?> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f1658b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, g.b> entry : b(cls2).f1658b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            t tVar = (t) method.getAnnotation(t.class);
            if (tVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (!parameterTypes[0].isAssignableFrom(l.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i10 = 1;
                }
                g.b value = tVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(g.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != g.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(hashMap, new b(i10, method), value, cls);
                z10 = true;
            }
        }
        C0015a c0015a = new C0015a(hashMap);
        this.f1655a.put(cls, c0015a);
        this.f1656b.put(cls, Boolean.valueOf(z10));
        return c0015a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Class<?>, androidx.lifecycle.a$a>, java.util.HashMap] */
    public final C0015a b(Class<?> cls) {
        C0015a c0015a = (C0015a) this.f1655a.get(cls);
        return c0015a != null ? c0015a : a(cls, null);
    }

    public final void c(Map<b, g.b> map, b bVar, g.b bVar2, Class<?> cls) {
        g.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 != null) {
                return;
            }
            map.put(bVar, bVar2);
            return;
        }
        Method method = bVar.f1660b;
        StringBuilder c10 = androidx.activity.result.a.c("Method ");
        c10.append(method.getName());
        c10.append(" in ");
        c10.append(cls.getName());
        c10.append(" already declared with different @OnLifecycleEvent value: previous value ");
        c10.append(bVar3);
        c10.append(", new value ");
        c10.append(bVar2);
        throw new IllegalArgumentException(c10.toString());
    }
}

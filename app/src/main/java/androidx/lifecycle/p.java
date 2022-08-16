package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public static Map<Class<?>, Integer> f1712a = new HashMap();

    /* renamed from: b */
    public static Map<Class<?>, List<Constructor<? extends d>>> f1713b = new HashMap();

    public static d a(Constructor<? extends d> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.d>>>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.d>>>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.d>>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.d>>>, java.util.HashMap] */
    public static int c(Class<?> cls) {
        Constructor<?> constructor;
        HashMap hashMap;
        boolean z10;
        Integer num = (Integer) f1712a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            List list = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r42 != null ? r42.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String b10 = b(canonicalName);
                if (!name.isEmpty()) {
                    b10 = name + "." + b10;
                }
                constructor = Class.forName(b10).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            if (constructor != null) {
                ?? r02 = f1713b;
                list = Collections.singletonList(constructor);
                hashMap = r02;
            } else {
                a aVar = a.f1654c;
                Boolean bool = (Boolean) aVar.f1656b.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                aVar.f1656b.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            } else if (((t) declaredMethods[i11].getAnnotation(t.class)) != null) {
                                aVar.a(cls, declaredMethods);
                                z10 = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z10) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && k.class.isAssignableFrom(superclass)) {
                        if (c(superclass) != 1) {
                            list = new ArrayList((Collection) f1713b.get(superclass));
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            Class<?> cls2 = interfaces[i12];
                            if (cls2 != null && k.class.isAssignableFrom(cls2)) {
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                list.addAll((Collection) f1713b.get(cls2));
                            }
                            i12++;
                        } else if (list != null) {
                            hashMap = f1713b;
                        }
                    }
                }
            }
            hashMap.put(cls, list);
            i10 = 2;
        }
        f1712a.put(cls, Integer.valueOf(i10));
        return i10;
    }
}

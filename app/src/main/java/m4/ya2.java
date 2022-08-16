package m4;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class ya2 {

    /* renamed from: c */
    public static final ya2 f15637c = new ya2();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, eb2<?>> f15639b = new ConcurrentHashMap();

    /* renamed from: a */
    public final ja2 f15638a = new ja2();

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.Class<?>, m4.eb2<?>>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.Class<?>, m4.eb2<?>>] */
    public final <T> eb2<T> a(Class<T> cls) {
        ma2 ma2Var;
        a92<?> a92Var;
        pb2<?, ?> pb2Var;
        ea2 ea2Var;
        va2 va2Var;
        pb2<?, ?> pb2Var2;
        da2 da2Var;
        va2 va2Var2;
        pb2<?, ?> pb2Var3;
        ea2 ea2Var2;
        va2 va2Var3;
        ua2 ua2Var;
        Class<?> cls2;
        Charset charset = v92.f14624a;
        Objects.requireNonNull(cls, "messageType");
        eb2<T> eb2Var = (eb2) this.f15639b.get(cls);
        if (eb2Var == null) {
            ja2 ja2Var = this.f15638a;
            Objects.requireNonNull(ja2Var);
            Class<?> cls3 = fb2.f8390a;
            if (!m92.class.isAssignableFrom(cls) && (cls2 = fb2.f8390a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            oa2 a10 = ja2Var.f9890a.a(cls);
            if (a10.a()) {
                if (m92.class.isAssignableFrom(cls)) {
                    pb2<?, ?> pb2Var4 = fb2.f8393d;
                    a92<?> a92Var2 = c92.f6745a;
                    ua2Var = new ua2(pb2Var4, c92.f6745a, a10.zza());
                } else {
                    pb2<?, ?> pb2Var5 = fb2.f8391b;
                    a92<?> a92Var3 = c92.f6746b;
                    if (a92Var3 != null) {
                        ua2Var = new ua2(pb2Var5, a92Var3, a10.zza());
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                eb2Var = ua2Var;
            } else {
                boolean z10 = false;
                a92<?> a92Var4 = null;
                if (m92.class.isAssignableFrom(cls)) {
                    if (a10.c() == 1) {
                        z10 = true;
                    }
                    if (z10) {
                        va2Var3 = wa2.f14902b;
                        ea2Var2 = fa2.f8385b;
                        pb2Var3 = fb2.f8393d;
                        a92<?> a92Var5 = c92.f6745a;
                        a92Var4 = c92.f6745a;
                    } else {
                        va2Var3 = wa2.f14902b;
                        ea2Var2 = fa2.f8385b;
                        pb2Var3 = fb2.f8393d;
                    }
                    ma2Var = na2.f11618b;
                    a92Var = a92Var4;
                    ea2Var = ea2Var2;
                    pb2Var = pb2Var3;
                    va2Var = va2Var3;
                } else {
                    if (a10.c() == 1) {
                        z10 = true;
                    }
                    if (z10) {
                        va2Var2 = wa2.f14901a;
                        da2Var = fa2.f8384a;
                        pb2Var2 = fb2.f8391b;
                        a92Var4 = c92.f6746b;
                        if (a92Var4 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        va2Var2 = wa2.f14901a;
                        da2Var = fa2.f8384a;
                        pb2Var2 = fb2.f8392c;
                    }
                    ma2Var = na2.f11617a;
                    a92Var = a92Var4;
                    va2Var = va2Var2;
                    pb2Var = pb2Var2;
                    ea2Var = da2Var;
                }
                eb2Var = ta2.G(a10, va2Var, ea2Var, pb2Var, a92Var, ma2Var);
            }
            eb2<T> eb2Var2 = (eb2) this.f15639b.putIfAbsent(cls, eb2Var);
            if (eb2Var2 != null) {
                return eb2Var2;
            }
        }
        return eb2Var;
    }
}

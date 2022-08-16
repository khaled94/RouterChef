package s4;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class l8 {

    /* renamed from: c */
    public static final l8 f17974c = new l8();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, o8<?>> f17976b = new ConcurrentHashMap();

    /* renamed from: a */
    public final v7 f17975a = new v7();

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.ConcurrentMap<java.lang.Class<?>, s4.o8<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.ConcurrentMap<java.lang.Class<?>, s4.o8<?>>, java.util.concurrent.ConcurrentHashMap] */
    public final <T> o8<T> a(Class<T> cls) {
        z7 z7Var;
        p6<?> p6Var;
        z8<?, ?> z8Var;
        q7 q7Var;
        i8 i8Var;
        z8<?, ?> z8Var2;
        p7 p7Var;
        i8 i8Var2;
        z8<?, ?> z8Var3;
        q7 q7Var2;
        i8 i8Var3;
        h8 h8Var;
        Class<?> cls2;
        Charset charset = i7.f17920a;
        Objects.requireNonNull(cls, "messageType");
        o8<T> o8Var = (o8) this.f17976b.get(cls);
        if (o8Var == null) {
            v7 v7Var = this.f17975a;
            Objects.requireNonNull(v7Var);
            Class<?> cls3 = p8.f18060a;
            if (!b7.class.isAssignableFrom(cls) && (cls2 = p8.f18060a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            b8 a10 = v7Var.f18153a.a(cls);
            if (a10.a()) {
                if (b7.class.isAssignableFrom(cls)) {
                    z8<?, ?> z8Var4 = p8.f18063d;
                    p6<?> p6Var2 = r6.f18083a;
                    h8Var = new h8(z8Var4, r6.f18083a, a10.zza());
                } else {
                    z8<?, ?> z8Var5 = p8.f18061b;
                    p6<?> p6Var3 = r6.f18084b;
                    if (p6Var3 != null) {
                        h8Var = new h8(z8Var5, p6Var3, a10.zza());
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                o8Var = h8Var;
            } else {
                boolean z10 = false;
                p6<?> p6Var4 = null;
                if (b7.class.isAssignableFrom(cls)) {
                    if (a10.c() == 1) {
                        z10 = true;
                    }
                    if (z10) {
                        i8Var3 = j8.f17938b;
                        q7Var2 = r7.f18086b;
                        z8Var3 = p8.f18063d;
                        p6<?> p6Var5 = r6.f18083a;
                        p6Var4 = r6.f18083a;
                    } else {
                        i8Var3 = j8.f17938b;
                        q7Var2 = r7.f18086b;
                        z8Var3 = p8.f18063d;
                    }
                    z7Var = a8.f17719b;
                    p6Var = p6Var4;
                    q7Var = q7Var2;
                    z8Var = z8Var3;
                    i8Var = i8Var3;
                } else {
                    if (a10.c() == 1) {
                        z10 = true;
                    }
                    if (z10) {
                        i8Var2 = j8.f17937a;
                        p7Var = r7.f18085a;
                        z8Var2 = p8.f18061b;
                        p6Var4 = r6.f18084b;
                        if (p6Var4 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        i8Var2 = j8.f17937a;
                        p7Var = r7.f18085a;
                        z8Var2 = p8.f18062c;
                    }
                    z7Var = a8.f17718a;
                    p6Var = p6Var4;
                    i8Var = i8Var2;
                    z8Var = z8Var2;
                    q7Var = p7Var;
                }
                o8Var = g8.B(a10, i8Var, q7Var, z8Var, p6Var, z7Var);
            }
            o8<T> o8Var2 = (o8) this.f17976b.putIfAbsent(cls, o8Var);
            if (o8Var2 != null) {
                return o8Var2;
            }
        }
        return o8Var;
    }
}

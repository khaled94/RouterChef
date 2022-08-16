package n6;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import l7.a;
import l7.b;
import l7.c;
import l7.d;

/* loaded from: classes.dex */
public final class r implements d, c {

    /* renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> f16655a = new HashMap();

    /* renamed from: b */
    public Queue<a<?>> f16656b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f16657c;

    public r(Executor executor) {
        this.f16657c = executor;
    }

    @Override // l7.d
    public final void a(b bVar) {
        b(this.f16657c, bVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<l7.b<java.lang.Object>, java.util.concurrent.Executor>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<l7.b<java.lang.Object>, java.util.concurrent.Executor>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<l7.b<java.lang.Object>, java.util.concurrent.Executor>>, java.util.HashMap] */
    @Override // l7.d
    public final synchronized void b(Executor executor, b bVar) {
        Objects.requireNonNull(executor);
        if (!this.f16655a.containsKey(h6.a.class)) {
            this.f16655a.put(h6.a.class, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f16655a.get(h6.a.class)).put(bVar, executor);
    }
}

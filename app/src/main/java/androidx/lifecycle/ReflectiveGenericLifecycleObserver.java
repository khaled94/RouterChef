package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.g;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements j {

    /* renamed from: a */
    public final Object f1649a;

    /* renamed from: b */
    public final a.C0015a f1650b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1649a = obj;
        this.f1650b = a.f1654c.b(obj.getClass());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<androidx.lifecycle.g$b, java.util.List<androidx.lifecycle.a$b>>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<androidx.lifecycle.g$b, java.util.List<androidx.lifecycle.a$b>>, java.util.HashMap] */
    @Override // androidx.lifecycle.j
    public final void a(l lVar, g.b bVar) {
        a.C0015a c0015a = this.f1650b;
        Object obj = this.f1649a;
        a.C0015a.a((List) c0015a.f1657a.get(bVar), lVar, bVar, obj);
        a.C0015a.a((List) c0015a.f1657a.get(g.b.ON_ANY), lVar, bVar, obj);
    }
}

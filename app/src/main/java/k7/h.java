package k7;

import h7.b;
import h7.d;
import h7.f;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public final Map<Class<?>, d<?>> f5624a;

    /* renamed from: b */
    public final Map<Class<?>, f<?>> f5625b;

    /* renamed from: c */
    public final d<Object> f5626c;

    /* loaded from: classes.dex */
    public static final class a implements i7.a<a> {

        /* renamed from: a */
        public final Map<Class<?>, d<?>> f5627a = new HashMap();

        /* renamed from: b */
        public final Map<Class<?>, f<?>> f5628b = new HashMap();

        /* renamed from: c */
        public d<Object> f5629c = g.f5623a;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Class<?>, h7.d<?>>, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.Class<?>, h7.f<?>>, java.util.HashMap] */
        @Override // i7.a
        public final a a(Class cls, d dVar) {
            this.f5627a.put(cls, dVar);
            this.f5628b.remove(cls);
            return this;
        }

        public final h b() {
            return new h(new HashMap(this.f5627a), new HashMap(this.f5628b), this.f5629c);
        }
    }

    public h(Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar) {
        this.f5624a = map;
        this.f5625b = map2;
        this.f5626c = dVar;
    }

    public final void a(Object obj, OutputStream outputStream) {
        Map<Class<?>, d<?>> map = this.f5624a;
        f fVar = new f(outputStream, map, this.f5625b, this.f5626c);
        if (obj == null) {
            return;
        }
        d<?> dVar = map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
            return;
        }
        StringBuilder c10 = androidx.activity.result.a.c("No encoder for ");
        c10.append(obj.getClass());
        throw new b(c10.toString());
    }
}

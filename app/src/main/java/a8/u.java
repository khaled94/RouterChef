package a8;

import e8.c;
import x7.h;
import x7.s;
import x7.w;
import x7.x;

/* loaded from: classes.dex */
public final class u implements x {

    /* renamed from: s */
    public final /* synthetic */ Class f379s;

    /* renamed from: t */
    public final /* synthetic */ w f380t;

    /* loaded from: classes.dex */
    public class a extends w<Object> {

        /* renamed from: a */
        public final /* synthetic */ Class f381a;

        public a(Class cls) {
            u.this = r1;
            this.f381a = cls;
        }

        @Override // x7.w
        public final Object a(e8.a aVar) {
            Object a10 = u.this.f380t.a(aVar);
            if (a10 == null || this.f381a.isInstance(a10)) {
                return a10;
            }
            StringBuilder c10 = androidx.activity.result.a.c("Expected a ");
            c10.append(this.f381a.getName());
            c10.append(" but was ");
            c10.append(a10.getClass().getName());
            c10.append("; at path ");
            c10.append(aVar.Z());
            throw new s(c10.toString());
        }

        @Override // x7.w
        public final void b(c cVar, Object obj) {
            u.this.f380t.b(cVar, obj);
        }
    }

    public u(Class cls, w wVar) {
        this.f379s = cls;
        this.f380t = wVar;
    }

    @Override // x7.x
    public final <T2> w<T2> a(h hVar, d8.a<T2> aVar) {
        Class<? super T2> cls = aVar.f3994a;
        if (!this.f379s.isAssignableFrom(cls)) {
            return null;
        }
        return new a(cls);
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Factory[typeHierarchy=");
        c10.append(this.f379s.getName());
        c10.append(",adapter=");
        c10.append(this.f380t);
        c10.append("]");
        return c10.toString();
    }
}

package a8;

import d8.a;
import x7.h;
import x7.w;
import x7.x;

/* loaded from: classes.dex */
public final class t implements x {

    /* renamed from: s */
    public final /* synthetic */ Class f376s;

    /* renamed from: t */
    public final /* synthetic */ Class f377t;

    /* renamed from: u */
    public final /* synthetic */ w f378u;

    public t(Class cls, Class cls2, w wVar) {
        this.f376s = cls;
        this.f377t = cls2;
        this.f378u = wVar;
    }

    @Override // x7.x
    public final <T> w<T> a(h hVar, a<T> aVar) {
        Class<? super T> cls = aVar.f3994a;
        if (cls == this.f376s || cls == this.f377t) {
            return this.f378u;
        }
        return null;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Factory[type=");
        c10.append(this.f376s.getName());
        c10.append("+");
        c10.append(this.f377t.getName());
        c10.append(",adapter=");
        c10.append(this.f378u);
        c10.append("]");
        return c10.toString();
    }
}

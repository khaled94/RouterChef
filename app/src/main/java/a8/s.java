package a8;

import d8.a;
import x7.h;
import x7.w;
import x7.x;

/* loaded from: classes.dex */
public final class s implements x {

    /* renamed from: s */
    public final /* synthetic */ Class f373s;

    /* renamed from: t */
    public final /* synthetic */ Class f374t;

    /* renamed from: u */
    public final /* synthetic */ w f375u;

    public s(Class cls, Class cls2, w wVar) {
        this.f373s = cls;
        this.f374t = cls2;
        this.f375u = wVar;
    }

    @Override // x7.x
    public final <T> w<T> a(h hVar, a<T> aVar) {
        Class<? super T> cls = aVar.f3994a;
        if (cls == this.f373s || cls == this.f374t) {
            return this.f375u;
        }
        return null;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Factory[type=");
        c10.append(this.f374t.getName());
        c10.append("+");
        c10.append(this.f373s.getName());
        c10.append(",adapter=");
        c10.append(this.f375u);
        c10.append("]");
        return c10.toString();
    }
}

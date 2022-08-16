package a8;

import d8.a;
import x7.h;
import x7.w;
import x7.x;

/* loaded from: classes.dex */
public final class r implements x {

    /* renamed from: s */
    public final /* synthetic */ Class f371s;

    /* renamed from: t */
    public final /* synthetic */ w f372t;

    public r(Class cls, w wVar) {
        this.f371s = cls;
        this.f372t = wVar;
    }

    @Override // x7.x
    public final <T> w<T> a(h hVar, a<T> aVar) {
        if (aVar.f3994a == this.f371s) {
            return this.f372t;
        }
        return null;
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Factory[type=");
        c10.append(this.f371s.getName());
        c10.append(",adapter=");
        c10.append(this.f372t);
        c10.append("]");
        return c10.toString();
    }
}

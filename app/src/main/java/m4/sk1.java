package m4;

import javax.annotation.concurrent.GuardedBy;
import m4.fo0;

/* loaded from: classes.dex */
public final class sk1<RequestComponentT extends fo0<AdT>, AdT> implements dl1<RequestComponentT, AdT> {
    @GuardedBy("this")

    /* renamed from: a */
    public RequestComponentT f13721a;

    @Override // m4.dl1
    public final /* bridge */ /* synthetic */ tz1 a(el1 el1Var, cl1 cl1Var) {
        return b(el1Var, cl1Var, null);
    }

    public final synchronized tz1<AdT> b(el1 el1Var, cl1<RequestComponentT> cl1Var, RequestComponentT requestcomponentt) {
        wm0<AdT> a10;
        if (requestcomponentt != null) {
            this.f13721a = requestcomponentt;
        } else {
            this.f13721a = cl1Var.b(el1Var.f8002b).f();
        }
        a10 = this.f13721a.a();
        return a10.b(a10.c());
    }

    @Override // m4.dl1
    public final Object g() {
        RequestComponentT requestcomponentt;
        synchronized (this) {
            requestcomponentt = this.f13721a;
        }
        return requestcomponentt;
    }
}

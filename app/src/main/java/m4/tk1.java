package m4;

import javax.annotation.concurrent.GuardedBy;
import m4.fo0;

/* loaded from: classes.dex */
public final class tk1<RequestComponentT extends fo0<AdT>, AdT> implements dl1<RequestComponentT, AdT> {

    /* renamed from: a */
    public final dl1<RequestComponentT, AdT> f14084a;
    @GuardedBy("this")

    /* renamed from: b */
    public RequestComponentT f14085b;

    public tk1(dl1<RequestComponentT, AdT> dl1Var) {
        this.f14084a = dl1Var;
    }

    @Override // m4.dl1
    public final /* bridge */ /* synthetic */ tz1 a(el1 el1Var, cl1 cl1Var) {
        return b(el1Var, cl1Var, null);
    }

    public final synchronized tz1<AdT> b(el1 el1Var, cl1<RequestComponentT> cl1Var, RequestComponentT requestcomponentt) {
        this.f14085b = requestcomponentt;
        if (el1Var.f8001a == null) {
            return ((sk1) this.f14084a).b(el1Var, cl1Var, requestcomponentt);
        }
        wm0<AdT> a10 = requestcomponentt.a();
        return a10.b(a10.d(mz1.m(el1Var.f8001a)));
    }

    @Override // m4.dl1
    public final Object g() {
        RequestComponentT requestcomponentt;
        synchronized (this) {
            requestcomponentt = this.f14085b;
        }
        return requestcomponentt;
    }
}

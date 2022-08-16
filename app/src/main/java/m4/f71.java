package m4;

/* loaded from: classes.dex */
public final class f71<DelegateT, AdapterT> implements e71<AdapterT> {

    /* renamed from: a */
    public final e71<DelegateT> f8364a;

    /* renamed from: b */
    public final cu1<DelegateT, AdapterT> f8365b;

    public f71(e71<DelegateT> e71Var, cu1<DelegateT, AdapterT> cu1Var) {
        this.f8364a = e71Var;
        this.f8365b = cu1Var;
    }

    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        return this.f8364a.a(km1Var, cm1Var);
    }

    @Override // m4.e71
    public final tz1<AdapterT> b(km1 km1Var, cm1 cm1Var) {
        return mz1.o(this.f8364a.b(km1Var, cm1Var), this.f8365b, u90.f14294a);
    }
}

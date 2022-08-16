package m4;

/* loaded from: classes.dex */
public final class e02 extends rz1<tz1> {

    /* renamed from: u */
    public final wy1 f7684u;

    /* renamed from: v */
    public final /* synthetic */ g02 f7685v;

    public e02(g02 g02Var, wy1 wy1Var) {
        this.f7685v = g02Var;
        this.f7684u = wy1Var;
    }

    @Override // m4.rz1
    public final /* bridge */ /* synthetic */ tz1 a() {
        tz1 zza = this.f7684u.zza();
        hu1.d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f7684u);
        return zza;
    }

    @Override // m4.rz1
    public final String b() {
        return this.f7684u.toString();
    }

    @Override // m4.rz1
    public final void d(Throwable th) {
        this.f7685v.m(th);
    }

    @Override // m4.rz1
    public final /* synthetic */ void e(tz1 tz1Var) {
        this.f7685v.n(tz1Var);
    }

    @Override // m4.rz1
    public final boolean f() {
        return this.f7685v.isDone();
    }
}

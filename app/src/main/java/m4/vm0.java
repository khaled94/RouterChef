package m4;

/* loaded from: classes.dex */
public final class vm0 implements kz1, nq0, vj {

    /* renamed from: s */
    public final /* synthetic */ int f14728s;

    /* renamed from: t */
    public final /* synthetic */ Object f14729t;

    public /* synthetic */ vm0(Object obj, int i10) {
        this.f14728s = i10;
        this.f14729t = obj;
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f14728s) {
            case 0:
                Void r22 = (Void) obj;
                ((wm0) this.f14729t).f15056f.r(true);
                return;
            default:
                Boolean bool = (Boolean) obj;
                ((xn0) this.f14729t).f15414s.zza();
                return;
        }
    }

    @Override // m4.vj
    public final void c(cl clVar) {
        clVar.p((kk) this.f14729t);
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        switch (this.f14728s) {
            case 0:
                ((wm0) this.f14729t).f15056f.r(false);
                return;
            default:
                return;
        }
    }

    @Override // m4.nq0
    /* renamed from: h */
    public final void mo21h(Object obj) {
        ((sl1) obj).d0((cn) this.f14729t);
    }
}

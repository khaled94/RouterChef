package m4;

import c4.s;

/* loaded from: classes.dex */
public final /* synthetic */ class zb0 implements ag, kz1, ar0 {

    /* renamed from: s */
    public final /* synthetic */ Object f16080s;

    /* renamed from: t */
    public final /* synthetic */ Object f16081t;

    public /* synthetic */ zb0(Object obj, Object obj2) {
        this.f16080s = obj;
        this.f16081t = obj2;
    }

    public /* synthetic */ zb0(km0 km0Var, kz1 kz1Var) {
        this.f16081t = km0Var;
        this.f16080s = kz1Var;
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        u90.f14298e.execute(new s((km0) this.f16081t, 3));
        ((kz1) this.f16080s).a((am0) obj);
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        u90.f14298e.execute(new s((km0) this.f16081t, 3));
        ((kz1) this.f16080s).f(th);
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        mo1 mo1Var = (mo1) this.f16080s;
        E e10 = mo1Var.f11264s;
        wo1 wo1Var = (wo1) e10;
        ((ap1) obj).h(wo1Var, mo1Var.f11265t, (Throwable) this.f16081t);
    }

    @Override // m4.ag
    /* renamed from: zza */
    public final bg mo26zza() {
        byte[] bArr = (byte[]) this.f16081t;
        int i10 = dc0.O;
        return new ec0(new zf(bArr), bArr.length, ((ag) this.f16080s).mo26zza());
    }
}

package m4;

import l3.b;

/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements cu1 {

    /* renamed from: a */
    public final /* synthetic */ int f11376a;

    /* renamed from: b */
    public final /* synthetic */ Object f11377b;

    public /* synthetic */ n0(Object obj, int i10) {
        this.f11376a = i10;
        this.f11377b = obj;
    }

    @Override // m4.cu1
    public final Object a(Object obj) {
        switch (this.f11376a) {
            case 0:
                return (w0) obj;
            default:
                ty0 ty0Var = (ty0) this.f11377b;
                vd0 vd0Var = (vd0) obj;
                vd0Var.D0("/result", ty0Var.f14202i);
                af0 q02 = vd0Var.q0();
                oy0 oy0Var = ty0Var.f14194a;
                ((ce0) q02).c(null, oy0Var, oy0Var, oy0Var, oy0Var, false, null, new b(ty0Var.f14196c, null), null, null, ty0Var.f14203j, ty0Var.f14204k, ty0Var.f14197d, ty0Var.f14198e, null, null);
                return vd0Var;
        }
    }
}

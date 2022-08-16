package m4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jt0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f10185a = 0;

    /* renamed from: b */
    public final vd2 f10186b;

    /* renamed from: c */
    public final Object f10187c;

    public jt0(ct0 ct0Var, vd2 vd2Var) {
        this.f10187c = ct0Var;
        this.f10186b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f10185a) {
            case 0:
                final vd0 vd0Var = ((ct0) this.f10187c).f7142b;
                return new es0(new rq0() { // from class: m4.at0
                    @Override // m4.rq0
                    public final void zza() {
                        vd0 vd0Var2 = vd0.this;
                        if (vd0Var2.V() != null) {
                            vd0Var2.V().a();
                        }
                    }
                }, (Executor) this.f10186b.a());
            default:
                return new z21(((lf0) this.f10186b).b(), ((vf0) ((vd2) this.f10187c)).b());
        }
    }

    public jt0(vd2 vd2Var, vd2 vd2Var2) {
        this.f10186b = vd2Var;
        this.f10187c = vd2Var2;
    }
}

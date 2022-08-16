package m4;

import android.content.Context;
import h4.a;

/* loaded from: classes.dex */
public final class c80 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f6738a;

    /* renamed from: b */
    public final vd2 f6739b;

    /* renamed from: c */
    public final Object f6740c;

    public c80(qk0 qk0Var, vd2 vd2Var) {
        this.f6738a = 3;
        this.f6740c = qk0Var;
        this.f6739b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f6738a) {
            case 0:
                return new b80((Context) this.f6739b.a(), ((m70) ((vd2) this.f6740c)).a());
            case 1:
                return new bn0((a) this.f6739b.a(), (u80) ((vd2) this.f6740c).a());
            case 2:
                return new h61(((p61) this.f6739b).a(), ((dn1) ((vd2) this.f6740c)).a());
            default:
                final cq0 cq0Var = (cq0) ((vl0) this.f6739b).f14724a.f14445t;
                return new es0(new rq0() { // from class: m4.pk0
                    @Override // m4.rq0
                    public final void zza() {
                        cq0 cq0Var2 = cq0.this;
                        synchronized (cq0Var2) {
                            cq0Var2.f7110x = false;
                            cq0Var2.P0(0L);
                        }
                    }
                }, u90.f14299f);
        }
    }

    public /* synthetic */ c80(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f6738a = i10;
        this.f6739b = vd2Var;
        this.f6740c = vd2Var2;
    }
}

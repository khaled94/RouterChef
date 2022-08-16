package m4;

import n3.g1;

/* loaded from: classes.dex */
public final class zz implements y90, ar0, v91 {

    /* renamed from: s */
    public final /* synthetic */ int f16353s;

    /* renamed from: t */
    public final /* synthetic */ Object f16354t;

    /* renamed from: u */
    public final /* synthetic */ Object f16355u;

    public /* synthetic */ zz(Object obj, Object obj2, int i10) {
        this.f16353s = i10;
        this.f16354t = obj;
        this.f16355u = obj2;
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        switch (this.f16353s) {
            case 1:
                ((ga) obj).c((String) this.f16354t, (String) this.f16355u);
                return;
            default:
                gg2 gg2Var = (gg2) obj;
                return;
        }
    }

    @Override // m4.y90
    /* renamed from: zza */
    public final void mo20zza() {
        synchronized (((e00) this.f16355u).f7676a) {
            ((e00) this.f16355u).f7682g = 1;
            g1.a("Failed loading new engine. Marking new engine destroyable.");
            ((d00) this.f16354t).i();
        }
    }

    public zz(e00 e00Var, d00 d00Var) {
        this.f16353s = 0;
        this.f16355u = e00Var;
        this.f16354t = d00Var;
    }
}

package m4;

import android.content.Context;

/* loaded from: classes.dex */
public final class vt0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f14778a;

    /* renamed from: b */
    public final vd2 f14779b;

    /* renamed from: c */
    public final vd2 f14780c;

    /* renamed from: d */
    public final vd2 f14781d;

    /* renamed from: e */
    public final vd2 f14782e;

    /* renamed from: f */
    public final vd2 f14783f;

    public /* synthetic */ vt0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, vd2 vd2Var5, int i10) {
        this.f14778a = i10;
        this.f14779b = vd2Var;
        this.f14780c = vd2Var2;
        this.f14781d = vd2Var3;
        this.f14782e = vd2Var4;
        this.f14783f = vd2Var5;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f14778a) {
            case 0:
                o70 a10 = ((ht0) this.f14779b).a();
                Context b10 = ((en1) this.f14780c).b();
                x70 x70Var = (x70) this.f14781d.a();
                vd0 vd0Var = ((et0) this.f14782e).f8260a.f7142b;
                return new ut0(a10, b10, x70Var, vd0Var == null ? null : vd0Var.E(), (zj) this.f14783f.a());
            default:
                return new zj1((if0) this.f14779b.a(), (Context) this.f14780c.a(), (String) this.f14781d.a(), (wj1) this.f14782e.a(), (vj1) this.f14783f.a());
        }
    }
}

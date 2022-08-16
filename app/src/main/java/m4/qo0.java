package m4;

import android.content.Context;

/* loaded from: classes.dex */
public final class qo0 implements nd2<g70> {

    /* renamed from: a */
    public final vd2<Context> f12939a;

    /* renamed from: b */
    public final vd2<o90> f12940b;

    /* renamed from: c */
    public final vd2<cm1> f12941c;

    /* renamed from: d */
    public final vd2<hu1> f12942d;

    public qo0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4) {
        this.f12939a = vd2Var;
        this.f12940b = vd2Var2;
        this.f12941c = vd2Var3;
        this.f12942d = vd2Var4;
    }

    @Override // m4.vd2
    public final /* synthetic */ Object a() {
        Context a10 = this.f12939a.a();
        o90 b10 = ((vf0) this.f12940b).b();
        cm1 b11 = ((mm0) this.f12941c).b();
        e70 e70Var = b11.B;
        if (e70Var != null) {
            return new d70(a10, b10, e70Var, b11.f7061t.f8967b);
        }
        return null;
    }
}

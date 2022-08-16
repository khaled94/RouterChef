package m4;

import android.content.Context;

/* loaded from: classes.dex */
public final class m01 implements nd2<wj> {

    /* renamed from: a */
    public final vd2<Context> f11063a;

    /* renamed from: b */
    public final vd2<String> f11064b;

    /* renamed from: c */
    public final vd2<o90> f11065c;

    /* renamed from: d */
    public final vd2<zj> f11066d;

    /* renamed from: e */
    public final vd2<String> f11067e;

    public m01(vd2<Context> vd2Var, vd2<String> vd2Var2, vd2<o90> vd2Var3, vd2<zj> vd2Var4, vd2<String> vd2Var5) {
        this.f11063a = vd2Var;
        this.f11064b = vd2Var2;
        this.f11065c = vd2Var3;
        this.f11066d = vd2Var4;
        this.f11067e = vd2Var5;
    }

    @Override // m4.vd2
    public final Object a() {
        Context b10 = ((lf0) this.f11063a).b();
        final String a10 = ((p31) this.f11064b).a();
        o90 b11 = ((vf0) this.f11065c).b();
        final zj a11 = this.f11066d.a();
        final String a12 = this.f11067e.a();
        wj wjVar = new wj(new xj(b10));
        hm v10 = im.v();
        int i10 = b11.f12052t;
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        im.x((im) v10.f9883t, i10);
        int i11 = b11.f12053u;
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        im.y((im) v10.f9883t, i11);
        int i12 = true != b11.f12054v ? 2 : 0;
        if (v10.f9884u) {
            v10.m();
            v10.f9884u = false;
        }
        im.z((im) v10.f9883t, i12);
        final im k10 = v10.k();
        wjVar.a(new vj() { // from class: m4.l01
            @Override // m4.vj
            public final void c(cl clVar) {
                zj zjVar = zj.this;
                String str = a10;
                im imVar = k10;
                String str2 = a12;
                ak r10 = clVar.n().r();
                if (r10.f9884u) {
                    r10.m();
                    r10.f9884u = false;
                }
                bk.y((bk) r10.f9883t, zjVar);
                clVar.o(r10);
                wk r11 = ((dl) clVar.f9883t).w().r();
                if (r11.f9884u) {
                    r11.m();
                    r11.f9884u = false;
                }
                xk.x((xk) r11.f9883t, str);
                if (r11.f9884u) {
                    r11.m();
                    r11.f9884u = false;
                }
                xk.y((xk) r11.f9883t, imVar);
                clVar.q(r11);
                if (clVar.f9884u) {
                    clVar.m();
                    clVar.f9884u = false;
                }
                dl.A((dl) clVar.f9883t, str2);
            }
        });
        return wjVar;
    }
}

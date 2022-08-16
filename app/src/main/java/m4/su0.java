package m4;

import d.a;

/* loaded from: classes.dex */
public final class su0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f13825a;

    /* renamed from: b */
    public final vd2 f13826b;

    /* renamed from: c */
    public final Object f13827c;

    public /* synthetic */ su0(Object obj, vd2 vd2Var, int i10) {
        this.f13825a = i10;
        this.f13827c = obj;
        this.f13826b = vd2Var;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f13825a) {
            case 0:
                return new es0((mw0) this.f13826b.a(), u90.f14299f);
            case 1:
                nw0 nw0Var = (nw0) this.f13826b.a();
                a.d(nw0Var);
                return nw0Var;
            default:
                return new d11((j11) this.f13826b.a(), ((fn1) ((vd2) this.f13827c)).a());
        }
    }

    public su0(vd2 vd2Var, vd2 vd2Var2) {
        this.f13825a = 2;
        this.f13826b = vd2Var;
        this.f13827c = vd2Var2;
    }
}

package m4;

import d.a;

/* loaded from: classes.dex */
public final class b11 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f6325a;

    /* renamed from: b */
    public final vd2 f6326b;

    /* renamed from: c */
    public final vd2 f6327c;

    public /* synthetic */ b11(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f6325a = i10;
        this.f6326b = vd2Var;
        this.f6327c = vd2Var2;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f6325a) {
            case 0:
                a11 a11Var = (a11) this.f6326b.a();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return ((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue() ? new es0((s51) this.f6327c.a(), t90Var) : new es0(a11Var, t90Var);
            default:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new ug1((x70) this.f6326b.a(), t90Var2, ((en1) this.f6327c).b());
        }
    }
}

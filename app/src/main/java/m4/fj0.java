package m4;

import m2.a;

/* loaded from: classes.dex */
public final class fj0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f8575a;

    /* renamed from: b */
    public final vd2 f8576b;

    /* renamed from: c */
    public final vd2 f8577c;

    /* renamed from: d */
    public final vd2 f8578d;

    public /* synthetic */ fj0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, int i10) {
        this.f8575a = i10;
        this.f8576b = vd2Var;
        this.f8577c = vd2Var2;
        this.f8578d = vd2Var3;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f8575a) {
            case 0:
                uz1 t10 = a.t();
                d.a.d(t10);
                return new yi0(((nh) this.f8576b.a()).f11773c, (r00) this.f8577c.a(), t10);
            case 1:
                return new iy0(((nm0) this.f8576b).f11838a.f10938c, (av0) this.f8577c.a(), ((ov0) this.f8578d).b());
            case 2:
                a11 a11Var = (a11) this.f8576b.a();
                t90 t90Var = u90.f14294a;
                d.a.d(t90Var);
                return ((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue() ? new es0((s51) this.f8578d.a(), t90Var) : new es0(a11Var, t90Var);
            case 3:
                return new z91((if0) this.f8576b.a(), ((no0) this.f8577c).b(), ((lr0) this.f8578d).f10970a);
            default:
                t90 t90Var2 = u90.f14294a;
                d.a.d(t90Var2);
                return new wg1(t90Var2, ((en1) this.f8577c).b(), ((vf0) this.f8578d).b());
        }
    }
}

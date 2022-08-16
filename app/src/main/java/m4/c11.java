package m4;

import d.a;

/* loaded from: classes.dex */
public final class c11 implements nd2<es0<vo0>> {

    /* renamed from: a */
    public final vd2<a11> f6681a;

    /* renamed from: b */
    public final vd2<s51> f6682b;

    public c11(vd2 vd2Var, vd2 vd2Var2) {
        this.f6681a = vd2Var;
        this.f6682b = vd2Var2;
    }

    @Override // m4.vd2
    public final Object a() {
        a11 a10 = this.f6681a.a();
        t90 t90Var = u90.f14294a;
        a.d(t90Var);
        return ((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue() ? new es0(this.f6682b.a(), t90Var) : new es0(a10, t90Var);
    }
}

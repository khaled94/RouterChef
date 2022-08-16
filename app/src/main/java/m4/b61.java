package m4;

import d.a;

/* loaded from: classes.dex */
public final class b61 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f6398a;

    /* renamed from: b */
    public final vd2 f6399b;

    /* renamed from: c */
    public final vd2 f6400c;

    public /* synthetic */ b61(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f6398a = i10;
        this.f6399b = vd2Var;
        this.f6400c = vd2Var2;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f6398a) {
            case 0:
                k61 k61Var = new k61(((l61) this.f6399b).f10663a.a());
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0(k61Var, t90Var);
            default:
                return new cd1((h4.a) this.f6399b.a(), ((mo0) this.f6400c).b());
        }
    }
}

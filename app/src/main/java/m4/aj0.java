package m4;

import d.a;

/* loaded from: classes.dex */
public final class aj0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f6172a;

    /* renamed from: b */
    public final vd2 f6173b;

    /* renamed from: c */
    public final Object f6174c;

    public aj0(kf0 kf0Var, vd2 vd2Var) {
        this.f6172a = 3;
        this.f6174c = kf0Var;
        this.f6173b = vd2Var;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f6172a) {
            case 0:
                return new zi0(((en1) this.f6173b).b(), (nh) ((vd2) this.f6174c).a());
            case 1:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((ti0) this.f6173b.a(), t90Var);
            case 2:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new bf1(t90Var2, ((mo0) ((vd2) this.f6174c)).b());
            default:
                return new d91((h01) this.f6173b.a());
        }
    }

    public /* synthetic */ aj0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f6172a = i10;
        this.f6173b = vd2Var;
        this.f6174c = vd2Var2;
    }
}

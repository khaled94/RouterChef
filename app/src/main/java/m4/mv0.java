package m4;

import d.a;

/* loaded from: classes.dex */
public final class mv0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f11322a;

    /* renamed from: b */
    public final vd2 f11323b;

    /* renamed from: c */
    public final vd2 f11324c;

    public /* synthetic */ mv0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f11322a = i10;
        this.f11323b = vd2Var;
        this.f11324c = vd2Var2;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f11322a) {
            case 0:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((mc1) this.f11323b.a(), t90Var);
            case 1:
                return new r11((n11) this.f11323b.a(), (if0) this.f11324c.a());
            default:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new cp1(t90Var2, (n90) this.f11324c.a());
        }
    }
}

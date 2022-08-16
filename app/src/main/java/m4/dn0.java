package m4;

import d.a;

/* loaded from: classes.dex */
public final class dn0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f7557a;

    /* renamed from: b */
    public final vd2 f7558b;

    /* renamed from: c */
    public final vd2 f7559c;

    public /* synthetic */ dn0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f7557a = i10;
        this.f7558b = vd2Var;
        this.f7559c = vd2Var2;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f7557a) {
            case 0:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((ti0) this.f7558b.a(), t90Var);
            default:
                return new ms0(((mm0) this.f7558b).b(), (zp1) this.f7559c.a());
        }
    }
}

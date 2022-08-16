package m4;

import l3.i;

/* loaded from: classes.dex */
public final class of0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f12142a;

    /* renamed from: b */
    public final Object f12143b;

    public /* synthetic */ of0(Object obj, int i10) {
        this.f12142a = i10;
        this.f12143b = obj;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f12142a) {
            case 0:
                kf0 kf0Var = (kf0) this.f12143b;
                return new w7(new i(kf0Var.f10402b, kf0Var.f10401a));
            default:
                return new qq0(((td2) ((vd2) this.f12143b)).a());
        }
    }
}

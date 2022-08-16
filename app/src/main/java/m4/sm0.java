package m4;

import android.os.Bundle;
import d.a;

/* loaded from: classes.dex */
public final class sm0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f13745a;

    /* renamed from: b */
    public final vd2 f13746b;

    /* renamed from: c */
    public final vd2 f13747c;

    public /* synthetic */ sm0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f13745a = i10;
        this.f13746b = vd2Var;
        this.f13747c = vd2Var2;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f13745a) {
            case 0:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((zp0) this.f13746b.a(), t90Var);
            case 1:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new es0((p01) this.f13746b.a(), t90Var2);
            default:
                t90 t90Var3 = u90.f14294a;
                a.d(t90Var3);
                return new dg1(t90Var3, (Bundle) ((jo0) this.f13747c).f10149a.f9394c);
        }
    }
}

package m4;

import android.content.pm.PackageInfo;
import d.a;

/* loaded from: classes.dex */
public final class mt0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f11296a;

    /* renamed from: b */
    public final vd2 f11297b;

    /* renamed from: c */
    public final Object f11298c;

    public /* synthetic */ mt0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f11296a = i10;
        this.f11297b = vd2Var;
        this.f11298c = vd2Var2;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f11296a) {
            case 0:
                return new lt0((wp0) this.f11297b.a(), (cs0) ((vd2) this.f11298c).a());
            case 1:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((p01) this.f11297b.a(), t90Var);
            case 2:
                return new ag1(((l31) this.f11297b).a(), (PackageInfo) ((vd2) this.f11298c).a());
            default:
                return new es0((ao0) this.f11297b.a(), u90.f14299f);
        }
    }

    public mt0(wo2 wo2Var, vd2 vd2Var) {
        this.f11296a = 3;
        this.f11298c = wo2Var;
        this.f11297b = vd2Var;
    }
}

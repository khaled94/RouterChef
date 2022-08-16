package m4;

import android.content.Context;
import d.a;

/* loaded from: classes.dex */
public final class jl0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f10117a;

    /* renamed from: b */
    public final vd2 f10118b;

    /* renamed from: c */
    public final vd2 f10119c;

    /* renamed from: d */
    public final vd2 f10120d;

    /* renamed from: e */
    public final vd2 f10121e;

    public /* synthetic */ jl0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, int i10) {
        this.f10117a = i10;
        this.f10118b = vd2Var;
        this.f10119c = vd2Var2;
        this.f10120d = vd2Var3;
        this.f10121e = vd2Var4;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f10117a) {
            case 0:
                return new ib1((zo1) this.f10118b.a(), (uz1) this.f10119c.a(), ((cb1) this.f10121e).a(), ((g81) this.f10120d).a());
            default:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new df1(t90Var, ((gk0) this.f10119c).b(), (Context) this.f10120d.a(), ((td2) this.f10121e).a());
        }
    }
}

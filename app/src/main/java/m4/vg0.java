package m4;

import android.content.Context;
import s.d;

/* loaded from: classes.dex */
public final class vg0 implements x11 {

    /* renamed from: a */
    public final Context f14676a;

    /* renamed from: b */
    public final dy f14677b;

    /* renamed from: c */
    public final gh0 f14678c;

    /* renamed from: d */
    public final vg0 f14679d = this;

    /* renamed from: e */
    public final vd2<x11> f14680e;

    /* renamed from: f */
    public final vd2<dy> f14681f;

    /* renamed from: g */
    public final vd2<fk0> f14682g;

    /* renamed from: h */
    public final vd2<v11> f14683h;

    public /* synthetic */ vg0(gh0 gh0Var, Context context, dy dyVar) {
        this.f14678c = gh0Var;
        this.f14676a = context;
        this.f14677b = dyVar;
        nd2 b10 = od2.b(this);
        this.f14680e = (od2) b10;
        nd2 b11 = od2.b(dyVar);
        this.f14681f = (od2) b11;
        u11 u11Var = new u11(b11);
        this.f14682g = u11Var;
        this.f14683h = md2.c(new w11(b10, u11Var, 0));
    }

    @Override // m4.x11
    public final d a() {
        return new d(this.f14678c, this.f14679d);
    }
}

package m4;

import android.content.Context;
import d.a;

/* loaded from: classes.dex */
public final class gu0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9046a;

    /* renamed from: b */
    public final vd2 f9047b;

    /* renamed from: c */
    public final vd2 f9048c;

    /* renamed from: d */
    public final vd2 f9049d;

    /* renamed from: e */
    public final vd2 f9050e;

    /* renamed from: f */
    public final vd2 f9051f;

    public /* synthetic */ gu0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, vd2 vd2Var5, int i10) {
        this.f9046a = i10;
        this.f9047b = vd2Var;
        this.f9048c = vd2Var2;
        this.f9049d = vd2Var3;
        this.f9050e = vd2Var4;
        this.f9051f = vd2Var5;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f9046a) {
            case 0:
                go0 b10 = ((no0) this.f9048c).b();
                dr0 dr0Var = ((lr0) this.f9049d).f10970a;
                yt0 yt0Var = ((au0) this.f9050e).f6258a;
                cq0 a10 = ((hk0) this.f9051f).a();
                mg0 i10 = ((if0) this.f9047b.a()).i();
                i10.f11187c = new ho0(b10);
                i10.f11186b = dr0Var;
                i10.f11191g = yt0Var;
                i10.f11188d = new rb1(null, 0);
                i10.f11189e = new ul0(a10, 0);
                i10.f11190f = new fk0(null, 0);
                bm0<ik0> a11 = ((ng0) i10.f()).f11659a2.a();
                a.d(a11);
                return a11;
            case 1:
                return new ob1((Context) this.f9047b.a(), (dl0) this.f9048c.a(), (zo1) this.f9049d.a(), (uz1) this.f9050e.a(), (vs) ((sb1) this.f9051f).f13583a.f13243t);
            default:
                return new yl1((String) this.f9047b.a(), (wl1) this.f9048c.a(), (Context) this.f9049d.a(), (sl1) this.f9050e.a(), (mm1) this.f9051f.a());
        }
    }
}

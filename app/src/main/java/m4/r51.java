package m4;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r51 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f13165a;

    /* renamed from: b */
    public final vd2 f13166b;

    /* renamed from: c */
    public final vd2 f13167c;

    /* renamed from: d */
    public final vd2 f13168d;

    /* renamed from: e */
    public final vd2 f13169e;

    /* renamed from: f */
    public final vd2 f13170f;

    /* renamed from: g */
    public final vd2 f13171g;

    /* renamed from: h */
    public final vd2 f13172h;

    public /* synthetic */ r51(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, vd2 vd2Var5, vd2 vd2Var6, vd2 vd2Var7, int i10) {
        this.f13165a = i10;
        this.f13166b = vd2Var;
        this.f13167c = vd2Var2;
        this.f13168d = vd2Var3;
        this.f13169e = vd2Var4;
        this.f13170f = vd2Var5;
        this.f13171g = vd2Var6;
        this.f13172h = vd2Var7;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f13165a) {
            case 0:
                return new q51(((en1) this.f13166b).b(), (wm1) this.f13167c.a(), ((pm0) this.f13168d).b(), ((mm0) this.f13169e).b(), (v61) this.f13170f.a(), (ep1) this.f13171g.a(), (String) this.f13172h.a());
            default:
                return new p71((zj0) this.f13166b.a(), (Context) this.f13167c.a(), (Executor) this.f13168d.a(), (yz0) this.f13169e.a(), ((mo0) this.f13170f).b(), ((vf0) this.f13171g).b(), new ox());
        }
    }
}

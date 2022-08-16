package m4;

import android.content.Context;
import h4.a;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class sl0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f13726a;

    /* renamed from: b */
    public final vd2 f13727b;

    /* renamed from: c */
    public final vd2 f13728c;

    /* renamed from: d */
    public final vd2 f13729d;

    /* renamed from: e */
    public final vd2 f13730e;

    public /* synthetic */ sl0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, int i10) {
        this.f13726a = i10;
        this.f13727b = vd2Var;
        this.f13728c = vd2Var2;
        this.f13729d = vd2Var3;
        this.f13730e = vd2Var4;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f13726a) {
            case 0:
                return new rl0(((en1) this.f13727b).b(), ((cl0) this.f13728c).f7025a.f12901d, ((mm0) this.f13729d).b(), ((vf0) this.f13730e).b());
            default:
                return new lj0((Executor) this.f13728c.a(), new zi0((Context) this.f13729d.a(), (nh) this.f13727b.a()), (a) this.f13730e.a());
        }
    }
}

package m4;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dk1 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f7535a;

    /* renamed from: b */
    public final vd2 f7536b;

    /* renamed from: c */
    public final vd2 f7537c;

    /* renamed from: d */
    public final vd2 f7538d;

    /* renamed from: e */
    public final vd2 f7539e;

    /* renamed from: f */
    public final vd2 f7540f;

    /* renamed from: g */
    public final vd2 f7541g;

    /* renamed from: h */
    public final vd2 f7542h;

    public /* synthetic */ dk1(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, vd2 vd2Var5, vd2 vd2Var6, vd2 vd2Var7, int i10) {
        this.f7535a = i10;
        this.f7536b = vd2Var;
        this.f7537c = vd2Var2;
        this.f7538d = vd2Var3;
        this.f7539e = vd2Var4;
        this.f7540f = vd2Var5;
        this.f7541g = vd2Var6;
        this.f7542h = vd2Var7;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f7535a) {
            case 0:
                return new ck1((Context) this.f7536b.a(), (Executor) this.f7537c.a(), (on) this.f7538d.a(), (if0) this.f7539e.a(), (lc1) this.f7540f.a(), (nc1) this.f7541g.a(), new nm1());
            default:
                return new wl1((Context) this.f7536b.a(), (Executor) this.f7537c.a(), (if0) this.f7538d.a(), ((hl1) this.f7539e).a(), (sl1) this.f7540f.a(), new nm1(), (mm1) this.f7542h.a());
        }
    }
}

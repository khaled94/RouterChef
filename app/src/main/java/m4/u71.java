package m4;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u71 implements nd2<t71> {

    /* renamed from: a */
    public final vd2<sj0> f14263a;

    /* renamed from: b */
    public final vd2<Context> f14264b;

    /* renamed from: c */
    public final vd2<Executor> f14265c;

    /* renamed from: d */
    public final vd2<yz0> f14266d;

    public u71(vd2<sj0> vd2Var, vd2<Context> vd2Var2, vd2<Executor> vd2Var3, vd2<yz0> vd2Var4) {
        this.f14263a = vd2Var;
        this.f14264b = vd2Var2;
        this.f14265c = vd2Var3;
        this.f14266d = vd2Var4;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        return new t71(this.f14263a.a(), this.f14264b.a(), this.f14265c.a(), this.f14266d.a());
    }
}

package m4;

import android.content.Context;
import d.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class k21 implements nd2<j21> {

    /* renamed from: a */
    public final vd2<Executor> f10250a;

    /* renamed from: b */
    public final vd2<Context> f10251b;

    /* renamed from: c */
    public final vd2<WeakReference<Context>> f10252c;

    /* renamed from: d */
    public final vd2<h01> f10253d;

    /* renamed from: e */
    public final vd2<ScheduledExecutorService> f10254e;

    /* renamed from: f */
    public final vd2<m11> f10255f;

    /* renamed from: g */
    public final vd2<o90> f10256g;

    /* renamed from: h */
    public final vd2<sr0> f10257h;

    public k21(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, vd2 vd2Var5, vd2 vd2Var6, vd2 vd2Var7, vd2 vd2Var8) {
        this.f10250a = vd2Var;
        this.f10251b = vd2Var2;
        this.f10252c = vd2Var3;
        this.f10253d = vd2Var4;
        this.f10254e = vd2Var5;
        this.f10255f = vd2Var6;
        this.f10256g = vd2Var7;
        this.f10257h = vd2Var8;
    }

    @Override // m4.vd2
    public final Object a() {
        Executor a10 = this.f10250a.a();
        Context b10 = ((lf0) this.f10251b).b();
        WeakReference<Context> weakReference = ((mf0) this.f10252c).f11181a.f10403c;
        a.d(weakReference);
        t90 t90Var = u90.f14294a;
        a.d(t90Var);
        return new j21(a10, b10, weakReference, t90Var, this.f10253d.a(), this.f10254e.a(), this.f10255f.a(), ((vf0) this.f10256g).b(), new sr0(((td2) ((tr0) this.f10257h).f14161a).a()));
    }
}

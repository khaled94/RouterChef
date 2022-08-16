package m4;

import android.content.Context;
import d.a;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hy0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9473a;

    /* renamed from: b */
    public final vd2 f9474b;

    /* renamed from: c */
    public final vd2 f9475c;

    /* renamed from: d */
    public final vd2 f9476d;

    public /* synthetic */ hy0(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, int i10) {
        this.f9473a = i10;
        this.f9474b = vd2Var;
        this.f9475c = vd2Var2;
        this.f9476d = vd2Var3;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f9473a) {
            case 0:
                return new gy0(((nm0) this.f9474b).f11838a.f10938c, (av0) this.f9475c.a(), ((ov0) this.f9476d).b());
            case 1:
                a11 a11Var = (a11) this.f9474b.a();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return ((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue() ? new es0((s51) this.f9476d.a(), t90Var) : new es0(a11Var, t90Var);
            default:
                return new b81((Context) this.f9474b.a(), (dl0) this.f9475c.a(), (Executor) this.f9476d.a());
        }
    }
}

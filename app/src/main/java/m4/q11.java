package m4;

import android.content.Context;
import d.a;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q11 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f12677a = 0;

    /* renamed from: b */
    public final vd2 f12678b;

    /* renamed from: c */
    public final vd2 f12679c;

    /* renamed from: d */
    public final Object f12680d;

    public q11(qi qiVar, vd2 vd2Var) {
        go1 go1Var = eb.f7756v;
        this.f12680d = qiVar;
        this.f12678b = vd2Var;
        this.f12679c = go1Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f12677a) {
            case 0:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                Set e10 = qi.e((r11) this.f12678b.a(), t90Var);
                a.d(e10);
                return e10;
            default:
                return new ab1((Context) this.f12678b.a(), (Executor) this.f12679c.a(), (kz0) ((vd2) this.f12680d).a());
        }
    }

    public q11(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3) {
        this.f12678b = vd2Var;
        this.f12679c = vd2Var2;
        this.f12680d = vd2Var3;
    }
}

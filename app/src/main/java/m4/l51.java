package m4;

import android.content.Context;
import d.a;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class l51 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f10655a;

    /* renamed from: b */
    public final vd2 f10656b;

    /* renamed from: c */
    public final vd2 f10657c;

    /* renamed from: d */
    public final vd2 f10658d;

    /* renamed from: e */
    public final vd2 f10659e;

    /* renamed from: f */
    public final vd2 f10660f;

    /* renamed from: g */
    public final vd2 f10661g;

    /* renamed from: h */
    public final vd2 f10662h;

    public /* synthetic */ l51(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4, vd2 vd2Var5, vd2 vd2Var6, vd2 vd2Var7, int i10) {
        this.f10655a = i10;
        this.f10656b = vd2Var;
        this.f10657c = vd2Var2;
        this.f10658d = vd2Var3;
        this.f10659e = vd2Var4;
        this.f10660f = vd2Var5;
        this.f10661g = vd2Var6;
        this.f10662h = vd2Var7;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f10655a) {
            case 0:
                Context b10 = ((lf0) this.f10656b).b();
                Executor executor = (Executor) this.f10657c.a();
                r01 r01Var = new r01();
                if0 a10 = ((rf0) this.f10659e).f13264a.a();
                a.d(a10);
                return new k51(b10, executor, r01Var, a10, ((zf0) this.f10660f).a(), (ArrayDeque) this.f10661g.a());
            default:
                ((vi1) this.f10657c).a().intValue();
                ((lf0) this.f10658d).b();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                ((ui1) this.f10662h).b();
                return new di1((z80) this.f10659e.a(), (ScheduledExecutorService) this.f10660f.a(), t90Var);
        }
    }
}

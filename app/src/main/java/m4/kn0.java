package m4;

import android.content.Context;
import d.a;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class kn0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f10506a;

    /* renamed from: b */
    public final vd2 f10507b;

    /* renamed from: c */
    public final vd2 f10508c;

    public /* synthetic */ kn0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f10506a = i10;
        this.f10507b = vd2Var;
        this.f10508c = vd2Var2;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f10506a) {
            case 0:
                return new es0((oq0) this.f10507b.a(), (Executor) this.f10508c.a());
            case 1:
                return new m11((String) this.f10507b.a(), (j11) this.f10508c.a());
            case 2:
                Context b10 = ((lf0) this.f10507b).b();
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new v61(b10, t90Var);
            case 3:
                t90 t90Var2 = u90.f14294a;
                a.d(t90Var2);
                return new wd1(t90Var2, (z80) this.f10508c.a());
            default:
                t90 t90Var3 = u90.f14294a;
                a.d(t90Var3);
                return new nf1(t90Var3, (bm1) this.f10508c.a());
        }
    }
}

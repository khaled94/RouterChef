package m4;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;
import k4.b;
import n3.s0;
import t3.w;

/* loaded from: classes.dex */
public final class y81 implements l71<xs0, ym1, o81> {

    /* renamed from: a */
    public final Context f15614a;

    /* renamed from: b */
    public final nt0 f15615b;

    /* renamed from: c */
    public final o90 f15616c;

    /* renamed from: d */
    public final Executor f15617d;

    public y81(Context context, o90 o90Var, nt0 nt0Var, Executor executor) {
        this.f15614a = context;
        this.f15616c = o90Var;
        this.f15615b = nt0Var;
        this.f15617d = executor;
    }

    @Override // m4.l71
    public final /* bridge */ /* synthetic */ xs0 a(km1 km1Var, cm1 cm1Var, h71<ym1, o81> h71Var) {
        ys0 c10 = this.f15615b.c(new lm0(km1Var, cm1Var, h71Var.f9128a), new ct0(new w(this, h71Var), null));
        c10.i().I0(new oi0(h71Var.f9129b), this.f15617d);
        h71Var.f9130c.O3(c10.m());
        return c10.o();
    }

    @Override // m4.l71
    public final void b(km1 km1Var, cm1 cm1Var, h71<ym1, o81> h71Var) {
        ym1 ym1Var = h71Var.f9129b;
        Context context = this.f15614a;
        jn jnVar = ((om1) km1Var.f10488a.f8363t).f12203d;
        String jSONObject = cm1Var.f7064w.toString();
        String j3 = s0.j(cm1Var.f7061t);
        o81 o81Var = h71Var.f9130c;
        Objects.requireNonNull(ym1Var);
        try {
            ym1Var.f15839a.F0(new b(context), jnVar, jSONObject, j3, o81Var);
        } catch (Throwable th) {
            throw new pm1(th);
        }
    }
}

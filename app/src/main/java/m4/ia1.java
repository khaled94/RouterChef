package m4;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;
import k4.b;
import n3.g1;
import n3.m0;

/* loaded from: classes.dex */
public final class ia1 implements l71<hz0, ym1, o81> {

    /* renamed from: a */
    public final Context f9573a;

    /* renamed from: b */
    public final Executor f9574b;

    /* renamed from: c */
    public final kz0 f9575c;

    public ia1(Context context, Executor executor, kz0 kz0Var) {
        this.f9573a = context;
        this.f9574b = executor;
        this.f9575c = kz0Var;
    }

    @Override // m4.l71
    public final /* bridge */ /* synthetic */ hz0 a(km1 km1Var, cm1 cm1Var, h71<ym1, o81> h71Var) {
        iz0 f10 = this.f9575c.f(new lm0(km1Var, cm1Var, h71Var.f9128a), new jz0(new m0(h71Var)));
        f10.i().I0(new oi0(h71Var.f9129b), this.f9574b);
        h71Var.f9130c.O3(f10.s());
        return f10.q();
    }

    @Override // m4.l71
    public final void b(km1 km1Var, cm1 cm1Var, h71<ym1, o81> h71Var) {
        try {
            om1 om1Var = (om1) km1Var.f10488a.f8363t;
            if (om1Var.f12214o.f12816a == 3) {
                ym1 ym1Var = h71Var.f9129b;
                Context context = this.f9573a;
                jn jnVar = om1Var.f12203d;
                String jSONObject = cm1Var.f7064w.toString();
                o81 o81Var = h71Var.f9130c;
                Objects.requireNonNull(ym1Var);
                ym1Var.f15839a.F2(new b(context), jnVar, jSONObject, o81Var);
                return;
            }
            ym1 ym1Var2 = h71Var.f9129b;
            Context context2 = this.f9573a;
            jn jnVar2 = om1Var.f12203d;
            String jSONObject2 = cm1Var.f7064w.toString();
            o81 o81Var2 = h71Var.f9130c;
            Objects.requireNonNull(ym1Var2);
            ym1Var2.f15839a.j3(new b(context2), jnVar2, jSONObject2, o81Var2);
        } catch (Exception e10) {
            String valueOf = String.valueOf(h71Var.f9128a);
            g1.k(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e10);
        }
    }
}

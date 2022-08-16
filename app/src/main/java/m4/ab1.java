package m4;

import android.content.Context;
import e.o;
import java.util.Objects;
import java.util.concurrent.Executor;
import k4.b;
import n3.g1;

/* loaded from: classes.dex */
public final class ab1 implements l71<hz0, ym1, p81> {

    /* renamed from: a */
    public final Context f6097a;

    /* renamed from: b */
    public final Executor f6098b;

    /* renamed from: c */
    public final kz0 f6099c;

    public ab1(Context context, Executor executor, kz0 kz0Var) {
        this.f6097a = context;
        this.f6098b = executor;
        this.f6099c = kz0Var;
    }

    public static final void c(km1 km1Var, cm1 cm1Var, h71<ym1, p81> h71Var) {
        try {
            ym1 ym1Var = h71Var.f9129b;
            jn jnVar = ((om1) km1Var.f10488a.f8363t).f12203d;
            String jSONObject = cm1Var.f7064w.toString();
            Objects.requireNonNull(ym1Var);
            ym1Var.f15839a.a1(jnVar, jSONObject);
        } catch (Exception e10) {
            String valueOf = String.valueOf(h71Var.f9128a);
            g1.k(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e10);
        }
    }

    @Override // m4.l71
    public final hz0 a(km1 km1Var, cm1 cm1Var, h71<ym1, p81> h71Var) {
        iz0 f10 = this.f6099c.f(new lm0(km1Var, cm1Var, h71Var.f9128a), new jz0(new o(h71Var, 2)));
        f10.i().I0(new oi0(h71Var.f9129b), this.f6098b);
        ip0 j3 = f10.j();
        ro0 f11 = f10.f();
        wp0 n10 = f10.n();
        ps0 o10 = f10.o();
        p81 p81Var = h71Var.f9130c;
        za1 za1Var = new za1(n10, f11, j3, o10);
        synchronized (p81Var) {
            p81Var.f12431s = za1Var;
        }
        return f10.q();
    }

    @Override // m4.l71
    public final void b(km1 km1Var, cm1 cm1Var, h71<ym1, p81> h71Var) {
        if (!h71Var.f9129b.a()) {
            ya1 ya1Var = new ya1(this, km1Var, cm1Var, h71Var);
            p81 p81Var = h71Var.f9130c;
            synchronized (p81Var) {
                p81Var.f12433u = ya1Var;
            }
            ym1 ym1Var = h71Var.f9129b;
            Context context = this.f6097a;
            jn jnVar = ((om1) km1Var.f10488a.f8363t).f12203d;
            p81 p81Var2 = h71Var.f9130c;
            String jSONObject = cm1Var.f7064w.toString();
            Objects.requireNonNull(ym1Var);
            try {
                ym1Var.f15839a.A2(new b(context), jnVar, p81Var2, jSONObject);
                return;
            } catch (Throwable th) {
                throw new pm1(th);
            }
        }
        c(km1Var, cm1Var, h71Var);
    }
}

package c5;

import d4.m;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j<TResult> {

    /* renamed from: a */
    public final b0<TResult> f2776a = new b0<>();

    public final void a(Exception exc) {
        this.f2776a.q(exc);
    }

    public final void b(TResult tresult) {
        this.f2776a.r(tresult);
    }

    public final boolean c(Exception exc) {
        b0<TResult> b0Var = this.f2776a;
        Objects.requireNonNull(b0Var);
        m.i(exc, "Exception must not be null");
        synchronized (b0Var.f2770a) {
            if (b0Var.f2772c) {
                return false;
            }
            b0Var.f2772c = true;
            b0Var.f2775f = exc;
            b0Var.f2771b.b(b0Var);
            return true;
        }
    }

    public final boolean d(TResult tresult) {
        b0<TResult> b0Var = this.f2776a;
        synchronized (b0Var.f2770a) {
            if (b0Var.f2772c) {
                return false;
            }
            b0Var.f2772c = true;
            b0Var.f2774e = tresult;
            b0Var.f2771b.b(b0Var);
            return true;
        }
    }
}

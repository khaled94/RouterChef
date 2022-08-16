package m4;

import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class h5 extends dd2 {
    static {
        x50.e(h5.class);
    }

    public h5(fc0 fc0Var, g5 g5Var) {
        this.f7332t = fc0Var;
        this.f7334v = fc0Var.c();
        fc0Var.G(fc0Var.c() + fc0Var.f8397s.limit());
        this.f7335w = fc0Var.c();
        this.f7331s = g5Var;
    }

    @Override // m4.dd2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // m4.dd2
    public final String toString() {
        String obj = this.f7332t.toString();
        return a.b(new StringBuilder(String.valueOf(obj).length() + 7), "model(", obj, ")");
    }
}

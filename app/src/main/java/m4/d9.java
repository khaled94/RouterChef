package m4;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class d9 implements Callable {

    /* renamed from: a */
    public final n8 f7262a;

    /* renamed from: b */
    public final v5 f7263b;

    public d9(n8 n8Var, v5 v5Var) {
        this.f7262a = n8Var;
        this.f7263b = v5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Future future = this.f7262a.f11560k;
        if (future != null) {
            future.get();
        }
        k6 k6Var = this.f7262a.f11559j;
        if (k6Var != null) {
            try {
                synchronized (this.f7263b) {
                    v5 v5Var = this.f7263b;
                    byte[] b10 = k6Var.b();
                    v5Var.i(b10, b10.length, z82.a());
                }
                return null;
            } catch (NullPointerException | x92 unused) {
                return null;
            }
        }
        return null;
    }
}

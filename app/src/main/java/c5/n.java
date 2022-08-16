package c5;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: s */
    public final Object f2779s = new Object();

    /* renamed from: t */
    public final int f2780t;

    /* renamed from: u */
    public final b0<Void> f2781u;
    @GuardedBy("mLock")

    /* renamed from: v */
    public int f2782v;
    @GuardedBy("mLock")

    /* renamed from: w */
    public int f2783w;
    @GuardedBy("mLock")

    /* renamed from: x */
    public int f2784x;
    @GuardedBy("mLock")
    public Exception y;
    @GuardedBy("mLock")

    /* renamed from: z */
    public boolean f2785z;

    public n(int i10, b0<Void> b0Var) {
        this.f2780t = i10;
        this.f2781u = b0Var;
    }

    @GuardedBy("mLock")
    public final void a() {
        if (this.f2782v + this.f2783w + this.f2784x == this.f2780t) {
            if (this.y == null) {
                if (this.f2785z) {
                    this.f2781u.s();
                    return;
                } else {
                    this.f2781u.r(null);
                    return;
                }
            }
            b0<Void> b0Var = this.f2781u;
            int i10 = this.f2783w;
            int i11 = this.f2780t;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i10);
            sb.append(" out of ");
            sb.append(i11);
            sb.append(" underlying tasks failed");
            b0Var.q(new ExecutionException(sb.toString(), this.y));
        }
    }

    @Override // c5.c
    public final void b() {
        synchronized (this.f2779s) {
            this.f2784x++;
            this.f2785z = true;
            a();
        }
    }

    @Override // c5.f
    public final void c(Object obj) {
        synchronized (this.f2779s) {
            this.f2782v++;
            a();
        }
    }

    @Override // c5.e
    public final void e(Exception exc) {
        synchronized (this.f2779s) {
            this.f2783w++;
            this.y = exc;
            a();
        }
    }
}

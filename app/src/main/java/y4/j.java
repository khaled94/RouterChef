package y4;

import android.os.Handler;
import java.util.Objects;
import m4.jh;
import s4.n0;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: d */
    public static volatile n0 f20513d;

    /* renamed from: a */
    public final k3 f20514a;

    /* renamed from: b */
    public final jh f20515b;

    /* renamed from: c */
    public volatile long f20516c;

    public j(k3 k3Var) {
        Objects.requireNonNull(k3Var, "null reference");
        this.f20514a = k3Var;
        this.f20515b = new jh(this, k3Var, 2);
    }

    public final void a() {
        this.f20516c = 0L;
        d().removeCallbacks(this.f20515b);
    }

    public abstract void b();

    public final void c(long j3) {
        a();
        if (j3 >= 0) {
            this.f20516c = this.f20514a.c().a();
            if (d().postDelayed(this.f20515b, j3)) {
                return;
            }
            this.f20514a.C().f20710x.b("Failed to schedule delayed post. time", Long.valueOf(j3));
        }
    }

    public final Handler d() {
        n0 n0Var;
        if (f20513d != null) {
            return f20513d;
        }
        synchronized (j.class) {
            if (f20513d == null) {
                f20513d = new n0(this.f20514a.b().getMainLooper());
            }
            n0Var = f20513d;
        }
        return n0Var;
    }
}

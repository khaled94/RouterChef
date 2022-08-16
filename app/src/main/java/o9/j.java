package o9;

import androidx.activity.result.a;
import k9.u;

/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: u */
    public final Runnable f16834u;

    public j(Runnable runnable, long j3, h hVar) {
        super(j3, hVar);
        this.f16834u = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f16834u.run();
        } finally {
            this.f16832t.a();
        }
    }

    public final String toString() {
        StringBuilder c10 = a.c("Task[");
        c10.append(u.a(this.f16834u));
        c10.append('@');
        c10.append(u.b(this.f16834u));
        c10.append(", ");
        c10.append(this.f16831s);
        c10.append(", ");
        c10.append(this.f16832t);
        c10.append(']');
        return c10.toString();
    }
}

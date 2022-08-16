package m4;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class cf2 {

    /* renamed from: a */
    public final bf2 f6818a;

    /* renamed from: b */
    public final af2 f6819b;

    /* renamed from: c */
    public int f6820c;

    /* renamed from: d */
    public Object f6821d;

    /* renamed from: e */
    public final Looper f6822e;

    /* renamed from: f */
    public boolean f6823f;

    /* renamed from: g */
    public boolean f6824g;

    /* renamed from: h */
    public boolean f6825h;

    public cf2(af2 af2Var, bf2 bf2Var, Looper looper) {
        this.f6819b = af2Var;
        this.f6818a = bf2Var;
        this.f6822e = looper;
    }

    public final Looper a() {
        return this.f6822e;
    }

    public final cf2 b() {
        r01.h(!this.f6823f);
        this.f6823f = true;
        je2 je2Var = (je2) this.f6819b;
        synchronized (je2Var) {
            if (!je2Var.N && je2Var.A.isAlive()) {
                ((ho1) je2Var.f9948z.b(14, this)).a();
            }
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            c(false);
        }
        return this;
    }

    public final synchronized void c(boolean z10) {
        this.f6824g = z10 | this.f6824g;
        this.f6825h = true;
        notifyAll();
    }

    public final synchronized boolean d() {
        r01.h(this.f6823f);
        r01.h(this.f6822e.getThread() != Thread.currentThread());
        long j3 = 2000;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 2000;
        while (!this.f6825h) {
            if (j3 <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j3);
            j3 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.f6824g;
    }
}

package m4;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class gj {

    /* renamed from: a */
    public final cj f8942a = new cj(this, 0);

    /* renamed from: b */
    public final Object f8943b = new Object();
    @GuardedBy("lock")

    /* renamed from: c */
    public jj f8944c;
    @GuardedBy("lock")

    /* renamed from: d */
    public Context f8945d;
    @GuardedBy("lock")

    /* renamed from: e */
    public mj f8946e;

    public static /* bridge */ /* synthetic */ void c(gj gjVar) {
        synchronized (gjVar.f8943b) {
            jj jjVar = gjVar.f8944c;
            if (jjVar == null) {
                return;
            }
            if (jjVar.a() || gjVar.f8944c.g()) {
                gjVar.f8944c.p();
            }
            gjVar.f8944c = null;
            gjVar.f8946e = null;
            Binder.flushPendingCommands();
        }
    }

    public final long a(kj kjVar) {
        synchronized (this.f8943b) {
            try {
                if (this.f8946e == null) {
                    return -2L;
                }
                if (this.f8944c.E()) {
                    try {
                        mj mjVar = this.f8946e;
                        Parcel w10 = mjVar.w();
                        ca.b(w10, kjVar);
                        Parcel c02 = mjVar.c0(3, w10);
                        long readLong = c02.readLong();
                        c02.recycle();
                        return readLong;
                    } catch (RemoteException e10) {
                        g1.h("Unable to call into cache service.", e10);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final hj b(kj kjVar) {
        synchronized (this.f8943b) {
            if (this.f8946e == null) {
                return new hj();
            }
            try {
                if (this.f8944c.E()) {
                    return this.f8946e.Z1(kjVar);
                }
                return this.f8946e.E1(kjVar);
            } catch (RemoteException e10) {
                g1.h("Unable to call into cache service.", e10);
                return new hj();
            }
        }
    }

    public final void d(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f8943b) {
            if (this.f8945d != null) {
                return;
            }
            this.f8945d = context.getApplicationContext();
            yr<Boolean> yrVar = es.f8199t2;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                e();
            } else {
                if (((Boolean) joVar.f10148c.a(es.f8191s2)).booleanValue()) {
                    s.B.f5792f.b(new dj(this));
                }
            }
        }
    }

    public final void e() {
        jj jjVar;
        synchronized (this.f8943b) {
            try {
                if (this.f8945d != null && this.f8944c == null) {
                    ej ejVar = new ej(this);
                    fj fjVar = new fj(this);
                    synchronized (this) {
                        jjVar = new jj(this.f8945d, s.B.f5802q.a(), ejVar, fjVar);
                    }
                    this.f8944c = jjVar;
                    jjVar.n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

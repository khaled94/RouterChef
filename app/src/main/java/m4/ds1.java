package m4;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import d4.b;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class ds1 implements b.a, b.AbstractC0056b {

    /* renamed from: a */
    public final xs1 f7626a;

    /* renamed from: b */
    public final String f7627b;

    /* renamed from: c */
    public final String f7628c;

    /* renamed from: d */
    public final LinkedBlockingQueue<k6> f7629d = new LinkedBlockingQueue<>();

    /* renamed from: e */
    public final HandlerThread f7630e;

    public ds1(Context context, String str, String str2) {
        this.f7627b = str;
        this.f7628c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f7630e = handlerThread;
        handlerThread.start();
        xs1 xs1Var = new xs1(context, handlerThread.getLooper(), this, this, 9200000);
        this.f7626a = xs1Var;
        xs1Var.n();
    }

    public static k6 a() {
        v5 V = k6.V();
        V.q(32768L);
        return V.k();
    }

    public final void b() {
        xs1 xs1Var = this.f7626a;
        if (xs1Var != null) {
            if (!xs1Var.a() && !this.f7626a.g()) {
                return;
            }
            this.f7626a.p();
        }
    }

    @Override // d4.b.AbstractC0056b
    public final void c0(a4.b bVar) {
        try {
            this.f7629d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // d4.b.a
    public final void e0() {
        ct1 ct1Var;
        try {
            ct1Var = this.f7626a.E();
        } catch (DeadObjectException | IllegalStateException unused) {
            ct1Var = null;
        }
        if (ct1Var != null) {
            try {
                try {
                    ys1 ys1Var = new ys1(this.f7627b, this.f7628c);
                    Parcel w10 = ct1Var.w();
                    ca.b(w10, ys1Var);
                    Parcel c02 = ct1Var.c0(1, w10);
                    at1 at1Var = (at1) ca.a(c02, at1.CREATOR);
                    c02.recycle();
                    if (at1Var.f6255t == null) {
                        try {
                            at1Var.f6255t = k6.l0(at1Var.f6256u, z82.a());
                            at1Var.f6256u = null;
                        } catch (NullPointerException | x92 e10) {
                            throw new IllegalStateException(e10);
                        }
                    }
                    at1Var.a();
                    this.f7629d.put(at1Var.f6255t);
                } catch (Throwable unused2) {
                    this.f7629d.put(a());
                }
            } catch (InterruptedException unused3) {
            } catch (Throwable th) {
                b();
                this.f7630e.quit();
                throw th;
            }
            b();
            this.f7630e.quit();
        }
    }

    @Override // d4.b.a
    public final void w(int i10) {
        try {
            this.f7629d.put(a());
        } catch (InterruptedException unused) {
        }
    }
}

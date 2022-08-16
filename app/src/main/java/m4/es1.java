package m4;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import d4.b;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class es1 implements b.a, b.AbstractC0056b {

    /* renamed from: a */
    public final xs1 f8251a;

    /* renamed from: b */
    public final String f8252b;

    /* renamed from: c */
    public final String f8253c;

    /* renamed from: e */
    public final HandlerThread f8255e;

    /* renamed from: f */
    public final zr1 f8256f;

    /* renamed from: h */
    public final int f8258h;

    /* renamed from: g */
    public final long f8257g = System.currentTimeMillis();

    /* renamed from: d */
    public final LinkedBlockingQueue<it1> f8254d = new LinkedBlockingQueue<>();

    public es1(Context context, int i10, String str, String str2, zr1 zr1Var) {
        this.f8252b = str;
        this.f8258h = i10;
        this.f8253c = str2;
        this.f8256f = zr1Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f8255e = handlerThread;
        handlerThread.start();
        xs1 xs1Var = new xs1(context, handlerThread.getLooper(), this, this, 19621000);
        this.f8251a = xs1Var;
        xs1Var.n();
    }

    public final void a() {
        xs1 xs1Var = this.f8251a;
        if (xs1Var != null) {
            if (!xs1Var.a() && !this.f8251a.g()) {
                return;
            }
            this.f8251a.p();
        }
    }

    public final void b(int i10, long j3, Exception exc) {
        this.f8256f.c(i10, System.currentTimeMillis() - j3, exc);
    }

    @Override // d4.b.AbstractC0056b
    public final void c0(a4.b bVar) {
        try {
            b(4012, this.f8257g, null);
            this.f8254d.put(new it1());
        } catch (InterruptedException unused) {
        }
    }

    @Override // d4.b.a
    public final void e0() {
        ct1 ct1Var;
        try {
            ct1Var = this.f8251a.E();
        } catch (DeadObjectException | IllegalStateException unused) {
            ct1Var = null;
        }
        if (ct1Var != null) {
            try {
                gt1 gt1Var = new gt1(this.f8258h, this.f8252b, this.f8253c);
                Parcel w10 = ct1Var.w();
                ca.b(w10, gt1Var);
                Parcel c02 = ct1Var.c0(3, w10);
                c02.recycle();
                b(5011, this.f8257g, null);
                this.f8254d.put((it1) ca.a(c02, it1.CREATOR));
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // d4.b.a
    public final void w(int i10) {
        try {
            b(4011, this.f8257g, null);
            this.f8254d.put(new it1());
        } catch (InterruptedException unused) {
        }
    }
}

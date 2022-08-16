package m4;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import d4.b;

/* loaded from: classes.dex */
public final class gs1 implements b.a, b.AbstractC0056b {

    /* renamed from: a */
    public final xs1 f9023a;

    /* renamed from: b */
    public final ss1 f9024b;

    /* renamed from: c */
    public final Object f9025c = new Object();

    /* renamed from: d */
    public boolean f9026d = false;

    /* renamed from: e */
    public boolean f9027e = false;

    public gs1(Context context, Looper looper, ss1 ss1Var) {
        this.f9024b = ss1Var;
        this.f9023a = new xs1(context, looper, this, this, 12800000);
    }

    public final void a() {
        synchronized (this.f9025c) {
            if (this.f9023a.a() || this.f9023a.g()) {
                this.f9023a.p();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // d4.b.AbstractC0056b
    public final void c0(a4.b bVar) {
    }

    @Override // d4.b.a
    public final void e0() {
        synchronized (this.f9025c) {
            if (this.f9027e) {
                return;
            }
            this.f9027e = true;
            try {
                ct1 E = this.f9023a.E();
                vs1 vs1Var = new vs1(this.f9024b.b());
                Parcel w10 = E.w();
                ca.b(w10, vs1Var);
                E.e0(2, w10);
            } catch (Exception unused) {
            } catch (Throwable th) {
                a();
                throw th;
            }
            a();
        }
    }

    @Override // d4.b.a
    public final void w(int i10) {
    }
}

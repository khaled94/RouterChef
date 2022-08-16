package m4;

import a4.b;
import android.content.Context;
import android.os.RemoteException;
import java.io.InputStream;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class j41 extends g41 {

    /* renamed from: g */
    public String f9848g;

    /* renamed from: h */
    public int f9849h = 1;

    public j41(Context context) {
        this.f8750f = new a50(context, s.B.f5802q.a(), this, this);
    }

    @Override // m4.g41, d4.b.AbstractC0056b
    public final void c0(b bVar) {
        g1.e("Cannot connect to remote service, fallback to local instance.");
        this.f8745a.c(new t41(1));
    }

    @Override // d4.b.a
    public final void e0() {
        t41 t41Var;
        w90<InputStream> w90Var;
        synchronized (this.f8746b) {
            if (!this.f8748d) {
                this.f8748d = true;
                try {
                    int i10 = this.f9849h;
                    if (i10 == 2) {
                        this.f8750f.E().U0(this.f8749e, new f41(this));
                    } else if (i10 == 3) {
                        this.f8750f.E().v0(this.f9848g, new f41(this));
                    } else {
                        this.f8745a.c(new t41(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    w90Var = this.f8745a;
                    t41Var = new t41(1);
                    w90Var.c(t41Var);
                } catch (Throwable th) {
                    s.B.f5793g.g(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    w90Var = this.f8745a;
                    t41Var = new t41(1);
                    w90Var.c(t41Var);
                }
            }
        }
    }
}

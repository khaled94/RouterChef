package m4;

import a4.b;
import android.content.Context;
import android.os.RemoteException;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class e41 extends g41 {
    public e41(Context context) {
        this.f8750f = new a50(context, s.B.f5802q.a(), this, this);
    }

    @Override // m4.g41, d4.b.AbstractC0056b
    public final void c0(b bVar) {
        g1.e("Cannot connect to remote service, fallback to local instance.");
        this.f8745a.c(new t41(1));
    }

    @Override // d4.b.a
    public final void e0() {
        synchronized (this.f8746b) {
            if (!this.f8748d) {
                this.f8748d = true;
                try {
                    this.f8750f.E().u2(this.f8749e, new f41(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f8745a.c(new t41(1));
                }
            }
        }
    }
}

package m4;

import android.content.Context;
import android.os.RemoteException;
import l3.s;

/* loaded from: classes.dex */
public final class h41 extends g41 {
    public h41(Context context) {
        this.f8750f = new a50(context, s.B.f5802q.a(), this, this);
    }

    @Override // d4.b.a
    public final void e0() {
        synchronized (this.f8746b) {
            if (!this.f8748d) {
                this.f8748d = true;
                try {
                    this.f8750f.E().q3(this.f8749e, new f41(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f8745a.c(new t41(1));
                }
            }
        }
    }
}

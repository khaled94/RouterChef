package m4;

import android.os.DeadObjectException;
import d4.b;
import n3.g1;

/* loaded from: classes.dex */
public final class ej implements b.a {

    /* renamed from: a */
    public final /* synthetic */ gj f7976a;

    public ej(gj gjVar) {
        this.f7976a = gjVar;
    }

    @Override // d4.b.a
    public final void e0() {
        synchronized (this.f7976a.f8943b) {
            try {
                gj gjVar = this.f7976a;
                jj jjVar = gjVar.f8944c;
                if (jjVar != null) {
                    gjVar.f8946e = (mj) jjVar.v();
                }
            } catch (DeadObjectException e10) {
                g1.h("Unable to obtain a cache service instance.", e10);
                gj.c(this.f7976a);
            }
            this.f7976a.f8943b.notifyAll();
        }
    }

    @Override // d4.b.a
    public final void w(int i10) {
        synchronized (this.f7976a.f8943b) {
            gj gjVar = this.f7976a;
            gjVar.f8946e = null;
            gjVar.f8943b.notifyAll();
        }
    }
}

package m4;

import d4.b;

/* loaded from: classes.dex */
public final class fj implements b.AbstractC0056b {

    /* renamed from: a */
    public final /* synthetic */ gj f8574a;

    public fj(gj gjVar) {
        this.f8574a = gjVar;
    }

    @Override // d4.b.AbstractC0056b
    public final void c0(a4.b bVar) {
        synchronized (this.f8574a.f8943b) {
            gj gjVar = this.f8574a;
            gjVar.f8946e = null;
            if (gjVar.f8944c != null) {
                gjVar.f8944c = null;
            }
            gjVar.f8943b.notifyAll();
        }
    }
}

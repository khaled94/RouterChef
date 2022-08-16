package u1;

import e2.c;
import g6.a;
import t1.h;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ a f19032s;

    /* renamed from: t */
    public final /* synthetic */ c f19033t;

    /* renamed from: u */
    public final /* synthetic */ n f19034u;

    public l(n nVar, a aVar, c cVar) {
        this.f19034u = nVar;
        this.f19032s = aVar;
        this.f19033t = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ((e2.a) this.f19032s).get();
            h.c().a(n.L, String.format("Starting work for %s", this.f19034u.f19042w.f2637c), new Throwable[0]);
            n nVar = this.f19034u;
            nVar.J = nVar.f19043x.startWork();
            this.f19033t.m(this.f19034u.J);
        } catch (Throwable th) {
            this.f19033t.l(th);
        }
    }
}

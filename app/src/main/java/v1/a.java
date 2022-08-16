package v1;

import c2.p;
import t1.h;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ p f19770s;

    /* renamed from: t */
    public final /* synthetic */ b f19771t;

    public a(b bVar, p pVar) {
        this.f19771t = bVar;
        this.f19770s = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.c().a(b.f19772d, String.format("Scheduling work %s", this.f19770s.f2635a), new Throwable[0]);
        this.f19771t.f19773a.e(this.f19770s);
    }
}

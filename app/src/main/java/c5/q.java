package c5;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ r f2792s;

    public q(r rVar) {
        this.f2792s = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2792s.f2794t) {
            c cVar = this.f2792s.f2795u;
            if (cVar != null) {
                cVar.b();
            }
        }
    }
}

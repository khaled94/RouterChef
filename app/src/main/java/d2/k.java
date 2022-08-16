package d2;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: s */
    public u1.k f3755s;

    /* renamed from: t */
    public String f3756t;

    /* renamed from: u */
    public WorkerParameters.a f3757u;

    public k(u1.k kVar, String str, WorkerParameters.a aVar) {
        this.f3755s = kVar;
        this.f3756t = str;
        this.f3757u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3755s.f19028f.g(this.f3756t, this.f3757u);
    }
}

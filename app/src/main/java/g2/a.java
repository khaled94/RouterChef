package g2;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ g6.a f4887s;

    /* renamed from: t */
    public final /* synthetic */ ConstraintTrackingWorker f4888t;

    public a(ConstraintTrackingWorker constraintTrackingWorker, g6.a aVar) {
        this.f4888t = constraintTrackingWorker;
        this.f4887s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4888t.y) {
            if (this.f4888t.f2391z) {
                this.f4888t.b();
            } else {
                this.f4888t.A.m(this.f4887s);
            }
        }
    }
}

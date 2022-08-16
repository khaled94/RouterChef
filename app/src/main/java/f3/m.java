package f3;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
import m4.lq;
import m4.nr;
import n3.g1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public final Object f4516a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    public lq f4517b;
    @GuardedBy("lock")

    /* renamed from: c */
    public a f4518c;

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public final void a(lq lqVar) {
        synchronized (this.f4516a) {
            try {
                this.f4517b = lqVar;
                a aVar = this.f4518c;
                if (aVar != null) {
                    synchronized (this.f4516a) {
                        this.f4518c = aVar;
                        lq lqVar2 = this.f4517b;
                        if (lqVar2 != null) {
                            try {
                                lqVar2.y2(new nr(aVar));
                            } catch (RemoteException e10) {
                                g1.h("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

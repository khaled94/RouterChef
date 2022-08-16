package q6;

import android.os.Bundle;
import android.util.Log;
import e9.d;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import u1.a;

/* loaded from: classes.dex */
public final class c implements b, a {

    /* renamed from: s */
    public final a f17149s;

    /* renamed from: t */
    public final Object f17150t = new Object();

    /* renamed from: u */
    public CountDownLatch f17151u;

    public c(a aVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f17149s = aVar;
    }

    @Override // q6.a
    public final void a(Bundle bundle) {
        synchronized (this.f17150t) {
            d dVar = d.f4460v;
            dVar.m("Logging event _ae to Firebase Analytics with params " + bundle);
            this.f17151u = new CountDownLatch(1);
            this.f17149s.a(bundle);
            dVar.m("Awaiting app exception callback from Analytics...");
            try {
                if (this.f17151u.await(500, TimeUnit.MILLISECONDS)) {
                    dVar.m("App exception callback received from Analytics listener.");
                } else {
                    dVar.n("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.f17151u = null;
        }
    }

    @Override // q6.b
    public final void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f17151u;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}

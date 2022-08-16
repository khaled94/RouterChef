package z3;

import android.content.Context;
import android.util.Log;
import c5.i;
import i4.a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class t {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: e */
    public static t f20963e;

    /* renamed from: a */
    public final Context f20964a;

    /* renamed from: b */
    public final ScheduledExecutorService f20965b;
    @GuardedBy("this")

    /* renamed from: c */
    public m f20966c = new m(this);
    @GuardedBy("this")

    /* renamed from: d */
    public int f20967d = 1;

    public t(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f20965b = scheduledExecutorService;
        this.f20964a = context.getApplicationContext();
    }

    public static synchronized t a(Context context) {
        t tVar;
        synchronized (t.class) {
            if (f20963e == null) {
                f20963e = new t(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new a("MessengerIpcClient"))));
            }
            tVar = f20963e;
        }
        return tVar;
    }

    public final synchronized <T> i<T> b(q<T> qVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(qVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f20966c.d(qVar)) {
            m mVar = new m(this);
            this.f20966c = mVar;
            mVar.d(qVar);
        }
        return qVar.f20960b.f2776a;
    }
}

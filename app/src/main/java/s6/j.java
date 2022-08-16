package s6;

import android.util.Log;
import s6.y;
import z6.c;

/* loaded from: classes.dex */
public final class j implements y.a {

    /* renamed from: a */
    public final /* synthetic */ o f18267a;

    public j(o oVar) {
        this.f18267a = oVar;
    }

    public final void a(c cVar, Thread thread, Throwable th) {
        o oVar = this.f18267a;
        synchronized (oVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                l0.a(oVar.f18291d.c(new l(oVar, System.currentTimeMillis(), th, thread, cVar)));
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }
}

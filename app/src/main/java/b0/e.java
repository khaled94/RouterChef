package b0;

import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ Object f2402s;

    /* renamed from: t */
    public final /* synthetic */ Object f2403t;

    public e(Object obj, Object obj2) {
        this.f2402s = obj;
        this.f2403t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = f.f2407d;
            if (method != null) {
                method.invoke(this.f2402s, this.f2403t, Boolean.FALSE, "AppCompat recreation");
            } else {
                f.f2408e.invoke(this.f2402s, this.f2403t, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}

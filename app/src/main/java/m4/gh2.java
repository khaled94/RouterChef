package m4;

import android.os.SystemClock;
import java.lang.Exception;

/* loaded from: classes.dex */
public final class gh2<T extends Exception> {

    /* renamed from: a */
    public T f8932a;

    /* renamed from: b */
    public long f8933b;

    public final void a(T t10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f8932a == null) {
            this.f8932a = t10;
            this.f8933b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime < this.f8933b) {
            return;
        }
        T t11 = this.f8932a;
        this.f8932a = null;
        throw t11;
    }
}

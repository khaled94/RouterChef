package n3;

import android.os.SystemClock;
import java.util.Objects;
import javax.annotation.concurrent.GuardedBy;
import l3.s;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a */
    public long f16594a;
    @GuardedBy("lock")

    /* renamed from: b */
    public long f16595b = Long.MIN_VALUE;

    /* renamed from: c */
    public final Object f16596c = new Object();

    public x0(long j3) {
        this.f16594a = j3;
    }

    public final boolean a() {
        synchronized (this.f16596c) {
            Objects.requireNonNull(s.B.f5796j);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f16595b + this.f16594a > elapsedRealtime) {
                return false;
            }
            this.f16595b = elapsedRealtime;
            return true;
        }
    }
}

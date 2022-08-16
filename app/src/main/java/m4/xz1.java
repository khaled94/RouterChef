package m4;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xz1<V> extends jz1<V> implements ScheduledFuture<V> {

    /* renamed from: t */
    public final ScheduledFuture<?> f15515t;

    public xz1(tz1<V> tz1Var, ScheduledFuture<?> scheduledFuture) {
        super(tz1Var);
        this.f15515t = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean cancel = this.f10219s.cancel(z10);
        if (cancel) {
            this.f15515t.cancel(z10);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f15515t.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f15515t.getDelay(timeUnit);
    }
}

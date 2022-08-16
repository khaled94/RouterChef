package m4;

import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ys {

    /* renamed from: a */
    public MotionEvent f15896a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b */
    public MotionEvent f15897b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c */
    public final ScheduledExecutorService f15898c;

    public ys(ScheduledExecutorService scheduledExecutorService) {
        this.f15898c = scheduledExecutorService;
    }

    public final tz1<String> a() {
        return (gz1) mz1.q(gz1.r(mz1.m(null)), lt.f10984c.e().longValue(), TimeUnit.MILLISECONDS, this.f15898c);
    }
}

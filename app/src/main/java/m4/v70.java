package m4;

import androidx.activity.k;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class v70 implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f14593a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, k.a(42, "AdWorker(SCION_TASK_EXECUTOR) #", this.f14593a.getAndIncrement()));
    }
}

package h2;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class p implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f5017a = Executors.defaultThreadFactory();

    /* renamed from: b */
    public final AtomicInteger f5018b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f5017a.newThread(runnable);
        int andIncrement = this.f5018b.getAndIncrement();
        newThread.setName("PlayBillingLibrary-" + andIncrement);
        return newThread;
    }
}

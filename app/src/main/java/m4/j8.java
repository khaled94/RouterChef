package m4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class j8 implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f9867a = Executors.defaultThreadFactory();

    /* renamed from: b */
    public final AtomicInteger f9868b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f9867a.newThread(runnable);
        int andIncrement = this.f9868b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}

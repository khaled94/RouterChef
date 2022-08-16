package m4;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class q90 extends ScheduledThreadPoolExecutor {
    public q90(ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}

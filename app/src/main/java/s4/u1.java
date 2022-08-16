package s4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class u1 implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f18128a = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f18128a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}

package s6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class a0 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f18228a;

    /* renamed from: b */
    public final /* synthetic */ AtomicLong f18229b;

    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: s */
        public final /* synthetic */ Runnable f18230s;

        public a(Runnable runnable) {
            this.f18230s = runnable;
        }

        @Override // s6.c
        public final void a() {
            this.f18230s.run();
        }
    }

    public a0(String str, AtomicLong atomicLong) {
        this.f18228a = str;
        this.f18229b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        newThread.setName(this.f18228a + this.f18229b.getAndIncrement());
        return newThread;
    }
}

package t1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f18449a = new AtomicInteger(0);

    /* renamed from: b */
    public final /* synthetic */ boolean f18450b;

    public a(boolean z10) {
        this.f18450b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder c10 = androidx.activity.result.a.c(this.f18450b ? "WM.task-" : "androidx.work-");
        c10.append(this.f18449a.incrementAndGet());
        return new Thread(runnable, c10.toString());
    }
}

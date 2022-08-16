package i4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a */
    public final String f5266a;

    /* renamed from: b */
    public final ThreadFactory f5267b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f5266a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f5267b.newThread(new b(runnable));
        newThread.setName(this.f5266a);
        return newThread;
    }
}

package s9;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f18394a;

    /* renamed from: b */
    public final /* synthetic */ boolean f18395b;

    public /* synthetic */ d(String str, boolean z10) {
        this.f18394a = str;
        this.f18395b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f18394a;
        boolean z10 = this.f18395b;
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }
}

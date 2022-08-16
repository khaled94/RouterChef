package m4;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class r90 implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f13199a = new AtomicInteger(1);

    /* renamed from: b */
    public final /* synthetic */ String f13200b;

    public r90(String str) {
        this.f13200b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f13200b;
        int andIncrement = this.f13199a.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}

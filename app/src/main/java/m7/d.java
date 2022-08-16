package m7;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements ThreadFactory {

    /* renamed from: a */
    public static final /* synthetic */ d f16379a = new d();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = g.f16383f;
        return new Thread(runnable, "heartbeat-information-executor");
    }
}

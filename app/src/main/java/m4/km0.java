package m4;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class km0 {

    /* renamed from: a */
    public final Executor f10484a;

    /* renamed from: b */
    public final ScheduledExecutorService f10485b;

    /* renamed from: c */
    public final tz1<hm0> f10486c;

    /* renamed from: d */
    public volatile boolean f10487d = true;

    public km0(Executor executor, ScheduledExecutorService scheduledExecutorService, tz1<hm0> tz1Var) {
        this.f10484a = executor;
        this.f10485b = scheduledExecutorService;
        this.f10486c = tz1Var;
    }
}

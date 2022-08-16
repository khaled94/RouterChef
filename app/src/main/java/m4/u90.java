package m4;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u90 {

    /* renamed from: a */
    public static final t90 f14294a;

    /* renamed from: b */
    public static final t90 f14295b;

    /* renamed from: c */
    public static final t90 f14296c;

    /* renamed from: d */
    public static final q90 f14297d = new q90(new r90("Schedule"));

    /* renamed from: e */
    public static final t90 f14298e = new t90(new s90());

    /* renamed from: f */
    public static final t90 f14299f = new t90(dz1.f7671s);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f14294a = new t90(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, timeUnit, new SynchronousQueue(), new r90("Default")));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new r90("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14295b = new t90(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new r90("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f14296c = new t90(threadPoolExecutor2);
    }
}

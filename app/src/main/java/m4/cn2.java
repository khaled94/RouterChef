package m4;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class cn2 {

    /* renamed from: d */
    public static final xm2 f7078d = new xm2(2, -9223372036854775807L);

    /* renamed from: e */
    public static final xm2 f7079e = new xm2(3, -9223372036854775807L);

    /* renamed from: a */
    public final ExecutorService f7080a = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: m4.vr1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ExoPlayer:Loader:ProgressiveMediaPeriod");
        }
    });

    /* renamed from: b */
    public ym2<? extends lk2> f7081b;

    /* renamed from: c */
    public IOException f7082c;

    public cn2() {
        int i10 = ls1.f10971a;
    }

    public final boolean a() {
        return this.f7081b != null;
    }
}

package m4;

import d.a;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import t3.b0;

/* loaded from: classes.dex */
public final class ij1 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9672a;

    /* renamed from: b */
    public final Object f9673b;

    public /* synthetic */ ij1(Object obj, int i10) {
        this.f9672a = i10;
        this.f9673b = obj;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f9672a) {
            case 0:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new hj1(t90Var);
            case 1:
                ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) ((vd2) this.f9673b).a()));
                a.d(unconfigurableScheduledExecutorService);
                return unconfigurableScheduledExecutorService;
            default:
                String lowerCase = ((b0) this.f9673b).f18579a.toLowerCase(Locale.ROOT);
                a.d(lowerCase);
                return lowerCase;
        }
    }
}

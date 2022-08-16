package m4;

import d.a;
import d.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class fo1 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f8613a;

    public /* synthetic */ fo1(int i10) {
        this.f8613a = i10;
    }

    @Override // m4.vd2
    public final Object a() {
        uz1 uz1Var;
        switch (this.f8613a) {
            case 0:
                ExecutorService m10 = c.f3669w.m(Executors.defaultThreadFactory());
                if (m10 instanceof uz1) {
                    uz1Var = (uz1) m10;
                } else {
                    uz1Var = m10 instanceof ScheduledExecutorService ? new zz1((ScheduledExecutorService) m10) : new wz1(m10);
                }
                a.d(uz1Var);
                return uz1Var;
            default:
                return zj.BANNER;
        }
    }
}

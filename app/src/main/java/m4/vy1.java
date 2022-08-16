package m4;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public abstract class vy1<OutputT> extends iy1<OutputT> {
    public static final x50 B;
    public static final Logger C = Logger.getLogger(vy1.class.getName());
    public volatile int A;
    @CheckForNull

    /* renamed from: z */
    public volatile Set<Throwable> f14797z = null;

    static {
        Throwable th;
        x50 x50Var;
        try {
            x50Var = new ty1(AtomicReferenceFieldUpdater.newUpdater(vy1.class, Set.class, "z"), AtomicIntegerFieldUpdater.newUpdater(vy1.class, "A"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            x50Var = new uy1();
        }
        Throwable th3 = th;
        B = x50Var;
        if (th3 != null) {
            C.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public vy1(int i10) {
        this.A = i10;
    }
}

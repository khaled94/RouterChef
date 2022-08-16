package m4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dz1 extends Enum<dz1> implements Executor {

    /* renamed from: s */
    public static final dz1 f7671s;

    /* renamed from: t */
    public static final /* synthetic */ dz1[] f7672t;

    static {
        dz1 dz1Var = new dz1();
        f7671s = dz1Var;
        f7672t = new dz1[]{dz1Var};
    }

    public static dz1[] values() {
        return (dz1[]) f7672t.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}

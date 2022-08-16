package e2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b extends Enum<b> implements Executor {

    /* renamed from: s */
    public static final b f4404s;

    /* renamed from: t */
    public static final /* synthetic */ b[] f4405t;

    static {
        b bVar = new b();
        f4404s = bVar;
        f4405t = new b[]{bVar};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4405t.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}

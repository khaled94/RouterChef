package m4;

import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class dy1 {

    /* renamed from: d */
    public static final dy1 f7666d = new dy1();
    @CheckForNull

    /* renamed from: a */
    public final Runnable f7667a;
    @CheckForNull

    /* renamed from: b */
    public final Executor f7668b;
    @CheckForNull

    /* renamed from: c */
    public dy1 f7669c;

    public dy1() {
        this.f7667a = null;
        this.f7668b = null;
    }

    public dy1(Runnable runnable, Executor executor) {
        this.f7667a = runnable;
        this.f7668b = executor;
    }
}

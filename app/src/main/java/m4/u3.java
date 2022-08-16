package m4;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u3 implements Executor {

    /* renamed from: s */
    public final /* synthetic */ Handler f14243s;

    public u3(Handler handler) {
        this.f14243s = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f14243s.post(runnable);
    }
}

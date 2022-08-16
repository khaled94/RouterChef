package c5;

import android.os.Looper;
import java.util.concurrent.Executor;
import v4.a;

/* loaded from: classes.dex */
public final class a0 implements Executor {

    /* renamed from: s */
    public final a f2768s = new a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2768s.post(runnable);
    }
}

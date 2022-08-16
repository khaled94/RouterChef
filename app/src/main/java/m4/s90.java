package m4;

import android.content.Context;
import android.os.Looper;
import h4.b;
import java.util.concurrent.Executor;
import l3.s;
import n3.h1;
import n3.s1;

/* loaded from: classes.dex */
public final class s90 implements Executor {

    /* renamed from: s */
    public final h1 f13553s = new h1(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f13553s.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            s1 s1Var = s.B.f5789c;
            Context context = s.B.f5793g.f16039e;
            if (context != null) {
                try {
                    if (ut.f14486b.e().booleanValue()) {
                        b.a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }
}

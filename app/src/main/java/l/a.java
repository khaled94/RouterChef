package l;

import android.os.Looper;
import androidx.activity.result.d;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: d */
    public static volatile a f5701d;

    /* renamed from: e */
    public static final ExecutorC0088a f5702e = new ExecutorC0088a();

    /* renamed from: b */
    public b f5703b;

    /* renamed from: c */
    public b f5704c;

    /* renamed from: l.a$a */
    /* loaded from: classes.dex */
    public static class ExecutorC0088a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            a.h().f5703b.f5706c.execute(runnable);
        }
    }

    public a() {
        b bVar = new b();
        this.f5704c = bVar;
        this.f5703b = bVar;
    }

    public static a h() {
        if (f5701d != null) {
            return f5701d;
        }
        synchronized (a.class) {
            if (f5701d == null) {
                f5701d = new a();
            }
        }
        return f5701d;
    }

    public final boolean i() {
        Objects.requireNonNull(this.f5703b);
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void j(Runnable runnable) {
        b bVar = this.f5703b;
        if (bVar.f5707d == null) {
            synchronized (bVar.f5705b) {
                if (bVar.f5707d == null) {
                    bVar.f5707d = b.h(Looper.getMainLooper());
                }
            }
        }
        bVar.f5707d.post(runnable);
    }
}

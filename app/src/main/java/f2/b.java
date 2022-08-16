package f2;

import android.os.Handler;
import android.os.Looper;
import d2.j;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b implements f2.a {

    /* renamed from: a */
    public final j f4477a;

    /* renamed from: b */
    public final Handler f4478b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final a f4479c = new a();

    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
            b.this = r1;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            b.this.f4478b.post(runnable);
        }
    }

    public b(Executor executor) {
        this.f4477a = new j(executor);
    }

    public final void a(Runnable runnable) {
        this.f4477a.execute(runnable);
    }
}

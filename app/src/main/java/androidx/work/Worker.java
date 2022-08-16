package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import e2.c;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: x */
    public c<ListenableWorker.a> f2281x;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            Worker.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Worker.this.f2281x.k(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f2281x.l(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final g6.a<ListenableWorker.a> startWork() {
        this.f2281x = new c<>();
        getBackgroundExecutor().execute(new a());
        return this.f2281x;
    }
}

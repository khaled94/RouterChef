package t8;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s.h;
import t8.e0;

/* loaded from: classes.dex */
public final class v extends ThreadPoolExecutor {

    /* loaded from: classes.dex */
    public static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: s */
        public final c f18829s;

        public a(c cVar) {
            super(cVar, null);
            this.f18829s = cVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            c cVar = this.f18829s;
            int i10 = cVar.K;
            c cVar2 = aVar.f18829s;
            int i11 = cVar2.K;
            return i10 == i11 ? cVar.f18743s - cVar2.f18743s : h.b(i11) - h.b(i10);
        }
    }

    public v() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new e0.b());
    }

    public final void a(int i10) {
        setCorePoolSize(i10);
        setMaximumPoolSize(i10);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}

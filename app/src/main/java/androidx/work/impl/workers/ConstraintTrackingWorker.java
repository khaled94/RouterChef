package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import c2.p;
import c2.r;
import java.util.Collections;
import java.util.List;
import t1.h;
import u1.k;
import y1.c;
import y1.d;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {
    public static final String C = h.e("ConstraintTrkngWrkr");
    public ListenableWorker B;

    /* renamed from: x */
    public WorkerParameters f2390x;
    public final Object y = new Object();

    /* renamed from: z */
    public volatile boolean f2391z = false;
    public e2.c<ListenableWorker.a> A = new e2.c<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            ConstraintTrackingWorker.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            String b10 = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (TextUtils.isEmpty(b10)) {
                h.c().b(ConstraintTrackingWorker.C, "No worker to delegate to.", new Throwable[0]);
            } else {
                ListenableWorker a10 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), b10, constraintTrackingWorker.f2390x);
                constraintTrackingWorker.B = a10;
                if (a10 == null) {
                    h.c().a(ConstraintTrackingWorker.C, "No worker to delegate to.", new Throwable[0]);
                } else {
                    p i10 = ((r) k.c(constraintTrackingWorker.getApplicationContext()).f19025c.v()).i(constraintTrackingWorker.getId().toString());
                    if (i10 != null) {
                        d dVar = new d(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                        dVar.b(Collections.singletonList(i10));
                        if (!dVar.a(constraintTrackingWorker.getId().toString())) {
                            h.c().a(ConstraintTrackingWorker.C, String.format("Constraints not met for delegate %s. Requesting retry.", b10), new Throwable[0]);
                            constraintTrackingWorker.b();
                            return;
                        }
                        h.c().a(ConstraintTrackingWorker.C, String.format("Constraints met for delegate %s", b10), new Throwable[0]);
                        try {
                            g6.a<ListenableWorker.a> startWork = constraintTrackingWorker.B.startWork();
                            ((e2.a) startWork).c(new g2.a(constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
                            return;
                        } catch (Throwable th) {
                            h c10 = h.c();
                            String str = ConstraintTrackingWorker.C;
                            c10.a(str, String.format("Delegated worker %s threw exception in startWork.", b10), th);
                            synchronized (constraintTrackingWorker.y) {
                                if (constraintTrackingWorker.f2391z) {
                                    h.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                                    constraintTrackingWorker.b();
                                } else {
                                    constraintTrackingWorker.a();
                                }
                                return;
                            }
                        }
                    }
                }
            }
            constraintTrackingWorker.a();
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2390x = workerParameters;
    }

    public final void a() {
        this.A.k(new ListenableWorker.a.C0026a());
    }

    public final void b() {
        this.A.k(new ListenableWorker.a.b());
    }

    @Override // y1.c
    public final void c(List<String> list) {
        h.c().a(C, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.y) {
            this.f2391z = true;
        }
    }

    @Override // y1.c
    public final void d(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public final f2.a getTaskExecutor() {
        return k.c(getApplicationContext()).f19026d;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.B;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.B;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.B.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final g6.a<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.A;
    }
}

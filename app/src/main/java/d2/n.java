package d2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import c2.p;
import e2.c;
import t1.d;
import t1.e;
import t1.h;

/* loaded from: classes.dex */
public final class n implements Runnable {
    public static final String y = h.e("WorkForegroundRunnable");

    /* renamed from: s */
    public final c<Void> f3764s = new c<>();

    /* renamed from: t */
    public final Context f3765t;

    /* renamed from: u */
    public final p f3766u;

    /* renamed from: v */
    public final ListenableWorker f3767v;

    /* renamed from: w */
    public final e f3768w;

    /* renamed from: x */
    public final f2.a f3769x;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ c f3770s;

        public a(c cVar) {
            n.this = r1;
            this.f3770s = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3770s.m(n.this.f3767v.getForegroundInfoAsync());
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ c f3772s;

        public b(c cVar) {
            n.this = r1;
            this.f3772s = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                d dVar = (d) this.f3772s.get();
                if (dVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", n.this.f3766u.f2637c));
                }
                h.c().a(n.y, String.format("Updating notification for %s", n.this.f3766u.f2637c), new Throwable[0]);
                n.this.f3767v.setRunInForeground(true);
                n nVar = n.this;
                nVar.f3764s.m(((o) nVar.f3768w).a(nVar.f3765t, nVar.f3767v.getId(), dVar));
            } catch (Throwable th) {
                n.this.f3764s.l(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public n(Context context, p pVar, ListenableWorker listenableWorker, e eVar, f2.a aVar) {
        this.f3765t = context;
        this.f3766u = pVar;
        this.f3767v = listenableWorker;
        this.f3768w = eVar;
        this.f3769x = aVar;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.f3766u.f2650q || i0.a.a()) {
            this.f3764s.k(null);
            return;
        }
        c cVar = new c();
        ((f2.b) this.f3769x).f4479c.execute(new a(cVar));
        cVar.c(new b(cVar), ((f2.b) this.f3769x).f4479c);
    }
}

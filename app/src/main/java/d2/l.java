package d2;

import androidx.work.impl.WorkDatabase;
import c2.q;
import c2.r;
import t1.h;
import t1.n;
import u1.d;
import u1.k;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: v */
    public static final String f3758v = h.e("StopWorkRunnable");

    /* renamed from: s */
    public final k f3759s;

    /* renamed from: t */
    public final String f3760t;

    /* renamed from: u */
    public final boolean f3761u;

    public l(k kVar, String str, boolean z10) {
        this.f3759s = kVar;
        this.f3760t = str;
        this.f3761u = z10;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean z10;
        k kVar = this.f3759s;
        WorkDatabase workDatabase = kVar.f19025c;
        d dVar = kVar.f19028f;
        q v10 = workDatabase.v();
        workDatabase.c();
        try {
            String str = this.f3760t;
            synchronized (dVar.C) {
                containsKey = dVar.f19001x.containsKey(str);
            }
            if (this.f3761u) {
                z10 = this.f3759s.f19028f.i(this.f3760t);
            } else {
                if (!containsKey) {
                    r rVar = (r) v10;
                    if (rVar.f(this.f3760t) == n.RUNNING) {
                        rVar.p(n.ENQUEUED, this.f3760t);
                    }
                }
                z10 = this.f3759s.f19028f.j(this.f3760t);
            }
            h.c().a(f3758v, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f3760t, Boolean.valueOf(z10)), new Throwable[0]);
            workDatabase.o();
        } finally {
            workDatabase.k();
        }
    }
}

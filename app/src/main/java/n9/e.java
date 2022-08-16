package n9;

import k9.q;
import k9.w;
import k9.x;
import x8.f;

/* loaded from: classes.dex */
public final class e extends q implements Runnable, x {
    private volatile int runningWorkers;

    /* renamed from: t */
    public final q f16692t;

    /* renamed from: u */
    public final int f16693u;

    /* renamed from: v */
    public final /* synthetic */ x f16694v;

    /* renamed from: w */
    public final i<Runnable> f16695w;

    /* renamed from: x */
    public final Object f16696x;

    public e(q qVar, int i10) {
        this.f16692t = qVar;
        this.f16693u = i10;
        x xVar = qVar instanceof x ? (x) qVar : null;
        this.f16694v = xVar == null ? w.f5696a : xVar;
        this.f16695w = new i<>();
        this.f16696x = new Object();
    }

    @Override // k9.q
    public final void m0(f fVar, Runnable runnable) {
        this.f16695w.a(runnable);
        boolean z10 = true;
        if (this.runningWorkers >= this.f16693u) {
            return;
        }
        synchronized (this.f16696x) {
            if (this.runningWorkers >= this.f16693u) {
                z10 = false;
            } else {
                this.runningWorkers++;
            }
        }
        if (!z10) {
            return;
        }
        this.f16692t.m0(this, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r0 = r3.f16696x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        r3.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r3.f16695w.c() != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        r3.runningWorkers++;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            n9.i<java.lang.Runnable> r1 = r3.f16695w
            java.lang.Object r1 = r1.d()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L29
            r1.run()     // Catch: java.lang.Throwable -> Lf
            goto L15
        Lf:
            r1 = move-exception
            x8.g r2 = x8.g.f20104s
            d.a.a(r2, r1)
        L15:
            int r0 = r0 + 1
            r1 = 16
            if (r0 < r1) goto L1
            k9.q r1 = r3.f16692t
            boolean r1 = r1.n0()
            if (r1 == 0) goto L1
            k9.q r0 = r3.f16692t
            r0.m0(r3, r3)
            return
        L29:
            java.lang.Object r0 = r3.f16696x
            monitor-enter(r0)
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L44
            int r1 = r1 + (-1)
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L44
            n9.i<java.lang.Runnable> r1 = r3.f16695w     // Catch: java.lang.Throwable -> L44
            int r1 = r1.c()     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L3c
            monitor-exit(r0)
            return
        L3c:
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L44
            int r1 = r1 + 1
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)
            goto L0
        L44:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e.run():void");
    }
}

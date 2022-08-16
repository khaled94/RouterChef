package d2;

import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import c2.p;
import java.util.HashSet;
import java.util.Objects;
import t1.b;
import t1.h;
import t1.k;
import u1.c;
import u1.f;
import u1.g;
import u1.k;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: u */
    public static final String f3742u = h.e("EnqueueRunnable");

    /* renamed from: s */
    public final g f3743s;

    /* renamed from: t */
    public final c f3744t = new c();

    public e(g gVar) {
        this.f3743s = gVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0191  */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(u1.g r24) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.e.a(u1.g):boolean");
    }

    public static void b(p pVar) {
        b bVar = pVar.f2644j;
        String str = pVar.f2637c;
        if (!str.equals(ConstraintTrackingWorker.class.getName())) {
            if (!bVar.f18455d && !bVar.f18456e) {
                return;
            }
            b.a aVar = new b.a();
            aVar.b(pVar.f2639e.f2306a);
            aVar.c(str);
            pVar.f2637c = ConstraintTrackingWorker.class.getName();
            pVar.f2639e = aVar.a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            g gVar = this.f3743s;
            Objects.requireNonNull(gVar);
            if (!g.c(gVar, new HashSet())) {
                WorkDatabase workDatabase = this.f3743s.f19008a.f19025c;
                workDatabase.c();
                boolean a10 = a(this.f3743s);
                workDatabase.o();
                workDatabase.k();
                if (a10) {
                    g.a(this.f3743s.f19008a.f19023a, RescheduleReceiver.class, true);
                    k kVar = this.f3743s.f19008a;
                    f.a(kVar.f19024b, kVar.f19025c, kVar.f19027e);
                }
                this.f3744t.a(t1.k.f18477a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f3743s));
        } catch (Throwable th) {
            this.f3744t.a(new k.a.C0116a(th));
        }
    }
}

package b2;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.a;
import c2.p;
import c2.r;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ WorkDatabase f2476s;

    /* renamed from: t */
    public final /* synthetic */ String f2477t;

    /* renamed from: u */
    public final /* synthetic */ a f2478u;

    public b(a aVar, WorkDatabase workDatabase, String str) {
        this.f2478u = aVar;
        this.f2476s = workDatabase;
        this.f2477t = str;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, c2.p>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashSet, java.util.Set<c2.p>] */
    @Override // java.lang.Runnable
    public final void run() {
        p i10 = ((r) this.f2476s.v()).i(this.f2477t);
        if (i10 == null || !i10.b()) {
            return;
        }
        synchronized (this.f2478u.f2380v) {
            this.f2478u.y.put(this.f2477t, i10);
            this.f2478u.f2383z.add(i10);
            a aVar = this.f2478u;
            aVar.A.b(aVar.f2383z);
        }
    }
}

package d2;

import androidx.work.b;
import c2.m;
import c2.o;
import c2.r;
import e2.c;
import java.util.UUID;
import t1.h;
import t1.n;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ UUID f3782s;

    /* renamed from: t */
    public final /* synthetic */ b f3783t;

    /* renamed from: u */
    public final /* synthetic */ c f3784u;

    /* renamed from: v */
    public final /* synthetic */ q f3785v;

    public p(q qVar, UUID uuid, b bVar, c cVar) {
        this.f3785v = qVar;
        this.f3782s = uuid;
        this.f3783t = bVar;
        this.f3784u = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c2.p i10;
        String uuid = this.f3782s.toString();
        h c10 = h.c();
        String str = q.f3786c;
        c10.a(str, String.format("Updating progress for %s (%s)", this.f3782s, this.f3783t), new Throwable[0]);
        this.f3785v.f3787a.c();
        try {
            i10 = ((r) this.f3785v.f3787a.v()).i(uuid);
        } finally {
            try {
                return;
            } finally {
            }
        }
        if (i10 != null) {
            if (i10.f2636b == n.RUNNING) {
                m mVar = new m(uuid, this.f3783t);
                o oVar = (o) this.f3785v.f3787a.u();
                oVar.f2631a.b();
                oVar.f2631a.c();
                oVar.f2632b.f(mVar);
                oVar.f2631a.o();
                oVar.f2631a.k();
            } else {
                h.c().f(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
            }
            this.f3784u.k(null);
            this.f3785v.f3787a.o();
            return;
        }
        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
    }
}

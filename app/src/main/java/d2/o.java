package d2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import c2.q;
import c2.r;
import e2.a;
import e2.c;
import f2.b;
import java.util.UUID;
import t1.d;
import t1.e;
import t1.h;
import t1.n;

/* loaded from: classes.dex */
public final class o implements e {

    /* renamed from: a */
    public final f2.a f3774a;

    /* renamed from: b */
    public final b2.a f3775b;

    /* renamed from: c */
    public final q f3776c;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ c f3777s;

        /* renamed from: t */
        public final /* synthetic */ UUID f3778t;

        /* renamed from: u */
        public final /* synthetic */ d f3779u;

        /* renamed from: v */
        public final /* synthetic */ Context f3780v;

        public a(c cVar, UUID uuid, d dVar, Context context) {
            o.this = r1;
            this.f3777s = cVar;
            this.f3778t = uuid;
            this.f3779u = dVar;
            this.f3780v = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!(this.f3777s.f4381s instanceof a.b)) {
                    String uuid = this.f3778t.toString();
                    n f10 = ((r) o.this.f3776c).f(uuid);
                    if (f10 == null || f10.b()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    ((u1.d) o.this.f3775b).f(uuid, this.f3779u);
                    this.f3780v.startService(androidx.work.impl.foreground.a.b(this.f3780v, uuid, this.f3779u));
                }
                this.f3777s.k(null);
            } catch (Throwable th) {
                this.f3777s.l(th);
            }
        }
    }

    static {
        h.e("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, b2.a aVar, f2.a aVar2) {
        this.f3775b = aVar;
        this.f3774a = aVar2;
        this.f3776c = workDatabase.v();
    }

    public final g6.a<Void> a(Context context, UUID uuid, d dVar) {
        c cVar = new c();
        ((b) this.f3774a).a(new a(cVar, uuid, dVar, context));
        return cVar;
    }
}

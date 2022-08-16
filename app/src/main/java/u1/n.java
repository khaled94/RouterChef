package u1;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import c2.b;
import c2.o;
import c2.p;
import c2.q;
import c2.r;
import c2.t;
import d2.g;
import e2.c;
import g1.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import t1.h;

/* loaded from: classes.dex */
public final class n implements Runnable {
    public static final String L = h.e("WorkerWrapper");
    public androidx.work.a A;
    public b2.a B;
    public WorkDatabase C;
    public q D;
    public b E;
    public t F;
    public List<String> G;
    public String H;
    public volatile boolean K;

    /* renamed from: s */
    public Context f19038s;

    /* renamed from: t */
    public String f19039t;

    /* renamed from: u */
    public List<e> f19040u;

    /* renamed from: v */
    public WorkerParameters.a f19041v;

    /* renamed from: w */
    public p f19042w;
    public f2.a y;

    /* renamed from: z */
    public ListenableWorker.a f19044z = new ListenableWorker.a.C0026a();
    public c<Boolean> I = new c<>();
    public g6.a<ListenableWorker.a> J = null;

    /* renamed from: x */
    public ListenableWorker f19043x = null;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public Context f19045a;

        /* renamed from: b */
        public b2.a f19046b;

        /* renamed from: c */
        public f2.a f19047c;

        /* renamed from: d */
        public androidx.work.a f19048d;

        /* renamed from: e */
        public WorkDatabase f19049e;

        /* renamed from: f */
        public String f19050f;

        /* renamed from: g */
        public List<e> f19051g;

        /* renamed from: h */
        public WorkerParameters.a f19052h = new WorkerParameters.a();

        public a(Context context, androidx.work.a aVar, f2.a aVar2, b2.a aVar3, WorkDatabase workDatabase, String str) {
            this.f19045a = context.getApplicationContext();
            this.f19047c = aVar2;
            this.f19046b = aVar3;
            this.f19048d = aVar;
            this.f19049e = workDatabase;
            this.f19050f = str;
        }
    }

    public n(a aVar) {
        this.f19038s = aVar.f19045a;
        this.y = aVar.f19047c;
        this.B = aVar.f19046b;
        this.f19039t = aVar.f19050f;
        this.f19040u = aVar.f19051g;
        this.f19041v = aVar.f19052h;
        this.A = aVar.f19048d;
        WorkDatabase workDatabase = aVar.f19049e;
        this.C = workDatabase;
        this.D = workDatabase.v();
        this.E = this.C.q();
        this.F = this.C.w();
    }

    public final void a(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            h.c().d(L, String.format("Worker result SUCCESS for %s", this.H), new Throwable[0]);
            if (!this.f19042w.c()) {
                this.C.c();
                try {
                    ((r) this.D).p(t1.n.SUCCEEDED, this.f19039t);
                    ((r) this.D).n(this.f19039t, ((ListenableWorker.a.c) this.f19044z).f2279a);
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = ((ArrayList) ((c2.c) this.E).a(this.f19039t)).iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (((r) this.D).f(str) == t1.n.BLOCKED && ((c2.c) this.E).b(str)) {
                            h.c().d(L, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                            ((r) this.D).p(t1.n.ENQUEUED, str);
                            ((r) this.D).o(str, currentTimeMillis);
                        }
                    }
                    this.C.o();
                    return;
                } finally {
                    this.C.k();
                    f(false);
                }
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            h.c().d(L, String.format("Worker result RETRY for %s", this.H), new Throwable[0]);
            d();
            return;
        } else {
            h.c().d(L, String.format("Worker result FAILURE for %s", this.H), new Throwable[0]);
            if (!this.f19042w.c()) {
                h();
                return;
            }
        }
        e();
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((r) this.D).f(str2) != t1.n.CANCELLED) {
                ((r) this.D).p(t1.n.FAILED, str2);
            }
            linkedList.addAll(((c2.c) this.E).a(str2));
        }
    }

    public final void c() {
        if (!i()) {
            this.C.c();
            try {
                t1.n f10 = ((r) this.D).f(this.f19039t);
                ((o) this.C.u()).a(this.f19039t);
                if (f10 == null) {
                    f(false);
                } else if (f10 == t1.n.RUNNING) {
                    a(this.f19044z);
                } else if (!f10.b()) {
                    d();
                }
                this.C.o();
            } finally {
                this.C.k();
            }
        }
        List<e> list = this.f19040u;
        if (list != null) {
            for (e eVar : list) {
                eVar.b(this.f19039t);
            }
            f.a(this.A, this.C, this.f19040u);
        }
    }

    public final void d() {
        this.C.c();
        try {
            ((r) this.D).p(t1.n.ENQUEUED, this.f19039t);
            ((r) this.D).o(this.f19039t, System.currentTimeMillis());
            ((r) this.D).l(this.f19039t, -1L);
            this.C.o();
        } finally {
            this.C.k();
            f(true);
        }
    }

    public final void e() {
        this.C.c();
        try {
            ((r) this.D).o(this.f19039t, System.currentTimeMillis());
            ((r) this.D).p(t1.n.ENQUEUED, this.f19039t);
            ((r) this.D).m(this.f19039t);
            ((r) this.D).l(this.f19039t, -1L);
            this.C.o();
        } finally {
            this.C.k();
            f(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    public final void f(boolean z10) {
        ListenableWorker listenableWorker;
        this.C.c();
        try {
            r rVar = (r) this.C.v();
            Objects.requireNonNull(rVar);
            b0 j3 = b0.j("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            rVar.f2654a.b();
            Cursor n10 = rVar.f2654a.n(j3);
            boolean z11 = n10.moveToFirst() && n10.getInt(0) != 0;
            n10.close();
            j3.G();
            if (!z11) {
                g.a(this.f19038s, RescheduleReceiver.class, false);
            }
            if (z10) {
                ((r) this.D).p(t1.n.ENQUEUED, this.f19039t);
                ((r) this.D).l(this.f19039t, -1L);
            }
            if (this.f19042w != null && (listenableWorker = this.f19043x) != null && listenableWorker.isRunInForeground()) {
                b2.a aVar = this.B;
                String str = this.f19039t;
                d dVar = (d) aVar;
                synchronized (dVar.C) {
                    dVar.f19001x.remove(str);
                    dVar.h();
                }
            }
            this.C.o();
            this.C.k();
            this.I.k(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.C.k();
            throw th;
        }
    }

    public final void g() {
        t1.n f10 = ((r) this.D).f(this.f19039t);
        if (f10 == t1.n.RUNNING) {
            h.c().a(L, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f19039t), new Throwable[0]);
            f(true);
            return;
        }
        h.c().a(L, String.format("Status for %s is %s; not doing any work", this.f19039t, f10), new Throwable[0]);
        f(false);
    }

    public final void h() {
        this.C.c();
        try {
            b(this.f19039t);
            androidx.work.b bVar = ((ListenableWorker.a.C0026a) this.f19044z).f2278a;
            ((r) this.D).n(this.f19039t, bVar);
            this.C.o();
        } finally {
            this.C.k();
            f(false);
        }
    }

    public final boolean i() {
        if (this.K) {
            h.c().a(L, String.format("Work interrupted for %s", this.H), new Throwable[0]);
            t1.n f10 = ((r) this.D).f(this.f19039t);
            if (f10 == null) {
                f(false);
            } else {
                f(!f10.b());
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bc, code lost:
        if ((r1.f2636b == r0 && r1.f2645k > 0) != false) goto L28;
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.n.run():void");
    }
}

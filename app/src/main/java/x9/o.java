package x9;

import ca.x;
import ca.y;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import r9.a0;
import r9.c0;
import r9.g0;
import r9.u;
import r9.w;
import r9.z;
import s9.a;
import s9.e;
import v9.c;
import v9.f;
import v9.h;
import v9.j;
import x9.q;

/* loaded from: classes.dex */
public final class o implements c {

    /* renamed from: g */
    public static final List<String> f20182g = e.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List<String> f20183h = e.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final w.a f20184a;

    /* renamed from: b */
    public final u9.e f20185b;

    /* renamed from: c */
    public final f f20186c;

    /* renamed from: d */
    public volatile q f20187d;

    /* renamed from: e */
    public final a0 f20188e;

    /* renamed from: f */
    public volatile boolean f20189f;

    public o(z zVar, u9.e eVar, w.a aVar, f fVar) {
        this.f20185b = eVar;
        this.f20184a = aVar;
        this.f20186c = fVar;
        List<a0> list = zVar.f17512t;
        a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
        this.f20188e = !list.contains(a0Var) ? a0.HTTP_2 : a0Var;
    }

    @Override // v9.c
    public final long a(g0 g0Var) {
        return v9.e.a(g0Var);
    }

    @Override // v9.c
    public final y b(g0 g0Var) {
        return this.f20187d.f20207g;
    }

    @Override // v9.c
    public final void c() {
        ((q.a) this.f20187d.f()).close();
    }

    @Override // v9.c
    public final void cancel() {
        this.f20189f = true;
        if (this.f20187d != null) {
            this.f20187d.e(6);
        }
    }

    @Override // v9.c
    public final void d() {
        this.f20186c.flush();
    }

    @Override // v9.c
    public final void e(c0 c0Var) {
        int i10;
        q qVar;
        if (this.f20187d != null) {
            return;
        }
        boolean z10 = false;
        boolean z11 = c0Var.f17314d != null;
        u uVar = c0Var.f17313c;
        ArrayList arrayList = new ArrayList((uVar.f17472a.length / 2) + 4);
        arrayList.add(new b(b.f20107f, c0Var.f17312b));
        arrayList.add(new b(b.f20108g, h.a(c0Var.f17311a)));
        String b10 = c0Var.b("Host");
        if (b10 != null) {
            arrayList.add(new b(b.f20110i, b10));
        }
        arrayList.add(new b(b.f20109h, c0Var.f17311a.f17475a));
        int length = uVar.f17472a.length / 2;
        for (int i11 = 0; i11 < length; i11++) {
            String lowerCase = uVar.d(i11).toLowerCase(Locale.US);
            if (!f20182g.contains(lowerCase) || (lowerCase.equals("te") && uVar.g(i11).equals("trailers"))) {
                arrayList.add(new b(lowerCase, uVar.g(i11)));
            }
        }
        f fVar = this.f20186c;
        boolean z12 = !z11;
        synchronized (fVar.M) {
            synchronized (fVar) {
                if (fVar.f20144x > 1073741823) {
                    fVar.Y(5);
                }
                if (fVar.y) {
                    throw new a();
                }
                i10 = fVar.f20144x;
                fVar.f20144x = i10 + 2;
                qVar = new q(i10, fVar, z12, false, null);
                if (!z11 || fVar.I == 0 || qVar.f20202b == 0) {
                    z10 = true;
                }
                if (qVar.h()) {
                    fVar.f20141u.put(Integer.valueOf(i10), qVar);
                }
            }
            fVar.M.H(z12, i10, arrayList);
        }
        if (z10) {
            fVar.M.flush();
        }
        this.f20187d = qVar;
        if (this.f20189f) {
            this.f20187d.e(6);
            throw new IOException("Canceled");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f20187d.f20209i.g(((f) this.f20184a).f19849h);
        this.f20187d.f20210j.g(((f) this.f20184a).f19850i);
    }

    @Override // v9.c
    public final x f(c0 c0Var, long j3) {
        return this.f20187d.f();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayDeque, java.util.Deque<r9.u>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayDeque, java.util.Deque<r9.u>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayDeque, java.util.Deque<r9.u>] */
    @Override // v9.c
    public final g0.a g(boolean z10) {
        u uVar;
        q qVar = this.f20187d;
        synchronized (qVar) {
            qVar.f20209i.i();
            while (qVar.f20205e.isEmpty() && qVar.f20211k == 0) {
                qVar.j();
            }
            qVar.f20209i.o();
            if (qVar.f20205e.isEmpty()) {
                IOException iOException = qVar.f20212l;
                if (iOException == null) {
                    throw new v(qVar.f20211k);
                }
                throw iOException;
            }
            uVar = (u) qVar.f20205e.removeFirst();
        }
        a0 a0Var = this.f20188e;
        ArrayList arrayList = new ArrayList(20);
        int length = uVar.f17472a.length / 2;
        j jVar = null;
        for (int i10 = 0; i10 < length; i10++) {
            String d5 = uVar.d(i10);
            String g10 = uVar.g(i10);
            if (d5.equals(":status")) {
                jVar = j.a("HTTP/1.1 " + g10);
            } else if (!f20183h.contains(d5)) {
                Objects.requireNonNull(a.f18391a);
                arrayList.add(d5);
                arrayList.add(g10.trim());
            }
        }
        if (jVar != null) {
            g0.a aVar = new g0.a();
            aVar.f17381b = a0Var;
            aVar.f17382c = jVar.f19857b;
            aVar.f17383d = jVar.f19858c;
            u.a aVar2 = new u.a();
            Collections.addAll(aVar2.f17473a, (String[]) arrayList.toArray(new String[arrayList.size()]));
            aVar.f17385f = aVar2;
            if (z10) {
                Objects.requireNonNull(a.f18391a);
                if (aVar.f17382c == 100) {
                    return null;
                }
            }
            return aVar;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // v9.c
    public final u9.e h() {
        return this.f20185b;
    }
}

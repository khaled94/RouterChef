package u9;

import f8.d0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import r9.a;
import r9.j0;
import r9.z;
import s9.d;
import s9.e;
import u9.i;
import w7.c;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: g */
    public static final ThreadPoolExecutor f19652g;

    /* renamed from: b */
    public final long f19654b;

    /* renamed from: f */
    public boolean f19658f;

    /* renamed from: c */
    public final d0 f19655c = new d0(this, 2);

    /* renamed from: d */
    public final Deque<e> f19656d = new ArrayDeque();

    /* renamed from: e */
    public final c f19657e = new c(1);

    /* renamed from: a */
    public final int f19653a = 5;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = e.f18396a;
        f19652g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new d("OkHttp ConnectionPool", true));
    }

    public f() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f19654b = timeUnit.toNanos(5L);
    }

    public final void a(j0 j0Var, IOException iOException) {
        if (j0Var.f17423b.type() != Proxy.Type.DIRECT) {
            a aVar = j0Var.f17422a;
            aVar.f17289g.connectFailed(aVar.f17283a.r(), j0Var.f17423b.address(), iOException);
        }
        c cVar = this.f19657e;
        synchronized (cVar) {
            cVar.f19936a.add(j0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.ref.Reference<u9.i>>, java.util.List, java.util.ArrayList] */
    public final int b(e eVar, long j3) {
        ?? r02 = eVar.p;
        int i10 = 0;
        while (i10 < r02.size()) {
            Reference reference = (Reference) r02.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                StringBuilder c10 = androidx.activity.result.a.c("A connection to ");
                c10.append(eVar.f19638c.f17422a.f17283a);
                c10.append(" was leaked. Did you forget to close a response body?");
                z9.f.f21089a.o(c10.toString(), ((i.b) reference).f19686a);
                r02.remove(i10);
                eVar.f19646k = true;
                if (r02.isEmpty()) {
                    eVar.f19651q = j3 - this.f19654b;
                    return 0;
                }
            }
        }
        return r02.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Deque<u9.e>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<java.lang.ref.Reference<u9.i>>, java.util.ArrayList] */
    public final boolean c(a aVar, i iVar, @Nullable List<j0> list, boolean z10) {
        boolean z11;
        Iterator it = this.f19656d.iterator();
        while (true) {
            boolean z12 = false;
            if (it.hasNext()) {
                e eVar = (e) it.next();
                if (!z10 || eVar.g()) {
                    if (eVar.p.size() < eVar.f19650o && !eVar.f19646k) {
                        z.a aVar2 = s9.a.f18391a;
                        a aVar3 = eVar.f19638c.f17422a;
                        Objects.requireNonNull(aVar2);
                        if (aVar3.a(aVar)) {
                            if (!aVar.f17283a.f17478d.equals(eVar.f19638c.f17422a.f17283a.f17478d)) {
                                if (eVar.f19643h != null && list != null) {
                                    int size = list.size();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= size) {
                                            z11 = false;
                                            break;
                                        }
                                        j0 j0Var = list.get(i10);
                                        if (j0Var.f17423b.type() == Proxy.Type.DIRECT && eVar.f19638c.f17423b.type() == Proxy.Type.DIRECT && eVar.f19638c.f17424c.equals(j0Var.f17424c)) {
                                            z11 = true;
                                            break;
                                        }
                                        i10++;
                                    }
                                    if (z11 && aVar.f17292j == ba.c.f2600a && eVar.k(aVar.f17283a)) {
                                        try {
                                            aVar.f17293k.a(aVar.f17283a.f17478d, eVar.f19641f.f17470c);
                                        } catch (SSLPeerUnverifiedException unused) {
                                        }
                                    }
                                }
                            }
                            z12 = true;
                        }
                    }
                    if (z12) {
                        iVar.a(eVar);
                        return true;
                    }
                }
            } else {
                return false;
            }
        }
    }
}

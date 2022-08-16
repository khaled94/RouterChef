package d2;

import androidx.work.impl.WorkDatabase;
import c2.b;
import c2.q;
import c2.r;
import java.util.LinkedList;
import t1.h;
import t1.k;
import t1.n;
import u1.c;
import u1.e;
import u1.f;
import u1.k;

/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: s */
    public final c f3741s = new c();

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    public final void a(k kVar, String str) {
        boolean z10;
        WorkDatabase workDatabase = kVar.f19025c;
        q v10 = workDatabase.v();
        b q10 = workDatabase.q();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z10 = false;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            r rVar = (r) v10;
            n f10 = rVar.f(str2);
            if (f10 != n.SUCCEEDED && f10 != n.FAILED) {
                rVar.p(n.CANCELLED, str2);
            }
            linkedList.addAll(((c2.c) q10).a(str2));
        }
        u1.d dVar = kVar.f19028f;
        synchronized (dVar.C) {
            h.c().a(u1.d.D, String.format("Processor cancelling %s", str), new Throwable[0]);
            dVar.A.add(str);
            u1.n nVar = (u1.n) dVar.f19001x.remove(str);
            if (nVar != null) {
                z10 = true;
            }
            if (nVar == null) {
                nVar = (u1.n) dVar.y.remove(str);
            }
            u1.d.c(str, nVar);
            if (z10) {
                dVar.h();
            }
        }
        for (e eVar : kVar.f19027e) {
            eVar.b(str);
        }
    }

    public final void b(k kVar) {
        f.a(kVar.f19024b, kVar.f19025c, kVar.f19027e);
    }

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c();
            this.f3741s.a(t1.k.f18477a);
        } catch (Throwable th) {
            this.f3741s.a(new k.a.C0116a(th));
        }
    }
}

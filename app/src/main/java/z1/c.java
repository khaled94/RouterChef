package z1;

import a2.d;
import c2.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t1.h;

/* loaded from: classes.dex */
public abstract class c<T> implements y1.a<T> {

    /* renamed from: a */
    public final List<String> f20896a = new ArrayList();

    /* renamed from: b */
    public T f20897b;

    /* renamed from: c */
    public d<T> f20898c;

    /* renamed from: d */
    public a f20899d;

    /* loaded from: classes.dex */
    public interface a {
    }

    public c(d<T> dVar) {
        this.f20898c = dVar;
    }

    @Override // y1.a
    public final void a(T t10) {
        this.f20897b = t10;
        e(this.f20899d, t10);
    }

    public abstract boolean b(p pVar);

    public abstract boolean c(T t10);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final void d(Iterable<p> iterable) {
        this.f20896a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.f20896a.add(pVar.f2635a);
            }
        }
        if (this.f20896a.isEmpty()) {
            this.f20898c.b(this);
        } else {
            d<T> dVar = this.f20898c;
            synchronized (dVar.f19c) {
                if (dVar.f20d.add(this)) {
                    if (dVar.f20d.size() == 1) {
                        dVar.f21e = dVar.a();
                        h.c().a(d.f16f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f21e), new Throwable[0]);
                        dVar.d();
                    }
                    a(dVar.f21e);
                }
            }
        }
        e(this.f20899d, this.f20897b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final void e(a aVar, T t10) {
        if (this.f20896a.isEmpty() || aVar == null) {
            return;
        }
        if (t10 != null && !c(t10)) {
            ?? r10 = this.f20896a;
            y1.d dVar = (y1.d) aVar;
            synchronized (dVar.f20267c) {
                ArrayList arrayList = new ArrayList();
                Iterator it = r10.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (dVar.a(str)) {
                        h.c().a(y1.d.f20264d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                y1.c cVar = dVar.f20265a;
                if (cVar != null) {
                    cVar.d(arrayList);
                }
            }
            return;
        }
        List<String> list = this.f20896a;
        y1.d dVar2 = (y1.d) aVar;
        synchronized (dVar2.f20267c) {
            y1.c cVar2 = dVar2.f20265a;
            if (cVar2 != null) {
                cVar2.c(list);
            }
        }
    }
}

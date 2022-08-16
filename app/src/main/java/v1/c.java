package v1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.a;
import c2.p;
import d2.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t1.h;
import t1.n;
import u1.b;
import u1.e;
import u1.k;
import y1.d;

/* loaded from: classes.dex */
public final class c implements e, y1.c, b {
    public static final String A = h.e("GreedyScheduler");

    /* renamed from: s */
    public final Context f19776s;

    /* renamed from: t */
    public final k f19777t;

    /* renamed from: u */
    public final d f19778u;

    /* renamed from: w */
    public b f19780w;

    /* renamed from: x */
    public boolean f19781x;

    /* renamed from: z */
    public Boolean f19782z;

    /* renamed from: v */
    public final Set<p> f19779v = new HashSet();
    public final Object y = new Object();

    public c(Context context, a aVar, f2.a aVar2, k kVar) {
        this.f19776s = context;
        this.f19777t = kVar;
        this.f19778u = new d(context, aVar2, this);
        this.f19780w = new b(this, aVar.f2300e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<c2.p>] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.HashSet, java.util.Set<c2.p>] */
    @Override // u1.b
    public final void a(String str, boolean z10) {
        synchronized (this.y) {
            Iterator it = this.f19779v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f2635a.equals(str)) {
                    h.c().a(A, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f19779v.remove(pVar);
                    this.f19778u.b(this.f19779v);
                    break;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<java.lang.String, java.lang.Runnable>, java.util.HashMap] */
    @Override // u1.e
    public final void b(String str) {
        Runnable runnable;
        if (this.f19782z == null) {
            this.f19782z = Boolean.valueOf(i.a(this.f19776s, this.f19777t.f19024b));
        }
        if (!this.f19782z.booleanValue()) {
            h.c().d(A, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f19781x) {
            this.f19777t.f19028f.b(this);
            this.f19781x = true;
        }
        h.c().a(A, String.format("Cancelling work ID %s", str), new Throwable[0]);
        b bVar = this.f19780w;
        if (bVar != null && (runnable = (Runnable) bVar.f19775c.remove(str)) != null) {
            ((Handler) bVar.f19774b.f18993s).removeCallbacks(runnable);
        }
        this.f19777t.g(str);
    }

    @Override // y1.c
    public final void c(List<String> list) {
        for (String str : list) {
            h.c().a(A, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f19777t.g(str);
        }
    }

    @Override // y1.c
    public final void d(List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            h.c().a(A, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            k kVar = this.f19777t;
            ((f2.b) kVar.f19026d).a(new d2.k(kVar, str, null));
        }
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Map<java.lang.String, java.lang.Runnable>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.Map<java.lang.String, java.lang.Runnable>, java.util.HashMap] */
    @Override // u1.e
    public final void e(p... pVarArr) {
        if (this.f19782z == null) {
            this.f19782z = Boolean.valueOf(i.a(this.f19776s, this.f19777t.f19024b));
        }
        if (!this.f19782z.booleanValue()) {
            h.c().d(A, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f19781x) {
            this.f19777t.f19028f.b(this);
            this.f19781x = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a10 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f2636b == n.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    b bVar = this.f19780w;
                    if (bVar != null) {
                        Runnable runnable = (Runnable) bVar.f19775c.remove(pVar.f2635a);
                        if (runnable != null) {
                            ((Handler) bVar.f19774b.f18993s).removeCallbacks(runnable);
                        }
                        a aVar = new a(bVar, pVar);
                        bVar.f19775c.put(pVar.f2635a, aVar);
                        ((Handler) bVar.f19774b.f18993s).postDelayed(aVar, pVar.a() - System.currentTimeMillis());
                    }
                } else if (pVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    t1.b bVar2 = pVar.f2644j;
                    if (bVar2.f18454c) {
                        h.c().a(A, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i10 < 24 || !bVar2.a()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f2635a);
                    } else {
                        h.c().a(A, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    }
                } else {
                    h.c().a(A, String.format("Starting work for %s", pVar.f2635a), new Throwable[0]);
                    k kVar = this.f19777t;
                    ((f2.b) kVar.f19026d).a(new d2.k(kVar, pVar.f2635a, null));
                }
            }
        }
        synchronized (this.y) {
            if (!hashSet.isEmpty()) {
                h.c().a(A, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f19779v.addAll(hashSet);
                this.f19778u.b(this.f19779v);
            }
        }
    }

    @Override // u1.e
    public final boolean f() {
        return false;
    }
}

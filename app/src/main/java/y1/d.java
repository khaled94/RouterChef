package y1;

import android.content.Context;
import c2.p;
import f2.a;
import t1.h;
import z1.b;
import z1.c;
import z1.e;
import z1.f;
import z1.g;

/* loaded from: classes.dex */
public final class d implements c.a {

    /* renamed from: d */
    public static final String f20264d = h.e("WorkConstraintsTracker");

    /* renamed from: a */
    public final c f20265a;

    /* renamed from: b */
    public final c<?>[] f20266b;

    /* renamed from: c */
    public final Object f20267c = new Object();

    public d(Context context, a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f20265a = cVar;
        this.f20266b = new c[]{new z1.a(applicationContext, aVar), new b(applicationContext, aVar), new z1.h(applicationContext, aVar), new z1.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final boolean a(String str) {
        c<?>[] cVarArr;
        synchronized (this.f20267c) {
            for (c<?> cVar : this.f20266b) {
                Object obj = cVar.f20897b;
                if (obj != null && cVar.c(obj) && cVar.f20896a.contains(str)) {
                    h.c().a(f20264d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void b(Iterable<p> iterable) {
        c<?>[] cVarArr;
        c<?>[] cVarArr2;
        synchronized (this.f20267c) {
            for (c<?> cVar : this.f20266b) {
                if (cVar.f20899d != null) {
                    cVar.f20899d = null;
                    cVar.e(null, cVar.f20897b);
                }
            }
            for (c<?> cVar2 : this.f20266b) {
                cVar2.d(iterable);
            }
            for (c<?> cVar3 : this.f20266b) {
                if (cVar3.f20899d != this) {
                    cVar3.f20899d = this;
                    cVar3.e(this, cVar3.f20897b);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final void c() {
        c<?>[] cVarArr;
        synchronized (this.f20267c) {
            for (c<?> cVar : this.f20266b) {
                if (!cVar.f20896a.isEmpty()) {
                    cVar.f20896a.clear();
                    cVar.f20898c.b(cVar);
                }
            }
        }
    }
}

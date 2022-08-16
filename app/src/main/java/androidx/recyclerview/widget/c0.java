package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import l0.e;
import r.d;
import r.g;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a */
    public final g<RecyclerView.a0, a> f2095a = new g<>();

    /* renamed from: b */
    public final d<RecyclerView.a0> f2096b = new d<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        public static e f2097d = new e(20, 0);

        /* renamed from: a */
        public int f2098a;

        /* renamed from: b */
        public RecyclerView.j.c f2099b;

        /* renamed from: c */
        public RecyclerView.j.c f2100c;

        public static a a() {
            a aVar = (a) f2097d.a();
            return aVar == null ? new a() : aVar;
        }

        public static void b(a aVar) {
            aVar.f2098a = 0;
            aVar.f2099b = null;
            aVar.f2100c = null;
            f2097d.b(aVar);
        }
    }

    public final void a(RecyclerView.a0 a0Var) {
        a orDefault = this.f2095a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f2095a.put(a0Var, orDefault);
        }
        orDefault.f2098a |= 1;
    }

    public final void b(RecyclerView.a0 a0Var, RecyclerView.j.c cVar) {
        a orDefault = this.f2095a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f2095a.put(a0Var, orDefault);
        }
        orDefault.f2100c = cVar;
        orDefault.f2098a |= 8;
    }

    public final void c(RecyclerView.a0 a0Var, RecyclerView.j.c cVar) {
        a orDefault = this.f2095a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f2095a.put(a0Var, orDefault);
        }
        orDefault.f2099b = cVar;
        orDefault.f2098a |= 4;
    }

    public final RecyclerView.j.c d(RecyclerView.a0 a0Var, int i10) {
        a k10;
        RecyclerView.j.c cVar;
        int e10 = this.f2095a.e(a0Var);
        if (e10 >= 0 && (k10 = this.f2095a.k(e10)) != null) {
            int i11 = k10.f2098a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                k10.f2098a = i12;
                if (i10 == 4) {
                    cVar = k10.f2099b;
                } else if (i10 != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    cVar = k10.f2100c;
                }
                if ((i12 & 12) == 0) {
                    this.f2095a.i(e10);
                    a.b(k10);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void e(RecyclerView.a0 a0Var) {
        a orDefault = this.f2095a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f2098a &= -2;
    }

    public final void f(RecyclerView.a0 a0Var) {
        int g10 = this.f2096b.g() - 1;
        while (true) {
            if (g10 < 0) {
                break;
            } else if (a0Var == this.f2096b.h(g10)) {
                d<RecyclerView.a0> dVar = this.f2096b;
                Object[] objArr = dVar.f17174u;
                Object obj = objArr[g10];
                Object obj2 = d.f17171w;
                if (obj != obj2) {
                    objArr[g10] = obj2;
                    dVar.f17172s = true;
                }
            } else {
                g10--;
            }
        }
        a remove = this.f2095a.remove(a0Var);
        if (remove != null) {
            a.b(remove);
        }
    }
}

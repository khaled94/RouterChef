package m4;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

/* loaded from: classes.dex */
public final class ye2 {

    /* renamed from: d */
    public final xe2 f15664d;

    /* renamed from: e */
    public final ek2 f15665e;

    /* renamed from: f */
    public final wh2 f15666f;

    /* renamed from: i */
    public boolean f15669i;

    /* renamed from: j */
    public i01 f15670j;

    /* renamed from: k */
    public bl2 f15671k = new bl2(new int[0], new Random());

    /* renamed from: b */
    public final IdentityHashMap<tj2, we2> f15662b = new IdentityHashMap<>();

    /* renamed from: c */
    public final Map<Object, we2> f15663c = new HashMap();

    /* renamed from: a */
    public final List<we2> f15661a = new ArrayList();

    /* renamed from: g */
    public final HashMap<we2, ve2> f15667g = new HashMap<>();

    /* renamed from: h */
    public final Set<we2> f15668h = new HashSet();

    public ye2(xe2 xe2Var, eg2 eg2Var, Handler handler) {
        this.f15664d = xe2Var;
        ek2 ek2Var = new ek2();
        this.f15665e = ek2Var;
        wh2 wh2Var = new wh2();
        this.f15666f = wh2Var;
        ek2Var.f7997c.add(new dk2(handler, eg2Var));
        wh2Var.f15028c.add(new vh2(eg2Var));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    public final int a() {
        return this.f15661a.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    public final z40 b() {
        if (!this.f15661a.isEmpty()) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f15661a.size(); i11++) {
                we2 we2Var = (we2) this.f15661a.get(i11);
                we2Var.f14950d = i10;
                i10 += we2Var.f14947a.f13376n.c();
            }
            return new df2(this.f15661a, this.f15671k);
        }
        return z40.f16002a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashSet, java.util.Set<m4.we2>] */
    public final void c(i01 i01Var) {
        r01.h(!this.f15669i);
        this.f15670j = i01Var;
        for (int i10 = 0; i10 < this.f15661a.size(); i10++) {
            we2 we2Var = (we2) this.f15661a.get(i10);
            n(we2Var);
            this.f15668h.add(we2Var);
        }
        this.f15669i = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<m4.uj2>, java.util.ArrayList] */
    public final void d(tj2 tj2Var) {
        we2 remove = this.f15662b.remove(tj2Var);
        Objects.requireNonNull(remove);
        remove.f14947a.d(tj2Var);
        remove.f14949c.remove(((oj2) tj2Var).f12179s);
        if (!this.f15662b.isEmpty()) {
            l();
        }
        m(remove);
    }

    public final boolean e() {
        return this.f15669i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<m4.uj2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.HashSet, java.util.Set<m4.we2>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map<java.lang.Object, m4.we2>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    public final z40 f(int i10, List<we2> list, bl2 bl2Var) {
        if (!list.isEmpty()) {
            this.f15671k = bl2Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                we2 we2Var = list.get(i11 - i10);
                if (i11 > 0) {
                    we2 we2Var2 = (we2) this.f15661a.get(i11 - 1);
                    pj2 pj2Var = we2Var2.f14947a.f13376n;
                    we2Var.f14950d = pj2Var.c() + we2Var2.f14950d;
                } else {
                    we2Var.f14950d = 0;
                }
                we2Var.f14951e = false;
                we2Var.f14949c.clear();
                k(i11, we2Var.f14947a.f13376n.c());
                this.f15661a.add(i11, we2Var);
                this.f15663c.put(we2Var.f14948b, we2Var);
                if (this.f15669i) {
                    n(we2Var);
                    if (this.f15662b.isEmpty()) {
                        this.f15668h.add(we2Var);
                    } else {
                        ve2 ve2Var = this.f15667g.get(we2Var);
                        if (ve2Var != null) {
                            ve2Var.f14665a.j(ve2Var.f14666b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final z40 g() {
        r01.f(a() >= 0);
        this.f15671k = null;
        return b();
    }

    public final z40 h(int i10, int i11, bl2 bl2Var) {
        r01.f(i10 >= 0 && i10 <= i11 && i11 <= a());
        this.f15671k = bl2Var;
        o(i10, i11);
        return b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    public final z40 i(List<we2> list, bl2 bl2Var) {
        o(0, this.f15661a.size());
        return f(this.f15661a.size(), list, bl2Var);
    }

    public final z40 j(bl2 bl2Var) {
        int a10 = a();
        if (bl2Var.f6566b.length != a10) {
            bl2Var = new bl2(new int[0], new Random(bl2Var.f6565a.nextLong())).a(a10);
        }
        this.f15671k = bl2Var;
        return b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    public final void k(int i10, int i11) {
        while (i10 < this.f15661a.size()) {
            ((we2) this.f15661a.get(i10)).f14950d += i11;
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<m4.we2>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<m4.uj2>, java.util.ArrayList] */
    public final void l() {
        Iterator it = this.f15668h.iterator();
        while (it.hasNext()) {
            we2 we2Var = (we2) it.next();
            if (we2Var.f14949c.isEmpty()) {
                ve2 ve2Var = this.f15667g.get(we2Var);
                if (ve2Var != null) {
                    ve2Var.f14665a.j(ve2Var.f14666b);
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<m4.uj2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashSet, java.util.Set<m4.we2>] */
    public final void m(we2 we2Var) {
        if (!we2Var.f14951e || !we2Var.f14949c.isEmpty()) {
            return;
        }
        ve2 remove = this.f15667g.remove(we2Var);
        Objects.requireNonNull(remove);
        remove.f14665a.e(remove.f14666b);
        remove.f14665a.f(remove.f14667c);
        remove.f14665a.g(remove.f14667c);
        this.f15668h.remove(we2Var);
    }

    public final void n(we2 we2Var) {
        rj2 rj2Var = we2Var.f14947a;
        wj2 wj2Var = new wj2() { // from class: m4.se2
            @Override // m4.wj2
            public final void a(xj2 xj2Var, z40 z40Var) {
                ((je2) ye2.this.f15664d).f9948z.e(22);
            }
        };
        ue2 ue2Var = new ue2(this, we2Var);
        this.f15667g.put(we2Var, new ve2(rj2Var, wj2Var, ue2Var));
        Handler handler = new Handler(ls1.a(), null);
        Objects.requireNonNull(rj2Var);
        rj2Var.f7988c.f7997c.add(new dk2(handler, ue2Var));
        new Handler(ls1.a(), null);
        rj2Var.f7989d.f15028c.add(new vh2(ue2Var));
        rj2Var.c(wj2Var, this.f15670j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<m4.we2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.Object, m4.we2>, java.util.HashMap] */
    public final void o(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 >= i10) {
                we2 we2Var = (we2) this.f15661a.remove(i11);
                this.f15663c.remove(we2Var.f14948b);
                k(i11, -we2Var.f14947a.f13376n.c());
                we2Var.f14951e = true;
                if (this.f15669i) {
                    m(we2Var);
                }
            } else {
                return;
            }
        }
    }
}

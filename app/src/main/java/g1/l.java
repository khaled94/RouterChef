package g1;

import android.os.Bundle;
import c1.f;
import c5.a;
import c5.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import m4.g7;
import m4.gg2;
import m4.v91;
import s4.a4;
import s4.g;
import s4.m;
import s4.n;
import s4.x7;
import z3.c;
import z3.v;
import z3.w;

/* loaded from: classes.dex */
public final class l implements a, v91 {

    /* renamed from: s */
    public Object f4818s;

    /* renamed from: t */
    public Object f4819t;

    public /* synthetic */ l() {
    }

    public /* synthetic */ l(int i10) {
        if (i10 != 2) {
            this.f4818s = new HashMap();
            return;
        }
        this.f4818s = new TreeMap();
        this.f4819t = new TreeMap();
    }

    public static final int c(a4 a4Var, m mVar, n nVar) {
        n a10 = mVar.a(a4Var, Collections.singletonList(nVar));
        if (a10 instanceof g) {
            return f.e(a10.f().doubleValue());
        }
        return -1;
    }

    public synchronized Map a() {
        if (((Map) this.f4819t) == null) {
            this.f4819t = Collections.unmodifiableMap(new HashMap((Map) this.f4818s));
        }
        return (Map) this.f4819t;
    }

    public void b(a4 a4Var, v vVar) {
        x7 x7Var = new x7(vVar);
        for (Integer num : ((TreeMap) this.f4818s).keySet()) {
            s4.a clone = ((s4.a) vVar.f20973u).clone();
            int c10 = c(a4Var, (m) ((TreeMap) this.f4818s).get(num), x7Var);
            if (c10 == 2 || c10 == -1) {
                vVar.f20973u = clone;
            }
        }
        for (Integer num2 : ((TreeMap) this.f4819t).keySet()) {
            c(a4Var, (m) ((TreeMap) this.f4819t).get(num2), x7Var);
        }
    }

    @Override // c5.a
    public Object d(i iVar) {
        c cVar = (c) this.f4818s;
        Bundle bundle = (Bundle) this.f4819t;
        Objects.requireNonNull(cVar);
        if (!iVar.n()) {
            return iVar;
        }
        Bundle bundle2 = (Bundle) iVar.j();
        return !(bundle2 != null && bundle2.containsKey("google.messenger")) ? iVar : cVar.a(bundle).p(w.f20975s, g7.f8760w);
    }

    @Override // m4.v91
    public void h(Object obj) {
        gg2 gg2Var = (gg2) obj;
    }

    public /* synthetic */ l(Object obj, Object obj2) {
        this.f4818s = obj;
        this.f4819t = obj2;
    }
}

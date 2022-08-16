package s4;

import g1.l;
import h2.q;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import m4.wb0;
import z3.v;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a */
    public final a3 f18052a;

    /* renamed from: b */
    public a4 f18053b;

    /* renamed from: c */
    public final v f18054c = new v();

    /* renamed from: d */
    public final l f18055d = new l(2);

    public p0() {
        a3 a3Var = new a3();
        this.f18052a = a3Var;
        this.f18053b = a3Var.f17707b.a();
        a3Var.f17709d.d("internal.registerCallback", new q(this, 2));
        a3Var.f17709d.d("internal.eventLogger", new wb0(this, 2));
    }

    public final void a(o4 o4Var) {
        h hVar;
        try {
            this.f18053b = this.f18052a.f17707b.a();
            if (this.f18052a.a(this.f18053b, (r4[]) o4Var.u().toArray(new r4[0])) instanceof f) {
                throw new IllegalStateException("Program loading failed");
            }
            for (m4 m4Var : o4Var.s().v()) {
                List<r4> u10 = m4Var.u();
                String t10 = m4Var.t();
                Iterator<r4> it = u10.iterator();
                while (it.hasNext()) {
                    n a10 = this.f18052a.a(this.f18053b, it.next());
                    if (!(a10 instanceof k)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    a4 a4Var = this.f18053b;
                    if (!a4Var.g(t10)) {
                        hVar = null;
                    } else {
                        n d5 = a4Var.d(t10);
                        if (!(d5 instanceof h)) {
                            String valueOf = String.valueOf(t10);
                            throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                        }
                        hVar = (h) d5;
                    }
                    if (hVar == null) {
                        String valueOf2 = String.valueOf(t10);
                        throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                    }
                    hVar.a(this.f18053b, Collections.singletonList(a10));
                }
            }
        } catch (Throwable th) {
            throw new l1(th);
        }
    }

    public final void b(String str, Callable<? extends h> callable) {
        this.f18052a.f17709d.d(str, callable);
    }

    public final boolean c(a aVar) {
        try {
            v vVar = this.f18054c;
            vVar.f20972t = aVar;
            vVar.f20973u = aVar.clone();
            ((List) vVar.f20974v).clear();
            this.f18052a.f17708c.f("runtime.counter", new g(Double.valueOf(0.0d)));
            this.f18055d.b(this.f18053b.a(), this.f18054c);
            v vVar2 = this.f18054c;
            if (!(!((a) vVar2.f20973u).equals((a) vVar2.f20972t))) {
                if (!(!((List) this.f18054c.f20974v).isEmpty())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw new l1(th);
        }
    }
}

package a8;

import e8.a;
import e8.b;
import e8.c;
import s.h;
import x7.s;
import x7.t;
import x7.u;
import x7.w;

/* loaded from: classes.dex */
public final class j extends w<Number> {

    /* renamed from: b */
    public static final i f314b = new i(new j());

    /* renamed from: a */
    public final u f315a = t.f20091t;

    @Override // x7.w
    public final Number a(a aVar) {
        int x0 = aVar.x0();
        int b10 = h.b(x0);
        if (b10 == 5 || b10 == 6) {
            return this.f315a.b(aVar);
        }
        if (b10 == 8) {
            aVar.t0();
            return null;
        }
        StringBuilder c10 = androidx.activity.result.a.c("Expecting number, got: ");
        c10.append(b.a(x0));
        c10.append("; at path ");
        c10.append(aVar.A());
        throw new s(c10.toString());
    }

    @Override // x7.w
    public final void b(c cVar, Number number) {
        cVar.q0(number);
    }
}

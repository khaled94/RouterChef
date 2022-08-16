package s4;

import c1.f;
import java.util.HashMap;
import java.util.List;
import z3.v;

/* loaded from: classes.dex */
public final class c7 extends h {

    /* renamed from: u */
    public final v f17758u;

    public c7(v vVar) {
        super("internal.eventLogger");
        this.f17758u = vVar;
    }

    @Override // s4.h
    public final n a(a4 a4Var, List<n> list) {
        f.m(this.f17900s, 3, list);
        String h10 = a4Var.b(list.get(0)).h();
        long b10 = (long) f.b(a4Var.b(list.get(1)).f().doubleValue());
        n b11 = a4Var.b(list.get(2));
        ((List) this.f17758u.f20974v).add(new a(h10, b10, b11 instanceof k ? f.l((k) b11) : new HashMap()));
        return n.f18009j;
    }
}

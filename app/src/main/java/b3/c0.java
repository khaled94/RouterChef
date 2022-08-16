package b3;

import b3.i;
import d3.b;
import d3.c;
import java.util.Objects;
import u8.a;

/* loaded from: classes.dex */
public final class c0 implements a {

    /* renamed from: a */
    public final a<d3.a> f2503a;

    /* renamed from: b */
    public final a<d3.a> f2504b;

    /* renamed from: c */
    public final a<e> f2505c;

    /* renamed from: d */
    public final a<i0> f2506d;

    /* renamed from: e */
    public final a<String> f2507e;

    public c0(a aVar, a aVar2) {
        b bVar = b.a.f3798a;
        c cVar = c.a.f3799a;
        i iVar = i.a.f2517a;
        this.f2503a = bVar;
        this.f2504b = cVar;
        this.f2505c = iVar;
        this.f2506d = aVar;
        this.f2507e = aVar2;
    }

    @Override // u8.a
    public final Object get() {
        w2.a aVar;
        d3.a aVar2 = this.f2503a.get();
        d3.a aVar3 = this.f2504b.get();
        e eVar = this.f2505c.get();
        i0 i0Var = this.f2506d.get();
        a<String> aVar4 = this.f2507e;
        Object obj = w2.a.f19917c;
        if (aVar4 instanceof v2.a) {
            aVar = (v2.a) aVar4;
        } else {
            Objects.requireNonNull(aVar4);
            aVar = new w2.a(aVar4);
        }
        return new b0(aVar2, aVar3, eVar, i0Var, aVar);
    }
}

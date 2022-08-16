package z2;

import a3.x;
import c3.b;
import java.util.concurrent.Executor;
import u2.e;
import u8.a;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a */
    public final a<Executor> f20915a;

    /* renamed from: b */
    public final a<e> f20916b;

    /* renamed from: c */
    public final a<x> f20917c;

    /* renamed from: d */
    public final a<b3.d> f20918d;

    /* renamed from: e */
    public final a<b> f20919e;

    public d(a<Executor> aVar, a<e> aVar2, a<x> aVar3, a<b3.d> aVar4, a<b> aVar5) {
        this.f20915a = aVar;
        this.f20916b = aVar2;
        this.f20917c = aVar3;
        this.f20918d = aVar4;
        this.f20919e = aVar5;
    }

    @Override // u8.a
    public final Object get() {
        return new c(this.f20915a.get(), this.f20916b.get(), this.f20917c.get(), this.f20918d.get(), this.f20919e.get());
    }
}

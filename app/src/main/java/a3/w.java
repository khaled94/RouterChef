package a3;

import b3.d;
import c3.b;
import java.util.concurrent.Executor;
import u8.a;

/* loaded from: classes.dex */
public final class w implements a {

    /* renamed from: a */
    public final a<Executor> f105a;

    /* renamed from: b */
    public final a<d> f106b;

    /* renamed from: c */
    public final a<x> f107c;

    /* renamed from: d */
    public final a<b> f108d;

    public w(a<Executor> aVar, a<d> aVar2, a<x> aVar3, a<b> aVar4) {
        this.f105a = aVar;
        this.f106b = aVar2;
        this.f107c = aVar3;
        this.f108d = aVar4;
    }

    @Override // u8.a
    public final Object get() {
        return new v(this.f105a.get(), this.f106b.get(), this.f107c.get(), this.f108d.get());
    }
}

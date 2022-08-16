package z2;

import a3.f;
import android.content.Context;
import b3.d;
import d3.c;
import u8.a;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a */
    public final a<Context> f20921a;

    /* renamed from: b */
    public final a<d> f20922b;

    /* renamed from: c */
    public final a<f> f20923c;

    /* renamed from: d */
    public final a<d3.a> f20924d;

    public g(a aVar, a aVar2, a aVar3) {
        c cVar = c.a.f3799a;
        this.f20921a = aVar;
        this.f20922b = aVar2;
        this.f20923c = aVar3;
        this.f20924d = cVar;
    }

    @Override // u8.a
    public final Object get() {
        this.f20924d.get();
        return new a3.d(this.f20921a.get(), this.f20922b.get(), this.f20923c.get());
    }
}

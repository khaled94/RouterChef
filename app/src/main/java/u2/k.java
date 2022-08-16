package u2;

import android.content.Context;
import d3.b;
import d3.c;
import u8.a;

/* loaded from: classes.dex */
public final class k implements a {

    /* renamed from: a */
    public final a<Context> f19065a;

    /* renamed from: b */
    public final a<d3.a> f19066b;

    /* renamed from: c */
    public final a<d3.a> f19067c;

    public k(a aVar) {
        b bVar = b.a.f3798a;
        c cVar = c.a.f3799a;
        this.f19065a = aVar;
        this.f19066b = bVar;
        this.f19067c = cVar;
    }

    @Override // u8.a
    public final Object get() {
        return new j(this.f19065a.get(), this.f19066b.get(), this.f19067c.get());
    }
}

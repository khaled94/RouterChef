package b3;

import android.content.Context;
import b3.f;
import b3.h;
import u8.a;

/* loaded from: classes.dex */
public final class j0 implements a {

    /* renamed from: a */
    public final a<Context> f2525a;

    /* renamed from: b */
    public final a<String> f2526b;

    /* renamed from: c */
    public final a<Integer> f2527c;

    public j0(a aVar) {
        f fVar = f.a.f2511a;
        h hVar = h.a.f2515a;
        this.f2525a = aVar;
        this.f2526b = fVar;
        this.f2527c = hVar;
    }

    @Override // u8.a
    public final Object get() {
        return new i0(this.f2525a.get(), this.f2526b.get(), this.f2527c.get().intValue());
    }
}

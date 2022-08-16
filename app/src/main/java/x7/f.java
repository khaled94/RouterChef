package x7;

import e8.a;
import e8.c;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class f extends w<AtomicLong> {

    /* renamed from: a */
    public final /* synthetic */ w f20074a;

    public f(w wVar) {
        this.f20074a = wVar;
    }

    @Override // x7.w
    public final AtomicLong a(a aVar) {
        return new AtomicLong(((Number) this.f20074a.a(aVar)).longValue());
    }

    @Override // x7.w
    public final void b(c cVar, AtomicLong atomicLong) {
        this.f20074a.b(cVar, Long.valueOf(atomicLong.get()));
    }
}

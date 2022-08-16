package e7;

import java.util.concurrent.atomic.AtomicReference;
import l6.a;
import n6.y;
import o7.a;
import o7.b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final AtomicReference<a> f4432a = new AtomicReference<>();

    public b(o7.a<a> aVar) {
        ((y) aVar).a(new a.AbstractC0098a() { // from class: e7.a
            @Override // o7.a.AbstractC0098a
            public final void b(b bVar) {
                b.this.f4432a.set((l6.a) bVar.get());
            }
        });
    }
}

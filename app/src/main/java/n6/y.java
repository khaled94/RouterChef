package n6;

import o7.a;
import o7.b;

/* loaded from: classes.dex */
public final class y<T> implements b<T>, a<T> {

    /* renamed from: c */
    public static final /* synthetic */ int f16666c = 0;

    /* renamed from: a */
    public a.AbstractC0098a<T> f16667a;

    /* renamed from: b */
    public volatile b<T> f16668b;

    public y(a.AbstractC0098a<T> abstractC0098a, b<T> bVar) {
        this.f16667a = abstractC0098a;
        this.f16668b = bVar;
    }

    public final void a(final a.AbstractC0098a<T> abstractC0098a) {
        b<T> bVar;
        b<T> bVar2 = this.f16668b;
        x xVar = x.f16665a;
        if (bVar2 != xVar) {
            abstractC0098a.b(bVar2);
            return;
        }
        b<T> bVar3 = null;
        synchronized (this) {
            bVar = this.f16668b;
            if (bVar != xVar) {
                bVar3 = bVar;
            } else {
                final a.AbstractC0098a<T> abstractC0098a2 = this.f16667a;
                this.f16667a = new a.AbstractC0098a() { // from class: n6.w
                    @Override // o7.a.AbstractC0098a
                    public final void b(b bVar4) {
                        a.AbstractC0098a abstractC0098a3 = a.AbstractC0098a.this;
                        a.AbstractC0098a abstractC0098a4 = abstractC0098a;
                        abstractC0098a3.b(bVar4);
                        abstractC0098a4.b(bVar4);
                    }
                };
            }
        }
        if (bVar3 == null) {
            return;
        }
        abstractC0098a.b(bVar);
    }

    @Override // o7.b
    public final T get() {
        return this.f16668b.get();
    }
}

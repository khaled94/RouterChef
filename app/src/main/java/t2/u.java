package t2;

import java.util.Objects;
import q2.a;
import q2.b;
import q2.c;
import q2.d;
import q2.e;
import q2.f;
import q2.h;
import t2.i;
import t2.j;
import t2.n;
import t2.r;

/* loaded from: classes.dex */
public final class u<T> implements f<T> {

    /* renamed from: a */
    public final r f18551a;

    /* renamed from: b */
    public final String f18552b;

    /* renamed from: c */
    public final b f18553c;

    /* renamed from: d */
    public final e<T, byte[]> f18554d;

    /* renamed from: e */
    public final v f18555e;

    public u(r rVar, String str, b bVar, e<T, byte[]> eVar, v vVar) {
        this.f18551a = rVar;
        this.f18552b = str;
        this.f18553c = bVar;
        this.f18554d = eVar;
        this.f18555e = vVar;
    }

    public final void a(c<T> cVar, h hVar) {
        v vVar = this.f18555e;
        r rVar = this.f18551a;
        Objects.requireNonNull(rVar, "Null transportContext");
        String str = this.f18552b;
        Objects.requireNonNull(str, "Null transportName");
        e<T, byte[]> eVar = this.f18554d;
        Objects.requireNonNull(eVar, "Null transformer");
        b bVar = this.f18553c;
        Objects.requireNonNull(bVar, "Null encoding");
        w wVar = (w) vVar;
        z2.e eVar2 = wVar.f18559c;
        a aVar = (a) cVar;
        d dVar = aVar.f17138b;
        r.a a10 = r.a();
        a10.a(rVar.b());
        j.a aVar2 = (j.a) a10;
        Objects.requireNonNull(dVar, "Null priority");
        aVar2.f18532c = dVar;
        aVar2.f18531b = rVar.c();
        r b10 = aVar2.b();
        n.a a11 = n.a();
        a11.e(wVar.f18557a.a());
        a11.g(wVar.f18558b.a());
        i.b bVar2 = (i.b) a11;
        bVar2.f18521a = str;
        bVar2.f18523c = new m(bVar, eVar.a(aVar.f17137a));
        bVar2.f18522b = null;
        eVar2.a(b10, bVar2.c(), hVar);
    }
}

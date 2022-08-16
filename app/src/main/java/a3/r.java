package a3;

import android.content.Context;
import b3.c;
import b3.d;
import b3.j;
import c3.b;
import d3.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import t2.i;
import t2.m;
import t2.n;
import t2.p;
import t2.r;
import u2.e;
import u2.h;
import u2.n;
import x2.c;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a */
    public final Context f80a;

    /* renamed from: b */
    public final e f81b;

    /* renamed from: c */
    public final d f82c;

    /* renamed from: d */
    public final x f83d;

    /* renamed from: e */
    public final Executor f84e;

    /* renamed from: f */
    public final b f85f;

    /* renamed from: g */
    public final a f86g;

    /* renamed from: h */
    public final a f87h;

    /* renamed from: i */
    public final c f88i;

    public r(Context context, e eVar, d dVar, x xVar, Executor executor, b bVar, a aVar, a aVar2, c cVar) {
        this.f80a = context;
        this.f81b = eVar;
        this.f82c = dVar;
        this.f83d = xVar;
        this.f84e = executor;
        this.f85f = bVar;
        this.f86g = aVar;
        this.f87h = aVar2;
        this.f88i = cVar;
    }

    public final h a(final t2.r rVar, int i10) {
        h b10;
        n a10 = this.f81b.a(rVar.b());
        h bVar = new u2.b(1, 0L);
        final long j3 = 0;
        while (((Boolean) this.f85f.b(new b.a() { // from class: a3.l
            @Override // c3.b.a
            public final Object a() {
                r rVar2 = r.this;
                return Boolean.valueOf(rVar2.f82c.V(rVar));
            }
        })).booleanValue()) {
            final Iterable<j> iterable = (Iterable) this.f85f.b(new b.a() { // from class: a3.m
                @Override // c3.b.a
                public final Object a() {
                    r rVar2 = r.this;
                    return rVar2.f82c.O(rVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return bVar;
            }
            boolean z10 = false;
            if (a10 == null) {
                y2.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", rVar);
                b10 = h.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (j jVar : iterable) {
                    arrayList.add(jVar.a());
                }
                if (rVar.c() != null) {
                    b bVar2 = this.f85f;
                    c cVar = this.f88i;
                    Objects.requireNonNull(cVar);
                    x2.a aVar = (x2.a) bVar2.b(new p(cVar));
                    n.a a11 = t2.n.a();
                    a11.e(this.f86g.a());
                    a11.g(this.f87h.a());
                    i.b bVar3 = (i.b) a11;
                    bVar3.f18521a = "GDT_CLIENT_METRICS";
                    q2.b bVar4 = new q2.b("proto");
                    Objects.requireNonNull(aVar);
                    k7.h hVar = p.f18543a;
                    Objects.requireNonNull(hVar);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        hVar.a(aVar, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    bVar3.f18523c = new m(bVar4, byteArrayOutputStream.toByteArray());
                    arrayList.add(a10.a(bVar3.c()));
                }
                b10 = a10.b(new u2.a(arrayList, rVar.c(), null));
            }
            h hVar2 = b10;
            if (hVar2.c() == 2) {
                this.f85f.b(new b.a() { // from class: a3.j
                    @Override // c3.b.a
                    public final Object a() {
                        r rVar2 = r.this;
                        Iterable<b3.j> iterable2 = iterable;
                        r rVar3 = rVar;
                        long j10 = j3;
                        rVar2.f82c.b0(iterable2);
                        rVar2.f82c.U(rVar3, rVar2.f86g.a() + j10);
                        return null;
                    }
                });
                this.f83d.b(rVar, i10 + 1, true);
                return hVar2;
            }
            this.f85f.b(new b.a() { // from class: a3.i
                @Override // c3.b.a
                public final Object a() {
                    r rVar2 = r.this;
                    rVar2.f82c.k(iterable);
                    return null;
                }
            });
            if (hVar2.c() == 1) {
                long max = Math.max(j3, hVar2.b());
                if (rVar.c() != null) {
                    z10 = true;
                }
                if (z10) {
                    this.f85f.b(new b.a() { // from class: a3.g
                        @Override // c3.b.a
                        public final Object a() {
                            r.this.f88i.j();
                            return null;
                        }
                    });
                }
                j3 = max;
            } else if (hVar2.c() == 4) {
                final HashMap hashMap = new HashMap();
                for (j jVar2 : iterable) {
                    String h10 = jVar2.a().h();
                    hashMap.put(h10, !hashMap.containsKey(h10) ? 1 : Integer.valueOf(((Integer) hashMap.get(h10)).intValue() + 1));
                }
                this.f85f.b(new b.a() { // from class: a3.k
                    @Override // c3.b.a
                    public final Object a() {
                        r rVar2 = r.this;
                        Map map = hashMap;
                        Objects.requireNonNull(rVar2);
                        for (Map.Entry entry : map.entrySet()) {
                            rVar2.f88i.G(((Integer) entry.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) entry.getKey());
                        }
                        return null;
                    }
                });
            }
            bVar = hVar2;
        }
        this.f85f.b(new b.a() { // from class: a3.o
            @Override // c3.b.a
            public final Object a() {
                r rVar2 = r.this;
                rVar2.f82c.U(rVar, rVar2.f86g.a() + j3);
                return null;
            }
        });
        return bVar;
    }
}

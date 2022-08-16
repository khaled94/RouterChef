package u9;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r9.f;
import r9.j0;
import r9.r;
import r9.v;
import s9.e;
import w7.c;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public final r9.a f19661a;

    /* renamed from: b */
    public final c f19662b;

    /* renamed from: c */
    public final r f19663c;

    /* renamed from: d */
    public List<Proxy> f19664d;

    /* renamed from: e */
    public int f19665e;

    /* renamed from: f */
    public List<InetSocketAddress> f19666f = Collections.emptyList();

    /* renamed from: g */
    public final List<j0> f19667g = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final List<j0> f19668a;

        /* renamed from: b */
        public int f19669b = 0;

        public a(List<j0> list) {
            this.f19668a = list;
        }

        public final boolean a() {
            return this.f19669b < this.f19668a.size();
        }
    }

    public h(r9.a aVar, c cVar, f fVar, r rVar) {
        List<Proxy> list;
        this.f19664d = Collections.emptyList();
        this.f19661a = aVar;
        this.f19662b = cVar;
        this.f19663c = rVar;
        v vVar = aVar.f17283a;
        Proxy proxy = aVar.f17290h;
        if (proxy != null) {
            list = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = aVar.f17289g.select(vVar.r());
            list = (select == null || select.isEmpty()) ? e.m(Proxy.NO_PROXY) : e.l(select);
        }
        this.f19664d = list;
        this.f19665e = 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<r9.j0>, java.util.ArrayList] */
    public final boolean a() {
        return b() || !this.f19667g.isEmpty();
    }

    public final boolean b() {
        return this.f19665e < this.f19664d.size();
    }
}

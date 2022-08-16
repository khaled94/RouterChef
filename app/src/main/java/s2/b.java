package s2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final b f17595a = new b();

    /* loaded from: classes.dex */
    public static final class a implements h7.d<s2.a> {

        /* renamed from: a */
        public static final a f17596a = new a();

        /* renamed from: b */
        public static final h7.c f17597b = h7.c.a("sdkVersion");

        /* renamed from: c */
        public static final h7.c f17598c = h7.c.a("model");

        /* renamed from: d */
        public static final h7.c f17599d = h7.c.a("hardware");

        /* renamed from: e */
        public static final h7.c f17600e = h7.c.a("device");

        /* renamed from: f */
        public static final h7.c f17601f = h7.c.a("product");

        /* renamed from: g */
        public static final h7.c f17602g = h7.c.a("osBuild");

        /* renamed from: h */
        public static final h7.c f17603h = h7.c.a("manufacturer");

        /* renamed from: i */
        public static final h7.c f17604i = h7.c.a("fingerprint");

        /* renamed from: j */
        public static final h7.c f17605j = h7.c.a("locale");

        /* renamed from: k */
        public static final h7.c f17606k = h7.c.a("country");

        /* renamed from: l */
        public static final h7.c f17607l = h7.c.a("mccMnc");

        /* renamed from: m */
        public static final h7.c f17608m = h7.c.a("applicationBuild");

        @Override // h7.a
        public final void a(Object obj, h7.e eVar) {
            s2.a aVar = (s2.a) obj;
            h7.e eVar2 = eVar;
            eVar2.e(f17597b, aVar.l());
            eVar2.e(f17598c, aVar.i());
            eVar2.e(f17599d, aVar.e());
            eVar2.e(f17600e, aVar.c());
            eVar2.e(f17601f, aVar.k());
            eVar2.e(f17602g, aVar.j());
            eVar2.e(f17603h, aVar.g());
            eVar2.e(f17604i, aVar.d());
            eVar2.e(f17605j, aVar.f());
            eVar2.e(f17606k, aVar.b());
            eVar2.e(f17607l, aVar.h());
            eVar2.e(f17608m, aVar.a());
        }
    }

    /* renamed from: s2.b$b */
    /* loaded from: classes.dex */
    public static final class C0112b implements h7.d<j> {

        /* renamed from: a */
        public static final C0112b f17609a = new C0112b();

        /* renamed from: b */
        public static final h7.c f17610b = h7.c.a("logRequest");

        @Override // h7.a
        public final void a(Object obj, h7.e eVar) {
            eVar.e(f17610b, ((j) obj).a());
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements h7.d<k> {

        /* renamed from: a */
        public static final c f17611a = new c();

        /* renamed from: b */
        public static final h7.c f17612b = h7.c.a("clientType");

        /* renamed from: c */
        public static final h7.c f17613c = h7.c.a("androidClientInfo");

        @Override // h7.a
        public final void a(Object obj, h7.e eVar) {
            k kVar = (k) obj;
            h7.e eVar2 = eVar;
            eVar2.e(f17612b, kVar.b());
            eVar2.e(f17613c, kVar.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements h7.d<l> {

        /* renamed from: a */
        public static final d f17614a = new d();

        /* renamed from: b */
        public static final h7.c f17615b = h7.c.a("eventTimeMs");

        /* renamed from: c */
        public static final h7.c f17616c = h7.c.a("eventCode");

        /* renamed from: d */
        public static final h7.c f17617d = h7.c.a("eventUptimeMs");

        /* renamed from: e */
        public static final h7.c f17618e = h7.c.a("sourceExtension");

        /* renamed from: f */
        public static final h7.c f17619f = h7.c.a("sourceExtensionJsonProto3");

        /* renamed from: g */
        public static final h7.c f17620g = h7.c.a("timezoneOffsetSeconds");

        /* renamed from: h */
        public static final h7.c f17621h = h7.c.a("networkConnectionInfo");

        @Override // h7.a
        public final void a(Object obj, h7.e eVar) {
            l lVar = (l) obj;
            h7.e eVar2 = eVar;
            eVar2.a(f17615b, lVar.b());
            eVar2.e(f17616c, lVar.a());
            eVar2.a(f17617d, lVar.c());
            eVar2.e(f17618e, lVar.e());
            eVar2.e(f17619f, lVar.f());
            eVar2.a(f17620g, lVar.g());
            eVar2.e(f17621h, lVar.d());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements h7.d<m> {

        /* renamed from: a */
        public static final e f17622a = new e();

        /* renamed from: b */
        public static final h7.c f17623b = h7.c.a("requestTimeMs");

        /* renamed from: c */
        public static final h7.c f17624c = h7.c.a("requestUptimeMs");

        /* renamed from: d */
        public static final h7.c f17625d = h7.c.a("clientInfo");

        /* renamed from: e */
        public static final h7.c f17626e = h7.c.a("logSource");

        /* renamed from: f */
        public static final h7.c f17627f = h7.c.a("logSourceName");

        /* renamed from: g */
        public static final h7.c f17628g = h7.c.a("logEvent");

        /* renamed from: h */
        public static final h7.c f17629h = h7.c.a("qosTier");

        @Override // h7.a
        public final void a(Object obj, h7.e eVar) {
            m mVar = (m) obj;
            h7.e eVar2 = eVar;
            eVar2.a(f17623b, mVar.f());
            eVar2.a(f17624c, mVar.g());
            eVar2.e(f17625d, mVar.a());
            eVar2.e(f17626e, mVar.c());
            eVar2.e(f17627f, mVar.d());
            eVar2.e(f17628g, mVar.b());
            eVar2.e(f17629h, mVar.e());
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements h7.d<o> {

        /* renamed from: a */
        public static final f f17630a = new f();

        /* renamed from: b */
        public static final h7.c f17631b = h7.c.a("networkType");

        /* renamed from: c */
        public static final h7.c f17632c = h7.c.a("mobileSubtype");

        @Override // h7.a
        public final void a(Object obj, h7.e eVar) {
            o oVar = (o) obj;
            h7.e eVar2 = eVar;
            eVar2.e(f17631b, oVar.b());
            eVar2.e(f17632c, oVar.a());
        }
    }

    public final void a(i7.a<?> aVar) {
        C0112b c0112b = C0112b.f17609a;
        j7.e eVar = (j7.e) aVar;
        eVar.a(j.class, c0112b);
        eVar.a(s2.d.class, c0112b);
        e eVar2 = e.f17622a;
        eVar.a(m.class, eVar2);
        eVar.a(g.class, eVar2);
        c cVar = c.f17611a;
        eVar.a(k.class, cVar);
        eVar.a(s2.e.class, cVar);
        a aVar2 = a.f17596a;
        eVar.a(s2.a.class, aVar2);
        eVar.a(s2.c.class, aVar2);
        d dVar = d.f17614a;
        eVar.a(l.class, dVar);
        eVar.a(s2.f.class, dVar);
        f fVar = f.f17630a;
        eVar.a(o.class, fVar);
        eVar.a(i.class, fVar);
    }
}

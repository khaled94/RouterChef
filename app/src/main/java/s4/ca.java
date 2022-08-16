package s4;

/* loaded from: classes.dex */
public final class ca implements ba {
    public static final n5<Long> A;
    public static final n5<Long> B;
    public static final n5<Long> C;
    public static final n5<Long> D;
    public static final n5<Long> E;
    public static final n5<Long> F;
    public static final n5<Long> G;
    public static final n5<String> H;
    public static final n5<Long> I;

    /* renamed from: a */
    public static final n5<Long> f17760a;

    /* renamed from: b */
    public static final n5<Long> f17761b;

    /* renamed from: c */
    public static final n5<Long> f17762c;

    /* renamed from: d */
    public static final n5<String> f17763d;

    /* renamed from: e */
    public static final n5<String> f17764e;

    /* renamed from: f */
    public static final n5<Long> f17765f;

    /* renamed from: g */
    public static final n5<Long> f17766g;

    /* renamed from: h */
    public static final n5<Long> f17767h;

    /* renamed from: i */
    public static final n5<Long> f17768i;

    /* renamed from: j */
    public static final n5<Long> f17769j;

    /* renamed from: k */
    public static final n5<Long> f17770k;

    /* renamed from: l */
    public static final n5<Long> f17771l;

    /* renamed from: m */
    public static final n5<Long> f17772m;

    /* renamed from: n */
    public static final n5<Long> f17773n;

    /* renamed from: o */
    public static final n5<Long> f17774o;
    public static final n5<Long> p;

    /* renamed from: q */
    public static final n5<Long> f17775q;

    /* renamed from: r */
    public static final n5<Long> f17776r;

    /* renamed from: s */
    public static final n5<Long> f17777s;

    /* renamed from: t */
    public static final n5<Long> f17778t;

    /* renamed from: u */
    public static final n5<Long> f17779u;

    /* renamed from: v */
    public static final n5<Long> f17780v;

    /* renamed from: w */
    public static final n5<Long> f17781w;

    /* renamed from: x */
    public static final n5<Long> f17782x;
    public static final n5<Long> y;

    /* renamed from: z */
    public static final n5<Long> f17783z;

    static {
        l5 l5Var = new l5(f5.a(), false);
        f17760a = (h5) l5Var.a("measurement.ad_id_cache_time", 10000L);
        f17761b = (h5) l5Var.a("measurement.max_bundles_per_iteration", 100L);
        f17762c = (h5) l5Var.a("measurement.config.cache_time", 86400000L);
        l5Var.b("measurement.log_tag", "FA");
        f17763d = new k5(l5Var, "measurement.config.url_authority", "app-measurement.com");
        f17764e = new k5(l5Var, "measurement.config.url_scheme", "https");
        f17765f = (h5) l5Var.a("measurement.upload.debug_upload_interval", 1000L);
        f17766g = (h5) l5Var.a("measurement.lifetimevalue.max_currency_tracked", 4L);
        f17767h = (h5) l5Var.a("measurement.store.max_stored_events_per_app", 100000L);
        f17768i = (h5) l5Var.a("measurement.experiment.max_ids", 50L);
        f17769j = (h5) l5Var.a("measurement.audience.filter_result_max_count", 200L);
        f17770k = (h5) l5Var.a("measurement.alarm_manager.minimum_interval", 60000L);
        f17771l = (h5) l5Var.a("measurement.upload.minimum_delay", 500L);
        f17772m = (h5) l5Var.a("measurement.monitoring.sample_period_millis", 86400000L);
        f17773n = (h5) l5Var.a("measurement.upload.realtime_upload_interval", 10000L);
        f17774o = (h5) l5Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        l5Var.a("measurement.config.cache_time.service", 3600000L);
        p = (h5) l5Var.a("measurement.service_client.idle_disconnect_millis", 5000L);
        l5Var.b("measurement.log_tag.service", "FA-SVC");
        f17775q = (h5) l5Var.a("measurement.upload.stale_data_deletion_interval", 86400000L);
        f17776r = (h5) l5Var.a("measurement.sdk.attribution.cache.ttl", 604800000L);
        f17777s = (h5) l5Var.a("measurement.upload.backoff_period", 43200000L);
        f17778t = (h5) l5Var.a("measurement.upload.initial_upload_delay_time", 15000L);
        f17779u = (h5) l5Var.a("measurement.upload.interval", 3600000L);
        f17780v = (h5) l5Var.a("measurement.upload.max_bundle_size", 65536L);
        f17781w = (h5) l5Var.a("measurement.upload.max_bundles", 100L);
        f17782x = (h5) l5Var.a("measurement.upload.max_conversions_per_day", 500L);
        y = (h5) l5Var.a("measurement.upload.max_error_events_per_day", 1000L);
        f17783z = (h5) l5Var.a("measurement.upload.max_events_per_bundle", 1000L);
        A = (h5) l5Var.a("measurement.upload.max_events_per_day", 100000L);
        B = (h5) l5Var.a("measurement.upload.max_public_events_per_day", 50000L);
        C = (h5) l5Var.a("measurement.upload.max_queue_time", 2419200000L);
        D = (h5) l5Var.a("measurement.upload.max_realtime_events_per_day", 10L);
        E = (h5) l5Var.a("measurement.upload.max_batch_size", 65536L);
        F = (h5) l5Var.a("measurement.upload.retry_count", 6L);
        G = (h5) l5Var.a("measurement.upload.retry_time", 1800000L);
        H = new k5(l5Var, "measurement.upload.url", "https://app-measurement.com/a");
        I = (h5) l5Var.a("measurement.upload.window_interval", 3600000L);
    }

    @Override // s4.ba
    public final String A() {
        return f17764e.b();
    }

    @Override // s4.ba
    public final long B() {
        return G.b().longValue();
    }

    @Override // s4.ba
    public final long C() {
        return C.b().longValue();
    }

    @Override // s4.ba
    public final String E() {
        return H.b();
    }

    @Override // s4.ba
    public final long F() {
        return B.b().longValue();
    }

    @Override // s4.ba
    public final String H() {
        return f17763d.b();
    }

    @Override // s4.ba
    public final long L() {
        return f17783z.b().longValue();
    }

    @Override // s4.ba
    public final long Q() {
        return y.b().longValue();
    }

    @Override // s4.ba
    public final long S() {
        return F.b().longValue();
    }

    @Override // s4.ba
    public final long a() {
        return f17761b.b().longValue();
    }

    @Override // s4.ba
    public final long b() {
        return f17766g.b().longValue();
    }

    @Override // s4.ba
    public final long c() {
        return f17762c.b().longValue();
    }

    @Override // s4.ba
    public final long d() {
        return f17767h.b().longValue();
    }

    @Override // s4.ba
    public final long e() {
        return f17768i.b().longValue();
    }

    @Override // s4.ba
    public final long f() {
        return f17769j.b().longValue();
    }

    @Override // s4.ba
    public final long g() {
        return f17765f.b().longValue();
    }

    @Override // s4.ba
    public final long h() {
        return f17770k.b().longValue();
    }

    @Override // s4.ba
    public final long i() {
        return f17771l.b().longValue();
    }

    @Override // s4.ba
    public final long j() {
        return p.b().longValue();
    }

    @Override // s4.ba
    public final long k() {
        return f17775q.b().longValue();
    }

    @Override // s4.ba
    public final long l() {
        return f17773n.b().longValue();
    }

    @Override // s4.ba
    public final long m() {
        return f17776r.b().longValue();
    }

    @Override // s4.ba
    public final long n() {
        return f17772m.b().longValue();
    }

    @Override // s4.ba
    public final long o() {
        return f17774o.b().longValue();
    }

    @Override // s4.ba
    public final long p() {
        return f17779u.b().longValue();
    }

    @Override // s4.ba
    public final long q() {
        return f17782x.b().longValue();
    }

    @Override // s4.ba
    public final long r() {
        return f17780v.b().longValue();
    }

    @Override // s4.ba
    public final long s() {
        return f17777s.b().longValue();
    }

    @Override // s4.ba
    public final long t() {
        return I.b().longValue();
    }

    @Override // s4.ba
    public final long u() {
        return A.b().longValue();
    }

    @Override // s4.ba
    public final long v() {
        return f17781w.b().longValue();
    }

    @Override // s4.ba
    public final long w() {
        return E.b().longValue();
    }

    @Override // s4.ba
    public final long x() {
        return f17778t.b().longValue();
    }

    @Override // s4.ba
    public final long y() {
        return D.b().longValue();
    }

    @Override // s4.ba
    public final long zza() {
        return f17760a.b().longValue();
    }
}

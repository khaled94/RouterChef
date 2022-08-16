package r9;

import androidx.activity.result.d;
import ba.c;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import m4.p41;
import r9.f;
import r9.m;
import s9.e;

/* loaded from: classes.dex */
public final class z implements Cloneable, f.a {
    public static final List<a0> Q = e.m(a0.HTTP_2, a0.HTTP_1_1);
    public static final List<k> R = e.m(k.f17425e, k.f17426f);
    @Nullable
    public final d A;
    public final SocketFactory B;
    public final SSLSocketFactory C;
    public final d D;
    public final c E;
    public final h F;
    public final r2.b G;
    public final c H;
    public final p41 I;
    public final v6.c J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final int N;
    public final int O;
    public final int P;

    /* renamed from: s */
    public final n f17511s;

    /* renamed from: t */
    public final List<a0> f17512t;

    /* renamed from: u */
    public final List<k> f17513u;

    /* renamed from: v */
    public final List<w> f17514v;

    /* renamed from: w */
    public final List<w> f17515w;

    /* renamed from: x */
    public final q f17516x;
    public final ProxySelector y;

    /* renamed from: z */
    public final m.a f17517z;

    /* loaded from: classes.dex */
    public class a extends s9.a {
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: g */
        public ProxySelector f17524g;

        /* renamed from: h */
        public m.a f17525h;
        @Nullable

        /* renamed from: i */
        public d f17526i;

        /* renamed from: j */
        public SocketFactory f17527j;

        /* renamed from: k */
        public c f17528k;

        /* renamed from: l */
        public h f17529l;

        /* renamed from: m */
        public r2.b f17530m;

        /* renamed from: n */
        public c f17531n;

        /* renamed from: o */
        public p41 f17532o;
        public v6.c p;

        /* renamed from: q */
        public boolean f17533q;

        /* renamed from: r */
        public boolean f17534r;

        /* renamed from: s */
        public boolean f17535s;

        /* renamed from: t */
        public int f17536t;

        /* renamed from: u */
        public int f17537u;

        /* renamed from: v */
        public int f17538v;

        /* renamed from: d */
        public final List<w> f17521d = new ArrayList();

        /* renamed from: e */
        public final List<w> f17522e = new ArrayList();

        /* renamed from: a */
        public n f17518a = new n();

        /* renamed from: b */
        public List<a0> f17519b = z.Q;

        /* renamed from: c */
        public List<k> f17520c = z.R;

        /* renamed from: f */
        public q f17523f = new q();

        public b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f17524g = proxySelector;
            if (proxySelector == null) {
                this.f17524g = new aa.a();
            }
            this.f17525h = m.f17454a;
            this.f17527j = SocketFactory.getDefault();
            this.f17528k = c.f2600a;
            this.f17529l = h.f17393c;
            r2.b bVar = c.f17310h;
            this.f17530m = bVar;
            this.f17531n = bVar;
            this.f17532o = new p41();
            this.p = p.f17460i;
            this.f17533q = true;
            this.f17534r = true;
            this.f17535s = true;
            this.f17536t = 10000;
            this.f17537u = 10000;
            this.f17538v = 10000;
        }
    }

    static {
        s9.a.f18391a = new a();
    }

    public z() {
        this(new b());
    }

    public z(b bVar) {
        boolean z10;
        this.f17511s = bVar.f17518a;
        this.f17512t = bVar.f17519b;
        List<k> list = bVar.f17520c;
        this.f17513u = list;
        this.f17514v = e.l(bVar.f17521d);
        this.f17515w = e.l(bVar.f17522e);
        this.f17516x = bVar.f17523f;
        this.y = bVar.f17524g;
        this.f17517z = bVar.f17525h;
        this.A = bVar.f17526i;
        this.B = bVar.f17527j;
        loop0: while (true) {
            z10 = false;
            for (k kVar : list) {
                z10 = (z10 || kVar.f17427a) ? true : z10;
            }
        }
        if (!z10) {
            this.C = null;
            this.D = null;
        } else {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                    try {
                        z9.f fVar = z9.f.f21089a;
                        SSLContext i10 = fVar.i();
                        i10.init(null, new TrustManager[]{x509TrustManager}, null);
                        this.C = i10.getSocketFactory();
                        this.D = fVar.c(x509TrustManager);
                    } catch (GeneralSecurityException e10) {
                        throw new AssertionError("No System TLS", e10);
                    }
                } else {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
            } catch (GeneralSecurityException e11) {
                throw new AssertionError("No System TLS", e11);
            }
        }
        SSLSocketFactory sSLSocketFactory = this.C;
        if (sSLSocketFactory != null) {
            z9.f.f21089a.f(sSLSocketFactory);
        }
        this.E = bVar.f17528k;
        h hVar = bVar.f17529l;
        d dVar = this.D;
        this.F = !Objects.equals(hVar.f17395b, dVar) ? new h(hVar.f17394a, dVar) : hVar;
        this.G = bVar.f17530m;
        this.H = bVar.f17531n;
        this.I = bVar.f17532o;
        this.J = bVar.p;
        this.K = bVar.f17533q;
        this.L = bVar.f17534r;
        this.M = bVar.f17535s;
        this.N = bVar.f17536t;
        this.O = bVar.f17537u;
        this.P = bVar.f17538v;
        if (this.f17514v.contains(null)) {
            StringBuilder c10 = androidx.activity.result.a.c("Null interceptor: ");
            c10.append(this.f17514v);
            throw new IllegalStateException(c10.toString());
        } else if (this.f17515w.contains(null)) {
            StringBuilder c11 = androidx.activity.result.a.c("Null network interceptor: ");
            c11.append(this.f17515w);
            throw new IllegalStateException(c11.toString());
        }
    }
}

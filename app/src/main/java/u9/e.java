package u9;

import androidx.activity.result.a;
import ba.c;
import ca.o;
import ca.s;
import ca.y;
import ca.z;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import r2.b;
import r9.a0;
import r9.c0;
import r9.g0;
import r9.h;
import r9.j0;
import r9.k;
import r9.r;
import r9.t;
import r9.u;
import r9.v;
import r9.w;
import w9.a;
import x9.d;
import x9.f;
import x9.q;

/* loaded from: classes.dex */
public final class e extends f.d {

    /* renamed from: b */
    public final f f19637b;

    /* renamed from: c */
    public final j0 f19638c;

    /* renamed from: d */
    public Socket f19639d;

    /* renamed from: e */
    public Socket f19640e;

    /* renamed from: f */
    public t f19641f;

    /* renamed from: g */
    public a0 f19642g;

    /* renamed from: h */
    public f f19643h;

    /* renamed from: i */
    public ca.t f19644i;

    /* renamed from: j */
    public s f19645j;

    /* renamed from: k */
    public boolean f19646k;

    /* renamed from: l */
    public int f19647l;

    /* renamed from: m */
    public int f19648m;

    /* renamed from: n */
    public int f19649n;

    /* renamed from: o */
    public int f19650o = 1;
    public final List<Reference<i>> p = new ArrayList();

    /* renamed from: q */
    public long f19651q = Long.MAX_VALUE;

    public e(f fVar, j0 j0Var) {
        this.f19637b = fVar;
        this.f19638c = j0Var;
    }

    @Override // x9.f.d
    public final void a(f fVar) {
        synchronized (this.f19637b) {
            this.f19650o = fVar.G();
        }
    }

    @Override // x9.f.d
    public final void b(q qVar) {
        qVar.c(5, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r15, int r16, int r17, boolean r18, r9.f r19, r9.r r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.e.c(int, int, int, boolean, r9.f, r9.r):void");
    }

    public final void d(int i10, int i11, r rVar) {
        j0 j0Var = this.f19638c;
        Proxy proxy = j0Var.f17423b;
        this.f19639d = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? j0Var.f17422a.f17285c.createSocket() : new Socket(proxy);
        InetSocketAddress inetSocketAddress = this.f19638c.f17424c;
        Objects.requireNonNull(rVar);
        this.f19639d.setSoTimeout(i11);
        try {
            z9.f.f21089a.h(this.f19639d, this.f19638c.f17424c, i10);
            try {
                this.f19644i = new ca.t(o.h(this.f19639d));
                this.f19645j = new s(o.e(this.f19639d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            StringBuilder c10 = a.c("Failed to connect to ");
            c10.append(this.f19638c.f17424c);
            ConnectException connectException = new ConnectException(c10.toString());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void e(int i10, int i11, int i12, r9.f fVar, r rVar) {
        c0.a aVar = new c0.a();
        aVar.h(this.f19638c.f17422a.f17283a);
        aVar.d("CONNECT", null);
        aVar.b("Host", s9.e.k(this.f19638c.f17422a.f17283a, true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", "okhttp/3.14.9");
        c0 a10 = aVar.a();
        g0.a aVar2 = new g0.a();
        aVar2.f17380a = a10;
        aVar2.f17381b = a0.HTTP_1_1;
        aVar2.f17382c = 407;
        aVar2.f17383d = "Preemptive Authenticate";
        aVar2.f17386g = s9.e.f18399d;
        aVar2.f17390k = -1L;
        aVar2.f17391l = -1L;
        u.a aVar3 = aVar2.f17385f;
        Objects.requireNonNull(aVar3);
        u.a("Proxy-Authenticate");
        u.b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.e("Proxy-Authenticate");
        aVar3.c("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar2.a();
        Objects.requireNonNull((b) this.f19638c.f17422a.f17286d);
        int i13 = r9.b.f17301a;
        v vVar = a10.f17311a;
        d(i10, i11, rVar);
        String str = "CONNECT " + s9.e.k(vVar, true) + " HTTP/1.1";
        ca.t tVar = this.f19644i;
        s sVar = this.f19645j;
        w9.a aVar4 = new w9.a(null, null, tVar, sVar);
        z d5 = tVar.d();
        long j3 = i11;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d5.g(j3);
        this.f19645j.d().g(i12);
        aVar4.m(a10.f17313c, str);
        sVar.flush();
        g0.a g10 = aVar4.g(false);
        g10.f17380a = a10;
        g0 a11 = g10.a();
        long a12 = v9.e.a(a11);
        if (a12 != -1) {
            y j10 = aVar4.j(a12);
            s9.e.s(j10, Integer.MAX_VALUE);
            ((a.d) j10).close();
        }
        int i14 = a11.f17375u;
        if (i14 == 200) {
            if (this.f19644i.f2874s.y() && this.f19645j.f2871s.y()) {
                return;
            }
            throw new IOException("TLS tunnel buffered too many bytes!");
        } else if (i14 == 407) {
            Objects.requireNonNull((b) this.f19638c.f17422a.f17286d);
            throw new IOException("Failed to authenticate with proxy");
        } else {
            StringBuilder c10 = androidx.activity.result.a.c("Unexpected response code for CONNECT: ");
            c10.append(a11.f17375u);
            throw new IOException(c10.toString());
        }
    }

    public final void f(b bVar, r rVar) {
        Throwable th;
        SSLSocket sSLSocket;
        AssertionError e10;
        a0 a0Var = a0.HTTP_1_1;
        r9.a aVar = this.f19638c.f17422a;
        if (aVar.f17291i == null) {
            List<a0> list = aVar.f17287e;
            a0 a0Var2 = a0.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(a0Var2)) {
                this.f19640e = this.f19639d;
                this.f19642g = a0Var;
                return;
            }
            this.f19640e = this.f19639d;
            this.f19642g = a0Var2;
            j();
            return;
        }
        Objects.requireNonNull(rVar);
        r9.a aVar2 = this.f19638c.f17422a;
        SSLSocketFactory sSLSocketFactory = aVar2.f17291i;
        String str = null;
        try {
            try {
                Socket socket = this.f19639d;
                v vVar = aVar2.f17283a;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, vVar.f17478d, vVar.f17479e, true);
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = null;
            }
        } catch (AssertionError e11) {
            e10 = e11;
        }
        try {
            k a10 = bVar.a(sSLSocket);
            if (a10.f17428b) {
                z9.f.f21089a.g(sSLSocket, aVar2.f17283a.f17478d, aVar2.f17287e);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            t a11 = t.a(session);
            if (!aVar2.f17292j.verify(aVar2.f17283a.f17478d, session)) {
                List<Certificate> list2 = a11.f17470c;
                if (!list2.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) list2.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.f17283a.f17478d + " not verified:\n    certificate: " + h.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + c.a(x509Certificate));
                }
                throw new SSLPeerUnverifiedException("Hostname " + aVar2.f17283a.f17478d + " not verified (no certificates)");
            }
            aVar2.f17293k.a(aVar2.f17283a.f17478d, a11.f17470c);
            if (a10.f17428b) {
                str = z9.f.f21089a.j(sSLSocket);
            }
            this.f19640e = sSLSocket;
            this.f19644i = new ca.t(o.h(sSLSocket));
            this.f19645j = new s(o.e(this.f19640e));
            this.f19641f = a11;
            if (str != null) {
                a0Var = a0.b(str);
            }
            this.f19642g = a0Var;
            z9.f.f21089a.a(sSLSocket);
            if (this.f19642g != a0.HTTP_2) {
                return;
            }
            j();
        } catch (AssertionError e12) {
            e10 = e12;
            if (!s9.e.p(e10)) {
                throw e10;
            }
            throw new IOException(e10);
        } catch (Throwable th3) {
            th = th3;
            if (sSLSocket != null) {
                z9.f.f21089a.a(sSLSocket);
            }
            s9.e.d(sSLSocket);
            throw th;
        }
    }

    public final boolean g() {
        return this.f19643h != null;
    }

    public final v9.c h(r9.z zVar, w.a aVar) {
        if (this.f19643h != null) {
            return new x9.o(zVar, this, aVar, this.f19643h);
        }
        v9.f fVar = (v9.f) aVar;
        this.f19640e.setSoTimeout(fVar.f19849h);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f19644i.d().g(fVar.f19849h);
        this.f19645j.d().g(fVar.f19850i);
        return new w9.a(zVar, this, this.f19644i, this.f19645j);
    }

    public final void i() {
        synchronized (this.f19637b) {
            this.f19646k = true;
        }
    }

    public final void j() {
        int a10;
        this.f19640e.setSoTimeout(0);
        f.b bVar = new f.b();
        Socket socket = this.f19640e;
        String str = this.f19638c.f17422a.f17283a.f17478d;
        ca.t tVar = this.f19644i;
        s sVar = this.f19645j;
        bVar.f20149a = socket;
        bVar.f20150b = str;
        bVar.f20151c = tVar;
        bVar.f20152d = sVar;
        bVar.f20153e = this;
        bVar.f20154f = 0;
        f fVar = new f(bVar);
        this.f19643h = fVar;
        x9.r rVar = fVar.M;
        synchronized (rVar) {
            if (rVar.f20228w) {
                throw new IOException("closed");
            }
            if (rVar.f20225t) {
                Logger logger = x9.r.y;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(s9.e.j(">> CONNECTION %s", d.f20132a.j()));
                }
                rVar.f20224s.F((byte[]) d.f20132a.f2847s.clone());
                rVar.f20224s.flush();
            }
        }
        x9.r rVar2 = fVar.M;
        x9.u uVar = fVar.J;
        synchronized (rVar2) {
            if (!rVar2.f20228w) {
                rVar2.j(0, Integer.bitCount(uVar.f20238a) * 6, (byte) 4, (byte) 0);
                int i10 = 0;
                while (i10 < 10) {
                    if (((1 << i10) & uVar.f20238a) != 0) {
                        rVar2.f20224s.r(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                        rVar2.f20224s.u(uVar.f20239b[i10]);
                    }
                    i10++;
                }
                rVar2.f20224s.flush();
            } else {
                throw new IOException("closed");
            }
        }
        if (fVar.J.a() != 65535) {
            fVar.M.Y(0, a10 - 65535);
        }
        new Thread(fVar.N).start();
    }

    public final boolean k(v vVar) {
        int i10 = vVar.f17479e;
        v vVar2 = this.f19638c.f17422a.f17283a;
        if (i10 != vVar2.f17479e) {
            return false;
        }
        if (vVar.f17478d.equals(vVar2.f17478d)) {
            return true;
        }
        t tVar = this.f19641f;
        return tVar != null && c.f2600a.c(vVar.f17478d, (X509Certificate) tVar.f17470c.get(0));
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("Connection{");
        c10.append(this.f19638c.f17422a.f17283a.f17478d);
        c10.append(":");
        c10.append(this.f19638c.f17422a.f17283a.f17479e);
        c10.append(", proxy=");
        c10.append(this.f19638c.f17423b);
        c10.append(" hostAddress=");
        c10.append(this.f19638c.f17424c);
        c10.append(" cipherSuite=");
        t tVar = this.f19641f;
        c10.append(tVar != null ? tVar.f17469b : "none");
        c10.append(" protocol=");
        c10.append(this.f19642g);
        c10.append('}');
        return c10.toString();
    }
}

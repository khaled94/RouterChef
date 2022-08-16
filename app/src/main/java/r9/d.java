package r9;

import ca.f;
import ca.h;
import ca.i;
import ca.j;
import ca.k;
import ca.o;
import ca.s;
import ca.t;
import ca.x;
import ca.y;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import r9.u;
import t9.e;
import t9.g;
import z9.f;

/* loaded from: classes.dex */
public final class d implements Closeable, Flushable {

    /* renamed from: s */
    public final a f17322s = new a();

    /* renamed from: t */
    public final e f17323t;

    /* loaded from: classes.dex */
    public class a implements g {
        public a() {
            d.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public final class b implements t9.c {

        /* renamed from: a */
        public final e.c f17325a;

        /* renamed from: b */
        public x f17326b;

        /* renamed from: c */
        public a f17327c;

        /* renamed from: d */
        public boolean f17328d;

        /* loaded from: classes.dex */
        public class a extends j {

            /* renamed from: t */
            public final /* synthetic */ e.c f17330t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x xVar, e.c cVar) {
                super(xVar);
                b.this = r1;
                this.f17330t = cVar;
            }

            @Override // ca.j, ca.x, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                synchronized (d.this) {
                    b bVar = b.this;
                    if (bVar.f17328d) {
                        return;
                    }
                    bVar.f17328d = true;
                    Objects.requireNonNull(d.this);
                    super.close();
                    this.f17330t.b();
                }
            }
        }

        public b(e.c cVar) {
            d.this = r2;
            this.f17325a = cVar;
            x d5 = cVar.d(1);
            this.f17326b = d5;
            this.f17327c = new a(d5, cVar);
        }

        public final void a() {
            synchronized (d.this) {
                if (this.f17328d) {
                    return;
                }
                this.f17328d = true;
                Objects.requireNonNull(d.this);
                s9.e.c(this.f17326b);
                try {
                    this.f17325a.a();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends i0 {

        /* renamed from: t */
        public final e.C0123e f17332t;

        /* renamed from: u */
        public final t f17333u;
        @Nullable

        /* renamed from: v */
        public final String f17334v;
        @Nullable

        /* renamed from: w */
        public final String f17335w;

        /* loaded from: classes.dex */
        public class a extends k {

            /* renamed from: t */
            public final /* synthetic */ e.C0123e f17336t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y yVar, e.C0123e c0123e) {
                super(yVar);
                this.f17336t = c0123e;
            }

            @Override // ca.k, ca.y, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.f17336t.close();
                super.close();
            }
        }

        public c(e.C0123e c0123e, String str, String str2) {
            this.f17332t = c0123e;
            this.f17334v = str;
            this.f17335w = str2;
            a aVar = new a(c0123e.f18893u[1], c0123e);
            Logger logger = o.f2862a;
            this.f17333u = new t(aVar);
        }

        @Override // r9.i0
        public final long b() {
            try {
                String str = this.f17335w;
                if (str == null) {
                    return -1L;
                }
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // r9.i0
        public final x c() {
            String str = this.f17334v;
            if (str != null) {
                Pattern pattern = x.f17492d;
                try {
                    return x.a(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
            return null;
        }

        @Override // r9.i0
        public final h j() {
            return this.f17333u;
        }
    }

    public d(File file, long j3) {
        Pattern pattern = e.M;
        if (j3 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            byte[] bArr = s9.e.f18396a;
            this.f17323t = new e(file, j3, new ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new s9.d("OkHttp DiskLruCache", true)));
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static String b(v vVar) {
        return i.h(vVar.f17483i).g("MD5").j();
    }

    public static int c(h hVar) {
        try {
            t tVar = (t) hVar;
            long j3 = tVar.j();
            String w10 = tVar.w();
            if (j3 >= 0 && j3 <= 2147483647L && w10.isEmpty()) {
                return (int) j3;
            }
            throw new IOException("expected an int but was \"" + j3 + w10 + "\"");
        } catch (NumberFormatException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17323t.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f17323t.flush();
    }

    public final void j(c0 c0Var) {
        e eVar = this.f17323t;
        String b10 = b(c0Var.f17311a);
        synchronized (eVar) {
            eVar.I();
            eVar.c();
            eVar.p0(b10);
            e.d dVar = eVar.C.get(b10);
            if (dVar != null) {
                eVar.n0(dVar);
                if (eVar.A <= eVar.y) {
                    eVar.H = false;
                }
            }
        }
    }

    /* renamed from: r9.d$d */
    /* loaded from: classes.dex */
    public static final class C0110d {

        /* renamed from: k */
        public static final String f17337k = "OkHttp-Sent-Millis";

        /* renamed from: l */
        public static final String f17338l = "OkHttp-Received-Millis";

        /* renamed from: a */
        public final String f17339a;

        /* renamed from: b */
        public final u f17340b;

        /* renamed from: c */
        public final String f17341c;

        /* renamed from: d */
        public final a0 f17342d;

        /* renamed from: e */
        public final int f17343e;

        /* renamed from: f */
        public final String f17344f;

        /* renamed from: g */
        public final u f17345g;
        @Nullable

        /* renamed from: h */
        public final t f17346h;

        /* renamed from: i */
        public final long f17347i;

        /* renamed from: j */
        public final long f17348j;

        static {
            f fVar = f.f21089a;
            Objects.requireNonNull(fVar);
            Objects.requireNonNull(fVar);
        }

        public C0110d(y yVar) {
            try {
                Logger logger = o.f2862a;
                t tVar = new t(yVar);
                this.f17339a = tVar.w();
                this.f17341c = tVar.w();
                u.a aVar = new u.a();
                int c10 = d.c(tVar);
                for (int i10 = 0; i10 < c10; i10++) {
                    aVar.b(tVar.w());
                }
                this.f17340b = new u(aVar);
                v9.j a10 = v9.j.a(tVar.w());
                this.f17342d = a10.f19856a;
                this.f17343e = a10.f19857b;
                this.f17344f = a10.f19858c;
                u.a aVar2 = new u.a();
                int c11 = d.c(tVar);
                for (int i11 = 0; i11 < c11; i11++) {
                    aVar2.b(tVar.w());
                }
                String str = f17337k;
                String d5 = aVar2.d(str);
                String str2 = f17338l;
                String d10 = aVar2.d(str2);
                aVar2.e(str);
                aVar2.e(str2);
                long j3 = 0;
                this.f17347i = d5 != null ? Long.parseLong(d5) : 0L;
                this.f17348j = d10 != null ? Long.parseLong(d10) : j3;
                this.f17345g = new u(aVar2);
                if (this.f17339a.startsWith("https://")) {
                    String w10 = tVar.w();
                    if (w10.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + w10 + "\"");
                    }
                    this.f17346h = new t(!tVar.y() ? k0.b(tVar.w()) : k0.SSL_3_0, j.a(tVar.w()), s9.e.l(a(tVar)), s9.e.l(a(tVar)));
                } else {
                    this.f17346h = null;
                }
            } finally {
                yVar.close();
            }
        }

        public final List<Certificate> a(h hVar) {
            int c10 = d.c(hVar);
            if (c10 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c10);
                for (int i10 = 0; i10 < c10; i10++) {
                    String w10 = ((t) hVar).w();
                    ca.f fVar = new ca.f();
                    fVar.x0(i.d(w10));
                    arrayList.add(certificateFactory.generateCertificate(new f.a()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void b(ca.g gVar, List<Certificate> list) {
            try {
                s sVar = (s) gVar;
                sVar.g0(list.size());
                sVar.z(10);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sVar.f0(i.k(list.get(i10).getEncoded()).b());
                    sVar.z(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void c(e.c cVar) {
            x d5 = cVar.d(0);
            Logger logger = o.f2862a;
            s sVar = new s(d5);
            sVar.f0(this.f17339a);
            sVar.z(10);
            sVar.f0(this.f17341c);
            sVar.z(10);
            sVar.g0(this.f17340b.f17472a.length / 2);
            sVar.z(10);
            int length = this.f17340b.f17472a.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                sVar.f0(this.f17340b.d(i10));
                sVar.f0(": ");
                sVar.f0(this.f17340b.g(i10));
                sVar.z(10);
            }
            a0 a0Var = this.f17342d;
            int i11 = this.f17343e;
            String str = this.f17344f;
            StringBuilder sb = new StringBuilder();
            sb.append(a0Var == a0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
            sb.append(' ');
            sb.append(i11);
            if (str != null) {
                sb.append(' ');
                sb.append(str);
            }
            sVar.f0(sb.toString());
            sVar.z(10);
            sVar.g0((this.f17345g.f17472a.length / 2) + 2);
            sVar.z(10);
            int length2 = this.f17345g.f17472a.length / 2;
            for (int i12 = 0; i12 < length2; i12++) {
                sVar.f0(this.f17345g.d(i12));
                sVar.f0(": ");
                sVar.f0(this.f17345g.g(i12));
                sVar.z(10);
            }
            sVar.f0(f17337k);
            sVar.f0(": ");
            sVar.g0(this.f17347i);
            sVar.z(10);
            sVar.f0(f17338l);
            sVar.f0(": ");
            sVar.g0(this.f17348j);
            sVar.z(10);
            if (this.f17339a.startsWith("https://")) {
                sVar.z(10);
                sVar.f0(this.f17346h.f17469b.f17421a);
                sVar.z(10);
                b(sVar, this.f17346h.f17470c);
                b(sVar, this.f17346h.f17471d);
                sVar.f0(this.f17346h.f17468a.f17440s);
                sVar.z(10);
            }
            sVar.close();
        }

        public C0110d(g0 g0Var) {
            u uVar;
            this.f17339a = g0Var.f17373s.f17311a.f17483i;
            int i10 = v9.e.f19841a;
            u uVar2 = g0Var.f17379z.f17373s.f17313c;
            Set<String> f10 = v9.e.f(g0Var.f17378x);
            if (f10.isEmpty()) {
                uVar = s9.e.f18398c;
            } else {
                u.a aVar = new u.a();
                int length = uVar2.f17472a.length / 2;
                for (int i11 = 0; i11 < length; i11++) {
                    String d5 = uVar2.d(i11);
                    if (f10.contains(d5)) {
                        aVar.a(d5, uVar2.g(i11));
                    }
                }
                uVar = new u(aVar);
            }
            this.f17340b = uVar;
            this.f17341c = g0Var.f17373s.f17312b;
            this.f17342d = g0Var.f17374t;
            this.f17343e = g0Var.f17375u;
            this.f17344f = g0Var.f17376v;
            this.f17345g = g0Var.f17378x;
            this.f17346h = g0Var.f17377w;
            this.f17347i = g0Var.C;
            this.f17348j = g0Var.D;
        }
    }
}

package t9;

import ca.g;
import ca.o;
import ca.p;
import ca.s;
import ca.t;
import ca.x;
import ca.y;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import y9.a;
import z9.f;

/* loaded from: classes.dex */
public final class e implements Closeable, Flushable {
    public static final Pattern M = Pattern.compile("[a-z0-9_-]{1,120}");
    public s B;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final Executor K;

    /* renamed from: s */
    public final y9.a f18869s;

    /* renamed from: t */
    public final File f18870t;

    /* renamed from: u */
    public final File f18871u;

    /* renamed from: v */
    public final File f18872v;

    /* renamed from: w */
    public final File f18873w;
    public long y;
    public long A = 0;
    public final LinkedHashMap<String, d> C = new LinkedHashMap<>(0, 0.75f, true);
    public long J = 0;
    public final a L = new a();

    /* renamed from: x */
    public final int f18874x = 201105;

    /* renamed from: z */
    public final int f18875z = 2;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            e.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (e.this) {
                e eVar = e.this;
                if ((!eVar.F) || eVar.G) {
                    return;
                }
                try {
                    eVar.o0();
                } catch (IOException unused) {
                    e.this.H = true;
                }
                try {
                    if (e.this.L()) {
                        e.this.m0();
                        e.this.D = 0;
                    }
                } catch (IOException unused2) {
                    e eVar2 = e.this;
                    eVar2.I = true;
                    Logger logger = o.f2862a;
                    eVar2.B = new s(new p());
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x xVar) {
            super(xVar);
            e.this = r1;
        }

        @Override // t9.f
        public final void b() {
            e.this.E = true;
        }
    }

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a */
        public final d f18878a;

        /* renamed from: b */
        public final boolean[] f18879b;

        /* renamed from: c */
        public boolean f18880c;

        /* loaded from: classes.dex */
        public class a extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x xVar) {
                super(xVar);
                c.this = r1;
            }

            @Override // t9.f
            public final void b() {
                synchronized (e.this) {
                    c.this.c();
                }
            }
        }

        public c(d dVar) {
            e.this = r1;
            this.f18878a = dVar;
            this.f18879b = dVar.f18887e ? null : new boolean[r1.f18875z];
        }

        public final void a() {
            synchronized (e.this) {
                if (this.f18880c) {
                    throw new IllegalStateException();
                }
                if (this.f18878a.f18888f == this) {
                    e.this.j(this, false);
                }
                this.f18880c = true;
            }
        }

        public final void b() {
            synchronized (e.this) {
                if (this.f18880c) {
                    throw new IllegalStateException();
                }
                if (this.f18878a.f18888f == this) {
                    e.this.j(this, true);
                }
                this.f18880c = true;
            }
        }

        public final void c() {
            if (this.f18878a.f18888f == this) {
                int i10 = 0;
                while (true) {
                    e eVar = e.this;
                    if (i10 >= eVar.f18875z) {
                        this.f18878a.f18888f = null;
                        return;
                    }
                    try {
                        ((a.C0154a) eVar.f18869s).a(this.f18878a.f18886d[i10]);
                    } catch (IOException unused) {
                    }
                    i10++;
                }
            }
        }

        public final x d(int i10) {
            x xVar;
            File file;
            synchronized (e.this) {
                if (!this.f18880c) {
                    d dVar = this.f18878a;
                    if (dVar.f18888f != this) {
                        Logger logger = o.f2862a;
                        return new p();
                    }
                    if (!dVar.f18887e) {
                        this.f18879b[i10] = true;
                    }
                    File file2 = dVar.f18886d[i10];
                    try {
                        Objects.requireNonNull((a.C0154a) e.this.f18869s);
                        try {
                            xVar = o.c(file2);
                        } catch (FileNotFoundException unused) {
                            file.getParentFile().mkdirs();
                            xVar = o.c(file);
                        }
                        return new a(xVar);
                    } catch (FileNotFoundException unused2) {
                        Logger logger2 = o.f2862a;
                        return new p();
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a */
        public final String f18883a;

        /* renamed from: b */
        public final long[] f18884b;

        /* renamed from: c */
        public final File[] f18885c;

        /* renamed from: d */
        public final File[] f18886d;

        /* renamed from: e */
        public boolean f18887e;

        /* renamed from: f */
        public c f18888f;

        /* renamed from: g */
        public long f18889g;

        public d(String str) {
            e.this = r7;
            this.f18883a = str;
            int i10 = r7.f18875z;
            this.f18884b = new long[i10];
            this.f18885c = new File[i10];
            this.f18886d = new File[i10];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i11 = 0; i11 < r7.f18875z; i11++) {
                sb.append(i11);
                this.f18885c[i11] = new File(r7.f18870t, sb.toString());
                sb.append(".tmp");
                this.f18886d[i11] = new File(r7.f18870t, sb.toString());
                sb.setLength(length);
            }
        }

        public final IOException a(String[] strArr) {
            StringBuilder c10 = androidx.activity.result.a.c("unexpected journal line: ");
            c10.append(Arrays.toString(strArr));
            throw new IOException(c10.toString());
        }

        public final C0123e b() {
            if (Thread.holdsLock(e.this)) {
                y[] yVarArr = new y[e.this.f18875z];
                this.f18884b.clone();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    try {
                        e eVar = e.this;
                        if (i11 >= eVar.f18875z) {
                            return new C0123e(this.f18883a, this.f18889g, yVarArr);
                        }
                        yVarArr[i11] = ((a.C0154a) eVar.f18869s).d(this.f18885c[i11]);
                        i11++;
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            e eVar2 = e.this;
                            if (i10 >= eVar2.f18875z || yVarArr[i10] == null) {
                                try {
                                    eVar2.n0(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            }
                            s9.e.c(yVarArr[i10]);
                            i10++;
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }

        public final void c(g gVar) {
            for (long j3 : this.f18884b) {
                gVar.z(32).g0(j3);
            }
        }
    }

    /* renamed from: t9.e$e */
    /* loaded from: classes.dex */
    public final class C0123e implements Closeable {

        /* renamed from: s */
        public final String f18891s;

        /* renamed from: t */
        public final long f18892t;

        /* renamed from: u */
        public final y[] f18893u;

        public C0123e(String str, long j3, y[] yVarArr) {
            e.this = r1;
            this.f18891s = str;
            this.f18892t = j3;
            this.f18893u = yVarArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (y yVar : this.f18893u) {
                s9.e.c(yVar);
            }
        }
    }

    public e(File file, long j3, Executor executor) {
        a.C0154a c0154a = y9.a.f20884a;
        this.f18869s = c0154a;
        this.f18870t = file;
        this.f18871u = new File(file, "journal");
        this.f18872v = new File(file, "journal.tmp");
        this.f18873w = new File(file, "journal.bkp");
        this.y = j3;
        this.K = executor;
    }

    public static /* synthetic */ void b(Throwable th, AutoCloseable autoCloseable) {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public final synchronized c G(String str, long j3) {
        I();
        c();
        p0(str);
        d dVar = this.C.get(str);
        if (j3 == -1 || (dVar != null && dVar.f18889g == j3)) {
            if (dVar != null && dVar.f18888f != null) {
                return null;
            }
            if (!this.H && !this.I) {
                s sVar = this.B;
                sVar.f0("DIRTY");
                sVar.z(32);
                sVar.f0(str);
                sVar.z(10);
                this.B.flush();
                if (this.E) {
                    return null;
                }
                if (dVar == null) {
                    dVar = new d(str);
                    this.C.put(str, dVar);
                }
                c cVar = new c(dVar);
                dVar.f18888f = cVar;
                return cVar;
            }
            this.K.execute(this.L);
            return null;
        }
        return null;
    }

    public final synchronized C0123e H(String str) {
        I();
        c();
        p0(str);
        d dVar = this.C.get(str);
        if (dVar != null && dVar.f18887e) {
            C0123e b10 = dVar.b();
            if (b10 == null) {
                return null;
            }
            this.D++;
            s sVar = this.B;
            sVar.f0("READ");
            sVar.z(32);
            sVar.f0(str);
            sVar.z(10);
            if (L()) {
                this.K.execute(this.L);
            }
            return b10;
        }
        return null;
    }

    public final synchronized void I() {
        if (this.F) {
            return;
        }
        y9.a aVar = this.f18869s;
        File file = this.f18873w;
        Objects.requireNonNull((a.C0154a) aVar);
        if (file.exists()) {
            y9.a aVar2 = this.f18869s;
            File file2 = this.f18871u;
            Objects.requireNonNull((a.C0154a) aVar2);
            if (file2.exists()) {
                ((a.C0154a) this.f18869s).a(this.f18873w);
            } else {
                ((a.C0154a) this.f18869s).c(this.f18873w, this.f18871u);
            }
        }
        y9.a aVar3 = this.f18869s;
        File file3 = this.f18871u;
        Objects.requireNonNull((a.C0154a) aVar3);
        if (file3.exists()) {
            try {
                d0();
                Z();
                this.F = true;
                return;
            } catch (IOException e10) {
                f fVar = f.f21089a;
                fVar.n(5, "DiskLruCache " + this.f18870t + " is corrupt: " + e10.getMessage() + ", removing", e10);
                close();
                ((a.C0154a) this.f18869s).b(this.f18870t);
                this.G = false;
            }
        }
        m0();
        this.F = true;
    }

    public final boolean L() {
        int i10 = this.D;
        return i10 >= 2000 && i10 >= this.C.size();
    }

    public final g Y() {
        x xVar;
        y9.a aVar = this.f18869s;
        File file = this.f18871u;
        Objects.requireNonNull((a.C0154a) aVar);
        try {
            xVar = o.a(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            xVar = o.a(file);
        }
        b bVar = new b(xVar);
        Logger logger = o.f2862a;
        return new s(bVar);
    }

    public final void Z() {
        ((a.C0154a) this.f18869s).a(this.f18872v);
        Iterator<d> it = this.C.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f18888f == null) {
                while (i10 < this.f18875z) {
                    this.A += next.f18884b[i10];
                    i10++;
                }
            } else {
                next.f18888f = null;
                while (i10 < this.f18875z) {
                    ((a.C0154a) this.f18869s).a(next.f18885c[i10]);
                    ((a.C0154a) this.f18869s).a(next.f18886d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void c() {
        try {
            synchronized (this) {
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        if (!this.G) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.F && !this.G) {
            for (d dVar : (d[]) this.C.values().toArray(new d[this.C.size()])) {
                c cVar = dVar.f18888f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            o0();
            this.B.close();
            this.B = null;
            this.G = true;
            return;
        }
        this.G = true;
    }

    public final void d0() {
        t tVar = new t(((a.C0154a) this.f18869s).d(this.f18871u));
        try {
            String w10 = tVar.w();
            String w11 = tVar.w();
            String w12 = tVar.w();
            String w13 = tVar.w();
            String w14 = tVar.w();
            if (!"libcore.io.DiskLruCache".equals(w10) || !"1".equals(w11) || !Integer.toString(this.f18874x).equals(w12) || !Integer.toString(this.f18875z).equals(w13) || !"".equals(w14)) {
                throw new IOException("unexpected journal header: [" + w10 + ", " + w11 + ", " + w13 + ", " + w14 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    e0(tVar.w());
                    i10++;
                } catch (EOFException unused) {
                    this.D = i10 - this.C.size();
                    if (!tVar.y()) {
                        m0();
                    } else {
                        this.B = (s) Y();
                    }
                    th = null;
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                b(th, tVar);
            }
        }
    }

    public final void e0(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                str2 = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.C.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i10, indexOf2);
            }
            d dVar = this.C.get(str2);
            if (dVar == null) {
                dVar = new d(str2);
                this.C.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f18887e = true;
                dVar.f18888f = null;
                if (split.length != e.this.f18875z) {
                    dVar.a(split);
                    throw null;
                }
                for (int i11 = 0; i11 < split.length; i11++) {
                    try {
                        dVar.f18884b[i11] = Long.parseLong(split[i11]);
                    } catch (NumberFormatException unused) {
                        dVar.a(split);
                        throw null;
                    }
                }
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f18888f = new c(dVar);
                return;
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(d7.a.c("unexpected journal line: ", str));
            } else {
                return;
            }
        }
        throw new IOException(d7.a.c("unexpected journal line: ", str));
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.F) {
            return;
        }
        c();
        o0();
        this.B.flush();
    }

    public final synchronized void j(c cVar, boolean z10) {
        d dVar = cVar.f18878a;
        if (dVar.f18888f == cVar) {
            if (z10 && !dVar.f18887e) {
                for (int i10 = 0; i10 < this.f18875z; i10++) {
                    if (!cVar.f18879b[i10]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                    y9.a aVar = this.f18869s;
                    File file = dVar.f18886d[i10];
                    Objects.requireNonNull((a.C0154a) aVar);
                    if (!file.exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i11 = 0; i11 < this.f18875z; i11++) {
                File file2 = dVar.f18886d[i11];
                if (z10) {
                    Objects.requireNonNull((a.C0154a) this.f18869s);
                    if (file2.exists()) {
                        File file3 = dVar.f18885c[i11];
                        ((a.C0154a) this.f18869s).c(file2, file3);
                        long j3 = dVar.f18884b[i11];
                        Objects.requireNonNull((a.C0154a) this.f18869s);
                        long length = file3.length();
                        dVar.f18884b[i11] = length;
                        this.A = (this.A - j3) + length;
                    }
                } else {
                    ((a.C0154a) this.f18869s).a(file2);
                }
            }
            this.D++;
            dVar.f18888f = null;
            if (dVar.f18887e || z10) {
                dVar.f18887e = true;
                s sVar = this.B;
                sVar.f0("CLEAN");
                sVar.z(32);
                this.B.f0(dVar.f18883a);
                dVar.c(this.B);
                this.B.z(10);
                if (z10) {
                    long j10 = this.J;
                    this.J = 1 + j10;
                    dVar.f18889g = j10;
                }
            } else {
                this.C.remove(dVar.f18883a);
                s sVar2 = this.B;
                sVar2.f0("REMOVE");
                sVar2.z(32);
                this.B.f0(dVar.f18883a);
                this.B.z(10);
            }
            this.B.flush();
            if (this.A > this.y || L()) {
                this.K.execute(this.L);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final synchronized void m0() {
        x xVar;
        s sVar = this.B;
        if (sVar != null) {
            sVar.close();
        }
        y9.a aVar = this.f18869s;
        File file = this.f18872v;
        Objects.requireNonNull((a.C0154a) aVar);
        try {
            xVar = o.c(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            xVar = o.c(file);
        }
        Logger logger = o.f2862a;
        s sVar2 = new s(xVar);
        sVar2.f0("libcore.io.DiskLruCache");
        sVar2.z(10);
        sVar2.f0("1");
        sVar2.z(10);
        sVar2.g0(this.f18874x);
        sVar2.z(10);
        sVar2.g0(this.f18875z);
        sVar2.z(10);
        sVar2.z(10);
        for (d dVar : this.C.values()) {
            if (dVar.f18888f != null) {
                sVar2.f0("DIRTY");
                sVar2.z(32);
                sVar2.f0(dVar.f18883a);
            } else {
                sVar2.f0("CLEAN");
                sVar2.z(32);
                sVar2.f0(dVar.f18883a);
                dVar.c(sVar2);
            }
            sVar2.z(10);
        }
        b(null, sVar2);
        y9.a aVar2 = this.f18869s;
        File file2 = this.f18871u;
        Objects.requireNonNull((a.C0154a) aVar2);
        if (file2.exists()) {
            ((a.C0154a) this.f18869s).c(this.f18871u, this.f18873w);
        }
        ((a.C0154a) this.f18869s).c(this.f18872v, this.f18871u);
        ((a.C0154a) this.f18869s).a(this.f18873w);
        this.B = (s) Y();
        this.E = false;
        this.I = false;
    }

    public final void n0(d dVar) {
        c cVar = dVar.f18888f;
        if (cVar != null) {
            cVar.c();
        }
        for (int i10 = 0; i10 < this.f18875z; i10++) {
            ((a.C0154a) this.f18869s).a(dVar.f18885c[i10]);
            long j3 = this.A;
            long[] jArr = dVar.f18884b;
            this.A = j3 - jArr[i10];
            jArr[i10] = 0;
        }
        this.D++;
        s sVar = this.B;
        sVar.f0("REMOVE");
        sVar.z(32);
        sVar.f0(dVar.f18883a);
        sVar.z(10);
        this.C.remove(dVar.f18883a);
        if (L()) {
            this.K.execute(this.L);
        }
    }

    public final void o0() {
        while (this.A > this.y) {
            n0(this.C.values().iterator().next());
        }
        this.H = false;
    }

    public final void p0(String str) {
        if (M.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException(e0.d.a("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }
}

package da;

import ca.h;
import ca.k;
import ca.o;
import ca.t;
import ca.y;
import da.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import r9.b0;
import r9.c0;
import r9.e0;
import r9.f;
import r9.f0;
import r9.g;
import r9.g0;
import r9.i0;
import r9.n;
import r9.s;
import r9.u;
import r9.v;
import r9.x;
import r9.y;
import r9.z;
import s9.e;
import u9.i;

/* loaded from: classes.dex */
public final class s<T> implements da.b<T> {

    /* renamed from: s */
    public final z f4065s;

    /* renamed from: t */
    public final Object[] f4066t;

    /* renamed from: u */
    public final f.a f4067u;

    /* renamed from: v */
    public final f<i0, T> f4068v;

    /* renamed from: w */
    public volatile boolean f4069w;
    @GuardedBy("this")
    @Nullable

    /* renamed from: x */
    public b0 f4070x;
    @GuardedBy("this")
    @Nullable
    public Throwable y;
    @GuardedBy("this")

    /* renamed from: z */
    public boolean f4071z;

    /* loaded from: classes.dex */
    public class a implements g {

        /* renamed from: a */
        public final /* synthetic */ d f4072a;

        public a(d dVar) {
            s.this = r1;
            this.f4072a = dVar;
        }

        public final void a(IOException iOException) {
            try {
                this.f4072a.b(s.this, iOException);
            } catch (Throwable th) {
                f0.n(th);
                th.printStackTrace();
            }
        }

        public final void b(g0 g0Var) {
            try {
                try {
                    this.f4072a.a(s.this, s.this.c(g0Var));
                } catch (Throwable th) {
                    f0.n(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                f0.n(th2);
                try {
                    this.f4072a.b(s.this, th2);
                } catch (Throwable th3) {
                    f0.n(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i0 {

        /* renamed from: t */
        public final i0 f4074t;

        /* renamed from: u */
        public final t f4075u;
        @Nullable

        /* renamed from: v */
        public IOException f4076v;

        /* loaded from: classes.dex */
        public class a extends k {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y yVar) {
                super(yVar);
                b.this = r1;
            }

            @Override // ca.k, ca.y
            public final long D(ca.f fVar, long j3) {
                try {
                    return super.D(fVar, 8192L);
                } catch (IOException e10) {
                    b.this.f4076v = e10;
                    throw e10;
                }
            }
        }

        public b(i0 i0Var) {
            this.f4074t = i0Var;
            a aVar = new a(i0Var.j());
            Logger logger = o.f2862a;
            this.f4075u = new t(aVar);
        }

        @Override // r9.i0
        public final long b() {
            return this.f4074t.b();
        }

        @Override // r9.i0
        public final x c() {
            return this.f4074t.c();
        }

        @Override // r9.i0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f4074t.close();
        }

        @Override // r9.i0
        public final h j() {
            return this.f4075u;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends i0 {
        @Nullable

        /* renamed from: t */
        public final x f4078t;

        /* renamed from: u */
        public final long f4079u;

        public c(@Nullable x xVar, long j3) {
            this.f4078t = xVar;
            this.f4079u = j3;
        }

        @Override // r9.i0
        public final long b() {
            return this.f4079u;
        }

        @Override // r9.i0
        public final x c() {
            return this.f4078t;
        }

        @Override // r9.i0
        public final h j() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public s(z zVar, Object[] objArr, f.a aVar, f<i0, T> fVar) {
        this.f4065s = zVar;
        this.f4066t = objArr;
        this.f4067u = aVar;
        this.f4068v = fVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Deque<r9.b0$a>, java.util.ArrayDeque] */
    @Override // da.b
    public final void G(d<T> dVar) {
        Cloneable cloneable;
        Throwable th;
        b0.a a10;
        synchronized (this) {
            if (this.f4071z) {
                throw new IllegalStateException("Already executed.");
            }
            this.f4071z = true;
            cloneable = this.f4070x;
            th = this.y;
            if (cloneable == null && th == null) {
                Cloneable a11 = a();
                this.f4070x = (b0) a11;
                cloneable = a11;
            }
        }
        if (th != null) {
            dVar.b(this, th);
            return;
        }
        if (this.f4069w) {
            ((b0) cloneable).cancel();
        }
        a aVar = new a(dVar);
        b0 b0Var = (b0) cloneable;
        synchronized (b0Var) {
            if (b0Var.f17306w) {
                throw new IllegalStateException("Already Executed");
            }
            b0Var.f17306w = true;
        }
        i iVar = b0Var.f17303t;
        Objects.requireNonNull(iVar);
        iVar.f19675f = z9.f.f21089a.k();
        Objects.requireNonNull(iVar.f19673d);
        n nVar = b0Var.f17302s.f17511s;
        b0.a aVar2 = new b0.a(aVar);
        synchronized (nVar) {
            nVar.f17456b.add(aVar2);
            if (!b0Var.f17305v && (a10 = nVar.a(aVar2.b())) != null) {
                aVar2.f17308u = a10.f17308u;
            }
        }
        nVar.d();
    }

    @Override // da.b
    public final synchronized c0 H() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return ((b0) b()).f17304u;
    }

    @Override // da.b
    public final boolean I() {
        boolean z10 = true;
        if (this.f4069w) {
            return true;
        }
        synchronized (this) {
            b0 b0Var = this.f4070x;
            if (b0Var == null || !b0Var.f17303t.e()) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List<r9.y$b>, java.util.ArrayList] */
    public final f a() {
        v vVar;
        f.a aVar = this.f4067u;
        z zVar = this.f4065s;
        Object[] objArr = this.f4066t;
        w<?>[] wVarArr = zVar.f4151j;
        int length = objArr.length;
        if (length == wVarArr.length) {
            y yVar = new y(zVar.f4144c, zVar.f4143b, zVar.f4145d, zVar.f4146e, zVar.f4147f, zVar.f4148g, zVar.f4149h, zVar.f4150i);
            if (zVar.f4152k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                wVarArr[i10].a(yVar, objArr[i10]);
            }
            v.a aVar2 = yVar.f4132d;
            v vVar2 = null;
            if (aVar2 != null) {
                vVar = aVar2.a();
            } else {
                v.a k10 = yVar.f4130b.k(yVar.f4131c);
                if (k10 != null) {
                    vVar2 = k10.a();
                }
                if (vVar2 == null) {
                    StringBuilder c10 = androidx.activity.result.a.c("Malformed URL. Base: ");
                    c10.append(yVar.f4130b);
                    c10.append(", Relative: ");
                    c10.append(yVar.f4131c);
                    throw new IllegalArgumentException(c10.toString());
                }
                vVar = vVar2;
            }
            f0 f0Var = yVar.f4139k;
            if (f0Var == null) {
                s.a aVar3 = yVar.f4138j;
                if (aVar3 != null) {
                    f0Var = new r9.s(aVar3.f17466a, aVar3.f17467b);
                } else {
                    y.a aVar4 = yVar.f4137i;
                    if (aVar4 != null) {
                        if (aVar4.f17508c.isEmpty()) {
                            throw new IllegalStateException("Multipart body must have at least one part.");
                        }
                        f0Var = new r9.y(aVar4.f17506a, aVar4.f17507b, aVar4.f17508c);
                    } else if (yVar.f4136h) {
                        long j3 = 0;
                        e.b(j3, j3, j3);
                        f0Var = new e0(0, new byte[0]);
                    }
                }
            }
            x xVar = yVar.f4135g;
            y.a aVar5 = f0Var;
            if (xVar != null) {
                if (f0Var != null) {
                    aVar5 = new y.a(f0Var, xVar);
                } else {
                    yVar.f4134f.a("Content-Type", xVar.f17494a);
                    aVar5 = f0Var;
                }
            }
            c0.a aVar6 = yVar.f4133e;
            Objects.requireNonNull(aVar6);
            aVar6.f17317a = vVar;
            ?? r22 = yVar.f4134f.f17473a;
            u.a aVar7 = new u.a();
            Collections.addAll(aVar7.f17473a, (String[]) r22.toArray(new String[r22.size()]));
            aVar6.f17319c = aVar7;
            aVar6.d(yVar.f4129a, aVar5);
            aVar6.f(m.class, new m(zVar.f4142a, arrayList));
            c0 a10 = aVar6.a();
            z zVar2 = (z) aVar;
            Objects.requireNonNull(zVar2);
            b0 b0Var = new b0(zVar2, a10, false);
            b0Var.f17303t = new i(zVar2, b0Var);
            return b0Var;
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + wVarArr.length + ")");
    }

    @GuardedBy("this")
    public final f b() {
        b0 b0Var = this.f4070x;
        if (b0Var != null) {
            return b0Var;
        }
        Throwable th = this.y;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (!(th instanceof RuntimeException)) {
                throw ((Error) th);
            }
            throw ((RuntimeException) th);
        }
        try {
            f a10 = a();
            this.f4070x = (b0) a10;
            return a10;
        } catch (IOException | Error | RuntimeException e10) {
            f0.n(e10);
            this.y = e10;
            throw e10;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final a0<T> c(g0 g0Var) {
        i0 i0Var = g0Var.y;
        g0.a aVar = new g0.a(g0Var);
        aVar.f17386g = new c(i0Var.c(), i0Var.b());
        g0 a10 = aVar.a();
        int i10 = a10.f17375u;
        if (i10 < 200 || i10 >= 300) {
            try {
                f0.a(i0Var);
                if (!a10.j()) {
                    a0<T> a0Var = new a0<>(a10, null);
                    i0Var.close();
                    return a0Var;
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } catch (Throwable th) {
                i0Var.close();
                throw th;
            }
        } else if (i10 != 204 && i10 != 205) {
            b bVar = new b(i0Var);
            try {
                return a0.b(this.f4068v.b(bVar), a10);
            } catch (RuntimeException e10) {
                IOException iOException = bVar.f4076v;
                if (iOException == null) {
                    throw e10;
                }
                throw iOException;
            }
        } else {
            i0Var.close();
            return a0.b(null, a10);
        }
    }

    @Override // da.b
    public final void cancel() {
        b0 b0Var;
        this.f4069w = true;
        synchronized (this) {
            b0Var = this.f4070x;
        }
        if (b0Var != null) {
            b0Var.cancel();
        }
    }

    public final Object clone() {
        return new s(this.f4065s, this.f4066t, this.f4067u, this.f4068v);
    }

    @Override // da.b
    public final da.b j() {
        return new s(this.f4065s, this.f4066t, this.f4067u, this.f4068v);
    }
}

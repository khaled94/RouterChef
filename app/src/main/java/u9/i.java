package u9;

import ca.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import m4.p41;
import r9.c0;
import r9.f;
import r9.r;
import r9.z;
import s9.e;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public final z f19670a;

    /* renamed from: b */
    public final f f19671b;

    /* renamed from: c */
    public final f f19672c;

    /* renamed from: d */
    public final r f19673d;

    /* renamed from: e */
    public final a f19674e;
    @Nullable

    /* renamed from: f */
    public Object f19675f;

    /* renamed from: g */
    public c0 f19676g;

    /* renamed from: h */
    public d f19677h;

    /* renamed from: i */
    public e f19678i;
    @Nullable

    /* renamed from: j */
    public c f19679j;

    /* renamed from: k */
    public boolean f19680k;

    /* renamed from: l */
    public boolean f19681l;

    /* renamed from: m */
    public boolean f19682m;

    /* renamed from: n */
    public boolean f19683n;

    /* renamed from: o */
    public boolean f19684o;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
            i.this = r1;
        }

        @Override // ca.c
        public final void n() {
            i.this.b();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends WeakReference<i> {

        /* renamed from: a */
        public final Object f19686a;

        public b(i iVar, Object obj) {
            super(iVar);
            this.f19686a = obj;
        }
    }

    public i(z zVar, f fVar) {
        a aVar = new a();
        this.f19674e = aVar;
        this.f19670a = zVar;
        z.a aVar2 = s9.a.f18391a;
        p41 p41Var = zVar.I;
        Objects.requireNonNull(aVar2);
        this.f19671b = (f) p41Var.f12406s;
        this.f19672c = fVar;
        this.f19673d = zVar.f17516x.f17461a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.g(0);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<java.lang.ref.Reference<u9.i>>, java.util.ArrayList] */
    public final void a(e eVar) {
        if (this.f19678i == null) {
            this.f19678i = eVar;
            eVar.p.add(new b(this, this.f19675f));
            return;
        }
        throw new IllegalStateException();
    }

    public final void b() {
        c cVar;
        e eVar;
        synchronized (this.f19671b) {
            this.f19682m = true;
            cVar = this.f19679j;
            d dVar = this.f19677h;
            if (dVar == null || (eVar = dVar.f19634h) == null) {
                eVar = this.f19678i;
            }
        }
        if (cVar != null) {
            cVar.f19615d.cancel();
        } else if (eVar == null) {
        } else {
            e.d(eVar.f19639d);
        }
    }

    public final void c() {
        synchronized (this.f19671b) {
            if (this.f19684o) {
                throw new IllegalStateException();
            }
            this.f19679j = null;
        }
    }

    @Nullable
    public final IOException d(c cVar, boolean z10, boolean z11, @Nullable IOException iOException) {
        boolean z12;
        synchronized (this.f19671b) {
            c cVar2 = this.f19679j;
            if (cVar != cVar2) {
                return iOException;
            }
            boolean z13 = true;
            if (z10) {
                z12 = !this.f19680k;
                this.f19680k = true;
            } else {
                z12 = false;
            }
            if (z11) {
                if (!this.f19681l) {
                    z12 = true;
                }
                this.f19681l = true;
            }
            if (!this.f19680k || !this.f19681l || !z12) {
                z13 = false;
            } else {
                cVar2.b().f19648m++;
                this.f19679j = null;
            }
            return z13 ? f(iOException, false) : iOException;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f19671b) {
            z10 = this.f19682m;
        }
        return z10;
    }

    @Nullable
    public final IOException f(@Nullable IOException iOException, boolean z10) {
        e eVar;
        Socket h10;
        boolean z11;
        synchronized (this.f19671b) {
            if (z10) {
                if (this.f19679j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            eVar = this.f19678i;
            h10 = (eVar == null || this.f19679j != null || (!z10 && !this.f19684o)) ? null : h();
            if (this.f19678i != null) {
                eVar = null;
            }
            z11 = true;
            if (!this.f19684o || this.f19679j != null) {
                z11 = false;
            }
        }
        e.d(h10);
        if (eVar != null) {
            Objects.requireNonNull(this.f19673d);
        }
        if (z11) {
            if (!this.f19683n && this.f19674e.l()) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                iOException = interruptedIOException;
            }
            Objects.requireNonNull(this.f19673d);
        }
        return iOException;
    }

    @Nullable
    public final IOException g(@Nullable IOException iOException) {
        synchronized (this.f19671b) {
            this.f19684o = true;
        }
        return f(iOException, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<java.lang.ref.Reference<u9.i>>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Deque<u9.e>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<java.lang.ref.Reference<u9.i>>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<java.lang.ref.Reference<u9.i>>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List<java.lang.ref.Reference<u9.i>>, java.util.ArrayList] */
    @Nullable
    public final Socket h() {
        int size = this.f19678i.p.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((Reference) this.f19678i.p.get(i10)).get() == this) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            e eVar = this.f19678i;
            eVar.p.remove(i10);
            this.f19678i = null;
            if (eVar.p.isEmpty()) {
                eVar.f19651q = System.nanoTime();
                f fVar = this.f19671b;
                Objects.requireNonNull(fVar);
                if (eVar.f19646k || fVar.f19653a == 0) {
                    fVar.f19656d.remove(eVar);
                    z10 = true;
                } else {
                    fVar.notifyAll();
                }
                if (z10) {
                    return eVar.f19640e;
                }
            }
            return null;
        }
        throw new IllegalStateException();
    }
}

package d4;

import a4.f;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import c4.u;
import c4.v;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public abstract class b<T extends IInterface> {

    /* renamed from: x */
    public static final a4.d[] f3804x = new a4.d[0];

    /* renamed from: a */
    public volatile String f3805a;

    /* renamed from: b */
    public d1 f3806b;

    /* renamed from: c */
    public final Context f3807c;

    /* renamed from: d */
    public final g f3808d;

    /* renamed from: e */
    public final f f3809e;

    /* renamed from: f */
    public final o0 f3810f;

    /* renamed from: g */
    public final Object f3811g;

    /* renamed from: h */
    public final Object f3812h;
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: i */
    public j f3813i;

    /* renamed from: j */
    public c f3814j;
    @GuardedBy("mLock")

    /* renamed from: k */
    public T f3815k;

    /* renamed from: l */
    public final ArrayList<p0<?>> f3816l;
    @GuardedBy("mLock")

    /* renamed from: m */
    public r0 f3817m;
    @GuardedBy("mLock")

    /* renamed from: n */
    public int f3818n;

    /* renamed from: o */
    public final a f3819o;
    public final AbstractC0056b p;

    /* renamed from: q */
    public final int f3820q;

    /* renamed from: r */
    public final String f3821r;

    /* renamed from: s */
    public volatile String f3822s;

    /* renamed from: t */
    public a4.b f3823t;

    /* renamed from: u */
    public boolean f3824u;

    /* renamed from: v */
    public volatile u0 f3825v;

    /* renamed from: w */
    public AtomicInteger f3826w;

    /* loaded from: classes.dex */
    public interface a {
        void e0();

        void w(int i10);
    }

    /* renamed from: d4.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0056b {
        void c0(a4.b bVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(a4.b bVar);
    }

    /* loaded from: classes.dex */
    public class d implements c {
        public d() {
            b.this = r1;
        }

        @Override // d4.b.c
        public final void a(a4.b bVar) {
            if (bVar.t()) {
                b bVar2 = b.this;
                bVar2.c(null, bVar2.u());
                return;
            }
            AbstractC0056b abstractC0056b = b.this.p;
            if (abstractC0056b == null) {
                return;
            }
            abstractC0056b.c0(bVar);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.Context r10, android.os.Looper r11, int r12, d4.b.a r13, d4.b.AbstractC0056b r14) {
        /*
            r9 = this;
            d4.g r3 = d4.g.a(r10)
            a4.f r4 = a4.f.f133b
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r13, r0)
            java.util.Objects.requireNonNull(r14, r0)
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.b.<init>(android.content.Context, android.os.Looper, int, d4.b$a, d4.b$b):void");
    }

    public b(Context context, Looper looper, g gVar, f fVar, int i10, a aVar, AbstractC0056b abstractC0056b, String str) {
        this.f3805a = null;
        this.f3811g = new Object();
        this.f3812h = new Object();
        this.f3816l = new ArrayList<>();
        this.f3818n = 1;
        this.f3823t = null;
        this.f3824u = false;
        this.f3825v = null;
        this.f3826w = new AtomicInteger(0);
        m.i(context, "Context must not be null");
        this.f3807c = context;
        m.i(looper, "Looper must not be null");
        m.i(gVar, "Supervisor must not be null");
        this.f3808d = gVar;
        m.i(fVar, "API availability must not be null");
        this.f3809e = fVar;
        this.f3810f = new o0(this, looper);
        this.f3820q = i10;
        this.f3819o = aVar;
        this.p = abstractC0056b;
        this.f3821r = str;
    }

    public static /* bridge */ /* synthetic */ void A(b bVar) {
        int i10;
        int i11;
        synchronized (bVar.f3811g) {
            i10 = bVar.f3818n;
        }
        if (i10 == 3) {
            bVar.f3824u = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        o0 o0Var = bVar.f3810f;
        o0Var.sendMessage(o0Var.obtainMessage(i11, bVar.f3826w.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean B(b bVar, int i10, int i11, IInterface iInterface) {
        synchronized (bVar.f3811g) {
            if (bVar.f3818n != i10) {
                return false;
            }
            bVar.D(i11, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        */
    public static /* bridge */ /* synthetic */ boolean C(d4.b r2) {
        /*
            boolean r0 = r2.f3824u
            r1 = 0
            if (r0 == 0) goto L6
            goto L21
        L6:
            java.lang.String r0 = r2.w()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L21
        L11:
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
            goto L21
        L19:
            java.lang.String r2 = r2.w()     // Catch: java.lang.ClassNotFoundException -> L21
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L21
            r1 = 1
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.b.C(d4.b):boolean");
    }

    public final void D(int i10, T t10) {
        d1 d1Var;
        boolean z10 = false;
        if ((i10 == 4) == (t10 != null)) {
            z10 = true;
        }
        m.a(z10);
        synchronized (this.f3811g) {
            try {
                this.f3818n = i10;
                this.f3815k = t10;
                if (i10 == 1) {
                    r0 r0Var = this.f3817m;
                    if (r0Var != null) {
                        g gVar = this.f3808d;
                        String str = this.f3806b.f3857a;
                        m.h(str);
                        Objects.requireNonNull(this.f3806b);
                        z();
                        gVar.c(str, "com.google.android.gms", 4225, r0Var, this.f3806b.f3858b);
                        this.f3817m = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    r0 r0Var2 = this.f3817m;
                    if (r0Var2 != null && (d1Var = this.f3806b) != null) {
                        String str2 = d1Var.f3857a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on ");
                        sb.append("com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        g gVar2 = this.f3808d;
                        String str3 = this.f3806b.f3857a;
                        m.h(str3);
                        Objects.requireNonNull(this.f3806b);
                        z();
                        gVar2.c(str3, "com.google.android.gms", 4225, r0Var2, this.f3806b.f3858b);
                        this.f3826w.incrementAndGet();
                    }
                    r0 r0Var3 = new r0(this, this.f3826w.get());
                    this.f3817m = r0Var3;
                    String x10 = x();
                    Object obj = g.f3873a;
                    boolean y = y();
                    this.f3806b = new d1(x10, y);
                    if (y && f() < 17895000) {
                        String valueOf = String.valueOf(this.f3806b.f3857a);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                    }
                    g gVar3 = this.f3808d;
                    String str4 = this.f3806b.f3857a;
                    m.h(str4);
                    Objects.requireNonNull(this.f3806b);
                    String z11 = z();
                    boolean z12 = this.f3806b.f3858b;
                    s();
                    if (!gVar3.d(new y0(str4, "com.google.android.gms", 4225, z12), r0Var3, z11, null)) {
                        String str5 = this.f3806b.f3857a;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on ");
                        sb2.append("com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i11 = this.f3826w.get();
                        o0 o0Var = this.f3810f;
                        o0Var.sendMessage(o0Var.obtainMessage(7, i11, -1, new t0(this, 16)));
                    }
                } else if (i10 == 4) {
                    Objects.requireNonNull(t10, "null reference");
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f3811g) {
            z10 = this.f3818n == 4;
        }
        return z10;
    }

    public final void c(h hVar, Set<Scope> set) {
        Throwable e10;
        Bundle t10 = t();
        d4.e eVar = new d4.e(this.f3820q, this.f3822s);
        eVar.f3862v = this.f3807c.getPackageName();
        eVar.y = t10;
        if (set != null) {
            eVar.f3864x = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (l()) {
            Account q10 = q();
            if (q10 == null) {
                q10 = new Account("<<default account>>", "com.google");
            }
            eVar.f3865z = q10;
            if (hVar != null) {
                eVar.f3863w = hVar.asBinder();
            }
        }
        eVar.A = f3804x;
        eVar.B = r();
        if (this instanceof o4.c) {
            eVar.E = true;
        }
        try {
            synchronized (this.f3812h) {
                j jVar = this.f3813i;
                if (jVar != null) {
                    jVar.m3(new q0(this, this.f3826w.get()), eVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e11) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e11);
            o0 o0Var = this.f3810f;
            o0Var.sendMessage(o0Var.obtainMessage(6, this.f3826w.get(), 3));
        } catch (RemoteException e12) {
            e10 = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i10 = this.f3826w.get();
            o0 o0Var2 = this.f3810f;
            o0Var2.sendMessage(o0Var2.obtainMessage(1, i10, -1, new s0(this, 8, null, null)));
        } catch (SecurityException e13) {
            throw e13;
        } catch (RuntimeException e14) {
            e10 = e14;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i102 = this.f3826w.get();
            o0 o0Var22 = this.f3810f;
            o0Var22.sendMessage(o0Var22.obtainMessage(1, i102, -1, new s0(this, 8, null, null)));
        }
    }

    public final void d(String str) {
        this.f3805a = str;
        p();
    }

    public final boolean e() {
        return true;
    }

    public int f() {
        return f.f132a;
    }

    public final boolean g() {
        boolean z10;
        synchronized (this.f3811g) {
            int i10 = this.f3818n;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public final a4.d[] h() {
        u0 u0Var = this.f3825v;
        if (u0Var == null) {
            return null;
        }
        return u0Var.f3922t;
    }

    public final String i() {
        if (!a() || this.f3806b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return "com.google.android.gms";
    }

    public final String j() {
        return this.f3805a;
    }

    public final void k(e eVar) {
        v vVar = (v) eVar;
        vVar.f2742a.E.F.post(new u(vVar));
    }

    public boolean l() {
        return false;
    }

    public final void m(c cVar) {
        this.f3814j = cVar;
        D(2, null);
    }

    public final void n() {
        int c10 = this.f3809e.c(this.f3807c, f());
        if (c10 != 0) {
            D(1, null);
            this.f3814j = new d();
            o0 o0Var = this.f3810f;
            o0Var.sendMessage(o0Var.obtainMessage(3, this.f3826w.get(), c10, null));
            return;
        }
        m(new d());
    }

    public abstract T o(IBinder iBinder);

    public final void p() {
        this.f3826w.incrementAndGet();
        synchronized (this.f3816l) {
            try {
                int size = this.f3816l.size();
                for (int i10 = 0; i10 < size; i10++) {
                    p0<?> p0Var = this.f3816l.get(i10);
                    synchronized (p0Var) {
                        p0Var.f3905a = null;
                    }
                }
                this.f3816l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f3812h) {
            this.f3813i = null;
        }
        D(1, null);
    }

    public Account q() {
        return null;
    }

    public a4.d[] r() {
        return f3804x;
    }

    public void s() {
    }

    public Bundle t() {
        return new Bundle();
    }

    public Set<Scope> u() {
        return Collections.emptySet();
    }

    public final T v() {
        T t10;
        synchronized (this.f3811g) {
            if (this.f3818n != 5) {
                if (a()) {
                    t10 = this.f3815k;
                    m.i(t10, "Client is connected but service is null");
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } else {
                throw new DeadObjectException();
            }
        }
        return t10;
    }

    public abstract String w();

    public abstract String x();

    public boolean y() {
        return f() >= 211700000;
    }

    public final String z() {
        String str = this.f3821r;
        return str == null ? this.f3807c.getClass().getName() : str;
    }
}

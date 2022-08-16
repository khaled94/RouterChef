package b4;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import b4.a;
import b4.a.c;
import c4.b;
import c4.d0;
import c4.e;
import c4.f0;
import c4.l;
import c4.m0;
import c4.w;
import c5.b0;
import c5.i;
import c5.j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import d4.c;
import d4.d;
import d4.m;
import d4.n;
import d4.o;
import h4.f;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class c<O extends a.c> {

    /* renamed from: a */
    public final Context f2561a;

    /* renamed from: b */
    public final String f2562b;

    /* renamed from: c */
    public final b4.a<O> f2563c;

    /* renamed from: d */
    public final O f2564d;

    /* renamed from: e */
    public final b<O> f2565e;

    /* renamed from: f */
    public final int f2566f;

    /* renamed from: g */
    public final c4.a f2567g;

    /* renamed from: h */
    public final e f2568h;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b */
        public static final a f2569b = new a(new c4.a(), Looper.getMainLooper());

        /* renamed from: a */
        public final c4.a f2570a;

        public a(c4.a aVar, Looper looper) {
            this.f2570a = aVar;
        }
    }

    public c(Context context, b4.a<O> aVar, O o10, a aVar2) {
        String str;
        m.i(context, "Null context is not permitted.");
        m.i(aVar, "Api must not be null.");
        m.i(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f2561a = context.getApplicationContext();
        if (f.c()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            this.f2562b = str;
            this.f2563c = aVar;
            this.f2564d = o10;
            this.f2565e = new b<>(aVar, o10, str);
            e f10 = e.f(this.f2561a);
            this.f2568h = f10;
            this.f2566f = f10.f2691z.getAndIncrement();
            this.f2567g = aVar2.f2570a;
            p4.f fVar = f10.F;
            fVar.sendMessage(fVar.obtainMessage(7, this));
        }
        str = null;
        this.f2562b = str;
        this.f2563c = aVar;
        this.f2564d = o10;
        this.f2565e = new b<>(aVar, o10, str);
        e f102 = e.f(this.f2561a);
        this.f2568h = f102;
        this.f2566f = f102.f2691z.getAndIncrement();
        this.f2567g = aVar2.f2570a;
        p4.f fVar2 = f102.F;
        fVar2.sendMessage(fVar2.obtainMessage(7, this));
    }

    public final c.a a() {
        GoogleSignInAccount b10;
        GoogleSignInAccount b11;
        c.a aVar = new c.a();
        O o10 = this.f2564d;
        Account account = null;
        if ((o10 instanceof a.c.b) && (b11 = ((a.c.b) o10).b()) != null) {
            String str = b11.f2920v;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        } else {
            O o11 = this.f2564d;
            if (o11 instanceof a.c.AbstractC0033a) {
                account = ((a.c.AbstractC0033a) o11).a();
            }
        }
        aVar.f3842a = account;
        O o12 = this.f2564d;
        Set<Scope> emptySet = (!(o12 instanceof a.c.b) || (b10 = ((a.c.b) o12).b()) == null) ? Collections.emptySet() : b10.s();
        if (aVar.f3843b == null) {
            aVar.f3843b = new r.c<>(0);
        }
        aVar.f3843b.addAll(emptySet);
        aVar.f3845d = this.f2561a.getClass().getName();
        aVar.f3844c = this.f2561a.getPackageName();
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Map<c4.b<?>, c4.w<?>>, java.util.concurrent.ConcurrentHashMap] */
    public final <TResult, A> i<TResult> b(int i10, l<A, TResult> lVar) {
        j jVar = new j();
        e eVar = this.f2568h;
        c4.a aVar = this.f2567g;
        Objects.requireNonNull(eVar);
        int i11 = lVar.f2711c;
        if (i11 != 0) {
            b<O> bVar = this.f2565e;
            d0 d0Var = null;
            if (eVar.a()) {
                o oVar = n.a().f3896a;
                boolean z10 = true;
                if (oVar != null) {
                    if (oVar.f3898t) {
                        boolean z11 = oVar.f3899u;
                        w wVar = (w) eVar.B.get(bVar);
                        if (wVar != null) {
                            a.e eVar2 = wVar.f2745t;
                            if (eVar2 instanceof d4.b) {
                                d4.b bVar2 = (d4.b) eVar2;
                                if ((bVar2.f3825v != null) && !bVar2.g()) {
                                    d a10 = d0.a(wVar, bVar2, i11);
                                    if (a10 != null) {
                                        wVar.D++;
                                        z10 = a10.f3853u;
                                    }
                                }
                            }
                        }
                        z10 = z11;
                    }
                }
                long j3 = 0;
                long currentTimeMillis = z10 ? System.currentTimeMillis() : 0L;
                if (z10) {
                    j3 = SystemClock.elapsedRealtime();
                }
                d0Var = new d0(eVar, i11, bVar, currentTimeMillis, j3);
            }
            if (d0Var != null) {
                b0<TResult> b0Var = jVar.f2776a;
                final p4.f fVar = eVar.F;
                Objects.requireNonNull(fVar);
                b0Var.b(new Executor() { // from class: c4.q
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        fVar.post(runnable);
                    }
                }, d0Var);
            }
        }
        m0 m0Var = new m0(i10, lVar, jVar, aVar);
        p4.f fVar2 = eVar.F;
        fVar2.sendMessage(fVar2.obtainMessage(4, new f0(m0Var, eVar.A.get(), this)));
        return jVar.f2776a;
    }
}

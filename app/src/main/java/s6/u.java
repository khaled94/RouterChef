package s6;

import android.content.Context;
import android.util.Log;
import c5.i;
import c5.l;
import d4.p;
import e.o;
import h6.d;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import t6.b;
import z6.c;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    public final Context f18315a;

    /* renamed from: b */
    public final z f18316b;

    /* renamed from: c */
    public final long f18317c = System.currentTimeMillis();

    /* renamed from: d */
    public p f18318d;

    /* renamed from: e */
    public p f18319e;

    /* renamed from: f */
    public o f18320f;

    /* renamed from: g */
    public final d0 f18321g;

    /* renamed from: h */
    public final r6.b f18322h;

    /* renamed from: i */
    public final q6.a f18323i;

    /* renamed from: j */
    public final ExecutorService f18324j;

    /* renamed from: k */
    public final f f18325k;

    /* renamed from: l */
    public final p6.a f18326l;

    /* loaded from: classes.dex */
    public class a implements Callable<Boolean> {
        public a() {
            u.this = r1;
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() {
            try {
                boolean delete = u.this.f18318d.d().delete();
                if (!delete) {
                    Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                }
                return Boolean.valueOf(delete);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements b.a {

        /* renamed from: a */
        public final o f18328a;

        public b(o oVar) {
            this.f18328a = oVar;
        }
    }

    public u(d dVar, d0 d0Var, p6.a aVar, z zVar, r6.b bVar, q6.a aVar2, ExecutorService executorService) {
        this.f18316b = zVar;
        dVar.a();
        this.f18315a = dVar.f5112a;
        this.f18321g = d0Var;
        this.f18326l = aVar;
        this.f18322h = bVar;
        this.f18323i = aVar2;
        this.f18324j = executorService;
        this.f18325k = new f(executorService);
    }

    public static i a(u uVar, c cVar) {
        i<Void> iVar;
        uVar.f18325k.a();
        uVar.f18318d.b();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                uVar.f18322h.a(new r6.a() { // from class: s6.r
                    @Override // r6.a
                    public final void a(String str) {
                        u uVar2 = u.this;
                        Objects.requireNonNull(uVar2);
                        long currentTimeMillis = System.currentTimeMillis() - uVar2.f18317c;
                        o oVar = uVar2.f18320f;
                        oVar.f18291d.b(new p(oVar, currentTimeMillis, str));
                    }
                });
                z6.b bVar = (z6.b) cVar;
                if (!bVar.b().b().f282a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    iVar = l.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                } else {
                    if (!uVar.f18320f.e(bVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    iVar = uVar.f18320f.h(bVar.f21000i.get().f2776a);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                iVar = l.d(e10);
            }
            return iVar;
        } finally {
            uVar.b();
        }
    }

    public final void b() {
        this.f18325k.b(new a());
    }
}

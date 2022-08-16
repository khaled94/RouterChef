package com.google.firebase.messaging;

import a3.p;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import c5.b0;
import c5.h;
import c5.i;
import c5.l;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import d4.m;
import h6.d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l7.a;
import l7.b;
import m7.j;
import p7.f;
import q2.g;
import u7.f0;
import u7.j0;
import u7.n0;
import u7.q;
import u7.s;
import u7.v;
import u7.z;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: n */
    public static final long f3462n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o */
    public static com.google.firebase.messaging.a f3463o;
    @SuppressLint({"FirebaseUnknownNullness"})
    public static g p;

    /* renamed from: q */
    public static ScheduledThreadPoolExecutor f3464q;

    /* renamed from: a */
    public final d f3465a;

    /* renamed from: b */
    public final n7.a f3466b;

    /* renamed from: c */
    public final f f3467c;

    /* renamed from: d */
    public final Context f3468d;

    /* renamed from: e */
    public final v f3469e;

    /* renamed from: f */
    public final f0 f3470f;

    /* renamed from: g */
    public final a f3471g;

    /* renamed from: h */
    public final Executor f3472h;

    /* renamed from: i */
    public final Executor f3473i;

    /* renamed from: j */
    public final i<n0> f3474j;

    /* renamed from: k */
    public final z f3475k;

    /* renamed from: l */
    public boolean f3476l = false;

    /* renamed from: m */
    public final q f3477m;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public final l7.d f3478a;

        /* renamed from: b */
        public boolean f3479b;

        /* renamed from: c */
        public b<h6.a> f3480c;

        /* renamed from: d */
        public Boolean f3481d;

        public a(l7.d dVar) {
            FirebaseMessaging.this = r1;
            this.f3478a = dVar;
        }

        public final synchronized void a() {
            if (this.f3479b) {
                return;
            }
            Boolean c10 = c();
            this.f3481d = c10;
            if (c10 == null) {
                b<h6.a> bVar = new b() { // from class: u7.t
                    @Override // l7.b
                    public final void a(a aVar) {
                        FirebaseMessaging.a aVar2 = FirebaseMessaging.a.this;
                        if (aVar2.b()) {
                            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                            com.google.firebase.messaging.a aVar3 = FirebaseMessaging.f3463o;
                            firebaseMessaging.g();
                        }
                    }
                };
                this.f3480c = bVar;
                this.f3478a.a(bVar);
            }
            this.f3479b = true;
        }

        public final synchronized boolean b() {
            Boolean bool;
            a();
            bool = this.f3481d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f3465a.g();
        }

        public final Boolean c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            d dVar = FirebaseMessaging.this.f3465a;
            dVar.a();
            Context context = dVar.f5112a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(d dVar, n7.a aVar, o7.b<w7.g> bVar, o7.b<j> bVar2, f fVar, g gVar, l7.d dVar2) {
        dVar.a();
        final z zVar = new z(dVar.f5112a);
        final v vVar = new v(dVar, zVar, bVar, bVar2, fVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new i4.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new i4.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i4.a("Firebase-Messaging-File-Io"));
        p = gVar;
        this.f3465a = dVar;
        this.f3466b = aVar;
        this.f3467c = fVar;
        this.f3471g = new a(dVar2);
        dVar.a();
        final Context context = dVar.f5112a;
        this.f3468d = context;
        q qVar = new q();
        this.f3477m = qVar;
        this.f3475k = zVar;
        this.f3472h = newSingleThreadExecutor;
        this.f3469e = vVar;
        this.f3470f = new f0(newSingleThreadExecutor);
        this.f3473i = threadPoolExecutor;
        dVar.a();
        Context context2 = dVar.f5112a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(qVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.c();
        }
        scheduledThreadPoolExecutor.execute(new g1.q(this, 1));
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new i4.a("Firebase-Messaging-Topics-Io"));
        int i10 = n0.f19545j;
        i c10 = l.c(scheduledThreadPoolExecutor2, new Callable() { // from class: u7.m0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                l0 l0Var;
                Context context3 = context;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                z zVar2 = zVar;
                v vVar2 = vVar;
                synchronized (l0.class) {
                    WeakReference<l0> weakReference = l0.f19532c;
                    l0Var = weakReference != null ? weakReference.get() : null;
                    if (l0Var == null) {
                        SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                        l0 l0Var2 = new l0(sharedPreferences, scheduledExecutorService);
                        synchronized (l0Var2) {
                            l0Var2.f19533a = i0.a(sharedPreferences, scheduledExecutorService);
                        }
                        l0.f19532c = new WeakReference<>(l0Var2);
                        l0Var = l0Var2;
                    }
                }
                return new n0(firebaseMessaging, zVar2, l0Var, vVar2, context3, scheduledExecutorService);
            }
        });
        this.f3474j = (b0) c10;
        c10.d(scheduledThreadPoolExecutor, new p(this));
        scheduledThreadPoolExecutor.execute(new s(this, 0));
    }

    public static synchronized com.google.firebase.messaging.a c(Context context) {
        com.google.firebase.messaging.a aVar;
        synchronized (FirebaseMessaging.class) {
            if (f3463o == null) {
                f3463o = new com.google.firebase.messaging.a(context);
            }
            aVar = f3463o;
        }
        return aVar;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(d dVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) dVar.b(FirebaseMessaging.class);
            m.i(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [r.g, java.util.Map<java.lang.String, c5.i<java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [r.g, java.util.Map<java.lang.String, c5.i<java.lang.String>>] */
    public final String a() {
        i iVar;
        n7.a aVar = this.f3466b;
        if (aVar != null) {
            try {
                return (String) l.a(aVar.b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final a.C0052a e11 = e();
        if (!i(e11)) {
            return e11.f3486a;
        }
        final String b10 = z.b(this.f3465a);
        final f0 f0Var = this.f3470f;
        synchronized (f0Var) {
            iVar = (i) f0Var.f19496b.getOrDefault(b10, null);
            if (iVar == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b10);
                }
                v vVar = this.f3469e;
                iVar = vVar.a(vVar.c(z.b(vVar.f19592a), "*", new Bundle())).p(this.f3473i, new h() { // from class: u7.r
                    @Override // c5.h
                    public final i a(Object obj) {
                        FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                        String str = b10;
                        a.C0052a c0052a = e11;
                        String str2 = (String) obj;
                        com.google.firebase.messaging.a c10 = FirebaseMessaging.c(firebaseMessaging.f3468d);
                        String d5 = firebaseMessaging.d();
                        String a10 = firebaseMessaging.f3475k.a();
                        synchronized (c10) {
                            String a11 = a.C0052a.a(str2, a10, System.currentTimeMillis());
                            if (a11 != null) {
                                SharedPreferences.Editor edit = c10.f3484a.edit();
                                edit.putString(c10.a(d5, str), a11);
                                edit.commit();
                            }
                        }
                        if (c0052a == null || !str2.equals(c0052a.f3486a)) {
                            d dVar = firebaseMessaging.f3465a;
                            dVar.a();
                            if ("[DEFAULT]".equals(dVar.f5113b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    StringBuilder c11 = androidx.activity.result.a.c("Invoking onNewToken for app: ");
                                    d dVar2 = firebaseMessaging.f3465a;
                                    dVar2.a();
                                    c11.append(dVar2.f5113b);
                                    Log.d("FirebaseMessaging", c11.toString());
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new o(firebaseMessaging.f3468d).b(intent);
                            }
                        }
                        return l.e(str2);
                    }
                }).h(f0Var.f19495a, new c5.a() { // from class: u7.e0
                    /* JADX WARN: Type inference failed for: r2v0, types: [r.g, java.util.Map<java.lang.String, c5.i<java.lang.String>>] */
                    @Override // c5.a
                    public final Object d(i iVar2) {
                        f0 f0Var2 = f0.this;
                        String str = b10;
                        synchronized (f0Var2) {
                            f0Var2.f19496b.remove(str);
                        }
                        return iVar2;
                    }
                });
                f0Var.f19496b.put(b10, iVar);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + b10);
            }
        }
        try {
            return (String) l.a(iVar);
        } catch (InterruptedException | ExecutionException e12) {
            throw new IOException(e12);
        }
    }

    public final void b(Runnable runnable, long j3) {
        synchronized (FirebaseMessaging.class) {
            if (f3464q == null) {
                f3464q = new ScheduledThreadPoolExecutor(1, new i4.a("TAG"));
            }
            f3464q.schedule(runnable, j3, TimeUnit.SECONDS);
        }
    }

    public final String d() {
        d dVar = this.f3465a;
        dVar.a();
        return "[DEFAULT]".equals(dVar.f5113b) ? "" : this.f3465a.d();
    }

    public final a.C0052a e() {
        a.C0052a b10;
        com.google.firebase.messaging.a c10 = c(this.f3468d);
        String d5 = d();
        String b11 = z.b(this.f3465a);
        synchronized (c10) {
            b10 = a.C0052a.b(c10.f3484a.getString(c10.a(d5, b11), null));
        }
        return b10;
    }

    public final synchronized void f(boolean z10) {
        this.f3476l = z10;
    }

    public final void g() {
        n7.a aVar = this.f3466b;
        if (aVar != null) {
            aVar.a();
        } else if (!i(e())) {
        } else {
            synchronized (this) {
                if (!this.f3476l) {
                    h(0L);
                }
            }
        }
    }

    public final synchronized void h(long j3) {
        b(new j0(this, Math.min(Math.max(30L, 2 * j3), f3462n)), j3);
        this.f3476l = true;
    }

    public final boolean i(a.C0052a c0052a) {
        if (c0052a != null) {
            if (!(System.currentTimeMillis() > c0052a.f3488c + a.C0052a.f3485d || !this.f3475k.a().equals(c0052a.f3487b))) {
                return false;
            }
        }
        return true;
    }
}

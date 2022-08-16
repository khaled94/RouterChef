package h6;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import c4.c;
import d4.l;
import d4.m;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m7.g;
import n6.k;
import n6.t;
import r.f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: j */
    public static final Object f5109j = new Object();

    /* renamed from: k */
    public static final c f5110k = new c();

    /* renamed from: l */
    public static final Map<String, d> f5111l = new r.a();

    /* renamed from: a */
    public final Context f5112a;

    /* renamed from: b */
    public final String f5113b;

    /* renamed from: c */
    public final h f5114c;

    /* renamed from: d */
    public final k f5115d;

    /* renamed from: g */
    public final t<t7.a> f5118g;

    /* renamed from: h */
    public final o7.b<g> f5119h;

    /* renamed from: e */
    public final AtomicBoolean f5116e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f5117f = new AtomicBoolean();

    /* renamed from: i */
    public final List<a> f5120i = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    @TargetApi(14)
    /* loaded from: classes.dex */
    public static class b implements c.a {

        /* renamed from: a */
        public static AtomicReference<b> f5121a = new AtomicReference<>();

        /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List<h6.d$a>, java.util.concurrent.CopyOnWriteArrayList] */
        @Override // c4.c.a
        public final void a(boolean z10) {
            Object obj = d.f5109j;
            synchronized (d.f5109j) {
                Iterator it = new ArrayList(d.f5111l.values()).iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar.f5116e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = dVar.f5120i.iterator();
                        while (it2.hasNext()) {
                            ((a) it2.next()).a(z10);
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Executor {

        /* renamed from: s */
        public static final Handler f5122s = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            f5122s.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: h6.d$d */
    /* loaded from: classes.dex */
    public static class C0072d extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<C0072d> f5123b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f5124a;

        public C0072d(Context context) {
            this.f5124a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object obj = d.f5109j;
            synchronized (d.f5109j) {
                Iterator it = ((f.e) d.f5111l.values()).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).e();
                }
            }
            this.f5124a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[LOOP:1: B:25:0x00ad->B:27:0x00b3, LOOP_END] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List<h6.d$a>, java.util.concurrent.CopyOnWriteArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(final android.content.Context r9, java.lang.String r10, h6.h r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.d.<init>(android.content.Context, java.lang.String, h6.h):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.String, h6.d>, r.g] */
    public static d c() {
        d dVar;
        synchronized (f5109j) {
            dVar = (d) f5111l.getOrDefault("[DEFAULT]", null);
            if (dVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + h4.g.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<java.lang.String, h6.d>, r.g] */
    public static d f(Context context, h hVar) {
        d dVar;
        AtomicReference<b> atomicReference = b.f5121a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (b.f5121a.get() == null) {
                b bVar = new b();
                if (b.f5121a.compareAndSet(null, bVar)) {
                    c4.c.a(application);
                    c4.c cVar = c4.c.f2675w;
                    Objects.requireNonNull(cVar);
                    synchronized (cVar) {
                        cVar.f2678u.add(bVar);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f5109j) {
            ?? r22 = f5111l;
            m.k(!r22.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            m.i(context, "Application context cannot be null.");
            dVar = new d(context, "[DEFAULT]", hVar);
            r22.put("[DEFAULT]", dVar);
        }
        dVar.e();
        return dVar;
    }

    public final void a() {
        m.k(!this.f5117f.get(), "FirebaseApp was deleted");
    }

    public final <T> T b(Class<T> cls) {
        a();
        return (T) this.f5115d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f5113b.getBytes(Charset.defaultCharset());
        String str = null;
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f5114c.f5129b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!i0.k.a(this.f5112a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f5113b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f5112a;
            if (C0072d.f5123b.get() != null) {
                return;
            }
            C0072d c0072d = new C0072d(context);
            if (!C0072d.f5123b.compareAndSet(null, c0072d)) {
                return;
            }
            context.registerReceiver(c0072d, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f5113b);
        Log.i("FirebaseApp", sb2.toString());
        k kVar = this.f5115d;
        boolean h10 = h();
        if (kVar.f16641g.compareAndSet(null, Boolean.valueOf(h10))) {
            synchronized (kVar) {
                hashMap = new HashMap(kVar.f16636b);
            }
            kVar.h(hashMap, h10);
        }
        this.f5119h.get().c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        String str = this.f5113b;
        d dVar = (d) obj;
        dVar.a();
        return str.equals(dVar.f5113b);
    }

    public final boolean g() {
        boolean z10;
        a();
        t7.a aVar = this.f5118g.get();
        synchronized (aVar) {
            z10 = aVar.f18697b;
        }
        return z10;
    }

    public final boolean h() {
        a();
        return "[DEFAULT]".equals(this.f5113b);
    }

    public final int hashCode() {
        return this.f5113b.hashCode();
    }

    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a("name", this.f5113b);
        aVar.a("options", this.f5114c);
        return aVar.toString();
    }
}

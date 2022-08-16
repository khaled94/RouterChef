package i3;

import a4.f;
import a4.g;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import d4.m;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import n4.c;
import n4.d;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class a {
    @GuardedBy("this")

    /* renamed from: a */
    public a4.a f5250a;
    @GuardedBy("this")

    /* renamed from: b */
    public n4.b f5251b;
    @GuardedBy("this")

    /* renamed from: c */
    public boolean f5252c;

    /* renamed from: d */
    public final Object f5253d = new Object();
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e */
    public b f5254e;
    @GuardedBy("this")

    /* renamed from: f */
    public final Context f5255f;

    /* renamed from: g */
    public final boolean f5256g;

    /* renamed from: h */
    public final long f5257h;

    /* renamed from: i3.a$a */
    /* loaded from: classes.dex */
    public static final class C0075a {

        /* renamed from: a */
        public final String f5258a;

        /* renamed from: b */
        public final boolean f5259b;

        public C0075a(String str, boolean z10) {
            this.f5258a = str;
            this.f5259b = z10;
        }

        public final String toString() {
            String str = this.f5258a;
            boolean z10 = this.f5259b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z10);
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Thread {

        /* renamed from: s */
        public WeakReference<a> f5260s;

        /* renamed from: t */
        public long f5261t;

        /* renamed from: u */
        public CountDownLatch f5262u = new CountDownLatch(1);

        /* renamed from: v */
        public boolean f5263v = false;

        public b(a aVar, long j3) {
            this.f5260s = new WeakReference<>(aVar);
            this.f5261t = j3;
            start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            a aVar;
            try {
                if (this.f5262u.await(this.f5261t, TimeUnit.MILLISECONDS) || (aVar = this.f5260s.get()) == null) {
                    return;
                }
                aVar.a();
                this.f5263v = true;
            } catch (InterruptedException unused) {
                a aVar2 = this.f5260s.get();
                if (aVar2 == null) {
                    return;
                }
                aVar2.a();
                this.f5263v = true;
            }
        }
    }

    public a(Context context, long j3, boolean z10, boolean z11) {
        Context applicationContext;
        Objects.requireNonNull(context, "null reference");
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f5255f = context;
        this.f5252c = false;
        this.f5257h = j3;
        this.f5256g = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:12:0x002b, B:15:0x0033), top: B:32:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static i3.a.C0075a b(android.content.Context r13) {
        /*
            java.lang.String r0 = "Error while reading from SharedPreferences "
            java.lang.String r1 = "GmscoreFlag"
            i3.c r2 = new i3.c
            r2.<init>(r13)
            java.lang.String r3 = "gads:ad_id_app_context:enabled"
            boolean r3 = r2.b(r3)
            java.lang.String r4 = "gads:ad_id_app_context:ping_ratio"
            r5 = 0
            java.lang.Object r6 = r2.f5265s     // Catch: java.lang.Throwable -> L22
            r7 = r6
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7     // Catch: java.lang.Throwable -> L22
            if (r7 != 0) goto L1a
            goto L26
        L1a:
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6     // Catch: java.lang.Throwable -> L22
            float r4 = r6.getFloat(r4, r5)     // Catch: java.lang.Throwable -> L22
            r12 = r4
            goto L27
        L22:
            r4 = move-exception
            android.util.Log.w(r1, r0, r4)
        L26:
            r12 = r5
        L27:
            java.lang.String r4 = "gads:ad_id_use_shared_preference:experiment_id"
            java.lang.String r5 = ""
            java.lang.Object r6 = r2.f5265s     // Catch: java.lang.Throwable -> L3a
            r7 = r6
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7     // Catch: java.lang.Throwable -> L3a
            if (r7 != 0) goto L33
            goto L3e
        L33:
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r6.getString(r4, r5)     // Catch: java.lang.Throwable -> L3a
            goto L3f
        L3a:
            r4 = move-exception
            android.util.Log.w(r1, r0, r4)
        L3e:
            r0 = r5
        L3f:
            java.lang.String r1 = "gads:ad_id_use_persistent_service:enabled"
            boolean r9 = r2.b(r1)
            i3.a r1 = new i3.a
            r6 = -1
            r4 = r1
            r5 = r13
            r8 = r3
            r4.<init>(r5, r6, r8, r9)
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6e
            r13 = 0
            r1.h(r13)     // Catch: java.lang.Throwable -> L6e
            i3.a$a r13 = r1.c()     // Catch: java.lang.Throwable -> L6e
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6e
            long r8 = r6 - r4
            r11 = 0
            r4 = r1
            r5 = r13
            r6 = r3
            r7 = r12
            r10 = r0
            r4.i(r5, r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L6e
            r1.a()
            return r13
        L6e:
            r13 = move-exception
            r5 = 0
            r8 = -1
            r4 = r1
            r6 = r3
            r7 = r12
            r10 = r0
            r11 = r13
            r4.i(r5, r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L7b
            throw r13     // Catch: java.lang.Throwable -> L7b
        L7b:
            r13 = move-exception
            r1.a()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.a.b(android.content.Context):i3.a$a");
    }

    public static boolean d(Context context) {
        c cVar = new c(context);
        a aVar = new a(context, -1L, cVar.b("gads:ad_id_app_context:enabled"), cVar.b("com.google.android.gms.ads.identifier.service.PERSISTENT_START"));
        try {
            aVar.h(false);
            return aVar.j();
        } finally {
            aVar.a();
        }
    }

    public static a4.a e(Context context, boolean z10) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int c10 = f.f133b.c(context, 12451000);
            if (c10 != 0 && c10 != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z10 ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            a4.a aVar = new a4.a();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (!g4.a.b().a(context, intent, aVar, 1)) {
                    throw new IOException("Connection failure");
                }
                return aVar;
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new g();
        }
    }

    public static n4.b f(a4.a aVar) {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            IBinder a10 = aVar.a();
            int i10 = c.f16605s;
            IInterface queryLocalInterface = a10.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return queryLocalInterface instanceof n4.b ? (n4.b) queryLocalInterface : new d(a10);
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public final void a() {
        m.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f5255f == null || this.f5250a == null) {
                return;
            }
            if (this.f5252c) {
                g4.a.b().c(this.f5255f, this.f5250a);
            }
            this.f5252c = false;
            this.f5251b = null;
            this.f5250a = null;
        }
    }

    public final C0075a c() {
        C0075a c0075a;
        m.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f5252c) {
                synchronized (this.f5253d) {
                    b bVar = this.f5254e;
                    if (bVar == null || !bVar.f5263v) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    h(false);
                    if (!this.f5252c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            m.h(this.f5250a);
            m.h(this.f5251b);
            try {
                c0075a = new C0075a(this.f5251b.getId(), this.f5251b.a());
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        g();
        return c0075a;
    }

    public final void finalize() {
        a();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f5253d) {
            b bVar = this.f5254e;
            if (bVar != null) {
                bVar.f5262u.countDown();
                try {
                    this.f5254e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f5257h > 0) {
                this.f5254e = new b(this, this.f5257h);
            }
        }
    }

    public final void h(boolean z10) {
        m.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f5252c) {
                a();
            }
            a4.a e10 = e(this.f5255f, this.f5256g);
            this.f5250a = e10;
            this.f5251b = f(e10);
            this.f5252c = true;
            if (z10) {
                g();
            }
        }
    }

    public final boolean i(C0075a c0075a, boolean z10, float f10, long j3, String str, Throwable th) {
        String str2;
        if (Math.random() > f10) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str3 = "1";
        hashMap.put("app_context", z10 ? str3 : "0");
        if (c0075a != null) {
            if (!c0075a.f5259b) {
                str3 = "0";
            }
            hashMap.put("limit_ad_tracking", str3);
        }
        if (c0075a != null && (str2 = c0075a.f5258a) != null) {
            hashMap.put("ad_id_size", Integer.toString(str2.length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j3));
        new i3.b(hashMap).start();
        return true;
    }

    public final boolean j() {
        boolean c10;
        m.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f5252c) {
                synchronized (this.f5253d) {
                    b bVar = this.f5254e;
                    if (bVar == null || !bVar.f5263v) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    h(false);
                    if (!this.f5252c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            m.h(this.f5250a);
            m.h(this.f5251b);
            try {
                c10 = this.f5251b.c();
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        g();
        return c10;
    }
}

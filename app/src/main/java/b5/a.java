package b5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import d4.m;
import h4.c;
import h4.h;
import h4.j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;
import n3.s;
import u4.b;

@ThreadSafe
/* loaded from: classes.dex */
public final class a {

    /* renamed from: n */
    public static final long f2572n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o */
    public static volatile ScheduledExecutorService f2573o = null;
    public static final Object p = new Object();

    /* renamed from: b */
    public final PowerManager.WakeLock f2575b;

    /* renamed from: d */
    public Future<?> f2577d;

    /* renamed from: e */
    public long f2578e;

    /* renamed from: j */
    public final String f2583j;

    /* renamed from: m */
    public final ScheduledExecutorService f2586m;

    /* renamed from: a */
    public final Object f2574a = new Object();

    /* renamed from: c */
    public int f2576c = 0;

    /* renamed from: f */
    public final Set<c> f2579f = new HashSet();

    /* renamed from: g */
    public boolean f2580g = true;

    /* renamed from: i */
    public c f2582i = c.f5072a;

    /* renamed from: k */
    public final Map<String, b> f2584k = new HashMap();

    /* renamed from: l */
    public AtomicInteger f2585l = new AtomicInteger(0);

    /* renamed from: h */
    public u4.a f2581h = null;

    public a(Context context) {
        String str;
        String str2;
        String str3;
        ApplicationInfo b10;
        String packageName = context.getPackageName();
        m.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.f2583j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        } else {
            this.f2583j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new b(sb.toString());
        }
        this.f2575b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = j.f5080a;
        if (context.getPackageManager() != null && j4.c.a(context).a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
            packageName = h.a(packageName) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    b10 = j4.c.a(context).b(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    str3 = "Could not find package: ";
                    str2 = packageName.length() == 0 ? new String(str3) : str2;
                }
                if (b10 == null) {
                    str3 = "Could not get applicationInfo from package: ";
                    if (packageName.length() == 0) {
                        new String(str3);
                        str = str2;
                        Log.e("WorkSourceUtil", str);
                    }
                    str = str3.concat(packageName);
                    Log.e("WorkSourceUtil", str);
                } else {
                    int i10 = b10.uid;
                    workSource = new WorkSource();
                    Method method2 = j.f5081b;
                    try {
                        if (method2 != null) {
                            method2.invoke(workSource, Integer.valueOf(i10), packageName);
                        } else {
                            Method method3 = j.f5080a;
                            if (method3 != null) {
                                method3.invoke(workSource, Integer.valueOf(i10));
                            }
                        }
                    } catch (Exception e10) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                    }
                }
            }
            if (workSource != null) {
                try {
                    this.f2575b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e11) {
                    Log.wtf("WakeLock", e11.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f2573o;
        if (scheduledExecutorService == null) {
            synchronized (p) {
                scheduledExecutorService = f2573o;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f2573o = scheduledExecutorService;
                }
            }
        }
        this.f2586m = scheduledExecutorService;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.HashMap, java.util.Map<java.lang.String, b5.b>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<java.lang.String, b5.b>] */
    public final void a(long j3) {
        this.f2585l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f2572n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f2574a) {
            try {
                if (!b()) {
                    this.f2581h = u4.a.f19075s;
                    this.f2575b.acquire();
                    Objects.requireNonNull(this.f2582i);
                    SystemClock.elapsedRealtime();
                }
                this.f2576c++;
                if (this.f2580g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f2584k.get(null);
                if (bVar == null) {
                    bVar = new b(null);
                    this.f2584k.put(null, bVar);
                }
                bVar.f2587a++;
                Objects.requireNonNull(this.f2582i);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f2578e) {
                    this.f2578e = j10;
                    Future<?> future = this.f2577d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f2577d = this.f2586m.schedule(new s(this, 7), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f2574a) {
            z10 = this.f2576c > 0;
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, b5.b>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.HashMap, java.util.Map<java.lang.String, b5.b>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map<java.lang.String, b5.b>] */
    public final void c() {
        if (this.f2585l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f2583j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f2574a) {
            if (this.f2580g) {
                TextUtils.isEmpty(null);
            }
            if (this.f2584k.containsKey(null)) {
                b bVar = (b) this.f2584k.get(null);
                if (bVar != null) {
                    int i10 = bVar.f2587a - 1;
                    bVar.f2587a = i10;
                    if (i10 == 0) {
                        this.f2584k.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f2583j).concat(" counter does not exist"));
            }
            e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<b5.c>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashSet, java.util.Set<b5.c>] */
    public final void d() {
        if (this.f2579f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f2579f);
        this.f2579f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        c cVar = (c) arrayList.get(0);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r6.f2581h != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r6.f2581h != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        r6.f2581h = null;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<java.lang.String, b5.b>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.String, b5.b>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2574a
            monitor-enter(r0)
            boolean r1 = r6.b()     // Catch: java.lang.Throwable -> La0
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            return
        Lb:
            boolean r1 = r6.f2580g     // Catch: java.lang.Throwable -> La0
            r2 = 0
            if (r1 == 0) goto L1b
            int r1 = r6.f2576c     // Catch: java.lang.Throwable -> La0
            int r1 = r1 + (-1)
            r6.f2576c = r1     // Catch: java.lang.Throwable -> La0
            if (r1 > 0) goto L19
            goto L1d
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            return
        L1b:
            r6.f2576c = r2     // Catch: java.lang.Throwable -> La0
        L1d:
            r6.d()     // Catch: java.lang.Throwable -> La0
            java.util.Map<java.lang.String, b5.b> r1 = r6.f2584k     // Catch: java.lang.Throwable -> La0
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> La0
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La0
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r3 == 0) goto L39
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La0
            b5.b r3 = (b5.b) r3     // Catch: java.lang.Throwable -> La0
            r3.f2587a = r2     // Catch: java.lang.Throwable -> La0
            goto L2a
        L39:
            java.util.Map<java.lang.String, b5.b> r1 = r6.f2584k     // Catch: java.lang.Throwable -> La0
            r1.clear()     // Catch: java.lang.Throwable -> La0
            java.util.concurrent.Future<?> r1 = r6.f2577d     // Catch: java.lang.Throwable -> La0
            r3 = 0
            if (r1 == 0) goto L4c
            r1.cancel(r2)     // Catch: java.lang.Throwable -> La0
            r6.f2577d = r3     // Catch: java.lang.Throwable -> La0
            r1 = 0
            r6.f2578e = r1     // Catch: java.lang.Throwable -> La0
        L4c:
            android.os.PowerManager$WakeLock r1 = r6.f2575b     // Catch: java.lang.Throwable -> La0
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L8d
            android.os.PowerManager$WakeLock r1 = r6.f2575b     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L60
            r1.release()     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L60
            u4.a r1 = r6.f2581h     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L9e
            goto L82
        L5e:
            r1 = move-exception
            goto L86
        L60:
            r1 = move-exception
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L5e
            java.lang.Class<java.lang.RuntimeException> r4 = java.lang.RuntimeException.class
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L85
            java.lang.String r2 = "WakeLock"
            java.lang.String r4 = r6.f2583j     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = " failed to release!"
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L5e
            android.util.Log.e(r2, r4, r1)     // Catch: java.lang.Throwable -> L5e
            u4.a r1 = r6.f2581h     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L9e
        L82:
            r6.f2581h = r3     // Catch: java.lang.Throwable -> La0
            goto L9e
        L85:
            throw r1     // Catch: java.lang.Throwable -> L5e
        L86:
            u4.a r2 = r6.f2581h     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L8c
            r6.f2581h = r3     // Catch: java.lang.Throwable -> La0
        L8c:
            throw r1     // Catch: java.lang.Throwable -> La0
        L8d:
            java.lang.String r1 = "WakeLock"
            java.lang.String r2 = r6.f2583j     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = " should be held!"
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> La0
            android.util.Log.e(r1, r2)     // Catch: java.lang.Throwable -> La0
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            return
        La0:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.a.e():void");
    }
}

package u7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import c5.a;
import c5.b0;
import c5.d;
import c5.i;
import c5.l;
import h4.f;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s7.g;
import u7.t0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b */
    public static final Object f19554b = new Object();

    /* renamed from: c */
    public static t0 f19555c;

    /* renamed from: a */
    public final Context f19556a;

    public o(Context context) {
        this.f19556a = context;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayDeque, java.util.Queue<u7.t0$a>] */
    public static i<Integer> a(Context context, Intent intent) {
        t0 t0Var;
        b0<Void> b0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f19554b) {
            if (f19555c == null) {
                f19555c = new t0(context);
            }
            t0Var = f19555c;
        }
        synchronized (t0Var) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            t0.a aVar = new t0.a(intent);
            ScheduledExecutorService scheduledExecutorService = t0Var.f19585c;
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new s0(aVar, 0), 9000L, TimeUnit.MILLISECONDS);
            aVar.f19590b.f2776a.b(scheduledExecutorService, new d() { // from class: u7.r0
                @Override // c5.d
                public final void c(i iVar) {
                    schedule.cancel(false);
                }
            });
            t0Var.f19586d.add(aVar);
            t0Var.b();
            b0Var = aVar.f19590b.f2776a;
        }
        return b0Var.f(j.f19515s, m.f19535s);
    }

    public final i<Integer> b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z10 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.f19556a;
        boolean z11 = f.a() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z10 = true;
        }
        if (!z11 || z10) {
            j jVar = j.f19515s;
            return l.c(jVar, new Callable() { // from class: u7.n
                /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Queue<android.content.Intent>, java.util.ArrayDeque] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str;
                    int i10;
                    ComponentName componentName;
                    ServiceInfo serviceInfo;
                    String str2;
                    Context context2 = context;
                    Intent intent2 = intent;
                    h0 a10 = h0.a();
                    Objects.requireNonNull(a10);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Starting service");
                    }
                    a10.f19506d.offer(intent2);
                    Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                    intent3.setPackage(context2.getPackageName());
                    synchronized (a10) {
                        String str3 = a10.f19503a;
                        if (str3 == null) {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                            str = null;
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        str3 = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        str3 = serviceInfo.name;
                                    }
                                    a10.f19503a = str3;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                        str = str3;
                    }
                    if (str != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + str);
                        }
                        intent3.setClassName(context2.getPackageName(), str);
                    }
                    try {
                        if (a10.c(context2)) {
                            componentName = p0.a(context2, intent3);
                        } else {
                            componentName = context2.startService(intent3);
                            Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                        }
                        if (componentName == null) {
                            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                            i10 = 404;
                        } else {
                            i10 = -1;
                        }
                    } catch (IllegalStateException e10) {
                        Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                        i10 = 402;
                    } catch (SecurityException e11) {
                        Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                        i10 = 401;
                    }
                    return Integer.valueOf(i10);
                }
            }).h(jVar, new a() { // from class: u7.l
                @Override // c5.a
                public final Object d(i iVar) {
                    return (!f.a() || ((Integer) iVar.j()).intValue() != 402) ? iVar : o.a(context, intent).f(j.f19515s, g.f18368s);
                }
            });
        }
        return a(context, intent);
    }
}

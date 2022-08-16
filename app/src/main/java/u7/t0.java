package u7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import c5.j;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class t0 implements ServiceConnection {

    /* renamed from: a */
    public final Context f19583a;

    /* renamed from: b */
    public final Intent f19584b;

    /* renamed from: c */
    public final ScheduledExecutorService f19585c;

    /* renamed from: e */
    public q0 f19587e;

    /* renamed from: d */
    public final Queue<a> f19586d = new ArrayDeque();

    /* renamed from: f */
    public boolean f19588f = false;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Intent f19589a;

        /* renamed from: b */
        public final j<Void> f19590b = new j<>();

        public a(Intent intent) {
            this.f19589a = intent;
        }

        public final void a() {
            this.f19590b.d(null);
        }
    }

    public t0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new i4.a("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.f19583a = applicationContext;
        this.f19584b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f19585c = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Queue<u7.t0$a>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayDeque, java.util.Queue<u7.t0$a>] */
    public final void a() {
        while (!this.f19586d.isEmpty()) {
            ((a) this.f19586d.poll()).a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayDeque, java.util.Queue<u7.t0$a>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayDeque, java.util.Queue<u7.t0$a>] */
    public final synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f19586d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            q0 q0Var = this.f19587e;
            if (q0Var == null || !q0Var.isBinderAlive()) {
                c();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f19587e.a((a) this.f19586d.poll());
        }
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder c10 = androidx.activity.result.a.c("binder is dead. start connection? ");
            c10.append(!this.f19588f);
            Log.d("FirebaseMessaging", c10.toString());
        }
        if (this.f19588f) {
            return;
        }
        this.f19588f = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (g4.a.b().a(this.f19583a, this.f19584b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f19588f = false;
        a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f19588f = false;
        if (iBinder instanceof q0) {
            this.f19587e = (q0) iBinder;
            b();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }
}

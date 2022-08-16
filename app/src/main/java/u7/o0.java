package u7;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o0 implements Runnable {

    /* renamed from: x */
    public static final Object f19557x = new Object();
    public static Boolean y;

    /* renamed from: z */
    public static Boolean f19558z;

    /* renamed from: s */
    public final Context f19559s;

    /* renamed from: t */
    public final z f19560t;

    /* renamed from: u */
    public final PowerManager.WakeLock f19561u;

    /* renamed from: v */
    public final n0 f19562v;

    /* renamed from: w */
    public final long f19563w;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: a */
        public o0 f19564a;

        public a(o0 o0Var) {
            o0.this = r1;
            this.f19564a = o0Var;
        }

        public final void a() {
            if (o0.a()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            o0.this.f19559s.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            o0 o0Var = this.f19564a;
            if (o0Var == null) {
                return;
            }
            if (!o0Var.e()) {
                return;
            }
            if (o0.a()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            o0 o0Var2 = this.f19564a;
            o0Var2.f19562v.f19551f.schedule(o0Var2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f19564a = null;
        }
    }

    public o0(n0 n0Var, Context context, z zVar, long j3) {
        this.f19562v = n0Var;
        this.f19559s = context;
        this.f19563w = j3;
        this.f19560t = zVar;
        this.f19561u = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public static boolean b(Context context) {
        boolean booleanValue;
        synchronized (f19557x) {
            Boolean bool = f19558z;
            Boolean valueOf = Boolean.valueOf(bool == null ? c(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f19558z = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean c(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean d(Context context) {
        boolean booleanValue;
        synchronized (f19557x) {
            Boolean bool = y;
            Boolean valueOf = Boolean.valueOf(bool == null ? c(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            y = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized boolean e() {
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f19559s.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        PowerManager.WakeLock wakeLock;
        if (d(this.f19559s)) {
            this.f19561u.acquire(f.f19494a);
        }
        try {
            try {
                try {
                    this.f19562v.e(true);
                } catch (Throwable th) {
                    if (d(this.f19559s)) {
                        try {
                            this.f19561u.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f19562v.e(false);
                if (!d(this.f19559s)) {
                    return;
                }
                wakeLock = this.f19561u;
            }
            if (!this.f19560t.d()) {
                this.f19562v.e(false);
                if (!d(this.f19559s)) {
                    return;
                }
                try {
                    this.f19561u.release();
                } catch (RuntimeException unused2) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } else if (b(this.f19559s) && !e()) {
                new a(this).a();
                if (!d(this.f19559s)) {
                    return;
                }
                try {
                    this.f19561u.release();
                } catch (RuntimeException unused3) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } else {
                if (this.f19562v.f()) {
                    this.f19562v.e(false);
                } else {
                    this.f19562v.g(this.f19563w);
                }
                if (!d(this.f19559s)) {
                    return;
                }
                wakeLock = this.f19561u;
                wakeLock.release();
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}

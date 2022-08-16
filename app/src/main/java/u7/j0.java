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
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j0 implements Runnable {

    /* renamed from: s */
    public final long f19516s;

    /* renamed from: t */
    public final PowerManager.WakeLock f19517t;

    /* renamed from: u */
    public final FirebaseMessaging f19518u;

    /* loaded from: classes.dex */
    public static class a extends BroadcastReceiver {

        /* renamed from: a */
        public j0 f19519a;

        public a(j0 j0Var) {
            this.f19519a = j0Var;
        }

        public final void a() {
            if (j0.a()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f19519a.f19518u.f3468d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            j0 j0Var = this.f19519a;
            if (j0Var != null && j0Var.b()) {
                if (j0.a()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                j0 j0Var2 = this.f19519a;
                j0Var2.f19518u.b(j0Var2, 0L);
                this.f19519a.f19518u.f3468d.unregisterReceiver(this);
                this.f19519a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public j0(FirebaseMessaging firebaseMessaging, long j3) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i4.a("firebase-iid-executor"));
        this.f19518u = firebaseMessaging;
        this.f19516s = j3;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f3468d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f19517t = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean a() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f19518u.f3468d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean c() {
        String str;
        boolean z10 = true;
        try {
            if (this.f19518u.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z10 = false;
            }
            if (z10) {
                StringBuilder c10 = androidx.activity.result.a.c("Token retrieval failed: ");
                c10.append(e10.getMessage());
                c10.append(". Will retry token retrieval");
                str = c10.toString();
            } else if (e10.getMessage() != null) {
                throw e10;
            } else {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        if (h0.a().c(this.f19518u.f3468d)) {
            this.f19517t.acquire();
        }
        try {
            try {
                this.f19518u.f(true);
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f19518u.f(false);
                if (!h0.a().c(this.f19518u.f3468d)) {
                    return;
                }
            }
            if (!this.f19518u.f3475k.d()) {
                this.f19518u.f(false);
                if (!h0.a().c(this.f19518u.f3468d)) {
                    return;
                }
                this.f19517t.release();
            } else if (h0.a().b(this.f19518u.f3468d) && !b()) {
                new a(this).a();
                if (!h0.a().c(this.f19518u.f3468d)) {
                    return;
                }
                this.f19517t.release();
            } else {
                if (c()) {
                    this.f19518u.f(false);
                } else {
                    this.f19518u.h(this.f19516s);
                }
                if (!h0.a().c(this.f19518u.f3468d)) {
                    return;
                }
                this.f19517t.release();
            }
        } catch (Throwable th) {
            if (h0.a().c(this.f19518u.f3468d)) {
                this.f19517t.release();
            }
            throw th;
        }
    }
}

package u7;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import c5.d;
import c5.i;
import c5.j;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u7.q0;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes.dex */
public abstract class k extends Service {

    /* renamed from: s */
    public final ExecutorService f19520s;

    /* renamed from: t */
    public q0 f19521t;

    /* renamed from: v */
    public int f19523v;

    /* renamed from: u */
    public final Object f19522u = new Object();

    /* renamed from: w */
    public int f19524w = 0;

    /* loaded from: classes.dex */
    public class a implements q0.a {
        public a() {
            k.this = r1;
        }
    }

    public k() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i4.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f19520s = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            synchronized (p0.f19569b) {
                if (p0.f19570c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    p0.f19570c.c();
                }
            }
        }
        synchronized (this.f19522u) {
            int i10 = this.f19524w - 1;
            this.f19524w = i10;
            if (i10 == 0) {
                stopSelfResult(this.f19523v);
            }
        }
    }

    public Intent b(Intent intent) {
        return intent;
    }

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f19521t == null) {
            this.f19521t = new q0(new a());
        }
        return this.f19521t;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f19520s.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.f19522u) {
            this.f19523v = i11;
            this.f19524w++;
        }
        Intent b10 = b(intent);
        if (b10 == null) {
            a(intent);
            return 2;
        }
        j jVar = new j();
        this.f19520s.execute(new i(this, b10, jVar));
        i iVar = jVar.f2776a;
        if (iVar.m()) {
            a(intent);
            return 2;
        }
        iVar.b(j.f19515s, new d() { // from class: u7.h
            @Override // c5.d
            public final void c(i iVar2) {
                k.this.a(intent);
            }
        });
        return 3;
    }
}

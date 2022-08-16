package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.o;
import androidx.work.impl.foreground.a;
import f2.b;
import java.util.Objects;
import java.util.UUID;
import t1.h;
import u1.k;

/* loaded from: classes.dex */
public class SystemForegroundService extends o implements a.AbstractC0030a {

    /* renamed from: x */
    public static final String f2368x = h.e("SystemFgService");

    /* renamed from: t */
    public Handler f2369t;

    /* renamed from: u */
    public boolean f2370u;

    /* renamed from: v */
    public androidx.work.impl.foreground.a f2371v;

    /* renamed from: w */
    public NotificationManager f2372w;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ int f2373s;

        /* renamed from: t */
        public final /* synthetic */ Notification f2374t;

        /* renamed from: u */
        public final /* synthetic */ int f2375u;

        public a(int i10, Notification notification, int i11) {
            SystemForegroundService.this = r1;
            this.f2373s = i10;
            this.f2374t = notification;
            this.f2375u = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f2373s, this.f2374t, this.f2375u);
            } else {
                SystemForegroundService.this.startForeground(this.f2373s, this.f2374t);
            }
        }
    }

    public final void d() {
        this.f2369t = new Handler(Looper.getMainLooper());
        this.f2372w = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f2371v = aVar;
        if (aVar.B != null) {
            h.c().b(androidx.work.impl.foreground.a.C, "A callback already exists.", new Throwable[0]);
        } else {
            aVar.B = this;
        }
    }

    public final void e(int i10, int i11, Notification notification) {
        this.f2369t.post(new a(i10, notification, i11));
    }

    @Override // androidx.lifecycle.o, android.app.Service
    public final void onCreate() {
        super.onCreate();
        d();
    }

    @Override // androidx.lifecycle.o, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2371v.g();
    }

    @Override // androidx.lifecycle.o, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f2370u) {
            h.c().d(f2368x, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f2371v.g();
            d();
            this.f2370u = false;
        }
        if (intent != null) {
            androidx.work.impl.foreground.a aVar = this.f2371v;
            Objects.requireNonNull(aVar);
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                h.c().d(androidx.work.impl.foreground.a.C, String.format("Started foreground service %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                ((b) aVar.f2379u).a(new b2.b(aVar, aVar.f2378t.f19025c, stringExtra));
            } else if (!"ACTION_NOTIFY".equals(action)) {
                if ("ACTION_CANCEL_WORK".equals(action)) {
                    h.c().d(androidx.work.impl.foreground.a.C, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                    String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                    if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                        return 3;
                    }
                    k kVar = aVar.f2378t;
                    UUID fromString = UUID.fromString(stringExtra2);
                    Objects.requireNonNull(kVar);
                    ((b) kVar.f19026d).a(new d2.a(kVar, fromString));
                    return 3;
                } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                    return 3;
                } else {
                    h.c().d(androidx.work.impl.foreground.a.C, "Stopping foreground service", new Throwable[0]);
                    a.AbstractC0030a abstractC0030a = aVar.B;
                    if (abstractC0030a == null) {
                        return 3;
                    }
                    SystemForegroundService systemForegroundService = (SystemForegroundService) abstractC0030a;
                    systemForegroundService.f2370u = true;
                    h.c().a(f2368x, "All commands completed.", new Throwable[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
            }
            aVar.f(intent);
            return 3;
        }
        return 3;
    }
}

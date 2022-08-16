package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.o;
import androidx.work.impl.background.systemalarm.d;
import d2.m;
import java.util.HashMap;
import java.util.WeakHashMap;
import t1.h;

/* loaded from: classes.dex */
public class SystemAlarmService extends o implements d.c {

    /* renamed from: v */
    public static final String f2333v = h.e("SystemAlarmService");

    /* renamed from: t */
    public d f2334t;

    /* renamed from: u */
    public boolean f2335u;

    public final void d() {
        d dVar = new d(this);
        this.f2334t = dVar;
        if (dVar.B != null) {
            h.c().b(d.C, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            dVar.B = this;
        }
    }

    public final void e() {
        this.f2335u = true;
        h.c().a(f2333v, "All commands completed in dispatcher", new Throwable[0]);
        String str = m.f3762a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = m.f3763b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                h.c().f(m.f3762a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.o, android.app.Service
    public final void onCreate() {
        super.onCreate();
        d();
        this.f2335u = false;
    }

    @Override // androidx.lifecycle.o, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2335u = true;
        this.f2334t.d();
    }

    @Override // androidx.lifecycle.o, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f2335u) {
            h.c().d(f2333v, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f2334t.d();
            d();
            this.f2335u = false;
        }
        if (intent != null) {
            this.f2334t.b(intent, i11);
            return 3;
        }
        return 3;
    }
}

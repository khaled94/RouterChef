package n3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;
import m4.es;
import m4.jo;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: d */
    public boolean f16457d;

    /* renamed from: e */
    public Context f16458e;

    /* renamed from: c */
    public boolean f16456c = false;
    @GuardedBy("this")

    /* renamed from: b */
    public final Map<BroadcastReceiver, IntentFilter> f16455b = new WeakHashMap();
    @GuardedBy("this")

    /* renamed from: a */
    public final c1 f16454a = new c1(this);

    public final synchronized void a(Context context) {
        if (this.f16456c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f16458e = applicationContext;
        if (applicationContext == null) {
            this.f16458e = context;
        }
        es.c(this.f16458e);
        this.f16457d = ((Boolean) jo.f10145d.f10148c.a(es.f8097g2)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f16458e.registerReceiver(this.f16454a, intentFilter);
        this.f16456c = true;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.WeakHashMap, java.util.Map<android.content.BroadcastReceiver, android.content.IntentFilter>] */
    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f16457d) {
            this.f16455b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}

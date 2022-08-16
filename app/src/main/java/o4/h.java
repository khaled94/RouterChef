package o4;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import c5.i;
import c5.j;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n3.s;
import v3.a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: d */
    public static h f16764d;

    /* renamed from: a */
    public final Context f16765a;

    /* renamed from: b */
    public boolean f16766b;

    /* renamed from: c */
    public final ExecutorService f16767c = Executors.newSingleThreadExecutor();

    public h(Context context) {
        this.f16766b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f16765a = context;
        if (!this.f16766b) {
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new s(this), 0L, 86400L, TimeUnit.SECONDS);
            this.f16766b = true;
        }
    }

    public static final SharedPreferences c(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void d(Context context) {
        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
            throw new g("Failed to store the app set ID last used time.");
        }
    }

    public final i<a> a() {
        j jVar = new j();
        this.f16767c.execute(new f(this, jVar));
        return jVar.f2776a;
    }

    public final long b() {
        long j3 = c(this.f16765a).getLong("app_set_id_last_used_time", -1L);
        if (j3 != -1) {
            return j3 + 33696000000L;
        }
        return -1L;
    }
}

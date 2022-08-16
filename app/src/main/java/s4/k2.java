package s4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import c1.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x4.a;
import y4.l3;
import y4.q2;

/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: h */
    public static volatile k2 f17949h;

    /* renamed from: a */
    public final ExecutorService f17950a;

    /* renamed from: b */
    public final a f17951b = new a(this);

    /* renamed from: c */
    public final List<Pair<l3, a2>> f17952c = new ArrayList();

    /* renamed from: d */
    public int f17953d;

    /* renamed from: e */
    public boolean f17954e;

    /* renamed from: f */
    public final String f17955f;

    /* renamed from: g */
    public volatile s0 f17956g;

    public k2(Context context, String str, String str2, String str3, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new u1());
        boolean z10 = true;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f17950a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        try {
            f.h(context, q2.a(context));
        } catch (IllegalStateException unused) {
        }
        this.f17955f = "fa";
        if (str2 == null || str3 == null) {
            if ((str3 != null ? false : z10) ^ (str2 == null)) {
                Log.w("FA", "Specified origin or custom app id is null. Both parameters will be ignored.");
            }
        } else {
            Log.v("FA", "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
        }
        b(new i1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new j2(this));
        }
    }

    public static k2 f(Context context, String str, String str2, String str3, Bundle bundle) {
        Objects.requireNonNull(context, "null reference");
        if (f17949h == null) {
            synchronized (k2.class) {
                if (f17949h == null) {
                    f17949h = new k2(context, str, str2, str3, bundle);
                }
            }
        }
        return f17949h;
    }

    public final void a(Exception exc, boolean z10, boolean z11) {
        this.f17954e |= z10;
        if (z10) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            b(new s1(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final void b(z1 z1Var) {
        this.f17950a.execute(z1Var);
    }

    public final int c(String str) {
        o0 o0Var = new o0();
        b(new v1(this, str, o0Var));
        Integer num = (Integer) o0.E1(o0Var.c0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long d() {
        o0 o0Var = new o0();
        b(new o1(this, o0Var));
        Long l10 = (Long) o0.E1(o0Var.c0(500L), Long.class);
        if (l10 == null) {
            long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
            int i10 = this.f17953d + 1;
            this.f17953d = i10;
            return nextLong + i10;
        }
        return l10.longValue();
    }

    public final Bundle e(Bundle bundle, boolean z10) {
        o0 o0Var = new o0();
        b(new t1(this, bundle, o0Var));
        if (z10) {
            return o0Var.c0(5000L);
        }
        return null;
    }

    public final List<Bundle> g(String str, String str2) {
        o0 o0Var = new o0();
        b(new f1(this, str, str2, o0Var));
        List<Bundle> list = (List) o0.E1(o0Var.c0(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> h(String str, String str2, boolean z10) {
        o0 o0Var = new o0();
        b(new r1(this, str, str2, z10, o0Var));
        Bundle c02 = o0Var.c0(5000L);
        if (c02 == null || c02.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(c02.size());
        for (String str3 : c02.keySet()) {
            Object obj = c02.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }
}

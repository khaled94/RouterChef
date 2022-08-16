package m4;

import a4.f;
import android.content.Context;
import android.os.Bundle;
import c4.w0;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import n3.g1;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class x70 {

    /* renamed from: a */
    public final AtomicReference<ExecutorService> f15228a = new AtomicReference<>(null);

    /* renamed from: b */
    public final Object f15229b = new Object();
    @GuardedBy("gmpAppIdLock")

    /* renamed from: c */
    public String f15230c = null;
    @GuardedBy("gmpAppIdLock")

    /* renamed from: d */
    public String f15231d = null;

    /* renamed from: e */
    public final AtomicBoolean f15232e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicInteger f15233f = new AtomicInteger(-1);

    /* renamed from: g */
    public final AtomicReference<Object> f15234g = new AtomicReference<>(null);

    /* renamed from: h */
    public final AtomicReference<Object> f15235h = new AtomicReference<>(null);

    /* renamed from: i */
    public final ConcurrentMap<String, Method> f15236i = new ConcurrentHashMap(9);

    /* renamed from: j */
    public final AtomicReference<ef0> f15237j = new AtomicReference<>(null);
    @GuardedBy("proxyReference")

    /* renamed from: k */
    public final BlockingQueue<FutureTask<?>> f15238k = new ArrayBlockingQueue(20);

    /* renamed from: l */
    public final Object f15239l = new Object();

    public static final boolean m(Context context) {
        yr<Boolean> yrVar = es.Z;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) joVar.f10148c.a(es.f8050a0)).intValue()) {
                return false;
            }
            if (((Boolean) joVar.f10148c.a(es.f8058b0)).booleanValue()) {
                try {
                    context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    return false;
                } catch (ClassNotFoundException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.reflect.Method>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.reflect.Method>, java.util.concurrent.ConcurrentHashMap] */
    public final void a(Context context, String str, String str2) {
        if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.f15234g, true)) {
            Method method = (Method) this.f15236i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f15236i.put(str2, method);
                } catch (Exception unused) {
                    c(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f15234g.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                g1.a(sb.toString());
            } catch (Exception unused2) {
                c(str2, false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.reflect.Method>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.reflect.Method>, java.util.concurrent.ConcurrentHashMap] */
    public final void b(Context context, String str, String str2, Bundle bundle) {
        if (l(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e10) {
                String valueOf = String.valueOf(str2);
                g1.h(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e10);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (m(context)) {
                d("logEventInternal", new p70(str, bundle2));
            } else if (!e(context, "com.google.android.gms.measurement.AppMeasurement", this.f15234g, true)) {
            } else {
                Method method = (Method) this.f15236i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f15236i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        c("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f15234g.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    c("logEventInternal", true);
                }
            }
        }
    }

    public final void c(String str, boolean z10) {
        if (!this.f15232e.get()) {
            StringBuilder sb = new StringBuilder(str.length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            g1.j(sb.toString());
            if (!z10) {
                return;
            }
            g1.j("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f15232e.set(true);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.concurrent.ArrayBlockingQueue, java.util.concurrent.BlockingQueue<java.util.concurrent.FutureTask<?>>] */
    public final void d(String str, w70 w70Var) {
        synchronized (this.f15237j) {
            FutureTask futureTask = new FutureTask(new w0(this, w70Var, str), null);
            if (this.f15237j.get() != null) {
                futureTask.run();
            } else {
                this.f15238k.offer(futureTask);
            }
        }
    }

    public final boolean e(Context context, String str, AtomicReference<Object> atomicReference, boolean z10) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                c("getInstance", z10);
                return false;
            }
        }
        return true;
    }

    public final String f(Context context) {
        Long valueOf;
        if (!l(context)) {
            return null;
        }
        if (m(context)) {
            synchronized (this.f15237j) {
                if (this.f15237j.get() != null) {
                    try {
                        valueOf = Long.valueOf(this.f15237j.get().c());
                    } catch (Exception unused) {
                        c("getAdEventId", false);
                    }
                }
                valueOf = null;
            }
            if (valueOf == null) {
                return null;
            }
            return Long.toString(valueOf.longValue());
        }
        Object n10 = n("generateEventId", context);
        if (n10 == null) {
            return null;
        }
        return n10.toString();
    }

    public final String g(Context context) {
        if (!l(context)) {
            return null;
        }
        long longValue = ((Long) jo.f10145d.f10148c.a(es.X)).longValue();
        if (!m(context)) {
            if (longValue < 0) {
                return (String) n("getAppInstanceId", context);
            }
            try {
                return (String) p().submit(new r70(this, context, 0)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        try {
            if (longValue < 0) {
                synchronized (this.f15237j) {
                    if (this.f15237j.get() != null) {
                        try {
                            return this.f15237j.get().d();
                        } catch (Exception unused3) {
                            c("getAppInstanceId", false);
                        }
                    }
                    return null;
                }
            }
            return (String) p().submit(new Callable() { // from class: m4.q70
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    x70 x70Var = x70.this;
                    synchronized (x70Var.f15237j) {
                        if (x70Var.f15237j.get() != null) {
                            try {
                                return x70Var.f15237j.get().d();
                            } catch (Exception unused4) {
                                x70Var.c("getAppInstanceId", false);
                            }
                        }
                        return null;
                    }
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused4) {
            return "TIME_OUT";
        } catch (Exception unused5) {
            return null;
        }
    }

    public final String h(Context context) {
        if (!l(context)) {
            return null;
        }
        synchronized (this.f15229b) {
            String str = this.f15230c;
            if (str != null) {
                return str;
            }
            if (m(context)) {
                String str2 = this.f15230c;
                synchronized (this.f15237j) {
                    if (this.f15237j.get() != null) {
                        try {
                            str2 = this.f15237j.get().h();
                        } catch (Exception unused) {
                            c("getGmpAppId", false);
                        }
                    }
                }
                this.f15230c = str2;
            } else {
                this.f15230c = (String) n("getGmpAppId", context);
            }
            return this.f15230c;
        }
    }

    public final void i(Context context, String str) {
        b(context, "_ac", str, null);
    }

    public final void j(Context context, String str) {
        b(context, "_ai", str, null);
    }

    public final void k(Context context, String str, String str2, String str3, int i10) {
        if (!l(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str2);
        bundle.putString("reward_type", str3);
        bundle.putInt("reward_value", i10);
        b(context, "_ar", str, bundle);
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
        sb.append("Log a Firebase reward video event, reward type: ");
        sb.append(str3);
        sb.append(", reward value: ");
        sb.append(i10);
        g1.a(sb.toString());
    }

    public final boolean l(Context context) {
        yr<Boolean> yrVar = es.S;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && !this.f15232e.get()) {
            if (((Boolean) joVar.f10148c.a(es.f8065c0)).booleanValue()) {
                return true;
            }
            if (this.f15233f.get() == -1) {
                g90 g90Var = io.f9708f.f9709a;
                if (!g90.f(context, 12451000)) {
                    int c10 = f.f133b.c(context, 12451000);
                    if (c10 == 0 || c10 == 2) {
                        g1.j("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f15233f.set(0);
                    }
                }
                this.f15233f.set(1);
            }
            if (this.f15233f.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final Object n(String str, Context context) {
        if (!e(context, "com.google.android.gms.measurement.AppMeasurement", this.f15234g, true)) {
            return null;
        }
        try {
            return o(context, str).invoke(this.f15234g.get(), new Object[0]);
        } catch (Exception unused) {
            c(str, true);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.reflect.Method>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.reflect.Method>, java.util.concurrent.ConcurrentHashMap] */
    public final Method o(Context context, String str) {
        Method method = (Method) this.f15236i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f15236i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            c(str, false);
            return null;
        }
    }

    public final ExecutorService p() {
        if (this.f15228a.get() == null) {
            yr<Integer> yrVar = es.Y;
            jo joVar = jo.f10145d;
            this.f15228a.compareAndSet(null, new ThreadPoolExecutor(((Integer) joVar.f10148c.a(yrVar)).intValue(), ((Integer) joVar.f10148c.a(yrVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new v70()));
        }
        return this.f15228a.get();
    }
}

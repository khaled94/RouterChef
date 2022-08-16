package m4;

import a4.f;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.a;
import e1.i;
import j4.c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;
import n3.g1;
import z3.k;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class v40 implements w40 {

    /* renamed from: x */
    public static final Object f14578x = new Object();
    public static w40 y;

    /* renamed from: z */
    public static w40 f14579z;

    /* renamed from: t */
    public final Context f14581t;

    /* renamed from: w */
    public final o90 f14584w;

    /* renamed from: s */
    public final Object f14580s = new Object();

    /* renamed from: u */
    public final WeakHashMap<Thread, Boolean> f14582u = new WeakHashMap<>();

    /* renamed from: v */
    public final ExecutorService f14583v = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public v40(Context context, o90 o90Var) {
        this.f14581t = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f14584w = o90Var;
    }

    public static w40 c(Context context) {
        synchronized (f14578x) {
            if (y == null) {
                if (ut.f14489e.e().booleanValue()) {
                    if (!((Boolean) jo.f10145d.f10148c.a(es.f8055a5)).booleanValue()) {
                        y = new v40(context, o90.s());
                    }
                }
                y = new i();
            }
        }
        return y;
    }

    public static w40 d(Context context, o90 o90Var) {
        synchronized (f14578x) {
            if (f14579z == null) {
                if (ut.f14489e.e().booleanValue()) {
                    if (!((Boolean) jo.f10145d.f10148c.a(es.f8055a5)).booleanValue()) {
                        v40 v40Var = new v40(context, o90Var);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (v40Var.f14580s) {
                                v40Var.f14582u.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new u40(v40Var, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new t40(v40Var, Thread.getDefaultUncaughtExceptionHandler()));
                        f14579z = v40Var;
                    }
                }
                f14579z = new i();
            }
        }
        return f14579z;
    }

    @Override // m4.w40
    public final void a(Throwable th, String str) {
        b(th, str, 1.0f);
    }

    @Override // m4.w40
    public final void b(Throwable th, String str, float f10) {
        Throwable th2;
        String str2;
        vt1 vt1Var = g90.f8771b;
        boolean z10 = false;
        if (ut.f14490f.e().booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z11 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (g90.c(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z11 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                            stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                        }
                        arrayList.add(stackTraceElement);
                    }
                }
                if (z11) {
                    Throwable th5 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th5.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    th2 = th5;
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        double d5 = f10;
        double random = Math.random();
        int i10 = f10 > 0.0f ? (int) (1.0f / f10) : 1;
        if (random >= d5) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            z10 = c.a(this.f14581t).e();
        } catch (Throwable th6) {
            g1.h("Error fetching instant app info", th6);
        }
        try {
            str2 = this.f14581t.getPackageName();
        } catch (Throwable unused) {
            g1.j("Cannot obtain package name, proceeding.");
            str2 = "unknown";
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z10)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        if (!str4.startsWith(str3)) {
            str4 = a.b(new StringBuilder(String.valueOf(str3).length() + 1 + str4.length()), str3, " ", str4);
        }
        arrayList2.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.f14584w.f12051s).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", es.a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "428884702").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(ut.f14487c.e())).appendQueryParameter("gmscv", String.valueOf(f.f133b.a(this.f14581t))).appendQueryParameter("lite", true != this.f14584w.f12055w ? "0" : "1").toString());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f14583v.execute(new k(new n90(null), (String) it.next(), 2));
        }
    }

    public final void e(Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z10 = false;
            boolean z11 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z10 |= g90.c(stackTraceElement.getClassName());
                    z11 |= v40.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z10 || z11) {
                return;
            }
            b(th, "", 1.0f);
        }
    }
}

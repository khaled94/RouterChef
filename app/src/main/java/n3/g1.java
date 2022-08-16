package n3;

import android.util.Log;
import java.util.Iterator;
import m4.aa0;
import m4.b10;
import m4.mu1;
import m4.ot;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a */
    public static final aa0 f16476a = new aa0(new b10(4000));

    public static void a(String str) {
        if (c()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            aa0 aa0Var = f16476a;
            Iterator<String> l10 = ((mu1) aa0Var.f6088t).l(aa0Var, str);
            boolean z10 = true;
            while (l10.hasNext()) {
                String next = l10.next();
                if (z10) {
                    Log.v("Ads", next);
                } else {
                    Log.v("Ads-cont", next);
                }
                z10 = false;
            }
        }
    }

    public static void b(String str, Throwable th) {
        if (c()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean c() {
        return m(2) && ot.f12288a.e().booleanValue();
    }

    public static String d(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 4) {
            int lineNumber = stackTrace[3].getLineNumber();
            StringBuilder sb = new StringBuilder(str.length() + 13);
            sb.append(str);
            sb.append(" @");
            sb.append(lineNumber);
            return sb.toString();
        }
        return str;
    }

    public static void e(String str) {
        if (m(3)) {
            if (str == null || str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            aa0 aa0Var = f16476a;
            Iterator<String> l10 = ((mu1) aa0Var.f6088t).l(aa0Var, str);
            boolean z10 = true;
            while (l10.hasNext()) {
                String next = l10.next();
                if (z10) {
                    Log.d("Ads", next);
                } else {
                    Log.d("Ads-cont", next);
                }
                z10 = false;
            }
        }
    }

    public static void f(String str, Throwable th) {
        if (m(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void g(String str) {
        if (m(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            aa0 aa0Var = f16476a;
            Iterator<String> l10 = ((mu1) aa0Var.f6088t).l(aa0Var, str);
            boolean z10 = true;
            while (l10.hasNext()) {
                String next = l10.next();
                if (z10) {
                    Log.e("Ads", next);
                } else {
                    Log.e("Ads-cont", next);
                }
                z10 = false;
            }
        }
    }

    public static void h(String str, Throwable th) {
        if (m(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void i(String str) {
        if (m(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i("Ads", str);
                return;
            }
            aa0 aa0Var = f16476a;
            Iterator<String> l10 = ((mu1) aa0Var.f6088t).l(aa0Var, str);
            boolean z10 = true;
            while (l10.hasNext()) {
                String next = l10.next();
                if (z10) {
                    Log.i("Ads", next);
                } else {
                    Log.i("Ads-cont", next);
                }
                z10 = false;
            }
        }
    }

    public static void j(String str) {
        if (m(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w("Ads", str);
                return;
            }
            aa0 aa0Var = f16476a;
            Iterator<String> l10 = ((mu1) aa0Var.f6088t).l(aa0Var, str);
            boolean z10 = true;
            while (l10.hasNext()) {
                String next = l10.next();
                if (z10) {
                    Log.w("Ads", next);
                } else {
                    Log.w("Ads-cont", next);
                }
                z10 = false;
            }
        }
    }

    public static void k(String str, Throwable th) {
        if (m(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void l(String str, Throwable th) {
        if (m(5)) {
            String d5 = d(str);
            if (th != null) {
                k(d5, th);
            } else {
                j(d5);
            }
        }
    }

    public static boolean m(int i10) {
        return i10 >= 5 || Log.isLoggable("Ads", i10);
    }
}

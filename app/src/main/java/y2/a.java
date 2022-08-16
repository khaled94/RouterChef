package y2;

import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public final class a {
    public static void a(String str, String str2, Object obj) {
        String d5 = d(str);
        if (Log.isLoggable(d5, 3)) {
            Log.d(d5, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        String d5 = d(str);
        if (Log.isLoggable(d5, 3)) {
            Log.d(d5, String.format(str2, objArr));
        }
    }

    public static void c(String str, String str2, Throwable th) {
        String d5 = d(str);
        if (Log.isLoggable(d5, 6)) {
            Log.e(d5, str2, th);
        }
    }

    public static String d(String str) {
        if (Build.VERSION.SDK_INT < 24) {
            String c10 = d7.a.c("TRuntime.", str);
            return c10.length() > 23 ? c10.substring(0, 23) : c10;
        }
        return d7.a.c("TRuntime.", str);
    }

    public static void e(String str, Object obj) {
        String d5 = d("CctTransportBackend");
        if (Log.isLoggable(d5, 4)) {
            Log.i(d5, String.format(str, obj));
        }
    }
}

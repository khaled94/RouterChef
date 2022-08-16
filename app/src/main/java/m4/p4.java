package m4;

import android.util.Log;
import androidx.fragment.app.a;
import java.util.Locale;

/* loaded from: classes.dex */
public final class p4 {

    /* renamed from: a */
    public static final boolean f12403a = Log.isLoggable("Volley", 2);

    /* renamed from: b */
    public static final String f12404b = p4.class.getName();

    public static void a(String str, Object... objArr) {
        Log.d("Volley", d(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e("Volley", d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (f12403a) {
            Log.v("Volley", d(str, objArr));
        }
    }

    public static String d(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i10].getClassName().equals(f12404b)) {
                String className = stackTrace[i10].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i10].getMethodName();
                str2 = a.b(new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length()), substring2, ".", methodName);
                break;
            } else {
                i10++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format);
    }
}

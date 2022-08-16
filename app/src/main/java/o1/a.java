package o1;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static long f16734a;

    /* renamed from: b */
    public static Method f16735b;

    @SuppressLint({"NewApi"})
    public static boolean a() {
        try {
            if (f16735b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f16735b == null) {
                f16734a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f16735b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f16735b.invoke(null, Long.valueOf(f16734a))).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
                return false;
            }
            Throwable cause = e10.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }
}

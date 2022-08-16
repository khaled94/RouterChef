package n3;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;
import m4.v40;

/* loaded from: classes.dex */
public final class z0 {
    @Deprecated
    public static <T> T a(Context context, Callable<T> callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            g1.h("Unexpected exception.", th);
            v40.c(context).a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}

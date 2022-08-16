package m4;

import android.os.StrictMode;

/* loaded from: classes.dex */
public final class fs {
    public static <T> T a(nu1<T> nu1Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return nu1Var.mo19zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}

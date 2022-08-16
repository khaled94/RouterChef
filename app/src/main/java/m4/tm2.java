package m4;

import android.system.ErrnoException;
import android.system.OsConstants;

/* loaded from: classes.dex */
public final class tm2 {
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}

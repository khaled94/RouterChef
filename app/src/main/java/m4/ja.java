package m4;

import java.io.IOException;

/* loaded from: classes.dex */
public final class ja extends Exception {
    public ja(Throwable th) {
        super(null, th);
    }

    public static ja a(Exception exc, int i10) {
        return new ja(exc);
    }

    public static ja b(IOException iOException) {
        return new ja(iOException);
    }

    public static ja c(RuntimeException runtimeException) {
        return new ja(runtimeException);
    }
}

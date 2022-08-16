package h4;

import android.content.Context;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {
    public static void a(Context context, Throwable th) {
        try {
            Objects.requireNonNull(context, "null reference");
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
        }
    }
}

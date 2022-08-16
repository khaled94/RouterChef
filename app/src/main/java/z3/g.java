package z3;

import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public final class g extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z10) {
        if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
            if (!Log.isLoggable("CloudMessengerCompat", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("CloudMessengerCompat", 3))) {
                return h.class;
            }
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return h.class;
        }
        return super.loadClass(str, z10);
    }
}

package m4;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* loaded from: classes.dex */
public final class z7 {

    /* renamed from: a */
    public NetworkCapabilities f16023a;

    public z7(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new y7(this));
        } catch (RuntimeException unused) {
            synchronized (z7.class) {
                this.f16023a = null;
            }
        }
    }
}

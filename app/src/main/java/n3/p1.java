package n3;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public final class p1 extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        synchronized (s1.class) {
            s1.f16556j = true;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (s1.class) {
            s1.f16556j = false;
        }
    }
}

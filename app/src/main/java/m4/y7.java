package m4;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class y7 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ z7 f15602a;

    public y7(z7 z7Var) {
        this.f15602a = z7Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (z7.class) {
            this.f15602a.f16023a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (z7.class) {
            this.f15602a.f16023a = null;
        }
    }
}

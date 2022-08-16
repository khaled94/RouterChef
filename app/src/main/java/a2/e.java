package a2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import t1.h;

/* loaded from: classes.dex */
public final class e extends d<y1.b> {

    /* renamed from: j */
    public static final String f24j = h.e("NetworkStateTracker");

    /* renamed from: g */
    public final ConnectivityManager f25g = (ConnectivityManager) this.f18b.getSystemService("connectivity");

    /* renamed from: h */
    public b f26h;

    /* renamed from: i */
    public a f27i;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
            e.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            h.c().a(e.f24j, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    /* loaded from: classes.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
            e.this = r1;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            h.c().a(e.f24j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            h.c().a(e.f24j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    public e(Context context, f2.a aVar) {
        super(context, aVar);
        if (g()) {
            this.f26h = new b();
        } else {
            this.f27i = new a();
        }
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // a2.d
    public final y1.b a() {
        return f();
    }

    @Override // a2.d
    public final void d() {
        if (!g()) {
            h.c().a(f24j, "Registering broadcast receiver", new Throwable[0]);
            this.f18b.registerReceiver(this.f27i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            h.c().a(f24j, "Registering network callback", new Throwable[0]);
            this.f25g.registerDefaultNetworkCallback(this.f26h);
        } catch (IllegalArgumentException | SecurityException e10) {
            h.c().b(f24j, "Received exception while registering network callback", e10);
        }
    }

    @Override // a2.d
    public final void e() {
        if (!g()) {
            h.c().a(f24j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f18b.unregisterReceiver(this.f27i);
            return;
        }
        try {
            h.c().a(f24j, "Unregistering network callback", new Throwable[0]);
            this.f25g.unregisterNetworkCallback(this.f26h);
        } catch (IllegalArgumentException | SecurityException e10) {
            h.c().b(f24j, "Received exception while unregistering network callback", e10);
        }
    }

    public final y1.b f() {
        boolean z10;
        NetworkCapabilities networkCapabilities;
        NetworkInfo activeNetworkInfo = this.f25g.getActiveNetworkInfo();
        boolean z11 = true;
        boolean z12 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = this.f25g.getNetworkCapabilities(this.f25g.getActiveNetwork());
        } catch (SecurityException e10) {
            h.c().b(f24j, "Unable to validate active network", e10);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z10 = true;
                boolean a10 = h0.a.a(this.f25g);
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z11 = false;
                }
                return new y1.b(z12, z10, a10, z11);
            }
        }
        z10 = false;
        boolean a102 = h0.a.a(this.f25g);
        if (activeNetworkInfo != null) {
        }
        z11 = false;
        return new y1.b(z12, z10, a102, z11);
    }
}

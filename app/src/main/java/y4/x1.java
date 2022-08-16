package y4;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x1 extends v5 {
    public x1(a6 a6Var) {
        super(a6Var);
    }

    @Override // y4.v5
    public final void j() {
    }

    public final HttpURLConnection k(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            Objects.requireNonNull((w2) this.f20505s);
            httpURLConnection.setConnectTimeout(60000);
            Objects.requireNonNull((w2) this.f20505s);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    public final boolean l() {
        NetworkInfo activeNetworkInfo;
        h();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((w2) this.f20505s).f20786s.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        activeNetworkInfo = null;
        if (activeNetworkInfo != null) {
            return false;
        }
    }
}

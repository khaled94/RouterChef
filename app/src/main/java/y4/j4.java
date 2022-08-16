package y4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j4 extends j3 {
    public j4(w2 w2Var) {
        super(w2Var);
    }

    @Override // y4.j3
    public final boolean i() {
        return false;
    }

    public final HttpURLConnection n(URL url) {
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
}

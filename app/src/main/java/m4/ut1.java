package m4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.Set;
import k9.u;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class ut1 extends st1 {

    /* renamed from: s */
    public nu1<Integer> f14498s = u.f5693u;

    /* renamed from: t */
    public vc0 f14499t = null;

    /* renamed from: u */
    public HttpURLConnection f14500u;

    public final HttpURLConnection b(vc0 vc0Var) {
        this.f14498s = new nu1() { // from class: m4.tt1

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ int f14165s = -1;

            @Override // m4.nu1
            /* renamed from: zza */
            public final Object mo19zza() {
                return Integer.valueOf(this.f14165s);
            }
        };
        this.f14499t = vc0Var;
        Integer num = 265;
        num.intValue();
        this.f14498s.mo19zza().intValue();
        vc0 vc0Var2 = this.f14499t;
        Objects.requireNonNull(vc0Var2);
        Set<String> set = wc0.f14933x;
        x90 x90Var = s.B.f5801o;
        int intValue = ((Integer) jo.f10145d.f10148c.a(es.f8180r)).intValue();
        URL url = new URL((String) vc0Var2.f14660s);
        int i10 = 0;
        while (true) {
            i10++;
            if (i10 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(intValue);
                openConnection.setReadTimeout(intValue);
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                k90 k90Var = new k90();
                k90Var.a(httpURLConnection, null);
                httpURLConnection.setInstanceFollowRedirects(false);
                int responseCode = httpURLConnection.getResponseCode();
                k90Var.b(httpURLConnection, responseCode);
                if (responseCode / 100 != 3) {
                    this.f14500u = httpURLConnection;
                    return httpURLConnection;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    throw new IOException("Protocol is null");
                }
                if (!protocol.equals("http") && !protocol.equals("https")) {
                    throw new IOException(protocol.length() != 0 ? "Unsupported scheme: ".concat(protocol) : new String("Unsupported scheme: "));
                }
                g1.e(headerField.length() != 0 ? "Redirecting to ".concat(headerField) : new String("Redirecting to "));
                httpURLConnection.disconnect();
                url = url2;
            } else {
                throw new IOException("Too many redirects (20)");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f14500u;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}

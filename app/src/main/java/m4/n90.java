package m4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import n3.g1;

/* loaded from: classes.dex */
public class n90 implements f90 {

    /* renamed from: s */
    public final String f11574s;

    public n90() {
        this.f11574s = null;
    }

    public n90(String str) {
        this.f11574s = str;
    }

    /* JADX WARN: Finally extract failed */
    @Override // m4.f90
    public void b(String str) {
        StringBuilder sb;
        Throwable e10;
        try {
            String valueOf = String.valueOf(str);
            g1.e(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                g90 g90Var = io.f9708f.f9709a;
                String str2 = this.f11574s;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                k90 k90Var = new k90();
                k90Var.a(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                k90Var.b(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
                    sb2.append("Received non-success response code ");
                    sb2.append(responseCode);
                    sb2.append(" from pinging URL: ");
                    sb2.append(str);
                    g1.j(sb2.toString());
                }
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException e11) {
            e10 = e11;
            String message = e10.getMessage();
            sb = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb.append("Error while pinging URL: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            g1.j(sb.toString());
        } catch (IndexOutOfBoundsException e12) {
            String message2 = e12.getMessage();
            sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb.append("Error while parsing ping URL: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message2);
            g1.j(sb.toString());
        } catch (RuntimeException e13) {
            e10 = e13;
            String message3 = e10.getMessage();
            sb = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
            sb.append("Error while pinging URL: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message3);
            g1.j(sb.toString());
        }
    }
}

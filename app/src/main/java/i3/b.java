package i3;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: s */
    public final /* synthetic */ Map f5264s;

    public b(Map map) {
        this.f5264s = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String message;
        StringBuilder sb;
        String str;
        Map map = this.f5264s;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, (String) map.get(str2));
        }
        String uri = buildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                    sb2.append("Received non-success response code ");
                    sb2.append(responseCode);
                    sb2.append(" from pinging URL: ");
                    sb2.append(uri);
                    Log.w("HttpUrlPinger", sb2.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e10) {
            e = e10;
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
            str = "Error while pinging URL: ";
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
            Log.w("HttpUrlPinger", sb.toString(), e);
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 32);
            str = "Error while parsing ping URL: ";
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
            Log.w("HttpUrlPinger", sb.toString(), e);
        } catch (RuntimeException e12) {
            e = e12;
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
            str = "Error while pinging URL: ";
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
            Log.w("HttpUrlPinger", sb.toString(), e);
        }
    }
}

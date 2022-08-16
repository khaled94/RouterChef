package u7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.activity.result.a;
import c5.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;
import u7.d;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: s */
    public final URL f19600s;

    /* renamed from: t */
    public volatile Future<?> f19601t;

    /* renamed from: u */
    public i<Bitmap> f19602u;

    public x(URL url) {
        this.f19600s = url;
    }

    public final Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            StringBuilder c10 = a.c("Starting download of: ");
            c10.append(this.f19600s);
            Log.i("FirebaseMessaging", c10.toString());
        }
        URLConnection openConnection = this.f19600s.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] b10 = d.b(new d.a(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    StringBuilder c11 = a.c("Downloaded ");
                    c11.append(b10.length);
                    c11.append(" bytes from ");
                    c11.append(this.f19600s);
                    Log.v("FirebaseMessaging", c11.toString());
                }
                if (b10.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b10, 0, b10.length);
                    if (decodeByteArray == null) {
                        StringBuilder c12 = a.c("Failed to decode image: ");
                        c12.append(this.f19600s);
                        throw new IOException(c12.toString());
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        StringBuilder c13 = a.c("Successfully downloaded image: ");
                        c13.append(this.f19600s);
                        Log.d("FirebaseMessaging", c13.toString());
                    }
                    return decodeByteArray;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19601t.cancel(true);
    }
}

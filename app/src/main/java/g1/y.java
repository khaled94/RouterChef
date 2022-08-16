package g1;

import android.database.sqlite.SQLiteDatabase;
import b3.b0;
import c5.a;
import c5.i;
import c5.j;
import h7.b;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import r2.c;
import s2.h;
import s2.n;
import s6.l0;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements a, b0.c {

    /* renamed from: s */
    public final /* synthetic */ Object f4861s;

    public /* synthetic */ y(Object obj) {
        this.f4861s = obj;
    }

    public Object a(Object obj) {
        Throwable e10;
        Throwable e11;
        c cVar = (c) this.f4861s;
        c.a aVar = (c.a) obj;
        Objects.requireNonNull(cVar);
        y2.a.e("Making request to: %s", aVar.f17242a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f17242a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f17241g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.6"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f17244c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                cVar.f17235a.a(aVar.f17243b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                y2.a.e("Status Code: %d", Integer.valueOf(responseCode));
                y2.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                y2.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new c.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new c.b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                    c.b bVar = new c.b(responseCode, null, ((h) n.a(new BufferedReader(new InputStreamReader(gZIPInputStream)))).f17669a);
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
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
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (b e12) {
            e11 = e12;
            y2.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
            return new c.b(400, null, 0L);
        } catch (ConnectException e13) {
            e10 = e13;
            y2.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new c.b(500, null, 0L);
        } catch (UnknownHostException e14) {
            e10 = e14;
            y2.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new c.b(500, null, 0L);
        } catch (IOException e15) {
            e11 = e15;
            y2.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
            return new c.b(400, null, 0L);
        }
    }

    public Object b() {
        q2.b bVar = b0.f2495x;
        ((SQLiteDatabase) this.f4861s).beginTransaction();
        return null;
    }

    @Override // c5.a
    public Object d(i iVar) {
        j jVar = (j) this.f4861s;
        ExecutorService executorService = l0.f18283a;
        if (iVar.n()) {
            jVar.d(iVar.j());
            return null;
        }
        Exception i10 = iVar.i();
        Objects.requireNonNull(i10);
        jVar.c(i10);
        return null;
    }
}

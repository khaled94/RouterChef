package s7;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import d4.m;
import d7.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import m7.i;
import o7.b;
import org.json.JSONException;
import org.json.JSONObject;
import p7.g;
import s7.b;
import s7.f;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d */
    public static final Pattern f18358d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    public static final Charset f18359e = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f18360a;

    /* renamed from: b */
    public final b<i> f18361b;

    /* renamed from: c */
    public final e f18362c = new e();

    public c(Context context, b<i> bVar) {
        this.f18360a = context;
        this.f18361b = bVar;
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f18359e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Log.w("Firebase-Installations", str4);
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            objArr[1] = str3;
            objArr[2] = TextUtils.isEmpty(str) ? "" : a.c(", ", str);
            Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr));
        }
    }

    public static long d(String str) {
        m.b(f18358d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    public final URL a(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new g(e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077 A[Catch: NameNotFoundException -> 0x00e1, TryCatch #3 {NameNotFoundException -> 0x00e1, blocks: (B:11:0x0063, B:13:0x0077, B:19:0x0081, B:24:0x008e, B:27:0x009e, B:28:0x00b9, B:30:0x00c3, B:31:0x00dc), top: B:43:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[Catch: NameNotFoundException -> 0x00e1, TRY_ENTER, TryCatch #3 {NameNotFoundException -> 0x00e1, blocks: (B:11:0x0063, B:13:0x0077, B:19:0x0081, B:24:0x008e, B:27:0x009e, B:28:0x00b9, B:30:0x00c3, B:31:0x00dc), top: B:43:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[Catch: NameNotFoundException -> 0x00e1, TryCatch #3 {NameNotFoundException -> 0x00e1, blocks: (B:11:0x0063, B:13:0x0077, B:19:0x0081, B:24:0x008e, B:27:0x009e, B:28:0x00b9, B:30:0x00c3, B:31:0x00dc), top: B:43:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9 A[Catch: NameNotFoundException -> 0x00e1, TryCatch #3 {NameNotFoundException -> 0x00e1, blocks: (B:11:0x0063, B:13:0x0077, B:19:0x0081, B:24:0x008e, B:27:0x009e, B:28:0x00b9, B:30:0x00c3, B:31:0x00dc), top: B:43:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection c(java.net.URL r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.c.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }

    public final d e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f18359e));
        f.a a10 = f.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        f fVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        ((b.a) a10).f18355a = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a10.b(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                fVar = a10.a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str, str2, str3, fVar, 1);
    }

    public final f f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f18359e));
        f.a a10 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                ((b.a) a10).f18355a = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a10.b(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        b.a aVar = (b.a) a10;
        aVar.f18357c = 1;
        return aVar.a();
    }

    public final void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }
}

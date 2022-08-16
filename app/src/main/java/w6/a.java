package w6;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final String f19926a;

    /* renamed from: b */
    public final Map<String, String> f19927b;

    /* renamed from: c */
    public final Map<String, String> f19928c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f19926a = str;
        this.f19927b = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
        r6 = r5;
        r5 = r1.getValue();
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
        r5 = r1;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
        r9 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r9.isEmpty() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
        if (r8.contains("?") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
        if (r8.endsWith("&") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
        r9 = d7.a.c("&", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
        return d7.a.c(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
        return e0.d.a(r8, "?", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (r1.getValue() != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
        r2.append(r5);
        r0.append(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
        if (r9.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
        r2 = r9.next();
        r4 = androidx.activity.result.a.c("&");
        r4.append(r2.getKey());
        r4.append("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005c, code lost:
        if (r2.getValue() == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
        r5 = r1;
        r1 = r2;
        r2 = r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0061 -> B:5:0x0030). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x006b -> B:4:0x002f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r3 = "="
            r2.append(r3)
            java.lang.Object r4 = r1.getValue()
            java.lang.String r5 = ""
            if (r4 == 0) goto L2f
            goto L61
        L2f:
            r1 = r5
        L30:
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            boolean r2 = r9.hasNext()
            java.lang.String r4 = "&"
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.StringBuilder r4 = androidx.activity.result.a.c(r4)
            java.lang.Object r5 = r2.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r4.append(r5)
            r4.append(r3)
            java.lang.Object r5 = r2.getValue()
            if (r5 == 0) goto L6b
            r5 = r1
            r1 = r2
            r2 = r4
        L61:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r6 = r5
            r5 = r1
            r1 = r6
            goto L30
        L6b:
            r5 = r1
            r2 = r4
            goto L2f
        L6e:
            java.lang.String r9 = r0.toString()
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L79
            return r8
        L79:
            java.lang.String r0 = "?"
            boolean r1 = r8.contains(r0)
            if (r1 == 0) goto L90
            boolean r0 = r8.endsWith(r4)
            if (r0 != 0) goto L8b
            java.lang.String r9 = d7.a.c(r4, r9)
        L8b:
            java.lang.String r8 = d7.a.c(r8, r9)
            return r8
        L90:
            java.lang.String r8 = e0.d.a(r8, r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.a.a(java.lang.String, java.util.Map):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    public final b b() {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String sb = null;
        inputStream = null;
        try {
            String a10 = a(this.f19926a, this.f19927b);
            String str = "GET Request URL: " + a10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(a10).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f19928c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, read);
                        }
                        sb = sb2.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new b(responseCode, sb);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    public final a c(String str, String str2) {
        this.f19928c.put(str, str2);
        return this;
    }
}

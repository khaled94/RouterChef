package m4;

import android.net.Uri;
import androidx.fragment.app.b1;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import q3.f;

/* loaded from: classes.dex */
public final class ju0 extends xo0 implements vy0 {

    /* renamed from: e */
    public final boolean f10193e;

    /* renamed from: f */
    public final int f10194f;

    /* renamed from: g */
    public final int f10195g;

    /* renamed from: h */
    public final String f10196h;

    /* renamed from: i */
    public final f f10197i;

    /* renamed from: j */
    public final f f10198j = new f();

    /* renamed from: k */
    public gs0 f10199k;

    /* renamed from: l */
    public HttpURLConnection f10200l;

    /* renamed from: m */
    public InputStream f10201m;

    /* renamed from: n */
    public boolean f10202n;

    /* renamed from: o */
    public int f10203o;
    public long p;

    /* renamed from: q */
    public long f10204q;

    public ju0(String str, int i10, int i11, boolean z10, f fVar) {
        super(true);
        this.f10196h = str;
        this.f10194f = i10;
        this.f10195g = i11;
        this.f10193e = z10;
        this.f10197i = fVar;
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j3 = this.p;
            if (j3 != -1) {
                long j10 = j3 - this.f10204q;
                if (j10 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j10);
            }
            InputStream inputStream = this.f10201m;
            int i12 = ls1.f10971a;
            int read = inputStream.read(bArr, i10, i11);
            if (read == -1) {
                return -1;
            }
            this.f10204q += read;
            p(read);
            return read;
        } catch (IOException e10) {
            gs0 gs0Var = this.f10199k;
            int i13 = ls1.f10971a;
            throw ow0.a(e10, gs0Var, 2);
        }
    }

    @Override // m4.kq0
    public final Uri h() {
        HttpURLConnection httpURLConnection = this.f10200l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // m4.kq0
    public final void i() {
        try {
            InputStream inputStream = this.f10201m;
            if (inputStream != null) {
                long j3 = this.p;
                long j10 = j3 == -1 ? -1L : j3 - this.f10204q;
                HttpURLConnection httpURLConnection = this.f10200l;
                try {
                    if (httpURLConnection != null) {
                        int i10 = ls1.f10971a;
                        if (i10 >= 19) {
                            if (i10 <= 20) {
                                try {
                                    InputStream inputStream2 = httpURLConnection.getInputStream();
                                    if (j10 == -1) {
                                        if (inputStream2.read() != -1) {
                                        }
                                    } else if (j10 <= 2048) {
                                    }
                                    String name = inputStream2.getClass().getName();
                                    if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                        Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                        Objects.requireNonNull(superclass);
                                        Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                        declaredMethod.setAccessible(true);
                                        declaredMethod.invoke(inputStream2, new Object[0]);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            inputStream.close();
                        }
                    }
                    inputStream.close();
                } catch (IOException e10) {
                    int i11 = ls1.f10971a;
                    throw new ow0(e10, 2000, 3);
                }
            }
        } finally {
            this.f10201m = null;
            v();
            if (this.f10202n) {
                this.f10202n = false;
                q();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r8 != r12) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019e  */
    @Override // m4.kq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(m4.gs0 r25) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ju0.k(m4.gs0):long");
    }

    public final HttpURLConnection t(URL url, long j3, long j10, boolean z10, boolean z11, Map map) {
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f10194f);
        httpURLConnection.setReadTimeout(this.f10195g);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f10197i.a());
        hashMap.putAll(this.f10198j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j3 == 0 && j10 == -1) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j3);
            sb.append("-");
            if (j10 != -1) {
                sb.append((j3 + j10) - 1);
            }
            str = sb.toString();
        }
        if (str != null) {
            httpURLConnection.setRequestProperty("Range", str);
        }
        String str2 = this.f10196h;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z10 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final URL u(URL url, String str, gs0 gs0Var) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    throw new ow0(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
                } else if (this.f10193e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
                    b1.b(sb, "Disallowed cross-protocol redirect (", protocol2, " to ", protocol);
                    sb.append(")");
                    throw new ow0(sb.toString());
                }
            } catch (MalformedURLException e10) {
                throw new ow0(e10, 2001, 1);
            }
        }
        throw new ow0("Null location redirect");
    }

    public final void v() {
        HttpURLConnection httpURLConnection = this.f10200l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                x90.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f10200l = null;
        }
    }

    @Override // m4.xo0, m4.kq0, m4.vy0
    public final Map<String, List<String>> zza() {
        HttpURLConnection httpURLConnection = this.f10200l;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }
}

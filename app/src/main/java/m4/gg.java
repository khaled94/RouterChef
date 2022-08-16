package m4;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import g1.l;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class gg implements jg {

    /* renamed from: n */
    public static final Pattern f8850n = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: o */
    public static final AtomicReference<byte[]> f8851o = new AtomicReference<>();

    /* renamed from: a */
    public final int f8852a;

    /* renamed from: b */
    public final int f8853b;

    /* renamed from: c */
    public final String f8854c;

    /* renamed from: d */
    public final l f8855d;

    /* renamed from: e */
    public final ng<? super gg> f8856e;

    /* renamed from: f */
    public dg f8857f;

    /* renamed from: g */
    public HttpURLConnection f8858g;

    /* renamed from: h */
    public InputStream f8859h;

    /* renamed from: i */
    public boolean f8860i;

    /* renamed from: j */
    public long f8861j;

    /* renamed from: k */
    public long f8862k;

    /* renamed from: l */
    public long f8863l;

    /* renamed from: m */
    public long f8864m;

    public gg(String str, ng ngVar, int i10, int i11) {
        if (!TextUtils.isEmpty(str)) {
            this.f8854c = str;
            this.f8856e = ngVar;
            this.f8855d = new l(1);
            this.f8852a = i10;
            this.f8853b = i11;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f8858g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f8858g = null;
        }
    }

    @Override // m4.jg
    public final Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f8858g;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // m4.bg
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.f8858g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // m4.bg
    public final int e(byte[] bArr, int i10, int i11) {
        try {
            if (this.f8863l != this.f8861j) {
                byte[] andSet = f8851o.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j3 = this.f8863l;
                    long j10 = this.f8861j;
                    if (j3 == j10) {
                        f8851o.set(andSet);
                        break;
                    }
                    int read = this.f8859h.read(andSet, 0, (int) Math.min(j10 - j3, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f8863l += read;
                    ng<? super gg> ngVar = this.f8856e;
                    if (ngVar != null) {
                        ngVar.f0(read);
                    }
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j11 = this.f8862k;
            if (j11 != -1) {
                long j12 = j11 - this.f8864m;
                if (j12 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j12);
            }
            int read2 = this.f8859h.read(bArr, i10, i11);
            if (read2 == -1) {
                if (this.f8862k != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.f8864m += read2;
            ng<? super gg> ngVar2 = this.f8856e;
            if (ngVar2 == null) {
                return read2;
            }
            ngVar2.f0(read2);
            return read2;
        } catch (IOException e10) {
            throw new hg(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
        if (r5 != 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024f A[Catch: IOException -> 0x02ad, TryCatch #3 {IOException -> 0x02ad, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:7:0x0042, B:9:0x0048, B:16:0x0070, B:18:0x008a, B:20:0x00a7, B:21:0x00ac, B:34:0x00e2, B:90:0x0244, B:92:0x024f, B:94:0x0260, B:96:0x0268, B:98:0x0276, B:99:0x027b, B:100:0x0280, B:101:0x0283, B:103:0x028c, B:104:0x0293, B:105:0x0294, B:106:0x02ac), top: B:120:0x000e }] */
    @Override // m4.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(m4.dg r23) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.gg.f(m4.dg):long");
    }

    @Override // m4.bg
    public final void g() {
        try {
            if (this.f8859h != null) {
                HttpURLConnection httpURLConnection = this.f8858g;
                long j3 = this.f8862k;
                if (j3 != -1) {
                    j3 -= this.f8864m;
                }
                int i10 = wg.f14958a;
                if (i10 == 19 || i10 == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j3 == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j3 <= 2048) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.f8859h.close();
                } catch (IOException e10) {
                    throw new hg(e10);
                }
            }
        } finally {
            this.f8859h = null;
            a();
            if (this.f8860i) {
                this.f8860i = false;
            }
        }
    }
}

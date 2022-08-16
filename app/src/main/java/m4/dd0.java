package m4;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import n3.g1;
import q3.f;

/* loaded from: classes.dex */
public final class dd0 extends xo0 implements vy0 {

    /* renamed from: u */
    public static final Pattern f7312u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v */
    public static final AtomicReference<byte[]> f7313v = new AtomicReference<>();

    /* renamed from: f */
    public final int f7315f;

    /* renamed from: g */
    public final int f7316g;

    /* renamed from: h */
    public final String f7317h;

    /* renamed from: i */
    public final f f7318i;

    /* renamed from: j */
    public gs0 f7319j;

    /* renamed from: k */
    public HttpURLConnection f7320k;

    /* renamed from: l */
    public InputStream f7321l;

    /* renamed from: m */
    public boolean f7322m;

    /* renamed from: n */
    public int f7323n;

    /* renamed from: o */
    public long f7324o;
    public long p;

    /* renamed from: q */
    public long f7325q;

    /* renamed from: r */
    public long f7326r;

    /* renamed from: s */
    public int f7327s;

    /* renamed from: e */
    public final cd0 f7314e = new cd0(this);

    /* renamed from: t */
    public final Set<Socket> f7328t = new HashSet();

    public dd0(String str, i01 i01Var, int i10, int i11, int i12) {
        super(true);
        if (!TextUtils.isEmpty(str)) {
            this.f7317h = str;
            this.f7318i = new f();
            this.f7315f = i10;
            this.f7316g = i11;
            this.f7327s = i12;
            if (i01Var == null) {
                return;
            }
            f(i01Var);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        try {
            if (this.f7325q != this.f7324o) {
                byte[] andSet = f7313v.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j3 = this.f7325q;
                    long j10 = this.f7324o;
                    if (j3 == j10) {
                        f7313v.set(andSet);
                        break;
                    }
                    int read = this.f7321l.read(andSet, 0, (int) Math.min(j10 - j3, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f7325q += read;
                    p(read);
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j11 = this.p;
            if (j11 != -1) {
                long j12 = j11 - this.f7326r;
                if (j12 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j12);
            }
            int read2 = this.f7321l.read(bArr, i10, i11);
            if (read2 == -1) {
                if (this.p != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.f7326r += read2;
            p(read2);
            return read2;
        } catch (IOException e10) {
            throw new ow0(e10, 2000, 2);
        }
    }

    @Override // m4.kq0
    public final Uri h() {
        HttpURLConnection httpURLConnection = this.f7320k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<java.net.Socket>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<java.net.Socket>] */
    @Override // m4.kq0
    public final void i() {
        try {
            if (this.f7321l != null) {
                HttpURLConnection httpURLConnection = this.f7320k;
                long j3 = this.p;
                if (j3 != -1) {
                    j3 -= this.f7326r;
                }
                int i10 = ls1.f10971a;
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
                    this.f7321l.close();
                } catch (IOException e10) {
                    throw new ow0(e10, 2000, 3);
                }
            }
        } finally {
            this.f7321l = null;
            t();
            if (this.f7322m) {
                this.f7322m = false;
                q();
            }
            this.f7328t.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
        if (r3 != 0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f0  */
    @Override // m4.kq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(m4.gs0 r22) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.dd0.k(m4.gs0):long");
    }

    public final void t() {
        HttpURLConnection httpURLConnection = this.f7320k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                g1.h("Unexpected error while disconnecting", e10);
            }
            this.f7320k = null;
        }
    }

    @Override // m4.xo0, m4.kq0, m4.vy0
    public final Map<String, List<String>> zza() {
        HttpURLConnection httpURLConnection = this.f7320k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}

package m4;

import android.net.Uri;
import android.text.TextUtils;
import g1.l;
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

/* loaded from: classes.dex */
public final class vb0 implements jg {

    /* renamed from: q */
    public static final Pattern f14641q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r */
    public static final AtomicReference<byte[]> f14642r = new AtomicReference<>();

    /* renamed from: b */
    public final int f14644b;

    /* renamed from: c */
    public final int f14645c;

    /* renamed from: d */
    public final String f14646d;

    /* renamed from: e */
    public final l f14647e;

    /* renamed from: f */
    public final ng<? super vb0> f14648f;

    /* renamed from: g */
    public dg f14649g;

    /* renamed from: h */
    public HttpURLConnection f14650h;

    /* renamed from: i */
    public InputStream f14651i;

    /* renamed from: j */
    public boolean f14652j;

    /* renamed from: k */
    public long f14653k;

    /* renamed from: l */
    public long f14654l;

    /* renamed from: m */
    public long f14655m;

    /* renamed from: n */
    public long f14656n;

    /* renamed from: o */
    public int f14657o;

    /* renamed from: a */
    public final tb0 f14643a = new tb0(this);
    public final Set<Socket> p = new HashSet();

    public vb0(String str, ng<? super vb0> ngVar, int i10, int i11, int i12) {
        if (!TextUtils.isEmpty(str)) {
            this.f14646d = str;
            this.f14648f = ngVar;
            this.f14647e = new l(1);
            this.f14644b = i10;
            this.f14645c = i11;
            this.f14657o = i12;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f14650h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                g1.h("Unexpected error while disconnecting", e10);
            }
            this.f14650h = null;
        }
    }

    @Override // m4.jg
    public final Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f14650h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // m4.bg
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.f14650h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // m4.bg
    public final int e(byte[] bArr, int i10, int i11) {
        try {
            if (this.f14655m != this.f14653k) {
                byte[] andSet = f14642r.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j3 = this.f14655m;
                    long j10 = this.f14653k;
                    if (j3 == j10) {
                        f14642r.set(andSet);
                        break;
                    }
                    int read = this.f14651i.read(andSet, 0, (int) Math.min(j10 - j3, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f14655m += read;
                    ng<? super vb0> ngVar = this.f14648f;
                    if (ngVar != null) {
                        ((dc0) ngVar).V(read);
                    }
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j11 = this.f14654l;
            if (j11 != -1) {
                long j12 = j11 - this.f14656n;
                if (j12 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j12);
            }
            int read2 = this.f14651i.read(bArr, i10, i11);
            if (read2 == -1) {
                if (this.f14654l != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.f14656n += read2;
            ng<? super vb0> ngVar2 = this.f14648f;
            if (ngVar2 == null) {
                return read2;
            }
            ((dc0) ngVar2).V(read2);
            return read2;
        } catch (IOException e10) {
            throw new hg(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
        if (r3 != 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01da  */
    @Override // m4.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(m4.dg r20) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.vb0.f(m4.dg):long");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<java.net.Socket>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<java.net.Socket>] */
    @Override // m4.bg
    public final void g() {
        try {
            if (this.f14651i != null) {
                HttpURLConnection httpURLConnection = this.f14650h;
                long j3 = this.f14654l;
                if (j3 != -1) {
                    j3 -= this.f14656n;
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
                    this.f14651i.close();
                } catch (IOException e10) {
                    throw new hg(e10);
                }
            }
        } finally {
            this.f14651i = null;
            a();
            if (this.f14652j) {
                this.f14652j = false;
            }
            this.p.clear();
        }
    }
}

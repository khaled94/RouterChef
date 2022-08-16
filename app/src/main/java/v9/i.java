package v9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import r9.c0;
import r9.g0;
import r9.w;
import r9.z;
import u9.d;

/* loaded from: classes.dex */
public final class i implements w {

    /* renamed from: a */
    public final z f19855a;

    public i(z zVar) {
        this.f19855a = zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010f, code lost:
        if (r4.f17375u == 408) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0118, code lost:
        if (c(r11, 0) > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0142, code lost:
        if (r3.f17375u == 503) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014c, code lost:
        if (c(r11, Integer.MAX_VALUE) != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014e, code lost:
        r3 = r11.f17373s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0169, code lost:
        if (r5.equals("HEAD") == false) goto L91;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x027c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b6  */
    /* JADX WARN: Type inference failed for: r19v0, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r25v0, types: [v9.i] */
    /* JADX WARN: Type inference failed for: r2v1, types: [v9.f] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.IOException, u9.d] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [u9.i] */
    @Override // r9.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r9.g0 a(r9.w.a r26) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.i.a(r9.w$a):r9.g0");
    }

    public final boolean b(IOException iOException, u9.i iVar, boolean z10, c0 c0Var) {
        boolean z11;
        if (!this.f19855a.M) {
            return false;
        }
        if (z10 && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z10))) {
            return false;
        }
        d dVar = iVar.f19677h;
        synchronized (dVar.f19629c) {
            z11 = dVar.f19635i;
        }
        return z11 && iVar.f19677h.c();
    }

    public final int c(g0 g0Var, int i10) {
        String c10 = g0Var.c("Retry-After");
        if (c10 == null) {
            return i10;
        }
        if (!c10.matches("\\d+")) {
            return Integer.MAX_VALUE;
        }
        return Integer.valueOf(c10).intValue();
    }
}

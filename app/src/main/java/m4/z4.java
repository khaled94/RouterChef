package m4;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class z4 extends FilterInputStream {

    /* renamed from: s */
    public final HttpURLConnection f16001s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z4(java.net.HttpURLConnection r2) {
        /*
            r1 = this;
            java.io.InputStream r0 = r2.getInputStream()     // Catch: java.io.IOException -> L5
            goto L9
        L5:
            java.io.InputStream r0 = r2.getErrorStream()
        L9:
            r1.<init>(r0)
            r1.f16001s = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.z4.<init>(java.net.HttpURLConnection):void");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f16001s.disconnect();
    }
}

package m4;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class vm2 extends xo0 {

    /* renamed from: e */
    public RandomAccessFile f14730e;

    /* renamed from: f */
    public Uri f14731f;

    /* renamed from: g */
    public long f14732g;

    /* renamed from: h */
    public boolean f14733h;

    public vm2() {
        super(false);
    }

    @Override // m4.jp0
    public final int d(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.f14732g;
        if (j3 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f14730e;
            int i12 = ls1.f10971a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j3, i11));
            if (read > 0) {
                this.f14732g -= read;
                p(read);
            }
            return read;
        } catch (IOException e10) {
            throw new um2(e10, 2000);
        }
    }

    @Override // m4.kq0
    public final Uri h() {
        return this.f14731f;
    }

    @Override // m4.kq0
    public final void i() {
        this.f14731f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14730e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f14730e = null;
                if (!this.f14733h) {
                    return;
                }
                this.f14733h = false;
                q();
            } catch (IOException e10) {
                throw new um2(e10, 2000);
            }
        } catch (Throwable th) {
            this.f14730e = null;
            if (this.f14733h) {
                this.f14733h = false;
                q();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r1 != false) goto L36;
     */
    @Override // m4.kq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k(m4.gs0 r8) {
        /*
            r7 = this;
            android.net.Uri r0 = r8.f9017a
            r7.f14731f = r0
            r7.r(r8)
            r1 = 1
            r2 = 2000(0x7d0, float:2.803E-42)
            r3 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            java.lang.String r5 = r0.getPath()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            java.util.Objects.requireNonNull(r5)
            java.lang.String r6 = "r"
            r4.<init>(r5, r6)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            r7.f14730e = r4
            long r5 = r8.f9020d     // Catch: java.io.IOException -> L4b
            r4.seek(r5)     // Catch: java.io.IOException -> L4b
            long r3 = r8.f9021e     // Catch: java.io.IOException -> L4b
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L32
            java.io.RandomAccessFile r0 = r7.f14730e     // Catch: java.io.IOException -> L4b
            long r3 = r0.length()     // Catch: java.io.IOException -> L4b
            long r5 = r8.f9020d     // Catch: java.io.IOException -> L4b
            long r3 = r3 - r5
        L32:
            r7.f14732g = r3     // Catch: java.io.IOException -> L4b
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L42
            r7.f14733h = r1
            r7.s(r8)
            long r0 = r7.f14732g
            return r0
        L42:
            m4.um2 r8 = new m4.um2
            r0 = 2008(0x7d8, float:2.814E-42)
            r1 = 0
            r8.<init>(r1, r1, r0)
            throw r8
        L4b:
            r8 = move-exception
            m4.um2 r0 = new m4.um2
            r0.<init>(r8, r2)
            throw r0
        L52:
            r8 = move-exception
            m4.um2 r0 = new m4.um2
            r0.<init>(r8, r2)
            throw r0
        L59:
            r8 = move-exception
            m4.um2 r0 = new m4.um2
            r0.<init>(r8, r3)
            throw r0
        L60:
            r8 = move-exception
            java.lang.String r2 = r0.getQuery()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L8f
            java.lang.String r2 = r0.getFragment()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L8f
            m4.um2 r0 = new m4.um2
            int r1 = m4.ls1.f10971a
            r2 = 21
            r4 = 2005(0x7d5, float:2.81E-42)
            if (r1 < r2) goto L8a
            java.lang.Throwable r1 = r8.getCause()
            boolean r1 = m4.tm2.a(r1)
            if (r1 == 0) goto L8a
            goto L8b
        L8a:
            r3 = r4
        L8b:
            r0.<init>(r8, r3)
            throw r0
        L8f:
            m4.um2 r2 = new m4.um2
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r5 = r0.getPath()
            r3[r4] = r5
            java.lang.String r4 = r0.getQuery()
            r3[r1] = r4
            r1 = 2
            java.lang.String r0 = r0.getFragment()
            r3[r1] = r0
            java.lang.String r0 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1 = 1004(0x3ec, float:1.407E-42)
            r2.<init>(r0, r8, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.vm2.k(m4.gs0):long");
    }
}

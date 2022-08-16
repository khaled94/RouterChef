package ca;

import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class n implements y {

    /* renamed from: s */
    public final h f2858s;

    /* renamed from: t */
    public final Inflater f2859t;

    /* renamed from: u */
    public int f2860u;

    /* renamed from: v */
    public boolean f2861v;

    public n(h hVar, Inflater inflater) {
        this.f2858s = hVar;
        this.f2859t = inflater;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
        if (r6.f2879b != r6.f2880c) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
        r5.f2842s = r6.a();
        ca.v.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        return -1;
     */
    @Override // ca.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long D(ca.f r5, long r6) {
        /*
            r4 = this;
            boolean r6 = r4.f2861v
            if (r6 != 0) goto La2
        L4:
            java.util.zip.Inflater r6 = r4.f2859t
            boolean r6 = r6.needsInput()
            r7 = 0
            r0 = 1
            if (r6 != 0) goto Lf
            goto L3a
        Lf:
            r4.b()
            java.util.zip.Inflater r6 = r4.f2859t
            int r6 = r6.getRemaining()
            if (r6 != 0) goto L9a
            ca.h r6 = r4.f2858s
            boolean r6 = r6.y()
            if (r6 == 0) goto L24
            r7 = r0
            goto L3a
        L24:
            ca.h r6 = r4.f2858s
            ca.f r6 = r6.a()
            ca.u r6 = r6.f2842s
            int r1 = r6.f2880c
            int r2 = r6.f2879b
            int r1 = r1 - r2
            r4.f2860u = r1
            java.util.zip.Inflater r3 = r4.f2859t
            byte[] r6 = r6.f2878a
            r3.setInput(r6, r2, r1)
        L3a:
            ca.u r6 = r5.w0(r0)     // Catch: java.util.zip.DataFormatException -> L93
            int r0 = r6.f2880c     // Catch: java.util.zip.DataFormatException -> L93
            int r0 = 8192 - r0
            long r0 = (long) r0     // Catch: java.util.zip.DataFormatException -> L93
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.util.zip.DataFormatException -> L93
            int r0 = (int) r0     // Catch: java.util.zip.DataFormatException -> L93
            java.util.zip.Inflater r1 = r4.f2859t     // Catch: java.util.zip.DataFormatException -> L93
            byte[] r2 = r6.f2878a     // Catch: java.util.zip.DataFormatException -> L93
            int r3 = r6.f2880c     // Catch: java.util.zip.DataFormatException -> L93
            int r0 = r1.inflate(r2, r3, r0)     // Catch: java.util.zip.DataFormatException -> L93
            if (r0 <= 0) goto L62
            int r7 = r6.f2880c     // Catch: java.util.zip.DataFormatException -> L93
            int r7 = r7 + r0
            r6.f2880c = r7     // Catch: java.util.zip.DataFormatException -> L93
            long r6 = r5.f2843t     // Catch: java.util.zip.DataFormatException -> L93
            long r0 = (long) r0     // Catch: java.util.zip.DataFormatException -> L93
            long r6 = r6 + r0
            r5.f2843t = r6     // Catch: java.util.zip.DataFormatException -> L93
            return r0
        L62:
            java.util.zip.Inflater r0 = r4.f2859t     // Catch: java.util.zip.DataFormatException -> L93
            boolean r0 = r0.finished()     // Catch: java.util.zip.DataFormatException -> L93
            if (r0 != 0) goto L7e
            java.util.zip.Inflater r0 = r4.f2859t     // Catch: java.util.zip.DataFormatException -> L93
            boolean r0 = r0.needsDictionary()     // Catch: java.util.zip.DataFormatException -> L93
            if (r0 == 0) goto L73
            goto L7e
        L73:
            if (r7 != 0) goto L76
            goto L4
        L76:
            java.io.EOFException r5 = new java.io.EOFException     // Catch: java.util.zip.DataFormatException -> L93
            java.lang.String r6 = "source exhausted prematurely"
            r5.<init>(r6)     // Catch: java.util.zip.DataFormatException -> L93
            throw r5     // Catch: java.util.zip.DataFormatException -> L93
        L7e:
            r4.b()     // Catch: java.util.zip.DataFormatException -> L93
            int r7 = r6.f2879b     // Catch: java.util.zip.DataFormatException -> L93
            int r0 = r6.f2880c     // Catch: java.util.zip.DataFormatException -> L93
            if (r7 != r0) goto L90
            ca.u r7 = r6.a()     // Catch: java.util.zip.DataFormatException -> L93
            r5.f2842s = r7     // Catch: java.util.zip.DataFormatException -> L93
            ca.v.a(r6)     // Catch: java.util.zip.DataFormatException -> L93
        L90:
            r5 = -1
            return r5
        L93:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r5)
            throw r6
        L9a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "?"
            r5.<init>(r6)
            throw r5
        La2:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.n.D(ca.f, long):long");
    }

    public final void b() {
        int i10 = this.f2860u;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f2859t.getRemaining();
        this.f2860u -= remaining;
        this.f2858s.p(remaining);
    }

    @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2861v) {
            return;
        }
        this.f2859t.end();
        this.f2861v = true;
        this.f2858s.close();
    }

    @Override // ca.y
    public final z d() {
        return this.f2858s.d();
    }
}

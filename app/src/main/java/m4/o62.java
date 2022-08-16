package m4;

/* loaded from: classes.dex */
public final class o62 extends xr {
    public final boolean A;

    /* renamed from: u */
    public final int f12012u;

    /* renamed from: v */
    public final String f12013v;

    /* renamed from: w */
    public final int f12014w;

    /* renamed from: x */
    public final t f12015x;
    public final int y;

    /* renamed from: z */
    public final gn f12016z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o62(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, m4.t r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L6c
            r0 = 1
            if (r4 == r0) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r6 = r17
            r7 = r18
            goto L72
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r19)
            java.util.UUID r2 = m4.xf2.f15321a
            int r2 = m4.ls1.f10971a
            if (r8 == 0) goto L36
            if (r8 == r0) goto L33
            r0 = 2
            if (r8 == r0) goto L30
            r0 = 3
            if (r8 == r0) goto L2d
            r0 = 4
            if (r8 != r0) goto L27
            java.lang.String r0 = "YES"
            goto L38
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2d:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L38
        L30:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L38
        L33:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L38
        L36:
            java.lang.String r0 = "NO"
        L38:
            java.lang.String r2 = java.lang.String.valueOf(r17)
            int r2 = r2.length()
            int r3 = r1.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = r2 + 53
            int r2 = r2 + r3
            int r3 = r0.length()
            int r3 = r3 + r2
            r5.<init>(r3)
            r6 = r17
            r5.append(r6)
            java.lang.String r2 = " error, index="
            r5.append(r2)
            r7 = r18
            r5.append(r7)
            java.lang.String r2 = ", format="
            r5.append(r2)
            java.lang.String r2 = ", format_supported="
            java.lang.String r0 = androidx.fragment.app.a.b(r5, r1, r2, r0)
            goto L72
        L6c:
            r6 = r17
            r7 = r18
            java.lang.String r0 = "Source error"
        L72:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L7f
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L7f:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.o62.<init>(int, java.lang.Throwable, int, java.lang.String, int, m4.t, int, boolean):void");
    }

    public o62(String str, Throwable th, int i10, int i11, String str2, int i12, t tVar, int i13, gn gnVar, long j3, boolean z10) {
        super(str, th, i10, j3);
        boolean z11;
        boolean z12 = false;
        int i14 = i11;
        if (!z10) {
            z11 = true;
        } else if (i14 == 1) {
            i14 = 1;
            z11 = true;
        } else {
            z11 = false;
        }
        r01.f(z11);
        r01.f(th != null ? true : z12);
        this.f12012u = i14;
        this.f12013v = str2;
        this.f12014w = i12;
        this.f12015x = tVar;
        this.y = i13;
        this.f12016z = gnVar;
        this.A = z10;
    }

    public static o62 b(RuntimeException runtimeException, int i10) {
        return new o62(2, runtimeException, i10, null, -1, null, 4, false);
    }

    public final o62 a(gn gnVar) {
        String message = getMessage();
        int i10 = ls1.f10971a;
        return new o62(message, getCause(), this.f15455s, this.f12012u, this.f12013v, this.f12014w, this.f12015x, this.y, gnVar, this.f15456t, this.A);
    }
}

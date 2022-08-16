package m4;

/* loaded from: classes.dex */
public final class ri2 extends Exception {

    /* renamed from: s */
    public final String f13362s;

    /* renamed from: t */
    public final qi2 f13363t;

    /* renamed from: u */
    public final String f13364u;

    public ri2(String str, Throwable th, String str2, qi2 qi2Var, String str3) {
        super(str, th);
        this.f13362s = str2;
        this.f13363t = qi2Var;
        this.f13364u = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ri2(m4.t r10, java.lang.Throwable r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 36
            r2.<init>(r1)
            java.lang.String r1 = "Decoder init failed: ["
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = "], "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r6 = r10.f13871k
            int r10 = java.lang.Math.abs(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r0 = 75
            r12.<init>(r0)
            java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r12.append(r0)
            r12.append(r10)
            java.lang.String r4 = r2.toString()
            java.lang.String r8 = r12.toString()
            r7 = 0
            r3 = r9
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ri2.<init>(m4.t, java.lang.Throwable, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ri2(m4.t r12, java.lang.Throwable r13, m4.qi2 r14) {
        /*
            r11 = this;
            java.lang.String r0 = r14.f12883a
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 23
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "Decoder init failed: "
            java.lang.String r3 = ", "
            java.lang.String r6 = i0.b.a(r4, r2, r0, r3, r1)
            java.lang.String r8 = r12.f13871k
            int r12 = m4.ls1.f10971a
            r0 = 21
            if (r12 < r0) goto L36
            boolean r12 = r13 instanceof android.media.MediaCodec.CodecException
            if (r12 == 0) goto L36
            r12 = r13
            android.media.MediaCodec$CodecException r12 = (android.media.MediaCodec.CodecException) r12
            java.lang.String r12 = r12.getDiagnosticInfo()
            goto L37
        L36:
            r12 = 0
        L37:
            r10 = r12
            r5 = r11
            r7 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ri2.<init>(m4.t, java.lang.Throwable, m4.qi2):void");
    }
}

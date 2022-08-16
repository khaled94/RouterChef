package m4;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a */
    public final boolean f15157a;

    /* renamed from: b */
    public final String f15158b;

    /* renamed from: c */
    public final lp2 f15159c;

    /* renamed from: d */
    public final int f15160d;

    /* renamed from: e */
    public final byte[] f15161e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r6.equals("cenc") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x0(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r11 != 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r0
        Lf:
            r2 = r2 ^ r3
            m4.r01.f(r2)
            r4.f15157a = r5
            r4.f15158b = r6
            r4.f15160d = r7
            r4.f15161e = r11
            m4.lp2 r5 = new m4.lp2
            r7 = 2
            if (r6 != 0) goto L21
            goto L7d
        L21:
            int r11 = r6.hashCode()
            r2 = 3
            switch(r11) {
                case 3046605: goto L47;
                case 3046671: goto L3d;
                case 3049879: goto L34;
                case 3049895: goto L2a;
                default: goto L29;
            }
        L29:
            goto L51
        L2a:
            java.lang.String r11 = "cens"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            r0 = r1
            goto L52
        L34:
            java.lang.String r11 = "cenc"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            goto L52
        L3d:
            java.lang.String r11 = "cbcs"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            r0 = r2
            goto L52
        L47:
            java.lang.String r11 = "cbc1"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            r0 = r7
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L7d
            if (r0 == r1) goto L7d
            if (r0 == r7) goto L7c
            if (r0 == r2) goto L7c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r11 = r6.length()
            int r11 = r11 + 68
            r7.<init>(r11)
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.append(r11)
            r7.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L7d
        L7c:
            r1 = r7
        L7d:
            r5.<init>(r1, r8, r9, r10)
            r4.f15159c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.x0.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}

package m4;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a */
    public final g1 f8313a = new g1();

    /* renamed from: b */
    public final dd f8314b = new dd(new byte[65025], 0);

    /* renamed from: c */
    public int f8315c = -1;

    /* renamed from: d */
    public int f8316d;

    /* renamed from: e */
    public boolean f8317e;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(m4.uo2 r8) {
        /*
            r7 = this;
            boolean r0 = r7.f8317e
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r7.f8317e = r1
            m4.dd r0 = r7.f8314b
            r0.e(r1)
        Ld:
            boolean r0 = r7.f8317e
            r2 = 1
            if (r0 != 0) goto L9b
            int r0 = r7.f8315c
            if (r0 >= 0) goto L51
            m4.g1 r0 = r7.f8313a
            r3 = -1
            boolean r0 = r0.c(r8, r3)
            if (r0 == 0) goto L50
            m4.g1 r0 = r7.f8313a
            boolean r0 = r0.b(r8, r2)
            if (r0 != 0) goto L29
            goto L50
        L29:
            m4.g1 r0 = r7.f8313a
            int r3 = r0.f8701d
            int r0 = r0.f8698a
            r0 = r0 & r2
            if (r0 != r2) goto L40
            m4.dd r0 = r7.f8314b
            int r0 = r0.f7310c
            if (r0 != 0) goto L40
            int r0 = r7.b(r1)
            int r3 = r3 + r0
            int r0 = r7.f8316d
            goto L41
        L40:
            r0 = r1
        L41:
            r4 = r8
            m4.qo2 r4 = (m4.qo2) r4     // Catch: java.io.EOFException -> L49
            r4.q(r3)     // Catch: java.io.EOFException -> L49
            r3 = r2
            goto L4a
        L49:
            r3 = r1
        L4a:
            if (r3 != 0) goto L4d
            return r1
        L4d:
            r7.f8315c = r0
            goto L51
        L50:
            return r1
        L51:
            int r0 = r7.b(r0)
            int r3 = r7.f8315c
            int r4 = r7.f8316d
            int r3 = r3 + r4
            if (r0 <= 0) goto L90
            m4.dd r4 = r7.f8314b
            int r5 = r4.f7310c
            int r5 = r5 + r0
            r4.D(r5)
            m4.dd r4 = r7.f8314b
            java.lang.Object r5 = r4.f7311d
            byte[] r5 = (byte[]) r5
            int r4 = r4.f7310c
            r6 = r8
            m4.qo2 r6 = (m4.qo2) r6     // Catch: java.io.EOFException -> L74
            r6.n(r5, r4, r0, r1)     // Catch: java.io.EOFException -> L74
            r4 = r2
            goto L75
        L74:
            r4 = r1
        L75:
            if (r4 != 0) goto L78
            return r1
        L78:
            m4.dd r4 = r7.f8314b
            int r5 = r4.f7310c
            int r5 = r5 + r0
            r4.g(r5)
            m4.g1 r0 = r7.f8313a
            int[] r0 = r0.f8703f
            int r4 = r3 + (-1)
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L8d
            goto L8e
        L8d:
            r2 = r1
        L8e:
            r7.f8317e = r2
        L90:
            m4.g1 r0 = r7.f8313a
            int r0 = r0.f8700c
            if (r3 != r0) goto L97
            r3 = -1
        L97:
            r7.f8315c = r3
            goto Ld
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.f1.a(m4.uo2):boolean");
    }

    public final int b(int i10) {
        int i11;
        int i12 = 0;
        this.f8316d = 0;
        do {
            int i13 = this.f8316d;
            int i14 = i10 + i13;
            g1 g1Var = this.f8313a;
            if (i14 >= g1Var.f8700c) {
                break;
            }
            int[] iArr = g1Var.f8703f;
            this.f8316d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }
}

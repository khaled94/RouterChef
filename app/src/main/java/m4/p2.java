package m4;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class p2 implements to2 {

    /* renamed from: e */
    public boolean f12380e;

    /* renamed from: f */
    public boolean f12381f;

    /* renamed from: g */
    public boolean f12382g;

    /* renamed from: h */
    public long f12383h;

    /* renamed from: i */
    public m2 f12384i;

    /* renamed from: j */
    public vo2 f12385j;

    /* renamed from: k */
    public boolean f12386k;

    /* renamed from: a */
    public final eq1 f12376a = new eq1();

    /* renamed from: c */
    public final dd f12378c = new dd(4096);

    /* renamed from: b */
    public final SparseArray<o2> f12377b = new SparseArray<>();

    /* renamed from: d */
    public final n2 f12379d = new n2();

    @Override // m4.to2
    public final boolean c(uo2 uo2Var) {
        byte[] bArr = new byte[14];
        qo2 qo2Var = (qo2) uo2Var;
        qo2Var.o(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            qo2Var.p(bArr[13] & 7, false);
            qo2Var.o(bArr, 0, 3, false);
            return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
        }
        return false;
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.f12385j = vo2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r3 != r5) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[LOOP:0: B:15:0x0031->B:17:0x0039, LOOP_END] */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(long r3, long r5) {
        /*
            r2 = this;
            m4.eq1 r3 = r2.f12376a
            long r3 = r3.d()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L23
            m4.eq1 r3 = r2.f12376a
            long r3 = r3.c()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L28
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L28
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L28
        L23:
            m4.eq1 r3 = r2.f12376a
            r3.e(r5)
        L28:
            m4.m2 r3 = r2.f12384i
            r4 = 0
            if (r3 == 0) goto L30
            r3.c(r5)
        L30:
            r3 = r4
        L31:
            android.util.SparseArray<m4.o2> r5 = r2.f12377b
            int r5 = r5.size()
            if (r3 >= r5) goto L4b
            android.util.SparseArray<m4.o2> r5 = r2.f12377b
            java.lang.Object r5 = r5.valueAt(r3)
            m4.o2 r5 = (m4.o2) r5
            r5.f11982f = r4
            m4.u1 r5 = r5.f11977a
            r5.b()
            int r3 = r3 + 1
            goto L31
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.p2.g(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x023e  */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(m4.uo2 r17, m4.gp2 r18) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.p2.h(m4.uo2, m4.gp2):int");
    }
}

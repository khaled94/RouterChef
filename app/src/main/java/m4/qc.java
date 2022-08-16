package m4;

import java.util.Stack;

/* loaded from: classes.dex */
public final class qc {

    /* renamed from: a */
    public final byte[] f12769a = new byte[8];

    /* renamed from: b */
    public final Stack<pc> f12770b = new Stack<>();

    /* renamed from: c */
    public final wc f12771c = new wc();

    /* renamed from: d */
    public int f12772d;

    /* renamed from: e */
    public int f12773e;

    /* renamed from: f */
    public long f12774f;

    /* renamed from: g */
    public rc f12775g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04c4, code lost:
        if (r0.f() == r3.getLeastSignificantBits()) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0939, code lost:
        if (r5 == r2) goto L455;
     */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(m4.hc r69) {
        /*
            Method dump skipped, instructions count: 3282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.qc.a(m4.hc):boolean");
    }

    public final long b(hc hcVar, int i10) {
        hcVar.c(this.f12769a, 0, i10, false);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (this.f12769a[i11] & 255);
        }
        return j3;
    }
}

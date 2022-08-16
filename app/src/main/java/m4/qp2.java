package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qp2 implements to2 {

    /* renamed from: m */
    public static final int[] f12958m;
    public static final int p;

    /* renamed from: b */
    public boolean f12962b;

    /* renamed from: c */
    public long f12963c;

    /* renamed from: d */
    public int f12964d;

    /* renamed from: e */
    public int f12965e;

    /* renamed from: f */
    public boolean f12966f;

    /* renamed from: h */
    public vo2 f12968h;

    /* renamed from: i */
    public mp2 f12969i;

    /* renamed from: j */
    public ip2 f12970j;

    /* renamed from: k */
    public boolean f12971k;

    /* renamed from: l */
    public static final int[] f12957l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: n */
    public static final byte[] f12959n = ls1.j("#!AMR\n");

    /* renamed from: o */
    public static final byte[] f12960o = ls1.j("#!AMR-WB\n");

    /* renamed from: a */
    public final byte[] f12961a = new byte[1];

    /* renamed from: g */
    public int f12967g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f12958m = iArr;
        p = iArr[8];
    }

    public final boolean a(uo2 uo2Var) {
        int i10;
        byte[] bArr = f12959n;
        uo2Var.i();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        qo2 qo2Var = (qo2) uo2Var;
        qo2Var.o(bArr2, 0, length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f12962b = false;
            i10 = bArr.length;
        } else {
            byte[] bArr3 = f12960o;
            uo2Var.i();
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            qo2Var.o(bArr4, 0, length2, false);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.f12962b = true;
            i10 = bArr3.length;
        }
        qo2Var.q(i10);
        return true;
    }

    @Override // m4.to2
    public final boolean c(uo2 uo2Var) {
        return a(uo2Var);
    }

    @Override // m4.to2
    public final void e(vo2 vo2Var) {
        this.f12968h = vo2Var;
        this.f12969i = vo2Var.p(0, 1);
        vo2Var.y();
    }

    @Override // m4.to2
    public final void g(long j3, long j10) {
        this.f12963c = 0L;
        this.f12964d = 0;
        this.f12965e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087 A[Catch: EOFException -> 0x0103, TryCatch #0 {EOFException -> 0x0103, blocks: (B:20:0x0056, B:22:0x0069, B:36:0x0087, B:37:0x008c, B:38:0x0090, B:45:0x00a2, B:46:0x00c5, B:47:0x00c6, B:48:0x00dd), top: B:61:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: EOFException -> 0x0103, TryCatch #0 {EOFException -> 0x0103, blocks: (B:20:0x0056, B:22:0x0069, B:36:0x0087, B:37:0x008c, B:38:0x0090, B:45:0x00a2, B:46:0x00c5, B:47:0x00c6, B:48:0x00dd), top: B:61:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    @Override // m4.to2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(m4.uo2 r14, m4.gp2 r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.qp2.h(m4.uo2, m4.gp2):int");
    }
}

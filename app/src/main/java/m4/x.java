package m4;

import android.util.Pair;

/* loaded from: classes.dex */
public final class x implements a0 {

    /* renamed from: a */
    public final long[] f15154a;

    /* renamed from: b */
    public final long[] f15155b;

    /* renamed from: c */
    public final long f15156c;

    public x(long[] jArr, long[] jArr2, long j3) {
        this.f15154a = jArr;
        this.f15155b = jArr2;
        this.f15156c = j3 == -9223372036854775807L ? xf2.b(jArr2[jArr2.length - 1]) : j3;
    }

    public static Pair<Long, Long> c(long j3, long[] jArr, long[] jArr2) {
        Long l10;
        Long l11;
        int p = ls1.p(jArr, j3, true);
        long j10 = jArr[p];
        long j11 = jArr2[p];
        int i10 = p + 1;
        if (i10 == jArr.length) {
            l11 = Long.valueOf(j10);
            l10 = Long.valueOf(j11);
        } else {
            long j12 = jArr[i10];
            long j13 = jArr2[i10];
            double d5 = j12 == j10 ? 0.0d : (j3 - j10) / (j12 - j10);
            l11 = Long.valueOf(j3);
            l10 = Long.valueOf(((long) (d5 * (j13 - j11))) + j11);
        }
        return Pair.create(l11, l10);
    }

    @Override // m4.a0
    public final long a() {
        return -1L;
    }

    @Override // m4.jp2
    public final long b() {
        return this.f15156c;
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        Pair<Long, Long> c10 = c(xf2.c(ls1.u(j3, 0L, this.f15156c)), this.f15155b, this.f15154a);
        kp2 kp2Var = new kp2(xf2.b(((Long) c10.first).longValue()), ((Long) c10.second).longValue());
        return new hp2(kp2Var, kp2Var);
    }

    @Override // m4.jp2
    public final boolean f() {
        return true;
    }

    @Override // m4.a0
    public final long i(long j3) {
        return xf2.b(((Long) c(j3, this.f15154a, this.f15155b).second).longValue());
    }
}

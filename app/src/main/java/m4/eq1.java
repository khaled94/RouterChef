package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class eq1 {

    /* renamed from: a */
    public long f8035a;

    /* renamed from: b */
    public long f8036b;

    /* renamed from: c */
    public long f8037c;

    /* renamed from: d */
    public final ThreadLocal<Long> f8038d = new ThreadLocal<>();

    public eq1() {
        e(0L);
    }

    public final synchronized long a(long j3) {
        if (this.f8036b == -9223372036854775807L) {
            long j10 = this.f8035a;
            if (j10 == 9223372036854775806L) {
                Long l10 = this.f8038d.get();
                Objects.requireNonNull(l10);
                j10 = l10.longValue();
            }
            this.f8036b = j10 - j3;
            notifyAll();
        }
        this.f8037c = j3;
        return j3 + this.f8036b;
    }

    public final synchronized long b(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.f8037c;
        if (j10 != -9223372036854775807L) {
            long j11 = (j10 * 90000) / 1000000;
            long j12 = (4294967296L + j11) / 8589934592L;
            long j13 = (((-1) + j12) * 8589934592L) + j3;
            j3 += j12 * 8589934592L;
            if (Math.abs(j13 - j11) < Math.abs(j3 - j11)) {
                j3 = j13;
            }
        }
        return a((j3 * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j3 = this.f8035a;
        if (j3 == Long.MAX_VALUE || j3 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j3;
    }

    public final synchronized long d() {
        return this.f8036b;
    }

    public final synchronized void e(long j3) {
        this.f8035a = j3;
        this.f8036b = j3 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f8037c = -9223372036854775807L;
    }
}

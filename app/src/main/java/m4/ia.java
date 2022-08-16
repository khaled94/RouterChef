package m4;

import java.util.UUID;

/* loaded from: classes.dex */
public final class ia {

    /* renamed from: a */
    public static final int f9568a;

    /* renamed from: b */
    public static final UUID f9569b;

    static {
        f9568a = wg.f14958a < 23 ? 1020 : 6396;
        f9569b = new UUID(0L, 0L);
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-1301668207276963122L, -6645017420763422227L);
        new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j3 * 1000;
    }

    public static long b(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j3 / 1000;
    }
}

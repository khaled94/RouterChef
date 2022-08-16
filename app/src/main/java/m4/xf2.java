package m4;

import java.util.UUID;

/* loaded from: classes.dex */
public final class xf2 {

    /* renamed from: a */
    public static final UUID f15321a = new UUID(0, 0);

    /* renamed from: b */
    public static final UUID f15322b = new UUID(-7348484286925749626L, -6083546864340672619L);

    static {
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-2129748144642739255L, 8654423357094679310L);
        new UUID(-1301668207276963122L, -6645017420763422227L);
    }

    @Deprecated
    public static int a(int i10) {
        int i11 = ls1.f10971a;
        if (i10 != 2 && i10 != 4) {
            if (i10 != 10) {
                if (i10 != 7) {
                    if (i10 != 8) {
                        switch (i10) {
                            case 15:
                                break;
                            case 16:
                            case 18:
                                break;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                break;
                            default:
                                switch (i10) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
            }
            return 6004;
        }
        return 6005;
    }

    @Deprecated
    public static long b(long j3) {
        int i10 = ls1.f10971a;
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 * 1000;
    }

    @Deprecated
    public static long c(long j3) {
        int i10 = ls1.f10971a;
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 / 1000;
    }
}

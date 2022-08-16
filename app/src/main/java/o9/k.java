package o9;

import b7.c;
import java.util.concurrent.TimeUnit;
import n9.s;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public static final long f16835a = c.i("kotlinx.coroutines.scheduler.resolution.ns", 100000);

    /* renamed from: b */
    public static final int f16836b;

    /* renamed from: c */
    public static final int f16837c;

    /* renamed from: d */
    public static final long f16838d;

    /* renamed from: e */
    public static e f16839e;

    /* renamed from: f */
    public static final i f16840f;

    /* renamed from: g */
    public static final i f16841g;

    static {
        long e10;
        long e11;
        e10 = c.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        f16835a = e10;
        int i10 = s.f16719a;
        if (i10 < 2) {
            i10 = 2;
        }
        f16836b = c.h("kotlinx.coroutines.scheduler.core.pool.size", i10, 1, 0, 8);
        f16837c = c.h("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e11 = c.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE);
        f16838d = timeUnit.toNanos(e11);
        f16839e = e.f16829b;
        f16840f = new i(0);
        f16841g = new i(1);
    }
}

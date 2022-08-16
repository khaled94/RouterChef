package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public static AtomicReference<c0> f3173a = new AtomicReference<>();

    public static long a(long j3) {
        Calendar e10 = e(null);
        e10.setTimeInMillis(j3);
        return b(e10).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar e10 = e(calendar);
        Calendar e11 = e(null);
        e11.set(e10.get(1), e10.get(2), e10.get(5));
        return e11;
    }

    public static TimeZone c() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar d() {
        c0 c0Var = f3173a.get();
        if (c0Var == null) {
            c0Var = c0.f3170c;
        }
        TimeZone timeZone = c0Var.f3172b;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = c0Var.f3171a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(c());
        return calendar;
    }

    public static Calendar e(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(c());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}

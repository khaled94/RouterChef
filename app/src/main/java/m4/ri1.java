package m4;

import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ri1 implements eh1<si1> {

    /* renamed from: a */
    public final ScheduledExecutorService f13361a;

    public ri1(ScheduledExecutorService scheduledExecutorService) {
        this.f13361a = scheduledExecutorService;
    }

    @Override // m4.eh1
    public final tz1<si1> a() {
        return mz1.o(mz1.q(mz1.m(new Bundle()), ((Long) jo.f10145d.f10148c.a(es.f8183r2)).longValue(), TimeUnit.MILLISECONDS, this.f13361a), qi1.f12882a, u90.f14294a);
    }
}

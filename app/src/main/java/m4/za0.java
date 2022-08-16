package m4;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;
import n3.s1;

@TargetApi(14)
/* loaded from: classes.dex */
public final class za0 {

    /* renamed from: b */
    public long f16066b;

    /* renamed from: a */
    public final long f16065a = TimeUnit.MILLISECONDS.toNanos(((Long) jo.f10145d.f10148c.a(es.f8212v)).longValue());

    /* renamed from: c */
    public boolean f16067c = true;

    public final void a(SurfaceTexture surfaceTexture, oa0 oa0Var) {
        if (oa0Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f16067c && Math.abs(timestamp - this.f16066b) < this.f16065a) {
            return;
        }
        this.f16067c = false;
        this.f16066b = timestamp;
        s1.f16555i.post(new ya0(oa0Var));
    }
}

package y4;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import s4.pa;

/* loaded from: classes.dex */
public final class p5 {

    /* renamed from: a */
    public final /* synthetic */ q5 f20656a;

    public p5(q5 q5Var) {
        this.f20656a = q5Var;
    }

    public final void a() {
        this.f20656a.g();
        g2 s10 = ((w2) this.f20656a.f20505s).s();
        Objects.requireNonNull(((w2) this.f20656a.f20505s).F);
        if (s10.s(System.currentTimeMillis())) {
            ((w2) this.f20656a.f20505s).s().C.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance != 100) {
                return;
            }
            ((w2) this.f20656a.f20505s).C().F.a("Detected application was in foreground");
            Objects.requireNonNull(((w2) this.f20656a.f20505s).F);
            c(System.currentTimeMillis(), false);
        }
    }

    public final void b(long j3, boolean z10) {
        this.f20656a.g();
        this.f20656a.k();
        if (((w2) this.f20656a.f20505s).s().s(j3)) {
            ((w2) this.f20656a.f20505s).s().C.a(true);
        }
        ((w2) this.f20656a.f20505s).s().F.b(j3);
        if (((w2) this.f20656a.f20505s).s().C.b()) {
            c(j3, z10);
        }
    }

    public final void c(long j3, boolean z10) {
        this.f20656a.g();
        if (!((w2) this.f20656a.f20505s).f()) {
            return;
        }
        ((w2) this.f20656a.f20505s).s().F.b(j3);
        Objects.requireNonNull(((w2) this.f20656a.f20505s).F);
        ((w2) this.f20656a.f20505s).C().F.b("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
        Long valueOf = Long.valueOf(j3 / 1000);
        ((w2) this.f20656a.f20505s).u().D("auto", "_sid", valueOf, j3);
        ((w2) this.f20656a.f20505s).s().C.a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        if (((w2) this.f20656a.f20505s).y.s(null, f1.f20406e0) && z10) {
            bundle.putLong("_aib", 1L);
        }
        ((w2) this.f20656a.f20505s).u().o("auto", "_s", j3, bundle);
        pa.b();
        if (!((w2) this.f20656a.f20505s).y.s(null, f1.f20414i0)) {
            return;
        }
        String a10 = ((w2) this.f20656a.f20505s).s().K.a();
        if (TextUtils.isEmpty(a10)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("_ffr", a10);
        ((w2) this.f20656a.f20505s).u().o("auto", "_ssr", j3, bundle2);
    }
}

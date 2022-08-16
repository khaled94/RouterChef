package y4;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;
import s4.ya;

/* loaded from: classes.dex */
public final class o5 {

    /* renamed from: a */
    public long f20626a;

    /* renamed from: b */
    public long f20627b;

    /* renamed from: c */
    public final n5 f20628c;

    /* renamed from: d */
    public final /* synthetic */ q5 f20629d;

    public o5(q5 q5Var) {
        this.f20629d = q5Var;
        this.f20628c = new n5(this, (w2) q5Var.f20505s);
        Objects.requireNonNull(((w2) q5Var.f20505s).F);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f20626a = elapsedRealtime;
        this.f20627b = elapsedRealtime;
    }

    public final boolean a(boolean z10, boolean z11, long j3) {
        this.f20629d.g();
        this.f20629d.h();
        ya.b();
        if (!((w2) this.f20629d.f20505s).y.s(null, f1.f20416j0) || ((w2) this.f20629d.f20505s).f()) {
            c2 c2Var = ((w2) this.f20629d.f20505s).s().F;
            Objects.requireNonNull(((w2) this.f20629d.f20505s).F);
            c2Var.b(System.currentTimeMillis());
        }
        long j10 = j3 - this.f20626a;
        if (!z10 && j10 < 1000) {
            ((w2) this.f20629d.f20505s).C().F.b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j10));
            return false;
        }
        if (!z11) {
            j10 = j3 - this.f20627b;
            this.f20627b = j3;
        }
        ((w2) this.f20629d.f20505s).C().F.b("Recording user engagement, ms", Long.valueOf(j10));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        h6.v(((w2) this.f20629d.f20505s).w().n(!((w2) this.f20629d.f20505s).y.u()), bundle, true);
        e eVar = ((w2) this.f20629d.f20505s).y;
        e1<Boolean> e1Var = f1.U;
        if (!eVar.s(null, e1Var) && z11) {
            bundle.putLong("_fr", 1L);
        }
        if (!((w2) this.f20629d.f20505s).y.s(null, e1Var) || !z11) {
            ((w2) this.f20629d.f20505s).u().n("auto", "_e", bundle);
        }
        this.f20626a = j3;
        this.f20628c.a();
        this.f20628c.c(3600000L);
        return true;
    }
}

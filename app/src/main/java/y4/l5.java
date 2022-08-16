package y4;

import java.util.Objects;
import m4.oq1;

/* loaded from: classes.dex */
public final class l5 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ long f20557s;

    /* renamed from: t */
    public final /* synthetic */ q5 f20558t;

    public l5(q5 q5Var, long j3) {
        this.f20558t = q5Var;
        this.f20557s = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5 q5Var = this.f20558t;
        long j3 = this.f20557s;
        q5Var.g();
        q5Var.k();
        ((w2) q5Var.f20505s).C().F.b("Activity paused, time", Long.valueOf(j3));
        oq1 oq1Var = q5Var.f20675x;
        Objects.requireNonNull(((w2) ((q5) oq1Var.f12270b).f20505s).F);
        m5 m5Var = new m5(oq1Var, System.currentTimeMillis(), j3);
        oq1Var.f12269a = m5Var;
        ((q5) oq1Var.f12270b).f20672u.postDelayed(m5Var, 2000L);
        if (((w2) q5Var.f20505s).y.u()) {
            q5Var.f20674w.f20628c.a();
        }
    }
}

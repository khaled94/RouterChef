package y4;

import java.util.Objects;
import m4.oq1;

/* loaded from: classes.dex */
public final class k5 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ long f20533s;

    /* renamed from: t */
    public final /* synthetic */ q5 f20534t;

    public k5(q5 q5Var, long j3) {
        this.f20534t = q5Var;
        this.f20533s = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q5 q5Var = this.f20534t;
        long j3 = this.f20533s;
        q5Var.g();
        q5Var.k();
        ((w2) q5Var.f20505s).C().F.b("Activity resumed, time", Long.valueOf(j3));
        if (((w2) q5Var.f20505s).y.u() || ((w2) q5Var.f20505s).s().H.b()) {
            o5 o5Var = q5Var.f20674w;
            o5Var.f20629d.g();
            o5Var.f20628c.a();
            o5Var.f20626a = j3;
            o5Var.f20627b = j3;
        }
        oq1 oq1Var = q5Var.f20675x;
        ((q5) oq1Var.f12270b).g();
        m5 m5Var = (m5) oq1Var.f12269a;
        if (m5Var != null) {
            ((q5) oq1Var.f12270b).f20672u.removeCallbacks(m5Var);
        }
        ((w2) ((q5) oq1Var.f12270b).f20505s).s().H.a(false);
        p5 p5Var = q5Var.f20673v;
        p5Var.f20656a.g();
        if (!((w2) p5Var.f20656a.f20505s).f()) {
            return;
        }
        Objects.requireNonNull(((w2) p5Var.f20656a.f20505s).F);
        p5Var.b(System.currentTimeMillis(), false);
    }
}

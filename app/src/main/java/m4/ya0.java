package m4;

import android.os.SystemClock;
import java.util.Objects;
import l3.s;
import n3.g1;

/* loaded from: classes.dex */
public final class ya0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f15631s = 0;

    /* renamed from: t */
    public final /* synthetic */ Object f15632t;

    public ya0(oa0 oa0Var) {
        this.f15632t = oa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15631s) {
            case 0:
                ta0 ta0Var = (ta0) ((oa0) this.f15632t);
                if (ta0Var.f13975z) {
                    if (ta0Var.I.getParent() != null) {
                        ta0Var.f13970t.removeView(ta0Var.I);
                    }
                }
                if (ta0Var.H == null) {
                    return;
                }
                s sVar = s.B;
                Objects.requireNonNull(sVar.f5796j);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (ta0Var.y.getBitmap(ta0Var.H) != null) {
                    ta0Var.J = true;
                }
                Objects.requireNonNull(sVar.f5796j);
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (g1.c()) {
                    StringBuilder sb = new StringBuilder(46);
                    sb.append("Spinner frame grab took ");
                    sb.append(elapsedRealtime2);
                    sb.append("ms");
                    g1.a(sb.toString());
                }
                if (elapsedRealtime2 <= ta0Var.f13974x) {
                    return;
                }
                g1.j("Spinner frame grab crossed jank threshold! Suspending spinner.");
                ta0Var.C = false;
                ta0Var.H = null;
                qs qsVar = ta0Var.f13972v;
                if (qsVar == null) {
                    return;
                }
                qsVar.b("spinner_jank", Long.toString(elapsedRealtime2));
                return;
            default:
                dj0 dj0Var = ((wi0) this.f15632t).f15029s.f15791d;
                synchronized (dj0Var) {
                    dj0Var.d();
                    dj0Var.A = true;
                }
                return;
        }
    }
}

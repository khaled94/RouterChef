package i4;

import a6.f;
import android.os.Process;
import m4.k01;
import m4.oa0;
import m4.ob0;
import m4.sb0;
import m4.sj1;
import m4.ta0;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f5268s;

    /* renamed from: t */
    public final Object f5269t;

    public /* synthetic */ b(Object obj, int i10) {
        this.f5268s = i10;
        this.f5269t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5268s) {
            case 0:
                Process.setThreadPriority(0);
                ((Runnable) this.f5269t).run();
                return;
            case 1:
                oa0 oa0Var = ((sb0) this.f5269t).f13581x;
                if (oa0Var == null) {
                    return;
                }
                ((ta0) oa0Var).f();
                return;
            case 2:
                k01 k01Var = (k01) this.f5269t;
                k01Var.f10229c.execute(new ob0(k01Var, 1));
                return;
            default:
                ((sj1) this.f5269t).f13697d.d(f.n(6, null, null));
                return;
        }
    }

    public b(Runnable runnable) {
        this.f5268s = 0;
        this.f5269t = runnable;
    }
}

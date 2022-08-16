package m3;

import a6.f;
import android.util.Log;
import c5.j;
import java.io.IOException;
import m4.e11;
import m4.ll1;
import m4.nj1;
import m4.oa0;
import m4.sb0;
import m4.ta0;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f5960s;

    /* renamed from: t */
    public final /* synthetic */ Object f5961t;

    public /* synthetic */ h(Object obj, int i10) {
        this.f5960s = i10;
        this.f5961t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5960s) {
            case 0:
                ((n) this.f5961t).c();
                return;
            case 1:
                if (!((j) this.f5961t).c(new IOException("TIMEOUT"))) {
                    return;
                }
                Log.w("Rpc", "No response");
                return;
            case 2:
                oa0 oa0Var = ((sb0) this.f5961t).f13581x;
                if (oa0Var == null) {
                    return;
                }
                ((ta0) oa0Var).g();
                return;
            case 3:
                e11 e11Var = (e11) this.f5961t;
                e11Var.f7690b.f8318a.a(e11Var.f7689a);
                return;
            case 4:
                ((nj1) this.f5961t).O3(5);
                return;
            default:
                ((ll1) this.f5961t).f10911d.d(f.n(6, null, null));
                return;
        }
    }
}

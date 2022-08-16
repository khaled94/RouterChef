package m4;

import android.content.Context;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class l8 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f10674s;

    /* renamed from: t */
    public final /* synthetic */ n8 f10675t;

    public l8(n8 n8Var, int i10) {
        this.f10675t = n8Var;
        this.f10674s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k6 k6Var;
        n8 n8Var = this.f10675t;
        int i10 = this.f10674s;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = n8Var.f11550a.getPackageManager().getPackageInfo(n8Var.f11550a.getPackageName(), 0);
            Context context = n8Var.f11550a;
            k6Var = wo2.b(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            k6Var = null;
        }
        this.f10675t.f11559j = k6Var;
        if (this.f10674s < 4) {
            if (k6Var != null && k6Var.a0() && !k6Var.o0().equals("0000000000000000000000000000000000000000000000000000000000000000") && k6Var.b0() && k6Var.m0().y() && k6Var.m0().v() != -2) {
                return;
            }
            this.f10675t.d(this.f10674s + 1);
        }
    }
}

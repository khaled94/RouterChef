package m4;

import a4.g;
import android.content.ComponentName;
import android.content.Context;
import i3.a;
import java.io.IOException;
import java.util.Objects;
import y4.d5;
import y4.e5;
import y4.w2;

/* loaded from: classes.dex */
public final class k8 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f10294s;

    /* renamed from: t */
    public final /* synthetic */ Object f10295t;

    public /* synthetic */ k8(Object obj, int i10) {
        this.f10294s = i10;
        this.f10295t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10294s) {
            case 0:
                n8 n8Var = (n8) this.f10295t;
                Objects.requireNonNull(n8Var);
                try {
                    if (n8Var.f11555f != null || !n8Var.f11558i) {
                        return;
                    }
                    a aVar = new a(n8Var.f11550a, 30000L, false, false);
                    aVar.h(true);
                    n8Var.f11555f = aVar;
                    return;
                } catch (g | IOException unused) {
                    n8Var.f11555f = null;
                    return;
                }
            default:
                e5 e5Var = ((d5) this.f10295t).f20361c;
                Context context = ((w2) e5Var.f20505s).f20786s;
                Objects.requireNonNull((w2) ((d5) this.f10295t).f20361c.f20505s);
                e5.u(e5Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
        }
    }
}

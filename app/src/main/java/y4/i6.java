package y4;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import s4.v0;

/* loaded from: classes.dex */
public final class i6 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ v0 f20509s;

    /* renamed from: t */
    public final /* synthetic */ String f20510t;

    /* renamed from: u */
    public final /* synthetic */ String f20511u;

    /* renamed from: v */
    public final /* synthetic */ AppMeasurementDynamiteService f20512v;

    public i6(AppMeasurementDynamiteService appMeasurementDynamiteService, v0 v0Var, String str, String str2) {
        this.f20512v = appMeasurementDynamiteService;
        this.f20509s = v0Var;
        this.f20510t = str;
        this.f20511u = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 x10 = this.f20512v.f2969s.x();
        v0 v0Var = this.f20509s;
        String str = this.f20510t;
        String str2 = this.f20511u;
        x10.g();
        x10.h();
        x10.s(new b5(x10, str, str2, x10.p(false), v0Var));
    }
}

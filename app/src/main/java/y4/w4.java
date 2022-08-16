package y4;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import s4.v0;

/* loaded from: classes.dex */
public final class w4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ v0 f20798s;

    /* renamed from: t */
    public final /* synthetic */ String f20799t;

    /* renamed from: u */
    public final /* synthetic */ String f20800u;

    /* renamed from: v */
    public final /* synthetic */ boolean f20801v;

    /* renamed from: w */
    public final /* synthetic */ AppMeasurementDynamiteService f20802w;

    public w4(AppMeasurementDynamiteService appMeasurementDynamiteService, v0 v0Var, String str, String str2, boolean z10) {
        this.f20802w = appMeasurementDynamiteService;
        this.f20798s = v0Var;
        this.f20799t = str;
        this.f20800u = str2;
        this.f20801v = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 x10 = this.f20802w.f2969s.x();
        v0 v0Var = this.f20798s;
        String str = this.f20799t;
        String str2 = this.f20800u;
        boolean z10 = this.f20801v;
        x10.g();
        x10.h();
        x10.s(new q4(x10, str, str2, x10.p(false), z10, v0Var));
    }
}

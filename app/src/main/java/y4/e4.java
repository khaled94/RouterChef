package y4;

import a4.f;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import m4.xa1;
import s4.v0;

/* loaded from: classes.dex */
public final class e4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ v0 f20384s;

    /* renamed from: t */
    public final /* synthetic */ p f20385t;

    /* renamed from: u */
    public final /* synthetic */ String f20386u;

    /* renamed from: v */
    public final /* synthetic */ AppMeasurementDynamiteService f20387v;

    public e4(AppMeasurementDynamiteService appMeasurementDynamiteService, v0 v0Var, p pVar, String str) {
        this.f20387v = appMeasurementDynamiteService;
        this.f20384s = v0Var;
        this.f20385t = pVar;
        this.f20386u = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 x10 = this.f20387v.f2969s.x();
        v0 v0Var = this.f20384s;
        p pVar = this.f20385t;
        String str = this.f20386u;
        x10.g();
        x10.h();
        h6 z10 = ((w2) x10.f20505s).z();
        Objects.requireNonNull(z10);
        if (f.f133b.c(((w2) z10.f20505s).f20786s, 12451000) == 0) {
            x10.s(new xa1(x10, pVar, str, v0Var));
            return;
        }
        ((w2) x10.f20505s).C().A.a("Not bundling data. Service unavailable or out of date");
        ((w2) x10.f20505s).z().F(v0Var, new byte[0]);
    }
}

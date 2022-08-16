package y4;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import s4.y0;

/* loaded from: classes.dex */
public final class j6 implements l3 {

    /* renamed from: a */
    public final y0 f20521a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f20522b;

    public j6(AppMeasurementDynamiteService appMeasurementDynamiteService, y0 y0Var) {
        this.f20522b = appMeasurementDynamiteService;
        this.f20521a = y0Var;
    }

    @Override // y4.l3
    public final void a(String str, String str2, Bundle bundle, long j3) {
        try {
            this.f20521a.C0(str, str2, bundle, j3);
        } catch (RemoteException e10) {
            w2 w2Var = this.f20522b.f2969s;
            if (w2Var == null) {
                return;
            }
            w2Var.C().A.b("Event listener threw exception", e10);
        }
    }
}

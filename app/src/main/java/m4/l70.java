package m4;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import s4.a4;
import s4.n;
import s4.y0;
import s4.z;

/* loaded from: classes.dex */
public final class l70 implements kz1, z {

    /* renamed from: s */
    public final Object f10666s;

    /* renamed from: t */
    public final Object f10667t;

    public /* synthetic */ l70(AppMeasurementDynamiteService appMeasurementDynamiteService, y0 y0Var) {
        this.f10667t = appMeasurementDynamiteService;
        this.f10666s = y0Var;
    }

    public /* synthetic */ l70(Object obj, Object obj2) {
        this.f10666s = obj;
        this.f10667t = obj2;
    }

    public /* synthetic */ l70(j02 j02Var) {
        this.f10666s = j02Var;
        this.f10667t = null;
    }

    public /* synthetic */ l70(l02 l02Var) {
        this.f10666s = null;
        this.f10667t = l02Var;
    }

    public /* synthetic */ l70(z90 z90Var, y90 y90Var) {
        this.f10666s = z90Var;
        this.f10667t = y90Var;
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        ((z90) this.f10666s).mo30h(obj);
    }

    @Override // s4.z
    public final a4 b(n nVar) {
        ((a4) this.f10666s).e((String) this.f10667t, nVar);
        return (a4) this.f10666s;
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        ((y90) this.f10667t).mo20zza();
    }
}

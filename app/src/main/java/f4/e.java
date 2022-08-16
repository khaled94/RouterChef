package f4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c4.d;
import c4.j;
import d4.c;
import d4.f;
import d4.r;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e extends f<a> {
    public final r A;

    public e(Context context, Looper looper, c cVar, r rVar, d dVar, j jVar) {
        super(context, looper, 270, cVar, dVar, jVar);
        this.A = rVar;
    }

    @Override // d4.b, b4.a.e
    public final int f() {
        return 203400000;
    }

    @Override // d4.b
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // d4.b
    public final a4.d[] r() {
        return p4.d.f16951b;
    }

    @Override // d4.b
    public final Bundle t() {
        r rVar = this.A;
        Objects.requireNonNull(rVar);
        Bundle bundle = new Bundle();
        String str = rVar.f3913b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // d4.b
    public final String w() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // d4.b
    public final String x() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // d4.b
    public final boolean y() {
        return true;
    }
}

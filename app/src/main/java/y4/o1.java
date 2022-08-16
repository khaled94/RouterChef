package y4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import d4.b;

/* loaded from: classes.dex */
public final class o1 extends b<j1> {
    public o1(Context context, Looper looper, b.a aVar, b.AbstractC0056b abstractC0056b) {
        super(context, looper, 93, aVar, abstractC0056b);
    }

    @Override // d4.b, b4.a.e
    public final int f() {
        return 12451000;
    }

    @Override // d4.b
    public final /* bridge */ /* synthetic */ j1 o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof j1 ? (j1) queryLocalInterface : new g1(iBinder);
    }

    @Override // d4.b
    public final String w() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // d4.b
    public final String x() {
        return "com.google.android.gms.measurement.START";
    }
}

package m4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import d4.b;
import l3.c;

/* loaded from: classes.dex */
public final class xs1 extends c<ct1> {
    public final int y;

    public xs1(Context context, Looper looper, b.a aVar, b.AbstractC0056b abstractC0056b, int i10) {
        super(context, looper, 116, aVar, abstractC0056b);
        this.y = i10;
    }

    public final ct1 E() {
        return (ct1) v();
    }

    @Override // d4.b, b4.a.e
    public final int f() {
        return this.y;
    }

    @Override // d4.b
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof ct1 ? (ct1) queryLocalInterface : new ct1(iBinder);
    }

    @Override // d4.b
    public final String w() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // d4.b
    public final String x() {
        return "com.google.android.gms.gass.START";
    }
}

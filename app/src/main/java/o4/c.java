package o4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c4.d;
import c4.j;
import d4.f;

/* loaded from: classes.dex */
public final class c extends f<e> {
    public c(Context context, Looper looper, d4.c cVar, d dVar, j jVar) {
        super(context, looper, 300, cVar, dVar, jVar);
    }

    @Override // d4.b, b4.a.e
    public final int f() {
        return 212800000;
    }

    @Override // d4.b
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder);
    }

    @Override // d4.b
    public final a4.d[] r() {
        return v3.f.f19790b;
    }

    @Override // d4.b
    public final String w() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // d4.b
    public final String x() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // d4.b
    public final boolean y() {
        return true;
    }
}

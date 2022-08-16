package m4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import d4.b;
import l3.c;

/* loaded from: classes.dex */
public final class a50 extends c<h50> {
    public a50(Context context, Looper looper, b.a aVar, b.AbstractC0056b abstractC0056b) {
        super(z50.a(context), looper, 8, aVar, abstractC0056b);
    }

    public final h50 E() {
        return (h50) v();
    }

    @Override // d4.b
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof h50 ? (h50) queryLocalInterface : new f50(iBinder);
    }

    @Override // d4.b
    public final String w() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // d4.b
    public final String x() {
        return "com.google.android.gms.ads.service.START";
    }
}

package m4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import d4.b;
import l3.c;

/* loaded from: classes.dex */
public final class ey extends c<ly> {
    public ey(Context context, Looper looper, b.a aVar, b.AbstractC0056b abstractC0056b) {
        super(z50.a(context), looper, 166, aVar, abstractC0056b);
    }

    @Override // d4.b
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof ly ? (ly) queryLocalInterface : new ly(iBinder);
    }

    @Override // d4.b
    public final String w() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // d4.b
    public final String x() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}

package m4;

import a4.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import d4.b;
import d4.u0;
import e1.h;
import f3.o;
import l3.c;

/* loaded from: classes.dex */
public final class jj extends c<mj> {
    public jj(Context context, Looper looper, b.a aVar, b.AbstractC0056b abstractC0056b) {
        super(z50.a(context), looper, 123, aVar, abstractC0056b);
    }

    public final boolean E() {
        u0 u0Var = this.f3825v;
        return ((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue() && h.a(u0Var == null ? null : u0Var.f3922t, o.f4522a);
    }

    @Override // d4.b
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof mj ? (mj) queryLocalInterface : new mj(iBinder);
    }

    @Override // d4.b
    public final d[] r() {
        return o.f4523b;
    }

    @Override // d4.b
    public final String w() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // d4.b
    public final String x() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}

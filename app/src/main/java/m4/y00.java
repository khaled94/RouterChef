package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.b;
import n3.g1;
import s4.k2;
import x4.a;

/* loaded from: classes.dex */
public final class y00 {

    /* renamed from: b */
    public static y00 f15548b;

    /* renamed from: a */
    public final AtomicBoolean f15549a = new AtomicBoolean(false);

    public final Thread a(final Context context, final String str) {
        if (!this.f15549a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: m4.x00
            @Override // java.lang.Runnable
            public final void run() {
                hf0 hf0Var;
                Context context2 = context;
                String str2 = str;
                es.c(context2);
                Bundle bundle = new Bundle();
                yr<Boolean> yrVar = es.Z;
                jo joVar = jo.f10145d;
                bundle.putBoolean("measurementEnabled", ((Boolean) joVar.f10148c.a(yrVar)).booleanValue());
                if (((Boolean) joVar.f10148c.a(es.f8095g0)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                a aVar = k2.f(context2, "FA-Ads", "am", str2, bundle).f17951b;
                try {
                    try {
                        try {
                            IBinder b10 = DynamiteModule.c(context2, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.ads.measurement.DynamiteMeasurementManager");
                            int i10 = gf0.f8841s;
                            if (b10 == null) {
                                hf0Var = null;
                            } else {
                                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
                                hf0Var = queryLocalInterface instanceof hf0 ? (hf0) queryLocalInterface : new ff0(b10);
                            }
                            hf0Var.d3(new b(context2), new w00(aVar));
                        } catch (Exception e10) {
                            throw new m90(e10);
                        }
                    } catch (Exception e11) {
                        throw new m90(e11);
                    }
                } catch (RemoteException | NullPointerException | m90 e12) {
                    g1.l("#007 Could not call remote method.", e12);
                }
            }
        });
        thread.start();
        return thread;
    }
}

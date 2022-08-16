package m4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import k4.b;
import n3.g1;

/* loaded from: classes.dex */
public final class xj {

    /* renamed from: a */
    public fa f15372a;

    /* renamed from: b */
    public boolean f15373b;

    public xj() {
    }

    public xj(Context context) {
        fa faVar;
        es.c(context);
        if (((Boolean) jo.f10145d.f10148c.a(es.f8053a3)).booleanValue()) {
            try {
                try {
                    try {
                        IBinder b10 = DynamiteModule.c(context, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger");
                        int i10 = ea.f7751s;
                        if (b10 == null) {
                            faVar = null;
                        } else {
                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                            faVar = queryLocalInterface instanceof fa ? (fa) queryLocalInterface : new da(b10);
                        }
                        this.f15372a = faVar;
                        b.E1(context);
                        this.f15372a.n0(new b(context));
                        this.f15373b = true;
                    } catch (Exception e10) {
                        throw new m90(e10);
                    }
                } catch (Exception e11) {
                    throw new m90(e11);
                }
            } catch (RemoteException | NullPointerException | m90 unused) {
                g1.e("Cannot dynamite load clearcut");
            }
        }
    }
}

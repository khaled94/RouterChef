package m4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import k4.b;

/* loaded from: classes.dex */
public final class nt1 {

    /* renamed from: a */
    public final qt1 f11916a;

    /* renamed from: b */
    public final boolean f11917b = true;

    public nt1(qt1 qt1Var) {
        this.f11916a = qt1Var;
    }

    public static nt1 a(Context context, String str) {
        try {
            try {
                try {
                    IBinder b10 = DynamiteModule.c(context, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    qt1 qt1Var = null;
                    if (b10 != null) {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        qt1Var = queryLocalInterface instanceof qt1 ? (qt1) queryLocalInterface : new ot1(b10);
                    }
                    qt1Var.X2(new b(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new nt1(qt1Var);
                } catch (Exception e10) {
                    throw new us1(e10);
                }
            } catch (Exception e11) {
                throw new us1(e11);
            }
        } catch (RemoteException | NullPointerException | SecurityException | us1 unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new nt1(new rt1());
        }
    }
}

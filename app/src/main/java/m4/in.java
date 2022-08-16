package m4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import k4.b;
import k4.c;
import n3.g1;

/* loaded from: classes.dex */
public final class in extends c<ep> {
    public in() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // k4.c
    public final /* synthetic */ ep a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof ep ? (ep) queryLocalInterface : new ep(iBinder);
    }

    public final dp c(Context context, on onVar, String str, f10 f10Var, int i10) {
        ep epVar;
        es.c(context);
        if (((Boolean) jo.f10145d.f10148c.a(es.f8234x6)).booleanValue()) {
            try {
                b bVar = new b(context);
                try {
                    try {
                        IBinder b10 = DynamiteModule.c(context, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                        if (b10 == null) {
                            epVar = null;
                        } else {
                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                            epVar = queryLocalInterface instanceof ep ? (ep) queryLocalInterface : new ep(b10);
                        }
                        IBinder E1 = epVar.E1(bVar, onVar, str, f10Var, i10);
                        if (E1 == null) {
                            return null;
                        }
                        IInterface queryLocalInterface2 = E1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return queryLocalInterface2 instanceof dp ? (dp) queryLocalInterface2 : new bp(E1);
                    } catch (Exception e10) {
                        throw new m90(e10);
                    }
                } catch (Exception e11) {
                    throw new m90(e11);
                }
            } catch (RemoteException | NullPointerException | m90 e12) {
                v40.c(context).a(e12, "AdManagerCreator.newAdManagerByDynamiteLoader");
                g1.l("#007 Could not call remote method.", e12);
                return null;
            }
        }
        try {
            IBinder E12 = b(context).E1(new b(context), onVar, str, f10Var, i10);
            if (E12 == null) {
                return null;
            }
            IInterface queryLocalInterface3 = E12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface3 instanceof dp ? (dp) queryLocalInterface3 : new bp(E12);
        } catch (RemoteException | c.a e13) {
            g1.f("Could not create remote AdManager.", e13);
            return null;
        }
    }
}

package m4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import k4.b;

/* loaded from: classes.dex */
public final class zn extends ho<t30> {

    /* renamed from: b */
    public final /* synthetic */ Context f16285b;

    /* renamed from: c */
    public final /* synthetic */ f10 f16286c;

    public zn(Context context, f10 f10Var) {
        this.f16285b = context;
        this.f16286c = f10Var;
    }

    @Override // m4.ho
    public final /* bridge */ /* synthetic */ t30 a() {
        return null;
    }

    @Override // m4.ho
    public final t30 b(lp lpVar) {
        return lpVar.E3(new b(this.f16285b), this.f16286c);
    }

    @Override // m4.ho
    public final t30 c() {
        w30 w30Var;
        b bVar = new b(this.f16285b);
        try {
            try {
                try {
                    IBinder b10 = DynamiteModule.c(this.f16285b, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                    int i10 = v30.f14576s;
                    if (b10 == null) {
                        w30Var = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                        w30Var = queryLocalInterface instanceof w30 ? (w30) queryLocalInterface : new u30(b10);
                    }
                    return w30Var.j0(bVar, this.f16286c);
                } catch (Exception e10) {
                    throw new m90(e10);
                }
            } catch (Exception e11) {
                throw new m90(e11);
            }
        } catch (RemoteException | NullPointerException | m90 unused) {
            return null;
        }
    }
}

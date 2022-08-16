package m4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import k4.b;

/* loaded from: classes.dex */
public final class yn extends ho<i80> {

    /* renamed from: b */
    public final /* synthetic */ Context f15847b;

    /* renamed from: c */
    public final /* synthetic */ f10 f15848c;

    public yn(Context context, f10 f10Var) {
        this.f15847b = context;
        this.f15848c = f10Var;
    }

    @Override // m4.ho
    public final /* bridge */ /* synthetic */ i80 a() {
        return null;
    }

    @Override // m4.ho
    public final i80 b(lp lpVar) {
        return lpVar.U2(new b(this.f15847b), this.f15848c);
    }

    @Override // m4.ho
    public final i80 c() {
        l80 l80Var;
        b bVar = new b(this.f15847b);
        try {
            try {
                try {
                    IBinder b10 = DynamiteModule.c(this.f15847b, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                    int i10 = k80.f10296s;
                    if (b10 == null) {
                        l80Var = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                        l80Var = queryLocalInterface instanceof l80 ? (l80) queryLocalInterface : new j80(b10);
                    }
                    return l80Var.j0(bVar, this.f15848c);
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

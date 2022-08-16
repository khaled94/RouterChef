package m4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;
import k4.b;
import k4.c;
import n3.g1;

/* loaded from: classes.dex */
public final class eo extends ho<zo> {

    /* renamed from: b */
    public final /* synthetic */ Context f8025b;

    /* renamed from: c */
    public final /* synthetic */ String f8026c;

    /* renamed from: d */
    public final /* synthetic */ f10 f8027d;

    /* renamed from: e */
    public final /* synthetic */ go f8028e;

    public eo(go goVar, Context context, String str, f10 f10Var) {
        this.f8028e = goVar;
        this.f8025b = context;
        this.f8026c = str;
        this.f8027d = f10Var;
    }

    @Override // m4.ho
    public final /* bridge */ /* synthetic */ zo a() {
        go.b(this.f8025b, "native_ad");
        return new er();
    }

    @Override // m4.ho
    public final zo b(lp lpVar) {
        return lpVar.C3(new b(this.f8025b), this.f8026c, this.f8027d);
    }

    @Override // m4.ho
    public final zo c() {
        ap apVar;
        zo xoVar;
        es.c(this.f8025b);
        if (((Boolean) jo.f10145d.f10148c.a(es.f8234x6)).booleanValue()) {
            try {
                try {
                    b bVar = new b(this.f8025b);
                    try {
                        IBinder b10 = DynamiteModule.c(this.f8025b, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                        if (b10 == null) {
                            apVar = null;
                        } else {
                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                            apVar = queryLocalInterface instanceof ap ? (ap) queryLocalInterface : new ap(b10);
                        }
                        IBinder E1 = apVar.E1(bVar, this.f8026c, this.f8027d);
                        if (E1 == null) {
                            return null;
                        }
                        IInterface queryLocalInterface2 = E1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                        xoVar = queryLocalInterface2 instanceof zo ? (zo) queryLocalInterface2 : new xo(E1);
                    } catch (Exception e10) {
                        throw new m90(e10);
                    }
                } catch (Exception e11) {
                    throw new m90(e11);
                }
            } catch (RemoteException | NullPointerException | m90 e12) {
                this.f8028e.f8987e = v40.c(this.f8025b);
                this.f8028e.f8987e.a(e12, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        } else {
            hn hnVar = this.f8028e.f8984b;
            Context context = this.f8025b;
            String str = this.f8026c;
            f10 f10Var = this.f8027d;
            Objects.requireNonNull(hnVar);
            try {
                IBinder E12 = hnVar.b(context).E1(new b(context), str, f10Var);
                if (E12 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = E12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                xoVar = queryLocalInterface3 instanceof zo ? (zo) queryLocalInterface3 : new xo(E12);
            } catch (RemoteException | c.a e13) {
                g1.k("Could not create remote builder for AdLoader.", e13);
                return null;
            }
        }
        return xoVar;
    }
}

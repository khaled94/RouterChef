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
public final class fo extends ho<tp> {

    /* renamed from: b */
    public final /* synthetic */ Context f8611b;

    /* renamed from: c */
    public final /* synthetic */ go f8612c;

    public fo(go goVar, Context context) {
        this.f8612c = goVar;
        this.f8611b = context;
    }

    @Override // m4.ho
    public final /* bridge */ /* synthetic */ tp a() {
        go.b(this.f8611b, "mobile_ads_settings");
        return new hr();
    }

    @Override // m4.ho
    public final tp b(lp lpVar) {
        return lpVar.U1(new b(this.f8611b));
    }

    @Override // m4.ho
    public final tp c() {
        up upVar;
        tp qpVar;
        es.c(this.f8611b);
        if (((Boolean) jo.f10145d.f10148c.a(es.f8234x6)).booleanValue()) {
            try {
                b bVar = new b(this.f8611b);
                try {
                    try {
                        IBinder b10 = DynamiteModule.c(this.f8611b, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                        if (b10 == null) {
                            upVar = null;
                        } else {
                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                            upVar = queryLocalInterface instanceof up ? (up) queryLocalInterface : new up(b10);
                        }
                        IBinder E1 = upVar.E1(bVar);
                        if (E1 == null) {
                            return null;
                        }
                        IInterface queryLocalInterface2 = E1.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                        qpVar = queryLocalInterface2 instanceof tp ? (tp) queryLocalInterface2 : new qp(E1);
                    } catch (Exception e10) {
                        throw new m90(e10);
                    }
                } catch (Exception e11) {
                    throw new m90(e11);
                }
            } catch (RemoteException | NullPointerException | m90 e12) {
                this.f8612c.f8987e = v40.c(this.f8611b);
                this.f8612c.f8987e.a(e12, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        } else {
            br brVar = this.f8612c.f8985c;
            Context context = this.f8611b;
            Objects.requireNonNull(brVar);
            try {
                IBinder E12 = brVar.b(context).E1(new b(context));
                if (E12 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = E12.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                qpVar = queryLocalInterface3 instanceof tp ? (tp) queryLocalInterface3 : new qp(E12);
            } catch (RemoteException | c.a e13) {
                g1.k("Could not get remote MobileAdsSettingManager.", e13);
                return null;
            }
        }
        return qpVar;
    }
}

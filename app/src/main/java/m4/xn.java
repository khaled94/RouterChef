package m4;

import android.app.Activity;
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
public final class xn extends ho<e40> {

    /* renamed from: b */
    public final /* synthetic */ Activity f15412b;

    /* renamed from: c */
    public final /* synthetic */ go f15413c;

    public xn(go goVar, Activity activity) {
        this.f15413c = goVar;
        this.f15412b = activity;
    }

    @Override // m4.ho
    public final /* bridge */ /* synthetic */ e40 a() {
        go.b(this.f15412b, "ad_overlay");
        return null;
    }

    @Override // m4.ho
    public final e40 b(lp lpVar) {
        return lpVar.N(new b(this.f15412b));
    }

    @Override // m4.ho
    public final e40 c() {
        h40 h40Var;
        es.c(this.f15412b);
        if (((Boolean) jo.f10145d.f10148c.a(es.f8234x6)).booleanValue()) {
            try {
                b bVar = new b(this.f15412b);
                try {
                    try {
                        IBinder b10 = DynamiteModule.c(this.f15412b, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                        int i10 = g40.f8744s;
                        if (b10 == null) {
                            h40Var = null;
                        } else {
                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                            h40Var = queryLocalInterface instanceof h40 ? (h40) queryLocalInterface : new f40(b10);
                        }
                        return d40.N3(h40Var.n0(bVar));
                    } catch (Exception e10) {
                        throw new m90(e10);
                    }
                } catch (Exception e11) {
                    throw new m90(e11);
                }
            } catch (RemoteException | NullPointerException | m90 e12) {
                this.f15413c.f8987e = v40.c(this.f15412b.getApplicationContext());
                this.f15413c.f8987e.a(e12, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        b40 b40Var = this.f15413c.f8986d;
        Activity activity = this.f15412b;
        Objects.requireNonNull(b40Var);
        try {
            IBinder n02 = b40Var.b(activity).n0(new b(activity));
            if (n02 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = n02.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface2 instanceof e40 ? (e40) queryLocalInterface2 : new c40(n02);
        } catch (RemoteException | c.a e13) {
            g1.k("Could not create remote AdOverlay.", e13);
            return null;
        }
    }
}

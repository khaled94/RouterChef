package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import n3.g1;

/* loaded from: classes.dex */
public final class m8 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f11103s;

    /* renamed from: t */
    public final /* synthetic */ Object f11104t;

    public /* synthetic */ m8(Object obj, int i10) {
        this.f11103s = i10;
        this.f11104t = obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List<java.util.Map<java.lang.String, java.lang.String>>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List<java.util.Map<java.lang.String, java.lang.String>>, java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        fu fuVar;
        switch (this.f11103s) {
            case 0:
                es.c(((n8) this.f11104t).f11550a);
                return;
            case 1:
                int i10 = ta0.K;
                ((ta0) this.f11104t).c("surfaceDestroyed", new String[0]);
                return;
            case 2:
                eu euVar = ((mh0) this.f11104t).B;
                y40 y40Var = new y40();
                Objects.requireNonNull(euVar);
                try {
                    try {
                        try {
                            IBinder b10 = DynamiteModule.c(euVar.f8266a, DynamiteModule.f2944b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                            if (b10 == null) {
                                fuVar = null;
                            } else {
                                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                fuVar = queryLocalInterface instanceof fu ? (fu) queryLocalInterface : new fu(b10);
                            }
                            Parcel w10 = fuVar.w();
                            ca.d(w10, y40Var);
                            fuVar.e0(1, w10);
                            return;
                        } catch (Exception e10) {
                            throw new m90(e10);
                        }
                    } catch (Exception e11) {
                        throw new m90(e11);
                    }
                } catch (RemoteException e12) {
                    str3 = String.valueOf(e12.getMessage());
                    str2 = "Error calling setFlagsAccessedBeforeInitializedListener: ";
                    if (str3.length() == 0) {
                        str = new String(str2);
                        g1.j(str);
                        return;
                    }
                    str = str2.concat(str3);
                    g1.j(str);
                    return;
                } catch (m90 e13) {
                    str3 = String.valueOf(e13.getMessage());
                    str2 = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:";
                    if (str3.length() == 0) {
                        str = new String(str2);
                        g1.j(str);
                        return;
                    }
                    str = str2.concat(str3);
                    g1.j(str);
                    return;
                }
            case 3:
                try {
                    ((fy0) this.f11104t).g();
                    return;
                } catch (RemoteException e14) {
                    g1.l("#007 Could not call remote method.", e14);
                    return;
                }
            default:
                j21 j21Var = (j21) this.f11104t;
                m11 m11Var = j21Var.f9819l;
                synchronized (m11Var) {
                    yr<Boolean> yrVar = es.f8166p1;
                    jo joVar = jo.f10145d;
                    if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                        if (!((Boolean) joVar.f10148c.a(es.I5)).booleanValue() && !m11Var.f11074d) {
                            Map<String, String> e15 = m11Var.e();
                            ((HashMap) e15).put("action", "init_finished");
                            m11Var.f11072b.add(e15);
                            Iterator it = m11Var.f11072b.iterator();
                            while (it.hasNext()) {
                                m11Var.f11076f.a((Map) it.next());
                            }
                            m11Var.f11074d = true;
                        }
                    }
                }
                j21Var.f9822o.M0(qr0.f12981s);
                j21Var.f9809b = true;
                return;
        }
    }
}

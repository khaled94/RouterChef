package m4;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k4.a;
import k4.b;
import s4.d1;
import s4.e1;
import s4.h1;
import s4.j1;
import s4.k1;
import s4.k2;
import s4.y1;

/* loaded from: classes.dex */
public abstract class df0 extends ba implements ef0 {
    public df0() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        String str;
        boolean z10 = false;
        switch (i10) {
            case 1:
                ((w00) this).f14816s.f20026a.e((Bundle) ca.a(parcel, Bundle.CREATOR), false);
                parcel2.writeNoException();
                break;
            case 2:
                Bundle e10 = ((w00) this).f14816s.f20026a.e((Bundle) ca.a(parcel, Bundle.CREATOR), true);
                parcel2.writeNoException();
                ca.c(parcel2, e10);
                break;
            case 3:
                ((w00) this).f14816s.a(parcel.readString(), parcel.readString(), (Bundle) ca.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                x4.a aVar = ((w00) this).f14816s;
                Object e02 = c02 != null ? b.e0(c02) : null;
                k2 k2Var = aVar.f20026a;
                Objects.requireNonNull(k2Var);
                k2Var.b(new y1(k2Var, readString, readString2, e02));
                parcel2.writeNoException();
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                ClassLoader classLoader = ca.f6747a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                Map<String, Object> h10 = ((w00) this).f14816s.f20026a.h(readString3, readString4, z10);
                parcel2.writeNoException();
                parcel2.writeMap(h10);
                break;
            case 6:
                int c10 = ((w00) this).f14816s.f20026a.c(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(c10);
                break;
            case 7:
                k2 k2Var2 = ((w00) this).f14816s.f20026a;
                Objects.requireNonNull(k2Var2);
                k2Var2.b(new d1(k2Var2, (Bundle) ca.a(parcel, Bundle.CREATOR)));
                parcel2.writeNoException();
                break;
            case 8:
                k2 k2Var3 = ((w00) this).f14816s.f20026a;
                Objects.requireNonNull(k2Var3);
                k2Var3.b(new e1(k2Var3, parcel.readString(), parcel.readString(), (Bundle) ca.a(parcel, Bundle.CREATOR)));
                parcel2.writeNoException();
                break;
            case 9:
                List<Bundle> g10 = ((w00) this).f14816s.f20026a.g(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(g10);
                break;
            case 10:
                str = ((w00) this).d();
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 11:
                str = ((w00) this).h();
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 12:
                long d5 = ((w00) this).f14816s.f20026a.d();
                parcel2.writeNoException();
                parcel2.writeLong(d5);
                break;
            case 13:
                String readString5 = parcel.readString();
                k2 k2Var4 = ((w00) this).f14816s.f20026a;
                Objects.requireNonNull(k2Var4);
                k2Var4.b(new j1(k2Var4, readString5));
                parcel2.writeNoException();
                break;
            case 14:
                String readString6 = parcel.readString();
                k2 k2Var5 = ((w00) this).f14816s.f20026a;
                Objects.requireNonNull(k2Var5);
                k2Var5.b(new k1(k2Var5, readString6));
                parcel2.writeNoException();
                break;
            case 15:
                ((w00) this).g3(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 16:
                str = ((w00) this).f();
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 17:
                str = ((w00) this).e();
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 18:
                str = ((w00) this).f14816s.f20026a.f17955f;
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 19:
                k2 k2Var6 = ((w00) this).f14816s.f20026a;
                Objects.requireNonNull(k2Var6);
                k2Var6.b(new h1(k2Var6, (Bundle) ca.a(parcel, Bundle.CREATOR)));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

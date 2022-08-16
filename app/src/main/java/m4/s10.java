package m4;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import f3.m;
import java.util.List;
import java.util.Objects;
import k4.a;
import k4.b;
import o2.g;

/* loaded from: classes.dex */
public abstract class s10 extends ba implements t10 {
    public s10() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        String str;
        IInterface iInterface;
        lq lqVar;
        boolean z10;
        switch (i10) {
            case 2:
                str = ((f20) this).f8343s.f16736a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List q10 = ((f20) this).q();
                parcel2.writeNoException();
                parcel2.writeList(q10);
                return true;
            case 4:
                str = ((f20) this).f8343s.f16738c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 5:
                vu l10 = ((f20) this).l();
                parcel2.writeNoException();
                ca.d(parcel2, l10);
                return true;
            case 6:
                str = ((f20) this).f8343s.f16740e;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 7:
                str = ((f20) this).f8343s.f16741f;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                Double d5 = ((f20) this).f8343s.f16742g;
                double doubleValue = d5 != null ? d5.doubleValue() : -1.0d;
                parcel2.writeNoException();
                parcel2.writeDouble(doubleValue);
                return true;
            case 9:
                str = ((f20) this).f8343s.f16743h;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                str = ((f20) this).f8343s.f16744i;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 11:
                m mVar = ((f20) this).f8343s.f16745j;
                if (mVar != null) {
                    synchronized (mVar.f4516a) {
                        lqVar = mVar.f4517b;
                    }
                    iInterface = lqVar;
                    parcel2.writeNoException();
                    ca.d(parcel2, iInterface);
                    return true;
                }
                iInterface = null;
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 12:
                iInterface = null;
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 13:
                Objects.requireNonNull(((f20) this).f8343s);
                iInterface = null;
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 14:
                ((f20) this).j();
                iInterface = null;
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 15:
                Object obj = ((f20) this).f8343s.f16746k;
                if (obj != null) {
                    iInterface = new b(obj);
                    parcel2.writeNoException();
                    ca.d(parcel2, iInterface);
                    return true;
                }
                iInterface = null;
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 16:
                Bundle bundle = ((f20) this).f8343s.f16747l;
                parcel2.writeNoException();
                ca.c(parcel2, bundle);
                return true;
            case 17:
                z10 = ((f20) this).f8343s.f16748m;
                parcel2.writeNoException();
                ClassLoader classLoader = ca.f6747a;
                int i11 = z10 ? 1 : 0;
                int i12 = z10 ? 1 : 0;
                parcel2.writeInt(i11);
                return true;
            case 18:
                z10 = ((f20) this).f8343s.f16749n;
                parcel2.writeNoException();
                ClassLoader classLoader2 = ca.f6747a;
                int i112 = z10 ? 1 : 0;
                int i122 = z10 ? 1 : 0;
                parcel2.writeInt(i112);
                return true;
            case 19:
                Objects.requireNonNull(((f20) this).f8343s);
                parcel2.writeNoException();
                return true;
            case 20:
                a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                g gVar = ((f20) this).f8343s;
                View view = (View) b.e0(c02);
                Objects.requireNonNull(gVar);
                parcel2.writeNoException();
                return true;
            case 21:
                ((f20) this).P0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                a c03 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                g gVar2 = ((f20) this).f8343s;
                View view2 = (View) b.e0(c03);
                Objects.requireNonNull(gVar2);
                parcel2.writeNoException();
                return true;
            case 23:
                Objects.requireNonNull(((f20) this).f8343s);
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                Objects.requireNonNull(((f20) this).f8343s);
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                Objects.requireNonNull(((f20) this).f8343s);
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            default:
                return false;
        }
    }
}

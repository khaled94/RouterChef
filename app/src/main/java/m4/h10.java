package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import k4.a;

/* loaded from: classes.dex */
public abstract class h10 extends ba implements i10 {
    public h10() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        IInterface iInterface;
        Parcelable parcelable;
        boolean z10 = false;
        l10 l10Var = null;
        l10 j10Var = null;
        l10 l10Var2 = null;
        uy uyVar = null;
        l10 l10Var3 = null;
        l10 j10Var2 = null;
        l10 j10Var3 = null;
        l10 j10Var4 = null;
        l10 l10Var4 = null;
        switch (i10) {
            case 1:
                a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                on onVar = (on) ca.a(parcel, on.CREATOR);
                jn jnVar = (jn) ca.a(parcel, jn.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    l10Var = queryLocalInterface instanceof l10 ? (l10) queryLocalInterface : new j10(readStrongBinder);
                }
                X1(c02, onVar, jnVar, readString, l10Var);
                parcel2.writeNoException();
                break;
            case 2:
                iInterface = j();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 3:
                a c03 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                jn jnVar2 = (jn) ca.a(parcel, jn.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    l10Var4 = queryLocalInterface2 instanceof l10 ? (l10) queryLocalInterface2 : new j10(readStrongBinder2);
                }
                Q0(c03, jnVar2, readString2, l10Var4);
                parcel2.writeNoException();
                break;
            case 4:
                H();
                parcel2.writeNoException();
                break;
            case 5:
                k();
                parcel2.writeNoException();
                break;
            case 6:
                a c04 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                on onVar2 = (on) ca.a(parcel, on.CREATOR);
                jn jnVar3 = (jn) ca.a(parcel, jn.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    j10Var4 = queryLocalInterface3 instanceof l10 ? (l10) queryLocalInterface3 : new j10(readStrongBinder3);
                }
                G0(c04, onVar2, jnVar3, readString3, readString4, j10Var4);
                parcel2.writeNoException();
                break;
            case 7:
                a c05 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                jn jnVar4 = (jn) ca.a(parcel, jn.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    j10Var3 = queryLocalInterface4 instanceof l10 ? (l10) queryLocalInterface4 : new j10(readStrongBinder4);
                }
                F0(c05, jnVar4, readString5, readString6, j10Var3);
                parcel2.writeNoException();
                break;
            case 8:
                S();
                parcel2.writeNoException();
                break;
            case 9:
                w1();
                parcel2.writeNoException();
                break;
            case 10:
                parcel.readString();
                A2(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), (jn) ca.a(parcel, jn.CREATOR), i60.N3(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                a1((jn) ca.a(parcel, jn.CREATOR), parcel.readString());
                parcel2.writeNoException();
                break;
            case 12:
                D();
                parcel2.writeNoException();
                break;
            case 13:
                boolean J = J();
                parcel2.writeNoException();
                ClassLoader classLoader = ca.f6747a;
                parcel2.writeInt(J ? 1 : 0);
                break;
            case 14:
                a c06 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                jn jnVar5 = (jn) ca.a(parcel, jn.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    j10Var2 = queryLocalInterface5 instanceof l10 ? (l10) queryLocalInterface5 : new j10(readStrongBinder5);
                }
                H3(c06, jnVar5, readString7, readString8, j10Var2, (lu) ca.a(parcel, lu.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 15:
            case 16:
                parcel2.writeNoException();
                ca.d(parcel2, null);
                break;
            case 17:
                parcelable = b();
                parcel2.writeNoException();
                ca.c(parcel2, parcelable);
                break;
            case 18:
                parcelable = d();
                parcel2.writeNoException();
                ca.c(parcel2, parcelable);
                break;
            case 19:
                parcelable = e();
                parcel2.writeNoException();
                ca.c(parcel2, parcelable);
                break;
            case 20:
                String readString9 = parcel.readString();
                parcel.readString();
                l3((jn) ca.a(parcel, jn.CREATOR), readString9);
                parcel2.writeNoException();
                break;
            case 21:
                y3(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader2 = ca.f6747a;
                parcel2.writeInt(0);
                break;
            case 23:
                p3(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), i60.N3(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 24:
                iInterface = h();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 25:
                ClassLoader classLoader3 = ca.f6747a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                M0(z10);
                parcel2.writeNoException();
                break;
            case 26:
                iInterface = f();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 27:
                iInterface = n();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 28:
                a c07 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                jn jnVar6 = (jn) ca.a(parcel, jn.CREATOR);
                String readString10 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    l10Var3 = queryLocalInterface6 instanceof l10 ? (l10) queryLocalInterface6 : new j10(readStrongBinder6);
                }
                j3(c07, jnVar6, readString10, l10Var3);
                parcel2.writeNoException();
                break;
            case 29:
            default:
                return false;
            case 30:
                f2(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 31:
                a c08 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    uyVar = queryLocalInterface7 instanceof uy ? (uy) queryLocalInterface7 : new ty(readStrongBinder7);
                }
                m2(c08, uyVar, parcel.createTypedArrayList(yy.CREATOR));
                parcel2.writeNoException();
                break;
            case 32:
                a c09 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                jn jnVar7 = (jn) ca.a(parcel, jn.CREATOR);
                String readString11 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    l10Var2 = queryLocalInterface8 instanceof l10 ? (l10) queryLocalInterface8 : new j10(readStrongBinder8);
                }
                F2(c09, jnVar7, readString11, l10Var2);
                parcel2.writeNoException();
                break;
            case 33:
                parcelable = l();
                parcel2.writeNoException();
                ca.c(parcel2, parcelable);
                break;
            case 34:
                parcelable = o();
                parcel2.writeNoException();
                ca.c(parcel2, parcelable);
                break;
            case 35:
                a c010 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                on onVar3 = (on) ca.a(parcel, on.CREATOR);
                jn jnVar8 = (jn) ca.a(parcel, jn.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    j10Var = queryLocalInterface9 instanceof l10 ? (l10) queryLocalInterface9 : new j10(readStrongBinder9);
                }
                J1(c010, onVar3, jnVar8, readString12, readString13, j10Var);
                parcel2.writeNoException();
                break;
            case 36:
                iInterface = i();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 37:
                V2(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}

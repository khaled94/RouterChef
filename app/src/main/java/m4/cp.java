package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import k4.a;

/* loaded from: classes.dex */
public abstract class cp extends ba implements dp {
    public cp() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        IInterface iInterface;
        boolean z10;
        Parcelable parcelable;
        String str;
        boolean z11 = false;
        po poVar = null;
        pp ppVar = null;
        to toVar = null;
        gq gqVar = null;
        yi yiVar = null;
        e60 e60Var = null;
        mp mpVar = null;
        mo moVar = null;
        vs vsVar = null;
        ip ipVar = null;
        switch (i10) {
            case 1:
                iInterface = j();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 2:
                L();
                parcel2.writeNoException();
                break;
            case 3:
                z10 = o0();
                parcel2.writeNoException();
                ClassLoader classLoader = ca.f6747a;
                int i11 = z10 ? 1 : 0;
                int i12 = z10 ? 1 : 0;
                int i13 = z10 ? 1 : 0;
                int i14 = z10 ? 1 : 0;
                parcel2.writeInt(i11);
                break;
            case 4:
                z10 = F1((jn) ca.a(parcel, jn.CREATOR));
                parcel2.writeNoException();
                int i112 = z10 ? 1 : 0;
                int i122 = z10 ? 1 : 0;
                int i132 = z10 ? 1 : 0;
                int i142 = z10 ? 1 : 0;
                parcel2.writeInt(i112);
                break;
            case 5:
                F();
                parcel2.writeNoException();
                break;
            case 6:
                y();
                parcel2.writeNoException();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    poVar = queryLocalInterface instanceof po ? (po) queryLocalInterface : new no(readStrongBinder);
                }
                Y0(poVar);
                parcel2.writeNoException();
                break;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    ipVar = queryLocalInterface2 instanceof ip ? (ip) queryLocalInterface2 : new hp(readStrongBinder2);
                }
                n2(ipVar);
                parcel2.writeNoException();
                break;
            case 9:
                g0();
                parcel2.writeNoException();
                break;
            case 10:
                parcel2.writeNoException();
                break;
            case 11:
                C();
                parcel2.writeNoException();
                break;
            case 12:
                parcelable = e();
                parcel2.writeNoException();
                ca.c(parcel2, parcelable);
                break;
            case 13:
                D3((on) ca.a(parcel, on.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if (queryLocalInterface3 instanceof k40) {
                        k40 k40Var = (k40) queryLocalInterface3;
                    }
                }
                K();
                parcel2.writeNoException();
                break;
            case 15:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if (queryLocalInterface4 instanceof l40) {
                        l40 l40Var = (l40) queryLocalInterface4;
                    }
                }
                parcel.readString();
                R();
                parcel2.writeNoException();
                break;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                str = p();
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 19:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    vsVar = queryLocalInterface5 instanceof vs ? (vs) queryLocalInterface5 : new us(readStrongBinder5);
                }
                v3(vsVar);
                parcel2.writeNoException();
                break;
            case 20:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    moVar = queryLocalInterface6 instanceof mo ? (mo) queryLocalInterface6 : new lo(readStrongBinder6);
                }
                K0(moVar);
                parcel2.writeNoException();
                break;
            case 21:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    mpVar = queryLocalInterface7 instanceof mp ? (mp) queryLocalInterface7 : new mp(readStrongBinder7);
                }
                R1(mpVar);
                parcel2.writeNoException();
                break;
            case 22:
                ClassLoader classLoader2 = ca.f6747a;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                z3(z11);
                parcel2.writeNoException();
                break;
            case 23:
                z10 = z2();
                parcel2.writeNoException();
                ClassLoader classLoader3 = ca.f6747a;
                int i1122 = z10 ? 1 : 0;
                int i1222 = z10 ? 1 : 0;
                int i1322 = z10 ? 1 : 0;
                int i1422 = z10 ? 1 : 0;
                parcel2.writeInt(i1122);
                break;
            case 24:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    e60Var = queryLocalInterface8 instanceof e60 ? (e60) queryLocalInterface8 : new d60(readStrongBinder8);
                }
                S2(e60Var);
                parcel2.writeNoException();
                break;
            case 25:
                parcel.readString();
                h0();
                parcel2.writeNoException();
                break;
            case 26:
                iInterface = l();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 29:
                L2((or) ca.a(parcel, or.CREATOR));
                parcel2.writeNoException();
                break;
            case 30:
                qq qqVar = (qq) ca.a(parcel, qq.CREATOR);
                G();
                parcel2.writeNoException();
                break;
            case 31:
                str = x();
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 32:
                iInterface = i();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 33:
                iInterface = h();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 34:
                ClassLoader classLoader4 = ca.f6747a;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                e2(z11);
                parcel2.writeNoException();
                break;
            case 35:
                str = r();
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 36:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface9 instanceof gp) {
                        gp gpVar = (gp) queryLocalInterface9;
                    }
                }
                B();
                parcel2.writeNoException();
                break;
            case 37:
                parcelable = g();
                parcel2.writeNoException();
                ca.c(parcel2, parcelable);
                break;
            case 38:
                parcel.readString();
                T();
                parcel2.writeNoException();
                break;
            case 39:
                e3((un) ca.a(parcel, un.CREATOR));
                parcel2.writeNoException();
                break;
            case 40:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    yiVar = queryLocalInterface10 instanceof yi ? (yi) queryLocalInterface10 : new xi(readStrongBinder10);
                }
                H2(yiVar);
                parcel2.writeNoException();
                break;
            case 41:
                iInterface = n();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 42:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    gqVar = queryLocalInterface11 instanceof gq ? (gq) queryLocalInterface11 : new eq(readStrongBinder11);
                }
                G2(gqVar);
                parcel2.writeNoException();
                break;
            case 43:
                jn jnVar = (jn) ca.a(parcel, jn.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    toVar = queryLocalInterface12 instanceof to ? (to) queryLocalInterface12 : new qo(readStrongBinder12);
                }
                r3(jnVar, toVar);
                parcel2.writeNoException();
                break;
            case 44:
                k1(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 45:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    ppVar = queryLocalInterface13 instanceof pp ? (pp) queryLocalInterface13 : new np(readStrongBinder13);
                }
                c1(ppVar);
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}

package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import k4.a;

/* loaded from: classes.dex */
public abstract class t20 extends ba implements u20 {

    /* renamed from: s */
    public static final /* synthetic */ int f13905s = 0;

    public t20() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        x20 x20Var = null;
        o20 m20Var = null;
        i20 g20Var = null;
        r20 p20Var = null;
        o20 m20Var2 = null;
        r20 p20Var2 = null;
        l20 j20Var = null;
        i20 g20Var2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                ((b30) this).d();
                throw null;
            } else if (i10 == 3) {
                ((b30) this).e();
                throw null;
            } else {
                if (i10 == 5) {
                    lq b10 = ((b30) this).b();
                    parcel2.writeNoException();
                    ca.d(parcel2, b10);
                } else if (i10 == 10) {
                    a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                } else if (i10 != 11) {
                    switch (i10) {
                        case 13:
                            String readString = parcel.readString();
                            String readString2 = parcel.readString();
                            jn jnVar = (jn) ca.a(parcel, jn.CREATOR);
                            a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            if (readStrongBinder != null) {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                g20Var2 = queryLocalInterface instanceof i20 ? (i20) queryLocalInterface : new g20(readStrongBinder);
                            }
                            ((b30) this).l1(readString, readString2, jnVar, c02, g20Var2, k10.N3(parcel.readStrongBinder()), (on) ca.a(parcel, on.CREATOR));
                            break;
                        case 14:
                            String readString3 = parcel.readString();
                            String readString4 = parcel.readString();
                            jn jnVar2 = (jn) ca.a(parcel, jn.CREATOR);
                            a c03 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                j20Var = queryLocalInterface2 instanceof l20 ? (l20) queryLocalInterface2 : new j20(readStrongBinder2);
                            }
                            ((b30) this).G3(readString3, readString4, jnVar2, c03, j20Var, k10.N3(parcel.readStrongBinder()));
                            break;
                        case 15:
                        case 17:
                            a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                            parcel2.writeNoException();
                            ClassLoader classLoader = ca.f6747a;
                            parcel2.writeInt(0);
                            break;
                        case 16:
                            String readString5 = parcel.readString();
                            String readString6 = parcel.readString();
                            jn jnVar3 = (jn) ca.a(parcel, jn.CREATOR);
                            a c04 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                            IBinder readStrongBinder3 = parcel.readStrongBinder();
                            if (readStrongBinder3 != null) {
                                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                p20Var2 = queryLocalInterface3 instanceof r20 ? (r20) queryLocalInterface3 : new p20(readStrongBinder3);
                            }
                            ((b30) this).E0(readString5, readString6, jnVar3, c04, p20Var2, k10.N3(parcel.readStrongBinder()));
                            break;
                        case 18:
                            String readString7 = parcel.readString();
                            String readString8 = parcel.readString();
                            jn jnVar4 = (jn) ca.a(parcel, jn.CREATOR);
                            a c05 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                            IBinder readStrongBinder4 = parcel.readStrongBinder();
                            if (readStrongBinder4 != null) {
                                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                m20Var2 = queryLocalInterface4 instanceof o20 ? (o20) queryLocalInterface4 : new m20(readStrongBinder4);
                            }
                            ((b30) this).B0(readString7, readString8, jnVar4, c05, m20Var2, k10.N3(parcel.readStrongBinder()), null);
                            break;
                        case 19:
                            ((b30) this).f6346u = parcel.readString();
                            break;
                        case 20:
                            String readString9 = parcel.readString();
                            String readString10 = parcel.readString();
                            jn jnVar5 = (jn) ca.a(parcel, jn.CREATOR);
                            a c06 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                            IBinder readStrongBinder5 = parcel.readStrongBinder();
                            if (readStrongBinder5 != null) {
                                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                p20Var = queryLocalInterface5 instanceof r20 ? (r20) queryLocalInterface5 : new p20(readStrongBinder5);
                            }
                            ((b30) this).z1(readString9, readString10, jnVar5, c06, p20Var, k10.N3(parcel.readStrongBinder()));
                            break;
                        case 21:
                            String readString11 = parcel.readString();
                            String readString12 = parcel.readString();
                            jn jnVar6 = (jn) ca.a(parcel, jn.CREATOR);
                            a c07 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                            IBinder readStrongBinder6 = parcel.readStrongBinder();
                            if (readStrongBinder6 != null) {
                                IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                g20Var = queryLocalInterface6 instanceof i20 ? (i20) queryLocalInterface6 : new g20(readStrongBinder6);
                            }
                            ((b30) this).x0(readString11, readString12, jnVar6, c07, g20Var, k10.N3(parcel.readStrongBinder()), (on) ca.a(parcel, on.CREATOR));
                            break;
                        case 22:
                            String readString13 = parcel.readString();
                            String readString14 = parcel.readString();
                            jn jnVar7 = (jn) ca.a(parcel, jn.CREATOR);
                            a c08 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                            IBinder readStrongBinder7 = parcel.readStrongBinder();
                            if (readStrongBinder7 != null) {
                                IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                m20Var = queryLocalInterface7 instanceof o20 ? (o20) queryLocalInterface7 : new m20(readStrongBinder7);
                            }
                            ((b30) this).B0(readString13, readString14, jnVar7, c08, m20Var, k10.N3(parcel.readStrongBinder()), (lu) ca.a(parcel, lu.CREATOR));
                            break;
                        default:
                            return false;
                    }
                } else {
                    parcel.createStringArray();
                    Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
                }
                return true;
            }
        }
        a c09 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
        String readString15 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) ca.a(parcel, creator);
        Bundle bundle2 = (Bundle) ca.a(parcel, creator);
        on onVar = (on) ca.a(parcel, on.CREATOR);
        IBinder readStrongBinder8 = parcel.readStrongBinder();
        if (readStrongBinder8 != null) {
            IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            x20Var = queryLocalInterface8 instanceof x20 ? (x20) queryLocalInterface8 : new v20(readStrongBinder8);
        }
        ((b30) this).i1(c09, readString15, bundle, bundle2, onVar, x20Var);
        parcel2.writeNoException();
        return true;
    }
}

package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import h3.a;
import h3.f;

/* loaded from: classes.dex */
public abstract class yo extends ba implements zo {
    public yo() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        qv qvVar;
        po poVar = null;
        hz hzVar = null;
        wv wvVar = null;
        tv tvVar = null;
        mp mpVar = null;
        nv nvVar = null;
        kv kvVar = null;
        iv ivVar = null;
        switch (i10) {
            case 1:
                wo b10 = b();
                parcel2.writeNoException();
                ca.d(parcel2, b10);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    poVar = queryLocalInterface instanceof po ? (po) queryLocalInterface : new no(readStrongBinder);
                }
                p1(poVar);
                break;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    ivVar = queryLocalInterface2 instanceof iv ? (iv) queryLocalInterface2 : new hv(readStrongBinder2);
                }
                K2(ivVar);
                break;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    kvVar = queryLocalInterface3 instanceof kv ? (kv) queryLocalInterface3 : new jv(readStrongBinder3);
                }
                o1(kvVar);
                break;
            case 5:
                String readString = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    qvVar = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    qvVar = queryLocalInterface4 instanceof qv ? (qv) queryLocalInterface4 : new ov(readStrongBinder4);
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    nvVar = queryLocalInterface5 instanceof nv ? (nv) queryLocalInterface5 : new lv(readStrongBinder5);
                }
                n1(readString, qvVar, nvVar);
                break;
            case 6:
                u3((lu) ca.a(parcel, lu.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    mpVar = queryLocalInterface6 instanceof mp ? (mp) queryLocalInterface6 : new mp(readStrongBinder6);
                }
                m1(mpVar);
                break;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    tvVar = queryLocalInterface7 instanceof tv ? (tv) queryLocalInterface7 : new sv(readStrongBinder7);
                }
                i2(tvVar, (on) ca.a(parcel, on.CREATOR));
                break;
            case 9:
                Z0((f) ca.a(parcel, f.CREATOR));
                break;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    wvVar = queryLocalInterface8 instanceof wv ? (wv) queryLocalInterface8 : new uv(readStrongBinder8);
                }
                s1(wvVar);
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                b3((az) ca.a(parcel, az.CREATOR));
                break;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    hzVar = queryLocalInterface9 instanceof hz ? (hz) queryLocalInterface9 : new gz(readStrongBinder9);
                }
                R0(hzVar);
                break;
            case 15:
                D2((a) ca.a(parcel, a.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}

package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d10 extends aa implements f10 {
    public d10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // m4.f10
    public final boolean O(String str) {
        Parcel w10 = w();
        w10.writeString(str);
        Parcel c02 = c0(2, w10);
        ClassLoader classLoader = ca.f6747a;
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }

    @Override // m4.f10
    public final boolean P(String str) {
        Parcel w10 = w();
        w10.writeString(str);
        Parcel c02 = c0(4, w10);
        ClassLoader classLoader = ca.f6747a;
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }

    @Override // m4.f10
    public final u20 X(String str) {
        u20 u20Var;
        Parcel w10 = w();
        w10.writeString(str);
        Parcel c02 = c0(3, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        int i10 = t20.f13905s;
        if (readStrongBinder == null) {
            u20Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            u20Var = queryLocalInterface instanceof u20 ? (u20) queryLocalInterface : new s20(readStrongBinder);
        }
        c02.recycle();
        return u20Var;
    }

    @Override // m4.f10
    public final i10 z(String str) {
        i10 i10Var;
        Parcel w10 = w();
        w10.writeString(str);
        Parcel c02 = c0(1, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            i10Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            i10Var = queryLocalInterface instanceof i10 ? (i10) queryLocalInterface : new g10(readStrongBinder);
        }
        c02.recycle();
        return i10Var;
    }
}

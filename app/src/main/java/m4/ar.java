package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ar extends ba implements yp {

    /* renamed from: s */
    public final String f6243s;

    /* renamed from: t */
    public final String f6244t;

    public ar(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f6243s = str;
        this.f6244t = str2;
    }

    public static yp N3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof yp ? (yp) queryLocalInterface : new xp(iBinder);
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        String str;
        if (i10 == 1) {
            str = this.f6243s;
        } else if (i10 != 2) {
            return false;
        } else {
            str = this.f6244t;
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }

    @Override // m4.yp
    public final String b() {
        return this.f6243s;
    }

    @Override // m4.yp
    public final String d() {
        return this.f6244t;
    }
}

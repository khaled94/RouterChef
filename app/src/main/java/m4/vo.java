package m4;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class vo extends ba implements wo {
    public vo() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        String str;
        if (i10 != 1) {
            if (i10 == 2) {
                str = b();
            } else if (i10 == 3) {
                boolean h10 = h();
                parcel2.writeNoException();
                ClassLoader classLoader = ca.f6747a;
                parcel2.writeInt(h10 ? 1 : 0);
                return true;
            } else if (i10 == 4) {
                str = d();
            } else if (i10 != 5) {
                return false;
            } else {
                y1((jn) ca.a(parcel, jn.CREATOR), parcel.readInt());
            }
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        }
        D1((jn) ca.a(parcel, jn.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}

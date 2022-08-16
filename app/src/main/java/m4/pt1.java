package m4;

import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public abstract class pt1 extends ba implements qt1 {
    public pt1() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                parcel.readString();
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                break;
            case 5:
                parcel.createByteArray();
                break;
            case 6:
            case 7:
                parcel.readInt();
                break;
            case 8:
                a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

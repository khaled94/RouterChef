package m4;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class oo extends ba implements po {
    public oo() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 1:
                g();
                break;
            case 2:
                E(parcel.readInt());
                break;
            case 3:
                break;
            case 4:
                h();
                break;
            case 5:
                i();
                break;
            case 6:
                c();
                break;
            case 7:
                e();
                break;
            case 8:
                t((cn) ca.a(parcel, cn.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class r60 extends ba implements s60 {
    public r60() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        n60 n60Var;
        switch (i10) {
            case 1:
                ((b21) this).i();
                break;
            case 2:
                ((b21) this).e();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    n60Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    n60Var = queryLocalInterface instanceof n60 ? (n60) queryLocalInterface : new m60(readStrongBinder);
                }
                ((b21) this).i3(n60Var);
                break;
            case 4:
                int readInt = parcel.readInt();
                c21 c21Var = ((b21) this).f6344s;
                c21Var.f6699b.l(c21Var.f6698a, readInt);
                break;
            case 5:
                c21 c21Var2 = ((b21) this).f6344s;
                c21Var2.f6699b.l(c21Var2.f6698a, ((cn) ca.a(parcel, cn.CREATOR)).f7067s);
                break;
            case 6:
                ((b21) this).d();
                break;
            case 7:
                ((b21) this).b();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

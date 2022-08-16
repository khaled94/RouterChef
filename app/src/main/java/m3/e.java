package m3;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final f createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        boolean z10 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.e(parcel, readInt);
                    break;
                case 3:
                    str2 = b.e(parcel, readInt);
                    break;
                case 4:
                    str3 = b.e(parcel, readInt);
                    break;
                case 5:
                    str4 = b.e(parcel, readInt);
                    break;
                case 6:
                    str5 = b.e(parcel, readInt);
                    break;
                case 7:
                    str6 = b.e(parcel, readInt);
                    break;
                case '\b':
                    str7 = b.e(parcel, readInt);
                    break;
                case '\t':
                    intent = (Intent) b.d(parcel, readInt, Intent.CREATOR);
                    break;
                case '\n':
                    iBinder = b.m(parcel, readInt);
                    break;
                case 11:
                    z10 = b.k(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new f(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i10) {
        return new f[i10];
    }
}

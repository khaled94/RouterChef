package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class on1 implements Parcelable.Creator<nn1> {
    @Override // android.os.Parcelable.Creator
    public final nn1 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        String str = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.n(parcel, readInt);
                    break;
                case 2:
                    i11 = b.n(parcel, readInt);
                    break;
                case 3:
                    i12 = b.n(parcel, readInt);
                    break;
                case 4:
                    i13 = b.n(parcel, readInt);
                    break;
                case 5:
                    str = b.e(parcel, readInt);
                    break;
                case 6:
                    i14 = b.n(parcel, readInt);
                    break;
                case 7:
                    i15 = b.n(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new nn1(i10, i11, i12, i13, str, i14, i15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ nn1[] newArray(int i10) {
        return new nn1[i10];
    }
}

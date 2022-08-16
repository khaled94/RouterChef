package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class mu implements Parcelable.Creator<lu> {
    @Override // android.os.Parcelable.Creator
    public final lu createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        or orVar = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.n(parcel, readInt);
                    break;
                case 2:
                    z10 = b.k(parcel, readInt);
                    break;
                case 3:
                    i11 = b.n(parcel, readInt);
                    break;
                case 4:
                    z11 = b.k(parcel, readInt);
                    break;
                case 5:
                    i12 = b.n(parcel, readInt);
                    break;
                case 6:
                    orVar = (or) b.d(parcel, readInt, or.CREATOR);
                    break;
                case 7:
                    z12 = b.k(parcel, readInt);
                    break;
                case '\b':
                    i13 = b.n(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new lu(i10, z10, i11, z11, i12, orVar, z12, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lu[] newArray(int i10) {
        return new lu[i10];
    }
}

package d4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class w0 implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final d createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        o oVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    oVar = (o) b.d(parcel, readInt, o.CREATOR);
                    break;
                case 2:
                    z10 = b.k(parcel, readInt);
                    break;
                case 3:
                    z11 = b.k(parcel, readInt);
                    break;
                case 4:
                    iArr = b.c(parcel, readInt);
                    break;
                case 5:
                    i10 = b.n(parcel, readInt);
                    break;
                case 6:
                    iArr2 = b.c(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new d(oVar, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i10) {
        return new d[i10];
    }
}

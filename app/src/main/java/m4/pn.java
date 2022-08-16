package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class pn implements Parcelable.Creator<on> {
    @Override // android.os.Parcelable.Creator
    public final on createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        on[] onVarArr = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.e(parcel, readInt);
                    break;
                case 3:
                    i10 = b.n(parcel, readInt);
                    break;
                case 4:
                    i11 = b.n(parcel, readInt);
                    break;
                case 5:
                    z10 = b.k(parcel, readInt);
                    break;
                case 6:
                    i12 = b.n(parcel, readInt);
                    break;
                case 7:
                    i13 = b.n(parcel, readInt);
                    break;
                case '\b':
                    onVarArr = (on[]) b.h(parcel, readInt, on.CREATOR);
                    break;
                case '\t':
                    z11 = b.k(parcel, readInt);
                    break;
                case '\n':
                    z12 = b.k(parcel, readInt);
                    break;
                case 11:
                    z13 = b.k(parcel, readInt);
                    break;
                case '\f':
                    z14 = b.k(parcel, readInt);
                    break;
                case '\r':
                    z15 = b.k(parcel, readInt);
                    break;
                case 14:
                    z16 = b.k(parcel, readInt);
                    break;
                case 15:
                    z17 = b.k(parcel, readInt);
                    break;
                case 16:
                    z18 = b.k(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new on(str, i10, i11, z10, i12, i13, onVarArr, z11, z12, z13, z14, z15, z16, z17, z18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ on[] newArray(int i10) {
        return new on[i10];
    }
}

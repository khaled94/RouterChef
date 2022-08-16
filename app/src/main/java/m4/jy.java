package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class jy implements Parcelable.Creator<iy> {
    @Override // android.os.Parcelable.Creator
    public final iy createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j3 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z10 = b.k(parcel, readInt);
                    break;
                case 2:
                    str = b.e(parcel, readInt);
                    break;
                case 3:
                    i10 = b.n(parcel, readInt);
                    break;
                case 4:
                    bArr = b.b(parcel, readInt);
                    break;
                case 5:
                    strArr = b.f(parcel, readInt);
                    break;
                case 6:
                    strArr2 = b.f(parcel, readInt);
                    break;
                case 7:
                    z11 = b.k(parcel, readInt);
                    break;
                case '\b':
                    j3 = b.o(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new iy(z10, str, i10, bArr, strArr, strArr2, z11, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ iy[] newArray(int i10) {
        return new iy[i10];
    }
}

package d4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class b0 implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final k createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        String str2 = null;
        long j3 = 0;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
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
                    j3 = b.o(parcel, readInt);
                    break;
                case 5:
                    j10 = b.o(parcel, readInt);
                    break;
                case 6:
                    str = b.e(parcel, readInt);
                    break;
                case 7:
                    str2 = b.e(parcel, readInt);
                    break;
                case '\b':
                    i13 = b.n(parcel, readInt);
                    break;
                case '\t':
                    i14 = b.n(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new k(i10, i11, i12, j3, j10, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i10) {
        return new k[i10];
    }
}

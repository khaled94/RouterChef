package l3;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final j createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        String str = null;
        float f10 = 0.0f;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    z10 = b.k(parcel, readInt);
                    break;
                case 3:
                    z11 = b.k(parcel, readInt);
                    break;
                case 4:
                    str = b.e(parcel, readInt);
                    break;
                case 5:
                    z12 = b.k(parcel, readInt);
                    break;
                case 6:
                    f10 = b.l(parcel, readInt);
                    break;
                case 7:
                    i10 = b.n(parcel, readInt);
                    break;
                case '\b':
                    z13 = b.k(parcel, readInt);
                    break;
                case '\t':
                    z14 = b.k(parcel, readInt);
                    break;
                case '\n':
                    z15 = b.k(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new j(z10, z11, str, z12, f10, i10, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i10) {
        return new j[i10];
    }
}

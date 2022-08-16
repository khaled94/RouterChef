package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f70 implements Parcelable.Creator<e70> {
    @Override // android.os.Parcelable.Creator
    public final e70 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
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
                    z10 = b.k(parcel, readInt);
                    break;
                case 5:
                    z11 = b.k(parcel, readInt);
                    break;
                case 6:
                    arrayList = b.g(parcel, readInt);
                    break;
                case 7:
                    z12 = b.k(parcel, readInt);
                    break;
                case '\b':
                    z13 = b.k(parcel, readInt);
                    break;
                case '\t':
                    arrayList2 = b.g(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new e70(str, str2, z10, z11, arrayList, z12, z13, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e70[] newArray(int i10) {
        return new e70[i10];
    }
}

package s4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class c1 implements Parcelable.Creator<b1> {
    @Override // android.os.Parcelable.Creator
    public final b1 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        long j3 = 0;
        long j10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j3 = b.o(parcel, readInt);
                    break;
                case 2:
                    j10 = b.o(parcel, readInt);
                    break;
                case 3:
                    z10 = b.k(parcel, readInt);
                    break;
                case 4:
                    str = b.e(parcel, readInt);
                    break;
                case 5:
                    str2 = b.e(parcel, readInt);
                    break;
                case 6:
                    str3 = b.e(parcel, readInt);
                    break;
                case 7:
                    bundle = b.a(parcel, readInt);
                    break;
                case '\b':
                    str4 = b.e(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new b1(j3, j10, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b1[] newArray(int i10) {
        return new b1[i10];
    }
}

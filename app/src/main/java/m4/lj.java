package m4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class lj implements Parcelable.Creator<kj> {
    @Override // android.os.Parcelable.Creator
    public final kj createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        int i10 = 0;
        long j3 = 0;
        long j10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.e(parcel, readInt);
                    break;
                case 3:
                    j3 = b.o(parcel, readInt);
                    break;
                case 4:
                    str2 = b.e(parcel, readInt);
                    break;
                case 5:
                    str3 = b.e(parcel, readInt);
                    break;
                case 6:
                    str4 = b.e(parcel, readInt);
                    break;
                case 7:
                    bundle = b.a(parcel, readInt);
                    break;
                case '\b':
                    z10 = b.k(parcel, readInt);
                    break;
                case '\t':
                    j10 = b.o(parcel, readInt);
                    break;
                case '\n':
                    str5 = b.e(parcel, readInt);
                    break;
                case 11:
                    i10 = b.n(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new kj(str, j3, str2, str3, str4, bundle, z10, j10, str5, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ kj[] newArray(int i10) {
        return new kj[i10];
    }
}

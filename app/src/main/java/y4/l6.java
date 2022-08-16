package y4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l6 implements Parcelable.Creator<k6> {
    @Override // android.os.Parcelable.Creator
    public final k6 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        long j3 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = "";
        long j14 = -2147483648L;
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
                    str3 = b.e(parcel, readInt);
                    break;
                case 5:
                    str4 = b.e(parcel, readInt);
                    break;
                case 6:
                    j3 = b.o(parcel, readInt);
                    break;
                case 7:
                    j10 = b.o(parcel, readInt);
                    break;
                case '\b':
                    str5 = b.e(parcel, readInt);
                    break;
                case '\t':
                    z10 = b.k(parcel, readInt);
                    break;
                case '\n':
                    z12 = b.k(parcel, readInt);
                    break;
                case 11:
                    j14 = b.o(parcel, readInt);
                    break;
                case '\f':
                    str6 = b.e(parcel, readInt);
                    break;
                case '\r':
                    j11 = b.o(parcel, readInt);
                    break;
                case 14:
                    j12 = b.o(parcel, readInt);
                    break;
                case 15:
                    i10 = b.n(parcel, readInt);
                    break;
                case 16:
                    z11 = b.k(parcel, readInt);
                    break;
                case 17:
                case 20:
                default:
                    b.q(parcel, readInt);
                    break;
                case 18:
                    z13 = b.k(parcel, readInt);
                    break;
                case 19:
                    str7 = b.e(parcel, readInt);
                    break;
                case 21:
                    int p = b.p(parcel, readInt);
                    if (p != 0) {
                        b.s(parcel, p, 4);
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case 22:
                    j13 = b.o(parcel, readInt);
                    break;
                case 23:
                    arrayList = b.g(parcel, readInt);
                    break;
                case 24:
                    str8 = b.e(parcel, readInt);
                    break;
                case 25:
                    str9 = b.e(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new k6(str, str2, str3, str4, j3, j10, str5, z10, z12, j14, str6, j11, j12, i10, z11, z13, str7, bool, j13, arrayList, str8, str9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ k6[] newArray(int i10) {
        return new k6[i10];
    }
}

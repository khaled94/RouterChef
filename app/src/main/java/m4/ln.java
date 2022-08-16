package m4;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ln implements Parcelable.Creator<jn> {
    @Override // android.os.Parcelable.Creator
    public final jn createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        lr lrVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        an anVar = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j3 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.n(parcel, readInt);
                    break;
                case 2:
                    j3 = b.o(parcel, readInt);
                    break;
                case 3:
                    bundle = b.a(parcel, readInt);
                    break;
                case 4:
                    i11 = b.n(parcel, readInt);
                    break;
                case 5:
                    arrayList = b.g(parcel, readInt);
                    break;
                case 6:
                    z10 = b.k(parcel, readInt);
                    break;
                case 7:
                    i12 = b.n(parcel, readInt);
                    break;
                case '\b':
                    z11 = b.k(parcel, readInt);
                    break;
                case '\t':
                    str = b.e(parcel, readInt);
                    break;
                case '\n':
                    lrVar = (lr) b.d(parcel, readInt, lr.CREATOR);
                    break;
                case 11:
                    location = (Location) b.d(parcel, readInt, Location.CREATOR);
                    break;
                case '\f':
                    str2 = b.e(parcel, readInt);
                    break;
                case '\r':
                    bundle2 = b.a(parcel, readInt);
                    break;
                case 14:
                    bundle3 = b.a(parcel, readInt);
                    break;
                case 15:
                    arrayList2 = b.g(parcel, readInt);
                    break;
                case 16:
                    str3 = b.e(parcel, readInt);
                    break;
                case 17:
                    str4 = b.e(parcel, readInt);
                    break;
                case 18:
                    z12 = b.k(parcel, readInt);
                    break;
                case 19:
                    anVar = (an) b.d(parcel, readInt, an.CREATOR);
                    break;
                case 20:
                    i13 = b.n(parcel, readInt);
                    break;
                case 21:
                    str5 = b.e(parcel, readInt);
                    break;
                case 22:
                    arrayList3 = b.g(parcel, readInt);
                    break;
                case 23:
                    i14 = b.n(parcel, readInt);
                    break;
                case 24:
                    str6 = b.e(parcel, readInt);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new jn(i10, j3, bundle, i11, arrayList, z10, i12, z11, str, lrVar, location, str2, bundle2, bundle3, arrayList2, str3, str4, z12, anVar, i13, str5, arrayList3, i14, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ jn[] newArray(int i10) {
        return new jn[i10];
    }
}

package y4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        long j3 = 0;
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        d6 d6Var = null;
        String str3 = null;
        p pVar = null;
        p pVar2 = null;
        p pVar3 = null;
        boolean z10 = false;
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
                    d6Var = (d6) b.d(parcel, readInt, d6.CREATOR);
                    break;
                case 5:
                    j3 = b.o(parcel, readInt);
                    break;
                case 6:
                    z10 = b.k(parcel, readInt);
                    break;
                case 7:
                    str3 = b.e(parcel, readInt);
                    break;
                case '\b':
                    pVar = (p) b.d(parcel, readInt, p.CREATOR);
                    break;
                case '\t':
                    j10 = b.o(parcel, readInt);
                    break;
                case '\n':
                    pVar2 = (p) b.d(parcel, readInt, p.CREATOR);
                    break;
                case 11:
                    j11 = b.o(parcel, readInt);
                    break;
                case '\f':
                    pVar3 = (p) b.d(parcel, readInt, p.CREATOR);
                    break;
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new b(str, str2, d6Var, j3, z10, str3, pVar, j10, pVar2, j11, pVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i10) {
        return new b[i10];
    }
}

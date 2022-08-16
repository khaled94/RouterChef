package y4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;
import m2.a;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator<p> {
    public static void a(p pVar, Parcel parcel, int i10) {
        int q10 = a.q(parcel, 20293);
        a.l(parcel, 2, pVar.f20634s);
        a.k(parcel, 3, pVar.f20635t, i10);
        a.l(parcel, 4, pVar.f20636u);
        a.j(parcel, 5, pVar.f20637v);
        a.u(parcel, q10);
    }

    @Override // android.os.Parcelable.Creator
    public final p createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        n nVar = null;
        String str2 = null;
        long j3 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 == 3) {
                nVar = (n) b.d(parcel, readInt, n.CREATOR);
            } else if (c10 == 4) {
                str2 = b.e(parcel, readInt);
            } else if (c10 != 5) {
                b.q(parcel, readInt);
            } else {
                j3 = b.o(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new p(str, nVar, str2, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p[] newArray(int i10) {
        return new p[i10];
    }
}

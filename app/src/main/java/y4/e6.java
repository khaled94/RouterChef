package y4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;
import m2.a;

/* loaded from: classes.dex */
public final class e6 implements Parcelable.Creator<d6> {
    public static void a(d6 d6Var, Parcel parcel) {
        int q10 = a.q(parcel, 20293);
        a.g(parcel, 1, d6Var.f20362s);
        a.l(parcel, 2, d6Var.f20363t);
        a.j(parcel, 3, d6Var.f20364u);
        Long l10 = d6Var.f20365v;
        if (l10 != null) {
            parcel.writeInt(524292);
            parcel.writeLong(l10.longValue());
        }
        a.l(parcel, 6, d6Var.f20366w);
        a.l(parcel, 7, d6Var.f20367x);
        Double d5 = d6Var.y;
        if (d5 != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d5.doubleValue());
        }
        a.u(parcel, q10);
    }

    @Override // android.os.Parcelable.Creator
    public final d6 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d5 = null;
        int i10 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.n(parcel, readInt);
                    break;
                case 2:
                    str = b.e(parcel, readInt);
                    break;
                case 3:
                    j3 = b.o(parcel, readInt);
                    break;
                case 4:
                    int p = b.p(parcel, readInt);
                    if (p != 0) {
                        b.s(parcel, p, 8);
                        l10 = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l10 = null;
                        break;
                    }
                case 5:
                    int p10 = b.p(parcel, readInt);
                    if (p10 != 0) {
                        b.s(parcel, p10, 4);
                        f10 = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f10 = null;
                        break;
                    }
                case 6:
                    str2 = b.e(parcel, readInt);
                    break;
                case 7:
                    str3 = b.e(parcel, readInt);
                    break;
                case '\b':
                    int p11 = b.p(parcel, readInt);
                    if (p11 != 0) {
                        b.s(parcel, p11, 8);
                        d5 = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d5 = null;
                        break;
                    }
                default:
                    b.q(parcel, readInt);
                    break;
            }
        }
        b.j(parcel, r10);
        return new d6(i10, str, j3, l10, f10, str2, str3, d5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d6[] newArray(int i10) {
        return new d6[i10];
    }
}

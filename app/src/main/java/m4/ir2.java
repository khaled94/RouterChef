package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ir2 extends er2 {
    public static final Parcelable.Creator<ir2> CREATOR = new hr2();

    /* renamed from: t */
    public final int f9733t;

    /* renamed from: u */
    public final int f9734u;

    /* renamed from: v */
    public final int f9735v;

    /* renamed from: w */
    public final int[] f9736w;

    /* renamed from: x */
    public final int[] f9737x;

    public ir2(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f9733t = i10;
        this.f9734u = i11;
        this.f9735v = i12;
        this.f9736w = iArr;
        this.f9737x = iArr2;
    }

    public ir2(Parcel parcel) {
        super("MLLT");
        this.f9733t = parcel.readInt();
        this.f9734u = parcel.readInt();
        this.f9735v = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = ls1.f10971a;
        this.f9736w = createIntArray;
        this.f9737x = parcel.createIntArray();
    }

    @Override // m4.er2, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ir2.class == obj.getClass()) {
            ir2 ir2Var = (ir2) obj;
            if (this.f9733t == ir2Var.f9733t && this.f9734u == ir2Var.f9734u && this.f9735v == ir2Var.f9735v && Arrays.equals(this.f9736w, ir2Var.f9736w) && Arrays.equals(this.f9737x, ir2Var.f9737x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f9736w);
        return Arrays.hashCode(this.f9737x) + ((hashCode + ((((((this.f9733t + 527) * 31) + this.f9734u) * 31) + this.f9735v) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9733t);
        parcel.writeInt(this.f9734u);
        parcel.writeInt(this.f9735v);
        parcel.writeIntArray(this.f9736w);
        parcel.writeIntArray(this.f9737x);
    }
}

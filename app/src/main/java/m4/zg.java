package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import z3.p;

/* loaded from: classes.dex */
public final class zg implements Parcelable {
    public static final Parcelable.Creator<zg> CREATOR = new yg();

    /* renamed from: s */
    public final int f16194s;

    /* renamed from: t */
    public final int f16195t;

    /* renamed from: u */
    public final int f16196u;

    /* renamed from: v */
    public final byte[] f16197v;

    /* renamed from: w */
    public int f16198w;

    public zg(int i10, int i11, int i12, byte[] bArr) {
        this.f16194s = i10;
        this.f16195t = i11;
        this.f16196u = i12;
        this.f16197v = bArr;
    }

    public zg(Parcel parcel) {
        this.f16194s = parcel.readInt();
        this.f16195t = parcel.readInt();
        this.f16196u = parcel.readInt();
        this.f16197v = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zg.class == obj.getClass()) {
            zg zgVar = (zg) obj;
            if (this.f16194s == zgVar.f16194s && this.f16195t == zgVar.f16195t && this.f16196u == zgVar.f16196u && Arrays.equals(this.f16197v, zgVar.f16197v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f16198w;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f16197v) + ((((((this.f16194s + 527) * 31) + this.f16195t) * 31) + this.f16196u) * 31);
            this.f16198w = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.f16194s;
        int i11 = this.f16195t;
        int i12 = this.f16196u;
        boolean z10 = this.f16197v != null;
        StringBuilder a10 = p.a(55, "ColorInfo(", i10, ", ", i11);
        a10.append(", ");
        a10.append(i12);
        a10.append(", ");
        a10.append(z10);
        a10.append(")");
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16194s);
        parcel.writeInt(this.f16195t);
        parcel.writeInt(this.f16196u);
        parcel.writeInt(this.f16197v != null ? 1 : 0);
        byte[] bArr = this.f16197v;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}

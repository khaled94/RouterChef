package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;
import i0.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jq2 implements ym0 {
    public static final Parcelable.Creator<jq2> CREATOR = new iq2();

    /* renamed from: s */
    public final int f10167s;

    /* renamed from: t */
    public final String f10168t;

    /* renamed from: u */
    public final String f10169u;

    /* renamed from: v */
    public final int f10170v;

    /* renamed from: w */
    public final int f10171w;

    /* renamed from: x */
    public final int f10172x;
    public final int y;

    /* renamed from: z */
    public final byte[] f10173z;

    public jq2(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f10167s = i10;
        this.f10168t = str;
        this.f10169u = str2;
        this.f10170v = i11;
        this.f10171w = i12;
        this.f10172x = i13;
        this.y = i14;
        this.f10173z = bArr;
    }

    public jq2(Parcel parcel) {
        this.f10167s = parcel.readInt();
        String readString = parcel.readString();
        int i10 = ls1.f10971a;
        this.f10168t = readString;
        this.f10169u = parcel.readString();
        this.f10170v = parcel.readInt();
        this.f10171w = parcel.readInt();
        this.f10172x = parcel.readInt();
        this.y = parcel.readInt();
        this.f10173z = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jq2.class == obj.getClass()) {
            jq2 jq2Var = (jq2) obj;
            if (this.f10167s == jq2Var.f10167s && this.f10168t.equals(jq2Var.f10168t) && this.f10169u.equals(jq2Var.f10169u) && this.f10170v == jq2Var.f10170v && this.f10171w == jq2Var.f10171w && this.f10172x == jq2Var.f10172x && this.y == jq2Var.y && Arrays.equals(this.f10173z, jq2Var.f10173z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a10 = a.a(this.f10168t, (this.f10167s + 527) * 31, 31);
        return Arrays.hashCode(this.f10173z) + ((((((((a.a(this.f10169u, a10, 31) + this.f10170v) * 31) + this.f10171w) * 31) + this.f10172x) * 31) + this.y) * 31);
    }

    @Override // m4.ym0
    public final void p(sk skVar) {
        skVar.a(this.f10173z, this.f10167s);
    }

    public final String toString() {
        String str = this.f10168t;
        String str2 = this.f10169u;
        return b.a(new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length()), "Picture: mimeType=", str, ", description=", str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10167s);
        parcel.writeString(this.f10168t);
        parcel.writeString(this.f10169u);
        parcel.writeInt(this.f10170v);
        parcel.writeInt(this.f10171w);
        parcel.writeInt(this.f10172x);
        parcel.writeInt(this.y);
        parcel.writeByteArray(this.f10173z);
    }
}

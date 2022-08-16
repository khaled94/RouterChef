package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b1;

/* loaded from: classes.dex */
public final class oq2 implements ym0 {
    public static final Parcelable.Creator<oq2> CREATOR = new nq2();

    /* renamed from: s */
    public final int f12271s;

    /* renamed from: t */
    public final String f12272t;

    /* renamed from: u */
    public final String f12273u;

    /* renamed from: v */
    public final String f12274v;

    /* renamed from: w */
    public final boolean f12275w;

    /* renamed from: x */
    public final int f12276x;

    public oq2(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        r01.f(z11);
        this.f12271s = i10;
        this.f12272t = str;
        this.f12273u = str2;
        this.f12274v = str3;
        this.f12275w = z10;
        this.f12276x = i11;
    }

    public oq2(Parcel parcel) {
        this.f12271s = parcel.readInt();
        this.f12272t = parcel.readString();
        this.f12273u = parcel.readString();
        this.f12274v = parcel.readString();
        int i10 = ls1.f10971a;
        this.f12275w = parcel.readInt() != 0;
        this.f12276x = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oq2.class == obj.getClass()) {
            oq2 oq2Var = (oq2) obj;
            if (this.f12271s == oq2Var.f12271s && ls1.f(this.f12272t, oq2Var.f12272t) && ls1.f(this.f12273u, oq2Var.f12273u) && ls1.f(this.f12274v, oq2Var.f12274v) && this.f12275w == oq2Var.f12275w && this.f12276x == oq2Var.f12276x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f12271s + 527) * 31;
        String str = this.f12272t;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12273u;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12274v;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return ((((hashCode2 + i11) * 31) + (this.f12275w ? 1 : 0)) * 31) + this.f12276x;
    }

    @Override // m4.ym0
    public final /* synthetic */ void p(sk skVar) {
    }

    public final String toString() {
        String str = this.f12273u;
        String str2 = this.f12272t;
        int i10 = this.f12271s;
        int i11 = this.f12276x;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        b1.b(sb, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        sb.append("\", bitrate=");
        sb.append(i10);
        sb.append(", metadataInterval=");
        sb.append(i11);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12271s);
        parcel.writeString(this.f12272t);
        parcel.writeString(this.f12273u);
        parcel.writeString(this.f12274v);
        boolean z10 = this.f12275w;
        int i11 = ls1.f10971a;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.f12276x);
    }
}

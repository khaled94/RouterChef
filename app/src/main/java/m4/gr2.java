package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.d;
import androidx.fragment.app.b1;

/* loaded from: classes.dex */
public final class gr2 extends er2 {
    public static final Parcelable.Creator<gr2> CREATOR = new fr2();

    /* renamed from: t */
    public final String f9010t;

    /* renamed from: u */
    public final String f9011u;

    /* renamed from: v */
    public final String f9012v;

    public gr2(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i10 = ls1.f10971a;
        this.f9010t = readString;
        this.f9011u = parcel.readString();
        this.f9012v = parcel.readString();
    }

    public gr2(String str, String str2, String str3) {
        super("----");
        this.f9010t = str;
        this.f9011u = str2;
        this.f9012v = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gr2.class == obj.getClass()) {
            gr2 gr2Var = (gr2) obj;
            if (ls1.f(this.f9011u, gr2Var.f9011u) && ls1.f(this.f9010t, gr2Var.f9010t) && ls1.f(this.f9012v, gr2Var.f9012v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9010t;
        int i10 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f9011u;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9012v;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    @Override // m4.er2
    public final String toString() {
        String str = this.f8048s;
        String str2 = this.f9010t;
        String str3 = this.f9011u;
        StringBuilder sb = new StringBuilder(d.a(String.valueOf(str).length(), 23, String.valueOf(str2).length(), String.valueOf(str3).length()));
        b1.b(sb, str, ": domain=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8048s);
        parcel.writeString(this.f9010t);
        parcel.writeString(this.f9012v);
    }
}

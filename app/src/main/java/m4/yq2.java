package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.d;
import androidx.fragment.app.b1;

/* loaded from: classes.dex */
public final class yq2 extends er2 {
    public static final Parcelable.Creator<yq2> CREATOR = new xq2();

    /* renamed from: t */
    public final String f15888t;

    /* renamed from: u */
    public final String f15889u;

    /* renamed from: v */
    public final String f15890v;

    public yq2(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i10 = ls1.f10971a;
        this.f15888t = readString;
        this.f15889u = parcel.readString();
        this.f15890v = parcel.readString();
    }

    public yq2(String str, String str2, String str3) {
        super("COMM");
        this.f15888t = str;
        this.f15889u = str2;
        this.f15890v = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yq2.class == obj.getClass()) {
            yq2 yq2Var = (yq2) obj;
            if (ls1.f(this.f15889u, yq2Var.f15889u) && ls1.f(this.f15888t, yq2Var.f15888t) && ls1.f(this.f15890v, yq2Var.f15890v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15888t;
        int i10 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f15889u;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15890v;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    @Override // m4.er2
    public final String toString() {
        String str = this.f8048s;
        String str2 = this.f15888t;
        String str3 = this.f15889u;
        StringBuilder sb = new StringBuilder(d.a(String.valueOf(str).length(), 25, String.valueOf(str2).length(), String.valueOf(str3).length()));
        b1.b(sb, str, ": language=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8048s);
        parcel.writeString(this.f15888t);
        parcel.writeString(this.f15890v);
    }
}

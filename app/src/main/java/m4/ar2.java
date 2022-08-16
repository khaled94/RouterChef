package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;
import androidx.fragment.app.b1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ar2 extends er2 {
    public static final Parcelable.Creator<ar2> CREATOR = new zq2();

    /* renamed from: t */
    public final String f6246t;

    /* renamed from: u */
    public final String f6247u;

    /* renamed from: v */
    public final String f6248v;

    /* renamed from: w */
    public final byte[] f6249w;

    public ar2(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i10 = ls1.f10971a;
        this.f6246t = readString;
        this.f6247u = parcel.readString();
        this.f6248v = parcel.readString();
        this.f6249w = parcel.createByteArray();
    }

    public ar2(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f6246t = str;
        this.f6247u = str2;
        this.f6248v = str3;
        this.f6249w = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ar2.class == obj.getClass()) {
            ar2 ar2Var = (ar2) obj;
            if (ls1.f(this.f6246t, ar2Var.f6246t) && ls1.f(this.f6247u, ar2Var.f6247u) && ls1.f(this.f6248v, ar2Var.f6248v) && Arrays.equals(this.f6249w, ar2Var.f6249w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6246t;
        int i10 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f6247u;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6248v;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return Arrays.hashCode(this.f6249w) + ((hashCode2 + i10) * 31);
    }

    @Override // m4.er2
    public final String toString() {
        String str = this.f8048s;
        String str2 = this.f6246t;
        String str3 = this.f6247u;
        String str4 = this.f6248v;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 36 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        b1.b(sb, str, ": mimeType=", str2, ", filename=");
        return a.b(sb, str3, ", description=", str4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6246t);
        parcel.writeString(this.f6247u);
        parcel.writeString(this.f6248v);
        parcel.writeByteArray(this.f6249w);
    }
}

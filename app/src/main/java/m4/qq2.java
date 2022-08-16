package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.d;
import androidx.fragment.app.b1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qq2 extends er2 {
    public static final Parcelable.Creator<qq2> CREATOR = new pq2();

    /* renamed from: t */
    public final String f12977t;

    /* renamed from: u */
    public final String f12978u;

    /* renamed from: v */
    public final int f12979v;

    /* renamed from: w */
    public final byte[] f12980w;

    public qq2(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = ls1.f10971a;
        this.f12977t = readString;
        this.f12978u = parcel.readString();
        this.f12979v = parcel.readInt();
        this.f12980w = parcel.createByteArray();
    }

    public qq2(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f12977t = str;
        this.f12978u = str2;
        this.f12979v = i10;
        this.f12980w = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qq2.class == obj.getClass()) {
            qq2 qq2Var = (qq2) obj;
            if (this.f12979v == qq2Var.f12979v && ls1.f(this.f12977t, qq2Var.f12977t) && ls1.f(this.f12978u, qq2Var.f12978u) && Arrays.equals(this.f12980w, qq2Var.f12980w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f12979v + 527) * 31;
        String str = this.f12977t;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12978u;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f12980w) + ((hashCode + i11) * 31);
    }

    @Override // m4.er2, m4.ym0
    public final void p(sk skVar) {
        skVar.a(this.f12980w, this.f12979v);
    }

    @Override // m4.er2
    public final String toString() {
        String str = this.f8048s;
        String str2 = this.f12977t;
        String str3 = this.f12978u;
        StringBuilder sb = new StringBuilder(d.a(String.valueOf(str).length(), 25, String.valueOf(str2).length(), String.valueOf(str3).length()));
        b1.b(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12977t);
        parcel.writeString(this.f12978u);
        parcel.writeInt(this.f12979v);
        parcel.writeByteArray(this.f12980w);
    }
}

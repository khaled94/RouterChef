package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements ym0 {
    public static final Parcelable.Creator<g> CREATOR = new f();

    /* renamed from: s */
    public final String f8681s;

    /* renamed from: t */
    public final byte[] f8682t;

    /* renamed from: u */
    public final int f8683u;

    /* renamed from: v */
    public final int f8684v;

    public g(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = ls1.f10971a;
        this.f8681s = readString;
        this.f8682t = parcel.createByteArray();
        this.f8683u = parcel.readInt();
        this.f8684v = parcel.readInt();
    }

    public g(String str, byte[] bArr, int i10, int i11) {
        this.f8681s = str;
        this.f8682t = bArr;
        this.f8683u = i10;
        this.f8684v = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f8681s.equals(gVar.f8681s) && Arrays.equals(this.f8682t, gVar.f8682t) && this.f8683u == gVar.f8683u && this.f8684v == gVar.f8684v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f8682t) + a.a(this.f8681s, 527, 31)) * 31) + this.f8683u) * 31) + this.f8684v;
    }

    @Override // m4.ym0
    public final /* synthetic */ void p(sk skVar) {
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8681s);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8681s);
        parcel.writeByteArray(this.f8682t);
        parcel.writeInt(this.f8683u);
        parcel.writeInt(this.f8684v);
    }
}

package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends er2 {
    public static final Parcelable.Creator<a> CREATOR = new jr2();

    /* renamed from: t */
    public final String f5989t;

    /* renamed from: u */
    public final byte[] f5990u;

    public a(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = ls1.f10971a;
        this.f5989t = readString;
        this.f5990u = parcel.createByteArray();
    }

    public a(String str, byte[] bArr) {
        super("PRIV");
        this.f5989t = str;
        this.f5990u = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (ls1.f(this.f5989t, aVar.f5989t) && Arrays.equals(this.f5990u, aVar.f5990u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5989t;
        return Arrays.hashCode(this.f5990u) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // m4.er2
    public final String toString() {
        String str = this.f8048s;
        String str2 = this.f5989t;
        return androidx.fragment.app.a.b(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()), str, ": owner=", str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5989t);
        parcel.writeByteArray(this.f5990u);
    }
}

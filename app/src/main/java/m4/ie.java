package m4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ie extends je {
    public static final Parcelable.Creator<ie> CREATOR = new he();

    /* renamed from: t */
    public final String f9611t;

    /* renamed from: u */
    public final String f9612u;

    /* renamed from: v */
    public final String f9613v;

    public ie(Parcel parcel) {
        super("COMM");
        this.f9611t = parcel.readString();
        this.f9612u = parcel.readString();
        this.f9613v = parcel.readString();
    }

    public ie(String str, String str2) {
        super("COMM");
        this.f9611t = "und";
        this.f9612u = str;
        this.f9613v = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ie.class == obj.getClass()) {
            ie ieVar = (ie) obj;
            if (wg.h(this.f9612u, ieVar.f9612u) && wg.h(this.f9611t, ieVar.f9611t) && wg.h(this.f9613v, ieVar.f9613v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9611t;
        int i10 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f9612u;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9613v;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9933s);
        parcel.writeString(this.f9611t);
        parcel.writeString(this.f9613v);
    }
}

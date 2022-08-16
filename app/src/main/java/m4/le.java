package m4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;

/* loaded from: classes.dex */
public final class le extends je {
    public static final Parcelable.Creator<le> CREATOR = new ke();

    /* renamed from: t */
    public final String f10735t;

    /* renamed from: u */
    public final String f10736u;

    public le(Parcel parcel) {
        super(parcel.readString());
        this.f10735t = parcel.readString();
        this.f10736u = parcel.readString();
    }

    public le(String str, String str2) {
        super(str);
        this.f10735t = null;
        this.f10736u = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && le.class == obj.getClass()) {
            le leVar = (le) obj;
            if (this.f9933s.equals(leVar.f9933s) && wg.h(this.f10735t, leVar.f10735t) && wg.h(this.f10736u, leVar.f10736u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a10 = a.a(this.f9933s, 527, 31);
        String str = this.f10735t;
        int i10 = 0;
        int hashCode = (a10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10736u;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9933s);
        parcel.writeString(this.f10735t);
        parcel.writeString(this.f10736u);
    }
}

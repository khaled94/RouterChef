package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ge extends je {
    public static final Parcelable.Creator<ge> CREATOR = new fe();

    /* renamed from: t */
    public final String f8835t;

    /* renamed from: u */
    public final String f8836u;

    /* renamed from: v */
    public final int f8837v;

    /* renamed from: w */
    public final byte[] f8838w;

    public ge(Parcel parcel) {
        super("APIC");
        this.f8835t = parcel.readString();
        this.f8836u = parcel.readString();
        this.f8837v = parcel.readInt();
        this.f8838w = parcel.createByteArray();
    }

    public ge(String str, byte[] bArr) {
        super("APIC");
        this.f8835t = str;
        this.f8836u = null;
        this.f8837v = 3;
        this.f8838w = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ge.class == obj.getClass()) {
            ge geVar = (ge) obj;
            if (this.f8837v == geVar.f8837v && wg.h(this.f8835t, geVar.f8835t) && wg.h(this.f8836u, geVar.f8836u) && Arrays.equals(this.f8838w, geVar.f8838w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f8837v + 527) * 31;
        String str = this.f8835t;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8836u;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f8838w) + ((hashCode + i11) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8835t);
        parcel.writeString(this.f8836u);
        parcel.writeInt(this.f8837v);
        parcel.writeByteArray(this.f8838w);
    }
}

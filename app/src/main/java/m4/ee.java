package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class ee implements Parcelable {
    public static final Parcelable.Creator<ee> CREATOR = new ce();

    /* renamed from: s */
    public final de[] f7803s;

    public ee(Parcel parcel) {
        this.f7803s = new de[parcel.readInt()];
        int i10 = 0;
        while (true) {
            de[] deVarArr = this.f7803s;
            if (i10 < deVarArr.length) {
                deVarArr[i10] = (de) parcel.readParcelable(de.class.getClassLoader());
                i10++;
            } else {
                return;
            }
        }
    }

    public ee(List<? extends de> list) {
        de[] deVarArr = new de[list.size()];
        this.f7803s = deVarArr;
        list.toArray(deVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ee.class == obj.getClass()) {
            return Arrays.equals(this.f7803s, ((ee) obj).f7803s);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7803s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7803s.length);
        for (de deVar : this.f7803s) {
            parcel.writeParcelable(deVar, 0);
        }
    }
}

package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class fc implements Comparator<ec>, Parcelable {
    public static final Parcelable.Creator<fc> CREATOR = new cc();

    /* renamed from: s */
    public final ec[] f8394s;

    /* renamed from: t */
    public int f8395t;

    /* renamed from: u */
    public final int f8396u;

    public fc(Parcel parcel) {
        ec[] ecVarArr = (ec[]) parcel.createTypedArray(ec.CREATOR);
        this.f8394s = ecVarArr;
        this.f8396u = ecVarArr.length;
    }

    public fc(boolean z10, ec... ecVarArr) {
        ecVarArr = z10 ? (ec[]) ecVarArr.clone() : ecVarArr;
        Arrays.sort(ecVarArr, this);
        int i10 = 1;
        while (true) {
            int length = ecVarArr.length;
            if (i10 >= length) {
                this.f8394s = ecVarArr;
                this.f8396u = length;
                return;
            } else if (ecVarArr[i10 - 1].f7771t.equals(ecVarArr[i10].f7771t)) {
                throw new IllegalArgumentException("Duplicate data for uuid: ".concat(String.valueOf(ecVarArr[i10].f7771t)));
            } else {
                i10++;
            }
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(ec ecVar, ec ecVar2) {
        ec ecVar3 = ecVar;
        ec ecVar4 = ecVar2;
        UUID uuid = ia.f9569b;
        if (uuid.equals(ecVar3.f7771t)) {
            return !uuid.equals(ecVar4.f7771t) ? 1 : 0;
        }
        return ecVar3.f7771t.compareTo(ecVar4.f7771t);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fc.class == obj.getClass()) {
            return Arrays.equals(this.f8394s, ((fc) obj).f8394s);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f8395t;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f8394s);
            this.f8395t = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedArray(this.f8394s, 0);
    }
}

package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class il2 implements Comparator<qk2>, Parcelable {
    public static final Parcelable.Creator<il2> CREATOR = new cj2();

    /* renamed from: s */
    public final qk2[] f9691s;

    /* renamed from: t */
    public int f9692t;

    /* renamed from: u */
    public final String f9693u;

    public il2(Parcel parcel) {
        this.f9693u = parcel.readString();
        qk2[] qk2VarArr = (qk2[]) parcel.createTypedArray(qk2.CREATOR);
        int i10 = ls1.f10971a;
        this.f9691s = qk2VarArr;
        int length = qk2VarArr.length;
    }

    public il2(String str, boolean z10, qk2... qk2VarArr) {
        this.f9693u = str;
        qk2VarArr = z10 ? (qk2[]) qk2VarArr.clone() : qk2VarArr;
        this.f9691s = qk2VarArr;
        int length = qk2VarArr.length;
        Arrays.sort(qk2VarArr, this);
    }

    public final il2 a(String str) {
        return ls1.f(this.f9693u, str) ? this : new il2(str, false, this.f9691s);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(qk2 qk2Var, qk2 qk2Var2) {
        qk2 qk2Var3 = qk2Var;
        qk2 qk2Var4 = qk2Var2;
        UUID uuid = xf2.f15321a;
        return uuid.equals(qk2Var3.f12906t) ? !uuid.equals(qk2Var4.f12906t) ? 1 : 0 : qk2Var3.f12906t.compareTo(qk2Var4.f12906t);
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
        if (obj != null && il2.class == obj.getClass()) {
            il2 il2Var = (il2) obj;
            if (ls1.f(this.f9693u, il2Var.f9693u) && Arrays.equals(this.f9691s, il2Var.f9691s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f9692t;
        if (i10 == 0) {
            String str = this.f9693u;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f9691s);
            this.f9692t = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9693u);
        parcel.writeTypedArray(this.f9691s, 0);
    }
}

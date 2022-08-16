package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class ln0 implements Parcelable {
    public static final Parcelable.Creator<ln0> CREATOR = new em0();

    /* renamed from: s */
    public final ym0[] f10943s;

    public ln0(Parcel parcel) {
        this.f10943s = new ym0[parcel.readInt()];
        int i10 = 0;
        while (true) {
            ym0[] ym0VarArr = this.f10943s;
            if (i10 < ym0VarArr.length) {
                ym0VarArr[i10] = (ym0) parcel.readParcelable(ym0.class.getClassLoader());
                i10++;
            } else {
                return;
            }
        }
    }

    public ln0(List<? extends ym0> list) {
        this.f10943s = (ym0[]) list.toArray(new ym0[0]);
    }

    public ln0(ym0... ym0VarArr) {
        this.f10943s = ym0VarArr;
    }

    public final ln0 a(ym0... ym0VarArr) {
        if (ym0VarArr.length == 0) {
            return this;
        }
        ym0[] ym0VarArr2 = this.f10943s;
        int i10 = ls1.f10971a;
        int length = ym0VarArr2.length;
        int length2 = ym0VarArr.length;
        Object[] copyOf = Arrays.copyOf(ym0VarArr2, length + length2);
        System.arraycopy(ym0VarArr, 0, copyOf, length, length2);
        return new ln0((ym0[]) copyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ln0.class == obj.getClass()) {
            return Arrays.equals(this.f10943s, ((ln0) obj).f10943s);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10943s);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f10943s));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10943s.length);
        for (ym0 ym0Var : this.f10943s) {
            parcel.writeParcelable(ym0Var, 0);
        }
    }
}

package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class wq2 extends er2 {
    public static final Parcelable.Creator<wq2> CREATOR = new vq2();

    /* renamed from: t */
    public final String f15091t;

    /* renamed from: u */
    public final boolean f15092u;

    /* renamed from: v */
    public final boolean f15093v;

    /* renamed from: w */
    public final String[] f15094w;

    /* renamed from: x */
    public final er2[] f15095x;

    public wq2(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = ls1.f10971a;
        this.f15091t = readString;
        boolean z10 = true;
        this.f15092u = parcel.readByte() != 0;
        this.f15093v = parcel.readByte() == 0 ? false : z10;
        this.f15094w = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f15095x = new er2[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f15095x[i11] = (er2) parcel.readParcelable(er2.class.getClassLoader());
        }
    }

    public wq2(String str, boolean z10, boolean z11, String[] strArr, er2[] er2VarArr) {
        super("CTOC");
        this.f15091t = str;
        this.f15092u = z10;
        this.f15093v = z11;
        this.f15094w = strArr;
        this.f15095x = er2VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wq2.class == obj.getClass()) {
            wq2 wq2Var = (wq2) obj;
            if (this.f15092u == wq2Var.f15092u && this.f15093v == wq2Var.f15093v && ls1.f(this.f15091t, wq2Var.f15091t) && Arrays.equals(this.f15094w, wq2Var.f15094w) && Arrays.equals(this.f15095x, wq2Var.f15095x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((((this.f15092u ? 1 : 0) + 527) * 31) + (this.f15093v ? 1 : 0)) * 31;
        String str = this.f15091t;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15091t);
        parcel.writeByte(this.f15092u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15093v ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f15094w);
        parcel.writeInt(this.f15095x.length);
        for (er2 er2Var : this.f15095x) {
            parcel.writeParcelable(er2Var, 0);
        }
    }
}

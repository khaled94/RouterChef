package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class uq2 extends er2 {
    public static final Parcelable.Creator<uq2> CREATOR = new tq2();

    /* renamed from: t */
    public final String f14479t;

    /* renamed from: u */
    public final int f14480u;

    /* renamed from: v */
    public final int f14481v;

    /* renamed from: w */
    public final long f14482w;

    /* renamed from: x */
    public final long f14483x;
    public final er2[] y;

    public uq2(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = ls1.f10971a;
        this.f14479t = readString;
        this.f14480u = parcel.readInt();
        this.f14481v = parcel.readInt();
        this.f14482w = parcel.readLong();
        this.f14483x = parcel.readLong();
        int readInt = parcel.readInt();
        this.y = new er2[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.y[i11] = (er2) parcel.readParcelable(er2.class.getClassLoader());
        }
    }

    public uq2(String str, int i10, int i11, long j3, long j10, er2[] er2VarArr) {
        super("CHAP");
        this.f14479t = str;
        this.f14480u = i10;
        this.f14481v = i11;
        this.f14482w = j3;
        this.f14483x = j10;
        this.y = er2VarArr;
    }

    @Override // m4.er2, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uq2.class == obj.getClass()) {
            uq2 uq2Var = (uq2) obj;
            if (this.f14480u == uq2Var.f14480u && this.f14481v == uq2Var.f14481v && this.f14482w == uq2Var.f14482w && this.f14483x == uq2Var.f14483x && ls1.f(this.f14479t, uq2Var.f14479t) && Arrays.equals(this.y, uq2Var.y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((this.f14480u + 527) * 31) + this.f14481v) * 31) + ((int) this.f14482w)) * 31) + ((int) this.f14483x)) * 31;
        String str = this.f14479t;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14479t);
        parcel.writeInt(this.f14480u);
        parcel.writeInt(this.f14481v);
        parcel.writeLong(this.f14482w);
        parcel.writeLong(this.f14483x);
        parcel.writeInt(this.y.length);
        for (er2 er2Var : this.y) {
            parcel.writeParcelable(er2Var, 0);
        }
    }
}

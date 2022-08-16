package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hq2 implements ym0 {
    public static final Parcelable.Creator<hq2> CREATOR = new gq2();

    /* renamed from: s */
    public final String f9417s;

    /* renamed from: t */
    public final String f9418t;

    /* renamed from: u */
    public final long f9419u;

    /* renamed from: v */
    public final long f9420v;

    /* renamed from: w */
    public final byte[] f9421w;

    /* renamed from: x */
    public int f9422x;

    static {
        kq2 kq2Var = new kq2();
        kq2Var.f10542j = "application/id3";
        kq2Var.m();
        kq2 kq2Var2 = new kq2();
        kq2Var2.f10542j = "application/x-scte35";
        kq2Var2.m();
    }

    public hq2(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = ls1.f10971a;
        this.f9417s = readString;
        this.f9418t = parcel.readString();
        this.f9419u = parcel.readLong();
        this.f9420v = parcel.readLong();
        this.f9421w = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hq2.class == obj.getClass()) {
            hq2 hq2Var = (hq2) obj;
            if (this.f9419u == hq2Var.f9419u && this.f9420v == hq2Var.f9420v && ls1.f(this.f9417s, hq2Var.f9417s) && ls1.f(this.f9418t, hq2Var.f9418t) && Arrays.equals(this.f9421w, hq2Var.f9421w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f9422x;
        if (i10 == 0) {
            String str = this.f9417s;
            int i11 = 0;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f9418t;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j3 = this.f9419u;
            long j10 = this.f9420v;
            int hashCode2 = ((((((hashCode + i11) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + Arrays.hashCode(this.f9421w);
            this.f9422x = hashCode2;
            return hashCode2;
        }
        return i10;
    }

    @Override // m4.ym0
    public final /* synthetic */ void p(sk skVar) {
    }

    public final String toString() {
        String str = this.f9417s;
        long j3 = this.f9420v;
        long j10 = this.f9419u;
        String str2 = this.f9418t;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j3);
        sb.append(", durationMs=");
        sb.append(j10);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9417s);
        parcel.writeString(this.f9418t);
        parcel.writeLong(this.f9419u);
        parcel.writeLong(this.f9420v);
        parcel.writeByteArray(this.f9421w);
    }
}

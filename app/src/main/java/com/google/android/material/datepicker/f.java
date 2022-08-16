package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: s */
    public final long f3176s;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f() {
        this.f3176s = Long.MIN_VALUE;
    }

    public f(long j3, a aVar) {
        this.f3176s = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f3176s == ((f) obj).f3176s;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3176s)});
    }

    @Override // com.google.android.material.datepicker.a.c
    public final boolean i(long j3) {
        return j3 >= this.f3176s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f3176s);
    }
}

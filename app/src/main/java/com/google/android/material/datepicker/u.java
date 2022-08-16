package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public final class u implements Comparable<u>, Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: s */
    public final Calendar f3218s;

    /* renamed from: t */
    public final int f3219t;

    /* renamed from: u */
    public final int f3220u;

    /* renamed from: v */
    public final int f3221v;

    /* renamed from: w */
    public final int f3222w;

    /* renamed from: x */
    public final long f3223x;
    public String y;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            return u.f(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i10) {
            return new u[i10];
        }
    }

    public u(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b10 = d0.b(calendar);
        this.f3218s = b10;
        this.f3219t = b10.get(2);
        this.f3220u = b10.get(1);
        this.f3221v = b10.getMaximum(7);
        this.f3222w = b10.getActualMaximum(5);
        this.f3223x = b10.getTimeInMillis();
    }

    public static u f(int i10, int i11) {
        Calendar e10 = d0.e(null);
        e10.set(1, i10);
        e10.set(2, i11);
        return new u(e10);
    }

    public static u j(long j3) {
        Calendar e10 = d0.e(null);
        e10.setTimeInMillis(j3);
        return new u(e10);
    }

    /* renamed from: b */
    public final int compareTo(u uVar) {
        return this.f3218s.compareTo(uVar.f3218s);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f3219t == uVar.f3219t && this.f3220u == uVar.f3220u;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3219t), Integer.valueOf(this.f3220u)});
    }

    public final int m() {
        int firstDayOfWeek = this.f3218s.get(7) - this.f3218s.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f3221v : firstDayOfWeek;
    }

    public final String n() {
        if (this.y == null) {
            this.y = DateUtils.formatDateTime(null, this.f3218s.getTimeInMillis(), 8228);
        }
        return this.y;
    }

    public final u r(int i10) {
        Calendar b10 = d0.b(this.f3218s);
        b10.add(2, i10);
        return new u(b10);
    }

    public final int s(u uVar) {
        if (this.f3218s instanceof GregorianCalendar) {
            return (uVar.f3219t - this.f3219t) + ((uVar.f3220u - this.f3220u) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3220u);
        parcel.writeInt(this.f3219t);
    }
}

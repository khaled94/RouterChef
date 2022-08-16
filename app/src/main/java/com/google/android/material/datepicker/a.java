package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0044a();

    /* renamed from: s */
    public final u f3144s;

    /* renamed from: t */
    public final u f3145t;

    /* renamed from: u */
    public final c f3146u;

    /* renamed from: v */
    public u f3147v;

    /* renamed from: w */
    public final int f3148w;

    /* renamed from: x */
    public final int f3149x;

    /* renamed from: com.google.android.material.datepicker.a$a */
    /* loaded from: classes.dex */
    public class C0044a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a((u) parcel.readParcelable(u.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e */
        public static final long f3150e = d0.a(u.f(1900, 0).f3223x);

        /* renamed from: f */
        public static final long f3151f = d0.a(u.f(2100, 11).f3223x);

        /* renamed from: a */
        public long f3152a;

        /* renamed from: b */
        public long f3153b;

        /* renamed from: c */
        public Long f3154c;

        /* renamed from: d */
        public c f3155d;

        public b(a aVar) {
            this.f3152a = f3150e;
            this.f3153b = f3151f;
            this.f3155d = new f();
            this.f3152a = aVar.f3144s.f3223x;
            this.f3153b = aVar.f3145t.f3223x;
            this.f3154c = Long.valueOf(aVar.f3147v.f3223x);
            this.f3155d = aVar.f3146u;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        boolean i(long j3);
    }

    public a(u uVar, u uVar2, c cVar, u uVar3) {
        this.f3144s = uVar;
        this.f3145t = uVar2;
        this.f3147v = uVar3;
        this.f3146u = cVar;
        if (uVar3 != null && uVar.f3218s.compareTo(uVar3.f3218s) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (uVar3 != null && uVar3.f3218s.compareTo(uVar2.f3218s) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f3149x = uVar.s(uVar2) + 1;
        this.f3148w = (uVar2.f3220u - uVar.f3220u) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3144s.equals(aVar.f3144s) && this.f3145t.equals(aVar.f3145t) && l0.b.a(this.f3147v, aVar.f3147v) && this.f3146u.equals(aVar.f3146u);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3144s, this.f3145t, this.f3147v, this.f3146u});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f3144s, 0);
        parcel.writeParcelable(this.f3145t, 0);
        parcel.writeParcelable(this.f3147v, 0);
        parcel.writeParcelable(this.f3146u, 0);
    }
}

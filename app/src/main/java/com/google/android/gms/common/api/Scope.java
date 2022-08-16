package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import b4.k;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d4.m;
import e4.a;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new k();

    /* renamed from: s */
    public final int f2925s;

    /* renamed from: t */
    public final String f2926t;

    public Scope(int i10, String str) {
        m.f(str, "scopeUri must not be null or empty");
        this.f2925s = i10;
        this.f2926t = str;
    }

    public Scope(String str) {
        m.f(str, "scopeUri must not be null or empty");
        this.f2925s = 1;
        this.f2926t = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f2926t.equals(((Scope) obj).f2926t);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2926t.hashCode();
    }

    public final String toString() {
        return this.f2926t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f2925s);
        m2.a.l(parcel, 2, this.f2926t);
        m2.a.u(parcel, q10);
    }
}

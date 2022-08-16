package a4;

import android.os.Parcel;
import android.os.Parcelable;
import d4.l;
import e4.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new n();

    /* renamed from: s */
    public final String f126s;
    @Deprecated

    /* renamed from: t */
    public final int f127t;

    /* renamed from: u */
    public final long f128u;

    public d(String str) {
        this.f126s = str;
        this.f128u = 1L;
        this.f127t = -1;
    }

    public d(String str, int i10, long j3) {
        this.f126s = str;
        this.f127t = i10;
        this.f128u = j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f126s;
            if (((str != null && str.equals(dVar.f126s)) || (this.f126s == null && dVar.f126s == null)) && s() == dVar.s()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f126s, Long.valueOf(s())});
    }

    public final long s() {
        long j3 = this.f128u;
        return j3 == -1 ? this.f127t : j3;
    }

    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a("name", this.f126s);
        aVar.a("version", Long.valueOf(s()));
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f126s);
        m2.a.g(parcel, 2, this.f127t);
        m2.a.j(parcel, 3, s());
        m2.a.u(parcel, q10);
    }
}

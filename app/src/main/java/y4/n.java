package y4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import java.util.Iterator;
import s4.d9;

/* loaded from: classes.dex */
public final class n extends a implements Iterable<String> {
    public static final Parcelable.Creator<n> CREATOR = new o();

    /* renamed from: s */
    public final Bundle f20587s;

    public n(Bundle bundle) {
        this.f20587s = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new d9(this);
    }

    public final Bundle s() {
        return new Bundle(this.f20587s);
    }

    public final Double t() {
        return Double.valueOf(this.f20587s.getDouble("value"));
    }

    public final String toString() {
        return this.f20587s.toString();
    }

    public final Long u() {
        return Long.valueOf(this.f20587s.getLong("value"));
    }

    public final Object v(String str) {
        return this.f20587s.get(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.b(parcel, 2, s());
        m2.a.u(parcel, q10);
    }

    public final String x(String str) {
        return this.f20587s.getString(str);
    }
}

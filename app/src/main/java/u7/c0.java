package u7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class c0 extends a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: s */
    public Bundle f19486s;

    public c0(Bundle bundle) {
        this.f19486s = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.b(parcel, 2, this.f19486s);
        m2.a.u(parcel, q10);
    }
}

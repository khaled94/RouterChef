package z3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends e4.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: s */
    public Intent f20925s;

    public a(Intent intent) {
        this.f20925s = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.k(parcel, 1, this.f20925s, i10);
        m2.a.u(parcel, q10);
    }
}

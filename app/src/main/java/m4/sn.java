package m4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class sn extends a {
    public static final Parcelable.Creator<sn> CREATOR = new tn();

    /* renamed from: s */
    public final String f13762s;

    /* renamed from: t */
    public long f13763t;

    /* renamed from: u */
    public cn f13764u;

    /* renamed from: v */
    public final Bundle f13765v;

    public sn(String str, long j3, cn cnVar, Bundle bundle) {
        this.f13762s = str;
        this.f13763t = j3;
        this.f13764u = cnVar;
        this.f13765v = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f13762s);
        m2.a.j(parcel, 2, this.f13763t);
        m2.a.k(parcel, 3, this.f13764u, i10);
        m2.a.b(parcel, 4, this.f13765v);
        m2.a.u(parcel, q10);
    }
}

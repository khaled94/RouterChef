package d4;

import a4.d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class u0 extends a {
    public static final Parcelable.Creator<u0> CREATOR = new v0();

    /* renamed from: s */
    public Bundle f3921s;

    /* renamed from: t */
    public d[] f3922t;

    /* renamed from: u */
    public int f3923u;

    /* renamed from: v */
    public d f3924v;

    public u0() {
    }

    public u0(Bundle bundle, d[] dVarArr, int i10, d dVar) {
        this.f3921s = bundle;
        this.f3922t = dVarArr;
        this.f3923u = i10;
        this.f3924v = dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.b(parcel, 1, this.f3921s);
        m2.a.o(parcel, 2, this.f3922t, i10);
        m2.a.g(parcel, 3, this.f3923u);
        m2.a.k(parcel, 4, this.f3924v, i10);
        m2.a.u(parcel, q10);
    }
}

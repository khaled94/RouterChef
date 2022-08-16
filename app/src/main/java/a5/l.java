package a5;

import a4.b;
import android.os.Parcel;
import android.os.Parcelable;
import d4.e0;
import e4.a;

/* loaded from: classes.dex */
public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: s */
    public final int f173s;

    /* renamed from: t */
    public final b f174t;

    /* renamed from: u */
    public final e0 f175u;

    public l(int i10, b bVar, e0 e0Var) {
        this.f173s = i10;
        this.f174t = bVar;
        this.f175u = e0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f173s);
        m2.a.k(parcel, 2, this.f174t, i10);
        m2.a.k(parcel, 3, this.f175u, i10);
        m2.a.u(parcel, q10);
    }
}

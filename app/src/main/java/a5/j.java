package a5;

import android.os.Parcel;
import android.os.Parcelable;
import d4.c0;
import e4.a;

/* loaded from: classes.dex */
public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: s */
    public final int f171s;

    /* renamed from: t */
    public final c0 f172t;

    public j(int i10, c0 c0Var) {
        this.f171s = i10;
        this.f172t = c0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f171s);
        m2.a.k(parcel, 2, this.f172t, i10);
        m2.a.u(parcel, q10);
    }
}

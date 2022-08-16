package d4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new w0();

    /* renamed from: s */
    public final o f3851s;

    /* renamed from: t */
    public final boolean f3852t;

    /* renamed from: u */
    public final boolean f3853u;

    /* renamed from: v */
    public final int[] f3854v;

    /* renamed from: w */
    public final int f3855w;

    /* renamed from: x */
    public final int[] f3856x;

    public d(o oVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f3851s = oVar;
        this.f3852t = z10;
        this.f3853u = z11;
        this.f3854v = iArr;
        this.f3855w = i10;
        this.f3856x = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.k(parcel, 1, this.f3851s, i10);
        m2.a.a(parcel, 2, this.f3852t);
        m2.a.a(parcel, 3, this.f3853u);
        m2.a.i(parcel, 4, this.f3854v);
        m2.a.g(parcel, 5, this.f3855w);
        m2.a.i(parcel, 6, this.f3856x);
        m2.a.u(parcel, q10);
    }
}

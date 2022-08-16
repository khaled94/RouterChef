package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import f3.n;

/* loaded from: classes.dex */
public final class or extends a {
    public static final Parcelable.Creator<or> CREATOR = new pr();

    /* renamed from: s */
    public final boolean f12277s;

    /* renamed from: t */
    public final boolean f12278t;

    /* renamed from: u */
    public final boolean f12279u;

    public or(n nVar) {
        this(nVar.f4519a, nVar.f4520b, nVar.f4521c);
    }

    public or(boolean z10, boolean z11, boolean z12) {
        this.f12277s = z10;
        this.f12278t = z11;
        this.f12279u = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.a(parcel, 2, this.f12277s);
        m2.a.a(parcel, 3, this.f12278t);
        m2.a.a(parcel, 4, this.f12279u);
        m2.a.u(parcel, q10);
    }
}

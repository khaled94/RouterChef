package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class qn extends a {
    public static final Parcelable.Creator<qn> CREATOR = new rn();

    /* renamed from: s */
    public final int f12931s;

    /* renamed from: t */
    public final int f12932t;

    /* renamed from: u */
    public final String f12933u;

    /* renamed from: v */
    public final long f12934v;

    public qn(int i10, int i11, String str, long j3) {
        this.f12931s = i10;
        this.f12932t = i11;
        this.f12933u = str;
        this.f12934v = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f12931s);
        m2.a.g(parcel, 2, this.f12932t);
        m2.a.l(parcel, 3, this.f12933u);
        m2.a.j(parcel, 4, this.f12934v);
        m2.a.u(parcel, q10);
    }
}

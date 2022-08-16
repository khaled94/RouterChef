package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class m80 extends a {
    public static final Parcelable.Creator<m80> CREATOR = new n80();
    @Deprecated

    /* renamed from: s */
    public final String f11105s;

    /* renamed from: t */
    public final String f11106t;
    @Deprecated

    /* renamed from: u */
    public final on f11107u;

    /* renamed from: v */
    public final jn f11108v;

    public m80(String str, String str2, on onVar, jn jnVar) {
        this.f11105s = str;
        this.f11106t = str2;
        this.f11107u = onVar;
        this.f11108v = jnVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f11105s);
        m2.a.l(parcel, 2, this.f11106t);
        m2.a.k(parcel, 3, this.f11107u, i10);
        m2.a.k(parcel, 4, this.f11108v, i10);
        m2.a.u(parcel, q10);
    }
}

package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class f60 extends a {
    public static final Parcelable.Creator<f60> CREATOR = new g60();

    /* renamed from: s */
    public final jn f8358s;

    /* renamed from: t */
    public final String f8359t;

    public f60(jn jnVar, String str) {
        this.f8358s = jnVar;
        this.f8359t = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.k(parcel, 2, this.f8358s, i10);
        m2.a.l(parcel, 3, this.f8359t);
        m2.a.u(parcel, q10);
    }
}

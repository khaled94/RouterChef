package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class az extends a {
    public static final Parcelable.Creator<az> CREATOR = new bz();

    /* renamed from: s */
    public final int f6296s;

    /* renamed from: t */
    public final int f6297t;

    /* renamed from: u */
    public final String f6298u;

    /* renamed from: v */
    public final int f6299v;

    public az(int i10, int i11, String str, int i12) {
        this.f6296s = i10;
        this.f6297t = i11;
        this.f6298u = str;
        this.f6299v = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f6297t);
        m2.a.l(parcel, 2, this.f6298u);
        m2.a.g(parcel, 3, this.f6299v);
        m2.a.g(parcel, 1000, this.f6296s);
        m2.a.u(parcel, q10);
    }
}

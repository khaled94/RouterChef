package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class d50 extends a {
    public static final Parcelable.Creator<d50> CREATOR = new e50();

    /* renamed from: s */
    public final boolean f7224s;

    /* renamed from: t */
    public final List<String> f7225t;

    public d50(boolean z10, List<String> list) {
        this.f7224s = z10;
        this.f7225t = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.a(parcel, 2, this.f7224s);
        m2.a.n(parcel, 3, this.f7225t);
        m2.a.u(parcel, q10);
    }
}

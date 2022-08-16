package d4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class q extends a {
    public static final Parcelable.Creator<q> CREATOR = new s();

    /* renamed from: s */
    public final int f3908s;
    @Nullable

    /* renamed from: t */
    public List<k> f3909t;

    public q(int i10, @Nullable List<k> list) {
        this.f3908s = i10;
        this.f3909t = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f3908s);
        m2.a.p(parcel, 2, this.f3909t);
        m2.a.u(parcel, q10);
    }
}

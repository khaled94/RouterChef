package m4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class yy extends a {
    public static final Parcelable.Creator<yy> CREATOR = new zy();

    /* renamed from: s */
    public final String f15919s;

    /* renamed from: t */
    public final Bundle f15920t;

    public yy(String str, Bundle bundle) {
        this.f15919s = str;
        this.f15920t = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f15919s);
        m2.a.b(parcel, 2, this.f15920t);
        m2.a.u(parcel, q10);
    }
}

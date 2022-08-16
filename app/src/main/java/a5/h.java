package a5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import e4.a;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends a implements b4.h {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: s */
    public final List<String> f169s;

    /* renamed from: t */
    public final String f170t;

    public h(List<String> list, String str) {
        this.f169s = list;
        this.f170t = str;
    }

    @Override // b4.h
    public final Status m() {
        return this.f170t != null ? Status.f2927x : Status.f2928z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.n(parcel, 1, this.f169s);
        m2.a.l(parcel, 2, this.f170t);
        m2.a.u(parcel, q10);
    }
}

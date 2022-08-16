package a4;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import k4.a;
import k4.b;

/* loaded from: classes.dex */
public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new z();

    /* renamed from: s */
    public final String f161s;

    /* renamed from: t */
    public final boolean f162t;

    /* renamed from: u */
    public final boolean f163u;

    /* renamed from: v */
    public final Context f164v;

    /* renamed from: w */
    public final boolean f165w;

    public y(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12) {
        this.f161s = str;
        this.f162t = z10;
        this.f163u = z11;
        this.f164v = (Context) b.e0(a.AbstractBinderC0085a.c0(iBinder));
        this.f165w = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f161s);
        m2.a.a(parcel, 2, this.f162t);
        m2.a.a(parcel, 3, this.f163u);
        m2.a.f(parcel, 4, new b(this.f164v));
        m2.a.a(parcel, 5, this.f165w);
        m2.a.u(parcel, q10);
    }
}

package s4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class b1 extends a {
    public static final Parcelable.Creator<b1> CREATOR = new c1();

    /* renamed from: s */
    public final long f17733s;

    /* renamed from: t */
    public final long f17734t;

    /* renamed from: u */
    public final boolean f17735u;

    /* renamed from: v */
    public final String f17736v;

    /* renamed from: w */
    public final String f17737w;

    /* renamed from: x */
    public final String f17738x;
    public final Bundle y;

    /* renamed from: z */
    public final String f17739z;

    public b1(long j3, long j10, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f17733s = j3;
        this.f17734t = j10;
        this.f17735u = z10;
        this.f17736v = str;
        this.f17737w = str2;
        this.f17738x = str3;
        this.y = bundle;
        this.f17739z = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.j(parcel, 1, this.f17733s);
        m2.a.j(parcel, 2, this.f17734t);
        m2.a.a(parcel, 3, this.f17735u);
        m2.a.l(parcel, 4, this.f17736v);
        m2.a.l(parcel, 5, this.f17737w);
        m2.a.l(parcel, 6, this.f17738x);
        m2.a.b(parcel, 7, this.y);
        m2.a.l(parcel, 8, this.f17739z);
        m2.a.u(parcel, q10);
    }
}

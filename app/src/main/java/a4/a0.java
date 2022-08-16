package a4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.h0;
import e4.a;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: s */
    public final boolean f111s;
    @Nullable

    /* renamed from: t */
    public final String f112t;

    /* renamed from: u */
    public final int f113u;

    public a0(boolean z10, String str, int i10) {
        this.f111s = z10;
        this.f112t = str;
        this.f113u = h0.e(i10) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.a(parcel, 1, this.f111s);
        m2.a.l(parcel, 2, this.f112t);
        m2.a.g(parcel, 3, this.f113u);
        m2.a.u(parcel, q10);
    }
}

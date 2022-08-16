package h3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public final class a extends e4.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new i();

    /* renamed from: s */
    public final boolean f5052s;

    /* renamed from: t */
    public final IBinder f5053t;

    public a(boolean z10, IBinder iBinder) {
        this.f5052s = z10;
        this.f5053t = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.a(parcel, 1, this.f5052s);
        m2.a.f(parcel, 2, this.f5053t);
        m2.a.u(parcel, q10);
    }
}

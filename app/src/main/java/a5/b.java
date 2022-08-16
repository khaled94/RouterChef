package a5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import b4.h;
import com.google.android.gms.common.api.Status;
import e4.a;

/* loaded from: classes.dex */
public final class b extends a implements h {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: s */
    public final int f166s;

    /* renamed from: t */
    public int f167t;

    /* renamed from: u */
    public Intent f168u;

    public b() {
        this.f166s = 2;
        this.f167t = 0;
        this.f168u = null;
    }

    public b(int i10, int i11, Intent intent) {
        this.f166s = i10;
        this.f167t = i11;
        this.f168u = intent;
    }

    @Override // b4.h
    public final Status m() {
        return this.f167t == 0 ? Status.f2927x : Status.f2928z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f166s);
        m2.a.g(parcel, 2, this.f167t);
        m2.a.k(parcel, 3, this.f168u, i10);
        m2.a.u(parcel, q10);
    }
}

package d4;

import a4.b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import d4.h;
import e4.a;

/* loaded from: classes.dex */
public final class e0 extends a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: s */
    public final int f3866s;

    /* renamed from: t */
    public final IBinder f3867t;

    /* renamed from: u */
    public final b f3868u;

    /* renamed from: v */
    public final boolean f3869v;

    /* renamed from: w */
    public final boolean f3870w;

    public e0(int i10, IBinder iBinder, b bVar, boolean z10, boolean z11) {
        this.f3866s = i10;
        this.f3867t = iBinder;
        this.f3868u = bVar;
        this.f3869v = z10;
        this.f3870w = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f3868u.equals(e0Var.f3868u) && l.a(s(), e0Var.s());
    }

    public final h s() {
        IBinder iBinder = this.f3867t;
        if (iBinder == null) {
            return null;
        }
        return h.a.c0(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f3866s);
        m2.a.f(parcel, 2, this.f3867t);
        m2.a.k(parcel, 3, this.f3868u, i10);
        m2.a.a(parcel, 4, this.f3869v);
        m2.a.a(parcel, 5, this.f3870w);
        m2.a.u(parcel, q10);
    }
}

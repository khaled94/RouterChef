package l3;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();
    public final boolean A;

    /* renamed from: s */
    public final boolean f5762s;

    /* renamed from: t */
    public final boolean f5763t;

    /* renamed from: u */
    public final String f5764u;

    /* renamed from: v */
    public final boolean f5765v;

    /* renamed from: w */
    public final float f5766w;

    /* renamed from: x */
    public final int f5767x;
    public final boolean y;

    /* renamed from: z */
    public final boolean f5768z;

    public j(boolean z10, boolean z11, String str, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this.f5762s = z10;
        this.f5763t = z11;
        this.f5764u = str;
        this.f5765v = z12;
        this.f5766w = f10;
        this.f5767x = i10;
        this.y = z13;
        this.f5768z = z14;
        this.A = z15;
    }

    public j(boolean z10, boolean z11, boolean z12, float f10, boolean z13, boolean z14, boolean z15) {
        this(z10, z11, null, z12, f10, -1, z13, z14, z15);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.a(parcel, 2, this.f5762s);
        m2.a.a(parcel, 3, this.f5763t);
        m2.a.l(parcel, 4, this.f5764u);
        m2.a.a(parcel, 5, this.f5765v);
        m2.a.e(parcel, 6, this.f5766w);
        m2.a.g(parcel, 7, this.f5767x);
        m2.a.a(parcel, 8, this.y);
        m2.a.a(parcel, 9, this.f5768z);
        m2.a.a(parcel, 10, this.A);
        m2.a.u(parcel, q10);
    }
}

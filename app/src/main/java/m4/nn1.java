package m4;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class nn1 extends a {
    public static final Parcelable.Creator<nn1> CREATOR = new on1();
    public final int A;
    public final int B;
    @Nullable

    /* renamed from: s */
    public final Context f11866s;

    /* renamed from: t */
    public final int f11867t;

    /* renamed from: u */
    public final mn1 f11868u;

    /* renamed from: v */
    public final int f11869v;

    /* renamed from: w */
    public final int f11870w;

    /* renamed from: x */
    public final int f11871x;
    public final String y;

    /* renamed from: z */
    public final int f11872z;

    public nn1(int i10, int i11, int i12, int i13, String str, int i14, int i15) {
        mn1[] values = mn1.values();
        this.f11866s = null;
        this.f11867t = i10;
        this.f11868u = values[i10];
        this.f11869v = i11;
        this.f11870w = i12;
        this.f11871x = i13;
        this.y = str;
        this.f11872z = i14;
        this.B = new int[]{1, 2, 3}[i14];
        this.A = i15;
        int i16 = new int[]{1}[i15];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f11867t);
        m2.a.g(parcel, 2, this.f11869v);
        m2.a.g(parcel, 3, this.f11870w);
        m2.a.g(parcel, 4, this.f11871x);
        m2.a.l(parcel, 5, this.y);
        m2.a.g(parcel, 6, this.f11872z);
        m2.a.g(parcel, 7, this.A);
        m2.a.u(parcel, q10);
    }

    public nn1(@Nullable Context context, mn1 mn1Var, int i10, int i11, int i12, String str, String str2, String str3) {
        mn1.values();
        this.f11866s = context;
        this.f11867t = mn1Var.ordinal();
        this.f11868u = mn1Var;
        this.f11869v = i10;
        this.f11870w = i11;
        this.f11871x = i12;
        this.y = str;
        int i13 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.B = i13;
        this.f11872z = i13 - 1;
        "onAdClosed".equals(str3);
        this.A = 0;
    }
}

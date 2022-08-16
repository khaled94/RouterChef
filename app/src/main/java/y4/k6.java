package y4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import d4.m;
import e4.a;
import java.util.List;

/* loaded from: classes.dex */
public final class k6 extends a {
    public static final Parcelable.Creator<k6> CREATOR = new l6();
    public final boolean A;
    public final long B;
    public final String C;
    public final long D;
    public final long E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final String I;
    public final Boolean J;
    public final long K;
    public final List<String> L;
    public final String M;
    public final String N;

    /* renamed from: s */
    public final String f20535s;

    /* renamed from: t */
    public final String f20536t;

    /* renamed from: u */
    public final String f20537u;

    /* renamed from: v */
    public final String f20538v;

    /* renamed from: w */
    public final long f20539w;

    /* renamed from: x */
    public final long f20540x;
    public final String y;

    /* renamed from: z */
    public final boolean f20541z;

    public k6(String str, String str2, String str3, long j3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, String str6, long j12, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List<String> list, String str8, String str9) {
        m.e(str);
        this.f20535s = str;
        this.f20536t = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f20537u = str3;
        this.B = j3;
        this.f20538v = str4;
        this.f20539w = j10;
        this.f20540x = j11;
        this.y = str5;
        this.f20541z = z10;
        this.A = z11;
        this.C = str6;
        this.D = j12;
        this.E = j13;
        this.F = i10;
        this.G = z12;
        this.H = z13;
        this.I = str7;
        this.J = bool;
        this.K = j14;
        this.L = list;
        this.M = str8;
        this.N = str9;
    }

    public k6(String str, String str2, String str3, String str4, long j3, long j10, String str5, boolean z10, boolean z11, long j11, String str6, long j12, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List<String> list, String str8, String str9) {
        this.f20535s = str;
        this.f20536t = str2;
        this.f20537u = str3;
        this.B = j11;
        this.f20538v = str4;
        this.f20539w = j3;
        this.f20540x = j10;
        this.y = str5;
        this.f20541z = z10;
        this.A = z11;
        this.C = str6;
        this.D = j12;
        this.E = j13;
        this.F = i10;
        this.G = z12;
        this.H = z13;
        this.I = str7;
        this.J = bool;
        this.K = j14;
        this.L = list;
        this.M = str8;
        this.N = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 2, this.f20535s);
        m2.a.l(parcel, 3, this.f20536t);
        m2.a.l(parcel, 4, this.f20537u);
        m2.a.l(parcel, 5, this.f20538v);
        m2.a.j(parcel, 6, this.f20539w);
        m2.a.j(parcel, 7, this.f20540x);
        m2.a.l(parcel, 8, this.y);
        m2.a.a(parcel, 9, this.f20541z);
        m2.a.a(parcel, 10, this.A);
        m2.a.j(parcel, 11, this.B);
        m2.a.l(parcel, 12, this.C);
        m2.a.j(parcel, 13, this.D);
        m2.a.j(parcel, 14, this.E);
        m2.a.g(parcel, 15, this.F);
        m2.a.a(parcel, 16, this.G);
        m2.a.a(parcel, 18, this.H);
        m2.a.l(parcel, 19, this.I);
        Boolean bool = this.J;
        if (bool != null) {
            parcel.writeInt(262165);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        m2.a.j(parcel, 22, this.K);
        m2.a.n(parcel, 23, this.L);
        m2.a.l(parcel, 24, this.M);
        m2.a.l(parcel, 25, this.N);
        m2.a.u(parcel, q10);
    }
}

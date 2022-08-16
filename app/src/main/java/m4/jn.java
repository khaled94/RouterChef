package m4;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d4.l;
import e4.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class jn extends a {
    public static final Parcelable.Creator<jn> CREATOR = new ln();
    public final String A;
    public final lr B;
    public final Location C;
    public final String D;
    public final Bundle E;
    public final Bundle F;
    public final List<String> G;
    public final String H;
    public final String I;
    @Deprecated
    public final boolean J;
    public final an K;
    public final int L;
    public final String M;
    public final List<String> N;
    public final int O;
    public final String P;

    /* renamed from: s */
    public final int f10128s;
    @Deprecated

    /* renamed from: t */
    public final long f10129t;

    /* renamed from: u */
    public final Bundle f10130u;
    @Deprecated

    /* renamed from: v */
    public final int f10131v;

    /* renamed from: w */
    public final List<String> f10132w;

    /* renamed from: x */
    public final boolean f10133x;
    public final int y;

    /* renamed from: z */
    public final boolean f10134z;

    public jn(int i10, long j3, Bundle bundle, int i11, List<String> list, boolean z10, int i12, boolean z11, String str, lr lrVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z12, an anVar, int i13, String str5, List<String> list3, int i14, String str6) {
        this.f10128s = i10;
        this.f10129t = j3;
        this.f10130u = bundle == null ? new Bundle() : bundle;
        this.f10131v = i11;
        this.f10132w = list;
        this.f10133x = z10;
        this.y = i12;
        this.f10134z = z11;
        this.A = str;
        this.B = lrVar;
        this.C = location;
        this.D = str2;
        this.E = bundle2 == null ? new Bundle() : bundle2;
        this.F = bundle3;
        this.G = list2;
        this.H = str3;
        this.I = str4;
        this.J = z12;
        this.K = anVar;
        this.L = i13;
        this.M = str5;
        this.N = list3 == null ? new ArrayList<>() : list3;
        this.O = i14;
        this.P = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jn)) {
            return false;
        }
        jn jnVar = (jn) obj;
        return this.f10128s == jnVar.f10128s && this.f10129t == jnVar.f10129t && l90.c(this.f10130u, jnVar.f10130u) && this.f10131v == jnVar.f10131v && l.a(this.f10132w, jnVar.f10132w) && this.f10133x == jnVar.f10133x && this.y == jnVar.y && this.f10134z == jnVar.f10134z && l.a(this.A, jnVar.A) && l.a(this.B, jnVar.B) && l.a(this.C, jnVar.C) && l.a(this.D, jnVar.D) && l90.c(this.E, jnVar.E) && l90.c(this.F, jnVar.F) && l.a(this.G, jnVar.G) && l.a(this.H, jnVar.H) && l.a(this.I, jnVar.I) && this.J == jnVar.J && this.L == jnVar.L && l.a(this.M, jnVar.M) && l.a(this.N, jnVar.N) && this.O == jnVar.O && l.a(this.P, jnVar.P);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10128s), Long.valueOf(this.f10129t), this.f10130u, Integer.valueOf(this.f10131v), this.f10132w, Boolean.valueOf(this.f10133x), Integer.valueOf(this.y), Boolean.valueOf(this.f10134z), this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(this.J), Integer.valueOf(this.L), this.M, this.N, Integer.valueOf(this.O), this.P});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f10128s);
        m2.a.j(parcel, 2, this.f10129t);
        m2.a.b(parcel, 3, this.f10130u);
        m2.a.g(parcel, 4, this.f10131v);
        m2.a.n(parcel, 5, this.f10132w);
        m2.a.a(parcel, 6, this.f10133x);
        m2.a.g(parcel, 7, this.y);
        m2.a.a(parcel, 8, this.f10134z);
        m2.a.l(parcel, 9, this.A);
        m2.a.k(parcel, 10, this.B, i10);
        m2.a.k(parcel, 11, this.C, i10);
        m2.a.l(parcel, 12, this.D);
        m2.a.b(parcel, 13, this.E);
        m2.a.b(parcel, 14, this.F);
        m2.a.n(parcel, 15, this.G);
        m2.a.l(parcel, 16, this.H);
        m2.a.l(parcel, 17, this.I);
        m2.a.a(parcel, 18, this.J);
        m2.a.k(parcel, 19, this.K, i10);
        m2.a.g(parcel, 20, this.L);
        m2.a.l(parcel, 21, this.M);
        m2.a.n(parcel, 22, this.N);
        m2.a.g(parcel, 23, this.O);
        m2.a.l(parcel, 24, this.P);
        m2.a.u(parcel, q10);
    }
}

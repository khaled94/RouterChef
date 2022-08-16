package m4;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class b50 extends a {
    public static final Parcelable.Creator<b50> CREATOR = new c50();
    public final String A;
    public final String B;
    public final o90 C;
    public final Bundle D;
    public final int E;
    public final List<String> F;
    public final Bundle G;
    public final boolean H;
    public final int I;
    public final int J;
    public final float K;
    public final String L;
    public final long M;
    public final String N;
    public final List<String> O;
    public final String P;
    public final lu Q;
    public final List<String> R;
    public final long S;
    public final String T;
    public final float U;
    public final int V;
    public final int W;
    public final boolean X;
    public final String Y;
    public final boolean Z;

    /* renamed from: a0 */
    public final String f6364a0;

    /* renamed from: b0 */
    public final boolean f6365b0;

    /* renamed from: c0 */
    public final int f6366c0;

    /* renamed from: d0 */
    public final Bundle f6367d0;

    /* renamed from: e0 */
    public final String f6368e0;

    /* renamed from: f0 */
    public final qq f6369f0;

    /* renamed from: g0 */
    public final boolean f6370g0;

    /* renamed from: h0 */
    public final Bundle f6371h0;

    /* renamed from: i0 */
    public final String f6372i0;

    /* renamed from: j0 */
    public final String f6373j0;

    /* renamed from: k0 */
    public final String f6374k0;

    /* renamed from: l0 */
    public final boolean f6375l0;

    /* renamed from: m0 */
    public final List<Integer> f6376m0;

    /* renamed from: n0 */
    public final String f6377n0;

    /* renamed from: o0 */
    public final List<String> f6378o0;

    /* renamed from: p0 */
    public final int f6379p0;

    /* renamed from: q0 */
    public final boolean f6380q0;

    /* renamed from: r0 */
    public final boolean f6381r0;

    /* renamed from: s */
    public final int f6382s;

    /* renamed from: s0 */
    public final boolean f6383s0;

    /* renamed from: t */
    public final Bundle f6384t;

    /* renamed from: t0 */
    public final ArrayList<String> f6385t0;

    /* renamed from: u */
    public final jn f6386u;

    /* renamed from: u0 */
    public final String f6387u0;

    /* renamed from: v */
    public final on f6388v;

    /* renamed from: v0 */
    public final az f6389v0;

    /* renamed from: w */
    public final String f6390w;

    /* renamed from: w0 */
    public final String f6391w0;

    /* renamed from: x */
    public final ApplicationInfo f6392x;
    public final Bundle x0;
    public final PackageInfo y;

    /* renamed from: z */
    public final String f6393z;

    public b50(int i10, Bundle bundle, jn jnVar, on onVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, o90 o90Var, Bundle bundle2, int i11, List<String> list, Bundle bundle3, boolean z10, int i12, int i13, float f10, String str5, long j3, String str6, List<String> list2, String str7, lu luVar, List<String> list3, long j10, String str8, float f11, boolean z11, int i14, int i15, boolean z12, String str9, String str10, boolean z13, int i16, Bundle bundle4, String str11, qq qqVar, boolean z14, Bundle bundle5, String str12, String str13, String str14, boolean z15, List<Integer> list4, String str15, List<String> list5, int i17, boolean z16, boolean z17, boolean z18, ArrayList<String> arrayList, String str16, az azVar, String str17, Bundle bundle6) {
        this.f6382s = i10;
        this.f6384t = bundle;
        this.f6386u = jnVar;
        this.f6388v = onVar;
        this.f6390w = str;
        this.f6392x = applicationInfo;
        this.y = packageInfo;
        this.f6393z = str2;
        this.A = str3;
        this.B = str4;
        this.C = o90Var;
        this.D = bundle2;
        this.E = i11;
        this.F = list;
        this.R = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.G = bundle3;
        this.H = z10;
        this.I = i12;
        this.J = i13;
        this.K = f10;
        this.L = str5;
        this.M = j3;
        this.N = str6;
        this.O = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.P = str7;
        this.Q = luVar;
        this.S = j10;
        this.T = str8;
        this.U = f11;
        this.Z = z11;
        this.V = i14;
        this.W = i15;
        this.X = z12;
        this.Y = str9;
        this.f6364a0 = str10;
        this.f6365b0 = z13;
        this.f6366c0 = i16;
        this.f6367d0 = bundle4;
        this.f6368e0 = str11;
        this.f6369f0 = qqVar;
        this.f6370g0 = z14;
        this.f6371h0 = bundle5;
        this.f6372i0 = str12;
        this.f6373j0 = str13;
        this.f6374k0 = str14;
        this.f6375l0 = z15;
        this.f6376m0 = list4;
        this.f6377n0 = str15;
        this.f6378o0 = list5;
        this.f6379p0 = i17;
        this.f6380q0 = z16;
        this.f6381r0 = z17;
        this.f6383s0 = z18;
        this.f6385t0 = arrayList;
        this.f6387u0 = str16;
        this.f6389v0 = azVar;
        this.f6391w0 = str17;
        this.x0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f6382s);
        m2.a.b(parcel, 2, this.f6384t);
        m2.a.k(parcel, 3, this.f6386u, i10);
        m2.a.k(parcel, 4, this.f6388v, i10);
        m2.a.l(parcel, 5, this.f6390w);
        m2.a.k(parcel, 6, this.f6392x, i10);
        m2.a.k(parcel, 7, this.y, i10);
        m2.a.l(parcel, 8, this.f6393z);
        m2.a.l(parcel, 9, this.A);
        m2.a.l(parcel, 10, this.B);
        m2.a.k(parcel, 11, this.C, i10);
        m2.a.b(parcel, 12, this.D);
        m2.a.g(parcel, 13, this.E);
        m2.a.n(parcel, 14, this.F);
        m2.a.b(parcel, 15, this.G);
        m2.a.a(parcel, 16, this.H);
        m2.a.g(parcel, 18, this.I);
        m2.a.g(parcel, 19, this.J);
        m2.a.e(parcel, 20, this.K);
        m2.a.l(parcel, 21, this.L);
        m2.a.j(parcel, 25, this.M);
        m2.a.l(parcel, 26, this.N);
        m2.a.n(parcel, 27, this.O);
        m2.a.l(parcel, 28, this.P);
        m2.a.k(parcel, 29, this.Q, i10);
        m2.a.n(parcel, 30, this.R);
        m2.a.j(parcel, 31, this.S);
        m2.a.l(parcel, 33, this.T);
        m2.a.e(parcel, 34, this.U);
        m2.a.g(parcel, 35, this.V);
        m2.a.g(parcel, 36, this.W);
        m2.a.a(parcel, 37, this.X);
        m2.a.l(parcel, 39, this.Y);
        m2.a.a(parcel, 40, this.Z);
        m2.a.l(parcel, 41, this.f6364a0);
        m2.a.a(parcel, 42, this.f6365b0);
        m2.a.g(parcel, 43, this.f6366c0);
        m2.a.b(parcel, 44, this.f6367d0);
        m2.a.l(parcel, 45, this.f6368e0);
        m2.a.k(parcel, 46, this.f6369f0, i10);
        m2.a.a(parcel, 47, this.f6370g0);
        m2.a.b(parcel, 48, this.f6371h0);
        m2.a.l(parcel, 49, this.f6372i0);
        m2.a.l(parcel, 50, this.f6373j0);
        m2.a.l(parcel, 51, this.f6374k0);
        m2.a.a(parcel, 52, this.f6375l0);
        List<Integer> list = this.f6376m0;
        if (list != null) {
            int q11 = m2.a.q(parcel, 53);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(list.get(i11).intValue());
            }
            m2.a.u(parcel, q11);
        }
        m2.a.l(parcel, 54, this.f6377n0);
        m2.a.n(parcel, 55, this.f6378o0);
        m2.a.g(parcel, 56, this.f6379p0);
        m2.a.a(parcel, 57, this.f6380q0);
        m2.a.a(parcel, 58, this.f6381r0);
        m2.a.a(parcel, 59, this.f6383s0);
        m2.a.n(parcel, 60, this.f6385t0);
        m2.a.l(parcel, 61, this.f6387u0);
        m2.a.k(parcel, 63, this.f6389v0, i10);
        m2.a.l(parcel, 64, this.f6391w0);
        m2.a.b(parcel, 65, this.x0);
        m2.a.u(parcel, q10);
    }
}

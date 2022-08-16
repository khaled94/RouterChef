package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e4.a;
import k4.a;
import k4.b;
import l3.j;
import m3.f;
import m3.o;
import m3.p;
import m3.x;
import m4.ep1;
import m4.f11;
import m4.js0;
import m4.lw;
import m4.nw;
import m4.o90;
import m4.v61;
import m4.vd0;
import m4.ym;
import m4.zo0;
import n3.r0;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new o();
    public final x A;
    public final int B;
    public final int C;
    @RecentlyNonNull
    public final String D;
    public final o90 E;
    @RecentlyNonNull
    public final String F;
    public final j G;
    public final lw H;
    @RecentlyNonNull
    public final String I;
    public final v61 J;
    public final f11 K;
    public final ep1 L;
    public final r0 M;
    @RecentlyNonNull
    public final String N;
    @RecentlyNonNull
    public final String O;
    public final zo0 P;
    public final js0 Q;

    /* renamed from: s */
    public final f f2906s;

    /* renamed from: t */
    public final ym f2907t;

    /* renamed from: u */
    public final p f2908u;

    /* renamed from: v */
    public final vd0 f2909v;

    /* renamed from: w */
    public final nw f2910w;
    @RecentlyNonNull

    /* renamed from: x */
    public final String f2911x;
    public final boolean y;
    @RecentlyNonNull

    /* renamed from: z */
    public final String f2912z;

    public AdOverlayInfoParcel(f fVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z10, String str2, IBinder iBinder5, int i10, int i11, String str3, o90 o90Var, String str4, j jVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.f2906s = fVar;
        this.f2907t = (ym) b.e0(a.AbstractBinderC0085a.c0(iBinder));
        this.f2908u = (p) b.e0(a.AbstractBinderC0085a.c0(iBinder2));
        this.f2909v = (vd0) b.e0(a.AbstractBinderC0085a.c0(iBinder3));
        this.H = (lw) b.e0(a.AbstractBinderC0085a.c0(iBinder6));
        this.f2910w = (nw) b.e0(a.AbstractBinderC0085a.c0(iBinder4));
        this.f2911x = str;
        this.y = z10;
        this.f2912z = str2;
        this.A = (x) b.e0(a.AbstractBinderC0085a.c0(iBinder5));
        this.B = i10;
        this.C = i11;
        this.D = str3;
        this.E = o90Var;
        this.F = str4;
        this.G = jVar;
        this.I = str5;
        this.N = str6;
        this.J = (v61) b.e0(a.AbstractBinderC0085a.c0(iBinder7));
        this.K = (f11) b.e0(a.AbstractBinderC0085a.c0(iBinder8));
        this.L = (ep1) b.e0(a.AbstractBinderC0085a.c0(iBinder9));
        this.M = (r0) b.e0(a.AbstractBinderC0085a.c0(iBinder10));
        this.O = str7;
        this.P = (zo0) b.e0(a.AbstractBinderC0085a.c0(iBinder11));
        this.Q = (js0) b.e0(a.AbstractBinderC0085a.c0(iBinder12));
    }

    public AdOverlayInfoParcel(f fVar, ym ymVar, p pVar, x xVar, o90 o90Var, vd0 vd0Var, js0 js0Var) {
        this.f2906s = fVar;
        this.f2907t = ymVar;
        this.f2908u = pVar;
        this.f2909v = vd0Var;
        this.H = null;
        this.f2910w = null;
        this.f2911x = null;
        this.y = false;
        this.f2912z = null;
        this.A = xVar;
        this.B = -1;
        this.C = 4;
        this.D = null;
        this.E = o90Var;
        this.F = null;
        this.G = null;
        this.I = null;
        this.N = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.O = null;
        this.P = null;
        this.Q = js0Var;
    }

    public AdOverlayInfoParcel(p pVar, vd0 vd0Var, int i10, o90 o90Var, String str, j jVar, String str2, String str3, String str4, zo0 zo0Var) {
        this.f2906s = null;
        this.f2907t = null;
        this.f2908u = pVar;
        this.f2909v = vd0Var;
        this.H = null;
        this.f2910w = null;
        this.f2911x = str2;
        this.y = false;
        this.f2912z = str3;
        this.A = null;
        this.B = i10;
        this.C = 1;
        this.D = null;
        this.E = o90Var;
        this.F = str;
        this.G = jVar;
        this.I = null;
        this.N = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.O = str4;
        this.P = zo0Var;
        this.Q = null;
    }

    public AdOverlayInfoParcel(p pVar, vd0 vd0Var, o90 o90Var) {
        this.f2908u = pVar;
        this.f2909v = vd0Var;
        this.B = 1;
        this.E = o90Var;
        this.f2906s = null;
        this.f2907t = null;
        this.H = null;
        this.f2910w = null;
        this.f2911x = null;
        this.y = false;
        this.f2912z = null;
        this.A = null;
        this.C = 1;
        this.D = null;
        this.F = null;
        this.G = null;
        this.I = null;
        this.N = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.O = null;
        this.P = null;
        this.Q = null;
    }

    public AdOverlayInfoParcel(vd0 vd0Var, o90 o90Var, r0 r0Var, v61 v61Var, f11 f11Var, ep1 ep1Var, String str, String str2) {
        this.f2906s = null;
        this.f2907t = null;
        this.f2908u = null;
        this.f2909v = vd0Var;
        this.H = null;
        this.f2910w = null;
        this.f2911x = null;
        this.y = false;
        this.f2912z = null;
        this.A = null;
        this.B = 14;
        this.C = 5;
        this.D = null;
        this.E = o90Var;
        this.F = null;
        this.G = null;
        this.I = str;
        this.N = str2;
        this.J = v61Var;
        this.K = f11Var;
        this.L = ep1Var;
        this.M = r0Var;
        this.O = null;
        this.P = null;
        this.Q = null;
    }

    public AdOverlayInfoParcel(ym ymVar, p pVar, x xVar, vd0 vd0Var, boolean z10, int i10, o90 o90Var, js0 js0Var) {
        this.f2906s = null;
        this.f2907t = ymVar;
        this.f2908u = pVar;
        this.f2909v = vd0Var;
        this.H = null;
        this.f2910w = null;
        this.f2911x = null;
        this.y = z10;
        this.f2912z = null;
        this.A = xVar;
        this.B = i10;
        this.C = 2;
        this.D = null;
        this.E = o90Var;
        this.F = null;
        this.G = null;
        this.I = null;
        this.N = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.O = null;
        this.P = null;
        this.Q = js0Var;
    }

    public AdOverlayInfoParcel(ym ymVar, p pVar, lw lwVar, nw nwVar, x xVar, vd0 vd0Var, boolean z10, int i10, String str, String str2, o90 o90Var, js0 js0Var) {
        this.f2906s = null;
        this.f2907t = ymVar;
        this.f2908u = pVar;
        this.f2909v = vd0Var;
        this.H = lwVar;
        this.f2910w = nwVar;
        this.f2911x = str2;
        this.y = z10;
        this.f2912z = str;
        this.A = xVar;
        this.B = i10;
        this.C = 3;
        this.D = null;
        this.E = o90Var;
        this.F = null;
        this.G = null;
        this.I = null;
        this.N = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.O = null;
        this.P = null;
        this.Q = js0Var;
    }

    public AdOverlayInfoParcel(ym ymVar, p pVar, lw lwVar, nw nwVar, x xVar, vd0 vd0Var, boolean z10, int i10, String str, o90 o90Var, js0 js0Var) {
        this.f2906s = null;
        this.f2907t = ymVar;
        this.f2908u = pVar;
        this.f2909v = vd0Var;
        this.H = lwVar;
        this.f2910w = nwVar;
        this.f2911x = null;
        this.y = z10;
        this.f2912z = null;
        this.A = xVar;
        this.B = i10;
        this.C = 3;
        this.D = str;
        this.E = o90Var;
        this.F = null;
        this.G = null;
        this.I = null;
        this.N = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.O = null;
        this.P = null;
        this.Q = js0Var;
    }

    @RecentlyNonNull
    public static AdOverlayInfoParcel s(@RecentlyNonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.k(parcel, 2, this.f2906s, i10);
        m2.a.f(parcel, 3, new b(this.f2907t));
        m2.a.f(parcel, 4, new b(this.f2908u));
        m2.a.f(parcel, 5, new b(this.f2909v));
        m2.a.f(parcel, 6, new b(this.f2910w));
        m2.a.l(parcel, 7, this.f2911x);
        m2.a.a(parcel, 8, this.y);
        m2.a.l(parcel, 9, this.f2912z);
        m2.a.f(parcel, 10, new b(this.A));
        m2.a.g(parcel, 11, this.B);
        m2.a.g(parcel, 12, this.C);
        m2.a.l(parcel, 13, this.D);
        m2.a.k(parcel, 14, this.E, i10);
        m2.a.l(parcel, 16, this.F);
        m2.a.k(parcel, 17, this.G, i10);
        m2.a.f(parcel, 18, new b(this.H));
        m2.a.l(parcel, 19, this.I);
        m2.a.f(parcel, 20, new b(this.J));
        m2.a.f(parcel, 21, new b(this.K));
        m2.a.f(parcel, 22, new b(this.L));
        m2.a.f(parcel, 23, new b(this.M));
        m2.a.l(parcel, 24, this.N);
        m2.a.l(parcel, 25, this.O);
        m2.a.f(parcel, 26, new b(this.P));
        m2.a.f(parcel, 27, new b(this.Q));
        m2.a.u(parcel, q10);
    }
}

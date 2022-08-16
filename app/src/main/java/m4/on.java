package m4;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import e4.a;
import f3.e;

/* loaded from: classes.dex */
public final class on extends a {
    public static final Parcelable.Creator<on> CREATOR = new pn();
    public final boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;

    /* renamed from: s */
    public final String f12220s;

    /* renamed from: t */
    public final int f12221t;

    /* renamed from: u */
    public final int f12222u;

    /* renamed from: v */
    public final boolean f12223v;

    /* renamed from: w */
    public final int f12224w;

    /* renamed from: x */
    public final int f12225x;
    public final on[] y;

    /* renamed from: z */
    public final boolean f12226z;

    public on() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public on(Context context, e eVar) {
        this(context, new e[]{eVar});
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public on(android.content.Context r14, f3.e[] r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.on.<init>(android.content.Context, f3.e[]):void");
    }

    public on(String str, int i10, int i11, boolean z10, int i12, int i13, on[] onVarArr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f12220s = str;
        this.f12221t = i10;
        this.f12222u = i11;
        this.f12223v = z10;
        this.f12224w = i12;
        this.f12225x = i13;
        this.y = onVarArr;
        this.f12226z = z11;
        this.A = z12;
        this.B = z13;
        this.C = z14;
        this.D = z15;
        this.E = z16;
        this.F = z17;
        this.G = z18;
    }

    public static on s() {
        return new on("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static on t() {
        return new on("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    public static int u(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 2, this.f12220s);
        m2.a.g(parcel, 3, this.f12221t);
        m2.a.g(parcel, 4, this.f12222u);
        m2.a.a(parcel, 5, this.f12223v);
        m2.a.g(parcel, 6, this.f12224w);
        m2.a.g(parcel, 7, this.f12225x);
        m2.a.o(parcel, 8, this.y, i10);
        m2.a.a(parcel, 9, this.f12226z);
        m2.a.a(parcel, 10, this.A);
        m2.a.a(parcel, 11, this.B);
        m2.a.a(parcel, 12, this.C);
        m2.a.a(parcel, 13, this.D);
        m2.a.a(parcel, 14, this.E);
        m2.a.a(parcel, 15, this.F);
        m2.a.a(parcel, 16, this.G);
        m2.a.u(parcel, q10);
    }
}

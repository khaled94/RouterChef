package m3;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import k4.a;
import k4.b;

/* loaded from: classes.dex */
public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new e();
    public final v A;
    public final boolean B;

    /* renamed from: s */
    public final String f5952s;

    /* renamed from: t */
    public final String f5953t;

    /* renamed from: u */
    public final String f5954u;

    /* renamed from: v */
    public final String f5955v;

    /* renamed from: w */
    public final String f5956w;

    /* renamed from: x */
    public final String f5957x;
    public final String y;

    /* renamed from: z */
    public final Intent f5958z;

    public f(Intent intent, v vVar) {
        this(null, null, null, null, null, null, null, intent, new b(vVar), false);
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z10) {
        this.f5952s = str;
        this.f5953t = str2;
        this.f5954u = str3;
        this.f5955v = str4;
        this.f5956w = str5;
        this.f5957x = str6;
        this.y = str7;
        this.f5958z = intent;
        this.A = (v) b.e0(a.AbstractBinderC0085a.c0(iBinder));
        this.B = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 2, this.f5952s);
        m2.a.l(parcel, 3, this.f5953t);
        m2.a.l(parcel, 4, this.f5954u);
        m2.a.l(parcel, 5, this.f5955v);
        m2.a.l(parcel, 6, this.f5956w);
        m2.a.l(parcel, 7, this.f5957x);
        m2.a.l(parcel, 8, this.y);
        m2.a.k(parcel, 9, this.f5958z, i10);
        m2.a.f(parcel, 10, new b(this.A));
        m2.a.a(parcel, 11, this.B);
        m2.a.u(parcel, q10);
    }

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, v vVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new b(vVar), false);
    }
}

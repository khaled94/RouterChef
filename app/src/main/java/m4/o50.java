package m4;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class o50 extends a {
    public static final Parcelable.Creator<o50> CREATOR = new p50();
    public nn1 A;
    public String B;

    /* renamed from: s */
    public final Bundle f11995s;

    /* renamed from: t */
    public final o90 f11996t;

    /* renamed from: u */
    public final ApplicationInfo f11997u;

    /* renamed from: v */
    public final String f11998v;

    /* renamed from: w */
    public final List<String> f11999w;

    /* renamed from: x */
    public final PackageInfo f12000x;
    public final String y;

    /* renamed from: z */
    public final String f12001z;

    public o50(Bundle bundle, o90 o90Var, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, String str3, nn1 nn1Var, String str4) {
        this.f11995s = bundle;
        this.f11996t = o90Var;
        this.f11998v = str;
        this.f11997u = applicationInfo;
        this.f11999w = list;
        this.f12000x = packageInfo;
        this.y = str2;
        this.f12001z = str3;
        this.A = nn1Var;
        this.B = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.b(parcel, 1, this.f11995s);
        m2.a.k(parcel, 2, this.f11996t, i10);
        m2.a.k(parcel, 3, this.f11997u, i10);
        m2.a.l(parcel, 4, this.f11998v);
        m2.a.n(parcel, 5, this.f11999w);
        m2.a.k(parcel, 6, this.f12000x, i10);
        m2.a.l(parcel, 7, this.y);
        m2.a.l(parcel, 9, this.f12001z);
        m2.a.k(parcel, 10, this.A, i10);
        m2.a.l(parcel, 11, this.B);
        m2.a.u(parcel, q10);
    }
}

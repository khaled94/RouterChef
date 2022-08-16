package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e70 extends a {
    public static final Parcelable.Creator<e70> CREATOR = new f70();

    /* renamed from: s */
    public final String f7730s;

    /* renamed from: t */
    public final String f7731t;

    /* renamed from: u */
    public final boolean f7732u;

    /* renamed from: v */
    public final boolean f7733v;

    /* renamed from: w */
    public final List<String> f7734w;

    /* renamed from: x */
    public final boolean f7735x;
    public final boolean y;

    /* renamed from: z */
    public final List<String> f7736z;

    public e70(String str, String str2, boolean z10, boolean z11, List<String> list, boolean z12, boolean z13, List<String> list2) {
        this.f7730s = str;
        this.f7731t = str2;
        this.f7732u = z10;
        this.f7733v = z11;
        this.f7734w = list;
        this.f7735x = z12;
        this.y = z13;
        this.f7736z = list2 == null ? new ArrayList<>() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 2, this.f7730s);
        m2.a.l(parcel, 3, this.f7731t);
        m2.a.a(parcel, 4, this.f7732u);
        m2.a.a(parcel, 5, this.f7733v);
        m2.a.n(parcel, 6, this.f7734w);
        m2.a.a(parcel, 7, this.f7735x);
        m2.a.a(parcel, 8, this.y);
        m2.a.n(parcel, 9, this.f7736z);
        m2.a.u(parcel, q10);
    }
}

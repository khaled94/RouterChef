package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import s.b;

/* loaded from: classes.dex */
public final class o90 extends a {
    public static final Parcelable.Creator<o90> CREATOR = new p90();

    /* renamed from: s */
    public String f12051s;

    /* renamed from: t */
    public int f12052t;

    /* renamed from: u */
    public int f12053u;

    /* renamed from: v */
    public boolean f12054v;

    /* renamed from: w */
    public boolean f12055w;

    public o90(int i10, int i11, boolean z10) {
        String str = z10 ? "0" : "1";
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("afma-sdk-a-v");
        sb.append(i10);
        sb.append(".");
        sb.append(i11);
        this.f12051s = b.b(sb, ".", str);
        this.f12052t = i10;
        this.f12053u = i11;
        this.f12054v = z10;
        this.f12055w = false;
    }

    public o90(String str, int i10, int i11, boolean z10, boolean z11) {
        this.f12051s = str;
        this.f12052t = i10;
        this.f12053u = i11;
        this.f12054v = z10;
        this.f12055w = z11;
    }

    public static o90 s() {
        return new o90(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 2, this.f12051s);
        m2.a.g(parcel, 3, this.f12052t);
        m2.a.g(parcel, 4, this.f12053u);
        m2.a.a(parcel, 5, this.f12054v);
        m2.a.a(parcel, 6, this.f12055w);
        m2.a.u(parcel, q10);
    }
}

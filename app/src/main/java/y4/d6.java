package y4;

import android.os.Parcel;
import android.os.Parcelable;
import d4.m;
import e4.a;

/* loaded from: classes.dex */
public final class d6 extends a {
    public static final Parcelable.Creator<d6> CREATOR = new e6();

    /* renamed from: s */
    public final int f20362s;

    /* renamed from: t */
    public final String f20363t;

    /* renamed from: u */
    public final long f20364u;

    /* renamed from: v */
    public final Long f20365v;

    /* renamed from: w */
    public final String f20366w;

    /* renamed from: x */
    public final String f20367x;
    public final Double y;

    public d6(int i10, String str, long j3, Long l10, Float f10, String str2, String str3, Double d5) {
        this.f20362s = i10;
        this.f20363t = str;
        this.f20364u = j3;
        this.f20365v = l10;
        if (i10 == 1) {
            this.y = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.y = d5;
        }
        this.f20366w = str2;
        this.f20367x = str3;
    }

    public d6(String str, long j3, Object obj, String str2) {
        m.e(str);
        this.f20362s = 2;
        this.f20363t = str;
        this.f20364u = j3;
        this.f20367x = str2;
        if (obj == null) {
            this.f20365v = null;
            this.y = null;
            this.f20366w = null;
        } else if (obj instanceof Long) {
            this.f20365v = (Long) obj;
            this.y = null;
            this.f20366w = null;
        } else if (obj instanceof String) {
            this.f20365v = null;
            this.y = null;
            this.f20366w = (String) obj;
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        } else {
            this.f20365v = null;
            this.y = (Double) obj;
            this.f20366w = null;
        }
    }

    public d6(f6 f6Var) {
        this(f6Var.f20458c, f6Var.f20459d, f6Var.f20460e, f6Var.f20457b);
    }

    public final Object s() {
        Long l10 = this.f20365v;
        if (l10 != null) {
            return l10;
        }
        Double d5 = this.y;
        if (d5 != null) {
            return d5;
        }
        String str = this.f20366w;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        e6.a(this, parcel);
    }
}

package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class e30 extends a {
    public static final Parcelable.Creator<e30> CREATOR = new f30();

    /* renamed from: s */
    public final int f7713s;

    /* renamed from: t */
    public final int f7714t;

    /* renamed from: u */
    public final int f7715u;

    public e30(int i10, int i11, int i12) {
        this.f7713s = i10;
        this.f7714t = i11;
        this.f7715u = i12;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof e30)) {
            e30 e30Var = (e30) obj;
            if (e30Var.f7715u == this.f7715u && e30Var.f7714t == this.f7714t && e30Var.f7713s == this.f7713s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f7713s, this.f7714t, this.f7715u});
    }

    public final String toString() {
        int i10 = this.f7713s;
        int i11 = this.f7714t;
        int i12 = this.f7715u;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i10);
        sb.append(".");
        sb.append(i11);
        sb.append(".");
        sb.append(i12);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f7713s);
        m2.a.g(parcel, 2, this.f7714t);
        m2.a.g(parcel, 3, this.f7715u);
        m2.a.u(parcel, q10);
    }
}

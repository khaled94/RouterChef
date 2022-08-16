package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class at1 extends a {
    public static final Parcelable.Creator<at1> CREATOR = new bt1();

    /* renamed from: s */
    public final int f6254s;

    /* renamed from: t */
    public k6 f6255t = null;

    /* renamed from: u */
    public byte[] f6256u;

    public at1(int i10, byte[] bArr) {
        this.f6254s = i10;
        this.f6256u = bArr;
        a();
    }

    public final void a() {
        k6 k6Var = this.f6255t;
        if (k6Var != null || this.f6256u == null) {
            if (k6Var != null && this.f6256u == null) {
                return;
            }
            if (k6Var != null && this.f6256u != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (k6Var != null || this.f6256u != null) {
                throw new IllegalStateException("Impossible");
            }
            throw new IllegalStateException("Invalid internal representation - empty");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f6254s);
        byte[] bArr = this.f6256u;
        if (bArr == null) {
            bArr = this.f6255t.b();
        }
        m2.a.d(parcel, 2, bArr);
        m2.a.u(parcel, q10);
    }
}

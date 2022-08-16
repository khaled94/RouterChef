package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class lu extends a {
    public static final Parcelable.Creator<lu> CREATOR = new mu();

    /* renamed from: s */
    public final int f10993s;

    /* renamed from: t */
    public final boolean f10994t;

    /* renamed from: u */
    public final int f10995u;

    /* renamed from: v */
    public final boolean f10996v;

    /* renamed from: w */
    public final int f10997w;

    /* renamed from: x */
    public final or f10998x;
    public final boolean y;

    /* renamed from: z */
    public final int f10999z;

    public lu(int i10, boolean z10, int i11, boolean z11, int i12, or orVar, boolean z12, int i13) {
        this.f10993s = i10;
        this.f10994t = z10;
        this.f10995u = i11;
        this.f10996v = z11;
        this.f10997w = i12;
        this.f10998x = orVar;
        this.y = z12;
        this.f10999z = i13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lu(h3.d r10) {
        /*
            r9 = this;
            boolean r2 = r10.f5054a
            int r3 = r10.f5055b
            boolean r4 = r10.f5057d
            int r5 = r10.f5058e
            f3.n r0 = r10.f5059f
            if (r0 == 0) goto L13
            m4.or r1 = new m4.or
            r1.<init>(r0)
            r6 = r1
            goto L15
        L13:
            r0 = 0
            r6 = r0
        L15:
            r1 = 4
            boolean r7 = r10.f5060g
            int r8 = r10.f5056c
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.lu.<init>(h3.d):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f10993s);
        m2.a.a(parcel, 2, this.f10994t);
        m2.a.g(parcel, 3, this.f10995u);
        m2.a.a(parcel, 4, this.f10996v);
        m2.a.g(parcel, 5, this.f10997w);
        m2.a.k(parcel, 6, this.f10998x, i10);
        m2.a.a(parcel, 7, this.y);
        m2.a.g(parcel, 8, this.f10999z);
        m2.a.u(parcel, q10);
    }
}

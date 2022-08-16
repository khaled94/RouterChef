package y4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new c();
    public p A;
    public final long B;
    public final p C;

    /* renamed from: s */
    public String f20299s;

    /* renamed from: t */
    public String f20300t;

    /* renamed from: u */
    public d6 f20301u;

    /* renamed from: v */
    public long f20302v;

    /* renamed from: w */
    public boolean f20303w;

    /* renamed from: x */
    public String f20304x;
    public final p y;

    /* renamed from: z */
    public long f20305z;

    public b(String str, String str2, d6 d6Var, long j3, boolean z10, String str3, p pVar, long j10, p pVar2, long j11, p pVar3) {
        this.f20299s = str;
        this.f20300t = str2;
        this.f20301u = d6Var;
        this.f20302v = j3;
        this.f20303w = z10;
        this.f20304x = str3;
        this.y = pVar;
        this.f20305z = j10;
        this.A = pVar2;
        this.B = j11;
        this.C = pVar3;
    }

    public b(b bVar) {
        Objects.requireNonNull(bVar, "null reference");
        this.f20299s = bVar.f20299s;
        this.f20300t = bVar.f20300t;
        this.f20301u = bVar.f20301u;
        this.f20302v = bVar.f20302v;
        this.f20303w = bVar.f20303w;
        this.f20304x = bVar.f20304x;
        this.y = bVar.y;
        this.f20305z = bVar.f20305z;
        this.A = bVar.A;
        this.B = bVar.B;
        this.C = bVar.C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 2, this.f20299s);
        m2.a.l(parcel, 3, this.f20300t);
        m2.a.k(parcel, 4, this.f20301u, i10);
        m2.a.j(parcel, 5, this.f20302v);
        m2.a.a(parcel, 6, this.f20303w);
        m2.a.l(parcel, 7, this.f20304x);
        m2.a.k(parcel, 8, this.y, i10);
        m2.a.j(parcel, 9, this.f20305z);
        m2.a.k(parcel, 10, this.A, i10);
        m2.a.j(parcel, 11, this.B);
        m2.a.k(parcel, 12, this.C, i10);
        m2.a.u(parcel, q10);
    }
}

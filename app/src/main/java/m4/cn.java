package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import f3.h;
import f3.l;

/* loaded from: classes.dex */
public final class cn extends a {
    public static final Parcelable.Creator<cn> CREATOR = new dn();

    /* renamed from: s */
    public final int f7067s;

    /* renamed from: t */
    public final String f7068t;

    /* renamed from: u */
    public final String f7069u;

    /* renamed from: v */
    public cn f7070v;

    /* renamed from: w */
    public IBinder f7071w;

    public cn(int i10, String str, String str2, cn cnVar, IBinder iBinder) {
        this.f7067s = i10;
        this.f7068t = str;
        this.f7069u = str2;
        this.f7070v = cnVar;
        this.f7071w = iBinder;
    }

    public final f3.a s() {
        cn cnVar = this.f7070v;
        f3.a aVar = null;
        if (cnVar != null) {
            aVar = new f3.a(cnVar.f7067s, cnVar.f7068t, cnVar.f7069u, null);
        }
        return new f3.a(this.f7067s, this.f7068t, this.f7069u, aVar);
    }

    public final h t() {
        iq iqVar;
        cn cnVar = this.f7070v;
        l lVar = null;
        f3.a aVar = cnVar == null ? null : new f3.a(cnVar.f7067s, cnVar.f7068t, cnVar.f7069u, null);
        int i10 = this.f7067s;
        String str = this.f7068t;
        String str2 = this.f7069u;
        IBinder iBinder = this.f7071w;
        if (iBinder == null) {
            iqVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            iqVar = queryLocalInterface instanceof iq ? (iq) queryLocalInterface : new hq(iBinder);
        }
        if (iqVar != null) {
            lVar = new l(iqVar);
        }
        return new h(i10, str, str2, aVar, lVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f7067s);
        m2.a.l(parcel, 2, this.f7068t);
        m2.a.l(parcel, 3, this.f7069u);
        m2.a.k(parcel, 4, this.f7070v, i10);
        m2.a.f(parcel, 5, this.f7071w);
        m2.a.u(parcel, q10);
    }
}

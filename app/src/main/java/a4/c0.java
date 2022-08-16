package a4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import d4.g1;
import d4.h1;
import d4.i1;
import e4.a;
import javax.annotation.Nullable;
import k4.b;

/* loaded from: classes.dex */
public final class c0 extends a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: s */
    public final String f122s;
    @Nullable

    /* renamed from: t */
    public final t f123t;

    /* renamed from: u */
    public final boolean f124u;

    /* renamed from: v */
    public final boolean f125v;

    public c0(String str, @Nullable t tVar, boolean z10, boolean z11) {
        this.f122s = str;
        this.f123t = tVar;
        this.f124u = z10;
        this.f125v = z11;
    }

    public c0(String str, @Nullable IBinder iBinder, boolean z10, boolean z11) {
        this.f122s = str;
        u uVar = null;
        if (iBinder != null) {
            try {
                int i10 = h1.f3879s;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                k4.a g10 = (queryLocalInterface instanceof i1 ? (i1) queryLocalInterface : new g1(iBinder)).g();
                byte[] bArr = g10 == null ? null : (byte[]) b.e0(g10);
                if (bArr != null) {
                    uVar = new u(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f123t = uVar;
        this.f124u = z10;
        this.f125v = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f122s);
        t tVar = this.f123t;
        if (tVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            tVar = null;
        }
        m2.a.f(parcel, 2, tVar);
        m2.a.a(parcel, 3, this.f124u);
        m2.a.a(parcel, 4, this.f125v);
        m2.a.u(parcel, q10);
    }
}

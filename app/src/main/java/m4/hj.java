package m4;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import e4.a;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class hj extends a {
    public static final Parcelable.Creator<hj> CREATOR = new ij();
    @GuardedBy("this")

    /* renamed from: s */
    public ParcelFileDescriptor f9353s;
    @GuardedBy("this")

    /* renamed from: t */
    public final boolean f9354t;
    @GuardedBy("this")

    /* renamed from: u */
    public final boolean f9355u;
    @GuardedBy("this")

    /* renamed from: v */
    public final long f9356v;
    @GuardedBy("this")

    /* renamed from: w */
    public final boolean f9357w;

    public hj() {
        this.f9353s = null;
        this.f9354t = false;
        this.f9355u = false;
        this.f9356v = 0L;
        this.f9357w = false;
    }

    public hj(ParcelFileDescriptor parcelFileDescriptor, boolean z10, boolean z11, long j3, boolean z12) {
        this.f9353s = parcelFileDescriptor;
        this.f9354t = z10;
        this.f9355u = z11;
        this.f9356v = j3;
        this.f9357w = z12;
    }

    public final synchronized long s() {
        return this.f9356v;
    }

    public final synchronized InputStream t() {
        ParcelFileDescriptor parcelFileDescriptor = this.f9353s;
        if (parcelFileDescriptor == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.f9353s = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean u() {
        return this.f9354t;
    }

    public final synchronized boolean v() {
        return this.f9353s != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ParcelFileDescriptor parcelFileDescriptor;
        int q10 = m2.a.q(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f9353s;
        }
        m2.a.k(parcel, 2, parcelFileDescriptor, i10);
        m2.a.a(parcel, 3, u());
        m2.a.a(parcel, 4, x());
        m2.a.j(parcel, 5, s());
        m2.a.a(parcel, 6, y());
        m2.a.u(parcel, q10);
    }

    public final synchronized boolean x() {
        return this.f9355u;
    }

    public final synchronized boolean y() {
        return this.f9357w;
    }
}

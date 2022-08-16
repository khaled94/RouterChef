package m4;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k4.a;
import k4.b;

/* loaded from: classes.dex */
public final class ju extends ba implements vu {

    /* renamed from: s */
    public final Drawable f10188s;

    /* renamed from: t */
    public final Uri f10189t;

    /* renamed from: u */
    public final double f10190u;

    /* renamed from: v */
    public final int f10191v;

    /* renamed from: w */
    public final int f10192w;

    public ju(Drawable drawable, Uri uri, double d5, int i10, int i11) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f10188s = drawable;
        this.f10189t = uri;
        this.f10190u = d5;
        this.f10191v = i10;
        this.f10192w = i11;
    }

    public static vu N3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof vu ? (vu) queryLocalInterface : new uu(iBinder);
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        int i11;
        if (i10 == 1) {
            a d5 = d();
            parcel2.writeNoException();
            ca.d(parcel2, d5);
            return true;
        } else if (i10 == 2) {
            Uri uri = this.f10189t;
            parcel2.writeNoException();
            ca.c(parcel2, uri);
            return true;
        } else if (i10 != 3) {
            if (i10 == 4) {
                i11 = this.f10191v;
            } else if (i10 != 5) {
                return false;
            } else {
                i11 = this.f10192w;
            }
            parcel2.writeNoException();
            parcel2.writeInt(i11);
            return true;
        } else {
            double d10 = this.f10190u;
            parcel2.writeNoException();
            parcel2.writeDouble(d10);
            return true;
        }
    }

    @Override // m4.vu
    public final double a() {
        return this.f10190u;
    }

    @Override // m4.vu
    public final Uri b() {
        return this.f10189t;
    }

    @Override // m4.vu
    public final int c() {
        return this.f10192w;
    }

    @Override // m4.vu
    public final a d() {
        return new b(this.f10188s);
    }

    @Override // m4.vu
    public final int g() {
        return this.f10191v;
    }
}

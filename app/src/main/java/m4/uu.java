package m4;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import d4.f1;
import k4.a;

/* loaded from: classes.dex */
public final class uu extends aa implements vu {
    public uu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // m4.vu
    public final double a() {
        Parcel c02 = c0(3, w());
        double readDouble = c02.readDouble();
        c02.recycle();
        return readDouble;
    }

    @Override // m4.vu
    public final Uri b() {
        Parcel c02 = c0(2, w());
        Uri uri = (Uri) ca.a(c02, Uri.CREATOR);
        c02.recycle();
        return uri;
    }

    @Override // m4.vu
    public final int c() {
        Parcel c02 = c0(5, w());
        int readInt = c02.readInt();
        c02.recycle();
        return readInt;
    }

    @Override // m4.vu
    public final a d() {
        return f1.b(c0(1, w()));
    }

    @Override // m4.vu
    public final int g() {
        Parcel c02 = c0(4, w());
        int readInt = c02.readInt();
        c02.recycle();
        return readInt;
    }
}

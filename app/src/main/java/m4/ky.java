package m4;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public abstract class ky extends ba {
    public ky() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ((my) this).f11351s.a((ParcelFileDescriptor) ca.a(parcel, ParcelFileDescriptor.CREATOR));
            return true;
        }
        return false;
    }
}
